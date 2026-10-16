package com.google.android.gms.location;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.SystemClock;
import android.os.WorkSource;
import androidx.camera.video.AudioStats;
import androidx.credentials.exceptions.publickeycredential.DomExceptionUtils;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.bb;
import j$.util.Objects;
import java.util.Arrays;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
public final class LocationRequest extends com.google.android.gms.common.internal.a.a implements ReflectedParcelable {
    public static final Parcelable.Creator<LocationRequest> CREATOR = new c();

    /* renamed from: a, reason: collision with root package name */
    private int f5646a;

    /* renamed from: b, reason: collision with root package name */
    private long f5647b;

    /* renamed from: c, reason: collision with root package name */
    private long f5648c;

    /* renamed from: d, reason: collision with root package name */
    private long f5649d;

    /* renamed from: e, reason: collision with root package name */
    private long f5650e;

    /* renamed from: f, reason: collision with root package name */
    private int f5651f;

    /* renamed from: g, reason: collision with root package name */
    private float f5652g;

    /* renamed from: h, reason: collision with root package name */
    private boolean f5653h;

    /* renamed from: i, reason: collision with root package name */
    private long f5654i;

    /* renamed from: j, reason: collision with root package name */
    private final int f5655j;

    /* renamed from: k, reason: collision with root package name */
    private final int f5656k;

    /* renamed from: l, reason: collision with root package name */
    private final boolean f5657l;
    private final WorkSource m;
    private final com.google.android.gms.k.b.a n;

    LocationRequest(int i2, long j2, long j3, long j4, long j5, long j6, int i3, float f2, boolean z, long j7, int i4, int i5, boolean z2, WorkSource workSource, com.google.android.gms.k.b.a aVar) {
        this.f5646a = i2;
        this.f5647b = j2;
        this.f5648c = j3;
        this.f5649d = j4;
        this.f5650e = j5 != Long.MAX_VALUE ? Math.min(Math.max(1L, j5 - SystemClock.elapsedRealtime()), j6) : j6;
        this.f5651f = i3;
        this.f5652g = f2;
        this.f5653h = z;
        this.f5654i = j7;
        this.f5655j = i4;
        this.f5656k = i5;
        this.f5657l = z2;
        this.m = workSource;
        this.n = aVar;
    }

    private static String e(long j2) {
        return j2 == Long.MAX_VALUE ? "∞" : com.google.android.gms.location.b.a.a(j2);
    }

    public final long a() {
        if (this.f5646a == 105) {
            return Long.MAX_VALUE;
        }
        return this.f5647b;
    }

    public final long b() {
        long j2 = this.f5648c;
        return j2 == -1 ? this.f5647b / 2 : j2;
    }

    public final boolean c() {
        long j2 = this.f5649d;
        return j2 > 0 && (j2 >> 1) >= a();
    }

