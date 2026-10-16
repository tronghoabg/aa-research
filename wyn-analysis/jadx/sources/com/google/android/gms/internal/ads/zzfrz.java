package com.google.android.gms.internal.ads;

/* loaded from: classes3.dex */
public final class zzfrz extends zziep implements zziga {
    private static final zzfrz zzf;
    private static volatile zzigh zzg;
    private long zza;
    private long zzb;
    private zzifb zzc = zziep.zzbM();
    private zzifb zzd = zziep.zzbM();
    private zzifb zze = zziep.zzbM();

    static {
        zzfrz zzfrzVar = new zzfrz();
        zzf = zzfrzVar;
        zziep.zzbu(zzfrz.class, zzfrzVar);
    }

    private zzfrz() {
    }

    @Override // com.google.android.gms.internal.ads.zziep
    public final Object zzdc(zzieo zzieoVar, Object obj, Object obj2) {
        zzigh zziekVar;
        int iOrdinal = zzieoVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return zziep.zzbv(zzf, "\u0004\u0005\u0000\u0000\u0001\u0005\u0005\u0000\u0003\u0000\u0001\u0002\u0002\u0002\u0003Ț\u0004Ț\u0005Ț", new Object[]{"zza", "zzb", "zzc", "zzd", "zze"});
        }
        if (iOrdinal == 3) {
            return new zzfrz();
        }
        byte[] bArr = null;
        if (iOrdinal == 4) {
            return new zzfry(bArr);
        }
        if (iOrdinal == 5) {
            return zzf;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        zzigh zzighVar = zzg;
        if (zzighVar != null) {
            return zzighVar;
        }
        synchronized (zzfrz.class) {
            try {
                zziekVar = zzg;
                if (zziekVar == null) {
                    zziekVar = new zziek(zzf);
                    zzg = zziekVar;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return zziekVar;
    }
}
