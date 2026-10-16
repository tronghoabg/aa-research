package com.google.android.gms.internal.ads;

import a.AbstractC1304a;
import android.os.Parcel;
import android.os.Parcelable;
import f7.AbstractC2614a;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public final class zzcdr extends AbstractC2614a {
    public static final Parcelable.Creator<zzcdr> CREATOR = new zzcds();
    public final String zza;
    public final String zzb;
    public final boolean zzc;
    public final boolean zzd;
    public final List zze;
    public final boolean zzf;
    public final boolean zzg;
    public final List zzh;

    public zzcdr(String str, String str2, boolean z2, boolean z10, List list, boolean z11, boolean z12, List list2) {
        this.zza = str;
        this.zzb = str2;
        this.zzc = z2;
        this.zzd = z10;
        this.zze = list;
        this.zzf = z11;
        this.zzg = z12;
        this.zzh = list2 == null ? new ArrayList() : list2;
    }

    public static zzcdr zza(JSONObject jSONObject) throws JSONException {
        return new zzcdr(jSONObject.optString("click_string", ""), jSONObject.optString("report_url", ""), jSONObject.optBoolean("rendered_ad_enabled", false), jSONObject.optBoolean("non_malicious_reporting_enabled", false), Fe.e.W(jSONObject.optJSONArray("allowed_headers"), null), jSONObject.optBoolean("protection_enabled", false), jSONObject.optBoolean("malicious_reporting_enabled", false), Fe.e.W(jSONObject.optJSONArray("webview_permissions"), null));
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i5) {
        String str = this.zza;
        int iL0 = AbstractC1304a.l0(20293, parcel);
        AbstractC1304a.a0(parcel, 2, str, false);
        AbstractC1304a.a0(parcel, 3, this.zzb, false);
        boolean z2 = this.zzc;
        AbstractC1304a.k0(parcel, 4, 4);
        parcel.writeInt(z2 ? 1 : 0);
        boolean z10 = this.zzd;
        AbstractC1304a.k0(parcel, 5, 4);
        parcel.writeInt(z10 ? 1 : 0);
        AbstractC1304a.c0(parcel, 6, this.zze);
        boolean z11 = this.zzf;
        AbstractC1304a.k0(parcel, 7, 4);
        parcel.writeInt(z11 ? 1 : 0);
        boolean z12 = this.zzg;
        AbstractC1304a.k0(parcel, 8, 4);
        parcel.writeInt(z12 ? 1 : 0);
        AbstractC1304a.c0(parcel, 9, this.zzh);
        AbstractC1304a.m0(iL0, parcel);
    }
}