    public final boolean d() {
        return this.f5646a == 105;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof LocationRequest) {
            LocationRequest locationRequest = (LocationRequest) obj;
            boolean zC = c();
            if (this.f5646a == locationRequest.f5646a && ((d() || this.f5647b == locationRequest.f5647b) && b() == locationRequest.b() && zC == locationRequest.c() && ((!zC || this.f5649d == locationRequest.f5649d) && this.f5650e == locationRequest.f5650e && this.f5651f == locationRequest.f5651f && this.f5652g == locationRequest.f5652g && this.f5653h == locationRequest.f5653h && this.f5655j == locationRequest.f5655j && this.f5656k == locationRequest.f5656k && this.f5657l == locationRequest.f5657l && this.m.equals(locationRequest.m) && Objects.equals(this.n, locationRequest.n)))) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.f5646a), Long.valueOf(a()), Long.valueOf(b()), this.m});
    }

    public final String toString() {
        String str;
        String str2;
        StringBuilder sb = new StringBuilder();
        sb.append("Request[");
        if (d()) {
            sb.append(com.google.android.gms.k.f.a.b(this.f5646a));
            if (this.f5649d > 0) {
                sb.append(DomExceptionUtils.SEPARATOR);
                com.google.android.gms.location.b.a.b(this.f5649d, sb);
            }
        } else {
            sb.append("@");
            if (c()) {
                com.google.android.gms.location.b.a.b(a(), sb);
                sb.append(DomExceptionUtils.SEPARATOR);
                com.google.android.gms.location.b.a.b(this.f5649d, sb);
            } else {
                com.google.android.gms.location.b.a.b(a(), sb);
            }
            sb.append(" ");
            sb.append(com.google.android.gms.k.f.a.b(this.f5646a));
        }
        if (d() || this.f5648c != -1) {
            sb.append(", minUpdateInterval=");
            sb.append(e(this.f5648c));
        }
        if (this.f5652g > AudioStats.AUDIO_AMPLITUDE_NONE) {
            sb.append(", minUpdateDistance=");
            sb.append(this.f5652g);
        }
        if (this.f5654i != -1) {
            sb.append(", maxUpdateAge=");
            sb.append(e(this.f5654i));
        }
        if (this.f5650e != Long.MAX_VALUE) {
            sb.append(", duration=");
            com.google.android.gms.location.b.a.b(this.f5650e, sb);
        }
        if (this.f5651f != Integer.MAX_VALUE) {
            sb.append(", maxUpdates=");
            sb.append(this.f5651f);
        }
        int i2 = this.f5656k;
        if (i2 != 0) {
            sb.append(", ");
            if (i2 == 0) {
                str2 = "THROTTLE_BACKGROUND";
            } else if (i2 == 1) {
                str2 = "THROTTLE_ALWAYS";
            } else {
                if (i2 != 2) {
                    throw new IllegalArgumentException();
                }
                str2 = "THROTTLE_NEVER";
            }
            sb.append(str2);
        }
        int i3 = this.f5655j;
        if (i3 != 0) {
            sb.append(", ");
            if (i3 == 0) {
                str = "GRANULARITY_PERMISSION_LEVEL";
            } else if (i3 == 1) {
                str = "GRANULARITY_COARSE";
            } else {
                if (i3 != 2) {
                    throw new IllegalArgumentException();
                }
                str = "GRANULARITY_FINE";
            }
            sb.append(str);
        }
        if (this.f5653h) {
            sb.append(", waitForAccurateLocation");
        }
        if (this.f5657l) {
            sb.append(", bypass");
        }
        WorkSource workSource = this.m;
        if (!com.google.android.gms.common.util.i.c(workSource)) {
            sb.append(", ");
            sb.append(workSource);
        }
        com.google.android.gms.k.b.a aVar = this.n;
        if (aVar != null) {
            sb.append(", impersonation=");
            sb.append(aVar);
        }
        sb.append(']');
        return sb.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i2) {
        int iD = bb.d(parcel);
        bb.g(parcel, 1, this.f5646a);
        bb.h(parcel, 2, a());
        bb.h(parcel, 3, b());
        bb.g(parcel, 6, this.f5651f);
        bb.p(parcel, this.f5652g);
        bb.h(parcel, 8, this.f5649d);
        bb.f(parcel, 9, this.f5653h);
        bb.h(parcel, 10, this.f5650e);
        long j2 = this.f5654i;
        if (j2 == -1) {
            j2 = this.f5647b;
        }
        bb.h(parcel, 11, j2);
        bb.g(parcel, 12, this.f5655j);
        bb.g(parcel, 13, this.f5656k);
        bb.f(parcel, 15, this.f5657l);
        bb.t(parcel, 16, this.m, i2);
        bb.t(parcel, 17, this.n, i2);
        bb.e(parcel, iD);
    }

    @Deprecated
    public LocationRequest() {
        this(102, 3600000L, 600000L, 0L, Long.MAX_VALUE, Long.MAX_VALUE, Integer.MAX_VALUE, 0.0f, true, 3600000L, 0, 0, false, new WorkSource(), null);
    }
}
