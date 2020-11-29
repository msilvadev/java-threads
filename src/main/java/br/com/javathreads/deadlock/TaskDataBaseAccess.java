package br.com.javathreads.deadlock;

public class TaskDataBaseAccess implements Runnable {

    private ConnectionlPool pool;
    private TransactionManager tx;

    public TaskDataBaseAccess(ConnectionlPool pool, TransactionManager tx) {
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
