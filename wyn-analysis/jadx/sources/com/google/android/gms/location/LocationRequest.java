package com.google.android.gms.location;

import N0.a;
import a.AbstractC1304a;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.SystemClock;
import android.os.WorkSource;
import com.bytedance.sdk.openadsdk.TTAdConstant;
import com.google.android.gms.common.api.f;
import com.google.android.gms.common.internal.AbstractC1732v;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.internal.identity.ClientIdentity;
import com.google.android.gms.internal.identity.zzeo;
import com.unity3d.services.UnityAdsConstants;
import f7.AbstractC2614a;
import java.util.Arrays;
import n7.g;
import org.apache.tika.utils.StringUtils;
import w7.C4381i;
import x7.z;

/* loaded from: classes4.dex */
public final class LocationRequest extends AbstractC2614a implements ReflectedParcelable {
    public static final Parcelable.Creator<LocationRequest> CREATOR = new C4381i(11);

    /* renamed from: a, reason: collision with root package name */
    public int f26726a;

    /* renamed from: b, reason: collision with root package name */
    public long f26727b;

    /* renamed from: c, reason: collision with root package name */
    public long f26728c;

    /* renamed from: d, reason: collision with root package name */
    public final long f26729d;

    /* renamed from: e, reason: collision with root package name */
    public final long f26730e;

    /* renamed from: f, reason: collision with root package name */
    public final int f26731f;

    /* renamed from: g, reason: collision with root package name */
    public float f26732g;

    /* renamed from: h, reason: collision with root package name */
    public final boolean f26733h;

    /* renamed from: i, reason: collision with root package name */
    public long f26734i;

    /* renamed from: j, reason: collision with root package name */
    public final int f26735j;
    public final int k;

    /* renamed from: l, reason: collision with root package name */
    public final boolean f26736l;

    /* renamed from: m, reason: collision with root package name */
    public final WorkSource f26737m;

    /* renamed from: n, reason: collision with root package name */
    public final ClientIdentity f26738n;

    public LocationRequest(int i5, long j8, long j10, long j11, long j12, long j13, int i10, float f10, boolean z2, long j14, int i11, int i12, boolean z10, WorkSource workSource, ClientIdentity clientIdentity) {
        this.f26726a = i5;
        if (i5 == 105) {
            this.f26727b = Long.MAX_VALUE;
        } else {
            this.f26727b = j8;
        }
        this.f26728c = j10;
        this.f26729d = j11;
        this.f26730e = j12 == Long.MAX_VALUE ? j13 : Math.min(Math.max(1L, j12 - SystemClock.elapsedRealtime()), j13);
        this.f26731f = i10;
        this.f26732g = f10;
        this.f26733h = z2;
        this.f26734i = j14 != -1 ? j14 : j8;
        this.f26735j = i11;
        this.k = i12;
        this.f26736l = z10;
        this.f26737m = workSource;
        this.f26738n = clientIdentity;
    }

    public static LocationRequest V() {
        return new LocationRequest(102, 3600000L, TTAdConstant.AD_MAX_EVENT_TIME, 0L, Long.MAX_VALUE, Long.MAX_VALUE, f.API_PRIORITY_OTHER, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, true, 3600000L, 0, 0, false, new WorkSource(), null);
    }

    public final boolean W() {
        long j8 = this.f26729d;
        return j8 > 0 && (j8 >> 1) >= this.f26727b;
    }

