package com.google.android.gms.internal.ads;

/* loaded from: classes3.dex */
public final class zzbdr extends zziep implements zziga {
    private static final zzbdr zzj;
    private static volatile zzigh zzk;
    private int zza;
    private long zzc;
    private long zzf;
    private int zzh;
    private int zzi;
    private zzidl zzb = zzidl.zza;
    private String zzd = "";
    private String zze = "";
    private String zzg = "";

    static {
        zzbdr zzbdrVar = new zzbdr();
        zzj = zzbdrVar;
        zziep.zzbu(zzbdr.class, zzbdrVar);
    }

    private zzbdr() {
    }

    public static zzbdq zza() {
        return (zzbdq) zzj.zzbn();
    }

    public final /* synthetic */ void zzb(zzidl zzidlVar) {
        zzidlVar.getClass();
        this.zza |= 1;
        this.zzb = zzidlVar;
    }

    public final /* synthetic */ void zzc(long j8) {
        this.zza |= 2;
        this.zzc = j8;
    }

    public final /* synthetic */ void zzd(String str) {
        str.getClass();
        this.zza |= 4;
        this.zzd = str;
    }

    @Override // com.google.android.gms.internal.ads.zziep
    public final Object zzdc(zzieo zzieoVar, Object obj, Object obj2) {
        zzigh zziekVar;
        int iOrdinal = zzieoVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return zziep.zzbv(zzj, "\u0004\b\u0000\u0001\u0001\b\b\u0000\u0000\u0000\u0001ည\u0000\u0002ဂ\u0001\u0003ဈ\u0002\u0004ဈ\u0003\u0005ဂ\u0004\u0006ဈ\u0005\u0007ဌ\u0006\bဌ\u0007", new Object[]{"zza", "zzb", "zzc", "zzd", "zze", "zzf", "zzg", "zzh", "zzi"});
        }
        if (iOrdinal == 3) {
            return new zzbdr();
        }
        byte[] bArr = null;
        if (iOrdinal == 4) {
            return new zzbdq(bArr);
        }
        if (iOrdinal == 5) {
            return zzj;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        zzigh zzighVar = zzk;
        if (zzighVar != null) {
            return zzighVar;
        }
        synchronized (zzbdr.class) {
            try {
                zziekVar = zzk;
                if (zziekVar == null) {
                    zziekVar = new zziek(zzj);
                    zzk = zziekVar;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return zziekVar;
    }

    public final /* synthetic */ void zze(String str) {
        str.getClass();
        this.zza |= 8;
        this.zze = str;
    }

    public final /* synthetic */ void zzg(long j8) {
        this.zza |= 16;
        this.zzf = j8;
    }

    public final /* synthetic */ void zzh(String str) {
        str.getClass();
        this.zza |= 32;
        this.zzg = str;
    }

    public final /* synthetic */ void zzj(int i5) {
        this.zzh = 1;
        this.zza |= 64;
    }

    public final /* synthetic */ void zzk(int i5) {
        this.zzi = zzbec.zza(i5);
        this.zza |= 128;
    }
}
