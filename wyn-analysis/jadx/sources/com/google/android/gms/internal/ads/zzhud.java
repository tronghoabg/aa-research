package com.google.android.gms.internal.ads;

/* loaded from: classes3.dex */
public final class zzhud extends zziep implements zziga {
    private static final zzhud zzb;
    private static volatile zzigh zzc;
    private int zza;

    static {
        zzhud zzhudVar = new zzhud();
        zzb = zzhudVar;
        zziep.zzbu(zzhud.class, zzhudVar);
    }

    private zzhud() {
    }

    public static zzhuc zzb() {
        return (zzhuc) zzb.zzbn();
    }

    public static zzhud zzc() {
        return zzb;
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
            return zziep.zzbv(zzb, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\f", new Object[]{"zza"});
        }
        if (iOrdinal == 3) {
            return new zzhud();
        }
        byte[] bArr = null;
        if (iOrdinal == 4) {
            return new zzhuc(bArr);
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
        synchronized (zzhud.class) {
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
