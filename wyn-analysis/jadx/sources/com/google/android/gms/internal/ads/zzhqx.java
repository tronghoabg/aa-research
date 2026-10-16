package com.google.android.gms.internal.ads;

/* loaded from: classes3.dex */
public final class zzhqx extends zziep implements zziga {
    private static final zzhqx zzd;
    private static volatile zzigh zze;
    private int zza;
    private int zzb;
    private zzhqz zzc;

    static {
        zzhqx zzhqxVar = new zzhqx();
        zzd = zzhqxVar;
        zziep.zzbu(zzhqx.class, zzhqxVar);
    }

    private zzhqx() {
    }

    public static zzhqx zzc(zzidl zzidlVar, zzidz zzidzVar) throws zzifh {
        return (zzhqx) zziep.zzbT(zzd, zzidlVar, zzidzVar);
    }

    public static zzhqw zzd() {
        return (zzhqw) zzd.zzbn();
    }

    public final int zza() {
        return this.zzb;
    }

    public final zzhqz zzb() {
        zzhqz zzhqzVar = this.zzc;
        return zzhqzVar == null ? zzhqz.zzc() : zzhqzVar;
    }

    @Override // com.google.android.gms.internal.ads.zziep
    public final Object zzdc(zzieo zzieoVar, Object obj, Object obj2) {
        zzigh zziekVar;
        int iOrdinal = zzieoVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return zziep.zzbv(zzd, "\u0000\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u000b\u0002ဉ\u0000", new Object[]{"zza", "zzb", "zzc"});
        }
        if (iOrdinal == 3) {
            return new zzhqx();
        }
        byte[] bArr = null;
        if (iOrdinal == 4) {
            return new zzhqw(bArr);
        }
        if (iOrdinal == 5) {
            return zzd;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        zzigh zzighVar = zze;
        if (zzighVar != null) {
            return zzighVar;
        }
        synchronized (zzhqx.class) {
            try {
                zziekVar = zze;
                if (zziekVar == null) {
                    zziekVar = new zziek(zzd);
                    zze = zziekVar;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return zziekVar;
    }

    public final /* synthetic */ void zze(int i5) {
        this.zzb = i5;
    }

    public final /* synthetic */ void zzg(zzhqz zzhqzVar) {
        zzhqzVar.getClass();
        this.zzc = zzhqzVar;
        this.zza |= 1;
    }
}
