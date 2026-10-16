package com.google.android.gms.internal.ads;

/* loaded from: classes3.dex */
public final class zzhtn extends zziep implements zziga {
    private static final zzhtn zze;
    private static volatile zzigh zzf;
    private String zza = "";
    private int zzb;
    private int zzc;
    private int zzd;

    static {
        zzhtn zzhtnVar = new zzhtn();
        zze = zzhtnVar;
        zziep.zzbu(zzhtn.class, zzhtnVar);
    }

    private zzhtn() {
    }

    public static zzhtm zza() {
        return (zzhtm) zze.zzbn();
    }

    public final /* synthetic */ void zzb(String str) {
        str.getClass();
        this.zza = str;
    }

    public final /* synthetic */ void zzc(int i5) {
        this.zzc = i5;
    }

    public final /* synthetic */ void zzd(zzhtx zzhtxVar) {
        this.zzd = zzhtxVar.zza();
    }

    @Override // com.google.android.gms.internal.ads.zziep
    public final Object zzdc(zzieo zzieoVar, Object obj, Object obj2) {
        zzigh zziekVar;
        int iOrdinal = zzieoVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return zziep.zzbv(zze, "\u0000\u0004\u0000\u0000\u0001\u0004\u0004\u0000\u0000\u0000\u0001Ȉ\u0002\f\u0003\u000b\u0004\f", new Object[]{"zza", "zzb", "zzc", "zzd"});
        }
        if (iOrdinal == 3) {
            return new zzhtn();
        }
        byte[] bArr = null;
        if (iOrdinal == 4) {
            return new zzhtm(bArr);
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
        synchronized (zzhtn.class) {
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

    public final /* synthetic */ void zzg(int i5) {
        this.zzb = zzhtc.zza(i5);
    }
}
