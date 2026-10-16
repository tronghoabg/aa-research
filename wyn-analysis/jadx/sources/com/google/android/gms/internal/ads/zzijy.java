package com.google.android.gms.internal.ads;

/* loaded from: classes3.dex */
public final class zzijy extends zziep implements zziga {
    private static final zzijy zzf;
    private static volatile zzigh zzg;
    private int zza;
    private int zzb;
    private String zzc = "";
    private zzidl zzd;
    private zzidl zze;

    static {
        zzijy zzijyVar = new zzijy();
        zzf = zzijyVar;
        zziep.zzbu(zzijy.class, zzijyVar);
    }

    private zzijy() {
        zzidl zzidlVar = zzidl.zza;
        this.zzd = zzidlVar;
        this.zze = zzidlVar;
    }

    public static zzijw zzc() {
        return (zzijw) zzf.zzbn();
    }

    public final /* synthetic */ void zzd(String str) {
        this.zza |= 2;
        this.zzc = "image/png";
    }

    @Override // com.google.android.gms.internal.ads.zziep
    public final Object zzdc(zzieo zzieoVar, Object obj, Object obj2) {
        zzigh zziekVar;
        int iOrdinal = zzieoVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return zziep.zzbv(zzf, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001᠌\u0000\u0002ဈ\u0001\u0003ည\u0002\u0004ည\u0003", new Object[]{"zza", "zzb", zzijx.zza, "zzc", "zzd", "zze"});
        }
        if (iOrdinal == 3) {
            return new zzijy();
        }
        byte[] bArr = null;
        if (iOrdinal == 4) {
            return new zzijw(bArr);
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
        synchronized (zzijy.class) {
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

    public final /* synthetic */ void zze(zzidl zzidlVar) {
        zzidlVar.getClass();
        this.zza |= 4;
        this.zzd = zzidlVar;
    }

    public final /* synthetic */ void zzh(int i5) {
        this.zzb = 1;
        this.zza = 1 | this.zza;
    }
}
