package com.google.android.gms.internal.ads;

/* loaded from: classes3.dex */
public final class zziih extends zziep implements zziga {
    private static final zziih zzd;
    private static volatile zzigh zze;
    private int zza;
    private long zzb;
    private long zzc;

    static {
        zziih zziihVar = new zziih();
        zzd = zziihVar;
        zziep.zzbu(zziih.class, zziihVar);
    }

    private zziih() {
    }

    public static zziig zzc() {
        return (zziig) zzd.zzbn();
    }

    public final /* synthetic */ void zzd(int i5) {
        this.zza = i5;
    }

    @Override // com.google.android.gms.internal.ads.zziep
    public final Object zzdc(zzieo zzieoVar, Object obj, Object obj2) {
        zzigh zziekVar;
        int iOrdinal = zzieoVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return zziep.zzbv(zzd, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u0004\u0002\u0002\u0003\u0002", new Object[]{"zza", "zzb", "zzc"});
        }
        if (iOrdinal == 3) {
            return new zziih();
        }
        byte[] bArr = null;
        if (iOrdinal == 4) {
            return new zziig(bArr);
        }
        if (iOrdinal == 5) {
            return zzd;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        zzigh zzighVar = zze;
        if (zzighVar != null) {
            return zzighVar;
        }
        synchronized (zziih.class) {
            try {
                zziekVar = zze;
                if (zziekVar == null) {
                    zziekVar = new zziek(zzd);
                    zze = zziekVar;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return zziekVar;
    }

    public final /* synthetic */ void zze(long j8) {
        this.zzb = j8;
    }

    public final /* synthetic */ void zzg(long j8) {
        this.zzc = j8;
    }
}
