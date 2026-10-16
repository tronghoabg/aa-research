package defpackage;

import android.content.res.Resources;
import androidx.compose.runtime.snapshots.SnapshotStateList;
import java.util.List;

/* loaded from: classes2.dex */
final class nxh implements afeh {
    final /* synthetic */ int a;
    final /* synthetic */ List b;
    final /* synthetic */ nuh c;
    final /* synthetic */ boolean d;
    final /* synthetic */ SnapshotStateList e;

    public nxh(int i, List list, nuh nuhVar, boolean z, SnapshotStateList snapshotStateList) {
        this.a = i;
        this.b = list;
        this.c = nuhVar;
        this.d = z;
        this.e = snapshotStateList;
    }

    @Override // defpackage.afeh
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) throws Resources.NotFoundException {
        bux buxVar = (bux) obj2;
        int iIntValue = ((Number) obj3).intValue();
        ((avx) obj).getClass();
        int i = iIntValue & 17;
        if (buxVar.I(i != 16, iIntValue & 1)) {
            int i2 = this.a;
            boolean zA = buxVar.A(i2);
            List list = this.b;
            boolean zC = zA | buxVar.C(list);
            Object objG = buxVar.g();
            if (zC || objG == buw.a) {
                nxg nxgVar = new nxg(i2, list);
                lah lahVar = byj.a;
                objG = new bvk(nxgVar, null);
                buxVar.x(objG);
            }
            nuh nuhVar = this.c;
            boolean z = i2 == 0;
            boolean zBooleanValue = ((Boolean) ((bym) objG).a()).booleanValue();
            boolean zE = buxVar.E(nuhVar);
            SnapshotStateList snapshotStateList = this.e;
            Object objG2 = buxVar.g();
            if (zE || objG2 == buw.a) {
                objG2 = new nxf(snapshotStateList, nuhVar, 0);
                buxVar.x(objG2);
            }
            mcd.I(nuhVar.c, z, zBooleanValue, (afdr) objG2, this.d, null, buxVar, 0);
        } else {
            buxVar.s();
        }
        return afak.a;
    }
}
