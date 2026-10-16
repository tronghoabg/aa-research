package com.google.android.gms.internal.ads;

import java.util.List;

/* loaded from: classes3.dex */
public final class zzgbe extends zziep implements zziga {
    private static final zzgbe zzn;
    private static volatile zzigh zzo;
    private int zza;
    private long zzc;
    private int zzd;
    private boolean zze;
    private boolean zzf;
    private long zzg;
    private long zzh;
    private long zzi;
    private long zzj;
    private String zzb = "";
    private zzifa zzk = zziep.zzbE();
    private zzifa zzl = zziep.zzbE();
    private zzifa zzm = zziep.zzbE();

    static {
        zzgbe zzgbeVar = new zzgbe();
        zzn = zzgbeVar;
        zziep.zzbu(zzgbe.class, zzgbeVar);
    }

    private zzgbe() {
    }

    public static zzgbe zzp() {
        return zzn;
    }

    public final /* synthetic */ void zzA(long j8) {
        zzifa zzifaVar = this.zzl;
        if (!zzifaVar.zza()) {
            this.zzl = zziep.zzbF(zzifaVar);
        }
        this.zzl.zzd(j8);
    }

    public final /* synthetic */ void zzB(long j8) {
        zzifa zzifaVar = this.zzm;
        if (!zzifaVar.zza()) {
            this.zzm = zziep.zzbF(zzifaVar);
        }
        this.zzm.zzd(j8);
    }

    public final /* synthetic */ void zzC() {
        this.zzm = zziep.zzbE();
    }

    public final String zza() {
        return this.zzb;
    }

    public final long zzb() {
        return this.zzc;
    }

    public final int zzc() {
        return this.zzd;
    }

    public final boolean zzd() {
        return this.zze;
    }

    @Override // com.google.android.gms.internal.ads.zziep
    public final Object zzdc(zzieo zzieoVar, Object obj, Object obj2) {
        zzigh zziekVar;
        int iOrdinal = zzieoVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return zziep.zzbv(zzn, "\u0004\f\u0000\u0001\u0001\f\f\u0000\u0003\u0000\u0001Ȉ\u0002ဂ\u0000\u0003င\u0001\u0004ဇ\u0002\u0005ဇ\u0003\u0006ဂ\u0004\u0007\u0002\bဂ\u0005\tဂ\u0006\n%\u000b%\f%", new Object[]{"zza", "zzb", "zzc", "zzd", "zze", "zzf", "zzg", "zzh", "zzi", "zzj", "zzk", "zzl", "zzm"});
        }
        if (iOrdinal == 3) {
            return new zzgbe();
        }
        byte[] bArr = null;
        if (iOrdinal == 4) {
            return new zzgbd(bArr);
        }
        if (iOrdinal == 5) {
            return zzn;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        zzigh zzighVar = zzo;
        if (zzighVar != null) {
            return zzighVar;
        }
        synchronized (zzgbe.class) {
            try {
                zziekVar = zzo;
                if (zziekVar == null) {
                    zziekVar = new zziek(zzn);
                    zzo = zziekVar;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return zziekVar;
    }

    public final boolean zze() {
        return this.zzf;
    }

    public final long zzg() {
        return this.zzg;
    }

    public final long zzh() {
        return this.zzh;
    }

    public final long zzi() {
        return this.zzi;
    }

    public final boolean zzj() {
        return (this.zza & 64) != 0;
    }

    public final List zzk() {
        return this.zzk;
    }

    public final int zzl() {
        return this.zzk.size();
    }

    public final int zzm() {
        return this.zzl.size();
    }

    public final List zzn() {
        return this.zzm;
    }

    public final int zzo() {
        return this.zzm.size();
    }

    public final /* synthetic */ void zzq(String str) {
        str.getClass();
        this.zzb = str;
    }

    public final /* synthetic */ void zzr(long j8) {
        this.zza |= 1;
        this.zzc = j8;
    }

    public final /* synthetic */ void zzs(int i5) {
        this.zza |= 2;
        this.zzd = i5;
    }

    public final /* synthetic */ void zzt(boolean z2) {
        this.zza |= 4;
        this.zze = true;
    }

    public final /* synthetic */ void zzu(boolean z2) {
        this.zza |= 8;
        this.zzf = true;
    }

    public final /* synthetic */ void zzv(long j8) {
        this.zza |= 16;
        this.zzg = j8;
    }

    public final /* synthetic */ void zzw(long j8) {
        this.zzh = j8;
    }

    public final /* synthetic */ void zzx(long j8) {
        this.zza |= 32;
        this.zzi = j8;
    }

    public final /* synthetic */ void zzy(long j8) {
        this.zza |= 64;
        this.zzj = j8;
    }

    public final /* synthetic */ void zzz(long j8) {
        zzifa zzifaVar = this.zzk;
        if (!zzifaVar.zza()) {
            this.zzk = zziep.zzbF(zzifaVar);
        }
        this.zzk.zzd(j8);
    }
}
