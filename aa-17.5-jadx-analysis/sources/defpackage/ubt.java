package defpackage;

import com.google.android.libraries.geo.mapcore.renderer.LabelRenderer;
import com.google.android.libraries.geo.mapcore.renderer.LayeredLabelRenderer;
import com.google.android.libraries.maps.model.BitmapDescriptorFactory;
import java.util.Arrays;
import java.util.List;

/* loaded from: classes3.dex */
final class ubt implements ubq {
    private static final yob i = yob.c("com/google/android/libraries/geo/mapcore/internal/label/GLPlacedLabelPoint");
    public final ubv b;
    public final uew[] e;
    public final abdo f;
    public final Long g;
    public nzj h;
    private final uim j;
    private double l;
    private uzc o;
    private final uew[] p;
    private final boolean q;
    private final float r;
    private final int s;
    private final int[] t;
    public too c = null;
    public too d = null;
    private final tpf k = new tpf();
    private boolean m = false;
    private final tpf n = new tpf();

    /* JADX WARN: Removed duplicated region for block: B:71:0x01c7  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x01ca  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x01d2  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x01e3  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public ubt(defpackage.abje r18, defpackage.ueu r19, defpackage.uim r20, java.util.List r21, int r22, java.util.List r23, int r24, java.util.List r25, java.util.List r26, defpackage.uds r27) {
        /*
            Method dump skipped, instructions count: 631
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ubt.<init>(abje, ueu, uim, java.util.List, int, java.util.List, int, java.util.List, java.util.List, uds):void");
    }

    private final boolean Q() {
        return qrv.aa(this.b.a);
    }

    @Override // defpackage.ubf
    public final /* synthetic */ void A(long j, ube ubeVar) {
        qrv.U(this, j, ubeVar);
    }

    @Override // defpackage.ubf
    public final /* synthetic */ boolean B() {
        return qrv.X(this);
    }

    @Override // defpackage.ubf
    public final /* synthetic */ boolean C() {
        return false;
    }

    @Override // defpackage.ubf
    public final /* synthetic */ boolean D() {
        return false;
    }

    @Override // defpackage.ubf
    public final /* synthetic */ int E(long j) {
        return qrv.ab(this, j);
    }

    @Override // defpackage.ubq
    public final /* synthetic */ uds F() {
        return qrv.L(this);
    }

    @Override // defpackage.ubq
    public final /* synthetic */ ueu G() {
        return qrv.N(this);
    }

    @Override // defpackage.ubq
    public final uzc H() {
        return this.o;
    }

    @Override // defpackage.ubq
    public final /* synthetic */ abje I() {
        return qrv.P(this);
    }

    @Override // defpackage.ubq
    public final /* synthetic */ void J(int i2, uwk uwkVar) {
        this.b.d(i2, uwkVar);
    }

    @Override // defpackage.ubq
    public final /* synthetic */ boolean K() {
        return qrv.Y(this);
    }

