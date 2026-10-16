package defpackage;

import com.google.android.libraries.maps.model.BitmapDescriptorFactory;

/* loaded from: classes.dex */
public final /* synthetic */ class alg implements afdr {
    public final /* synthetic */ Object a;
    private final /* synthetic */ int b;

    public /* synthetic */ alg(Object obj, int i) {
        this.b = i;
        this.a = obj;
    }

    /* JADX WARN: Type inference failed for: r5v12, types: [dlg, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v32, types: [aixl, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v50, types: [aixl, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v63, types: [bym, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v77, types: [bym, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v9, types: [cwc, java.lang.Object] */
    @Override // defpackage.afdr
    public final Object invoke() {
        switch (this.b) {
            case 0:
                return Boolean.valueOf(((alh) this.a).c() > 0);
            case 1:
                alh alhVar = (alh) this.a;
                return Boolean.valueOf(alhVar.c() < alhVar.b());
            case 2:
                ?? r5 = this.a;
                aiv aivVar = (aiv) bzi.x(r5, akx.a);
                alj aljVar = (alj) r5;
                aljVar.a = aivVar;
                aiv aivVar2 = aljVar.a;
                aljVar.b = aivVar2 != null ? aivVar2.a() : null;
                return afak.a;
            case 3:
                return Float.valueOf(this.a.eA(125.0f));
            case 4:
                amv amvVar = (amv) this.a;
                Object objH = amvVar.h();
                if (objH != null) {
                    return objH;
                }
                float fB = amvVar.b();
                if (Float.isNaN(fB)) {
                    return amvVar.g();
                }
                float fA = amvVar.n().a(amvVar.g());
                if (Float.isNaN(fA) || fB == fA) {
                    return amvVar.g();
                }
                Object objB = amvVar.n().b(fB);
                return objB == null ? amvVar.g() : objB;
            case 5:
                amv amvVar2 = (amv) this.a;
                float fA2 = amvVar2.n().a(amvVar2.i());
                float fA3 = amvVar2.n().a(amvVar2.j()) - fA2;
                float fAbs = Math.abs(fA3);
                float f = 1.0f;
                if (!Float.isNaN(fAbs) && fAbs > 1.0E-6f) {
                    float fD = (amvVar2.d() - fA2) / fA3;
                    if (fD < 1.0E-6f) {
                        f = BitmapDescriptorFactory.HUE_RED;
                    } else if (fD <= 0.999999f) {
                        f = fD;
                    }
                }
                return Float.valueOf(f);
            case 6:
                return ((amv) this.a).n();
            case 7:
                amv amvVar3 = (amv) this.a;
                return new aezu(amvVar3.n(), amvVar3.j());
            case 8:
                return (aoy) aixp.a(this.a.i());
            case 9:
                return Boolean.valueOf(((aqk) this.a).c == api.a);
            case 10:
                return Boolean.valueOf(((cfx) this.a).A);
            case 11:
                ciu ciuVar = ((aqe) this.a).j;
                if (!ciuVar.q.A) {
                    return null;
                }
                cis cisVarG = ciuVar.g();
                if (!cisVarG.a()) {
                    return null;
                }
                if (cisVarG.b()) {
                    ciuVar.getClass();
                    return ciuVar.h(null);
                }
                ciu ciuVarB = ((czq) bzi.s(ciuVar)).J.b();
                if (ciuVarB != null) {
                    return ciuVarB.h(bzi.o(ciuVar));
                }
                return null;
            case 12:
                return (ara) aixp.a(this.a.i());
            case 13:
                return Boolean.valueOf(((aqk) this.a).c == api.a);
            case 14:
                return Integer.valueOf(((axr) this.a).l().m);
            case 15:
                return new axd((afec) this.a.a());
            case 16:
                return Integer.valueOf(((axj) ((axr) this.a).e.a()).i);
            case 17:
                cwk cwkVar = ((azd) this.a).b;
                if (cwkVar != null) {
                    cjn.w(cwkVar);
                }
                return afak.a;
            case 18:
                return (azh) ((afdr) this.a.a()).invoke();
            case 19:
                return Float.valueOf(((baa) this.a).b.b());
            default:
                return Float.valueOf(((baa) this.a).b.a());
        }
    }
}
