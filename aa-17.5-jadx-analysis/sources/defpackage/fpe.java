package defpackage;

import android.os.Handler;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;

/* loaded from: classes.dex */
public final class fpe implements Executor {
    final /* synthetic */ Object a;
    private final /* synthetic */ int b;

    public /* synthetic */ fpe(Object obj, int i) {
        this.b = i;
        this.a = obj;
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        switch (this.b) {
            case 0:
                ((Handler) ((ajdr) this.a).b).post(runnable);
                return;
            case 1:
                czq czqVarN = ((czq) this.a).N();
                if (czqVarN != null) {
                    czqVarN.n(new ehq((Object) runnable, 1, (byte[]) null));
                    return;
                }
                return;
            case 2:
                ((Handler) this.a).post(runnable);
                return;
            case 3:
                ((Handler) this.a).post(runnable);
                return;
            case 4:
                ((Handler) this.a).post(runnable);
                return;
            case 5:
                int i = pce.e;
                ((Handler) this.a).post(runnable);
                return;
            case 6:
                ((pdk) this.a).d(runnable);
                return;
            case 7:
                ((Handler) this.a).post(runnable);
                return;
            case 8:
                ((Handler) this.a).post(runnable);
                return;
            case 9:
                ((Handler) this.a).post(runnable);
                return;
            case 10:
                ((Handler) this.a).post(runnable);
                return;
            default:
                ExecutorService executorService = zrz.a;
                if (!((Handler) this.a).post(runnable)) {
                    throw new RuntimeException("Operation could not be posted on handler. Looper may be exiting.");
                }
                return;
        }
    }

    public fpe(Object obj, int i, byte[] bArr) {
        this.b = i;
        this.a = obj;
    }
}
