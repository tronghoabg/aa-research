package com.google.android.gms.internal.ads;

/* loaded from: classes3.dex */
public final class zziin extends zziep implements zziga {
    private static final zziin zze;
    private static volatile zzigh zzf;
    private int zza;
    private int zzb;
    private long zzc;
    private zzidl zzd = zzidl.zza;

    static {
        zziin zziinVar = new zziin();
        zze = zziinVar;
        zziep.zzbu(zziin.class, zziinVar);
    }

    private zziin() {
    }

    @Override // com.google.android.gms.internal.ads.zziep
    public final Object zzdc(zzieo zzieoVar, Object obj, Object obj2) {
        zzigh zziekVar;
        int iOrdinal = zzieoVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return zziep.zzbv(zze, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001᠌\u0000\u0002ဂ\u0001\u0003ည\u0002", new Object[]{"zza", "zzb", zziim.zza, "zzc", "zzd"});
        }
        if (iOrdinal == 3) {
            return new zziin();
        }
        byte[] bArr = null;
        if (iOrdinal == 4) {
            return new zziil(bArr);
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
        synchronized (zziin.class) {
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