    final Long L() {
        int i2;
        abdo abdoVar = this.f;
        if (abdoVar == null || (i2 = abdoVar.c) != 2) {
            return null;
        }
        return Long.valueOf(i2 == 2 ? ((Long) abdoVar.d).longValue() : 0L);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void M(float f) {
        uew[] uewVarArr;
        abje abjeVar = this.b.a;
        aboh abohVar = abjeVar.f;
        int i2 = 0;
        while (true) {
            uewVarArr = this.e;
            if (i2 >= uewVarArr.length) {
                break;
            }
            abjb abjbVar = (abjb) abohVar.get(i2);
            uew uewVar = uewVarArr[i2];
            abht abhtVar = abjbVar.e;
            if (abhtVar == null) {
                abhtVar = abht.a;
            }
            qrv.ad(abhtVar, f, this.l, this.k, this.n, uewVar);
            i2++;
        }
        for (int i3 = 0; i3 < abjeVar.p.size(); i3++) {
            qrv.ad((abht) qrv.P(this).p.get(i3), f, this.l, this.k, this.n, this.p[i3]);
        }
        uzc uzcVar = uzc.a;
        for (uew uewVar2 : uewVarArr) {
            uzc uzcVarAc = qrv.ac(uewVar2);
            if (uzcVar.a()) {
                uzcVar = uzcVarAc;
            } else if (!uzcVarAc.a()) {
                uzcVarAc = new uzc(Math.min(uzcVar.b, uzcVarAc.b), Math.min(uzcVar.c, uzcVarAc.c), Math.max(uzcVar.d, uzcVarAc.d), Math.max(uzcVar.e, uzcVarAc.e));
                uzcVar = uzcVarAc;
            }
        }
        this.o = uzcVar;
    }

    final boolean N() {
        abdo abdoVar = this.f;
        return abdoVar != null && abdoVar.c == 1 && ((Boolean) abdoVar.d).booleanValue();
    }

    final boolean O() {
        return this.f != null;
    }

    public final float P(usy usyVar) {
        if (this.s != 2 || usyVar.z().j) {
            return 1.0f;
        }
        return tsw.g(usyVar, this.j.a);
    }

    @Override // defpackage.ubq, defpackage.ubb
    public final /* synthetic */ abcs a() {
        return qrv.O(this);
    }

    @Override // defpackage.ubf
    public final float b() {
        return this.n.c;
    }

    @Override // defpackage.ubf
    public final /* synthetic */ long c(ube ubeVar) {
        return qrv.K(this, ubeVar);
    }

    @Override // defpackage.ubf
    public final /* synthetic */ tpv d() {
        return null;
    }

    @Override // defpackage.ubf
    public final uew e() {
        uzc uzcVar = this.o;
        if (uzcVar == null) {
            return new uew();
        }
        uew uewVar = new uew();
        int i2 = uzcVar.b;
        int i3 = uzcVar.d;
        int i4 = uzcVar.c;
        int i5 = uzcVar.e;
        uewVar.h((i2 + i3) / 2.0f, (i4 + i5) / 2.0f, 0.0d, (i3 - i2) / 2.0f, (i5 - i4) / 2.0f);
        return uewVar;
    }

    @Override // defpackage.ubf
    public final /* synthetic */ uew f() {
        return null;
    }

    @Override // defpackage.ubf
    public final /* synthetic */ uew g() {
        return null;
    }

    @Override // defpackage.ubq
    public final ubv h() {
        return this.b;
    }

    @Override // defpackage.ubf
    public final /* synthetic */ void l(ubf ubfVar, float f) {
        qrv.T(this, ubfVar, f);
    }

    @Override // defpackage.ubf
    public final /* synthetic */ boolean m() {
        return qrv.W(this);
    }

    @Override // defpackage.ump
    public final /* synthetic */ boolean n() {
        return false;
    }

    @Override // defpackage.ubq, defpackage.ubf
    public final boolean o() {
        return this.q;
    }

    @Override // defpackage.ump
    public final int p(umk umkVar, boolean z, too tooVar) {
        if (!this.q) {
            return 1;
        }
        tooVar.A(this.j.a);
        int i2 = 0;
        while (true) {
            uew[] uewVarArr = this.p;
            if (i2 >= uewVarArr.length) {
                return 1;
            }
            uew uewVar = uewVarArr[i2];
            int i3 = this.t[i2];
            if (i3 == 2) {
                if (umkVar.a(uewVar)) {
                    return 2;
                }
            } else if (z && i3 == 3 && uewVar.e(umkVar.b.e)) {
                return 3;
            }
            i2++;
        }
    }

    @Override // defpackage.ubf
    public final void q(udc udcVar, usy usyVar) {
        char c;
        float f;
        int iAp;
        float f2;
        float f3;
        float f4;
        double d;
        char c2;
        float f5 = usyVar.o().l;
        this.m = true;
        if (f5 < qrv.I(this)) {
            return;
        }
        ubv ubvVar = this.b;
        uds udsVar = ubvVar.j;
        too tooVarC = udsVar != null ? udsVar.c() : null;
        if (tooVarC == null) {
            tooVarC = this.j.a;
        }
        this.d = tooVarC;
        too tooVar = this.c;
        if (tooVar != null) {
            this.d = tooVar;
        }
        float[] fArr = udcVar.g;
        if (!tsw.l(usyVar, this.d, fArr, true)) {
            this.m = false;
            return;
        }
        float f6 = fArr[0];
        float f7 = fArr[1];
        too tooVar2 = udcVar.f;
        tpf tpfVar = this.k;
        ttn ttnVarO = usyVar.o();
        float f8 = ttnVarO.m;
        abje abjeVar = ubvVar.a;
        boolean z = (abjeVar.b & 4) != 0;
        float fFloatValue = abjeVar.h;
        uds udsVar2 = ubvVar.j;
        Float fValueOf = (udsVar2 == null || !udsVar2.a.g) ? null : Float.valueOf(udsVar2.a());
        if (fValueOf != null) {
            fFloatValue = fValueOf.floatValue();
            z = true;
        }
        double dAtan2 = 0.0d;
        if (z || Q()) {
            if ((f8 <= -1.0E-4f || f8 >= 1.0E-4f) && !Q()) {
                if (!z || (iAp = a.ap(abjeVar.i)) == 0) {
                    c = 0;
                } else {
                    c = 0;
                    if (iAp == 3) {
                        f2 = 0.0f;
                        f = f6;
                    }
                }
                uim uimVar = this.j;
                float f9 = ttnVarO.l;
                double radians = Math.toRadians(-fFloatValue);
                f = f6;
                double dA = ton.a(f9) * 100.0f;
                double dCos = Math.cos(radians) * dA;
                double dSin = dA * Math.sin(radians);
                too tooVar3 = uimVar.a;
                tooVar2.r(tooVar3.a + ((int) dCos), tooVar3.b + ((int) dSin));
                if (tsw.l(usyVar, tooVar2, fArr, true)) {
                    tpfVar.b = fArr[c] - f;
                    tpfVar.c = fArr[1] - f7;
                    tpf.k(tpfVar, tpfVar);
                    dAtan2 = Math.atan2(tpfVar.c, tpfVar.b);
                } else {
                    tpfVar.b = 1.0f;
                    tpfVar.c = BitmapDescriptorFactory.HUE_RED;
                }
            } else {
                f2 = 0.0f;
                f = f6;
                c = 0;
            }
            int iAp2 = a.ap(abjeVar.i);
            if (iAp2 == 0) {
                iAp2 = 2;
            }
            if (Q()) {
                if (!z) {
                    c2 = c;
                } else if (iAp2 == 2) {
                    f4 = ttnVarO.n;
                    f3 = f4 + fFloatValue;
                    d = f3;
                } else {
                    c2 = 1;
                }
                float f10 = ttnVarO.n;
                float f11 = f10 + f10;
                if (1 != c2) {
                    fFloatValue = f2;
                }
                d = f11 + fFloatValue;
            } else if (!z) {
                f3 = ttnVarO.n;
                d = f3;
            } else if (iAp2 == 2) {
                d = fFloatValue;
            } else {
                f4 = ttnVarO.n;
                f3 = f4 + fFloatValue;
                d = f3;
            }
            dAtan2 = Math.toRadians(d - ttnVarO.n);
            tpfVar.b = (float) Math.cos(dAtan2);
            tpfVar.c = (float) Math.sin(dAtan2);
        } else {
            tpfVar.b = 1.0f;
            tpfVar.c = BitmapDescriptorFactory.HUE_RED;
            f = f6;
        }
        this.l = dAtan2;
        this.n.n(f, f7);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.ubf
    public final boolean r(udc udcVar, usy usyVar, LabelRenderer labelRenderer) {
        float f;
        int i2;
        ubv ubvVar;
        float f2;
        int i3;
        ubt ubtVar;
        usy usyVar2;
        double d;
        boolean z;
        char c;
        char c2;
        char c3;
        char c4;
        uta utaVar;
        ajlp ajlpVarE;
        ajlp ajlpVar;
        char c5;
        float fB;
        float fA;
        int i4;
        ubt ubtVar2 = this;
        udc udcVar2 = udcVar;
        usy usyVar3 = usyVar;
        boolean z2 = true;
        if (usyVar3.o().l < qrv.I(ubtVar2)) {
            return true;
        }
        ubv ubvVar2 = ubtVar2.b;
        int i5 = 0;
        if (ubvVar2.g()) {
            return false;
        }
        if (ubvVar2.h()) {
            return true;
        }
        if (!ubtVar2.m) {
            return false;
        }
        float fP = ubtVar2.P(usyVar3);
        float f3 = usyVar3.f();
        ubtVar2.M(fP * f3);
        int i6 = 0;
        while (i6 < ubvVar2.b().size()) {
            ubu ubuVar = (ubu) ubvVar2.b().get(i6);
            uwk uwkVar = ubuVar.a;
            if (uwkVar == null) {
                usyVar2 = usyVar3;
                ubvVar = ubvVar2;
                f2 = fP;
                f = f3;
                i3 = i6;
                ubtVar = ubtVar2;
            } else {
                tpf tpfVar = ubuVar.c;
                float f4 = tpfVar.b * fP;
                float f5 = tpfVar.c * fP;
                uwu uwuVar = udcVar2.j;
                uwuVar.h();
                int i7 = i5;
                f = f3;
                if (ubtVar2.l != 0.0d) {
                    tpf tpfVar2 = ubtVar2.k;
                    float f6 = tpfVar2.b;
                    float f7 = tpfVar2.c;
                    i2 = i7;
                    float f8 = (-f7) * f5;
                    f5 = (f5 * f6) + (f4 * f7);
                    f4 = (f4 * f6) + f8;
                } else {
                    i2 = i7;
                }
                List list = udcVar2.m;
                list.clear();
                if (ubvVar2.h) {
                    int i8 = i2;
                    while (true) {
                        z = z2;
                        c = 6;
                        if (i8 >= uwkVar.a() || i8 >= 6) {
                            break;
                        }
                        tpf tpfVar3 = ubtVar2.n;
                        float f9 = fP;
                        tpf tpfVar4 = new tpf(tpfVar3.b + (f4 * f), tpfVar3.c + (f5 * f));
                        float f10 = f4;
                        double d2 = ubtVar2.l;
                        float[] fArr = udcVar2.k;
                        float[] fArr2 = ubuVar.h;
                        fArr[i2] = fArr2[i8];
                        float[] fArr3 = ubuVar.i;
                        fArr[z ? 1 : 0] = fArr3[i8];
                        float f11 = uwkVar.a * f9;
                        int i9 = i6;
                        float f12 = uwkVar.b * f9;
                        uwi uwiVarB = uwkVar.b(i8);
                        if (uwiVarB != null) {
                            fB = uwiVarB.b() * f9;
                            fA = uwiVarB.a() * f9;
                        } else {
                            fB = f11;
                            fA = f12;
                        }
                        int i10 = i8;
                        float f13 = f11 - fB;
                        float f14 = f5;
                        float f15 = fArr2[i10] - 0.5f;
                        float f16 = ((fB / f11) * f15) + 0.5f;
                        float f17 = f12 - fA;
                        float f18 = fArr3[i10] - 0.5f;
                        ubv ubvVar3 = ubvVar2;
                        float f19 = ((fA / f12) * f18) + 0.5f;
                        if (i10 == 0) {
                            uwuVar.d(-0.5f, -0.5f);
                            uwuVar.c(f11, f12);
                            uwuVar.d(tpfVar4.b, tpfVar4.c);
                            uwuVar.d((-f13) * f15, (-f17) * f18);
                            i4 = i2;
                            i10 = i4;
                        } else {
                            i4 = i10;
                        }
                        uwuVar.a(fArr, fArr);
                        uwuVar.h();
                        uwuVar.d(-f16, -f19);
                        uwuVar.c(ubuVar.k[i10] * f11, ubuVar.l[i10] * f12);
                        float f20 = ubuVar.j[i10];
                        uwuVar.b((f20 + f20) * 3.1415927f);
                        uwuVar.d(ubuVar.f[i10] * f11, ubuVar.g[i10] * f12);
                        uwuVar.b((float) d2);
                        uwuVar.d(fArr[i2], fArr[z ? 1 : 0]);
                        uwuVar.g(uwuVar);
                        uwi uwiVarB2 = uwkVar.b(i4);
                        if (uwiVarB2 != null) {
                            float[] fArr4 = ubuVar.e;
                            if (fArr4[i4] != BitmapDescriptorFactory.HUE_RED) {
                                uvb uvbVar = udcVar2.l[i4];
                                list.add(uvbVar);
                                uvbVar.a = fArr4[i4];
                                uvbVar.b = uwiVarB2;
                                float fB2 = uwiVarB2.b() / uwkVar.a;
                                float fA2 = uwiVarB2.a() / uwkVar.b;
                                uwuVar.f(0.5f, 0.5f);
                                uwuVar.i(fB2, fA2);
                                uwuVar.e();
                                uwuVar.f(-0.5f, -0.5f);
                                uvbVar.c.g(uwuVar);
                            }
                        }
                        i8 = i4 + 1;
                        ubtVar2 = this;
                        z2 = z ? 1 : 0;
                        f4 = f10;
                        fP = f9;
                        i6 = i9;
                        ubvVar2 = ubvVar3;
                        f5 = f14;
                    }
                    ubvVar = ubvVar2;
                    f2 = fP;
                    i3 = i6;
                    if (list.isEmpty()) {
                        ubtVar = this;
                    } else {
                        uup uupVar = uup.b;
                        ubtVar = this;
                        float f21 = ubuVar.d * ubtVar.r;
                        LayeredLabelRenderer layeredLabelRenderer = labelRenderer.a;
                        if (layeredLabelRenderer != null && list.size() > 0) {
                            char c6 = 4;
                            float[] fArrCopyOf = Arrays.copyOf(LayeredLabelRenderer.c, 4);
                            int i11 = i2;
                            uwg uwgVar = null;
                            while (true) {
                                c2 = 7;
                                c3 = 5;
                                c4 = 2;
                                if (i11 >= list.size()) {
                                    break;
                                }
                                uvb uvbVar2 = (uvb) list.get(i11);
                                char c7 = c;
                                float[] fArr5 = uvbVar2.d;
                                char c8 = c6;
                                uwi uwiVar = uvbVar2.b;
                                if (uwiVar != null) {
                                    uvbVar2.c.a(fArr5, LayeredLabelRenderer.b);
                                    float fMin = Math.min(fArrCopyOf[i2], fArr5[i2]);
                                    fArrCopyOf[i2] = fMin;
                                    float fMin2 = Math.min(fMin, fArr5[2]);
                                    fArrCopyOf[i2] = fMin2;
                                    float fMin3 = Math.min(fMin2, fArr5[c8]);
                                    fArrCopyOf[i2] = fMin3;
                                    fArrCopyOf[i2] = Math.min(fMin3, fArr5[c7]);
                                    float fMin4 = Math.min(fArrCopyOf[z ? 1 : 0], fArr5[z ? 1 : 0]);
                                    fArrCopyOf[z ? 1 : 0] = fMin4;
                                    float fMin5 = Math.min(fMin4, fArr5[3]);
                                    fArrCopyOf[z ? 1 : 0] = fMin5;
                                    float fMin6 = Math.min(fMin5, fArr5[5]);
                                    fArrCopyOf[z ? 1 : 0] = fMin6;
                                    fArrCopyOf[z ? 1 : 0] = Math.min(fMin6, fArr5[7]);
                                    float fMax = Math.max(fArrCopyOf[2], fArr5[i2]);
                                    fArrCopyOf[2] = fMax;
                                    float fMax2 = Math.max(fMax, fArr5[2]);
                                    fArrCopyOf[2] = fMax2;
                                    float fMax3 = Math.max(fMax2, fArr5[c8]);
                                    fArrCopyOf[2] = fMax3;
                                    fArrCopyOf[2] = Math.max(fMax3, fArr5[c7]);
                                    float fMax4 = Math.max(fArrCopyOf[3], fArr5[z ? 1 : 0]);
                                    fArrCopyOf[3] = fMax4;
                                    float fMax5 = Math.max(fMax4, fArr5[3]);
                                    fArrCopyOf[3] = fMax5;
                                    float fMax6 = Math.max(fMax5, fArr5[5]);
                                    fArrCopyOf[3] = fMax6;
                                    fArrCopyOf[3] = Math.max(fMax6, fArr5[7]);
                                    uwgVar = uwiVar.i;
                                }
                                i11++;
                                c6 = c8;
                                c = c7;
                            }
                            char c9 = c;
                            char c10 = c6;
                            if (uwgVar != null && (ajlpVarE = (utaVar = layeredLabelRenderer.e).e(uwgVar, uupVar, z ? 1 : 0)) != null) {
                                List list2 = layeredLabelRenderer.f;
                                list2.clear();
                                int i12 = i2;
                                while (i12 < list.size()) {
                                    uvb uvbVar3 = (uvb) list.get(i12);
                                    uwu uwuVar2 = layeredLabelRenderer.g;
                                    char c11 = c2;
                                    float[] fArr6 = uvbVar3.d;
                                    char c12 = c3;
                                    uwi uwiVar2 = uvbVar3.b;
                                    if (uwiVar2 != null) {
                                        c5 = c4;
                                        float[] fArr7 = uvbVar3.c.a;
                                        float f22 = fArr7[i2];
                                        float f23 = fArr7[c10];
                                        ajlpVar = ajlpVarE;
                                        float f24 = fArr7[1];
                                        float f25 = fArr7[3];
                                        float f26 = (f22 * f23) - (f24 * f25);
                                        if (f26 != BitmapDescriptorFactory.HUE_RED) {
                                            float f27 = f23 / f26;
                                            float f28 = (-f24) / f26;
                                            float f29 = (-f25) / f26;
                                            float f30 = f22 / f26;
                                            float f31 = fArr7[c5];
                                            float f32 = fArr7[c12];
                                            float f33 = f28 * f32;
                                            float[] fArr8 = uwuVar2.a;
                                            fArr8[i2] = f27;
                                            fArr8[1] = f28;
                                            fArr8[c5] = -((f27 * f31) + f33);
                                            fArr8[3] = f29;
                                            fArr8[c10] = f30;
                                            fArr8[c12] = -((f31 * f29) + (f32 * f30));
                                            list2.add(uvbVar3);
                                            fArr6[i2] = fArrCopyOf[i2];
                                            fArr6[1] = fArrCopyOf[1];
                                            fArr6[c5] = fArrCopyOf[i2];
                                            fArr6[3] = fArrCopyOf[3];
                                            float f34 = fArrCopyOf[c5];
                                            fArr6[c10] = f34;
                                            fArr6[c12] = fArrCopyOf[1];
                                            fArr6[c9] = f34;
                                            fArr6[c11] = fArrCopyOf[3];
                                            uwuVar2.a(fArr6, fArr6);
                                            float[] fArr9 = uvbVar3.e;
                                            float f35 = fArr6[i2];
                                            float f36 = uwiVar2.d;
                                            float f37 = uwiVar2.b;
                                            fArr9[i2] = (f35 * f36) + f37;
                                            float f38 = fArr6[1];
                                            float f39 = uwiVar2.e;
                                            float f40 = uwiVar2.c;
                                            fArr9[1] = (f38 * f39) + f40;
                                            fArr9[c5] = (fArr6[c5] * f36) + f37;
                                            fArr9[3] = (fArr6[3] * f39) + f40;
                                            fArr9[c10] = (fArr6[c10] * f36) + f37;
                                            fArr9[c12] = (fArr6[c12] * f39) + f40;
                                            fArr9[c9] = f37 + (fArr6[c9] * f36);
                                            fArr9[c11] = f40 + (fArr6[c11] * f39);
                                        }
                                    } else {
                                        ajlpVar = ajlpVarE;
                                        c5 = c4;
                                    }
                                    i12++;
                                    c2 = c11;
                                    c3 = c12;
                                    c4 = c5;
                                    ajlpVarE = ajlpVar;
                                }
                                ajlp ajlpVar2 = ajlpVarE;
                                char c13 = c4;
                                LayeredLabelRenderer.b(fArrCopyOf[i2], fArrCopyOf[3], list2, 1, f21, ajlpVar2);
                                LayeredLabelRenderer.b(fArrCopyOf[i2], fArrCopyOf[1], list2, 0, f21, ajlpVar2);
                                LayeredLabelRenderer.b(fArrCopyOf[c13], fArrCopyOf[1], list2, 2, f21, ajlpVar2);
                                LayeredLabelRenderer.b(fArrCopyOf[c13], fArrCopyOf[3], list2, 3, f21, ajlpVar2);
                                utaVar.f(ajlpVar2);
                            }
                        }
                    }
                } else {
                    ubvVar = ubvVar2;
                    f2 = fP;
                    i3 = i6;
                    float f41 = f4;
                    float f42 = f5;
                    ubtVar = ubtVar2;
                    uwi uwiVarB3 = uwkVar.b(i2);
                    if (uwiVarB3 != null) {
                        if (ubtVar.Q()) {
                            tpf tpfVar5 = udcVar2.a;
                            tpfVar5.n((uwiVarB3.b() * 0.5f) - (tpfVar.b * f), (uwiVarB3.a() * 0.5f) - (tpfVar.c * f));
                            qrv.V((abjb) ubvVar.a.f.get(0), udcVar2.b);
                            if (ubtVar.N() && ubtVar.h == null) {
                                ubtVar.h = new nzj((char[]) null);
                            }
                            tpf tpfVar6 = ubtVar.k;
                            float f43 = ubuVar.d * ubtVar.r;
                            tpf tpfVar7 = ubtVar.n;
                            uup uupVar2 = uup.b;
                            tpf tpfVar8 = tpf.a;
                            nzj nzjVar = ubtVar.h;
                            if (tpfVar8.b(tpfVar8) > 0.1d) {
                                ((ynz) i.a(uys.a).ai((char) 9239)).u("Rendering a perspective label with element offsets; this won't work.");
                            }
                            float f44 = tpfVar7.b;
                            float f45 = tpfVar7.c;
                            tpf tpfVar9 = udcVar2.d;
                            tpf.e(tpfVar8, tpfVar6, tpfVar9);
                            float f46 = f44 + (tpfVar9.b * f2);
                            float f47 = f45 + (tpfVar9.c * f2);
                            too tooVar = udcVar2.f;
                            float[] fArr10 = udcVar2.g;
                            usyVar2 = usyVar;
                            if (tsw.o(usyVar2, f46, f47, tooVar, fArr10)) {
                                int i13 = tooVar.a;
                                int i14 = tooVar.b;
                                float f48 = 1.0f / usyVar2.f();
                                float fA3 = ton.a(usyVar2.o().l) * f2;
                                float f49 = -tpfVar5.b;
                                float f50 = -tpfVar5.c;
                                float f51 = fA3 * f48;
                                float fB3 = uwiVarB3.b() * f51;
                                float fA4 = uwiVarB3.a() * f51;
                                double d3 = tpfVar6.b;
                                double d4 = -tpfVar6.c;
                                float f52 = f50 * f51;
                                float f53 = fA4 + f52;
                                float f54 = f49 * f51;
                                float f55 = fB3 + f54;
                                double d5 = -d3;
                                if (nzjVar != null) {
                                    double d6 = f55 - f54;
                                    d = d3;
                                    ubvVar = ubvVar;
                                    ((tpf) nzjVar.b).n((float) (d6 * d3), (float) (d6 * d4));
                                    double d7 = f53 - f52;
                                    ((tpf) nzjVar.a).n((float) (d7 * d4), (float) (d7 * d5));
                                } else {
                                    ubvVar = ubvVar;
                                    d = d3;
                                }
                                double d8 = i13;
                                double d9 = f54;
                                double d10 = d9 * d;
                                double d11 = f53;
                                double d12 = d11 * d4;
                                double d13 = i14;
                                double d14 = d11 * d5;
                                double d15 = (d9 * d4) + d13;
                                double d16 = d8 + d10;
                                tooVar.r((int) (d16 + d12), (int) (d15 + d14));
                                if (tsw.n(usyVar2, tooVar, fArr10)) {
                                    float f56 = fArr10[0];
                                    float f57 = fArr10[1];
                                    double d17 = f52;
                                    double d18 = d17 * d4;
                                    double d19 = d17 * d5;
                                    tooVar.r((int) (d16 + d18), (int) (d15 + d19));
                                    if (nzjVar != null) {
                                        ((too) nzjVar.c).A(tooVar);
                                    }
                                    if (tsw.n(usyVar2, tooVar, fArr10)) {
                                        float f58 = fArr10[0];
                                        float f59 = fArr10[1];
                                        double d20 = f55;
                                        double d21 = d20 * d;
                                        double d22 = d13 + (d20 * d4);
                                        double d23 = d22 + d19;
                                        double d24 = d8 + d21;
                                        tooVar.r((int) (d24 + d18), (int) d23);
                                        if (tsw.n(usyVar2, tooVar, fArr10)) {
                                            float f60 = fArr10[0];
                                            float f61 = fArr10[1];
                                            tooVar.r((int) (d24 + d12), (int) (d22 + d14));
                                            if (tsw.n(usyVar2, tooVar, fArr10)) {
                                                labelRenderer.b(uwiVarB3, uupVar2, f56, f57, f58, f59, f60, f61, fArr10[0], fArr10[1], uwiVarB3.b, uwiVarB3.c, uwiVarB3.d, uwiVarB3.e, f43);
                                            } else {
                                                ((ynz) ((ynz) i.d()).ai((char) 9237)).u("Projected label can't be placed on the screen.");
                                            }
                                        } else {
                                            ((ynz) ((ynz) i.d()).ai((char) 9236)).u("Projected label can't be placed on the screen.");
                                        }
                                    } else {
                                        ((ynz) ((ynz) i.d()).ai((char) 9235)).u("Projected label can't be placed on the screen.");
                                    }
                                } else {
                                    ((ynz) ((ynz) i.d()).ai((char) 9234)).u("Projected label can't be placed on the screen.");
                                }
                                ubtVar = this;
                            } else {
                                ((ynz) ((ynz) i.d()).ai((char) 9238)).u("Projected label can't be placed on the ground.");
                                ubvVar = ubvVar;
                            }
                        } else {
                            usyVar2 = usyVar;
                            ubtVar = this;
                            tpf tpfVar10 = ubtVar.n;
                            uup uupVar3 = uup.b;
                            float f62 = tpfVar10.b + (f41 * f);
                            float f63 = tpfVar10.c + (f42 * f);
                            tpf tpfVar11 = ubtVar.k;
                            labelRenderer.a(uwiVarB3, uupVar3, f62, f63, tpfVar11.b, tpfVar11.c, uwiVarB3.b() * f2, uwiVarB3.a() * f2, uwiVarB3.b, uwiVarB3.c, uwiVarB3.d, uwiVarB3.e, ubuVar.d * ubtVar.r);
                        }
                    }
                }
                usyVar2 = usyVar;
            }
            i6 = i3 + 1;
            udcVar2 = udcVar;
            ubtVar2 = ubtVar;
            usyVar3 = usyVar2;
            f3 = f;
            fP = f2;
            ubvVar2 = ubvVar;
            z2 = true;
            i5 = 0;
        }
        return z2;
    }

    @Override // defpackage.ubf
    public final /* synthetic */ boolean s(udc udcVar, usy usyVar) {
        return true;
    }

    @Override // defpackage.ubq, defpackage.ubf
    public final /* synthetic */ int t() {
        return qrv.J(this);
    }

    @Override // defpackage.ubq, defpackage.ubf
    public final /* synthetic */ udx u() {
        return qrv.M(this);
    }

    @Override // defpackage.ubq, defpackage.ubf
    public final /* synthetic */ utf v() {
        return uup.b;
    }

    @Override // defpackage.ubf
    public final /* synthetic */ void w(int i2) {
        qrv.Q(this, i2);
    }

    @Override // defpackage.ubf
    public final /* synthetic */ void x(int i2) {
        qrv.R(this, i2);
    }

    @Override // defpackage.ubf
    public final /* synthetic */ void y(boolean z) {
        qrv.S(this, z);
    }

    @Override // defpackage.ubf
    public final /* synthetic */ void i() {
    }

    @Override // defpackage.ubf
    public final /* synthetic */ void j(boolean z) {
    }

    @Override // defpackage.ubf
    public final /* synthetic */ void k(boolean z) {
    }

    @Override // defpackage.ubf
    public final /* synthetic */ void z(float f) {
    }
}