    public final void X(long j8) {
        AbstractC1732v.a("intervalMillis must be greater than or equal to 0", j8 >= 0);
        long j10 = this.f26728c;
        long j11 = this.f26727b;
        if (j10 == j11 / 6) {
            this.f26728c = j8 / 6;
        }
        if (this.f26734i == j11) {
            this.f26734i = j8;
        }
        this.f26727b = j8;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof LocationRequest)) {
            return false;
        }
        LocationRequest locationRequest = (LocationRequest) obj;
        int i5 = this.f26726a;
        if (i5 != locationRequest.f26726a) {
            return false;
        }
        if ((i5 == 105 || this.f26727b == locationRequest.f26727b) && this.f26728c == locationRequest.f26728c && W() == locationRequest.W()) {
            return (!W() || this.f26729d == locationRequest.f26729d) && this.f26730e == locationRequest.f26730e && this.f26731f == locationRequest.f26731f && this.f26732g == locationRequest.f26732g && this.f26733h == locationRequest.f26733h && this.f26735j == locationRequest.f26735j && this.k == locationRequest.k && this.f26736l == locationRequest.f26736l && this.f26737m.equals(locationRequest.f26737m) && AbstractC1732v.m(this.f26738n, locationRequest.f26738n);
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.f26726a), Long.valueOf(this.f26727b), Long.valueOf(this.f26728c), this.f26737m});
    }

    public final String toString() {
        String str;
        StringBuilder sbJ = a.j("Request[");
        int i5 = this.f26726a;
        boolean z2 = i5 == 105;
        long j8 = this.f26729d;
        if (z2) {
            sbJ.append(z.c(i5));
            if (j8 > 0) {
                sbJ.append("/");
                zzeo.zzc(j8, sbJ);
            }
        } else {
            sbJ.append("@");
            if (W()) {
                zzeo.zzc(this.f26727b, sbJ);
                sbJ.append("/");
                zzeo.zzc(j8, sbJ);
            } else {
                zzeo.zzc(this.f26727b, sbJ);
            }
            sbJ.append(StringUtils.SPACE);
            sbJ.append(z.c(this.f26726a));
        }
        if (this.f26726a == 105 || this.f26728c != this.f26727b) {
            sbJ.append(", minUpdateInterval=");
            long j10 = this.f26728c;
            sbJ.append(j10 == Long.MAX_VALUE ? "∞" : zzeo.zzb(j10));
        }
        if (this.f26732g > 0.0d) {
            sbJ.append(", minUpdateDistance=");
            sbJ.append(this.f26732g);
        }
        if (!(this.f26726a == 105) ? this.f26734i != this.f26727b : this.f26734i != Long.MAX_VALUE) {
            sbJ.append(", maxUpdateAge=");
            long j11 = this.f26734i;
            sbJ.append(j11 != Long.MAX_VALUE ? zzeo.zzb(j11) : "∞");
        }
        long j12 = this.f26730e;
        if (j12 != Long.MAX_VALUE) {
            sbJ.append(", duration=");
            zzeo.zzc(j12, sbJ);
        }
        int i10 = this.f26731f;
        if (i10 != Integer.MAX_VALUE) {
            sbJ.append(", maxUpdates=");
            sbJ.append(i10);
        }
        int i11 = this.k;
        if (i11 != 0) {
            sbJ.append(", ");
            if (i11 == 0) {
                str = "THROTTLE_BACKGROUND";
            } else if (i11 == 1) {
                str = "THROTTLE_ALWAYS";
            } else {
                if (i11 != 2) {
                    throw new IllegalArgumentException();
                }
                str = "THROTTLE_NEVER";
            }
            sbJ.append(str);
        }
        int i12 = this.f26735j;
        if (i12 != 0) {
            sbJ.append(", ");
            sbJ.append(z.d(i12));
        }
        if (this.f26733h) {
            sbJ.append(", waitForAccurateLocation");
        }
        if (this.f26736l) {
            sbJ.append(", bypass");
        }
        WorkSource workSource = this.f26737m;
        if (!g.c(workSource)) {
            sbJ.append(", ");
            sbJ.append(workSource);
        }
        ClientIdentity clientIdentity = this.f26738n;
        if (clientIdentity != null) {
            sbJ.append(", impersonation=");
            sbJ.append(clientIdentity);
        }
        sbJ.append(']');
        return sbJ.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i5) {
        int iL0 = AbstractC1304a.l0(20293, parcel);
        int i10 = this.f26726a;
        AbstractC1304a.k0(parcel, 1, 4);
        parcel.writeInt(i10);
        long j8 = this.f26727b;
        AbstractC1304a.k0(parcel, 2, 8);
        parcel.writeLong(j8);
        long j10 = this.f26728c;
        AbstractC1304a.k0(parcel, 3, 8);
        parcel.writeLong(j10);
        AbstractC1304a.k0(parcel, 6, 4);
        parcel.writeInt(this.f26731f);
        float f10 = this.f26732g;
        AbstractC1304a.k0(parcel, 7, 4);
        parcel.writeFloat(f10);
        AbstractC1304a.k0(parcel, 8, 8);
        parcel.writeLong(this.f26729d);
        AbstractC1304a.k0(parcel, 9, 4);
        parcel.writeInt(this.f26733h ? 1 : 0);
        AbstractC1304a.k0(parcel, 10, 8);
        parcel.writeLong(this.f26730e);
        long j11 = this.f26734i;
        AbstractC1304a.k0(parcel, 11, 8);
        parcel.writeLong(j11);
        AbstractC1304a.k0(parcel, 12, 4);
        parcel.writeInt(this.f26735j);
        AbstractC1304a.k0(parcel, 13, 4);
        parcel.writeInt(this.k);
        AbstractC1304a.k0(parcel, 15, 4);
        parcel.writeInt(this.f26736l ? 1 : 0);
        AbstractC1304a.Z(parcel, 16, this.f26737m, i5, false);
        AbstractC1304a.Z(parcel, 17, this.f26738n, i5, false);
        AbstractC1304a.m0(iL0, parcel);
    }
}
