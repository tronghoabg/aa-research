package com.google.android.gms.internal.ads;

/* loaded from: classes3.dex */
public final class zzhuj extends zziep implements zziga {
    private static final zzhuj zze;
    private static volatile zzigh zzf;
    private int zza;
    private zzhul zzb;
    private int zzc;
    private zzidl zzd = zzidl.zza;

    static {
        zzhuj zzhujVar = new zzhuj();
        zze = zzhujVar;
        zziep.zzbu(zzhuj.class, zzhujVar);
    }

    private zzhuj() {
    }

    public static zzhuj zzd(zzidl zzidlVar, zzidz zzidzVar) throws zzifh {
        return (zzhuj) zziep.zzbT(zze, zzidlVar, zzidzVar);
    }

    public static zzhui zze() {
        return (zzhui) zze.zzbn();
    }

    public final zzhul zza() {
        zzhul zzhulVar = this.zzb;
        return zzhulVar == null ? zzhul.zze() : zzhulVar;
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
            return new zzhuj();
        }
        byte[] bArr = null;
        if (iOrdinal == 4) {
            return new zzhui(bArr);
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
        synchronized (zzhuj.class) {
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

    public final /* synthetic */ void zzg(zzhul zzhulVar) {
        zzhulVar.getClass();
        this.zzb = zzhulVar;
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
