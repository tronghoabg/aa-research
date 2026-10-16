package com.google.android.gms.internal.identity;

import A.AbstractC0213f;
import N0.a;
import a.AbstractC1304a;
import android.os.Parcel;
import android.os.Parcelable;
import com.unity3d.services.UnityAdsConstants;
import f7.AbstractC2614a;
import java.util.Locale;
import x7.InterfaceC4497i;

/* loaded from: classes.dex */
public final class zzek extends AbstractC2614a implements InterfaceC4497i {
    public static final Parcelable.Creator<zzek> CREATOR = new zzel();
    private final String zza;
    private final long zzb;
    private final short zzc;
    private final double zzd;
    private final double zze;
    private final float zzf;
    private final int zzg;
    private final int zzh;
    private final int zzi;

    public zzek(String str, int i5, short s10, double d3, double d5, float f10, long j8, int i10, int i11) {
        if (str == null || str.length() > 100) {
            throw new IllegalArgumentException("requestId is null or too long: ".concat(String.valueOf(str)));
        }
        if (f10 <= UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
            StringBuilder sb2 = new StringBuilder(String.valueOf(f10).length() + 16);
            sb2.append("invalid radius: ");
            sb2.append(f10);
            throw new IllegalArgumentException(sb2.toString());
        }
        if (d3 > 90.0d || d3 < -90.0d) {
            StringBuilder sb3 = new StringBuilder(String.valueOf(d3).length() + 18);
            sb3.append("invalid latitude: ");
            sb3.append(d3);
            throw new IllegalArgumentException(sb3.toString());
        }
        if (d5 > 180.0d || d5 < -180.0d) {
            StringBuilder sb4 = new StringBuilder(String.valueOf(d5).length() + 19);
            sb4.append("invalid longitude: ");
            sb4.append(d5);
            throw new IllegalArgumentException(sb4.toString());
        }
        int i12 = i5 & 7;
        if (i12 == 0) {
            throw new IllegalArgumentException(a.d(i5, "No supported transition specified: ", new StringBuilder(String.valueOf(i5).length() + 35)));
        }
        this.zzc = s10;
        this.zza = str;
        this.zzd = d3;
        this.zze = d5;
        this.zzf = f10;
        this.zzb = j8;
        this.zzg = i12;
        this.zzh = i10;
        this.zzi = i11;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof zzek) {
            zzek zzekVar = (zzek) obj;
            if (this.zzf == zzekVar.zzf && this.zzd == zzekVar.zzd && this.zze == zzekVar.zze && this.zzc == zzekVar.zzc && this.zzg == zzekVar.zzg) {
                return true;
            }
        }
        return false;
    }

    public final long getExpirationTime() {
        return this.zzb;
    }

    public final double getLatitude() {
        return this.zzd;
    }

    public final int getLoiteringDelay() {
        return this.zzi;
    }

    public final double getLongitude() {
        return this.zze;
    }

    public final int getNotificationResponsiveness() {
        return this.zzh;
    }

    public final float getRadius() {
        return this.zzf;
    }

    public final String getRequestId() {
        return this.zza;
    }

    public final int getTransitionTypes() {
        return this.zzg;
    }

    public final int hashCode() {
        long jDoubleToLongBits = Double.doubleToLongBits(this.zzd);
        long j8 = jDoubleToLongBits ^ (jDoubleToLongBits >>> 32);
        long jDoubleToLongBits2 = Double.doubleToLongBits(this.zze);
        return ((AbstractC0213f.c(this.zzf, (((((int) j8) + 31) * 31) + ((int) (jDoubleToLongBits2 ^ (jDoubleToLongBits2 >>> 32)))) * 31, 31) + this.zzc) * 31) + this.zzg;
    }

    public final String toString() {
        short s10 = this.zzc;
        return String.format(Locale.US, "Geofence[%s id:%s transitions:%d %.6f, %.6f %.0fm, resp=%ds, dwell=%dms, @%d]", s10 != -1 ? s10 != 1 ? "UNKNOWN" : "CIRCLE" : "INVALID", this.zza.replaceAll("\\p{C}", "?"), Integer.valueOf(this.zzg), Double.valueOf(this.zzd), Double.valueOf(this.zze), Float.valueOf(this.zzf), Integer.valueOf(this.zzh / 1000), Integer.valueOf(this.zzi), Long.valueOf(this.zzb));
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i5) {
        String str = this.zza;
        int iL0 = AbstractC1304a.l0(20293, parcel);
        AbstractC1304a.a0(parcel, 1, str, false);
        long j8 = this.zzb;
        AbstractC1304a.k0(parcel, 2, 8);
        parcel.writeLong(j8);
        short s10 = this.zzc;
        AbstractC1304a.k0(parcel, 3, 4);
        parcel.writeInt(s10);
        double d3 = this.zzd;
        AbstractC1304a.k0(parcel, 4, 8);
        parcel.writeDouble(d3);
        double d5 = this.zze;
        AbstractC1304a.k0(parcel, 5, 8);
        parcel.writeDouble(d5);
        float f10 = this.zzf;
        AbstractC1304a.k0(parcel, 6, 4);
        parcel.writeFloat(f10);
        int i10 = this.zzg;
        AbstractC1304a.k0(parcel, 7, 4);
        parcel.writeInt(i10);
        int i11 = this.zzh;
        AbstractC1304a.k0(parcel, 8, 4);
        parcel.writeInt(i11);
        int i12 = this.zzi;
        AbstractC1304a.k0(parcel, 9, 4);
        parcel.writeInt(i12);
        AbstractC1304a.m0(iL0, parcel);
    }
}
