package defpackage;

import com.google.android.projection.gearhead.R;

/* loaded from: classes2.dex */
public final /* synthetic */ class dne implements afeg {
    private final /* synthetic */ int a;

    public /* synthetic */ dne(int i) {
        this.a = i;
    }

    @Override // defpackage.afeg
    public final Object invoke(Object obj, Object obj2) {
        int i = 0;
        switch (this.a) {
            case 0:
                return roc.an((bux) obj, ((Integer) obj2).intValue());
            case 1:
                dms dmsVarA = dmj.a((cxb) obj);
                int iOrdinal = ((dlr) obj2).ordinal();
                if (iOrdinal != 0) {
                    if (iOrdinal != 1) {
                        throw new aezs();
                    }
                    i = 1;
                }
                dmsVarA.setLayoutDirection(i);
                return afak.a;
            case 2:
                return roc.an((bux) obj, ((Integer) obj2).intValue());
            case 3:
                return ((vo) obj2).a;
            case 4:
                bux buxVar = (bux) obj;
                ((Integer) obj2).intValue();
                fwx fwxVar = fwx.a;
                buxVar.v(1053231096);
                fxe fxeVar = fxe.d;
                buxVar.o();
                return fxeVar;
            case 5:
                bux buxVar2 = (bux) obj;
                ((Integer) obj2).intValue();
                fwx fwxVar2 = fwx.a;
                buxVar2.v(-2048717044);
                fxe fxeVar2 = fxe.c;
                buxVar2.o();
                return fxeVar2;
            case 6:
                bux buxVar3 = (bux) obj;
                ((Integer) obj2).intValue();
                fwx fwxVar3 = fwx.a;
                buxVar3.v(1017697016);
                fxe fxeVar3 = fxe.b;
                buxVar3.o();
                return fxeVar3;
            case 7:
                bux buxVar4 = (bux) obj;
                ((Integer) obj2).intValue();
                fwx fwxVar4 = fwx.a;
                buxVar4.v(-929736091);
                ajh ajhVarE = fww.e(0L, buxVar4, 1);
                buxVar4.o();
                return ajhVarE;
            case 8:
                bux buxVar5 = (bux) obj;
                ((Integer) obj2).intValue();
                fwx fwxVar5 = fwx.a;
                buxVar5.v(-1956880895);
                fxe fxeVar4 = fxe.a;
                buxVar5.o();
                return fxeVar4;
            case 9:
                bux buxVar6 = (bux) obj;
                ((Integer) obj2).intValue();
                fwx fwxVar6 = fwx.a;
                buxVar6.v(-1668728925);
                fxe fxeVar5 = fxe.e;
                buxVar6.o();
                return fxeVar5;
            case 10:
                bux buxVar7 = (bux) obj;
                ((Integer) obj2).intValue();
                fwx fwxVar7 = fwx.a;
                buxVar7.v(-721844420);
                bcm bcmVar = gux.f(buxVar7).a.d;
                buxVar7.o();
                return bcmVar;
            case 11:
                bux buxVar8 = (bux) obj;
                ((Integer) obj2).intValue();
                fwx fwxVar8 = fwx.a;
                buxVar8.v(-2100050770);
                fxe fxeVar6 = fxe.f;
                buxVar8.o();
                return fxeVar6;
            case 12:
                bux buxVar9 = (bux) obj;
                ((Integer) obj2).intValue();
                fwx fwxVar9 = fwx.a;
                buxVar9.v(-2004775647);
                ajh ajhVarE2 = fww.e(gux.c(buxVar9).B(), buxVar9, 0);
                buxVar9.o();
                return ajhVarE2;
            case 13:
                bux buxVar10 = (bux) obj;
                ((Integer) obj2).intValue();
                fwx fwxVar10 = fwx.a;
                buxVar10.v(-1339676259);
                fxe fxeVar7 = fxe.a;
                buxVar10.o();
                return fxeVar7;
            case 14:
                bux buxVar11 = (bux) obj;
                int iIntValue = ((Integer) obj2).intValue();
                if (buxVar11.I((iIntValue & 3) != 2, iIntValue & 1)) {
                    boc.a(dao.b(R.drawable.gs_keyboard_arrow_up_vd_24, buxVar11, 0), null, awd.i(cfy.e, gux.g(buxVar11).d.d), 0L, buxVar11, 56, 8);
                } else {
                    buxVar11.s();
                }
                return afak.a;
            case 15:
                bux buxVar12 = (bux) obj;
                int iIntValue2 = ((Integer) obj2).intValue();
                if (buxVar12.I((iIntValue2 & 3) != 2, iIntValue2 & 1)) {
                    boc.a(dao.b(R.drawable.gs_keyboard_arrow_down_vd_24, buxVar12, 0), null, awd.i(cfy.e, gux.g(buxVar12).d.d), 0L, buxVar12, 56, 8);
                } else {
                    buxVar12.s();
                }
                return afak.a;
            case 16:
                return roc.an((bux) obj, ((Integer) obj2).intValue());
            case 17:
                return roc.an((bux) obj, ((Integer) obj2).intValue());
            case 18:
                return Integer.valueOf(((fvd) obj).a.compareTo(((fvd) obj2).a));
            case 19:
                return roc.an((bux) obj, ((Integer) obj2).intValue());
            default:
                bux buxVar13 = (bux) obj;
                ((Integer) obj2).intValue();
                hdi hdiVar = hdi.a;
                buxVar13.v(-41132156);
                hed hedVar = gux.d(buxVar13).b.c;
                buxVar13.o();
                return hedVar.c;
        }
    }
}
