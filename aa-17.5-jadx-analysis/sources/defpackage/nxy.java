package defpackage;

import com.google.android.apps.auto.components.graphics.icon.GhIcon;

/* loaded from: classes2.dex */
public final /* synthetic */ class nxy implements afeh {
    public final /* synthetic */ boolean a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ int c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    private final /* synthetic */ int f;

    public /* synthetic */ nxy(String str, boolean z, boolean z2, String str2, int i, int i2) {
        this.f = i2;
        this.d = str;
        this.a = z;
        this.b = z2;
        this.e = str2;
        this.c = i;
    }

    @Override // defpackage.afeh
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        dfw dfwVarV;
        bux buxVar;
        ktf ktfVarJ;
        boolean z;
        afdr afdrVar;
        ktf ktfVar;
        boolean z2;
        if (this.f == 0) {
            lxw lxwVar = (lxw) obj;
            bux buxVar2 = (bux) obj2;
            int iIntValue = ((Integer) obj3).intValue();
            lxwVar.getClass();
            if ((iIntValue & 6) == 0) {
                iIntValue |= true == ((iIntValue & 8) == 0 ? buxVar2.C(lxwVar) : buxVar2.E(lxwVar)) ? 4 : 2;
            }
            if (buxVar2.I((iIntValue & 19) != 18, iIntValue & 1)) {
                int i = this.c;
                Object obj4 = this.e;
                if (true != this.b) {
                    obj4 = null;
                }
                if (i > 0) {
                    buxVar2.v(-576907389);
                    dfwVarV = dfw.v(czz.av(buxVar2).e, 0L, 0L, die.l, null, null, null, 0L, null, 0, 0, 0L, null, null, 16777211);
                    buxVar2.o();
                } else {
                    buxVar2.v(-576785528);
                    dfwVarV = czz.av(buxVar2).e;
                    buxVar2.o();
                }
                lxwVar.e((String) this.d, null, this.a, (String) obj4, dfwVarV, buxVar2, 458752 & (iIntValue << 15), 2);
            } else {
                buxVar2.s();
            }
            return afak.a;
        }
        cfy cfyVar = (cfy) obj;
        bux buxVar3 = (bux) obj2;
        int iIntValue2 = ((Integer) obj3).intValue();
        cfyVar.getClass();
        if ((iIntValue2 & 6) == 0) {
            iIntValue2 |= true != buxVar3.C(cfyVar) ? 2 : 4;
        }
        if (buxVar3.I((iIntValue2 & 19) != 18, iIntValue2 & 1)) {
            Object obj5 = this.e;
            boolean zE = buxVar3.E(obj5);
            Object objG = buxVar3.g();
            if (zE || objG == buw.a) {
                objG = new nxb(obj5, 5);
                buxVar3.x(objG);
            }
            boolean z3 = this.a;
            Object obj6 = this.d;
            nul nulVar = (nul) obj5;
            Object obj7 = objG;
            String str = nulVar.b;
            int i2 = nulVar.e;
            afdr afdrVar2 = (afdr) obj7;
            if (i2 == 6 && lxr.s()) {
                buxVar3.v(315490613);
                aezr aezrVar = ktf.a;
                buxVar = buxVar3;
                ktfVarJ = kgq.e(cjn.i(0), kfn.i(buxVar3).s(), 0L, 0L, 0L, 0L, 0L, buxVar, 252);
                buxVar.o();
            } else if (obj6 != null && ((GhIcon) obj6).t()) {
                buxVar3.v(315824545);
                aezr aezrVar2 = ktf.a;
                buxVar = buxVar3;
                ktfVarJ = kgq.e(ksp.j(krr.w, buxVar3), ksp.j(krr.v, buxVar3), 0L, 0L, 0L, 0L, 0L, buxVar, 252);
                buxVar.o();
            } else if (z3 && i2 == 4) {
                i2 = 4;
                buxVar3.v(315824545);
                aezr aezrVar22 = ktf.a;
                buxVar = buxVar3;
                ktfVarJ = kgq.e(ksp.j(krr.w, buxVar3), ksp.j(krr.v, buxVar3), 0L, 0L, 0L, 0L, 0L, buxVar, 252);
                buxVar.o();
            } else {
                buxVar3.v(316036120);
                aezr aezrVar3 = ktf.a;
                buxVar = buxVar3;
                ktfVarJ = kgq.j(0L, 0L, 0L, 0L, buxVar, 255);
                buxVar.o();
            }
            if ((!this.b || obj6 == null) && this.c < 2) {
                z = z3;
                afdrVar = afdrVar2;
                ktfVar = ktfVarJ;
                z2 = true;
            } else {
                z = z3;
                afdrVar = afdrVar2;
                ktfVar = ktfVarJ;
                z2 = false;
            }
            lxw.d(afdrVar, str, (GhIcon) obj6, ktfVar, z2, cfyVar, z && i2 == 4, buxVar, (iIntValue2 << 15) & 458752, 0);
        } else {
            buxVar3.s();
        }
        return afak.a;
    }

    public /* synthetic */ nxy(nul nulVar, GhIcon ghIcon, boolean z, boolean z2, int i, int i2) {
        this.f = i2;
        this.e = nulVar;
        this.d = ghIcon;
        this.a = z;
        this.b = z2;
        this.c = i;
    }
}
