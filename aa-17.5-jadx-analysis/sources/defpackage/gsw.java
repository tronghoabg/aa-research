package defpackage;

import androidx.car.app.model.CarColor;
import androidx.car.app.model.CarIcon;
import androidx.car.app.model.CarText;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes2.dex */
public final class gsw extends afde implements afeh {
    int a;
    /* synthetic */ Object b;
    final /* synthetic */ gsx c;
    private /* synthetic */ Object d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gsw(afck afckVar, gsx gsxVar) {
        super(3, afckVar);
        this.c = gsxVar;
    }

    /* JADX WARN: Type inference failed for: r2v1, types: [aiyl, java.lang.Object] */
    @Override // defpackage.afcy
    public final Object hT(Object obj) throws Throwable {
        goz gozVarE;
        afdr afdrVar;
        fwm fwmVarD;
        gud gudVar;
        CharSequence charSequenceC;
        gtw gtwVar;
        gtf gtfVar;
        gtl gtlVar;
        gva gvaVarF;
        boolean z;
        gva gvaVar;
        geu geuVar;
        gua guaVar;
        geu geuVar2;
        gab gabVarE;
        fwm fwmVarD2;
        gud gudVar2;
        gtf gtfVar2;
        gta gtaVar;
        Long lValueOf;
        Iterator it;
        gva gvaVar2;
        Long l;
        gfg gfgVar;
        gte gteVar;
        boolean z2;
        geu geuVar3;
        fwm fwmVarH;
        afcr afcrVar = afcr.a;
        int i = this.a;
        woy.dF(obj);
        if (i == 0) {
            ?? r2 = this.d;
            Object[] objArr = (Object[]) this.b;
            Object obj2 = objArr[0];
            Object obj3 = objArr[1];
            Object obj4 = objArr[2];
            Object obj5 = objArr[3];
            Object obj6 = objArr[4];
            Object obj7 = objArr[5];
            boolean zBooleanValue = ((Boolean) objArr[6]).booleanValue();
            hgc hgcVar = (hgc) obj7;
            gzc gzcVar = (gzc) obj6;
            gid gidVar = (gid) obj5;
            gtb gtbVar = (gtb) obj4;
            gta gtaVar2 = (gta) obj3;
            gtn gtnVar = (gtn) obj2;
            gsx gsxVar = this.c;
            gts gtsVarD = gsxVar.d();
            gtnVar.getClass();
            if (!affa.f(gtnVar, gtsVarD.d)) {
                gtsVarD.d = gtnVar;
                gtsVarD.a();
                gtsVarD.b();
            }
            geu geuVar4 = gsxVar.a;
            gor gorVar = gtnVar.c;
            hga hgaVarC = hgg.c(geuVar4, gzcVar);
            gidVar.getClass();
            hgcVar.getClass();
            gzcVar.getClass();
            boolean z3 = geuVar4.b().getDisplayType() == 1;
            if (z3 || gzcVar.a()) {
                boolean z4 = !z3 || zBooleanValue;
                if (z3) {
                    gozVarE = null;
                } else {
                    gozVarE = gjs.e(gorVar, geuVar4, gidVar == gid.a, true);
                }
                if (z3) {
                    afdrVar = null;
                } else if (gtaVar2 != null) {
                    afdrVar = gtaVar2.c;
                } else {
                    afdrVar = null;
                    gtaVar2 = null;
                }
                gva gvaVarF2 = (!z4 || gtaVar2 == null || (gtlVar = gtaVar2.b) == null) ? null : gum.f(gtlVar, geuVar4, true);
                gth gthVar = (gtaVar2 == null || (gtfVar = gtaVar2.a) == null) ? null : gtfVar.a;
                int i2 = (gozVarE != null ? gozVarE.e : null) == null ? 2 : 3;
                if (gthVar == null) {
                    gudVar = null;
                } else {
                    gub gubVarB = guc.b(gthVar);
                    jvb jvbVarG = geuVar4.d().g();
                    gfa gfaVar = gubVarB.a;
                    deu deuVar = gubVarB.b;
                    CarColor carColor = gubVarB.c;
                    hjw hjwVarG = carColor != null ? gzw.g(carColor, jvbVarG) : null;
                    deu deuVar2 = gubVarB.d;
                    CarColor carColor2 = gubVarB.e;
                    hjw hjwVarG2 = carColor2 != null ? gzw.g(carColor2, jvbVarG) : null;
                    CarText carText = gthVar.b;
                    gfs gfsVarB = gey.b((carText == null || (charSequenceC = hlb.c(carText)) == null) ? null : charSequenceC.toString());
                    if (afdrVar != null) {
                        fwmVarD = guc.e(geuVar4) ? guc.d(geuVar4, afdrVar, false) : guc.c(geuVar4, afdrVar, false);
                    } else {
                        fwmVarD = null;
                    }
                    gudVar = new gud(gfaVar, deuVar, hjwVarG, deuVar2, hjwVarG2, gfsVarB, null, fwmVarD, i2, false, 576);
                }
                gtwVar = new gtw(gvaVarF2, null, gudVar, gozVarE, hgaVarC, hgcVar, true, 34);
            } else {
                goz gozVarE2 = gjs.e(gorVar, geuVar4, gidVar == gid.a, false);
                boolean z5 = gtbVar != null;
                if (gtaVar2 != null) {
                    gtl gtlVar2 = gtaVar2.b;
                    gvaVarF = gtlVar2 != null ? gum.f(gtlVar2, geuVar4, z5) : null;
                } else {
                    gvaVarF = null;
                    gtaVar2 = null;
                }
                if (gtbVar != null) {
                    boolean zF = ((ggk) geuVar4.F(ggk.class)).f();
                    gte gteVar2 = gtbVar.d;
                    boolean z6 = gteVar2 instanceof gtc;
                    if (z6) {
                        gtaVar = gtaVar2;
                        lValueOf = Long.valueOf(((gtc) gteVar2).a);
                    } else {
                        gtaVar = gtaVar2;
                        lValueOf = null;
                    }
                    gfg gfgVarC = gey.c(geuVar4, gtbVar.a);
                    gfg gfgVarC2 = gey.c(geuVar4, gtbVar.b);
                    fzy fzyVar = gtbVar.c;
                    gab gabVarE2 = fzyVar != null ? fxy.e(fzyVar, geuVar4) : null;
                    List list = gtbVar.e;
                    z = z5;
                    ArrayList arrayList = new ArrayList(woy.bp(list, 10));
                    Iterator it2 = list.iterator();
                    while (it2.hasNext()) {
                        fvu fvuVar = (fvu) it2.next();
                        if (z6 && fvuVar.a()) {
                            afdr afdrVarC = gtz.c(gteVar2);
                            afdrVarC.getClass();
                            it = it2;
                            float fFloatValue = ((Number) afdrVarC.invoke()).floatValue();
                            gvaVar2 = gvaVarF;
                            lValueOf.getClass();
                            l = lValueOf;
                            gfgVar = gfgVarC;
                            gteVar = gteVar2;
                            z2 = z6;
                            geuVar3 = geuVar4;
                            fwmVarH = fvr.h(fvl.b(fvuVar, new fvw((int) l.longValue(), (int) (fFloatValue * l.longValue()), false, 9), zF), geuVar3, null, false, null, null, null, false, 0, 254);
                        } else {
                            it = it2;
                            gvaVar2 = gvaVarF;
                            l = lValueOf;
                            gfgVar = gfgVarC;
                            gteVar = gteVar2;
                            z2 = z6;
                            geuVar3 = geuVar4;
                            fwmVarH = fvr.h(fvuVar, geuVar3, null, false, fwh.c, null, null, false, 0, 246);
                        }
                        arrayList.add(fwmVarH);
                        geuVar4 = geuVar3;
                        gteVar2 = gteVar;
                        it2 = it;
                        gvaVarF = gvaVar2;
                        lValueOf = l;
                        gfgVarC = gfgVar;
                        z6 = z2;
                    }
                    gvaVar = gvaVarF;
                    geuVar = geuVar4;
                    gua guaVar2 = new gua(gfgVarC, gfgVarC2, lValueOf, gtz.c(gteVar2), gabVarE2, arrayList);
                    gtaVar2 = gtaVar;
                    guaVar = guaVar2;
                } else {
                    z = z5;
                    gvaVar = gvaVarF;
                    geuVar = geuVar4;
                    guaVar = null;
                }
                gth gthVar2 = (gtaVar2 == null || (gtfVar2 = gtaVar2.a) == null) ? null : gtfVar2.a;
                afdr afdrVar2 = gtaVar2 != null ? gtaVar2.c : null;
                if (gthVar2 == null) {
                    gudVar2 = null;
                } else {
                    gub gubVarB2 = guc.b(gthVar2);
                    if (geuVar.i().c() < 8) {
                        afdrVar2 = null;
                    }
                    jvb jvbVarG2 = geuVar.d().g();
                    gfa gfaVar2 = gubVarB2.a;
                    deu deuVar3 = gubVarB2.b;
                    CarColor carColor3 = gubVarB2.c;
                    hjw hjwVarG3 = carColor3 != null ? gzw.g(carColor3, jvbVarG2) : null;
                    deu deuVar4 = gubVarB2.d;
                    CarColor carColor4 = gubVarB2.e;
                    hjw hjwVarG4 = carColor4 != null ? gzw.g(carColor4, jvbVarG2) : null;
                    gfa gfaVarK = fzc.k(gthVar2.b, geuVar);
                    CarIcon carIcon = gthVar2.a;
                    if (carIcon != null) {
                        geu geuVar5 = geuVar;
                        geuVar2 = geuVar5;
                        gabVarE = fxy.e(fxp.e(carIcon, geuVar5, new gqr(12), new gqr(13), null, 24), geuVar2);
                    } else {
                        geuVar2 = geuVar;
                        gabVarE = null;
                    }
                    if (afdrVar2 != null) {
                        fwmVarD2 = guc.e(geuVar2) ? guc.d(geuVar2, afdrVar2, true) : guc.c(geuVar2, afdrVar2, true);
                    } else {
                        fwmVarD2 = null;
                    }
                    gudVar2 = new gud(gfaVar2, deuVar3, hjwVarG3, deuVar4, hjwVarG4, gfaVarK, gabVarE, fwmVarD2, 0, z, 256);
                }
                gtwVar = new gtw(gvaVar, guaVar, gudVar2, gozVarE2, hgaVarC, hgcVar, false, 160);
            }
            this.a = 1;
            if (r2.a(gtwVar, this) == afcrVar) {
                return afcrVar;
            }
        }
        return afak.a;
    }

    @Override // defpackage.afeh
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
        gsw gswVar = new gsw((afck) obj3, this.c);
        gswVar.d = (aiyl) obj;
        gswVar.b = (Object[]) obj2;
        return gswVar.hT(afak.a);
    }
}
