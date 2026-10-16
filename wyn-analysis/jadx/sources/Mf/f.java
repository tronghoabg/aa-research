package Mf;

import Ef.U;
import Ef.w0;
import Ef.x0;
import Ef.z0;
import Jf.r;
import tf.p;

/* loaded from: classes5.dex */
public final class f {

    /* renamed from: a, reason: collision with root package name */
    public final z0 f7641a;

    /* renamed from: b, reason: collision with root package name */
    public final p f7642b;

    /* renamed from: c, reason: collision with root package name */
    public Object f7643c;

    /* renamed from: d, reason: collision with root package name */
    public int f7644d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ b f7645e;

    public f(b bVar, z0 z0Var, p pVar) {
        w0 w0Var = w0.f3786a;
        x0 x0Var = x0.f3789a;
        this.f7645e = bVar;
        this.f7641a = z0Var;
        this.f7642b = pVar;
        this.f7644d = -1;
    }

    public final void a() {
        Object obj = this.f7643c;
        if (obj instanceof r) {
            ((r) obj).h(this.f7644d, this.f7645e.f7651a);
            return;
        }
        U u10 = obj instanceof U ? (U) obj : null;
        if (u10 != null) {
            u10.dispose();
        }
    }
}
