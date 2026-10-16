package com.google.android.gms.internal.ads;

/* loaded from: classes3.dex */
public final class zzikw extends zziep implements zziga {
    private static final zzikw zzh;
    private static volatile zzigh zzi;
    private int zza;
    private int zzb;
    private int zze;
    private String zzc = "";
    private zziex zzd = zziep.zzbC();
    private zzifb zzf = zziep.zzbM();
    private zzidl zzg = zzidl.zza;

    static {
        zzikw zzikwVar = new zzikw();
        zzh = zzikwVar;
        zziep.zzbu(zzikw.class, zzikwVar);
    }

    private zzikw() {
    }

    @Override // com.google.android.gms.internal.ads.zziep
    public final Object zzdc(zzieo zzieoVar, Object obj, Object obj2) {
        zzigh zziekVar;
        int iOrdinal = zzieoVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return zziep.zzbv(zzh, "\u0001\u0006\u0000\u0001\u0001\u0007\u0006\u0000\u0002\u0000\u0001င\u0000\u0002ဈ\u0001\u0003\u0016\u0005င\u0002\u0006\u001b\u0007ည\u0003", new Object[]{"zza", "zzb", "zzc", "zzd", "zze", "zzf", zziku.class, "zzg"});
        }
        if (iOrdinal == 3) {
            return new zzikw();
        }
        byte[] bArr = null;
        if (iOrdinal == 4) {
            return new zzikv(bArr);
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
        synchronized (zzikw.class) {
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
