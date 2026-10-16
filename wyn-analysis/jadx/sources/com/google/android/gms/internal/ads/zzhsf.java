package com.google.android.gms.internal.ads;

/* loaded from: classes3.dex */
public final class zzhsf extends zziep implements zziga {
    private static final zzhsf zzd;
    private static volatile zzigh zze;
    private int zza;
    private int zzb;
    private int zzc;

    static {
        zzhsf zzhsfVar = new zzhsf();
        zzd = zzhsfVar;
        zziep.zzbu(zzhsf.class, zzhsfVar);
    }

    private zzhsf() {
    }

    public static zzhse zzb() {
        return (zzhse) zzd.zzbn();
    }

    public static zzhsf zzc() {
        return zzd;
    }

    public final zzhss zza() {
        zzhss zzhssVarZzb = zzhss.zzb(this.zza);
        return zzhssVarZzb == null ? zzhss.UNRECOGNIZED : zzhssVarZzb;
    }

    public final /* synthetic */ void zzd(zzhss zzhssVar) {
        this.zza = zzhssVar.zza();
    }

    @Override // com.google.android.gms.internal.ads.zziep
    public final Object zzdc(zzieo zzieoVar, Object obj, Object obj2) {
        zzigh zziekVar;
        int iOrdinal = zzieoVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return zziep.zzbv(zzd, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001\f\u0002\f\u0003\f", new Object[]{"zza", "zzb", "zzc"});
        }
        if (iOrdinal == 3) {
            return new zzhsf();
        }
        byte[] bArr = null;
        if (iOrdinal == 4) {
            return new zzhse(bArr);
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
        synchronized (zzhsf.class) {
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

    public final int zzg() {
        int i5 = this.zzb;
        int i10 = i5 != 0 ? i5 != 2 ? i5 != 3 ? i5 != 4 ? i5 != 5 ? 0 : 7 : 6 : 5 : 4 : 2;
        if (i10 == 0) {
            return 1;
        }
        return i10;
    }

    public final int zzh() {
        int i5 = this.zzc;
        int i10 = i5 != 0 ? i5 != 1 ? i5 != 2 ? 0 : 4 : 3 : 2;
        if (i10 == 0) {
            return 1;
        }
        return i10;
    }

    public final /* synthetic */ void zzi(int i5) {
        this.zzb = zzhsr.zza(i5);
    }

    public final /* synthetic */ void zzj(int i5) {
        this.zzc = zzhsk.zza(i5);
    }
}
