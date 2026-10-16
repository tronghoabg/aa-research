package com.google.android.gms.internal.ads;

/* loaded from: classes3.dex */
public final class zzhub extends zziep implements zziga {
    private static final zzhub zze;
    private static volatile zzigh zzf;
    private int zza;
    private zzhud zzb;
    private int zzc;
    private zzidl zzd = zzidl.zza;

    static {
        zzhub zzhubVar = new zzhub();
        zze = zzhubVar;
        zziep.zzbu(zzhub.class, zzhubVar);
    }

    private zzhub() {
    }

    public static zzhub zzd(zzidl zzidlVar, zzidz zzidzVar) throws zzifh {
        return (zzhub) zziep.zzbT(zze, zzidlVar, zzidzVar);
    }

    public static zzhua zze() {
        return (zzhua) zze.zzbn();
    }

    public final zzhud zza() {
        zzhud zzhudVar = this.zzb;
        return zzhudVar == null ? zzhud.zzc() : zzhudVar;
    }

    public final int zzb() {
        return this.zzc;
    }

    public final zzidl zzc() {
        return this.zzd;
    }

    @Override // com.google.android.gms.internal.ads.zziep
    public final Object zzdc(zzieo zzieoVar, Object obj, Object obj2) {
        zzigh zziekVar;
        int iOrdinal = zzieoVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return zziep.zzbv(zze, "\u0000\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဉ\u0000\u0002\u000b\u0003\n", new Object[]{"zza", "zzb", "zzc", "zzd"});
        }
        if (iOrdinal == 3) {
            return new zzhub();
        }
        byte[] bArr = null;
        if (iOrdinal == 4) {
            return new zzhua(bArr);
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
        synchronized (zzhub.class) {
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

    public final /* synthetic */ void zzg(zzhud zzhudVar) {
        zzhudVar.getClass();
        this.zzb = zzhudVar;
        this.zza |= 1;
    }

    public final /* synthetic */ void zzh(int i5) {
        this.zzc = i5;
    }

    public final /* synthetic */ void zzi(zzidl zzidlVar) {
        zzidlVar.getClass();
        this.zzd = zzidlVar;
    }
}
