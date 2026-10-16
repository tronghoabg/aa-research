package com.google.android.gms.internal.ads;

import a.AbstractC1304a;
import android.os.Parcel;
import android.os.ParcelFileDescriptor;
import android.os.Parcelable;
import f7.AbstractC2614a;
import java.io.InputStream;

/* loaded from: classes3.dex */
public final class zzbhf extends AbstractC2614a {
    public static final Parcelable.Creator<zzbhf> CREATOR = new zzbhg();
    private ParcelFileDescriptor zza;
    private final boolean zzb;
    private final boolean zzc;
    private final long zzd;
    private final boolean zze;

    public zzbhf(ParcelFileDescriptor parcelFileDescriptor, boolean z2, boolean z10, long j8, boolean z11) {
        this.zza = parcelFileDescriptor;
        this.zzb = z2;
        this.zzc = z10;
        this.zzd = j8;
        this.zze = z11;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i5) {
        int iL0 = AbstractC1304a.l0(20293, parcel);
        AbstractC1304a.Z(parcel, 2, zzc(), i5, false);
        boolean zZzd = zzd();
        AbstractC1304a.k0(parcel, 3, 4);
        parcel.writeInt(zZzd ? 1 : 0);
        boolean zZze = zze();
        AbstractC1304a.k0(parcel, 4, 4);
        parcel.writeInt(zZze ? 1 : 0);
        long jZzf = zzf();
        AbstractC1304a.k0(parcel, 5, 8);
        parcel.writeLong(jZzf);
        boolean zZzg = zzg();
        AbstractC1304a.k0(parcel, 6, 4);
        parcel.writeInt(zZzg ? 1 : 0);
        AbstractC1304a.m0(iL0, parcel);
    }

    public final synchronized boolean zza() {
        return this.zza != null;
    }

    public final synchronized InputStream zzb() {
        if (this.zza == null) {
            return null;
        }
        ParcelFileDescriptor.AutoCloseInputStream autoCloseInputStream = new ParcelFileDescriptor.AutoCloseInputStream(this.zza);
        this.zza = null;
        return autoCloseInputStream;
    }

    public final synchronized ParcelFileDescriptor zzc() {
        return this.zza;
    }

    public final synchronized boolean zzd() {
        return this.zzb;
    }

    public final synchronized boolean zze() {
        return this.zzc;
    }

    public final synchronized long zzf() {
        return this.zzd;
    }

    public final synchronized boolean zzg() {
        return this.zze;
    }

    public zzbhf() {
        this(null, false, false, 0L, false);
    }
}
