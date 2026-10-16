package com.google.android.gms.internal.ads;

/* loaded from: classes3.dex */
public final class zzhsj extends zziep implements zziga {
    private static final zzhsj zzf;
    private static volatile zzigh zzg;
    private int zza;
    private int zzb;
    private zzhsf zzc;
    private zzidl zzd;
    private zzidl zze;

    static {
        zzhsj zzhsjVar = new zzhsj();
        zzf = zzhsjVar;
        zziep.zzbu(zzhsj.class, zzhsjVar);
    }

    private zzhsj() {
        zzidl zzidlVar = zzidl.zza;
        this.zzd = zzidlVar;
        this.zze = zzidlVar;
    }

    public static zzhsj zze(zzidl zzidlVar, zzidz zzidzVar) throws zzifh {
        return (zzhsj) zziep.zzbT(zzf, zzidlVar, zzidzVar);
    }

    public static zzhsi zzg() {
        return (zzhsi) zzf.zzbn();
    }

    public static zzhsj zzh() {
        return zzf;
    }

    public static zzigh zzi() {
        return zzf.zzbd();
    }

    public final int zza() {
        return this.zzb;
    }

    public final zzhsf zzb() {
        zzhsf zzhsfVar = this.zzc;
        return zzhsfVar == null ? zzhsf.zzc() : zzhsfVar;
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
            return new zzhsj();
        }
        byte[] bArr = null;
        if (iOrdinal == 4) {
            return new zzhsi(bArr);
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
        synchronized (zzhsj.class) {
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

    public final /* synthetic */ void zzj(zzhsf zzhsfVar) {
        zzhsfVar.getClass();
        this.zzc = zzhsfVar;
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
