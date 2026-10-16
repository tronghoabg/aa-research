package com.google.android.gms.internal.ads;

/* loaded from: classes3.dex */
public final class zzaxp extends zziep implements zziga {
    private static final zzaxp zzi;
    private static volatile zzigh zzj;
    private int zza;
    private long zzb;
    private long zzc;
    private int zzd;
    private long zzg;
    private String zze = "";
    private String zzf = "";
    private String zzh = "";

    static {
        zzaxp zzaxpVar = new zzaxp();
        zzi = zzaxpVar;
        zziep.zzbu(zzaxp.class, zzaxpVar);
    }

    private zzaxp() {
    }

    public static zzaxo zza() {
        return (zzaxo) zzi.zzbn();
    }

    public final /* synthetic */ void zzb(long j8) {
        this.zza |= 1;
        this.zzb = j8;
    }

    public final /* synthetic */ void zzc(long j8) {
        this.zza |= 2;
        this.zzc = j8;
    }

    public final /* synthetic */ void zzd(String str) {
        str.getClass();
        this.zza |= 8;
        this.zze = str;
    }

    @Override // com.google.android.gms.internal.ads.zziep
    public final Object zzdc(zzieo zzieoVar, Object obj, Object obj2) {
        zzigh zziekVar;
        int iOrdinal = zzieoVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return zziep.zzbv(zzi, "\u0004\u0007\u0000\u0001\u0001\u0007\u0007\u0000\u0000\u0000\u0001ဂ\u0000\u0002ဂ\u0001\u0003᠌\u0002\u0004ဈ\u0003\u0005ဈ\u0004\u0006ဂ\u0005\u0007ဈ\u0006", new Object[]{"zza", "zzb", "zzc", "zzd", zzaxq.zza, "zze", "zzf", "zzg", "zzh"});
        }
        if (iOrdinal == 3) {
            return new zzaxp();
        }
        byte[] bArr = null;
        if (iOrdinal == 4) {
            return new zzaxo(bArr);
        }
        if (iOrdinal == 5) {
            return zzi;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        zzigh zzighVar = zzj;
        if (zzighVar != null) {
            return zzighVar;
        }
        synchronized (zzaxp.class) {
            try {
                zziekVar = zzj;
                if (zziekVar == null) {
                    zziekVar = new zziek(zzi);
                    zzj = zziekVar;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return zziekVar;
    }

    public final /* synthetic */ void zze(String str) {
        str.getClass();
        this.zza |= 16;
        this.zzf = str;
    }

    public final /* synthetic */ void zzg(long j8) {
        this.zza |= 32;
        this.zzg = j8;
    }

    public final /* synthetic */ void zzh(String str) {
        this.zza |= 64;
        this.zzh = str;
    }

    public final /* synthetic */ void zzj(int i5) {
        this.zzd = i5 - 1;
        this.zza |= 4;
    }
}
