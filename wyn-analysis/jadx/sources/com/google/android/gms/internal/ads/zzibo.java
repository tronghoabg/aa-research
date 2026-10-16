package com.google.android.gms.internal.ads;

/* loaded from: classes3.dex */
public final class zzibo extends zziep implements zziga {
    private static final zzibo zzf;
    private static volatile zzigh zzg;
    private int zza;
    private zzidl zzb = zzidl.zza;
    private String zzc = "";
    private zzifb zzd = zziep.zzbM();
    private boolean zze;

    static {
        zzibo zziboVar = new zzibo();
        zzf = zziboVar;
        zziep.zzbu(zzibo.class, zziboVar);
    }

    private zzibo() {
    }

    @Override // com.google.android.gms.internal.ads.zziep
    public final Object zzdc(zzieo zzieoVar, Object obj, Object obj2) {
        zzigh zziekVar;
        int iOrdinal = zzieoVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return zziep.zzbv(zzf, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0001\u0000\u0001ည\u0000\u0002\u001c\u0003ဇ\u0002\u0004ဈ\u0001", new Object[]{"zza", "zzb", "zzd", "zze", "zzc"});
        }
        if (iOrdinal == 3) {
            return new zzibo();
        }
        byte[] bArr = null;
        if (iOrdinal == 4) {
            return new zzibn(bArr);
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
        synchronized (zzibo.class) {
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
