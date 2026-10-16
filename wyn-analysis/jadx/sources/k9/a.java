package K9;

import J9.C0643b;
import J9.C0647f;
import J9.C0651j;
import J9.C0661u;
import J9.H;
import J9.J;
import J9.V;
import J9.X;
import Re.Q;
import android.app.Application;
import df.InterfaceC2432a;
import java.util.concurrent.Executor;
import l9.InterfaceC3448d;
import md.AbstractC3536d;
import w8.d;

/* loaded from: classes4.dex */
public final class a implements InterfaceC2432a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f6690a;

    /* renamed from: b, reason: collision with root package name */
    public final b f6691b;

    public /* synthetic */ a(b bVar, int i5) {
        this.f6690a = i5;
        this.f6691b = bVar;
    }

    @Override // df.InterfaceC2432a
    public final Object get() {
        switch (this.f6690a) {
            case 0:
                d dVar = (d) this.f6691b.f6701j.get();
                Fe.b.k(dVar);
                return dVar;
            case 1:
                C0643b c0643b = (C0643b) this.f6691b.k.get();
                Fe.b.k(c0643b);
                return c0643b;
            case 2:
                Q q4 = (Q) this.f6691b.f6698g.get();
                Fe.b.k(q4);
                return q4;
            case 3:
                Application application = (Application) this.f6691b.f6692a.get();
                Fe.b.k(application);
                return application;
            case 4:
                Executor executor = (Executor) this.f6691b.f6709s.get();
                Fe.b.k(executor);
                return executor;
            case 5:
                C0647f c0647f = (C0647f) this.f6691b.f6704n.get();
                Fe.b.k(c0647f);
                return c0647f;
            case 6:
                C0651j c0651j = (C0651j) this.f6691b.f6707q.get();
                Fe.b.k(c0651j);
                return c0651j;
            case 7:
                InterfaceC3448d interfaceC3448d = (InterfaceC3448d) this.f6691b.f6702l.get();
                Fe.b.k(interfaceC3448d);
                return interfaceC3448d;
            case 8:
                AbstractC3536d abstractC3536d = (AbstractC3536d) this.f6691b.f6694c.get();
                Fe.b.k(abstractC3536d);
                return abstractC3536d;
            case 9:
                C0661u c0661u = (C0661u) this.f6691b.f6705o.get();
                Fe.b.k(c0661u);
                return c0661u;
            case 10:
                Executor executor2 = (Executor) this.f6691b.f6708r.get();
                Fe.b.k(executor2);
                return executor2;
            case 11:
                Q q10 = (Q) this.f6691b.f6699h.get();
                Fe.b.k(q10);
                return q10;
            case 12:
                H h10 = (H) this.f6691b.f6700i.get();
                Fe.b.k(h10);
                return h10;
            case 13:
                J j8 = (J) this.f6691b.f6693b.get();
                Fe.b.k(j8);
                return j8;
            case 14:
                V v2 = (V) this.f6691b.f6706p.get();
                Fe.b.k(v2);
                return v2;
            default:
                X x5 = (X) this.f6691b.f6697f.get();
                Fe.b.k(x5);
                return x5;
        }
    }
}
