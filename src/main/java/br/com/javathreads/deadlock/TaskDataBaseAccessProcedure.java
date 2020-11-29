package br.com.javathreads.deadlock;

public class TaskDataBaseAccessProcedure implements Runnable {

    private ConnectionlPool pool;
    private TransactionManager tx;

    public TaskDataBaseAccessProcedure(ConnectionlPool pool, TransactionManager tx) {
        this.pool = pool;
        this.tx = tx;
    }

    @Override
    public void run() {
        synchronized (pool) {
            System.out.println("Catch key pool");
            pool.getConnection();

            synchronized (tx) {
                System.out.println("Beginning manager tx");
                tx.begin();
            }
        }
    }
}
