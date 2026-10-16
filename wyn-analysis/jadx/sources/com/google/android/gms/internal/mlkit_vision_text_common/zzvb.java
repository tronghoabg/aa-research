package com.google.android.gms.internal.mlkit_vision_text_common;

import a.AbstractC1304a;
import android.graphics.Rect;
import android.os.Parcel;
import android.os.Parcelable;
import f7.AbstractC2614a;
import java.util.List;

/* loaded from: classes4.dex */
public final class zzvb extends AbstractC2614a {
    public static final Parcelable.Creator<zzvb> CREATOR = new zzvc();
    private final String zza;
    private final Rect zzb;
    private final List zzc;
    private final String zzd;
    private final float zze;
    private final float zzf;
    private final List zzg;

    public zzvb(String str, Rect rect, List list, String str2, float f10, float f11, List list2) {
        this.zza = str;
        this.zzb = rect;
        this.zzc = list;
        this.zzd = str2;
        this.zze = f10;
        this.zzf = f11;
        this.zzg = list2;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i5) {
        String str = this.zza;
        int iL0 = AbstractC1304a.l0(20293, parcel);
        AbstractC1304a.a0(parcel, 1, str, false);
        AbstractC1304a.Z(parcel, 2, this.zzb, i5, false);
        AbstractC1304a.e0(parcel, 3, this.zzc, false);
        AbstractC1304a.a0(parcel, 4, this.zzd, false);
        float f10 = this.zze;
        AbstractC1304a.k0(parcel, 5, 4);
        parcel.writeFloat(f10);
        float f11 = this.zzf;
        AbstractC1304a.k0(parcel, 6, 4);
        parcel.writeFloat(f11);
        AbstractC1304a.e0(parcel, 7, this.zzg, false);
        AbstractC1304a.m0(iL0, parcel);
    }

    public final float zza() {
        return this.zzf;
    }

    public final float zzb() {
        return this.zze;
    }

    public final Rect zzc() {
        return this.zzb;
    }

    public final String zzd() {
        return this.zzd;
    }

    public final String zze() {
        return this.zza;
    }

    public final List zzf() {
        return this.zzc;
    }

    public final List zzg() {
        return this.zzg;
    }
}
