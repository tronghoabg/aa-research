package com.google.android.gms.internal.ads;

/* loaded from: classes3.dex */
public final class zzaxk extends zziep implements zziga {
    private static final zzaxk zzh;
    private static volatile zzigh zzi;
    private int zza;
    private String zzb = "";
    private String zzc = "";
    private String zzd = "";
    private String zze = "";
    private String zzf = "";
    private String zzg = "";

    static {
        zzaxk zzaxkVar = new zzaxk();
        zzh = zzaxkVar;
        zziep.zzbu(zzaxk.class, zzaxkVar);
    }

    private zzaxk() {
    }

    @Override // com.google.android.gms.internal.ads.zziep
    public final Object zzdc(zzieo zzieoVar, Object obj, Object obj2) {
        zzigh zziekVar;
        int iOrdinal = zzieoVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return zziep.zzbv(zzh, "\u0004\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003ဈ\u0002\u0004ဈ\u0003\u0005ဈ\u0004\u0006ဈ\u0005", new Object[]{"zza", "zzb", "zzc", "zzd", "zze", "zzf", "zzg"});
        }
        if (iOrdinal == 3) {
            return new zzaxk();
        }
        byte[] bArr = null;
        if (iOrdinal == 4) {
            return new zzaxj(bArr);
        }
        if (iOrdinal == 5) {
            return zzh;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        zzigh zzighVar = zzi;
        if (zzighVar != null) {
            return zzighVar;
        }
        synchronized (zzaxk.class) {
            try {
                zziekVar = zzi;
                if (zziekVar == null) {
                    zziekVar = new zziek(zzh);
                    zzi = zziekVar;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return zziekVar;
    }
}
