package defpackage;

import android.location.Location;
import android.os.SystemClock;

/* compiled from: r8-map-id-0308adb7379ba4f751dce57ff165d4b8556222573b5bec89923a9da20a3bb2b7 */
/* loaded from: classes.dex */
public final class bc implements bb {
    public final /* synthetic */ dc a;

    public bc(dc dcVar) {
        this.a = dcVar;
    }

    @Override // defpackage.bb
    public final void onLocation(Location location) {
        Double dValueOf;
        dc dcVar = this.a;
        if (!dc.k || location == null) {
            return;
        }
        if (!dcVar.e || System.currentTimeMillis() - dcVar.f >= 25000) {
            dcVar.e = true;
            dcVar.f = System.currentTimeMillis();
            double latitude = location.getLatitude();
            double longitude = location.getLongitude();
            long jElapsedRealtime = SystemClock.elapsedRealtime();
            if (!location.hasBearing() || !location.hasSpeed() || location.getSpeed() * 3.6f <= 3.0f || (location.hasBearingAccuracy() && location.getBearingAccuracyDegrees() > 45.0f)) {
                Location location2 = dcVar.i;
                if (location2 == null) {
                    dcVar.i = location;
                } else if (location2.distanceTo(location) >= 12.0f) {
                    float fBearingTo = dcVar.i.bearingTo(location);
                    if (fBearingTo < 0.0f) {
                        fBearingTo += 360.0f;
                    }
                    dcVar.g = fBearingTo;
                    dcVar.h = jElapsedRealtime;
                    dcVar.i = location;
                    dValueOf = Double.valueOf(fBearingTo);
                }
                long j = dcVar.h;
                dValueOf = (j == 0 || jElapsedRealtime - j > 120000) ? null : Double.valueOf(dcVar.g);
            } else {
                float bearing = location.getBearing();
                dcVar.g = bearing;
                dcVar.h = jElapsedRealtime;
                dcVar.i = location;
                dValueOf = Double.valueOf(bearing);
            }
            dcVar.c.execute(new cc(dcVar, latitude, longitude, dValueOf));
        }
    }
}
