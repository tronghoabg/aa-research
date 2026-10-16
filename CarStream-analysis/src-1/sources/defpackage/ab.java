package defpackage;

import android.location.Location;
import android.location.LocationListener;
import android.os.Bundle;
import java.util.Iterator;

/* compiled from: r8-map-id-0308adb7379ba4f751dce57ff165d4b8556222573b5bec89923a9da20a3bb2b7 */
/* loaded from: classes.dex */
public final class ab implements LocationListener {
    @Override // android.location.LocationListener
    public final void onLocationChanged(Location location) {
        cb.b = System.currentTimeMillis();
        cb.d = location.hasSpeed() ? Math.round(location.getSpeed() * 3.6f) : -1;
        cb.g = location;
        Iterator it = cb.e.iterator();
        while (it.hasNext()) {
            try {
                ((h2) it.next()).a(cb.d);
            } catch (Exception unused) {
            }
        }
        Iterator it2 = cb.f.iterator();
        while (it2.hasNext()) {
            try {
                ((bb) it2.next()).onLocation(location);
            } catch (Exception unused2) {
            }
        }
    }

    @Override // android.location.LocationListener
    public final void onProviderDisabled(String str) {
        cb.d = -1;
        Iterator it = cb.e.iterator();
        while (it.hasNext()) {
            try {
                ((h2) it.next()).a(cb.d);
            } catch (Exception unused) {
            }
        }
    }

    @Override // android.location.LocationListener
    public final void onProviderEnabled(String str) {
    }

    @Override // android.location.LocationListener
    public final void onStatusChanged(String str, int i, Bundle bundle) {
    }
}
