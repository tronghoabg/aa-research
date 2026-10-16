package com.google.android.gms.location;

/* JADX INFO: loaded from: classes2.dex */
public final class LocationRequest extends com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable implements com.google.android.gms.common.internal.ReflectedParcelable {
    public static final android.os.Parcelable.Creator<com.google.android.gms.location.LocationRequest> CREATOR = new defpackage.sue();
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
    public final android.os.WorkSource m;
    public final com.google.android.gms.libs.identity.ClientIdentity n;

    public LocationRequest(int i, long j, long j2, long j3, long j4, long j5, int i2, float f, boolean z, long j6, int i3, int i4, boolean z2, android.os.WorkSource workSource, com.google.android.gms.libs.identity.ClientIdentity clientIdentity) {
        this.a = i;
        this.b = j;
        this.c = j2;
        this.d = j3;
        this.e = j4 != Long.MAX_VALUE ? java.lang.Math.min(java.lang.Math.max(1L, j4 - android.os.SystemClock.elapsedRealtime()), j5) : j5;
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

    private static java.lang.String g(long j) {
        java.lang.String string;
        if (j == Long.MAX_VALUE) {
            return "∞";
        }
        java.lang.StringBuilder sb = defpackage.suz.b;
        synchronized (sb) {
            sb.setLength(0);
            defpackage.suz.a(j, sb);
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

    public final boolean equals(java.lang.Object obj) {
        if (obj instanceof com.google.android.gms.location.LocationRequest) {
            com.google.android.gms.location.LocationRequest locationRequest = (com.google.android.gms.location.LocationRequest) obj;
            boolean zD = d();
            if (this.a == locationRequest.a && ((e() || this.b == locationRequest.b) && c() == locationRequest.c() && zD == locationRequest.d() && ((!zD || this.d == locationRequest.d) && this.e == locationRequest.e && this.f == locationRequest.f && this.g == locationRequest.g && this.h == locationRequest.h && this.j == locationRequest.j && this.k == locationRequest.k && this.l == locationRequest.l && this.m.equals(locationRequest.m) && j$.util.Objects.equals(this.n, locationRequest.n)))) {
                return true;
            }
        }
        return false;
    }

    @java.lang.Deprecated
    public final void f(int i) {
        defpackage.sub.e(i);
        this.a = i;
    }

    public final int hashCode() {
        return j$.util.Objects.hash(java.lang.Integer.valueOf(this.a), java.lang.Long.valueOf(a()), java.lang.Long.valueOf(c()), this.m);
    }

    public final java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append("Request[");
        if (e()) {
            sb.append(defpackage.sub.d(this.a));
            if (this.d > 0) {
                sb.append("/");
                defpackage.suz.a(this.d, sb);
            }
        } else {
            sb.append("@");
            if (d()) {
                defpackage.suz.a(a(), sb);
                sb.append("/");
                defpackage.suz.a(this.d, sb);
            } else {
                defpackage.suz.a(a(), sb);
            }
            sb.append(" ");
            sb.append(defpackage.sub.d(this.a));
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
            defpackage.suz.a(this.e, sb);
        }
        if (this.f != Integer.MAX_VALUE) {
            sb.append(", maxUpdates=");
            sb.append(this.f);
        }
        int i = this.k;
        if (i != 0) {
            sb.append(", ");
            sb.append(defpackage.sub.c(i));
        }
        int i2 = this.j;
        if (i2 != 0) {
            sb.append(", ");
            sb.append(defpackage.sub.b(i2));
        }
        if (this.h) {
            sb.append(", waitForAccurateLocation");
        }
        if (this.l) {
            sb.append(", bypass");
        }
        android.os.WorkSource workSource = this.m;
        if (!defpackage.squ.c(workSource)) {
            sb.append(", ");
            sb.append(workSource);
        }
        com.google.android.gms.libs.identity.ClientIdentity clientIdentity = this.n;
        if (clientIdentity != null) {
            sb.append(", impersonation=");
            sb.append(clientIdentity);
        }
        sb.append(']');
        return sb.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(android.os.Parcel parcel, int i) {
        int iP = defpackage.sqs.p(parcel, 20293);
        defpackage.sqs.v(parcel, 1, this.a);
        defpackage.sqs.w(parcel, 2, a());
        defpackage.sqs.w(parcel, 3, c());
        defpackage.sqs.v(parcel, 6, this.f);
        defpackage.sqs.u(parcel, 7, this.g);
        defpackage.sqs.w(parcel, 8, this.d);
        defpackage.sqs.r(parcel, 9, this.h);
        defpackage.sqs.w(parcel, 10, this.e);
        defpackage.sqs.w(parcel, 11, b());
        defpackage.sqs.v(parcel, 12, this.j);
        defpackage.sqs.v(parcel, 13, this.k);
        defpackage.sqs.r(parcel, 15, this.l);
        defpackage.sqs.I(parcel, 16, this.m, i);
        defpackage.sqs.I(parcel, 17, this.n, i);
        defpackage.sqs.q(parcel, iP);
    }

    @java.lang.Deprecated
    public LocationRequest() {
        this(102, 3600000L, 600000L, 0L, Long.MAX_VALUE, Long.MAX_VALUE, androidx.car.app.model.Alert.DURATION_SHOW_INDEFINITELY, com.google.android.libraries.maps.model.BitmapDescriptorFactory.HUE_RED, true, 3600000L, 0, 0, false, new android.os.WorkSource(), null);
    }
}
