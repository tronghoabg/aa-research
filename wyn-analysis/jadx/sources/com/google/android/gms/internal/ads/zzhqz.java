package com.google.android.gms.internal.ads;

/* loaded from: classes3.dex */
public final class zzhqz extends zziep implements zziga {
    private static final zzhqz zzb;
    private static volatile zzigh zzc;
    private int zza;

    static {
        zzhqz zzhqzVar = new zzhqz();
        zzb = zzhqzVar;
        zziep.zzbu(zzhqz.class, zzhqzVar);
    }

    private zzhqz() {
    }

    public static zzhqy zzb() {
        return (zzhqy) zzb.zzbn();
    }

    public static zzhqz zzc() {
        return zzb;
    }

    public final int zza() {
        return this.zza;
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
            return zziep.zzbv(zzb, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u000b", new Object[]{"zza"});
        }
        if (iOrdinal == 3) {
            return new zzhqz();
        }
        byte[] bArr = null;
        if (iOrdinal == 4) {
            return new zzhqy(bArr);
        }
        if (iOrdinal == 5) {
            return zzb;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        zzigh zzighVar = zzc;
        if (zzighVar != null) {
            return zzighVar;
        }
        synchronized (zzhqz.class) {
            try {
                zziekVar = zzc;
                if (zziekVar == null) {
                    zziekVar = new zziek(zzb);
                    zzc = zziekVar;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return zziekVar;
    }
}
