package od;

import java.util.concurrent.Executor;
import java.util.logging.Logger;
import md.AbstractC3536d;
import md.AbstractC3538f;
import md.C3535c;

/* loaded from: classes5.dex */
public final class G0 extends AbstractC3536d {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ J0 f41563a;

    public G0(J0 j02) {
        this.f41563a = j02;
    }

    @Override // md.AbstractC3536d
    public final String g() {
        return this.f41563a.f41611b;
    }

    @Override // md.AbstractC3536d
    public final AbstractC3538f h(F6.r rVar, C3535c c3535c) {
        M0 m02 = this.f41563a.f41613d;
        Logger logger = M0.f41645d0;
        m02.getClass();
        Executor executor = c3535c.f40621b;
        if (executor == null) {
            executor = m02.f41688h;
        }
        M0 m03 = this.f41563a.f41613d;
        C3716q c3716q = new C3716q(rVar, executor, c3535c, m03.f41679a0, m03.f41662J ? null : this.f41563a.f41613d.f41686f.f41993a.f43492d, this.f41563a.f41613d.f41664M);
        this.f41563a.f41613d.getClass();
        c3716q.f42074p = this.f41563a.f41613d.f41693n;
        return c3716q;
    }
}
