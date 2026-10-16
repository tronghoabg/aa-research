package org.chromium.net.impl;

/* JADX INFO: loaded from: classes2.dex */
public final class JavaUrlRequestUtils {

    public interface CheckedRunnable {
        void a() throws java.lang.Exception;
    }

    public static final class DirectPreventingExecutor implements java.util.concurrent.Executor {
        private final java.util.concurrent.Executor a;

        private static final class InlineCheckingRunnable implements java.lang.Runnable {
            public java.lang.Thread a;
            public org.chromium.net.InlineExecutionProhibitedException b;
            private final java.lang.Runnable c;

            private InlineCheckingRunnable(java.lang.Runnable runnable, java.lang.Thread thread) {
                this.c = runnable;
                this.a = thread;
            }

            @Override // java.lang.Runnable
            public final void run() {
                if (java.lang.Thread.currentThread() == this.a) {
                    this.b = new org.chromium.net.InlineExecutionProhibitedException();
                } else {
                    this.c.run();
                }
            }
        }

        public DirectPreventingExecutor(java.util.concurrent.Executor executor) {
            this.a = executor;
        }

        @Override // java.util.concurrent.Executor
        public final void execute(java.lang.Runnable runnable) {
            org.chromium.net.impl.JavaUrlRequestUtils.DirectPreventingExecutor.InlineCheckingRunnable inlineCheckingRunnable = new org.chromium.net.impl.JavaUrlRequestUtils.DirectPreventingExecutor.InlineCheckingRunnable(runnable, java.lang.Thread.currentThread());
            this.a.execute(inlineCheckingRunnable);
            org.chromium.net.InlineExecutionProhibitedException inlineExecutionProhibitedException = inlineCheckingRunnable.b;
            if (inlineExecutionProhibitedException != null) {
                throw inlineExecutionProhibitedException;
            }
            inlineCheckingRunnable.a = null;
        }
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public @interface State {
    }

    public static java.lang.String a(int i) {
        switch (i) {
            case 0:
                return "NOT_STARTED";
            case 1:
                return "STARTED";
            case 2:
                return "REDIRECT_RECEIVED";
            case 3:
                return "AWAITING_FOLLOW_REDIRECT";
            case 4:
                return "AWAITING_READ";
            case 5:
                return "READING";
            case 6:
                return "ERROR";
            case 7:
                return "COMPLETE";
            case 8:
                return "CANCELLED";
            default:
                throw new java.lang.IllegalArgumentException(defpackage.a.bo(i, "Unknown state "));
        }
    }
}
