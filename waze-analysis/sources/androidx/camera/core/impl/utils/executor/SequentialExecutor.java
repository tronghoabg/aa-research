package androidx.camera.core.impl.utils.executor;

import androidx.core.util.Preconditions;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;

/* compiled from: WazeSource */
/* loaded from: classes2.dex */
final class SequentialExecutor implements Executor {
    private static final String TAG = "SequentialExecutor";
    private final Executor mExecutor;
    final Deque<Runnable> mQueue = new ArrayDeque();
    private final QueueWorker mWorker = new QueueWorker();
    WorkerRunningState mWorkerRunningState = WorkerRunningState.IDLE;
    long mWorkerRunCount = 0;

    /* compiled from: WazeSource */
    final class QueueWorker implements Runnable {
        QueueWorker() {
        }

        /* JADX WARN: Code restructure failed: missing block: B:20:0x0040, code lost:
        
            r1 = r1 | java.lang.Thread.interrupted();
         */
        /* JADX WARN: Code restructure failed: missing block: B:21:0x0042, code lost:
        
            r0.run();
         */
        /* JADX WARN: Code restructure failed: missing block: B:25:0x0049, code lost:
        
            r3 = move-exception;
         */
        /* JADX WARN: Code restructure failed: missing block: B:26:0x004a, code lost:
        
            androidx.camera.core.Logger.e(androidx.camera.core.impl.utils.executor.SequentialExecutor.TAG, "Exception while executing runnable " + r0, r3);
         */
        /* JADX WARN: Removed duplicated region for block: B:39:0x002a A[SYNTHETIC] */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        private void workOnQueue() {
            /*
                r8 = this;
                r0 = 0
                r1 = r0
            L2:
                androidx.camera.core.impl.utils.executor.SequentialExecutor r2 = androidx.camera.core.impl.utils.executor.SequentialExecutor.this     // Catch: java.lang.Throwable -> L47
                java.util.Deque<java.lang.Runnable> r2 = r2.mQueue     // Catch: java.lang.Throwable -> L47
                monitor-enter(r2)     // Catch: java.lang.Throwable -> L47
                if (r0 != 0) goto L1e
                androidx.camera.core.impl.utils.executor.SequentialExecutor r0 = androidx.camera.core.impl.utils.executor.SequentialExecutor.this     // Catch: java.lang.Throwable -> L61
                androidx.camera.core.impl.utils.executor.SequentialExecutor$WorkerRunningState r0 = r0.mWorkerRunningState     // Catch: java.lang.Throwable -> L61
                androidx.camera.core.impl.utils.executor.SequentialExecutor$WorkerRunningState r3 = androidx.camera.core.impl.utils.executor.SequentialExecutor.WorkerRunningState.RUNNING     // Catch: java.lang.Throwable -> L61
                if (r0 != r3) goto L13
                monitor-exit(r2)     // Catch: java.lang.Throwable -> L61
                goto L31
            L13:
                androidx.camera.core.impl.utils.executor.SequentialExecutor r0 = androidx.camera.core.impl.utils.executor.SequentialExecutor.this     // Catch: java.lang.Throwable -> L61
                long r4 = r0.mWorkerRunCount     // Catch: java.lang.Throwable -> L61
                r6 = 1
                long r4 = r4 + r6
                r0.mWorkerRunCount = r4     // Catch: java.lang.Throwable -> L61
                r0.mWorkerRunningState = r3     // Catch: java.lang.Throwable -> L61
            L1e:
                androidx.camera.core.impl.utils.executor.SequentialExecutor r0 = androidx.camera.core.impl.utils.executor.SequentialExecutor.this     // Catch: java.lang.Throwable -> L61
                java.util.Deque<java.lang.Runnable> r0 = r0.mQueue     // Catch: java.lang.Throwable -> L61
                java.lang.Object r0 = r0.poll()     // Catch: java.lang.Throwable -> L61
                java.lang.Runnable r0 = (java.lang.Runnable) r0     // Catch: java.lang.Throwable -> L61
                if (r0 != 0) goto L3b
                androidx.camera.core.impl.utils.executor.SequentialExecutor r8 = androidx.camera.core.impl.utils.executor.SequentialExecutor.this     // Catch: java.lang.Throwable -> L61
                androidx.camera.core.impl.utils.executor.SequentialExecutor$WorkerRunningState r0 = androidx.camera.core.impl.utils.executor.SequentialExecutor.WorkerRunningState.IDLE     // Catch: java.lang.Throwable -> L61
                r8.mWorkerRunningState = r0     // Catch: java.lang.Throwable -> L61
                monitor-exit(r2)     // Catch: java.lang.Throwable -> L61
            L31:
                if (r1 == 0) goto L3a
                java.lang.Thread r8 = java.lang.Thread.currentThread()
                r8.interrupt()
            L3a:
                return
            L3b:
                monitor-exit(r2)     // Catch: java.lang.Throwable -> L61
                boolean r2 = java.lang.Thread.interrupted()     // Catch: java.lang.Throwable -> L47
                r1 = r1 | r2
                r2 = 1
                r0.run()     // Catch: java.lang.Throwable -> L47 java.lang.RuntimeException -> L49
            L45:
                r0 = r2
                goto L2
            L47:
                r8 = move-exception
                goto L64
            L49:
                r3 = move-exception
                java.lang.String r4 = "SequentialExecutor"
                java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L47
                r5.<init>()     // Catch: java.lang.Throwable -> L47
                java.lang.String r6 = "Exception while executing runnable "
                r5.append(r6)     // Catch: java.lang.Throwable -> L47
                r5.append(r0)     // Catch: java.lang.Throwable -> L47
                java.lang.String r0 = r5.toString()     // Catch: java.lang.Throwable -> L47
                androidx.camera.core.Logger.e(r4, r0, r3)     // Catch: java.lang.Throwable -> L47
                goto L45
            L61:
                r8 = move-exception
                monitor-exit(r2)     // Catch: java.lang.Throwable -> L61
                throw r8     // Catch: java.lang.Throwable -> L47
            L64:
                if (r1 == 0) goto L6d
                java.lang.Thread r0 = java.lang.Thread.currentThread()
                r0.interrupt()
            L6d:
                throw r8
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.camera.core.impl.utils.executor.SequentialExecutor.QueueWorker.workOnQueue():void");
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                workOnQueue();
            } catch (Error e2) {
                synchronized (SequentialExecutor.this.mQueue) {
                    SequentialExecutor.this.mWorkerRunningState = WorkerRunningState.IDLE;
                    throw e2;
                }
            }
        }
    }

    /* compiled from: WazeSource */
    enum WorkerRunningState {
        IDLE,
        QUEUING,
        QUEUED,
        RUNNING
    }

    SequentialExecutor(Executor executor) {
        Preconditions.checkNotNull(executor);
        this.mExecutor = executor;
    }

    @Override // java.util.concurrent.Executor
    public void execute(final Runnable runnable) {
        Preconditions.checkNotNull(runnable);
        synchronized (this.mQueue) {
            if (this.mWorkerRunningState != WorkerRunningState.RUNNING && this.mWorkerRunningState != WorkerRunningState.QUEUED) {
                long j2 = this.mWorkerRunCount;
                Runnable runnable2 = new Runnable() { // from class: androidx.camera.core.impl.utils.executor.SequentialExecutor.1
                    @Override // java.lang.Runnable
                    public void run() {
                        runnable.run();
                    }
                };
                this.mQueue.add(runnable2);
                this.mWorkerRunningState = WorkerRunningState.QUEUING;
                try {
                    this.mExecutor.execute(this.mWorker);
                    if (this.mWorkerRunningState != WorkerRunningState.QUEUING) {
                        return;
                    }
                    synchronized (this.mQueue) {
                        if (this.mWorkerRunCount == j2 && this.mWorkerRunningState == WorkerRunningState.QUEUING) {
                            this.mWorkerRunningState = WorkerRunningState.QUEUED;
                        }
                    }
                    return;
                } catch (Error | RuntimeException e2) {
                    synchronized (this.mQueue) {
                        WorkerRunningState workerRunningState = this.mWorkerRunningState;
                        boolean z = false;
                        if ((workerRunningState == WorkerRunningState.IDLE || workerRunningState == WorkerRunningState.QUEUING) && this.mQueue.removeLastOccurrence(runnable2)) {
                            z = true;
                        }
                        if (!(e2 instanceof RejectedExecutionException) || z) {
                            throw e2;
                        }
                    }
                    return;
                }
            }
            this.mQueue.add(runnable);
        }
    }
}
