package com.google.android.gms.internal.ads;

/* loaded from: classes3.dex */
public final class zzfym extends zziep implements zziga {
    private static final zzfym zzf;
    private static volatile zzigh zzg;
    private int zza;
    private int zzb;
    private String zzc = "";
    private String zzd = "";
    private zzfyj zze;

    static {
        zzfym zzfymVar = new zzfym();
        zzf = zzfymVar;
        zziep.zzbu(zzfym.class, zzfymVar);
    }

    private zzfym() {
    }

    public static zzfyk zza() {
        return (zzfyk) zzf.zzbn();
    }

    public final /* synthetic */ void zzb(String str) {
        str.getClass();
        this.zza |= 2;
        this.zzc = str;
    }

    public final /* synthetic */ void zzc(zzfyj zzfyjVar) {
        zzfyjVar.getClass();
        this.zze = zzfyjVar;
        this.zza |= 8;
    }

    @Override // com.google.android.gms.internal.ads.zziep
    public final Object zzdc(zzieo zzieoVar, Object obj, Object obj2) {
        zzigh zziekVar;
        int iOrdinal = zzieoVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return zziep.zzbv(zzf, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001᠌\u0000\u0002ဈ\u0001\u0003ဈ\u0002\u0004ဉ\u0003", new Object[]{"zza", "zzb", zzfyl.zza, "zzc", "zzd", "zze"});
        }
        if (iOrdinal == 3) {
            return new zzfym();
        }
        byte[] bArr = null;
        if (iOrdinal == 4) {
            return new zzfyk(bArr);
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
        synchronized (zzfym.class) {
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

    public final /* synthetic */ void zze(int i5) {
        this.zzb = 1;
        this.zza = 1 | this.zza;
    }
}
