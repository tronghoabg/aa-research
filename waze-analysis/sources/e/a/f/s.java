package e.a.f;

import e.a.bc;
import e.a.ch;
import e.a.cm;
import e.a.d.dh;
import e.a.d.dk;
import e.a.d.jt;
import e.a.d.jz;
import e.a.ee;
import j$.util.Objects;
import java.util.ArrayList;
import java.util.List;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
final class s extends dk implements am {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ t f47719a;

    /* renamed from: b, reason: collision with root package name */
    private final int f47720b;

    /* renamed from: c, reason: collision with root package name */
    private final Object f47721c;

    /* renamed from: d, reason: collision with root package name */
    private List f47722d;

    /* renamed from: e, reason: collision with root package name */
    private final k.h f47723e;

    /* renamed from: f, reason: collision with root package name */
    private boolean f47724f;

    /* renamed from: g, reason: collision with root package name */
    private boolean f47725g;

    /* renamed from: h, reason: collision with root package name */
    private boolean f47726h;

    /* renamed from: i, reason: collision with root package name */
    private int f47727i;

    /* renamed from: j, reason: collision with root package name */
    private int f47728j;

    /* renamed from: k, reason: collision with root package name */
    private final h f47729k;

    /* renamed from: l, reason: collision with root package name */
    private final aq f47730l;
    private final ac m;
    private boolean n;
    private an o;
    private int p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s(t tVar, int i2, jt jtVar, Object obj, h hVar, aq aqVar, ac acVar, int i3, e.a.h hVar2) {
        super(i2, jtVar, tVar.r(), hVar2);
        Objects.requireNonNull(tVar);
        this.f47719a = tVar;
        this.f47723e = new k.h();
        this.f47724f = false;
        this.f47725g = false;
        this.f47726h = false;
        this.n = true;
        this.p = -1;
        this.f47721c = obj;
        this.f47729k = hVar;
        this.f47730l = aqVar;
        this.m = acVar;
        this.f47727i = i3;
        this.f47728j = i3;
        this.f47720b = i3;
        int i4 = e.b.b.f47862a;
    }

    static /* bridge */ /* synthetic */ void F(s sVar, k.h hVar, boolean z, boolean z2) {
        if (sVar.f47726h) {
            return;
        }
        if (!sVar.n) {
            com.google.d.b.an.v(sVar.p != -1, "streamId should be set");
            sVar.f47730l.d(z, sVar.o, hVar, z2);
        } else {
            sVar.f47723e.l(hVar, (int) hVar.q());
            sVar.f47724f |= z;
            sVar.f47725g |= z2;
        }
    }

    static /* bridge */ /* synthetic */ void G(s sVar, cm cmVar, String str) {
        t tVar = sVar.f47719a;
        String str2 = tVar.f47735e;
        String str3 = tVar.f47733c;
        ac acVar = sVar.m;
        boolean zY = acVar.Y();
        e.a.f.a.a.e eVar = j.f47686a;
        com.google.d.b.an.C(cmVar, "headers");
        com.google.d.b.an.C(str2, "authority");
        cmVar.g(dh.f46797g);
        cmVar.g(dh.f46798h);
        ch chVar = dh.f46799i;
        cmVar.g(chVar);
        ArrayList arrayList = new ArrayList(bc.a(cmVar) + 7);
        if (zY) {
            arrayList.add(j.f47687b);
        } else {
            arrayList.add(j.f47686a);
        }
        arrayList.add(j.f47688c);
        arrayList.add(new e.a.f.a.a.e(e.a.f.a.a.e.f47494e, str2));
        arrayList.add(new e.a.f.a.a.e(e.a.f.a.a.e.f47492c, str));
        arrayList.add(new e.a.f.a.a.e(chVar.e(), str3));
        arrayList.add(j.f47690e);
        arrayList.add(j.f47691f);
        byte[][] bArrA = jz.a(cmVar);
        for (int i2 = 0; i2 < bArrA.length; i2 += 2) {
            k.k kVarJ = k.k.j(bArrA[i2]);
            if (kVarJ.d() != 0 && kVarJ.a(0) != 58) {
                arrayList.add(new e.a.f.a.a.e(kVarJ, k.k.j(bArrA[i2 + 1])));
            }
        }
        sVar.f47722d = arrayList;
        acVar.X(tVar, tVar.f47735e);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void L(ee eeVar, boolean z, cm cmVar) {
        if (this.f47726h) {
            return;
        }
        this.f47726h = true;
        boolean z2 = this.n;
        ac acVar = this.m;
        if (!z2) {
            acVar.V(this.p, eeVar, e.a.d.ag.f46605a, z, e.a.f.a.a.a.CANCEL, cmVar);
            return;
        }
        acVar.W(this.f47719a);
        this.f47722d = null;
        this.f47723e.N();
        this.n = false;
        if (cmVar == null) {
            cmVar = new cm();
        }
        o(eeVar, true, cmVar);
    }

    @Override // e.a.d.gf
    public final void A(int i2) {
        int i3 = this.f47728j - i2;
        this.f47728j = i3;
        int i4 = this.f47720b;
        if (i3 <= i4 * 0.5f) {
            int i5 = i4 - i3;
            this.f47727i += i5;
            this.f47728j = i3 + i5;
            this.f47729k.i(this.p, i5);
        }
    }

    @Override // e.a.d.gf
    public final void B(Throwable th) {
        L(ee.e(th), true, new cm());
    }

    final int C() {
        return this.p;
    }

    final an D() {
        an anVar;
        synchronized (this.f47721c) {
            anVar = this.o;
        }
        return anVar;
    }

    public final void H(int i2) {
        com.google.d.b.an.w(this.p == -1, "the stream has been started with id %s", i2);
        this.p = i2;
        aq aqVar = this.f47730l;
        this.o = aqVar.b(this, i2);
        t tVar = this.f47719a;
        s sVar = tVar.f47736f;
        super.f();
        sVar.a().c();
        if (this.n) {
            this.f47729k.k(false, this.p, this.f47722d);
            tVar.f47734d.a();
            this.f47722d = null;
            k.h hVar = this.f47723e;
            if (hVar.q() > 0) {
                aqVar.d(this.f47724f, this.o, hVar, this.f47725g);
            }
            this.n = false;
        }
    }

    public final void I(k.h hVar, boolean z, int i2) {
        int iQ = this.f47727i - (((int) hVar.q()) + i2);
        this.f47727i = iQ;
        this.f47728j -= i2;
        if (iQ >= 0) {
            super.w(new ai(hVar), z);
        } else {
            this.f47729k.c(this.p, e.a.f.a.a.a.FLOW_CONTROL_ERROR);
            this.m.V(this.p, ee.f47410j.g("Received data size exceeded our receiving window size"), e.a.d.ag.f46605a, false, null, null);
        }
    }

    public final void J(List list, boolean z) {
        if (z) {
            y(ar.b(list));
        } else {
            x(ar.a(list));
        }
    }

    @Override // e.a.d.e, e.a.d.gf
    public final void j(boolean z) {
        boolean zQ = q();
        ac acVar = this.m;
        if (zQ) {
            acVar.V(this.p, null, e.a.d.ag.f46605a, false, null, null);
        } else {
            acVar.V(this.p, null, e.a.d.ag.f46605a, false, e.a.f.a.a.a.CANCEL, null);
        }
        super.j(z);
    }

    @Override // e.a.d.h
    public final void v(Runnable runnable) {
        synchronized (this.f47721c) {
            runnable.run();
        }
    }

    @Override // e.a.d.dk
    protected final void z(ee eeVar, cm cmVar) {
        L(eeVar, false, cmVar);
    }
}
