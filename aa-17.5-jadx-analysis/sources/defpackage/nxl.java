package defpackage;

import androidx.compose.runtime.snapshots.SnapshotStateList;
import java.util.List;

/* loaded from: classes2.dex */
public final class nxl implements afei {
    final /* synthetic */ List a;
    final /* synthetic */ afec b;
    final /* synthetic */ List c;
    final /* synthetic */ boolean d;
    final /* synthetic */ SnapshotStateList e;
    final /* synthetic */ bwq f;

    public nxl(List list, afec afecVar, List list2, boolean z, SnapshotStateList snapshotStateList, bwq bwqVar) {
        this.a = list;
        this.b = afecVar;
        this.c = list2;
        this.d = z;
        this.e = snapshotStateList;
        this.f = bwqVar;
    }

    @Override // defpackage.afei
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
        int i;
        atm atmVar = (atm) obj;
        int iIntValue = ((Number) obj2).intValue();
        bux buxVar = (bux) obj3;
        int iIntValue2 = ((Number) obj4).intValue();
        if ((iIntValue2 & 6) == 0) {
            i = (true != buxVar.C(atmVar) ? 2 : 4) | iIntValue2;
        } else {
            i = iIntValue2;
        }
        if ((iIntValue2 & 48) == 0) {
            i |= true != buxVar.A(iIntValue) ? 16 : 32;
        }
        if (buxVar.I((i & 147) != 146, i & 1)) {
            nuh nuhVar = (nuh) this.a.get(iIntValue);
            buxVar.v(1217397427);
            sx sxVarF = tl.f(buxVar);
            List list = this.c;
            boolean z = this.d;
            SnapshotStateList snapshotStateList = this.e;
            tl.e(sxVarF, nwx.a, null, false, false, false, null, bxc.i(200921314, true, new nxh(iIntValue, list, nuhVar, z, snapshotStateList), buxVar), buxVar, 12582968, 124);
            String str = nuhVar.d;
            boolean zC = buxVar.C(str);
            Object objG = buxVar.g();
            if (zC || objG == buw.a) {
                nxf nxfVar = new nxf(snapshotStateList, nuhVar, 2);
                lah lahVar = byj.a;
                objG = new bvk(nxfVar, null);
                buxVar.x(objG);
            }
            yph yphVar = nxm.a;
            if (((Boolean) ((bym) objG).a()).booleanValue()) {
                buxVar.v(1218032430);
                boolean zE = buxVar.E(sxVarF);
                Object objG2 = buxVar.g();
                if (zE || objG2 == buw.a) {
                    objG2 = new nba(sxVarF, (afck) null, 6, (byte[]) null);
                    buxVar.x(objG2);
                }
                bvq.g(str, (afeg) objG2, buxVar);
                buxVar.o();
            } else {
                buxVar.v(1218168892);
                buxVar.o();
            }
            int iOrdinal = sxVarF.g().ordinal();
            if (iOrdinal == 0 || iOrdinal == 1) {
                buxVar.v(-653435524);
                afec afecVar = this.b;
                boolean zC2 = buxVar.C(afecVar) | buxVar.E(nuhVar);
                Object objG3 = buxVar.g();
                if (zC2 || objG3 == buw.a) {
                    gqj gqjVar = new gqj(afecVar, nuhVar, this.f, (afck) null, 5);
                    buxVar.x(gqjVar);
                    objG3 = gqjVar;
                }
                bvq.g(sxVarF, (afeg) objG3, buxVar);
                buxVar.o();
            } else {
                buxVar.v(1218561786);
                buxVar.o();
            }
            buxVar.o();
        } else {
            buxVar.s();
        }
        return afak.a;
    }
}
