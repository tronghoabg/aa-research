package com.google.android.gms.internal.ads;

import com.applovin.shadow.okio.Segment;

/* loaded from: classes3.dex */
public final class zzaxd extends zziep implements zziga {
    private static final zzaxd zzo;
    private static volatile zzigh zzp;
    private int zza;
    private long zzc;
    private long zzg;
    private long zzh;
    private long zzj;
    private int zzn;
    private String zzb = "";
    private String zzd = "";
    private String zze = "";
    private String zzf = "";
    private String zzi = "";
    private String zzk = "";
    private String zzl = "";
    private zzifb zzm = zziep.zzbM();

    static {
        zzaxd zzaxdVar = new zzaxd();
        zzo = zzaxdVar;
        zziep.zzbu(zzaxd.class, zzaxdVar);
    }

    private zzaxd() {
    }

    public static zzawz zza() {
        return (zzawz) zzo.zzbn();
    }

    public final /* synthetic */ void zzb(String str) {
        str.getClass();
        this.zza |= 1;
        this.zzb = str;
    }

    public final /* synthetic */ void zzc(long j8) {
        this.zza |= 2;
        this.zzc = j8;
    }

    public final /* synthetic */ void zzd(String str) {
        str.getClass();
        this.zza |= 4;
        this.zzd = str;
    }

    @Override // com.google.android.gms.internal.ads.zziep
    public final Object zzdc(zzieo zzieoVar, Object obj, Object obj2) {
        zzigh zziekVar;
        int iOrdinal = zzieoVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return zziep.zzbv(zzo, "\u0004\r\u0000\u0001\u0001\r\r\u0000\u0001\u0000\u0001ဈ\u0000\u0002ဂ\u0001\u0003ဈ\u0002\u0004ဈ\u0003\u0005ဈ\u0004\u0006ဂ\u0005\u0007ဂ\u0006\bဈ\u0007\tဂ\b\nဈ\t\u000bဈ\n\f\u001b\r᠌\u000b", new Object[]{"zza", "zzb", "zzc", "zzd", "zze", "zzf", "zzg", "zzh", "zzi", "zzj", "zzk", "zzl", "zzm", zzaxb.class, "zzn", zzaxc.zza});
        }
        if (iOrdinal == 3) {
            return new zzaxd();
        }
        byte[] bArr = null;
        if (iOrdinal == 4) {
            return new zzawz(bArr);
        }
        if (iOrdinal == 5) {
            return zzo;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        zzigh zzighVar = zzp;
        if (zzighVar != null) {
            return zzighVar;
        }
        synchronized (zzaxd.class) {
            try {
                zziekVar = zzp;
                if (zziekVar == null) {
                    zziekVar = new zziek(zzo);
                    zzp = zziekVar;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return zziekVar;
    }

    public final /* synthetic */ void zze(String str) {
        str.getClass();
        this.zza |= 8;
        this.zze = str;
    }

    public final /* synthetic */ void zzg(String str) {
        this.zza |= 16;
        this.zzf = str;
    }

    public final /* synthetic */ void zzh(String str) {
        this.zza |= Segment.SHARE_MINIMUM;
        this.zzl = str;
    }

    public final /* synthetic */ void zzj(int i5) {
        this.zzn = i5 - 1;
        this.zza |= 2048;
    }
}
