package defpackage;

import androidx.car.app.model.CarIcon;
import com.google.android.projection.gearhead.R;

/* loaded from: classes2.dex */
public final /* synthetic */ class kks implements afeh {
    public final /* synthetic */ Object a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;
    public final /* synthetic */ Object g;
    private final /* synthetic */ int h;

    public /* synthetic */ kks(hge hgeVar, hga hgaVar, hgc hgcVar, hju hjuVar, hju hjuVar2, hju hjuVar3, hju hjuVar4, int i) {
        this.h = i;
        this.f = hgeVar;
        this.g = hgaVar;
        this.d = hgcVar;
        this.a = hjuVar;
        this.b = hjuVar2;
        this.e = hjuVar3;
        this.c = hjuVar4;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r11v24, types: [aitx, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r11v25, types: [aitx, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r12v7, types: [bym, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r12v8, types: [bym, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r13v0, types: [bym, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r13v4, types: [bym, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r15v1, types: [hju, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v0, types: [aitx, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v13, types: [aitx, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r8v0, types: [java.lang.Object, kld] */
    /* JADX WARN: Type inference failed for: r8v10, types: [java.lang.Object, kld] */
    /* JADX WARN: Type inference failed for: r9v15, types: [java.lang.Object, kld] */
    /* JADX WARN: Type inference failed for: r9v19, types: [java.lang.Object, kld] */
    @Override // defpackage.afeh
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        int i = this.h;
        int i2 = 1;
        if (i == 0) {
            bux buxVar = (bux) obj2;
            ((Integer) obj3).intValue();
            final ?? r13 = this.d;
            int i3 = kkz.a;
            ((til) obj).getClass();
            buxVar.v(-89503005);
            CarIcon carIconX = std.x(R.drawable.gs_remove_vd_theme_24, buxVar);
            Object obj4 = this.b;
            final ?? r8 = this.a;
            final Number number = (Number) obj4;
            int iA = r8.a(kkz.a(r13), number);
            final ?? r7 = this.c;
            boolean zE = buxVar.E(obj4) | buxVar.E(r7) | buxVar.E(r8) | buxVar.C(r13);
            Object obj5 = this.e;
            boolean zE2 = zE | buxVar.E(obj5);
            Object obj6 = this.f;
            boolean zE3 = zE2 | buxVar.E(obj6);
            Object obj7 = this.g;
            boolean zE4 = zE3 | buxVar.E(obj7);
            Object objG = buxVar.g();
            if (zE4 || objG == buw.a) {
                final qn qnVar = (qn) obj7;
                final kjz kjzVar = (kjz) obj6;
                final Number number2 = (Number) obj5;
                final int i4 = 1;
                afdr afdrVar = new afdr() { // from class: kkv
                    @Override // defpackage.afdr
                    public final Object invoke() {
                        int i5 = i4;
                        aitx aitxVar = r7;
                        if (i5 != 0) {
                            int i6 = kkz.a;
                            bym bymVar = r13;
                            qn qnVar2 = qnVar;
                            kjz kjzVar2 = kjzVar;
                            Number number3 = number2;
                            ahnc.d(aitxVar, null, 0, new kky(r8, number, number3, kjzVar2, qnVar2, bymVar, (afck) null, 0), 3);
                            return afak.a;
                        }
                        int i7 = kkz.a;
                        bym bymVar2 = r13;
                        qn qnVar3 = qnVar;
                        kjz kjzVar3 = kjzVar;
                        Number number4 = number2;
                        ahnc.d(aitxVar, null, 0, new kky(r8, number, number4, kjzVar3, qnVar3, bymVar2, null, 1, null), 3);
                        return afak.a;
                    }
                };
                buxVar.x(afdrVar);
                objG = afdrVar;
            }
            til tilVarY = std.y(carIconX, (afdr) objG, Boolean.valueOf(iA > 0), buxVar);
            buxVar.o();
            return tilVarY;
        }
        if (i == 1) {
            ato atoVar = (ato) obj;
            bux buxVar2 = (bux) obj2;
            int iIntValue = ((Integer) obj3).intValue();
            atoVar.getClass();
            if ((iIntValue & 6) == 0) {
                iIntValue |= true != buxVar2.C(atoVar) ? 2 : 4;
            }
            if (buxVar2.I((iIntValue & 19) != 18, iIntValue & 1)) {
                Object objF = buxVar2.f(dbc.i);
                dlr dlrVar = dlr.a;
                hjo hjoVar = (hjo) buxVar2.f(hjp.a);
                if (objF == dlrVar && hjoVar.a(hjn.b, hjm.b)) {
                    z = true;
                }
                Object obj8 = this.c;
                Object obj9 = this.e;
                ?? r15 = this.b;
                Object obj10 = this.a;
                Object obj11 = this.d;
                Object obj12 = this.g;
                Object obj13 = this.f;
                cct cctVarI = bxc.i(170257964, true, new brf(atoVar, ady.a(gny.a(hjoVar), null, "mapContentMaxWidth", null, buxVar2, 384, 10), obj10, 7), buxVar2);
                cct cctVarI2 = bxc.i(2064727433, true, new bly(r15, 20), buxVar2);
                cct cctVarI3 = bxc.i(-65971708, true, new gqd(z, (hju) r15, obj9, i2), buxVar2);
                cct cctVarI4 = bxc.i(960901948, true, new gsl(obj8, i2), buxVar2);
                if (z) {
                    buxVar2.v(1390670982);
                    hfz.a(null, (hge) obj13, (hga) obj12, (hgc) obj11, cctVarI, cctVarI3, cctVarI2, cctVarI4, buxVar2, 14376960, 1);
                    buxVar2.o();
                } else {
                    buxVar2.v(1391025033);
                    hft.a(null, (hge) obj13, (hga) obj12, (hgc) obj11, cctVarI, bxc.i(-1414653774, true, new bmc(cctVarI2, cctVarI3, 16), buxVar2), cctVarI4, buxVar2, 1794048, 1);
                    buxVar2.o();
                }
            } else {
                buxVar2.s();
            }
            return afak.a;
        }
        if (i != 2) {
            if (i != 3) {
                tjb tjbVar = (tjb) obj;
                bux buxVar3 = (bux) obj2;
                int iIntValue2 = ((Integer) obj3).intValue();
                int i5 = kkz.a;
                tjbVar.getClass();
                if ((iIntValue2 & 6) == 0) {
                    iIntValue2 |= true != ((iIntValue2 & 8) == 0 ? buxVar3.C(tjbVar) : buxVar3.E(tjbVar)) ? 2 : 4;
                }
                if (buxVar3.I((iIntValue2 & 19) != 18, iIntValue2 & 1)) {
                    tjb.a(new kks((kld) this.a, (Number) this.b, (aitx) this.c, (bym) this.d, (Number) this.e, (kjz) this.f, (qn) this.g, 0), buxVar3);
                } else {
                    buxVar3.s();
                }
                return afak.a;
            }
            tjb tjbVar2 = (tjb) obj;
            bux buxVar4 = (bux) obj2;
            int iIntValue3 = ((Integer) obj3).intValue();
            int i6 = kkz.a;
            tjbVar2.getClass();
            if ((iIntValue3 & 6) == 0) {
                iIntValue3 |= true != ((iIntValue3 & 8) == 0 ? buxVar4.C(tjbVar2) : buxVar4.E(tjbVar2)) ? 2 : 4;
            }
            if (buxVar4.I((iIntValue3 & 19) != 18, iIntValue3 & 1)) {
                tjb.a(new kks((kld) this.a, (Number) this.b, (aitx) this.c, (bym) this.d, (Number) this.e, (kjz) this.f, (qn) this.g, 2), buxVar4);
            } else {
                buxVar4.s();
            }
            return afak.a;
        }
        bux buxVar5 = (bux) obj2;
        ((Integer) obj3).intValue();
        final ?? r132 = this.d;
        int i7 = kkz.a;
        ((til) obj).getClass();
        buxVar5.v(2042162082);
        CarIcon carIconX2 = std.x(R.drawable.gs_add_vd_theme_24, buxVar5);
        Object obj14 = this.b;
        final ?? r82 = this.a;
        final Number number3 = (Number) obj14;
        int iA2 = r82.a(kkz.a(r132), number3);
        final ?? r72 = this.c;
        boolean zE5 = buxVar5.E(r72) | buxVar5.E(r82) | buxVar5.C(r132);
        Object obj15 = this.e;
        boolean zE6 = buxVar5.E(obj14) | zE5 | buxVar5.E(obj15);
        Object obj16 = this.f;
        boolean zE7 = zE6 | buxVar5.E(obj16);
        Object obj17 = this.g;
        boolean zE8 = zE7 | buxVar5.E(obj17);
        Object objG2 = buxVar5.g();
        if (zE8 || objG2 == buw.a) {
            final qn qnVar2 = (qn) obj17;
            final kjz kjzVar2 = (kjz) obj16;
            final Number number4 = (Number) obj15;
            final int i8 = 0;
            afdr afdrVar2 = new afdr() { // from class: kkv
                @Override // defpackage.afdr
                public final Object invoke() {
                    int i52 = i8;
                    aitx aitxVar = r72;
                    if (i52 != 0) {
                        int i62 = kkz.a;
                        bym bymVar = r132;
                        qn qnVar22 = qnVar2;
                        kjz kjzVar22 = kjzVar2;
                        Number number32 = number3;
                        ahnc.d(aitxVar, null, 0, new kky(r82, number4, number32, kjzVar22, qnVar22, bymVar, (afck) null, 0), 3);
                        return afak.a;
                    }
                    int i72 = kkz.a;
                    bym bymVar2 = r132;
                    qn qnVar3 = qnVar2;
                    kjz kjzVar3 = kjzVar2;
                    Number number42 = number3;
                    ahnc.d(aitxVar, null, 0, new kky(r82, number4, number42, kjzVar3, qnVar3, bymVar2, null, 1, null), 3);
                    return afak.a;
                }
            };
            buxVar5.x(afdrVar2);
            objG2 = afdrVar2;
        }
        til tilVarY2 = std.y(carIconX2, (afdr) objG2, Boolean.valueOf(iA2 < 0), buxVar5);
        buxVar5.o();
        return tilVarY2;
    }

    public /* synthetic */ kks(kld kldVar, Number number, aitx aitxVar, bym bymVar, Number number2, kjz kjzVar, qn qnVar, int i) {
        this.h = i;
        this.a = kldVar;
        this.b = number;
        this.c = aitxVar;
        this.d = bymVar;
        this.e = number2;
        this.f = kjzVar;
        this.g = qnVar;
    }
}
