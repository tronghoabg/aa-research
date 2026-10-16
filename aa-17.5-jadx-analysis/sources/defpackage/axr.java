package defpackage;

import androidx.compose.runtime.ParcelableSnapshotMutableState;
import com.google.android.libraries.maps.model.BitmapDescriptorFactory;
import java.util.List;

/* loaded from: classes.dex */
public final class axr implements aqf {
    public static final cdt q = byx.t(new abp(3), new awf(6));
    public boolean a;
    public axj b;
    public boolean c;
    public final axm d;
    public final bwq e;
    public final asf f;
    public float g;
    public boolean h;
    public final cus i;
    public final ayg j;
    public final azd k;
    public final azt l;
    public final azq m;
    public final bwq n;
    public final bwq o;
    public final awy p;
    public cxb r;
    public final coc s;
    public final kwp t;
    private final aqf u;
    private int v;
    private boolean w;
    private final bwq x;
    private final bwq y;
    private final izj z;

    public axr(int i, int i2, awy awyVar) {
        this.p = awyVar;
        this.d = new axm(i, i2);
        axj axjVar = axs.a;
        bxp bxpVar = bxp.b;
        this.e = new ParcelableSnapshotMutableState(axjVar, bxpVar);
        this.f = new asg();
        this.u = new anj(new aui(this, 12));
        this.w = true;
        this.i = new bbq(this, 1);
        this.j = new ayg();
        this.k = new azd();
        this.t = new kwp((byte[]) null, (short[]) null);
        this.l = new azt(new axw(i, 1));
        this.z = new izj(this);
        this.m = new azq();
        afak afakVar = afak.a;
        this.n = new ParcelableSnapshotMutableState(afakVar, bxpVar);
        bxp bxpVar2 = bxp.c;
        this.x = new ParcelableSnapshotMutableState(false, bxpVar2);
        this.y = new ParcelableSnapshotMutableState(false, bxpVar2);
        this.o = new ParcelableSnapshotMutableState(afakVar, bxpVar);
        this.s = new coc((char[]) null);
    }

    @Override // defpackage.aqf
    public final float a(float f) {
        return this.u.a(f);
    }

    public final int b() {
        return this.d.a();
    }

    public final int c() {
        return this.d.b();
    }

