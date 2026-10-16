package com.waze.cf.a;

import android.location.Location;
import android.location.LocationListener;
import android.os.Bundle;
import com.waze.ap.b.o;
import com.waze.location.LocationSensorListener;
import com.waze.location.bf;
import com.waze.location.bh;
import com.waze.location.y;
import com.waze.shared_infra.i.e;
import com.waze.web.r;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class a extends LocationSensorListener implements LocationListener, bh {

    /* renamed from: a, reason: collision with root package name */
    final y f22176a = (y) r.h(y.class);

    /* renamed from: b, reason: collision with root package name */
    private final e f22177b = com.waze.shared_infra.i.a.b();

    @Override // android.location.LocationListener
    public final void onLocationChanged(Location location) {
        this.f22176a.d(location, bf.f25345c);
    }

    @Override // android.location.LocationListener
    public final void onProviderDisabled(String str) {
    }

    @Override // android.location.LocationListener
    public final void onProviderEnabled(String str) {
    }

    @Override // android.location.LocationListener
    public final void onStatusChanged(String str, int i2, Bundle bundle) {
        this.f22177b.a("NativeLocListener: onStatusChanged: " + str + " status " + i2);
    }

    @Override // com.waze.location.LocationSensorListener
    protected final synchronized void setLastLocation(Location location, long j2) {
        if (o.e(location.getProvider())) {
            this.mLastGpsFixTimeForWatchdogMs = j2;
        }
        super.setLastLocation(location, j2);
    }

    @Override // com.waze.location.LocationSensorListener
    protected final void setMockGpsStatusIfNeeded(Location location) {
        if (this.mbLoggedIn && !this.mbReportedMockLocation && location.isFromMockProvider()) {
            this.f22177b.a("NativeLocListener: Location is from mock provider: ".concat(String.valueOf(location.getProvider())));
            setGpsFakeStatusNTV();
            this.mbReportedMockLocation = true;
        }
    }

    @Override // com.waze.location.LocationSensorListener, com.waze.location.o
    public final void start() {
        a aVar;
        try {
            stop();
            if (checkPermissions()) {
                this.f22177b.a("NativeLocListener: Starting location listener");
                if (this.mLocationManager.getProvider("network") != null) {
                    aVar = this;
                    try {
                        this.mLocationManager.requestLocationUpdates("network", 0L, 0.0f, aVar);
                    } catch (Exception e2) {
                        e = e2;
                        aVar.f22177b.b("NativeLocListener: Error starting location listener".concat(String.valueOf(e.getMessage())));
                        return;
                    }
                } else {
                    aVar = this;
                }
                if (aVar.mLocationManager.getProvider("gps") != null) {
                    Bundle bundle = new Bundle();
                    aVar.mLocationManager.sendExtraCommand("gps", "force_xtra_injection", bundle);
                    aVar.mLocationManager.sendExtraCommand("gps", "force_time_injection", bundle);
                    a aVar2 = aVar;
                    try {
                        aVar2.mLocationManager.requestLocationUpdates("gps", 0L, 0.0f, aVar2);
                        aVar = aVar2;
                    } catch (Exception e3) {
                        e = e3;
                        aVar = aVar2;
                        aVar.f22177b.b("NativeLocListener: Error starting location listener".concat(String.valueOf(e.getMessage())));
                        return;
                    }
                }
                aVar.mStarted = true;
                aVar.mHasGpsForWatchdog = false;
                aVar.mLastGpsFixTimeForWatchdogMs = System.currentTimeMillis();
                super.start();
            }
        } catch (Exception e4) {
            e = e4;
            aVar = this;
        }
    }

    @Override // com.waze.location.LocationSensorListener, com.waze.location.o
    public final void stop() {
        if (this.mStarted) {
            this.f22177b.a("NativeLocListener: Stopping location listener");
            this.mLocationManager.removeUpdates(this);
            this.mStarted = false;
        }
        super.stop();
    }
}
