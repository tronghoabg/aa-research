package g2;

import N1.AbstractC0774x;
import N1.C0770t;
import N1.C0773w;
import N1.N;
import ad.C1355I;
import android.net.Uri;
import java.io.IOException;
import java.util.ArrayList;
import javax.net.SocketFactory;
import k2.AbstractC3144a;
import k2.k0;

/* loaded from: classes.dex */
public final class v extends AbstractC3144a {

    /* renamed from: h, reason: collision with root package name */
    public final C1355I f35681h;

    /* renamed from: i, reason: collision with root package name */
    public final String f35682i = "AndroidXMedia3/1.5.1";

    /* renamed from: j, reason: collision with root package name */
    public final Uri f35683j;
    public final SocketFactory k;

    /* renamed from: l, reason: collision with root package name */
    public long f35684l;

    /* renamed from: m, reason: collision with root package name */
    public boolean f35685m;

    /* renamed from: n, reason: collision with root package name */
    public boolean f35686n;

    /* renamed from: o, reason: collision with root package name */
    public boolean f35687o;

    /* renamed from: p, reason: collision with root package name */
    public C0773w f35688p;

    static {
        AbstractC0774x.a("media3.exoplayer.rtsp");
    }

    public v(C0773w c0773w, C1355I c1355i, SocketFactory socketFactory) {
        this.f35688p = c0773w;
        this.f35681h = c1355i;
        C0770t c0770t = c0773w.f8272b;
        c0770t.getClass();
        this.f35683j = c0770t.f8264a;
        this.k = socketFactory;
        this.f35684l = -9223372036854775807L;
        this.f35687o = true;
    }

    @Override // k2.AbstractC3144a
    public final k2.F b(k2.H h10, o2.e eVar, long j8) {
        com.google.android.gms.ads.nativead.l lVar = new com.google.android.gms.ads.nativead.l(this, 4);
        return new s(eVar, this.f35681h, this.f35683j, lVar, this.f35682i, this.k);
    }

    @Override // k2.AbstractC3144a
    public final synchronized C0773w h() {
        return this.f35688p;
    }

    @Override // k2.AbstractC3144a
    public final void l(S1.A a5) {
        t();
    }

    @Override // k2.AbstractC3144a
    public final void n(k2.F f10) throws IOException {
        s sVar = (s) f10;
        int i5 = 0;
        while (true) {
            ArrayList arrayList = sVar.f35663e;
            if (i5 >= arrayList.size()) {
                Q1.x.g(sVar.f35662d);
                sVar.f35675r = true;
                return;
            }
            r rVar = (r) arrayList.get(i5);
            if (!rVar.f35657e) {
                rVar.f35654b.e(null);
                rVar.f35655c.B();
                rVar.f35657e = true;
            }
            i5++;
        }
    }

    @Override // k2.AbstractC3144a
    public final synchronized void s(C0773w c0773w) {
        this.f35688p = c0773w;
    }

    public final void t() {
        N k0Var = new k0(this.f35684l, this.f35685m, this.f35686n, h());
        if (this.f35687o) {
            k0Var = new t(k0Var, 0);
        }
        m(k0Var);
    }

    @Override // k2.AbstractC3144a
    public final void j() {
    }

    @Override // k2.AbstractC3144a
    public final void p() {
    }
}
