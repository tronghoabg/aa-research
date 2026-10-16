package defpackage;

import androidx.compose.runtime.ParcelableSnapshotMutableState;

/* loaded from: classes.dex */
public final class bhl implements bhp {
    private final afej a;
    private final bii c = new bii((byte[]) null, (char[]) null);
    private final bwq b = new ParcelableSnapshotMutableState(null, bxp.c);

    public bhl(afej afejVar) {
        this.a = afejVar;
    }

    public final bhk a() {
        return (bhk) this.b.a();
    }

    @Override // defpackage.bhp
    public final Object b(bho bhoVar, afck afckVar) {
        Object objR = this.c.r(akq.a, new bgf(this, new bhk(bhoVar), (afck) null, 2), afckVar);
        return objR == afcr.a ? objR : afak.a;
    }

    public final void c(afdr afdrVar, bux buxVar, int i) {
        int i2;
        afdr afdrVar2;
        int i3 = i & 6;
        bux buxVarC = buxVar.c(723898654);
        if (i3 == 0) {
            i2 = (true != buxVarC.E(afdrVar) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= true != buxVarC.C(this) ? 16 : 32;
        }
        if (buxVarC.I((i2 & 19) != 18, i2 & 1)) {
            bhk bhkVarA = a();
            if (bhkVarA == null) {
                bxf bxfVarJ = buxVarC.J();
                if (bxfVarJ != null) {
                    bxfVarJ.c = new afz(this, afdrVar, i, 16);
                    return;
                }
                return;
            }
            afdrVar2 = afdrVar;
            this.a.invoke(bhkVarA, bhkVarA.a, afdrVar2, buxVarC, Integer.valueOf((i2 << 6) & 896));
        } else {
            afdrVar2 = afdrVar;
            buxVarC.s();
        }
        bxf bxfVarJ2 = buxVarC.J();
        if (bxfVarJ2 != null) {
            bxfVarJ2.c = new afz(this, afdrVar2, i, 17);
        }
    }

    public final void d(bhk bhkVar) {
        this.b.b(bhkVar);
    }
}
