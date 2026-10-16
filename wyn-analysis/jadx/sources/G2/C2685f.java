package g2;

import android.os.Handler;
import ba.C1521a;

/* renamed from: g2.f, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2685f implements o2.j {

    /* renamed from: a, reason: collision with root package name */
    public final int f35577a;

    /* renamed from: b, reason: collision with root package name */
    public final w f35578b;

    /* renamed from: c, reason: collision with root package name */
    public final com.unity3d.services.core.webview.b f35579c;

    /* renamed from: d, reason: collision with root package name */
    public final C1521a f35580d;

    /* renamed from: f, reason: collision with root package name */
    public final InterfaceC2683d f35582f;

    /* renamed from: g, reason: collision with root package name */
    public InterfaceC2684e f35583g;

    /* renamed from: h, reason: collision with root package name */
    public C2686g f35584h;

    /* renamed from: i, reason: collision with root package name */
    public s2.j f35585i;

    /* renamed from: j, reason: collision with root package name */
    public volatile boolean f35586j;

    /* renamed from: l, reason: collision with root package name */
    public volatile long f35587l;

    /* renamed from: e, reason: collision with root package name */
    public final Handler f35581e = Q1.x.m(null);
    public volatile long k = -9223372036854775807L;

    public C2685f(int i5, w wVar, com.unity3d.services.core.webview.b bVar, C1521a c1521a, InterfaceC2683d interfaceC2683d) {
        this.f35577a = i5;
        this.f35578b = wVar;
        this.f35579c = bVar;
        this.f35580d = c1521a;
        this.f35582f = interfaceC2683d;
    }

    @Override // o2.j
    public final void g() {
        this.f35586j = true;
    }

    @Override // o2.j
    public final void load() {
        if (this.f35586j) {
            this.f35586j = false;
        }
        try {
            if (this.f35583g == null) {
                InterfaceC2684e interfaceC2684eF = this.f35582f.f(this.f35577a);
                this.f35583g = interfaceC2684eF;
                this.f35581e.post(new com.applovin.impl.mediation.ads.f(this, interfaceC2684eF.n(), this.f35583g, 18));
                InterfaceC2684e interfaceC2684e = this.f35583g;
                interfaceC2684e.getClass();
                this.f35585i = new s2.j(interfaceC2684e, 0L, -1L);
                C2686g c2686g = new C2686g(this.f35578b.f35689a, this.f35577a);
                this.f35584h = c2686g;
                c2686g.g(this.f35580d);
            }
            while (!this.f35586j) {
                if (this.k != -9223372036854775807L) {
                    C2686g c2686g2 = this.f35584h;
                    c2686g2.getClass();
                    c2686g2.a(this.f35587l, this.k);
                    this.k = -9223372036854775807L;
                }
                C2686g c2686g3 = this.f35584h;
                c2686g3.getClass();
                s2.j jVar = this.f35585i;
                jVar.getClass();
                if (c2686g3.k(jVar, new J5.n()) == -1) {
                    break;
                }
            }
            this.f35586j = false;
            InterfaceC2684e interfaceC2684e2 = this.f35583g;
            interfaceC2684e2.getClass();
            if (interfaceC2684e2.A()) {
                Fe.b.m(this.f35583g);
                this.f35583g = null;
            }
        } catch (Throwable th) {
            InterfaceC2684e interfaceC2684e3 = this.f35583g;
            interfaceC2684e3.getClass();
            if (interfaceC2684e3.A()) {
                Fe.b.m(this.f35583g);
                this.f35583g = null;
            }
            throw th;
        }
    }
}
