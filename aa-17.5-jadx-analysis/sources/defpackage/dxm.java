package defpackage;

import android.content.Context;
import android.database.sqlite.SQLiteCursor;
import android.database.sqlite.SQLiteCursorDriver;
import android.database.sqlite.SQLiteQuery;
import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.apps.auto.components.graphics.icon.GhIcon;
import com.google.android.apps.auto.components.media.compat.AaPlaybackState;
import com.google.android.libraries.maps.model.BitmapDescriptorFactory;
import java.util.List;
import java.util.Set;

/* loaded from: classes2.dex */
public final /* synthetic */ class dxm implements afei {
    public final /* synthetic */ Object a;
    private final /* synthetic */ int b;

    public /* synthetic */ dxm(Object obj, int i) {
        this.b = i;
        this.a = obj;
    }

    /* JADX WARN: Type inference failed for: r0v16, types: [afei, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v4, types: [dxz, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v8, types: [dyi, java.lang.Object] */
    @Override // defpackage.afei
    public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4) throws RemoteException {
        int i;
        int i2;
        int i3;
        int i4;
        byte[] bArr = null;
        switch (this.b) {
            case 0:
                aitx aitxVar = (aitx) obj;
                sm smVar = (sm) obj4;
                aitxVar.getClass();
                ((Set) obj2).getClass();
                ((String) obj3).getClass();
                smVar.getClass();
                aimr.d(new hcg(((dxs) this.a).d, new dxp(smVar, null, 0, null), 16), aitxVar);
                smVar.a.a();
                return afak.a;
            case 1:
                aitx aitxVar2 = (aitx) obj;
                ((Integer) obj2).intValue();
                sm smVar2 = (sm) obj4;
                aitxVar2.getClass();
                ((Set) obj3).getClass();
                smVar2.getClass();
                fkw fkwVar = new fkw(smVar2, (afck) null, 1);
                dxs dxsVar = (dxs) this.a;
                aimr.d(new hcg(dxsVar.e, fkwVar, 16), aitxVar2);
                smVar2.a.a(new dye(dxsVar));
                return afak.a;
            case 2:
                SQLiteCursorDriver sQLiteCursorDriver = (SQLiteCursorDriver) obj2;
                String str = (String) obj3;
                SQLiteQuery sQLiteQuery = (SQLiteQuery) obj4;
                String[] strArr = fbs.a;
                sQLiteQuery.getClass();
                fby fbyVar = new fby(sQLiteQuery);
                fce fceVar = (fce) ((ajmd) this.a).a;
                int length = fceVar.a.length;
                for (int i5 = 1; i5 < length; i5++) {
                    int i6 = fceVar.a[i5];
                    if (i6 == 1) {
                        fbyVar.c(i5, fceVar.b[i5]);
                    } else if (i6 == 2) {
                        fbyVar.b(i5, fceVar.c[i5]);
                    } else if (i6 == 3) {
                        String str2 = fceVar.d[i5];
                        str2.getClass();
                        fbyVar.e(i5, str2);
                    } else if (i6 == 4) {
                        byte[] bArr2 = fceVar.e[i5];
                        bArr2.getClass();
                        fbyVar.a(i5, bArr2);
                    } else if (i6 == 5) {
                        fbyVar.d(i5);
                    }
                }
                return new SQLiteCursor(sQLiteCursorDriver, str, sQLiteQuery);
            case 3:
                hju hjuVar = (hju) obj;
                cfy cfyVar = (cfy) obj2;
                bux buxVar = (bux) obj3;
                int iIntValue = ((Integer) obj4).intValue();
                hjs hjsVar = hjs.a;
                hjuVar.getClass();
                cfyVar.getClass();
                if ((iIntValue & 6) == 0) {
                    i = iIntValue | (true != ((iIntValue & 8) == 0 ? buxVar.C(hjuVar) : buxVar.E(hjuVar)) ? 2 : 4);
                } else {
                    i = iIntValue;
                }
                if ((iIntValue & 48) == 0) {
                    i |= true != buxVar.C(cfyVar) ? 16 : 32;
                }
                if (buxVar.I((i & 147) != 146, i & 1)) {
                    this.a.invoke(hjuVar, cfyVar, buxVar, Integer.valueOf(i & 126));
                } else {
                    buxVar.s();
                }
                return afak.a;
            case 4:
                gab gabVar = (gab) obj;
                cfy cfyVar2 = (cfy) obj2;
                bux buxVar2 = (bux) obj3;
                int iIntValue2 = ((Integer) obj4).intValue();
                gabVar.getClass();
                cfyVar2.getClass();
                if ((iIntValue2 & 6) == 0) {
                    i2 = iIntValue2 | (true != ((iIntValue2 & 8) == 0 ? buxVar2.C(gabVar) : buxVar2.E(gabVar)) ? 2 : 4);
                } else {
                    i2 = iIntValue2;
                }
                if ((iIntValue2 & 48) == 0) {
                    i2 |= true != buxVar2.C(cfyVar2) ? 16 : 32;
                }
                if (buxVar2.I((i2 & 147) != 146, i2 & 1)) {
                    fxp.c(gabVar, BitmapDescriptorFactory.HUE_RED, bxc.t(cfyVar2, ((hkt) this.a).g), null, csh.a, null, false, false, hkf.a, buxVar2, (i2 & 14) | 805331000, 488);
                } else {
                    buxVar2.s();
                }
                return afak.a;
            case 5:
                tiw tiwVar = (tiw) obj;
                boolean zBooleanValue = ((Boolean) obj2).booleanValue();
                bux buxVar3 = (bux) obj3;
                int iIntValue3 = ((Integer) obj4).intValue();
                int i7 = kkz.a;
                tiwVar.getClass();
                if ((iIntValue3 & 6) == 0) {
                    i3 = iIntValue3 | (true != ((iIntValue3 & 8) == 0 ? buxVar3.C(tiwVar) : buxVar3.E(tiwVar)) ? 2 : 4);
                } else {
                    i3 = iIntValue3;
                }
                if ((iIntValue3 & 48) == 0) {
                    i3 |= true != buxVar3.D(zBooleanValue) ? 16 : 32;
                }
                if (buxVar3.I((i3 & 147) != 146, i3 & 1)) {
                    std.f(tiwVar, "Toggle:", new tjf(new kkx(zBooleanValue, (kjz) this.a, (qn) buxVar3.f(tii.c), z ? 1 : 0)), false, null, buxVar3, (i3 & 14) | 48, 58);
                } else {
                    buxVar3.s();
                }
                return afak.a;
            case 6:
                tiw tiwVar2 = (tiw) obj;
                int iIntValue4 = ((Integer) obj2).intValue();
                bux buxVar4 = (bux) obj3;
                int iIntValue5 = ((Integer) obj4).intValue();
                int i8 = kkz.a;
                tiwVar2.getClass();
                if ((iIntValue5 & 6) == 0) {
                    i4 = iIntValue5 | (true != ((iIntValue5 & 8) == 0 ? buxVar4.C(tiwVar2) : buxVar4.E(tiwVar2)) ? 2 : 4);
                } else {
                    i4 = iIntValue5;
                }
                if ((iIntValue5 & 48) == 0) {
                    i4 |= true != buxVar4.A(iIntValue4) ? 16 : 32;
                }
                if (buxVar4.I((i4 & 147) != 146, i4 & 1)) {
                    Object obj5 = this.a;
                    urg urgVarA = tjh.a(buxVar4);
                    String strC = jun.c(((kjz) obj5).a.a, iIntValue4);
                    boolean zE = buxVar4.E(urgVarA) | buxVar4.E(obj5);
                    Object objG = buxVar4.g();
                    if (zE || objG == buw.a) {
                        objG = new hgl(urgVarA, obj5, 20, bArr);
                        buxVar4.x(objG);
                    }
                    afdr afdrVar = (afdr) objG;
                    afdrVar.getClass();
                    std.f(tiwVar2, strC, new tjc(afdrVar), false, null, buxVar4, i4 & 14, 58);
                } else {
                    buxVar4.s();
                }
                return afak.a;
            case 7:
                List list = (List) obj;
                List list2 = (List) obj2;
                Integer num = (Integer) obj4;
                num.intValue();
                list.getClass();
                list2.getClass();
                return lld.c(list, list2, (Integer) obj3, num, (llc) this.a);
            case 8:
                lod lodVar = (lod) this.a;
                Boolean bool = (Boolean) obj3;
                Bundle bundle = (Bundle) obj4;
                yph yphVar = lpq.a;
                bool.getClass();
                boolean zBooleanValue2 = bool.booleanValue();
                bundle.getClass();
                return new lpf(lodVar.c.b, (AaPlaybackState) obj, (lmd) obj2, zBooleanValue2, bundle, lodVar.d.L());
            case 9:
                oqb oqbVar = (oqb) obj;
                cfy cfyVar3 = (cfy) obj2;
                bux buxVar5 = (bux) obj3;
                int iIntValue6 = ((Integer) obj4).intValue();
                yph yphVar2 = mvk.a;
                oqbVar.getClass();
                cfyVar3.getClass();
                int i9 = (iIntValue6 & 6) == 0 ? iIntValue6 | (true != ((iIntValue6 & 8) == 0 ? buxVar5.C(oqbVar) : buxVar5.E(oqbVar)) ? 2 : 4) : iIntValue6;
                if ((iIntValue6 & 48) == 0) {
                    i9 |= true != buxVar5.C(cfyVar3) ? 16 : 32;
                }
                if (buxVar5.I((i9 & 147) != 146, i9 & 1)) {
                    opg.a(oqbVar, (opr) this.a, cfyVar3, cfl.e, buxVar5, (i9 & 14) | 3144 | ((i9 << 3) & 896), 0);
                } else {
                    buxVar5.s();
                }
                return afak.a;
            default:
                ((Integer) obj).intValue();
                final lpt lptVar = (lpt) obj2;
                bux buxVar6 = (bux) obj3;
                ((Integer) obj4).intValue();
                lptVar.getClass();
                eqa eqaVar = (eqa) buxVar6.f(erz.a);
                cct cctVarI = bxc.i(-1345432687, true, new afeh() { // from class: naa
                    @Override // defpackage.afeh
                    public final Object invoke(Object obj6, Object obj7, Object obj8) {
                        lpt lptVar2;
                        byi byiVar;
                        long j;
                        cjp cjpVar;
                        gjo gjoVar;
                        hdo hdoVar;
                        cjp cjpVar2;
                        atm atmVar = (atm) obj6;
                        bux buxVar7 = (bux) obj7;
                        int iIntValue7 = ((Integer) obj8).intValue();
                        atmVar.getClass();
                        if ((iIntValue7 & 6) == 0) {
                            iIntValue7 |= true != buxVar7.C(atmVar) ? 2 : 4;
                        }
                        int i10 = 18;
                        if (buxVar7.I((iIntValue7 & 19) != 18, iIntValue7 & 1)) {
                            lpt lptVar3 = lptVar;
                            ltr ltrVarF = lnm.f(lptVar3.c());
                            int i11 = 19;
                            if (ltrVarF != null) {
                                buxVar7.v(-1150229481);
                                float f = nai.a;
                                myi.C(ltrVarF, 84.0f, cjn.g(atmVar.b(cfy.e), BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, kst.a.b, true, 0, 1042431), buxVar7, 48);
                                buxVar7.o();
                                lptVar2 = lptVar3;
                                byiVar = null;
                            } else {
                                buxVar7.v(-1149939166);
                                dlg dlgVarW = dlf.w((Context) buxVar7.f(daa.b));
                                float f2 = nai.a;
                                float fEA = dlgVarW.eA(84.0f);
                                leg legVar = leh.a;
                                if (legVar.a().b()) {
                                    buxVar7.v(-1149767333);
                                    gjo gjoVar2 = new gjo(lptVar3.c(), lptVar3.b(), null);
                                    cfy cfyVarG = cjn.g(atmVar.b(cfy.e), BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, kst.a.b, true, 0, 1042431);
                                    csi csiVar = csh.a;
                                    long jFloatToRawIntBits = Float.floatToRawIntBits(fEA) << 32;
                                    long jFloatToRawIntBits2 = Float.floatToRawIntBits(fEA) & 4294967295L;
                                    hdo hdoVarA = htg.a(bxc.i(-1781644225, true, new msw(atmVar, i10), buxVar7));
                                    hdo hdoVarA2 = htg.a(bxc.i(-367495666, true, new msw(atmVar, i11), buxVar7));
                                    if (legVar.a().b() && szp.x(lptVar3.c())) {
                                        buxVar7.v(-1148854197);
                                        gjoVar = gjoVar2;
                                        hdoVar = hdoVarA;
                                        cjpVar2 = new cjp(ksp.j(krr.s, buxVar7), 5);
                                        buxVar7.o();
                                    } else {
                                        gjoVar = gjoVar2;
                                        hdoVar = hdoVarA;
                                        buxVar7.v(-1148748425);
                                        buxVar7.o();
                                        cjpVar2 = null;
                                    }
                                    lptVar2 = lptVar3;
                                    byiVar = null;
                                    lnm.L(gjoVar, cfyVarG, null, csiVar, BitmapDescriptorFactory.HUE_RED, cjpVar2, hdoVar, hdoVarA2, new cjd(jFloatToRawIntBits | jFloatToRawIntBits2), null, buxVar7, 151019520, 0, 1068);
                                    buxVar7.o();
                                } else {
                                    lptVar2 = lptVar3;
                                    byiVar = null;
                                    buxVar7.v(-1148592061);
                                    gjo gjoVar3 = new gjo(lptVar2.c(), lptVar2.b(), null);
                                    cfy cfyVarG2 = cjn.g(atmVar.b(cfy.e), BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, kst.a.b, true, 0, 1042431);
                                    csi csiVar2 = csh.a;
                                    long jFloatToRawIntBits3 = Float.floatToRawIntBits(fEA) << 32;
                                    long jFloatToRawIntBits4 = Float.floatToRawIntBits(fEA) & 4294967295L;
                                    htk htkVar = new htk();
                                    if (legVar.a().b() && szp.x(lptVar2.c())) {
                                        buxVar7.v(-1147840373);
                                        cjp cjpVar3 = new cjp(ksp.j(krr.s, buxVar7), 5);
                                        buxVar7.o();
                                        j = jFloatToRawIntBits3;
                                        cjpVar = cjpVar3;
                                    } else {
                                        buxVar7.v(-1147734601);
                                        buxVar7.o();
                                        j = jFloatToRawIntBits3;
                                        cjpVar = null;
                                    }
                                    lnm.L(gjoVar3, cfyVarG2, null, csiVar2, BitmapDescriptorFactory.HUE_RED, cjpVar, htkVar, null, new cjd(jFloatToRawIntBits4 | j), null, buxVar7, 16801792, 0, 1324);
                                    buxVar7.o();
                                }
                                buxVar7.o();
                            }
                            boolean zC = buxVar7.C(lptVar2.a().getPackageName()) | buxVar7.C(lptVar2.a().getClassName());
                            Object objG2 = buxVar7.g();
                            if (zC || objG2 == buw.a) {
                                mvg mvgVar = new mvg(lptVar2, 19);
                                lah lahVar = byj.a;
                                objG2 = new bvk(mvgVar, byiVar);
                                buxVar7.x(objG2);
                            }
                            cmw cmwVarF = lgi.f((GhIcon) ((bym) objG2).a(), 24.0f, buxVar7, 1);
                            cfy cfyVarA = atmVar.a(awd.i(cfy.e, 24.0f), cfl.i);
                            float f3 = gjk.a.k;
                            ca.bb(cmwVarF, null, ca.al(cfyVarA, f3, f3), null, null, BitmapDescriptorFactory.HUE_RED, null, buxVar7, 56, 120);
                        } else {
                            buxVar7.s();
                        }
                        return afak.a;
                    }
                }, buxVar6);
                cct cctVarI2 = bxc.i(-2069199577, true, new msw(lptVar, 17), buxVar6);
                Object obj6 = this.a;
                boolean zE2 = buxVar6.E(obj6) | buxVar6.E(lptVar) | buxVar6.E(eqaVar);
                Object objG2 = buxVar6.g();
                if (zE2 || objG2 == buw.a) {
                    objG2 = new lxu(obj6, (Object) lptVar, (Object) eqaVar, 3, (byte[]) null);
                    buxVar6.x(objG2);
                }
                mjv.h(cctVarI, cctVarI2, null, null, (afdr) objG2, buxVar6, 54, 12);
                return afak.a;
        }
    }
}
