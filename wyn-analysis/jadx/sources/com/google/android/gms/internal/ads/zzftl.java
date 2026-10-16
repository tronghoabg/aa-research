package com.google.android.gms.internal.ads;

import D6.U;
import D6.W;
import D6.o1;
import android.os.Bundle;
import android.os.Parcel;
import java.util.List;
import java.util.Map;
import x6.EnumC4471b;

/* loaded from: classes3.dex */
public final class zzftl extends W {
    private final zzftr zza;
    private final zzftc zzb;

    public zzftl(zzftr zzftrVar, zzftc zzftcVar) {
        super("com.google.android.gms.ads.internal.client.IAdPreloader");
        this.zza = zzftrVar;
        this.zzb = zzftcVar;
    }

    @Override // D6.X
    public final void zze(List list, D6.S s10) {
        this.zza.zza(list, s10);
    }

    @Override // D6.X
    public final boolean zzf(String str) {
        return this.zza.zzb(str);
    }

    @Override // D6.X
    public final zzccp zzg(String str) {
        return this.zza.zzc(str);
    }

    @Override // D6.X
    public final boolean zzh(String str) {
        return this.zza.zzd(str);
    }

    @Override // D6.X
    public final zzbgq zzi(String str) {
        return this.zza.zze(str);
    }

    @Override // D6.X
    public final boolean zzj(String str) {
        return this.zza.zzf(str);
    }

    @Override // D6.X
    public final D6.L zzk(String str) {
        return this.zza.zzg(str);
    }

    @Override // D6.X
    public final void zzl(zzbvj zzbvjVar) {
    }

    @Override // D6.X
    public final boolean zzm(String str, o1 o1Var, U u10) {
        return this.zzb.zza(str, o1Var, u10);
    }

    @Override // D6.X
    public final boolean zzn(int i5, String str) {
        EnumC4471b enumC4471bA = EnumC4471b.a(i5);
        if (enumC4471bA == null) {
            return false;
        }
        return this.zzb.zzb(enumC4471bA, str);
    }

    @Override // D6.X
    public final D6.L zzo(String str) {
        return this.zzb.zze(str);
    }

    @Override // D6.X
    public final zzbgq zzp(String str) {
        return this.zzb.zzd(str);
    }

    @Override // D6.X
    public final zzccp zzq(String str) {
        return this.zzb.zzc(str);
    }

    @Override // D6.X
    public final o1 zzr(int i5, String str) {
        EnumC4471b enumC4471bA = EnumC4471b.a(i5);
        if (enumC4471bA == null) {
            return null;
        }
        return this.zzb.zzf(enumC4471bA, str);
    }

    @Override // D6.X
    public final Bundle zzs(int i5) {
        Map mapZzh = this.zzb.zzh(i5);
        Bundle bundle = new Bundle();
        for (Map.Entry entry : mapZzh.entrySet()) {
            String str = (String) entry.getKey();
            o1 o1Var = (o1) entry.getValue();
            Parcel parcelObtain = Parcel.obtain();
            o1Var.writeToParcel(parcelObtain, 0);
            byte[] bArrMarshall = parcelObtain.marshall();
            parcelObtain.recycle();
            bundle.putByteArray(str, bArrMarshall);
        }
        return bundle;
    }

    @Override // D6.X
    public final int zzt(int i5, String str) {
        EnumC4471b enumC4471bA = EnumC4471b.a(i5);
        if (enumC4471bA == null) {
            return 0;
        }
        return this.zzb.zzg(enumC4471bA, str);
    }

    @Override // D6.X
    public final boolean zzu(int i5, String str) {
        EnumC4471b enumC4471bA = EnumC4471b.a(i5);
        if (enumC4471bA == null) {
            return false;
        }
        return this.zzb.zzi(enumC4471bA, str);
    }

    @Override // D6.X
    public final void zzv(int i5) {
        this.zzb.zzj(i5);
    }
}
