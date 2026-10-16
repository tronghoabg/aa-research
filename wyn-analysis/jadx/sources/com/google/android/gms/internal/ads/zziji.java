package com.google.android.gms.internal.ads;

/* loaded from: classes3.dex */
public final class zziji extends zziep implements zziga {
    private static final zziji zze;
    private static volatile zzigh zzf;
    private int zza;
    private zzidl zzb;
    private zzidl zzc;
    private zzidl zzd;

    static {
        zziji zzijiVar = new zziji();
        zze = zzijiVar;
        zziep.zzbu(zziji.class, zzijiVar);
    }

    private zziji() {
        zzidl zzidlVar = zzidl.zza;
        this.zzb = zzidlVar;
        this.zzc = zzidlVar;
        this.zzd = zzidlVar;
    }

    @Override // com.google.android.gms.internal.ads.zziep
    public final Object zzdc(zzieo zzieoVar, Object obj, Object obj2) {
        zzigh zziekVar;
        int iOrdinal = zzieoVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return zziep.zzbv(zze, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ည\u0000\u0002ည\u0001\u0003ည\u0002", new Object[]{"zza", "zzb", "zzc", "zzd"});
        }
        if (iOrdinal == 3) {
            return new zziji();
        }
        byte[] bArr = null;
        if (iOrdinal == 4) {
            return new zzijh(bArr);
        }
        if (iOrdinal == 5) {
            return zze;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        zzigh zzighVar = zzf;
        if (zzighVar != null) {
            return zzighVar;
        }
        synchronized (zziji.class) {
            try {
                zziekVar = zzf;
                if (zziekVar == null) {
                    zziekVar = new zziek(zze);
                    zzf = zziekVar;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return zziekVar;
    }
}
