package defpackage;

import android.graphics.Bitmap;
import android.net.Uri;
import com.google.android.apps.auto.components.graphics.icon.GhIcon;
import com.google.android.apps.auto.components.telecom.PhoneCall;
import java.util.List;

/* loaded from: classes.dex */
public final /* synthetic */ class ndo implements afec {
    private final /* synthetic */ int a;

    public /* synthetic */ ndo(int i) {
        this.a = i;
    }

    @Override // defpackage.afec
    public final Object invoke(Object obj) {
        nul nulVar;
        switch (this.a) {
            case 0:
                int i = ndp.q;
                ((nur) obj).getClass();
                return null;
            case 1:
                nur nurVar = (nur) obj;
                int i2 = ndp.q;
                nurVar.getClass();
                if (ogb.a.c()) {
                    nub nubVar = nurVar.u;
                    return nubVar != null ? nubVar.g : nurVar.q;
                }
                nub nubVar2 = nurVar.u;
                return (nubVar2 == null || (nulVar = nubVar2.g) == null) ? nurVar.q : nulVar;
            case 2:
                ndy ndyVar = (ndy) obj;
                yph yphVar = nea.a;
                ndyVar.getClass();
                return new ndy(ndyVar.a, ndyVar.d, false, ndyVar.c);
            case 3:
                PhoneCall phoneCall = (PhoneCall) obj;
                yph yphVar2 = nea.a;
                phoneCall.getClass();
                return phoneCall.c;
            case 4:
                PhoneCall phoneCall2 = (PhoneCall) obj;
                yph yphVar3 = nea.a;
                phoneCall2.getClass();
                Bitmap bitmap = phoneCall2.h;
                if (bitmap != null) {
                    return new gjo(null, bitmap, null);
                }
                gjo gjoVar = gjo.a;
                Uri uriB = jxn.c().b(phoneCall2.d, phoneCall2.c);
                uriB.getClass();
                return new gjo(uriB, null, null);
            case 5:
                List list = (List) obj;
                yph yphVar4 = nea.a;
                list.getClass();
                return (PhoneCall) woy.bH(list);
            case 6:
                PhoneCall phoneCall3 = (PhoneCall) obj;
                yph yphVar5 = nea.a;
                phoneCall3.getClass();
                return GhIcon.j(phoneCall3.f);
            case 7:
                odu oduVar = (odu) obj;
                yph yphVar6 = nea.a;
                oduVar.getClass();
                return Boolean.valueOf(oduVar.a);
            case 8:
                PhoneCall phoneCall4 = (PhoneCall) obj;
                yph yphVar7 = nea.a;
                phoneCall4.getClass();
                return phoneCall4.b;
            case 9:
                onv onvVar = (onv) obj;
                onvVar.getClass();
                String strL = onu.l(onvVar.b);
                strL.getClass();
                return strL;
            case 10:
                onv onvVar2 = (onv) obj;
                onvVar2.getClass();
                String strL2 = onu.l(onvVar2.c);
                strL2.getClass();
                return strL2;
            case 11:
                nfi nfiVar = nfn.a;
                return afak.a;
            case 12:
                boolean zBooleanValue = ((Boolean) obj).booleanValue();
                yph yphVar8 = ngk.a;
                nim.a().l(zBooleanValue);
                return afak.a;
            case 13:
                boolean zBooleanValue2 = ((Boolean) obj).booleanValue();
                yph yphVar9 = ngk.a;
                nim.a().j(zBooleanValue2);
                return afak.a;
            case 14:
                afia[] afiaVarArr = nhr.a;
                ((rrb) obj).getClass();
                return afak.a;
            case 15:
                yph yphVar10 = nih.a;
                return Boolean.valueOf(affa.f((Boolean) obj, true));
            case 16:
                return roc.ap((cie) obj);
            case 17:
                return roc.ap((cie) obj);
            case 18:
                ((Boolean) obj).booleanValue();
                return afak.a;
            case 19:
                List list2 = (List) obj;
                njj njjVar = njp.a;
                list2.getClass();
                nmj nmjVar = (nmj) woy.bH(list2);
                return nmjVar == null ? kgq.l() : nmjVar;
            default:
                nmj nmjVar2 = (nmj) obj;
                njj njjVar2 = njp.a;
                if (nmjVar2 != null) {
                    return nmjVar2.b;
                }
                return null;
        }
    }
}
