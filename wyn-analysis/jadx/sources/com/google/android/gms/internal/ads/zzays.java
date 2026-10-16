package com.google.android.gms.internal.ads;

/* loaded from: classes3.dex */
public final class zzays extends zziep implements zziga {
    private static final zzays zzj;
    private static volatile zzigh zzk;
    private int zza;
    private long zzb = -1;
    private long zzc = -1;
    private long zzd = -1;
    private long zze = -1;
    private long zzf = -1;
    private long zzg = -1;
    private long zzh = -1;
    private long zzi = -1;

    static {
        zzays zzaysVar = new zzays();
        zzj = zzaysVar;
        zziep.zzbu(zzays.class, zzaysVar);
    }

    private zzays() {
    }

    public static zzayr zza() {
        return (zzayr) zzj.zzbn();
    }

    public final /* synthetic */ void zzb(long j8) {
        this.zza |= 1;
        this.zzb = j8;
    }

    public final /* synthetic */ void zzc(long j8) {
        this.zza |= 4;
        this.zzd = j8;
    }

    public final /* synthetic */ void zzd(long j8) {
        this.zza |= 8;
        this.zze = j8;
    }

    @Override // com.google.android.gms.internal.ads.zziep
    public final Object zzdc(zzieo zzieoVar, Object obj, Object obj2) {
        zzigh zziekVar;
        int iOrdinal = zzieoVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return zziep.zzbv(zzj, "\u0001\b\u0000\u0001\u0001\b\b\u0000\u0000\u0000\u0001ဂ\u0000\u0002ဂ\u0001\u0003ဂ\u0002\u0004ဂ\u0003\u0005ဂ\u0004\u0006ဂ\u0005\u0007ဂ\u0006\bဂ\u0007", new Object[]{"zza", "zzb", "zzc", "zzd", "zze", "zzf", "zzg", "zzh", "zzi"});
        }
        if (iOrdinal == 3) {
            return new zzays();
        }
        byte[] bArr = null;
        if (iOrdinal == 4) {
            return new zzayr(bArr);
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
        synchronized (zzays.class) {
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

    public final /* synthetic */ void zze(long j8) {
        this.zza |= 16;
        this.zzf = j8;
    }

    public final /* synthetic */ void zzg(long j8) {
        this.zza |= 32;
        this.zzg = j8;
    }
}
