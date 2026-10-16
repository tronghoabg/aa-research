package androidx.core.location;

import androidx.core.location.LocationManagerCompat;

/* compiled from: r8-map-id-0308adb7379ba4f751dce57ff165d4b8556222573b5bec89923a9da20a3bb2b7 */
/* loaded from: classes.dex */
public final /* synthetic */ class d implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ LocationManagerCompat.LocationListenerTransport b;
    public final /* synthetic */ LocationListenerCompat c;
    public final /* synthetic */ String d;

    public /* synthetic */ d(LocationManagerCompat.LocationListenerTransport locationListenerTransport, LocationListenerCompat locationListenerCompat, String str, int i) {
        this.a = i;
        this.b = locationListenerTransport;
        this.c = locationListenerCompat;
        this.d = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                this.b.lambda$onProviderEnabled$6(this.c, this.d);
                break;
            default:
                this.b.lambda$onProviderDisabled$7(this.c, this.d);
                break;
        }
    }
}
