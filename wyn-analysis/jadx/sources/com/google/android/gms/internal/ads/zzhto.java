package com.google.android.gms.internal.ads;

/* loaded from: classes3.dex */
public final class zzhto extends zziep implements zziga {
    private static final zzhto zzc;
    private static volatile zzigh zzd;
    private int zza;
    private zzifb zzb = zziep.zzbM();

    static {
        zzhto zzhtoVar = new zzhto();
        zzc = zzhtoVar;
        zziep.zzbu(zzhto.class, zzhtoVar);
    }

    private zzhto() {
    }

    public static zzhtl zza() {
        return (zzhtl) zzc.zzbn();
    }

    public final /* synthetic */ void zzb(int i5) {
        this.zza = i5;
    }

    public final /* synthetic */ void zzc(zzhtn zzhtnVar) {
        zzhtnVar.getClass();
        zzifb zzifbVar = this.zzb;
        if (!zzifbVar.zza()) {
            this.zzb = zziep.zzbN(zzifbVar);
        }
        this.zzb.add(zzhtnVar);
    }

    @Override // com.google.android.gms.internal.ads.zziep
    public final Object zzdc(zzieo zzieoVar, Object obj, Object obj2) {
        zzigh zziekVar;
        int iOrdinal = zzieoVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return zziep.zzbv(zzc, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0001\u0000\u0001\u000b\u0002\u001b", new Object[]{"zza", "zzb", zzhtn.class});
        }
        if (iOrdinal == 3) {
            return new zzhto();
        }
        byte[] bArr = null;
        if (iOrdinal == 4) {
            return new zzhtl(bArr);
        }
        if (iOrdinal == 5) {
            return zzc;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        zzigh zzighVar = zzd;
        if (zzighVar != null) {
            return zzighVar;
        }
        synchronized (zzhto.class) {
            try {
                zziekVar = zzd;
                if (zziekVar == null) {
                    zziekVar = new zziek(zzc);
                    zzd = zziekVar;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return zziekVar;
    }
}
