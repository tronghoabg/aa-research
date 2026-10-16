package com.google.android.gms.internal.ads;

import com.applovin.shadow.okio.Segment;

/* loaded from: classes3.dex */
public final class zzawx extends zziep implements zziga {
    private static final zzawx zzu;
    private static volatile zzigh zzv;
    private int zza;
    private long zzc;
    private int zzg;
    private long zzi;
    private long zzl;
    private long zzm;
    private int zzo;
    private int zzp;
    private zzifb zzb = zziep.zzbM();
    private String zzd = "";
    private String zze = "";
    private String zzf = "";
    private String zzh = "";
    private String zzj = "";
    private String zzk = "";
    private zziex zzn = zziep.zzbC();

    static {
        zzawx zzawxVar = new zzawx();
        zzu = zzawxVar;
        zziep.zzbu(zzawx.class, zzawxVar);
    }

    private zzawx() {
    }

    public static zzaww zza() {
        return (zzaww) zzu.zzbn();
    }

    public final /* synthetic */ void zzb(zzaxp zzaxpVar) {
        zzaxpVar.getClass();
        zzifb zzifbVar = this.zzb;
        if (!zzifbVar.zza()) {
            this.zzb = zziep.zzbN(zzifbVar);
        }
        this.zzb.add(zzaxpVar);
    }

    public final /* synthetic */ void zzc() {
        this.zzb = zziep.zzbM();
    }

    public final /* synthetic */ void zzd(long j8) {
        this.zza |= 1;
        this.zzc = j8;
    }

    @Override // com.google.android.gms.internal.ads.zziep
    public final Object zzdc(zzieo zzieoVar, Object obj, Object obj2) {
        zzigh zziekVar;
        int iOrdinal = zzieoVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return zziep.zzbv(zzu, "\u0004\u000f\u0000\u0001\bB\u000f\u0000\u0002\u0000\b\u001b\u0015ဂ\u0000\u0016ဈ\u0001\u0017ဈ\u0002\u0018ဈ\u0003\u0019᠌\u0004(ဈ\u0005)ဂ\u0006<ဈ\u0007=ဈ\b>ဂ\t?ဂ\n@'Aဌ\u000bBဌ\f", new Object[]{"zza", "zzb", zzaxp.class, "zzc", "zzd", "zze", "zzf", "zzg", zzaxn.zza, "zzh", "zzi", "zzj", "zzk", "zzl", "zzm", "zzn", "zzo", "zzp"});
        }
        if (iOrdinal == 3) {
            return new zzawx();
        }
        byte[] bArr = null;
        if (iOrdinal == 4) {
            return new zzaww(bArr);
        }
        if (iOrdinal == 5) {
            return zzu;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        zzigh zzighVar = zzv;
        if (zzighVar != null) {
            return zzighVar;
        }
        synchronized (zzawx.class) {
            try {
                zziekVar = zzv;
                if (zziekVar == null) {
                    zziekVar = new zziek(zzu);
                    zzv = zziekVar;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return zziekVar;
    }

    public final /* synthetic */ void zze(String str) {
        str.getClass();
        this.zza |= 2;
        this.zzd = str;
    }

    public final /* synthetic */ void zzg(String str) {
        str.getClass();
        this.zza |= 4;
        this.zze = str;
    }

    public final /* synthetic */ void zzh(String str) {
        str.getClass();
        this.zza |= 8;
        this.zzf = str;
    }

    public final /* synthetic */ void zzi(String str) {
        str.getClass();
        this.zza |= 32;
        this.zzh = str;
    }

    public final /* synthetic */ void zzj(long j8) {
        this.zza |= 64;
        this.zzi = j8;
    }

    public final /* synthetic */ void zzk(String str) {
        str.getClass();
        this.zza |= 128;
        this.zzj = str;
    }

    public final /* synthetic */ void zzl(String str) {
        str.getClass();
        this.zza |= 256;
        this.zzk = str;
    }

    public final /* synthetic */ void zzm(long j8) {
        this.zza |= 512;
        this.zzl = j8;
    }

    public final /* synthetic */ void zzn(long j8) {
        this.zza |= Segment.SHARE_MINIMUM;
        this.zzm = j8;
    }

    public final /* synthetic */ void zzo(Iterable iterable) {
        zziex zziexVar = this.zzn;
        if (!zziexVar.zza()) {
            this.zzn = zziep.zzbD(zziexVar);
        }
        zzicu.zzaW(iterable, this.zzn);
    }

    public final /* synthetic */ void zzq(int i5) {
        this.zzg = i5 - 1;
        this.zza |= 16;
    }

    public final /* synthetic */ void zzr(int i5) {
        this.zzo = zzbec.zza(i5);
        this.zza |= 2048;
    }

    public final /* synthetic */ void zzs(int i5) {
        this.zzp = 1;
        this.zza |= 4096;
    }
}
