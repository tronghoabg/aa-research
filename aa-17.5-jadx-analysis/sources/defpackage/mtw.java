package defpackage;

import com.google.android.apps.auto.components.media.compat.AaPlaybackState;
import com.google.android.apps.auto.components.telecom.PhoneCall;
import com.google.android.libraries.maps.model.BitmapDescriptorFactory;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes.dex */
public final /* synthetic */ class mtw implements afec {
    private final /* synthetic */ int a;

    public /* synthetic */ mtw(int i) {
        this.a = i;
    }

    @Override // defpackage.afec
    public final Object invoke(Object obj) {
        boolean z = true;
        switch (this.a) {
            case 0:
                List list = (List) obj;
                list.getClass();
                break;
            case 1:
                List list2 = (List) obj;
                list2.getClass();
                int i = nuj.b;
                break;
            case 2:
                ((List) obj).getClass();
                break;
            case 3:
                List list3 = (List) obj;
                list3.getClass();
                if (list3.isEmpty()) {
                    z = false;
                } else {
                    Iterator it = list3.iterator();
                    while (it.hasNext()) {
                        if (!odq.a.contains(((PhoneCall) it.next()).b)) {
                        }
                    }
                    z = false;
                }
                break;
            case 4:
                Integer num = (Integer) obj;
                num.intValue();
                break;
            case 5:
                Integer num2 = (Integer) obj;
                num2.intValue();
                break;
            case 6:
                ((cun) obj).getClass();
                break;
            case 7:
                doi doiVar = (doi) obj;
                doiVar.getClass();
                doj dojVar = doiVar.c;
                doiVar.i.k(dojVar.d, BitmapDescriptorFactory.HUE_RED);
                doiVar.g.j(dojVar.e, BitmapDescriptorFactory.HUE_RED);
                break;
            case 8:
                nbf nbfVar = (nbf) obj;
                yph yphVar = myv.a;
                nbfVar.getClass();
                break;
            case 9:
                myv.a.l().y("Live Media Items: %s", (List) obj);
                break;
            case 10:
                lod lodVar = (lod) obj;
                yph yphVar2 = mzf.a;
                lodVar.getClass();
                break;
            case 11:
                yph yphVar3 = mzf.a;
                break;
            case 12:
                lod lodVar2 = (lod) obj;
                yph yphVar4 = mzf.a;
                lodVar2.getClass();
                break;
            case 13:
                lod lodVar3 = (lod) obj;
                yph yphVar5 = mzf.a;
                lodVar3.getClass();
                break;
            case 14:
                AaPlaybackState aaPlaybackState = (AaPlaybackState) obj;
                yph yphVar6 = mzf.a;
                aaPlaybackState.getClass();
                break;
            case 15:
                yph yphVar7 = mzf.a;
                break;
            case 16:
                yph yphVar8 = mzf.a;
                break;
            case 17:
                lod lodVar4 = (lod) obj;
                yph yphVar9 = mzf.a;
                lodVar4.getClass();
                break;
            case 18:
                Boolean bool = (Boolean) obj;
                bool.booleanValue();
                mzf.a.l().y("connectionTimeoutHasElapsed: %s", bool);
                break;
            case 19:
                Boolean bool2 = (Boolean) obj;
                bool2.booleanValue();
                mzf.a.l().y("timedOutAfterPlaybackStateChange: %s", bool2);
                break;
            default:
                Boolean bool3 = (Boolean) obj;
                bool3.booleanValue();
                mzf.a.l().y("isMediaSessionValid: %s", bool3);
                break;
        }
        return obj;
    }
}
