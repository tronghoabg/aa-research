package com.google.android.gms.internal.ads;

import a.AbstractC1304a;
import android.os.Parcel;
import android.os.Parcelable;
import f7.AbstractC2614a;
import java.util.Arrays;

/* loaded from: classes3.dex */
public final class zzbxx extends AbstractC2614a {
    public static final Parcelable.Creator<zzbxx> CREATOR = new zzbxy();
    public final int zza;
    public final int zzb;
    public final int zzc;

    public zzbxx(int i5, int i10, int i11) {
        this.zza = i5;
        this.zzb = i10;
        this.zzc = i11;
    }

    public static zzbxx zza(x6.u uVar) {
        return new zzbxx(uVar.f47750a, uVar.f47751b, uVar.f47752c);
    }

    public final boolean equals(Object obj) {
        if (obj != null && (obj instanceof zzbxx)) {
            zzbxx zzbxxVar = (zzbxx) obj;
            if (zzbxxVar.zzc == this.zzc && zzbxxVar.zzb == this.zzb && zzbxxVar.zza == this.zza) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new int[]{this.zza, this.zzb, this.zzc});
    }

    public final String toString() {
        int i5 = this.zza;
        int length = String.valueOf(i5).length();
        int i10 = this.zzb;
        int length2 = String.valueOf(i10).length();
        int i11 = this.zzc;
        StringBuilder sb2 = new StringBuilder(length + 1 + length2 + 1 + String.valueOf(i11).length());
        R8.v.i(i5, i10, ".", ".", sb2);
        sb2.append(i11);
        return sb2.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i5) {
        int i10 = this.zza;
        int iL0 = AbstractC1304a.l0(20293, parcel);
        AbstractC1304a.k0(parcel, 1, 4);
        parcel.writeInt(i10);
        int i11 = this.zzb;
        AbstractC1304a.k0(parcel, 2, 4);
        parcel.writeInt(i11);
        int i12 = this.zzc;
        AbstractC1304a.k0(parcel, 3, 4);
        parcel.writeInt(i12);
        AbstractC1304a.m0(iL0, parcel);
    }
}
