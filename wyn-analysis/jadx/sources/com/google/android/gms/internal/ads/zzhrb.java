package com.google.android.gms.internal.ads;

/* loaded from: classes3.dex */
public final class zzhrb extends zziep implements zziga {
    private static final zzhrb zze;
    private static volatile zzigh zzf;
    private int zza;
    private int zzb;
    private zzhrf zzc;
    private zzhsu zzd;

    static {
        zzhrb zzhrbVar = new zzhrb();
        zze = zzhrbVar;
        zziep.zzbu(zzhrb.class, zzhrbVar);
    }

    private zzhrb() {
    }

    public static zzhrb zzd(zzidl zzidlVar, zzidz zzidzVar) throws zzifh {
        return (zzhrb) zziep.zzbT(zze, zzidlVar, zzidzVar);
    }

    public static zzhra zze() {
        return (zzhra) zze.zzbn();
    }

    public static zzigh zzg() {
        return zze.zzbd();
    }

    public final int zza() {
        return this.zzb;
    }

    public final zzhrf zzb() {
        zzhrf zzhrfVar = this.zzc;
        return zzhrfVar == null ? zzhrf.zze() : zzhrfVar;
    }

    public final zzhsu zzc() {
        zzhsu zzhsuVar = this.zzd;
        return zzhsuVar == null ? zzhsu.zzg() : zzhsuVar;
    }

    @Override // com.google.android.gms.internal.ads.zziep
    public final Object zzdc(zzieo zzieoVar, Object obj, Object obj2) {
        zzigh zziekVar;
        int iOrdinal = zzieoVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return zziep.zzbv(zze, "\u0000\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u000b\u0002ဉ\u0000\u0003ဉ\u0001", new Object[]{"zza", "zzb", "zzc", "zzd"});
        }
        if (iOrdinal == 3) {
            return new zzhrb();
        }
        byte[] bArr = null;
        if (iOrdinal == 4) {
            return new zzhra(bArr);
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
        synchronized (zzhrb.class) {
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

    public final /* synthetic */ void zzh(zzhrf zzhrfVar) {
        zzhrfVar.getClass();
        this.zzc = zzhrfVar;
        this.zza |= 1;
    }

    public final /* synthetic */ void zzi(zzhsu zzhsuVar) {
        zzhsuVar.getClass();
        this.zzd = zzhsuVar;
        this.zza |= 2;
    }
}
