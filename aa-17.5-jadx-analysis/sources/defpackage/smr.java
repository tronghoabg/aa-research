package defpackage;

import android.os.Looper;
import java.util.concurrent.Executor;

/* loaded from: classes2.dex */
public final class smr {
    public volatile smp a;
    private final Executor b;

    public smr(Looper looper, Object obj, String str) {
        this.b = new spx(looper);
        spu.ax(obj, "Listener must not be null");
        spu.at(str);
        this.a = new smp(obj, str);
    }

    public final void a() {
        this.a = null;
    }

    public final void b(smq smqVar) {
        this.b.execute(new sbj(this, smqVar, 7, (byte[]) null));
    }

    public final boolean c() {
        return this.a != null;
    }

    public smr(Executor executor, Object obj) {
        this.b = executor;
        spu.at("GetCurrentLocation");
        this.a = new smp(obj, "GetCurrentLocation");
    }
}
