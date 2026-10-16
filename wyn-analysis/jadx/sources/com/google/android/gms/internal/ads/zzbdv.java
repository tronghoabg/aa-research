package com.google.android.gms.internal.ads;

/* loaded from: classes3.dex */
public final class zzbdv extends zziep implements zziga {
    private static final zzbdv zzc;
    private static volatile zzigh zzd;
    private int zza;
    private zzawx zzb;

    static {
        zzbdv zzbdvVar = new zzbdv();
        zzc = zzbdvVar;
        zziep.zzbu(zzbdv.class, zzbdvVar);
    }

    private zzbdv() {
    }

    public static zzbdu zza() {
        return (zzbdu) zzc.zzbn();
    }

    public final /* synthetic */ void zzb(zzawx zzawxVar) {
        zzawxVar.getClass();
        this.zzb = zzawxVar;
        this.zza |= 1;
    }

    @Override // com.google.android.gms.internal.ads.zziep
    public final Object zzdc(zzieo zzieoVar, Object obj, Object obj2) {
        zzigh zziekVar;
        int iOrdinal = zzieoVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return zziep.zzbv(zzc, "\u0004\u0001\u0000\u0001\u0012\u0012\u0001\u0000\u0000\u0000\u0012ဉ\u0000", new Object[]{"zza", "zzb"});
        }
        if (iOrdinal == 3) {
            return new zzbdv();
        }
        byte[] bArr = null;
        if (iOrdinal == 4) {
            return new zzbdu(bArr);
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
        synchronized (zzbdv.class) {
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
