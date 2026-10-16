package e.a.f;

import j$.util.Objects;
import java.io.IOException;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class an {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ aq f47653a;

    /* renamed from: b, reason: collision with root package name */
    private final k.h f47654b;

    /* renamed from: c, reason: collision with root package name */
    private final int f47655c;

    /* renamed from: d, reason: collision with root package name */
    private int f47656d;

    /* renamed from: e, reason: collision with root package name */
    private int f47657e;

    /* renamed from: f, reason: collision with root package name */
    private final am f47658f;

    /* renamed from: g, reason: collision with root package name */
    private boolean f47659g;

    an(aq aqVar, int i2, int i3, am amVar) {
        Objects.requireNonNull(aqVar);
        this.f47653a = aqVar;
        this.f47654b = new k.h();
        this.f47659g = false;
        this.f47655c = i2;
        this.f47656d = i3;
        this.f47658f = amVar;
    }

    final int a() {
        return this.f47657e;
    }

    final int b() {
        return Math.max(0, Math.min(this.f47656d, (int) this.f47654b.q())) - this.f47657e;
    }

    final int c() {
        return this.f47656d;
    }

    final int d() {
        return Math.min(this.f47656d, this.f47653a.f47664d.f47656d);
    }

    final void e(int i2) {
        this.f47657e += i2;
    }

    final void f() {
        this.f47657e = 0;
    }

    final void g(k.h hVar, int i2, boolean z) {
        this.f47654b.l(hVar, i2);
        this.f47659g |= z;
    }

    final void h(k.h hVar, int i2, boolean z) {
        do {
            aq aqVar = this.f47653a;
            int iMin = Math.min(i2, aqVar.f47662b.d());
            int i3 = -iMin;
            aqVar.f47664d.k(i3);
            k(i3);
            try {
                boolean z2 = false;
                if (hVar.q() == iMin && z) {
                    z2 = true;
                }
                aqVar.f47662b.f(z2, this.f47655c, hVar, iMin);
                this.f47658f.e(iMin);
                i2 -= iMin;
            } catch (IOException e2) {
                throw new RuntimeException(e2);
            }
        } while (i2 > 0);
    }

    final boolean i() {
        return this.f47654b.q() > 0;
    }

    final void j(int i2, ap apVar) {
        int iMin = Math.min(i2, d());
        int iQ = 0;
        while (i() && iMin > 0) {
            k.h hVar = this.f47654b;
            if (iMin >= hVar.q()) {
                iQ += (int) hVar.q();
                h(hVar, (int) hVar.q(), this.f47659g);
            } else {
                iQ += iMin;
                h(hVar, iMin, false);
            }
            apVar.f47660a++;
            iMin = Math.min(i2 - iQ, d());
        }
    }

    final void k(int i2) {
        if (i2 <= 0 || Integer.MAX_VALUE - i2 >= this.f47656d) {
            this.f47656d += i2;
            return;
        }
        throw new IllegalArgumentException("Window size overflow for stream: " + this.f47655c);
    }
}
