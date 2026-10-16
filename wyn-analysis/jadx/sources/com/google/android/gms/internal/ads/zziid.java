package com.google.android.gms.internal.ads;

/* loaded from: classes3.dex */
public final class zziid extends zziep implements zziga {
    private static final zziid zzc;
    private static volatile zzigh zzd;
    private zziex zza = zziep.zzbC();
    private zziex zzb = zziep.zzbC();

    static {
        zziid zziidVar = new zziid();
        zzc = zziidVar;
        zziep.zzbu(zziid.class, zziidVar);
    }

    private zziid() {
    }

    public static zziid zzc(byte[] bArr, zzidz zzidzVar) throws zzifh {
        return (zziid) zziep.zzbV(zzc, bArr, zzidzVar);
    }

    @Override // com.google.android.gms.internal.ads.zziep
    public final Object zzdc(zzieo zzieoVar, Object obj, Object obj2) {
        zzigh zziekVar;
        int iOrdinal = zzieoVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return zziep.zzbv(zzc, "\u0004\u0002\u0000\u0000\u0001\u0003\u0002\u0000\u0002\u0000\u0001\u0016\u0003\u0016", new Object[]{"zza", "zzb"});
        }
        if (iOrdinal == 3) {
            return new zziid();
        }
        byte[] bArr = null;
        if (iOrdinal == 4) {
            return new zziic(bArr);
        }
        if (iOrdinal == 5) {
            return zzc;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        zzigh zzighVar = zzd;
        if (zzighVar != null) {
            return zzighVar;
        }
        synchronized (zziid.class) {
            try {
                zziekVar = zzd;
                if (zziekVar == null) {
                    zziekVar = new zziek(zzc);
                    zzd = zziekVar;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return zziekVar;
    }
}
