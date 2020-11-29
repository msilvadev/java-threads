package br.com.javathreads.deadlock;

public class DatabaseMain {

    public static void main(String[] args) {

        TransactionManager tx = new TransactionManager();
        ConnectionlPool pool = new ConnectionlPool();

        new Thread(new TaskDataBaseAccess(pool, tx), "TaskDataBaseAccess").start();
        new Thread(new TaskDataBaseAccessProcedure(pool, tx), "TaskDataBaseAccessProcedure").start();
    }
}
