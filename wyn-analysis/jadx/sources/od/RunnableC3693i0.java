package od;

import ba.C1521a;
import java.util.ArrayList;
import java.util.Iterator;
import md.EnumC3545m;

/* renamed from: od.i0, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class RunnableC3693i0 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f41988a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ md.k0 f41989b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ C3711o0 f41990c;

    public /* synthetic */ RunnableC3693i0(C3711o0 c3711o0, md.k0 k0Var, int i5) {
        this.f41988a = i5;
        this.f41990c = c3711o0;
        this.f41989b = k0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f41988a) {
            case 0:
                EnumC3545m enumC3545m = this.f41990c.f42047w.f40701a;
                EnumC3545m enumC3545m2 = EnumC3545m.f40696e;
                if (enumC3545m != enumC3545m2) {
                    C3711o0 c3711o0 = this.f41990c;
                    c3711o0.f42048x = this.f41989b;
                    C3699k0 c3699k0 = c3711o0.f42046v;
                    C3711o0 c3711o02 = this.f41990c;
                    C3699k0 c3699k02 = c3711o02.f42045u;
                    c3711o02.f42046v = null;
                    C3711o0 c3711o03 = this.f41990c;
                    c3711o03.f42045u = null;
                    C3711o0.g(c3711o03, enumC3545m2);
                    this.f41990c.f42036l.d();
                    if (this.f41990c.f42043s.isEmpty()) {
                        C3711o0 c3711o04 = this.f41990c;
                        c3711o04.getClass();
                        c3711o04.k.execute(new RunnableC3690h0(c3711o04, 2));
                    }
                    C3711o0 c3711o05 = this.f41990c;
                    c3711o05.k.e();
                    C1521a c1521a = c3711o05.f42040p;
                    if (c1521a != null) {
                        c1521a.j();
                        c3711o05.f42040p = null;
                        c3711o05.f42038n = null;
                    }
                    C1521a c1521a2 = this.f41990c.f42041q;
                    if (c1521a2 != null) {
                        c1521a2.j();
                        this.f41990c.f42042r.d(this.f41989b);
                        C3711o0 c3711o06 = this.f41990c;
                        c3711o06.f42041q = null;
                        c3711o06.f42042r = null;
                    }
                    if (c3699k0 != null) {
                        c3699k0.d(this.f41989b);
                    }
                    if (c3699k02 != null) {
                        c3699k02.d(this.f41989b);
                        break;
                    }
                }
                break;
            default:
                Iterator it = new ArrayList(this.f41990c.f42043s).iterator();
                while (it.hasNext()) {
                    ((U0) it.next()).a(this.f41989b);
                }
                break;
        }
    }
}
