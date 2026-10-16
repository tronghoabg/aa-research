package com.google.android.gms.internal.ads;

/* loaded from: classes3.dex */
public final class zzayz extends zziep implements zziga {
    private static final zzayz zzf;
    private static volatile zzigh zzg;
    private int zza;
    private zzidl zzb;
    private zzidl zzc;
    private zzidl zzd;
    private zzidl zze;

    static {
        zzayz zzayzVar = new zzayz();
        zzf = zzayzVar;
        zziep.zzbu(zzayz.class, zzayzVar);
    }

    private zzayz() {
        zzidl zzidlVar = zzidl.zza;
        this.zzb = zzidlVar;
        this.zzc = zzidlVar;
        this.zzd = zzidlVar;
        this.zze = zzidlVar;
    }

    public static zzayz zze(byte[] bArr, zzidz zzidzVar) throws zzifh {
        return (zzayz) zziep.zzbV(zzf, bArr, zzidzVar);
    }

    public static zzayy zzg() {
        return (zzayy) zzf.zzbn();
    }

    public final zzidl zza() {
        return this.zzb;
    }

    public final zzidl zzb() {
        return this.zzc;
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
            return zziep.zzbv(zzf, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ည\u0000\u0002ည\u0001\u0003ည\u0002\u0004ည\u0003", new Object[]{"zza", "zzb", "zzc", "zzd", "zze"});
        }
        if (iOrdinal == 3) {
            return new zzayz();
        }
        byte[] bArr = null;
        if (iOrdinal == 4) {
            return new zzayy(bArr);
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
        synchronized (zzayz.class) {
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

    public final /* synthetic */ void zzh(zzidl zzidlVar) {
        zzidlVar.getClass();
        this.zza |= 1;
        this.zzb = zzidlVar;
    }

    public final /* synthetic */ void zzi(zzidl zzidlVar) {
        zzidlVar.getClass();
        this.zza |= 2;
        this.zzc = zzidlVar;
    }

    public final /* synthetic */ void zzj(zzidl zzidlVar) {
        zzidlVar.getClass();
        this.zza |= 4;
        this.zzd = zzidlVar;
    }

    public final /* synthetic */ void zzk(zzidl zzidlVar) {
        zzidlVar.getClass();
        this.zza |= 8;
        this.zze = zzidlVar;
    }
}
