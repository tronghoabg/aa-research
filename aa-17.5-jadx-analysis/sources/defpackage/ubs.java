package defpackage;

import com.google.android.libraries.geo.mapcore.renderer.LabelRenderer;
import com.google.android.libraries.maps.model.BitmapDescriptorFactory;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* loaded from: classes3.dex */
final class ubs implements ubq {
    public final ubv b;
    private final toq c;
    private final float e;
    private final float f;
    private final float g;
    private float[] i;
    private final uew d = new uew();
    private volatile float h = BitmapDescriptorFactory.HUE_RED;
    private usz j = null;
    private gms k = null;

    /* JADX WARN: Multi-variable type inference failed */
    public ubs(abje abjeVar, ueu ueuVar, abip abipVar, List list, float[] fArr, int i, List list2, List list3) {
        abht abhtVar = ((abjb) abjeVar.f.get(0)).e;
        abht abhtVar2 = abhtVar == null ? abht.a : abhtVar;
        abka abkaVar = abhtVar2.c;
        float f = (abkaVar == null ? abka.a : abkaVar).c;
        abka abkaVar2 = abhtVar2.c;
        float f2 = (abkaVar2 == null ? abka.a : abkaVar2).d;
        abka abkaVar3 = abhtVar2.d;
        tpf tpfVar = new tpf(f, f2 + ((abkaVar3 == null ? abka.a : abkaVar3).d / 2.0f));
        int size = abipVar.b.size() / 3;
        ArrayList arrayList = new ArrayList(size);
        for (int i2 = 0; i2 < size; i2++) {
            int i3 = i2 * 3;
            arrayList.add(new too(abipVar.b.e(i3), abipVar.b.e(i3 + 1)));
        }
        toq toqVarJ = toq.j(arrayList);
        this.c = toqVarJ;
        this.b = new ubv(abjeVar, new ucr(null, toqVarJ), ueuVar, list, Collections.nCopies(abjeVar.f.size(), tpfVar), i, list2, list3, null);
        wub.L(new uai(abjeVar, 7));
        this.i = fArr;
        this.e = abipVar.c;
        abka abkaVar4 = abhtVar2.d;
        this.f = (abkaVar4 == null ? abka.a : abkaVar4).c;
        this.g = (abkaVar4 == null ? abka.a : abkaVar4).d;
    }

    private final float L(udc udcVar, usy usyVar) {
        toq toqVar = this.c;
        int iC = toqVar.c() >> 1;
        too tooVar = udcVar.f;
        toqVar.o(iC, tooVar);
        return Math.min(1.0f, tsw.g(usyVar, tooVar));
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
        return qrv.ac(this.d);
    }

    @Override // defpackage.ubq
    public final /* synthetic */ abje I() {
        return qrv.P(this);
    }

    @Override // defpackage.ubq
    public final void J(int i, uwk uwkVar) {
        uwi uwiVarB;
        this.b.d(i, uwkVar);
        if (uwkVar == null || (uwiVarB = uwkVar.b(0)) == null) {
            return;
        }
        this.i = new float[]{BitmapDescriptorFactory.HUE_RED, uwiVarB.d};
    }

    @Override // defpackage.ubq
    public final /* synthetic */ boolean K() {
        return qrv.Y(this);
    }

    @Override // defpackage.ubq, defpackage.ubb
    public final /* synthetic */ abcs a() {
        return qrv.O(this);
    }

