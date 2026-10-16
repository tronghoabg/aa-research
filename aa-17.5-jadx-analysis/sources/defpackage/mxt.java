package defpackage;

import com.google.android.libraries.maps.model.BitmapDescriptorFactory;

/* loaded from: classes.dex */
public final /* synthetic */ class mxt implements afeh {
    public final /* synthetic */ long a;
    private final /* synthetic */ int b;

    public /* synthetic */ mxt(long j, int i) {
        this.b = i;
        this.a = j;
    }

    @Override // defpackage.afeh
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        int i = this.b;
        if (i == 0) {
            bux buxVar = (bux) obj2;
            int iIntValue = ((Integer) obj3).intValue();
            yph yphVar = myi.a;
            ((nbl) obj).getClass();
            int i2 = iIntValue & 17;
            if (buxVar.I(i2 != 16, iIntValue & 1)) {
                long j = this.a;
                cfy cfyVarK = awd.k(asl.I(cfy.e, BitmapDescriptorFactory.HUE_RED, 5.0f), 200.0f, 20.0f);
                boolean zB = buxVar.B(j);
                Object objG = buxVar.g();
                if (zB || objG == buw.a) {
                    objG = new mxl(j, z ? 1 : 0);
                    buxVar.x(objG);
                }
                afp.z(cfyVarK, (afec) objG, buxVar, 6);
            } else {
                buxVar.s();
            }
            return afak.a;
        }
        if (i == 1) {
            atm atmVar = (atm) obj;
            bux buxVar2 = (bux) obj2;
            int iIntValue2 = ((Integer) obj3).intValue();
            atmVar.getClass();
            if ((iIntValue2 & 6) == 0) {
                iIntValue2 |= true == buxVar2.C(atmVar) ? 4 : 2;
            }
            if (buxVar2.I((iIntValue2 & 19) != 18, iIntValue2 & 1)) {
                ca.bb(new cmv(this.a), null, cjn.g(atmVar.b(cfy.e), BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, kst.a.b, true, 0, 1042431), null, csh.a, BitmapDescriptorFactory.HUE_RED, null, buxVar2, 24632, 104);
            } else {
                buxVar2.s();
            }
            return afak.a;
        }
        bux buxVar3 = (bux) obj2;
        int iIntValue3 = ((Integer) obj3).intValue();
        yph yphVar2 = myi.a;
        ((uxc) obj).getClass();
        if (buxVar3.I((iIntValue3 & 17) != 16, iIntValue3 & 1)) {
            long j2 = this.a;
            cfy cfyVarK2 = awd.k(asl.I(cfy.e, BitmapDescriptorFactory.HUE_RED, 5.0f), 164.0f, 20.0f);
            boolean zB2 = buxVar3.B(j2);
            Object objG2 = buxVar3.g();
            if (zB2 || objG2 == buw.a) {
                objG2 = new mxl(j2, i);
                buxVar3.x(objG2);
            }
            afp.z(cfyVarK2, (afec) objG2, buxVar3, 6);
        } else {
            buxVar3.s();
        }
        return afak.a;
    }
}
