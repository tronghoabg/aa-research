package org.chromium.net.impl;

import defpackage.a;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.concurrent.Executor;
import org.chromium.net.InlineExecutionProhibitedException;

/* loaded from: classes2.dex */
public final class JavaUrlRequestUtils {

    public interface CheckedRunnable {
        void a() throws Exception;
    }

    public static final class DirectPreventingExecutor implements Executor {
        private final Executor a;

        private static final class InlineCheckingRunnable implements Runnable {
            public Thread a;
            public InlineExecutionProhibitedException b;
            private final Runnable c;

            private InlineCheckingRunnable(Runnable runnable, Thread thread) {
                this.c = runnable;
                this.a = thread;
            }

            @Override // java.lang.Runnable
            public final void run() {
                if (Thread.currentThread() == this.a) {
                    this.b = new InlineExecutionProhibitedException();
                } else {
                    this.c.run();
                }
            }
        }

        public DirectPreventingExecutor(Executor executor) {
            this.a = executor;
        }

        @Override // java.util.concurrent.Executor
        public final void execute(Runnable runnable) {
            InlineCheckingRunnable inlineCheckingRunnable = new InlineCheckingRunnable(runnable, Thread.currentThread());
            this.a.execute(inlineCheckingRunnable);
            InlineExecutionProhibitedException inlineExecutionProhibitedException = inlineCheckingRunnable.b;
            if (inlineExecutionProhibitedException != null) {
                throw inlineExecutionProhibitedException;
            }
            inlineCheckingRunnable.a = null;
        }
    }

    @Retention(RetentionPolicy.SOURCE)
    public @interface State {
    }

    public static String a(int i) {
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
                throw new IllegalArgumentException(a.bp(i, "Unknown state "));
        }
    }
}
