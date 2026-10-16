package Nb;

import android.location.GnssStatus;
import android.location.GnssStatus$Callback;
import android.os.Build;
import com.unity3d.services.UnityAdsConstants;
import com.wynauto.wyn.MainActivity;
import ef.C2527k;
import ff.AbstractC2640A;
import java.util.ArrayList;
import kotlin.jvm.internal.AbstractC3340k;
import uc.C4281r;
import x4.k;

/* loaded from: classes5.dex */
public final class b extends GnssStatus$Callback {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f8641a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f8642b;

    public /* synthetic */ b(Object obj, int i5) {
        this.f8641a = i5;
        this.f8642b = obj;
    }

    public void onFirstFix(int i5) {
        switch (this.f8641a) {
            case 0:
                break;
            default:
                super.onFirstFix(i5);
                break;
        }
    }

    public final void onSatelliteStatusChanged(GnssStatus status) {
        boolean z2 = true;
        Object obj = this.f8642b;
        switch (this.f8641a) {
            case 0:
                AbstractC3340k.e(status, "status");
                ArrayList arrayList = new ArrayList();
                int satelliteCount = status.getSatelliteCount();
                int i5 = 0;
                while (i5 < satelliteCount) {
                    C2527k c2527k = new C2527k("usedInFix", Boolean.valueOf(status.usedInFix(i5)));
                    C2527k c2527k2 = new C2527k("azimuthDegrees", Float.valueOf(status.getAzimuthDegrees(i5)));
                    C2527k c2527k3 = new C2527k("carrierFrequencyHz", Float.valueOf(Build.VERSION.SDK_INT >= 26 ? status.getCarrierFrequencyHz(i5) : UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT));
                    C2527k c2527k4 = new C2527k("cn0DbHz", Float.valueOf(status.getCn0DbHz(i5)));
                    C2527k c2527k5 = new C2527k("constellationType", Integer.valueOf(status.getConstellationType(i5)));
                    C2527k c2527k6 = new C2527k("elevationDegrees", Float.valueOf(status.getElevationDegrees(i5)));
                    boolean z10 = z2;
                    C2527k c2527k7 = new C2527k("svid", Integer.valueOf(status.getSvid(i5)));
                    C2527k[] c2527kArr = new C2527k[7];
                    c2527kArr[0] = c2527k;
                    c2527kArr[z10 ? 1 : 0] = c2527k2;
                    c2527kArr[2] = c2527k3;
                    c2527kArr[3] = c2527k4;
                    c2527kArr[4] = c2527k5;
                    c2527kArr[5] = c2527k6;
                    c2527kArr[6] = c2527k7;
                    arrayList.add(AbstractC2640A.R(c2527kArr));
                    i5++;
                    z2 = z10 ? 1 : 0;
                }
                C4281r c4281r = ((MainActivity) obj).f33909h;
                if (c4281r != null) {
                    c4281r.a("gnssStatusChanged", arrayList, null);
                    return;
                } else {
                    AbstractC3340k.m("channel");
                    throw null;
                }
            default:
                ((k) obj).f47716g = status.getSatelliteCount();
                ((k) obj).f47717h = 0.0d;
                for (int i10 = 0; i10 < ((k) obj).f47716g; i10++) {
                    if (status.usedInFix(i10)) {
                        ((k) obj).f47717h += 1.0d;
                    }
                }
                return;
        }
    }

    public void onStarted() {
        switch (this.f8641a) {
            case 0:
                break;
            default:
                super.onStarted();
                break;
        }
    }

    public void onStopped() {
        switch (this.f8641a) {
            case 0:
                break;
            default:
                super.onStopped();
                break;
        }
    }

    private final void b() {
    }

    private final void c() {
    }

    private final void a(int i5) {
    }
}
