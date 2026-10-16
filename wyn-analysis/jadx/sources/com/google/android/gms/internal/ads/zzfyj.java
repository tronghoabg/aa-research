package com.google.android.gms.internal.ads;

/* loaded from: classes3.dex */
public final class zzfyj extends zziep implements zziga {
    private static final zzfyj zzf;
    private static volatile zzigh zzg;
    private int zza;
    private zziex zzb = zziep.zzbC();
    private String zzc = "";
    private String zzd = "";
    private String zze = "";

    static {
        zzfyj zzfyjVar = new zzfyj();
        zzf = zzfyjVar;
        zziep.zzbu(zzfyj.class, zzfyjVar);
    }

    private zzfyj() {
    }

    public static zzfyi zza() {
        return (zzfyi) zzf.zzbn();
    }

    public final /* synthetic */ void zzb(String str) {
        str.getClass();
        this.zza |= 1;
        this.zzc = str;
    }

    public final /* synthetic */ void zzd(int i5) {
        zziex zziexVar = this.zzb;
        if (!zziexVar.zza()) {
            this.zzb = zziep.zzbD(zziexVar);
        }
        this.zzb.zzi(2);
    }

    @Override // com.google.android.gms.internal.ads.zziep
    public final Object zzdc(zzieo zzieoVar, Object obj, Object obj2) {
        zzigh zziekVar;
        int iOrdinal = zzieoVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return zziep.zzbv(zzf, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0001\u0000\u0001ࠞ\u0002ဈ\u0000\u0003ဈ\u0001\u0004ဈ\u0002", new Object[]{"zza", "zzb", zzfyh.zza, "zzc", "zzd", "zze"});
        }
        if (iOrdinal == 3) {
            return new zzfyj();
        }
        byte[] bArr = null;
        if (iOrdinal == 4) {
            return new zzfyi(bArr);
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
        synchronized (zzfyj.class) {
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
}
