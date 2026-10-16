package com.google.android.gms.internal.ads;

import D6.C0395s;
import a.AbstractC1304a;
import android.content.Context;
import android.os.Parcel;
import android.os.Parcelable;
import f7.AbstractC2614a;

/* loaded from: classes3.dex */
public final class zzfnc extends AbstractC2614a {
    public static final Parcelable.Creator<zzfnc> CREATOR = new zzfnd();
    public final Context zza;
    public final zzfmz zzb;
    public final int zzc;
    public final int zzd;
    public final int zze;
    public final String zzf;
    public final int zzg;
    private final zzfmz[] zzh;
    private final int zzi;
    private final int zzj;
    private final int zzk;
    private final int[] zzl;
    private final int[] zzm;

    public zzfnc(int i5, int i10, int i11, int i12, String str, int i13, int i14) {
        zzfmz[] zzfmzVarArrValues = zzfmz.values();
        this.zzh = zzfmzVarArrValues;
        int[] iArrZza = zzfna.zza();
        this.zzl = iArrZza;
        int[] iArrZza2 = zzfnb.zza();
        this.zzm = iArrZza2;
        this.zza = null;
        this.zzi = i5;
        this.zzb = zzfmzVarArrValues[i5];
        this.zzc = i10;
        this.zzd = i11;
        this.zze = i12;
        this.zzf = str;
        this.zzj = i13;
        this.zzg = iArrZza[i13];
        this.zzk = i14;
        int i15 = iArrZza2[i14];
    }

    public static zzfnc zza(zzfmz zzfmzVar, Context context) {
        if (zzfmzVar == zzfmz.Rewarded) {
            zzbio zzbioVar = zzbix.zzhu;
            C0395s c0395s = C0395s.f2489e;
            return new zzfnc(context, zzfmzVar, ((Integer) c0395s.f2492c.zzd(zzbioVar)).intValue(), ((Integer) c0395s.f2492c.zzd(zzbix.zzhA)).intValue(), ((Integer) c0395s.f2492c.zzd(zzbix.zzhC)).intValue(), (String) c0395s.f2492c.zzd(zzbix.zzhE), (String) c0395s.f2492c.zzd(zzbix.zzhw), (String) c0395s.f2492c.zzd(zzbix.zzhy));
        }
        if (zzfmzVar == zzfmz.Interstitial) {
            zzbio zzbioVar2 = zzbix.zzhv;
            C0395s c0395s2 = C0395s.f2489e;
            return new zzfnc(context, zzfmzVar, ((Integer) c0395s2.f2492c.zzd(zzbioVar2)).intValue(), ((Integer) c0395s2.f2492c.zzd(zzbix.zzhB)).intValue(), ((Integer) c0395s2.f2492c.zzd(zzbix.zzhD)).intValue(), (String) c0395s2.f2492c.zzd(zzbix.zzhF), (String) c0395s2.f2492c.zzd(zzbix.zzhx), (String) c0395s2.f2492c.zzd(zzbix.zzhz));
        }
        if (zzfmzVar != zzfmz.AppOpen) {
            return null;
        }
        zzbio zzbioVar3 = zzbix.zzhI;
        C0395s c0395s3 = C0395s.f2489e;
        return new zzfnc(context, zzfmzVar, ((Integer) c0395s3.f2492c.zzd(zzbioVar3)).intValue(), ((Integer) c0395s3.f2492c.zzd(zzbix.zzhK)).intValue(), ((Integer) c0395s3.f2492c.zzd(zzbix.zzhL)).intValue(), (String) c0395s3.f2492c.zzd(zzbix.zzhG), (String) c0395s3.f2492c.zzd(zzbix.zzhH), (String) c0395s3.f2492c.zzd(zzbix.zzhJ));
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i5) {
        int i10 = this.zzi;
        int iL0 = AbstractC1304a.l0(20293, parcel);
        AbstractC1304a.k0(parcel, 1, 4);
        parcel.writeInt(i10);
        int i11 = this.zzc;
        AbstractC1304a.k0(parcel, 2, 4);
        parcel.writeInt(i11);
        int i12 = this.zzd;
        AbstractC1304a.k0(parcel, 3, 4);
        parcel.writeInt(i12);
        int i13 = this.zze;
        AbstractC1304a.k0(parcel, 4, 4);
        parcel.writeInt(i13);
        AbstractC1304a.a0(parcel, 5, this.zzf, false);
        int i14 = this.zzj;
        AbstractC1304a.k0(parcel, 6, 4);
        parcel.writeInt(i14);
        int i15 = this.zzk;
        AbstractC1304a.k0(parcel, 7, 4);
        parcel.writeInt(i15);
        AbstractC1304a.m0(iL0, parcel);
    }

    private zzfnc(Context context, zzfmz zzfmzVar, int i5, int i10, int i11, String str, String str2, String str3) {
        this.zzh = zzfmz.values();
        this.zzl = zzfna.zza();
        this.zzm = zzfnb.zza();
        this.zza = context;
        this.zzi = zzfmzVar.ordinal();
        this.zzb = zzfmzVar;
        this.zzc = i5;
        this.zzd = i10;
        this.zze = i11;
        this.zzf = str;
        int i12 = "oldest".equals(str2) ? 1 : (!"lru".equals(str2) && "lfu".equals(str2)) ? 3 : 2;
        this.zzg = i12;
        this.zzj = i12 - 1;
        this.zzk = 0;
    }
}
