package com.google.android.gms.location;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.SystemClock;
import android.os.WorkSource;
import androidx.car.app.model.Alert;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.libs.identity.ClientIdentity;
import com.google.android.libraries.maps.model.BitmapDescriptorFactory;
import defpackage.roc;
import defpackage.spu;
import defpackage.spw;
import defpackage.std;
import defpackage.stg;
import defpackage.sub;
import j$.util.Objects;

/* loaded from: classes2.dex */
public final class LocationRequest extends AbstractSafeParcelable implements ReflectedParcelable {
    public static final Parcelable.Creator<LocationRequest> CREATOR = new stg();
    public int a;
    public long b;
    public long c;
    public long d;
    public long e;
    public int f;
    public float g;
    public boolean h;
    public long i;
    public final int j;
    public final int k;
    public final boolean l;
    public final WorkSource m;
    public final ClientIdentity n;

    public LocationRequest(int i, long j, long j2, long j3, long j4, long j5, int i2, float f, boolean z, long j6, int i3, int i4, boolean z2, WorkSource workSource, ClientIdentity clientIdentity) {
        this.a = i;
        this.b = j;
        this.c = j2;
        this.d = j3;
        this.e = j4 != Long.MAX_VALUE ? Math.min(Math.max(1L, j4 - SystemClock.elapsedRealtime()), j5) : j5;
        this.f = i2;
        this.g = f;
        this.h = z;
        this.i = j6;
        this.j = i3;
        this.k = i4;
        this.l = z2;
        this.m = workSource;
        this.n = clientIdentity;
    }

    private static String g(long j) {
        String string;
        if (j == Long.MAX_VALUE) {
            return "∞";
        }
        StringBuilder sb = sub.b;
        synchronized (sb) {
            sb.setLength(0);
            sub.a(j, sb);
            string = sb.toString();
        }
        return string;
    }

    public final long a() {
        if (this.a == 105) {
            return Long.MAX_VALUE;
        }
        return this.b;
    }

    public final long b() {
        long j = this.i;
        return j == -1 ? this.b : j;
    }

    public final long c() {
        long j = this.c;
        return j == -1 ? this.b / 2 : j;
    }

    public final boolean d() {
        long j = this.d;
        return j > 0 && (j >> 1) >= a();
    }

    public final boolean e() {
        return this.a == 105;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof LocationRequest) {
            LocationRequest locationRequest = (LocationRequest) obj;
            boolean zD = d();
            if (this.a == locationRequest.a && ((e() || this.b == locationRequest.b) && c() == locationRequest.c() && zD == locationRequest.d() && ((!zD || this.d == locationRequest.d) && this.e == locationRequest.e && this.f == locationRequest.f && this.g == locationRequest.g && this.h == locationRequest.h && this.j == locationRequest.j && this.k == locationRequest.k && this.l == locationRequest.l && this.m.equals(locationRequest.m) && Objects.equals(this.n, locationRequest.n)))) {
                return true;
            }
        }
        return false;
    }

    @Deprecated
    public final void f(int i) {
        roc.bb(i);
        this.a = i;
    }

    public final int hashCode() {
        return Objects.hash(Integer.valueOf(this.a), Long.valueOf(a()), Long.valueOf(c()), this.m);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Request[");
        if (e()) {
            sb.append(roc.ba(this.a));
            if (this.d > 0) {
                sb.append("/");
                sub.a(this.d, sb);
            }
        } else {
            sb.append("@");
            if (d()) {
                sub.a(a(), sb);
                sb.append("/");
                sub.a(this.d, sb);
            } else {
                sub.a(a(), sb);
            }
            sb.append(" ");
            sb.append(roc.ba(this.a));
        }
        if (e() || this.c != -1) {
            sb.append(", minUpdateInterval=");
            sb.append(g(this.c));
        }
        if (this.g > 0.0d) {
            sb.append(", minUpdateDistance=");
            sb.append(this.g);
        }
        if (this.i != -1) {
            sb.append(", maxUpdateAge=");
            sb.append(g(this.i));
        }
        if (this.e != Long.MAX_VALUE) {
            sb.append(", duration=");
            sub.a(this.e, sb);
        }
        if (this.f != Integer.MAX_VALUE) {
            sb.append(", maxUpdates=");
            sb.append(this.f);
        }
        int i = this.k;
        if (i != 0) {
            sb.append(", ");
            sb.append(roc.aZ(i));
        }
        int i2 = this.j;
        if (i2 != 0) {
            sb.append(", ");
            sb.append(std.b(i2));
        }
        if (this.h) {
            sb.append(", waitForAccurateLocation");
        }
        if (this.l) {
            sb.append(", bypass");
        }
        WorkSource workSource = this.m;
        if (!spw.c(workSource)) {
            sb.append(", ");
            sb.append(workSource);
        }
        ClientIdentity clientIdentity = this.n;
        if (clientIdentity != null) {
            sb.append(", impersonation=");
            sb.append(clientIdentity);
        }
        sb.append(']');
        return sb.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iL = spu.l(parcel, 20293);
        spu.r(parcel, 1, this.a);
        spu.s(parcel, 2, a());
        spu.s(parcel, 3, c());
        spu.r(parcel, 6, this.f);
        spu.q(parcel, 7, this.g);
        spu.s(parcel, 8, this.d);
        spu.n(parcel, 9, this.h);
        spu.s(parcel, 10, this.e);
        spu.s(parcel, 11, b());
        spu.r(parcel, 12, this.j);
        spu.r(parcel, 13, this.k);
        spu.n(parcel, 15, this.l);
        spu.E(parcel, 16, this.m, i);
        spu.E(parcel, 17, this.n, i);
        spu.m(parcel, iL);
    }

    @Deprecated
    public LocationRequest() {
        this(102, 3600000L, 600000L, 0L, Long.MAX_VALUE, Long.MAX_VALUE, Alert.DURATION_SHOW_INDEFINITELY, BitmapDescriptorFactory.HUE_RED, true, 3600000L, 0, 0, false, new WorkSource(), null);
    }
}
