package defpackage;

import android.content.ComponentName;
import android.content.SharedPreferences;
import com.google.android.apps.auto.components.graphics.icon.GhIcon;
import com.google.android.apps.auto.components.ui.media.MediaPlaybackView;
import com.google.android.gms.car.navigation.DestinationDistance;
import com.google.android.gms.car.navigation.NavigationCurrentPosition;
import com.google.android.gms.car.navigation.NavigationState;
import com.google.android.gms.car.navigation.NavigationStep;
import com.google.android.libraries.maps.model.BitmapDescriptorFactory;
import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.util.List;

/* loaded from: classes.dex */
public final /* synthetic */ class oin implements afec {
    private final /* synthetic */ int a;

    public /* synthetic */ oin(int i) {
        this.a = i;
    }

    @Override // defpackage.afec
    public final Object invoke(Object obj) throws IOException {
        switch (this.a) {
            case 0:
                nep nepVar = (nep) obj;
                oip oipVar = ois.a;
                nepVar.getClass();
                return Boolean.valueOf(nepVar.b >= ((float) acxa.v()) / 10.0f);
            case 1:
                Integer num = (Integer) obj;
                return Boolean.valueOf(num.intValue() == 1 || num.intValue() == 2);
            case 2:
                nep nepVar2 = (nep) obj;
                oip oipVar2 = ois.a;
                nepVar2.getClass();
                return Boolean.valueOf(nepVar2.c == 3);
            case 3:
                NavigationCurrentPosition navigationCurrentPosition = (NavigationCurrentPosition) obj;
                if (navigationCurrentPosition != null) {
                    return navigationCurrentPosition.a;
                }
                return null;
            case 4:
                NavigationState navigationState = (NavigationState) obj;
                if (navigationState != null) {
                    return (NavigationStep) yrm.au(navigationState.c());
                }
                return null;
            case 5:
                NavigationCurrentPosition navigationCurrentPosition2 = (NavigationCurrentPosition) obj;
                if (navigationCurrentPosition2 != null) {
                    return (DestinationDistance) yrm.au(navigationCurrentPosition2.a());
                }
                return null;
            case 6:
                NavigationStep navigationStep = (NavigationStep) obj;
                yph yphVar = olb.a;
                if (navigationStep == null) {
                    return null;
                }
                String str = navigationStep.b;
                if (true != xyb.a(str)) {
                    return str;
                }
                return null;
            case 7:
                return olb.b((DestinationDistance) obj);
            case 8:
                return GhIcon.j((ComponentName) obj);
            case 9:
                yph yphVar2 = MediaPlaybackView.a;
                ((emq) obj).c(0.75f);
                return afak.a;
            case 10:
                abh abhVar = (abh) obj;
                abhVar.getClass();
                int i = abhVar.g() != opj.b ? -1 : 1;
                return new aby(acl.v(new cia(i, 7)).a(acl.B(null, 3)), acl.x(new cia(i, 8)).a(acl.C(null, 3)), BitmapDescriptorFactory.HUE_RED, 12);
            case 11:
                cks cksVar = (cks) obj;
                cksVar.getClass();
                cksVar.z(0.33333334f);
                cksVar.A(0.33333334f);
                cksVar.E(roc.aA(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED));
                return afak.a;
            case 12:
                oze ozeVar = ozf.a;
                return pbn.a;
            case 13:
                List list = (List) obj;
                afco afcoVar = tby.a;
                list.getClass();
                return woy.bq(woy.bU(list));
            case 14:
                afco afcoVar2 = tby.a;
                return Boolean.valueOf(obj == null);
            case 15:
                ((tj) obj).getClass();
                return afak.a;
            case 16:
                ((tj) obj).getClass();
                return afak.a;
            case 17:
                URL url = (URL) obj;
                url.getClass();
                InputStream inputStreamOpenStream = url.openStream();
                inputStreamOpenStream.getClass();
                return inputStreamOpenStream;
            case 18:
                SharedPreferences sharedPreferences = (SharedPreferences) obj;
                sharedPreferences.getClass();
                String string = sharedPreferences.getString("zb", "");
                return string == null ? "" : string;
            case 19:
                return yfq.z(xak.a, (List) obj);
            default:
                return xrk.c((xrj) obj);
        }
    }
}
