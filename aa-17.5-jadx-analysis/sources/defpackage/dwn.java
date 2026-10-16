package defpackage;

import android.os.Handler;
import android.os.Looper;
import java.util.Objects;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;

/* loaded from: classes2.dex */
public final class dwn implements Executor {
    private final /* synthetic */ int a;
    private final Object b;

    public dwn(int i) {
        this.a = i;
        this.b = new Handler(Looper.getMainLooper());
    }

    /* JADX WARN: Type inference failed for: r2v7, types: [java.lang.Object, java.util.concurrent.Executor] */
    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        int i = this.a;
        if (i == 0) {
            ebe.m(runnable);
            Object obj = this.b;
            if (((Handler) obj).post(runnable)) {
                return;
            }
            Objects.toString(obj);
            throw new RejectedExecutionException(obj.toString().concat(" is shutting down"));
        }
        if (i == 1) {
            ((Handler) this.b).post(runnable);
            return;
        }
        xul xulVarO = ysi.o();
        try {
            this.b.execute(runnable);
            xulVarO.close();
        } catch (Throwable th) {
            try {
                xulVarO.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    public dwn(Handler handler, int i) {
        this.a = i;
        ebe.m(handler);
        this.b = handler;
    }

    public dwn(Executor executor, int i) {
        this.a = i;
        this.b = new zhb(executor);
    }
}
