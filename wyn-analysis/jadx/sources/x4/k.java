package x4;

import android.content.Context;
import android.location.Location;
import android.location.LocationManager;
import android.location.OnNmeaMessageListener;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import java.util.Calendar;

/* loaded from: classes.dex */
public final class k {

    /* renamed from: a, reason: collision with root package name */
    public final Context f47710a;

    /* renamed from: b, reason: collision with root package name */
    public final LocationManager f47711b;

    /* renamed from: c, reason: collision with root package name */
    public final h f47712c;

    /* renamed from: d, reason: collision with root package name */
    public final j f47713d;

    /* renamed from: e, reason: collision with root package name */
    public final Nb.b f47714e;

    /* renamed from: f, reason: collision with root package name */
    public String f47715f;

    /* renamed from: g, reason: collision with root package name */
    public double f47716g;

    /* renamed from: h, reason: collision with root package name */
    public double f47717h;

    /* renamed from: i, reason: collision with root package name */
    public Calendar f47718i;

    /* renamed from: j, reason: collision with root package name */
    public boolean f47719j = false;

    /* JADX WARN: Type inference failed for: r2v4, types: [x4.j] */
    public k(Context context, h hVar) {
        this.f47710a = context;
        this.f47712c = hVar;
        this.f47711b = (LocationManager) context.getSystemService("location");
        if (Build.VERSION.SDK_INT >= 24) {
            this.f47713d = new OnNmeaMessageListener() { // from class: x4.j
                @Override // android.location.OnNmeaMessageListener
                public final void onNmeaMessage(String str, long j8) {
                    k kVar = this.f47709a;
                    kVar.getClass();
                    if (str.trim().matches("^\\$..GGA.*$")) {
                        kVar.f47715f = str;
                        kVar.f47718i = Calendar.getInstance();
                    }
                }
            };
            this.f47714e = new Nb.b(this, 1);
        }
    }

    public final void a(Location location) throws NumberFormatException {
        h hVar;
        if (location == null) {
            return;
        }
        if (location.getExtras() == null) {
            location.setExtras(Bundle.EMPTY);
        }
        location.getExtras().putDouble("geolocator_mslSatelliteCount", this.f47716g);
        location.getExtras().putDouble("geolocator_mslSatellitesUsedInFix", this.f47717h);
        if (this.f47715f == null || (hVar = this.f47712c) == null || !this.f47719j) {
            return;
        }
        Calendar calendar = Calendar.getInstance();
        calendar.add(13, -5);
        Calendar calendar2 = this.f47718i;
        if ((calendar2 == null || !calendar2.before(calendar)) && hVar.f47706d) {
            String[] strArrSplit = this.f47715f.split(",");
            String str = strArrSplit[0];
            if (!this.f47715f.trim().matches("^\\$..GGA.*$") || strArrSplit.length <= 9 || strArrSplit[9].isEmpty()) {
                return;
            }
            double d3 = Double.parseDouble(strArrSplit[9]);
            if (location.getExtras() == null) {
                location.setExtras(Bundle.EMPTY);
            }
            location.getExtras().putDouble("geolocator_mslAltitude", d3);
        }
    }

    public final void b() {
        LocationManager locationManager;
        if (this.f47719j || this.f47712c == null || Build.VERSION.SDK_INT < 24 || (locationManager = this.f47711b) == null || this.f47710a.checkSelfPermission("android.permission.ACCESS_FINE_LOCATION") != 0) {
            return;
        }
        locationManager.addNmeaListener(this.f47713d, (Handler) null);
        locationManager.registerGnssStatusCallback(this.f47714e, (Handler) null);
        this.f47719j = true;
    }

    public final void c() {
        LocationManager locationManager;
        if (this.f47712c == null || Build.VERSION.SDK_INT < 24 || (locationManager = this.f47711b) == null) {
            return;
        }
        locationManager.removeNmeaListener(this.f47713d);
        locationManager.unregisterGnssStatusCallback(this.f47714e);
        this.f47719j = false;
    }
}
