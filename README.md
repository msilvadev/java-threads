# java-threads

Project to study about Java Threads and Concurrency programming

### About code

Class `ScreenCalculator` is the main class which create a screen with Java Swing.

Class `MultiplyTask` is responsible to multiply input values. OBS: This multiplication was implemented in a very 
inefficient way and therefore it takes

#### JVM Args
`-DwithoutNewThread` is a boolean which when set 'true' called MultiplyTask in a main thread which
will freeze screen. If set 'false' will create a new Thread to execute MultiplyTask and so it will not
freeze screen. DEFAULT VALUE IS 'FALSE'.

#### Run jar:
`java -cp java-threads-1.0-SNAPSHOT.jar br.com.javathreads.ScreenCalculator`