    @Override // defpackage.ubf
    public final float b() {
        return this.h;
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
        return this.d;
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
    public final /* synthetic */ boolean o() {
        return false;
    }

    @Override // defpackage.ump
    public final int p(umk umkVar, boolean z, too tooVar) {
        return 1;
    }

    @Override // defpackage.ubf
    public final boolean r(udc udcVar, usy usyVar, LabelRenderer labelRenderer) {
        uwk uwkVar;
        uwi uwiVarB;
        float f;
        ubv ubvVar;
        tup tupVar;
        float fC;
        float fB;
        int i;
        LabelRenderer labelRenderer2 = labelRenderer;
        if (usyVar.o().l < qrv.I(this)) {
            return true;
        }
        ubv ubvVar2 = this.b;
        int i2 = 0;
        if (ubvVar2.g()) {
            return false;
        }
        if (ubvVar2.h() || (uwkVar = ((ubu) ubvVar2.b().get(0)).a) == null || this.i == null || (uwiVarB = uwkVar.b(0)) == null) {
            return true;
        }
        tta ttaVarZ = usyVar.z();
        float fL = L(udcVar, usyVar);
        if (fL <= BitmapDescriptorFactory.HUE_RED) {
            return true;
        }
        if (this.k != null) {
            usz uszVar = this.j;
            tpf tpfVar = udcVar.a;
            if (ttaVarZ.c(uszVar, tpfVar)) {
                gms gmsVar = this.k;
                gmsVar.getClass();
                tpf.j(tpfVar, tpfVar);
                gmsVar.s(tpfVar);
                this.d.d(tpfVar);
                ubvVar = ubvVar2;
                f = 0.0f;
            }
            gms gmsVar2 = this.k;
            if (gmsVar2 == null) {
                return false;
            }
            uwg uwgVar = uwiVarB.i;
            int iQ = gmsVar2.q();
            ajlp ajlpVarC = labelRenderer2.c(uwgVar, uup.b, iQ);
            if (ajlpVarC == null) {
                return false;
            }
            int i3 = 0;
            while (i3 < iQ) {
                ubz ubzVarR = gmsVar2.r(i3);
                tpf tpfVar2 = ubzVarR.g;
                float f2 = tpfVar2.b;
                float f3 = tpfVar2.c;
                float f4 = ubzVarR.e;
                float f5 = ubzVarR.f;
                float f6 = ubzVarR.c;
                float f7 = uwiVarB.h;
                float f8 = f6 * f7 * fL;
                float f9 = ubzVarR.d;
                float f10 = f8 * 0.5f;
                float f11 = f10 * f4;
                float f12 = f10 * f5;
                float f13 = f7 * f9 * fL * 0.5f;
                float f14 = f4 * f13;
                float f15 = f2 - f11;
                float f16 = f3 - f12;
                float f17 = f2 + f11;
                float f18 = f3 + f12;
                float f19 = f13 * (-f5);
                labelRenderer.d(f15 + f19, f16 + f14, f15 - f19, f16 - f14, f17 - f19, f18 - f14, f17 + f19, f18 + f14, ubzVarR.a, ubzVarR.b, f6, f9, ((ubu) ubvVar.b().get(0)).d, ajlpVarC);
                i3++;
                labelRenderer2 = labelRenderer;
                uwiVarB = uwiVarB;
                iQ = iQ;
                ttaVarZ = ttaVarZ;
                gmsVar2 = gmsVar2;
            }
            gms gmsVar3 = gmsVar2;
            LabelRenderer labelRenderer3 = labelRenderer2;
            tta ttaVar = ttaVarZ;
            ubz ubzVarR2 = gmsVar3.r(iQ >> 1);
            this.h = ubzVarR2 != null ? ubzVarR2.g.c : f;
            labelRenderer3.e(ajlpVarC);
            this.j = ttaVar.b();
            return true;
        }
        tup tupVar2 = udcVar.h;
        toq toqVar = this.c;
        int iC = toqVar.c();
        tupVar2.e();
        tupVar2.g(iC);
        tpf tpfVar3 = udcVar.d;
        if (!ubvVar2.b().isEmpty()) {
            float f20 = ((ubu) ubvVar2.b().get(0)).c.c;
            tpfVar3.n(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED);
            if (f20 != BitmapDescriptorFactory.HUE_RED) {
                toqVar.n(usyVar.f(), tpfVar3);
                tpfVar3.m((-f20) * usyVar.f() * tsw.f(usyVar));
                tpfVar3.m(ubvVar2.b.e);
            }
        }
        float[] fArr = udcVar.g;
        too tooVar = udcVar.f;
        f = 0.0f;
        int i4 = 0;
        while (true) {
            if (i4 < iC) {
                toqVar.o(i4, tooVar);
                if (ubvVar2.b().isEmpty() || ((ubu) ubvVar2.b().get(i2)).c.c == BitmapDescriptorFactory.HUE_RED) {
                    i = i2;
                } else {
                    i = i2;
                    tooVar.a = (int) (tooVar.a + tpfVar3.b);
                    tooVar.b = (int) (tooVar.b + tpfVar3.c);
                }
                if (!tsw.n(usyVar, tooVar, fArr)) {
                    break;
                }
                tupVar2.d(fArr[i], fArr[1]);
                i4++;
                i2 = i;
                ubvVar2 = ubvVar2;
            } else {
                ubvVar = ubvVar2;
                int i5 = i2;
                float fL2 = L(udcVar, usyVar) * usyVar.f();
                float f21 = this.f;
                float f22 = f21 * fL2;
                if (tupVar2.b() < f22) {
                    tupVar = tupVar2;
                    tupVar.h(udcVar.a, udcVar.b, udcVar.c, BitmapDescriptorFactory.HUE_RED, f22);
                } else {
                    tupVar = tupVar2;
                }
                if (!ubvVar.b().isEmpty()) {
                    float fL3 = L(udcVar, usyVar) * usyVar.f();
                    float fB2 = this.e * tupVar.b();
                    float f23 = ((ubu) ubvVar.b().get(i5)).c.b * fL3;
                    float f24 = fL3 * f21;
                    tpf tpfVar4 = udcVar.a;
                    tpf tpfVar5 = udcVar.b;
                    tpf tpfVar6 = udcVar.c;
                    float f25 = fB2 + f23;
                    tupVar.h(tpfVar4, tpfVar5, tpfVar6, f25, f25 + f24);
                    tup tupVar3 = tupVar;
                    float f26 = usyVar.f() * fL;
                    int i6 = tupVar3.b;
                    float f27 = this.g * f26;
                    if (i6 == 2) {
                        tupVar3.k(0.5f, tpfVar4);
                        fC = f27 * 0.5f;
                        fB = tupVar3.b() * 0.5f;
                    } else {
                        tupVar3.j(0, tpfVar5);
                        tupVar3.j(i6 - 1, tpfVar6);
                        tupVar3.j(i6 / 2, tpfVar3);
                        tpf.d(tpfVar5, tpfVar6, 0.5f, tpfVar4);
                        tpf.p(tpfVar6, tpfVar5, tpfVar6);
                        float fC2 = tpfVar6.c();
                        tpf.p(tpfVar3, tpfVar5, tpfVar3);
                        tpf.i(tpfVar6, tpfVar3.b(tpfVar6) / (fC2 * fC2), tpfVar6);
                        tpf.p(tpfVar3, tpfVar6, tpfVar3);
                        tpf.i(tpfVar3, 0.5f, tpfVar3);
                        tpf.g(tpfVar4, tpfVar3, tpfVar4);
                        fC = (tpfVar3.c() + f27) * 0.5f;
                        fB = fC2 * 0.5f;
                    }
                    this.d.h(tpfVar4.b, tpfVar4.c, tupVar3.a(), fB, fC);
                    float[] fArr2 = this.i;
                    fArr2.getClass();
                    gms gmsVarZ = this.k;
                    if (gmsVarZ == null) {
                        gmsVarZ = gms.z(uwiVarB.b, uwiVarB.c, fArr2, uwiVarB.e);
                        this.k = gmsVarZ;
                    }
                    gmsVarZ.t(tupVar3, fArr2, uwiVarB.h, fL, udcVar.n);
                }
            }
        }
        return true;
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
    public final /* synthetic */ void w(int i) {
        qrv.Q(this, i);
    }

    @Override // defpackage.ubf
    public final /* synthetic */ void x(int i) {
        qrv.R(this, i);
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

    @Override // defpackage.ubf
    public final /* synthetic */ void q(udc udcVar, usy usyVar) {
    }
}
