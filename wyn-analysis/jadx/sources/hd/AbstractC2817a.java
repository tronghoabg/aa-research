package hd;

import A7.B0;
import N1.B;
import N1.C0754c;
import N1.C0773w;
import N1.E;
import N1.F;
import N1.G;
import N1.H;
import N1.I;
import N1.V;
import N1.Y;
import N1.z;
import U1.C0850u;
import U1.InterfaceC0843m;
import ad.L;
import cb.AbstractC1593a;
import java.util.HashMap;
import java.util.List;
import n2.C3586i;

/* renamed from: hd.a, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public abstract class AbstractC2817a implements H {

    /* renamed from: a, reason: collision with root package name */
    public boolean f36391a = false;

    /* renamed from: b, reason: collision with root package name */
    public boolean f36392b = false;

    /* renamed from: c, reason: collision with root package name */
    public final InterfaceC0843m f36393c;

    /* renamed from: d, reason: collision with root package name */
    public final L f36394d;

    public AbstractC2817a(InterfaceC0843m interfaceC0843m, L l10) {
        this.f36393c = interfaceC0843m;
        this.f36394d = l10;
    }

    @Override // N1.H
    public final /* synthetic */ void A(F f10) {
    }

    @Override // N1.H
    public final void C(E e7) {
        r(false);
        if (e7.f8029a == 1002) {
            Object obj = this.f36393c;
            B0 b02 = (B0) obj;
            b02.getClass();
            b02.O(-9223372036854775807L, ((C0850u) b02).l0(), false);
            ((C0850u) obj).z0();
            return;
        }
        n nVar = (n) this.f36394d.f17515b;
        nVar.getClass();
        m mVar = new m();
        mVar.f36415a = "VideoError";
        mVar.f36416b = "Video player had error " + e7;
        mVar.f36417c = null;
        if (!nVar.f36420c) {
            nVar.f36419b.add(mVar);
        }
        nVar.b();
    }

    @Override // N1.H
    public final /* synthetic */ void E(G g9) {
    }

    @Override // N1.H
    public final /* synthetic */ void F(V v2) {
    }

    @Override // N1.H
    public final /* synthetic */ void a(int i5) {
    }

    @Override // N1.H
    public final void b(int i5) {
        n nVar = (n) this.f36394d.f17515b;
        if (i5 == 2) {
            r(true);
            long jH0 = ((C0850u) this.f36393c).h0();
            HashMap mapL = AbstractC1593a.l("event", "bufferingUpdate");
            mapL.put("position", Long.valueOf(jH0));
            nVar.a(mapL);
        } else if (i5 != 3) {
            if (i5 == 4) {
                HashMap map = new HashMap();
                map.put("event", "completed");
                nVar.a(map);
            }
        } else if (!this.f36392b) {
            this.f36392b = true;
            q();
        }
        if (i5 != 2) {
            r(false);
        }
    }

    @Override // N1.H
    public final /* synthetic */ void c(boolean z2) {
    }

    @Override // N1.H
    public final /* synthetic */ void d(int i5) {
    }

    @Override // N1.H
    public final /* synthetic */ void e(boolean z2) {
    }

    @Override // N1.H
    public final /* synthetic */ void f(List list) {
    }

    @Override // N1.H
    public final /* synthetic */ void g(int i5, int i10) {
    }

    @Override // N1.H
    public final /* synthetic */ void h(boolean z2) {
    }

    @Override // N1.H
    public final /* synthetic */ void i(int i5, boolean z2) {
    }

    @Override // N1.H
    public final /* synthetic */ void j(float f10) {
    }

    @Override // N1.H
    public final /* synthetic */ void k(int i5) {
    }

    @Override // N1.H
    public final /* synthetic */ void l(int i5, boolean z2) {
    }

    @Override // N1.H
    public final void m(boolean z2) {
        L l10 = this.f36394d;
        HashMap mapL = AbstractC1593a.l("event", "isPlayingStateUpdate");
        mapL.put("isPlaying", Boolean.valueOf(z2));
        ((n) l10.f17515b).a(mapL);
    }

    @Override // N1.H
    public final /* synthetic */ void n(C3586i c3586i) {
    }

    @Override // N1.H
    public final /* synthetic */ void o(B b5) {
    }

    @Override // N1.H
    public final /* synthetic */ void p(Y y10) {
    }

    public abstract void q();

    public final void r(boolean z2) {
        if (this.f36391a == z2) {
            return;
        }
        this.f36391a = z2;
        n nVar = (n) this.f36394d.f17515b;
        if (z2) {
            HashMap map = new HashMap();
            map.put("event", "bufferingStart");
            nVar.a(map);
        } else {
            HashMap map2 = new HashMap();
            map2.put("event", "bufferingEnd");
            nVar.a(map2);
        }
    }

    @Override // N1.H
    public final /* synthetic */ void t(I i5, I i10, int i11) {
    }

    @Override // N1.H
    public final /* synthetic */ void u(P1.c cVar) {
    }

    @Override // N1.H
    public final /* synthetic */ void v(C0754c c0754c) {
    }

    @Override // N1.H
    public final /* synthetic */ void w(z zVar) {
    }

    @Override // N1.H
    public final /* synthetic */ void x(E e7) {
    }

    @Override // N1.H
    public final /* synthetic */ void z(C0773w c0773w, int i5) {
    }
}
