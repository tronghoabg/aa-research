package com.google.android.gms.internal.ads;

/* loaded from: classes3.dex */
public final class zzhul extends zziep implements zziga {
    private static final zzhul zzd;
    private static volatile zzigh zze;
    private int zza;
    private int zzb;
    private int zzc;

    static {
        zzhul zzhulVar = new zzhul();
        zzd = zzhulVar;
        zziep.zzbu(zzhul.class, zzhulVar);
    }

    private zzhul() {
    }

    public static zzhuk zzd() {
        return (zzhuk) zzd.zzbn();
    }

    public static zzhul zze() {
        return zzd;
    }

    public final zzhss zza() {
        zzhss zzhssVarZzb = zzhss.zzb(this.zza);
        return zzhssVarZzb == null ? zzhss.UNRECOGNIZED : zzhssVarZzb;
    }

    public final zzhss zzb() {
        zzhss zzhssVarZzb = zzhss.zzb(this.zzb);
        return zzhssVarZzb == null ? zzhss.UNRECOGNIZED : zzhssVarZzb;
    }

    public final int zzc() {
        return this.zzc;
    }

    @Override // com.google.android.gms.internal.ads.zziep
    public final Object zzdc(zzieo zzieoVar, Object obj, Object obj2) {
        zzigh zziekVar;
        int iOrdinal = zzieoVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return zziep.zzbv(zzd, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001\f\u0002\f\u0003\u0004", new Object[]{"zza", "zzb", "zzc"});
        }
        if (iOrdinal == 3) {
            return new zzhul();
        }
        byte[] bArr = null;
        if (iOrdinal == 4) {
            return new zzhuk(bArr);
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
        synchronized (zzhul.class) {
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

    public final /* synthetic */ void zzg(zzhss zzhssVar) {
        this.zza = zzhssVar.zza();
    }

    public final /* synthetic */ void zzh(zzhss zzhssVar) {
        this.zzb = zzhssVar.zza();
    }

    public final /* synthetic */ void zzi(int i5) {
        this.zzc = i5;
    }
}
