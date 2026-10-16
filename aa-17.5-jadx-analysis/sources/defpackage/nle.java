package defpackage;

import com.google.android.libraries.maps.model.BitmapDescriptorFactory;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

/* loaded from: classes2.dex */
public final /* synthetic */ class nle implements afec {
    private final /* synthetic */ int a;

    public /* synthetic */ nle(int i) {
        this.a = i;
    }

    @Override // defpackage.afec
    public final Object invoke(Object obj) {
        switch (this.a) {
            case 0:
                ((Boolean) obj).booleanValue();
                return afak.a;
            case 1:
                yph yphVar = nkx.a;
                ((abh) obj).getClass();
                return new aby(acl.B(null, 3).a(acl.q(null, BitmapDescriptorFactory.HUE_RED, 0L, 7)), acl.C(null, 3).a(acl.r(null, BitmapDescriptorFactory.HUE_RED, 0L, 7)), BitmapDescriptorFactory.HUE_RED, 12);
            case 2:
                hsq hsqVar = (hsq) obj;
                hsqVar.getClass();
                return (hsq) hsqVar.O(new jrm());
            case 3:
                yfq yfqVar = (yfq) obj;
                yph yphVar2 = nnu.a;
                yfqVar.getClass();
                ArrayList arrayList = new ArrayList();
                for (Object obj2 : yfqVar) {
                    nuo nuoVar = ((nuh) obj2).c.x;
                    if (nuoVar == nuo.e || nuoVar == nuo.d) {
                        arrayList.add(obj2);
                    }
                }
                return arrayList;
            case 4:
                List list = (List) obj;
                yph yphVar3 = nnu.a;
                list.getClass();
                return (nuh) woy.bH(list);
            case 5:
                nuh nuhVar = (nuh) obj;
                yph yphVar4 = nnu.a;
                nuhVar.getClass();
                return nuhVar.c;
            case 6:
                int iIntValue = ((Integer) obj).intValue();
                yph yphVar5 = nnu.a;
                return Boolean.valueOf(iIntValue == 102);
            case 7:
                int iIntValue2 = ((Integer) obj).intValue();
                yph yphVar6 = nnu.a;
                return Boolean.valueOf(iIntValue2 == 2 || iIntValue2 == 1);
            case 8:
                Boolean bool = (Boolean) obj;
                bool.booleanValue();
                nnu.a.l().y("forceWidgetOn: isForced:%b", bool);
                return obj;
            case 9:
                int i = nny.a;
                return lxr.z((abh) obj);
            case 10:
                nnl nnlVar = (nnl) obj;
                int i2 = nny.a;
                nnlVar.getClass();
                return nnlVar.r;
            case 11:
                xsa xsaVar = (xsa) obj;
                xsaVar.getClass();
                xsaVar.b = 38.0f;
                return afak.a;
            case 12:
                xrk xrkVar = (xrk) obj;
                xrkVar.getClass();
                xrkVar.b = 40.0f;
                xrkVar.d = 1.0f;
                return afak.a;
            case 13:
                return ((Boolean) obj).booleanValue() ? noq.b : noq.a;
            case 14:
                return ((Boolean) obj).booleanValue() ? noq.c : noq.a;
            case 15:
                kkf kkfVar = (kkf) obj;
                kkfVar.getClass();
                if (!(kkfVar instanceof kkc)) {
                    return afbg.a;
                }
                Object[] objArr = (Object[]) ((kkc) kkfVar).a;
                HashSet hashSet = new HashSet();
                for (Object obj3 : objArr) {
                    int iIntValue3 = ((Number) obj3).intValue();
                    not notVar = not.a;
                    hashSet.add(lxw.H(iIntValue3));
                }
                return hashSet;
            case 16:
                int iIntValue4 = ((Integer) obj).intValue();
                not notVar2 = not.a;
                return lxw.H(iIntValue4);
            case 17:
                Integer[] numArr = (Integer[]) obj;
                numArr.getClass();
                if (numArr.length >= 6) {
                    return new now(numArr);
                }
                ((ype) npc.c.h()).y("Expected config to have at least 6 values, but was %s. Returning null temperature config.", numArr);
                return null;
            case 18:
                return lxr.q(((Integer) obj).intValue());
            case 19:
                ugn ugnVar = (ugn) obj;
                ugnVar.getClass();
                return ugnVar.b;
            default:
                ugn ugnVar2 = (ugn) obj;
                ugnVar2.getClass();
                return ugnVar2.j;
        }
    }
}
