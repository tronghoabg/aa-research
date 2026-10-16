package defpackage;

import android.telephony.ServiceState;
import com.google.android.apps.auto.components.graphics.icon.GhIcon;
import com.google.android.apps.auto.components.telecom.PhoneCall;
import com.google.android.libraries.maps.model.BitmapDescriptorFactory;
import j$.util.Objects;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public final /* synthetic */ class nna implements afec {
    private final /* synthetic */ int a;

    public /* synthetic */ nna(int i) {
        this.a = i;
    }

    @Override // defpackage.afec
    public final Object invoke(Object obj) {
        switch (this.a) {
            case 0:
                int i = nni.a;
                return lxr.z((abh) obj);
            case 1:
                nmj nmjVar = (nmj) obj;
                nmjVar.getClass();
                Integer numValueOf = Integer.valueOf(nmjVar.a.b());
                GhIcon ghIcon = nmjVar.c;
                return Integer.valueOf(Objects.hash(numValueOf, ghIcon != null ? Integer.valueOf(ghIcon.b()) : null, nmjVar.d, Boolean.valueOf(nmjVar.e)));
            case 2:
                nnl nnlVar = (nnl) obj;
                int i2 = nni.a;
                nnlVar.getClass();
                return nnlVar.r;
            case 3:
                nuh nuhVar = (nuh) obj;
                yph yphVar = nnu.a;
                if ((nuhVar != null ? nuhVar.c.x : null) == nuo.e) {
                    return nuhVar.c;
                }
                return null;
            case 4:
                nuh nuhVar2 = (nuh) obj;
                yph yphVar2 = nnu.a;
                if ((nuhVar2 != null ? nuhVar2.c.x : null) == nuo.c) {
                    return nuhVar2.c;
                }
                return null;
            case 5:
                nnu.a.l().y("forcedWidgetState: %s", (nnr) obj);
                return obj;
            case 6:
                nnu.a.l().y("regularWidgetState: %s", (nnr) obj);
                return obj;
            case 7:
                nnu.a.l().y("RailWidgetUiState: %s", (nnl) obj);
                return obj;
            case 8:
                yph yphVar3 = nqu.c;
                return Boolean.valueOf(((nqt) obj) instanceof nqs);
            case 9:
                ServiceState serviceState = (ServiceState) obj;
                if (serviceState != null && serviceState.getState() == 2) {
                    z = false;
                }
                return Boolean.valueOf(z);
            case 10:
                nuy nuyVar = nva.a;
                return ((nvb) obj).a;
            case 11:
                abh abhVar = (abh) obj;
                abhVar.getClass();
                aby abyVar = new aby(acl.B(ca.F(300, 300, null, 4), 2), acl.C(ca.F(200, 0, null, 4), 2), BitmapDescriptorFactory.HUE_RED, 12);
                abhVar.c(abyVar, new adi(false, new nno(5)));
                return abyVar;
            case 12:
                int iIntValue = ((Integer) obj).intValue();
                ygr ygrVar = oal.a;
                return Boolean.valueOf(iIntValue >= 3);
            case 13:
                cks cksVar = (cks) obj;
                cksVar.getClass();
                cksVar.t(1);
                return afak.a;
            case 14:
                yfq yfqVar = odq.a;
                return (PhoneCall) yrm.ai(((List) obj).iterator());
            case 15:
                PhoneCall phoneCall = (PhoneCall) obj;
                yfq yfqVar2 = odq.a;
                return Boolean.valueOf((phoneCall == null || odq.a.contains(phoneCall.b)) ? false : true);
            case 16:
                PhoneCall phoneCall2 = (PhoneCall) obj;
                yfq yfqVar3 = odq.a;
                return Boolean.valueOf((phoneCall2 == null || odq.b.contains(phoneCall2.b)) ? false : true);
            case 17:
                yfq yfqVar4 = (yfq) obj;
                ofr ofrVar = ofs.a;
                yfqVar4.getClass();
                ArrayList arrayList = new ArrayList();
                for (Object obj2 : yfqVar4) {
                    if (((nuh) obj2).c.x == nuo.e) {
                        arrayList.add(obj2);
                    }
                }
                return woy.cc(arrayList, new azl(9));
            case 18:
                Boolean bool = (Boolean) obj;
                bool.booleanValue();
                afco afcoVar = tby.a;
                return bool;
            case 19:
                Boolean bool2 = (Boolean) obj;
                afco afcoVar2 = tby.a;
                if (bool2 != null) {
                    return Boolean.valueOf(!bool2.booleanValue());
                }
                return null;
            default:
                afco afcoVar3 = tby.a;
                return Boolean.valueOf(obj != null);
        }
    }
}
