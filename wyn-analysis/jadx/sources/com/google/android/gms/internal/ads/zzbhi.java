package com.google.android.gms.internal.ads;

import a.AbstractC1304a;
import android.net.Uri;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.unity3d.services.UnityAdsConstants;
import f7.AbstractC2614a;
import java.util.List;

/* loaded from: classes3.dex */
public final class zzbhi extends AbstractC2614a {
    public static final Parcelable.Creator<zzbhi> CREATOR = new zzbhj();
    public final String zza;
    public final long zzb;
    public final String zzc;
    public final String zzd;
    public final String zze;
    public final Bundle zzf;
    public final boolean zzg;
    public long zzh;
    public String zzi;
    public int zzj;

    public zzbhi(String str, long j8, String str2, String str3, String str4, Bundle bundle, boolean z2, long j10, String str5, int i5) {
        this.zza = str;
        this.zzb = j8;
        this.zzc = str2 == null ? "" : str2;
        this.zzd = str3 == null ? "" : str3;
        this.zze = str4 == null ? "" : str4;
        this.zzf = bundle == null ? new Bundle() : bundle;
        this.zzg = z2;
        this.zzh = j10;
        this.zzi = str5;
        this.zzj = i5;
    }

    public static zzbhi zza(Uri uri) {
        try {
            if (!"gcache".equals(uri.getScheme())) {
                return null;
            }
            List<String> pathSegments = uri.getPathSegments();
            if (pathSegments.size() != 2) {
                int size = pathSegments.size();
                StringBuilder sb2 = new StringBuilder(String.valueOf(size).length() + 51);
                sb2.append("Expected 2 path parts for namespace and id, found :");
                sb2.append(size);
                String string = sb2.toString();
                int i5 = G6.L.f4523b;
                H6.l.f(string);
                return null;
            }
            String str = pathSegments.get(0);
            String str2 = pathSegments.get(1);
            String host = uri.getHost();
            String queryParameter = uri.getQueryParameter("url");
            boolean zEquals = UnityAdsConstants.OpenMeasurement.OM_PARTNER_VERSION.equals(uri.getQueryParameter("read_only"));
            String queryParameter2 = uri.getQueryParameter("expiration");
            long j8 = queryParameter2 == null ? 0L : Long.parseLong(queryParameter2);
            Bundle bundle = new Bundle();
            for (String str3 : uri.getQueryParameterNames()) {
                if (str3.startsWith("tag.")) {
                    bundle.putString(str3.substring(4), uri.getQueryParameter(str3));
                }
            }
            return new zzbhi(queryParameter, j8, host, str, str2, bundle, zEquals, 0L, "", 0);
        } catch (NullPointerException e7) {
            e = e7;
            int i10 = G6.L.f4523b;
            H6.l.g("Unable to parse Uri into cache offering.", e);
            return null;
        } catch (NumberFormatException e10) {
            e = e10;
            int i102 = G6.L.f4523b;
            H6.l.g("Unable to parse Uri into cache offering.", e);
            return null;
        }
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i5) {
        String str = this.zza;
        int iL0 = AbstractC1304a.l0(20293, parcel);
        AbstractC1304a.a0(parcel, 2, str, false);
        long j8 = this.zzb;
        AbstractC1304a.k0(parcel, 3, 8);
        parcel.writeLong(j8);
        AbstractC1304a.a0(parcel, 4, this.zzc, false);
        AbstractC1304a.a0(parcel, 5, this.zzd, false);
        AbstractC1304a.a0(parcel, 6, this.zze, false);
        AbstractC1304a.S(parcel, 7, this.zzf, false);
        boolean z2 = this.zzg;
        AbstractC1304a.k0(parcel, 8, 4);
        parcel.writeInt(z2 ? 1 : 0);
        long j10 = this.zzh;
        AbstractC1304a.k0(parcel, 9, 8);
        parcel.writeLong(j10);
        AbstractC1304a.a0(parcel, 10, this.zzi, false);
        int i10 = this.zzj;
        AbstractC1304a.k0(parcel, 11, 4);
        parcel.writeInt(i10);
        AbstractC1304a.m0(iL0, parcel);
    }
}
