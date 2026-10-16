package androidx.core.location;

import android.location.GnssStatus;
import android.location.Location;
import androidx.core.location.LocationManagerCompat;
import java.util.List;
import java.util.concurrent.Executor;

/* compiled from: r8-map-id-0308adb7379ba4f751dce57ff165d4b8556222573b5bec89923a9da20a3bb2b7 */
/* loaded from: classes.dex */
public final /* synthetic */ class c implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ c(Object obj, Object obj2, Object obj3, int i) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
        this.d = obj3;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                ((LocationManagerCompat.GpsStatusTransport) this.b).lambda$onGpsStatusChanged$3((Executor) this.c, (GnssStatusCompat) this.d);
                break;
            case 1:
                ((LocationManagerCompat.LocationListenerTransport) this.b).lambda$onLocationChanged$3((LocationListenerCompat) this.c, (List) this.d);
                break;
            case 2:
                ((LocationManagerCompat.LocationListenerTransport) this.b).lambda$onLocationChanged$2((LocationListenerCompat) this.c, (Location) this.d);
                break;
            default:
                ((LocationManagerCompat.PreRGnssStatusTransport) this.b).lambda$onSatelliteStatusChanged$3((Executor) this.c, (GnssStatus) this.d);
                break;
        }
    }
}
