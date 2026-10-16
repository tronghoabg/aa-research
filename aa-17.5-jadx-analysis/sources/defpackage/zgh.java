package defpackage;

import java.util.concurrent.Callable;
import java.util.concurrent.Executor;

/* loaded from: classes.dex */
public final class zgh {
    public final boolean a;
    public final Object b;

    public zgh(tmb tmbVar, xxh xxhVar) {
        this.b = tmbVar;
        this.a = xxhVar.f();
    }

    public final zgp a(Callable callable, Executor executor) {
        return new zfp((yfg) this.b, this.a, executor, callable);
    }

    public zgh(boolean z, yfq yfqVar) {
        this.a = z;
        this.b = yfqVar;
    }
}
