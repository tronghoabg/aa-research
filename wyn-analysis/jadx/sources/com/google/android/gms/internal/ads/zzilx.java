package com.google.android.gms.internal.ads;

/* loaded from: classes3.dex */
public final class zzilx extends zziep implements zziga {
    private static final zzilx zzj;
    private static volatile zzigh zzk;
    private int zza;
    private zzilg zzh;
    private String zzb = "";
    private String zzc = "";
    private zzifb zzd = zziep.zzbM();
    private zzifb zze = zziep.zzbM();
    private zzifb zzf = zziep.zzbM();
    private int zzg = -1;
    private String zzi = "";

    static {
        zzilx zzilxVar = new zzilx();
        zzj = zzilxVar;
        zziep.zzbu(zzilx.class, zzilxVar);
    }

    private zzilx() {
    }

    @Override // com.google.android.gms.internal.ads.zziep
    public final Object zzdc(zzieo zzieoVar, Object obj, Object obj2) {
        zzigh zziekVar;
        int iOrdinal = zzieoVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return zziep.zzbv(zzj, "\u0001\b\u0000\u0001\u0001\n\b\u0000\u0003\u0000\u0001ဈ\u0001\u0002\u001b\u0003\u001b\u0004င\u0002\u0005ဈ\u0000\b\u001b\tဈ\u0004\nဉ\u0003", new Object[]{"zza", "zzc", "zzd", zzilk.class, "zze", zzilr.class, "zzg", "zzb", "zzf", zzime.class, "zzi", "zzh"});
        }
        if (iOrdinal == 3) {
            return new zzilx();
        }
        byte[] bArr = null;
        if (iOrdinal == 4) {
            return new zzilw(bArr);
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
        synchronized (zzilx.class) {
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
}
