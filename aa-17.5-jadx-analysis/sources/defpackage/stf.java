package defpackage;

import android.os.WorkSource;
import androidx.car.app.model.Alert;
import com.google.android.gms.libs.identity.ClientIdentity;
import com.google.android.gms.location.LocationRequest;
import com.google.android.libraries.maps.model.BitmapDescriptorFactory;

/* loaded from: classes2.dex */
public final class stf {
    public boolean a;
    public boolean b;
    public WorkSource c;
    private int d;
    private long e;
    private long f;
    private final long g;
    private long h;
    private final int i;
    private final float j;
    private long k;
    private int l;
    private int m;
    private final ClientIdentity n;

    public stf(LocationRequest locationRequest) {
        this(locationRequest.a, locationRequest.a());
        e(locationRequest.c());
        long j = locationRequest.d;
        spu.an(j >= 0, "maxUpdateDelayMillis must be greater than or equal to 0");
        this.g = j;
        b(locationRequest.e);
        int i = locationRequest.f;
        spu.an(i > 0, "maxUpdates must be greater than 0");
        this.i = i;
        float f = locationRequest.g;
        spu.an(f >= BitmapDescriptorFactory.HUE_RED, "minUpdateDistanceMeters must be greater than or equal to 0");
        this.j = f;
        this.a = locationRequest.h;
        d(locationRequest.b());
        c(locationRequest.j);
        f(locationRequest.k);
        this.b = locationRequest.l;
        this.c = locationRequest.m;
        ClientIdentity clientIdentity = locationRequest.n;
        spu.am(clientIdentity == null || !clientIdentity.a());
        this.n = clientIdentity;
    }

    public final LocationRequest a() {
        int i = this.d;
        long j = this.e;
        long jMin = this.f;
        if (i != 105) {
            jMin = Math.min(jMin, j);
        }
        return new LocationRequest(i, j, jMin, Math.max(this.g, this.e), Long.MAX_VALUE, this.h, this.i, this.j, this.a, this.k, this.l, this.m, this.b, new WorkSource(this.c), this.n);
    }

    public final void b(long j) {
        spu.an(j > 0, "durationMillis must be greater than 0");
        this.h = j;
    }

    public final void c(int i) {
        int i2;
        boolean z;
        if (i == 0 || i == 1) {
            i2 = i;
            z = true;
        } else {
            i2 = 2;
            if (i == 2) {
                z = true;
                i = 2;
            } else {
                i2 = i;
                z = false;
            }
        }
        aclh.o(z, "granularity %d must be a Granularity.GRANULARITY_* constant", new Object[]{Integer.valueOf(i)});
        this.l = i2;
    }

    public final void d(long j) {
        boolean z = true;
        if (j != -1 && j < 0) {
            z = false;
        }
        spu.an(z, "maxUpdateAgeMillis must be greater than or equal to 0, or IMPLICIT_MAX_UPDATE_AGE");
        this.k = j;
    }

    public final void e(long j) {
        boolean z = true;
        if (j != -1 && j < 0) {
            z = false;
        }
        spu.an(z, "minUpdateIntervalMillis must be greater than or equal to 0, or IMPLICIT_MIN_UPDATE_INTERVAL");
        this.f = j;
    }

    public final void f(int i) {
        int i2;
        boolean z;
        if (i == 0 || i == 1) {
            i2 = i;
            z = true;
        } else {
            i2 = 2;
            if (i == 2) {
                z = true;
                i = 2;
            } else {
                i2 = i;
                z = false;
            }
        }
        aclh.o(z, "throttle behavior %d must be a ThrottleBehavior.THROTTLE_* constant", new Object[]{Integer.valueOf(i)});
        this.m = i2;
    }

    public stf(int i, long j) {
        this.d = 102;
        this.f = -1L;
        this.g = 0L;
        this.h = Long.MAX_VALUE;
        this.i = Alert.DURATION_SHOW_INDEFINITELY;
        this.j = BitmapDescriptorFactory.HUE_RED;
        this.a = true;
        this.k = -1L;
        this.l = 0;
        this.m = 0;
        this.b = false;
        this.c = null;
        this.n = null;
        spu.an(j >= 0, "intervalMillis must be greater than or equal to 0");
        this.e = j;
        roc.bb(i);
        this.d = i;
    }
}
