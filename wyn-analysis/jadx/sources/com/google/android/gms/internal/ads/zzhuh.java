package com.google.android.gms.internal.ads;

/* loaded from: classes3.dex */
public final class zzhuh extends zziep implements zziga {
    private static final zzhuh zzf;
    private static volatile zzigh zzg;
    private int zza;
    private int zzb;
    private zzhud zzc;
    private zzidl zzd;
    private zzidl zze;

    static {
        zzhuh zzhuhVar = new zzhuh();
        zzf = zzhuhVar;
        zziep.zzbu(zzhuh.class, zzhuhVar);
    }

    private zzhuh() {
        zzidl zzidlVar = zzidl.zza;
        this.zzd = zzidlVar;
        this.zze = zzidlVar;
    }

    public static zzhuh zze(zzidl zzidlVar, zzidz zzidzVar) throws zzifh {
        return (zzhuh) zziep.zzbT(zzf, zzidlVar, zzidzVar);
    }

    public static zzhug zzg() {
        return (zzhug) zzf.zzbn();
    }

    public static zzhuh zzh() {
        return zzf;
    }

    public static zzigh zzi() {
        return zzf.zzbd();
    }

    public final int zza() {
        return this.zzb;
    }

    public final zzhud zzb() {
        zzhud zzhudVar = this.zzc;
        return zzhudVar == null ? zzhud.zzc() : zzhudVar;
    }

    public final zzidl zzc() {
        return this.zzd;
    }

    public final zzidl zzd() {
        return this.zze;
    }

    @Override // com.google.android.gms.internal.ads.zziep
    public final Object zzdc(zzieo zzieoVar, Object obj, Object obj2) {
        zzigh zziekVar;
        int iOrdinal = zzieoVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return zziep.zzbv(zzf, "\u0000\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001\u000b\u0002ဉ\u0000\u0003\n\u0004\n", new Object[]{"zza", "zzb", "zzc", "zzd", "zze"});
        }
        if (iOrdinal == 3) {
            return new zzhuh();
        }
        byte[] bArr = null;
        if (iOrdinal == 4) {
            return new zzhug(bArr);
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
        synchronized (zzhuh.class) {
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

    public final /* synthetic */ void zzj(zzhud zzhudVar) {
        zzhudVar.getClass();
        this.zzc = zzhudVar;
        this.zza |= 1;
    }

    public final /* synthetic */ void zzk(zzidl zzidlVar) {
        zzidlVar.getClass();
        this.zzd = zzidlVar;
    }

    public final /* synthetic */ void zzl(zzidl zzidlVar) {
        zzidlVar.getClass();
        this.zze = zzidlVar;
    }
}