    public final dlg d() {
        return ((axj) this.e.a()).g;
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x0063, code lost:
    
        if (r5.e(r6, r7, r0) == r1) goto L23;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // defpackage.aqf
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object e(defpackage.akq r6, defpackage.afeg r7, defpackage.afck r8) throws java.lang.Throwable {
        /*
            r5 = this;
            boolean r0 = r8 instanceof defpackage.axp
            if (r0 == 0) goto L13
            r0 = r8
            axp r0 = (defpackage.axp) r0
            int r1 = r0.d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.d = r1
            goto L18
        L13:
            axp r0 = new axp
            r0.<init>(r5, r8)
        L18:
            java.lang.Object r8 = r0.b
            afcr r1 = defpackage.afcr.a
            int r2 = r0.d
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L3a
            if (r2 == r4) goto L32
            if (r2 != r3) goto L2a
            defpackage.woy.dF(r8)
            goto L66
        L2a:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L32:
            java.lang.Object r7 = r0.a
            akq r6 = r0.e
            defpackage.woy.dF(r8)
            goto L56
        L3a:
            defpackage.woy.dF(r8)
            bwq r8 = r5.e
            java.lang.Object r8 = r8.a()
            axj r2 = defpackage.axs.a
            if (r8 != r2) goto L56
            ayg r8 = r5.j
            r0.e = r6
            r0.a = r7
            r0.d = r4
            java.lang.Object r8 = r8.f(r0)
            if (r8 != r1) goto L56
            goto L65
        L56:
            aqf r5 = r5.u
            r8 = 0
            r0.e = r8
            r0.a = r8
            r0.d = r3
            java.lang.Object r5 = r5.e(r6, r7, r0)
            if (r5 != r1) goto L66
        L65:
            return r1
        L66:
            afak r5 = defpackage.afak.a
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.axr.e(akq, afeg, afck):java.lang.Object");
    }

    /* JADX WARN: Type inference failed for: r0v5, types: [aivh, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r12v1, types: [aivh, java.lang.Object] */
    public final void f(axj axjVar, boolean z, boolean z2) {
        cec cecVar;
        afec afecVarI;
        cec cecVarI;
        axk axkVar;
        this.l.c = axjVar.j.size();
        if (!z && this.a) {
            this.b = axjVar;
            cecVar = (cec) cek.i.j();
            afecVarI = cecVar != null ? cecVar.i() : null;
            cecVarI = byx.i(cecVar);
            try {
                coc cocVar = this.s;
                if (((Number) ((aed) cocVar.b).a()).floatValue() != BitmapDescriptorFactory.HUE_RED && (axkVar = axjVar.a) != null) {
                    int i = axkVar.a;
                    axm axmVar = this.d;
                    if (i == axmVar.a() && axjVar.b == axmVar.b()) {
                        ?? r0 = cocVar.a;
                        if (r0 != 0) {
                            r0.s(null);
                        }
                        cocVar.b = new aed(agm.a, Float.valueOf(BitmapDescriptorFactory.HUE_RED), null, Long.MIN_VALUE, Long.MIN_VALUE, false);
                    }
                }
                return;
            } finally {
            }
        }
        if (z) {
            this.a = true;
        }
        axk axkVar2 = axjVar.a;
        this.y.b(Boolean.valueOf(((axkVar2 == null || axkVar2.a == 0) && axjVar.b == 0) ? false : true));
        this.x.b(Boolean.valueOf(axjVar.c));
        this.g -= axjVar.d;
        this.e.b(axjVar);
        if (z2) {
            axm axmVar2 = this.d;
            int i2 = axjVar.b;
            if (i2 < BitmapDescriptorFactory.HUE_RED) {
                asl.d("scrollOffset should be non-negative");
            }
            axmVar2.d(i2);
        } else {
            List list = axjVar.j;
            axk axkVar3 = (axk) woy.bH(list);
            axk axkVar4 = (axk) woy.bL(list);
            vs.i("firstVisibleItem:index", axkVar3 != null ? axkVar3.a : -1L);
            vs.i("lastVisibleItem:index", axkVar4 != null ? axkVar4.a : -1L);
            axm axmVar3 = this.d;
            axmVar3.b = axkVar2 != null ? axkVar2.e : null;
            if (axmVar3.a || axjVar.m > 0) {
                axmVar3.a = true;
                int i3 = axjVar.b;
                if (i3 < BitmapDescriptorFactory.HUE_RED) {
                    asl.d("scrollOffset should be non-negative");
                }
                axmVar3.e(axkVar2 != null ? axkVar2.a : 0, i3);
            }
            if (this.w) {
                awy awyVar = this.p;
                izj izjVar = this.z;
                int i4 = awyVar.a;
                boolean z3 = awyVar.c;
                if (i4 != -1 && !list.isEmpty() && i4 != awy.b(axjVar, z3)) {
                    awyVar.a();
                }
                int i5 = axjVar.m;
                int i6 = awyVar.d;
                if (i6 != -1 && awyVar.e != BitmapDescriptorFactory.HUE_RED && i6 != i5 && !list.isEmpty()) {
                    int iB = awy.b(axjVar, awyVar.e < BitmapDescriptorFactory.HUE_RED);
                    if (iB >= 0 && iB < i5) {
                        awyVar.a = iB;
                        awyVar.b = izjVar.n(iB);
                    }
                }
                awyVar.d = i5;
            }
        }
        if (z) {
            coc cocVar2 = this.s;
            float f = axjVar.e;
            dlg dlgVar = axjVar.g;
            aitx aitxVar = axjVar.f;
            if (f > dlgVar.eA(1.0f)) {
                cecVar = (cec) cek.i.j();
                afecVarI = cecVar != null ? cecVar.i() : null;
                cecVarI = byx.i(cecVar);
                try {
                    float fFloatValue = ((Number) ((aed) cocVar2.b).a()).floatValue();
                    ?? r12 = cocVar2.a;
                    if (r12 != 0) {
                        r12.s(null);
                    }
                    Object obj = cocVar2.b;
                    if (((aed) obj).d) {
                        cocVar2.b = ca.C((aed) obj, fFloatValue - f, BitmapDescriptorFactory.HUE_RED, 30);
                    } else {
                        cocVar2.b = new aed(agm.a, Float.valueOf(-f), null, Long.MIN_VALUE, Long.MIN_VALUE, false);
                    }
                    cocVar2.a = ahnc.d(aitxVar, null, 0, new ada(cocVar2, (afck) null, 18), 3);
                } finally {
                }
            }
        }
        this.v++;
    }

    @Override // defpackage.aqf
    public final boolean g() {
        return ((Boolean) this.y.a()).booleanValue();
    }

    @Override // defpackage.aqf
    public final boolean h() {
        return ((Boolean) this.x.a()).booleanValue();
    }

    @Override // defpackage.aqf
    public final boolean i() {
        return this.u.i();
    }

    public final void j(int i, int i2) {
        if (i()) {
            ahnc.d(((axj) this.e.a()).f, null, 0, new ada(this, (afck) null, 12), 3);
        }
        k(i, i2, false);
    }

    public final void k(int i, int i2, boolean z) {
        axm axmVar = this.d;
        if (axmVar.a() != i || axmVar.b() != i2) {
            this.k.c();
        }
        axmVar.e(i, i2);
        axmVar.b = null;
        if (!z) {
            this.n.b(afak.a);
            return;
        }
        cxb cxbVar = this.r;
        if (cxbVar != null) {
            cxbVar.D();
        }
    }

    public final axj l() {
        return (axj) this.e.a();
    }

    public final void m(float f, axj axjVar) {
        azs azsVar;
        azs azsVar2;
        if (this.w) {
            awy awyVar = this.p;
            izj izjVar = this.z;
            List list = axjVar.j;
            if (!list.isEmpty()) {
                boolean z = f < BitmapDescriptorFactory.HUE_RED;
                int iB = awy.b(axjVar, z);
                if (iB >= 0 && iB < axjVar.m) {
                    if (iB != awyVar.a) {
                        if (awyVar.c != z) {
                            awyVar.a();
                        }
                        awyVar.c = z;
                        awyVar.a = iB;
                        awyVar.b = izjVar.n(iB);
                    }
                    if (z) {
                        axk axkVar = (axk) woy.bK(list);
                        if (((axkVar.h + axkVar.i) + axjVar.p) - axjVar.l < (-f) && (azsVar2 = awyVar.b) != null) {
                            azsVar2.b();
                        }
                    } else if (axjVar.k - ((axk) woy.bF(list)).h < f && (azsVar = awyVar.b) != null) {
                        azsVar.b();
                    }
                }
            }
            awyVar.e = f;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Type inference failed for: r5v2, types: [afak, java.lang.Object] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object n(int r6, defpackage.afck r7) throws java.lang.Throwable {
        /*
            r5 = this;
            boolean r0 = r7 instanceof defpackage.axn
            if (r0 == 0) goto L13
            r0 = r7
            axn r0 = (defpackage.axn) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            axn r0 = new axn
            r0.<init>(r5, r7)
        L18:
            java.lang.Object r7 = r0.a
            afcr r1 = defpackage.afcr.a
            int r2 = r0.c
            r3 = 0
            r4 = 1
            if (r2 == 0) goto L32
            if (r2 != r4) goto L2a
            defpackage.woy.dF(r7)     // Catch: java.lang.Throwable -> L28
            goto L48
        L28:
            r6 = move-exception
            goto L4d
        L2a:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L32:
            defpackage.woy.dF(r7)
            r5.h = r4     // Catch: java.lang.Throwable -> L28
            axx r7 = new axx     // Catch: java.lang.Throwable -> L28
            r2 = 0
            r7.<init>(r5, r6, r2, r4)     // Catch: java.lang.Throwable -> L28
            r0.c = r4     // Catch: java.lang.Throwable -> L28
            akq r6 = defpackage.akq.a     // Catch: java.lang.Throwable -> L28
            java.lang.Object r6 = r5.e(r6, r7, r0)     // Catch: java.lang.Throwable -> L28
            if (r6 != r1) goto L48
            return r1
        L48:
            r5.h = r3
            afak r5 = defpackage.afak.a
            return r5
        L4d:
            r5.h = r3
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.axr.n(int, afck):java.lang.Object");
    }

    public final Object o(int i, afck afckVar) {
        Object objE = e(akq.a, new axq(this, i, null), afckVar);
        return objE == afcr.a ? objE : afak.a;
    }

    public axr(int i, int i2) {
        this(i, i2, new awy());
    }

    public axr() {
        this(0, 0, new awy());
    }
}
