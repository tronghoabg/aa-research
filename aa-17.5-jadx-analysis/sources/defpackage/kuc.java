package defpackage;

import com.google.android.libraries.maps.model.BitmapDescriptorFactory;
import java.util.Map;

/* loaded from: classes2.dex */
public final /* synthetic */ class kuc implements afeg {
    public final /* synthetic */ float a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;
    public final /* synthetic */ Object g;
    private final /* synthetic */ int h;

    public /* synthetic */ kuc(fwy fwyVar, cfy cfyVar, fxe fxeVar, ckv ckvVar, asf asfVar, float f, fxe fxeVar2, int i) {
        this.h = i;
        this.b = fwyVar;
        this.e = cfyVar;
        this.c = fxeVar;
        this.d = ckvVar;
        this.f = asfVar;
        this.a = f;
        this.g = fxeVar2;
    }

    /* JADX WARN: Type inference failed for: r13v0, types: [ase, asf, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v2, types: [java.lang.Object, java.util.Map] */
    /* JADX WARN: Type inference failed for: r6v5, types: [ckv, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v4, types: [cfy, java.lang.Object] */
    @Override // defpackage.afeg
    public final Object invoke(Object obj, Object obj2) {
        if (this.h == 0) {
            bux buxVar = (bux) obj;
            int iIntValue = ((Integer) obj2).intValue();
            if (buxVar.I((iIntValue & 3) != 2, iIntValue & 1)) {
                ?? r4 = this.g;
                Object obj3 = this.f;
                Object obj4 = this.e;
                Object obj5 = this.d;
                Object obj6 = this.c;
                float f = this.a;
                ksy ksyVar = (ksy) obj5;
                deu deuVar = (deu) obj4;
                cmw cmwVar = (cmw) obj3;
                jyw.h(ksyVar, deuVar, cmwVar, r4, ckq.a, (ktf) this.b, buxVar);
                jyw.h(ksyVar, deuVar, cmwVar, r4, new kuf(f, 0), (ktf) obj6, buxVar);
            } else {
                buxVar.s();
            }
            return afak.a;
        }
        bux buxVar2 = (bux) obj;
        int iIntValue2 = ((Integer) obj2).intValue();
        if (buxVar2.I((iIntValue2 & 3) != 2, iIntValue2 & 1)) {
            final fwy fwyVar = (fwy) this.b;
            afdr afdrVar = fwyVar.d;
            if (afdrVar == null) {
                buxVar2.v(317015586);
                Object objG = buxVar2.g();
                if (objG == buw.a) {
                    objG = new fwp(3);
                    buxVar2.x(objG);
                }
                afdrVar = (afdr) objG;
            } else {
                buxVar2.v(-1236700610);
            }
            buxVar2.o();
            afdr afdrVar2 = afdrVar;
            ?? r13 = this.f;
            ?? r6 = this.d;
            Object obj7 = this.c;
            cfy cfyVarA = fww.a(this.e);
            final fxe fxeVar = (fxe) obj7;
            long j = ((cjv) fxeVar.j.invoke(buxVar2, 0)).a;
            long j2 = ((cjv) fxeVar.k.invoke(buxVar2, 0)).a;
            float f2 = gux.g(buxVar2).f.c;
            ggi ggiVar = new ggi(f2, f2, f2);
            float f3 = (gux.g(buxVar2).f.c - 1.0f) + BitmapDescriptorFactory.HUE_RED;
            cfy cfyVarA2 = ggh.a(cfyVarA, r6, j, j2, ggiVar, new ggi(f3, f3, f3), r13, false, false, buxVar2, 1572864, 192);
            Object objG2 = buxVar2.g();
            if (objG2 == buw.a) {
                objG2 = new ewc(15);
                buxVar2.x(objG2);
            }
            Object obj8 = this.g;
            final float f4 = this.a;
            final fxe fxeVar2 = (fxe) obj8;
            bqp.c(afdrVar2, dds.a(cfyVarA2, false, (afec) objG2), false, r6, 0L, 0L, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, null, r13, bxc.i(-230353325, true, new afeg() { // from class: fws
                @Override // defpackage.afeg
                public final Object invoke(Object obj9, Object obj10) {
                    bux buxVar3 = (bux) obj9;
                    int iIntValue3 = ((Integer) obj10).intValue();
                    int i = iIntValue3 & 3;
                    if (buxVar3.I(i != 2, iIntValue3 & 1)) {
                        fwy fwyVar2 = fwyVar;
                        fwt.b(fwyVar2, ckq.a, fxeVar, buxVar3);
                        if (fwyVar2.e) {
                            fxe fxeVar3 = fxeVar2;
                            float f5 = f4;
                            buxVar3.v(901988005);
                            fwt.b(fwyVar2, new kuf(f5, 1), fxeVar3, buxVar3);
                            buxVar3.o();
                        } else {
                            buxVar3.v(902120623);
                            buxVar3.o();
                        }
                    } else {
                        buxVar3.s();
                    }
                    return afak.a;
                }
            }, buxVar2), buxVar2, 500);
        } else {
            buxVar2.s();
        }
        return afak.a;
    }

    public /* synthetic */ kuc(ktf ktfVar, float f, ktf ktfVar2, ksy ksyVar, deu deuVar, cmw cmwVar, Map map, int i) {
        this.h = i;
        this.b = ktfVar;
        this.a = f;
        this.c = ktfVar2;
        this.d = ksyVar;
        this.e = deuVar;
        this.f = cmwVar;
        this.g = map;
    }
}
