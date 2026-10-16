package defpackage;

import android.os.Handler;
import java.util.concurrent.Executor;

/* loaded from: classes.dex */
public final /* synthetic */ class smd implements Executor {
    public final /* synthetic */ Object a;
    private final /* synthetic */ int b;

    public /* synthetic */ smd(Object obj, int i) {
        this.b = i;
        this.a = obj;
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        int i = this.b;
        Object obj = this.a;
        if (i != 0) {
            ((ntm) obj).h.getMainExecutor().execute(new nwg(runnable, 1));
        } else {
            ((Handler) obj).post(runnable);
        }
    }
}
