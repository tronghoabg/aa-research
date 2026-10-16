package defpackage;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Map;

/* loaded from: classes.dex */
public final /* synthetic */ class abp implements afeg {
    private final /* synthetic */ int a;

    public /* synthetic */ abp(int i) {
        this.a = i;
    }

    @Override // defpackage.afeg
    public final Object invoke(Object obj, Object obj2) {
        Object obj3;
        switch (this.a) {
            case 0:
                acc accVar = (acc) obj2;
                return Boolean.valueOf(((acc) obj) == accVar && accVar == acc.c);
            case 1:
                Map map = ahc.a;
                return new aft(1.0f, 400.0f, new dlq(4294967297L));
            case 2:
                return Integer.valueOf(((alh) obj2).c());
            case 3:
                axr axrVar = (axr) obj2;
                cdt cdtVar = axr.q;
                return woy.bi(Integer.valueOf(axrVar.b()), Integer.valueOf(axrVar.c()));
            case 4:
                axz axzVar = (axz) obj2;
                int i = axz.h;
                return woy.bi(Integer.valueOf(axzVar.b()), Integer.valueOf(axzVar.c()));
            case 5:
                Map mapB = ((bab) obj2).b();
                if (mapB.isEmpty()) {
                    return null;
                }
                return mapB;
            case 6:
                baq baqVar = (baq) obj2;
                cdt cdtVar2 = baq.b;
                return woy.bi(Integer.valueOf(baqVar.j()), Float.valueOf(afpt.d(baqVar.c(), -0.5f, 0.5f)), Integer.valueOf(baqVar.b()));
            case 7:
                bfb bfbVar = (bfb) obj2;
                cdt cdtVar3 = bfb.b;
                return woy.bi(Float.valueOf(bfbVar.b()), Boolean.valueOf(bfbVar.c() == api.a));
            case 8:
                return roc.an((bux) obj, ((Integer) obj2).intValue());
            case 9:
                return roc.an((bux) obj, ((Integer) obj2).intValue());
            case 10:
                bux buxVar = (bux) obj;
                int iIntValue = ((Integer) obj2).intValue();
                if (buxVar.I((iIntValue & 3) != 2, iIntValue & 1)) {
                    throw null;
                }
                buxVar.s();
                return afak.a;
            case 11:
                cdo cdoVar = (cdo) obj2;
                aan aanVar = cdoVar.c;
                Object[] objArr = aanVar.b;
                Object[] objArr2 = aanVar.c;
                long[] jArr = aanVar.a;
                int length = jArr.length - 2;
                if (length >= 0) {
                    int i2 = 0;
                    while (true) {
                        long j = jArr[i2];
                        if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                            int i3 = i2 - length;
                            int i4 = 0;
                            while (true) {
                                int i5 = 8 - ((~i3) >>> 31);
                                if (i4 < i5) {
                                    if ((255 & j) < 128) {
                                        int i6 = (i2 << 3) + i4;
                                        cdoVar.a.put(objArr[i6], ((cdp) objArr2[i6]).b());
                                    }
                                    j >>= 8;
                                    i4++;
                                } else {
                                    obj3 = null;
                                    if (i5 == 8) {
                                    }
                                }
                            }
                        } else {
                            obj3 = null;
                        }
                        if (i2 != length) {
                            i2++;
                        }
                    }
                } else {
                    obj3 = null;
                }
                Map map2 = cdoVar.a;
                woy.cv(map2.values(), new bwr(2));
                return map2.isEmpty() ? obj3 : map2;
            case 12:
                return obj2;
            case 13:
                return roc.an((bux) obj, ((Integer) obj2).intValue());
            case 14:
                ((cxb) obj).ae((cfy) obj2);
                return afak.a;
            case 15:
                ((cxb) obj).ay((ccx) obj2);
                return afak.a;
            case 16:
                ((cxb) obj).ad((ctp) obj2);
                return afak.a;
            case 17:
                ((cxb) obj).aa(((Integer) obj2).intValue());
                return afak.a;
            case 18:
                return roc.an((bux) obj, ((Integer) obj2).intValue());
            case 19:
                Collection collection = (List) obj;
                List list = (List) obj2;
                if (collection == null) {
                    collection = afbe.a;
                }
                return woy.bY(collection, list);
            default:
                List list2 = (List) obj;
                List list3 = (List) obj2;
                if (list2 == null) {
                    return list3;
                }
                ArrayList arrayList = new ArrayList(list2);
                arrayList.addAll(list3);
                return arrayList;
        }
    }
}
