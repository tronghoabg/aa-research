package com.google.android.gms.internal.ads;

import com.applovin.shadow.okhttp3.internal.http2.Http2;
import com.applovin.shadow.okio.Segment;

/* loaded from: classes3.dex */
public final class zzayq extends zziep implements zziga {
    private static final zzayq zzA;
    private static volatile zzigh zzB;
    private int zza;
    private long zzu;
    private long zzv;
    private long zzb = -1;
    private long zzc = -1;
    private long zzd = -1;
    private long zze = -1;
    private long zzf = -1;
    private long zzg = -1;
    private int zzh = 1000;
    private long zzi = -1;
    private long zzj = -1;
    private long zzk = -1;
    private int zzl = 1000;
    private long zzm = -1;
    private long zzn = -1;
    private long zzo = -1;
    private long zzp = -1;
    private long zzw = -1;
    private long zzx = -1;
    private long zzy = -1;
    private long zzz = -1;

    static {
        zzayq zzayqVar = new zzayq();
        zzA = zzayqVar;
        zziep.zzbu(zzayq.class, zzayqVar);
    }

    private zzayq() {
    }

    public static zzayp zza() {
        return (zzayp) zzA.zzbn();
    }

    public final /* synthetic */ void zzb(long j8) {
        this.zza |= 1;
        this.zzb = j8;
    }

    public final /* synthetic */ void zzc(long j8) {
        this.zza |= 2;
        this.zzc = j8;
    }

    public final /* synthetic */ void zzd(long j8) {
        this.zza |= 4;
        this.zzd = j8;
    }

    @Override // com.google.android.gms.internal.ads.zziep
    public final Object zzdc(zzieo zzieoVar, Object obj, Object obj2) {
        zzigh zziekVar;
        int iOrdinal = zzieoVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            zziev zzievVar = zzazd.zza;
            return zziep.zzbv(zzA, "\u0001\u0015\u0000\u0001\u0001\u0015\u0015\u0000\u0000\u0000\u0001ဂ\u0000\u0002ဂ\u0001\u0003ဂ\u0002\u0004ဂ\u0003\u0005ဂ\u0004\u0006ဂ\u0005\u0007᠌\u0006\bဂ\u0007\tဂ\b\nဂ\t\u000b᠌\n\fဂ\u000b\rဂ\f\u000eဂ\r\u000fဂ\u000e\u0010ဂ\u000f\u0011ဂ\u0010\u0012ဂ\u0011\u0013ဂ\u0012\u0014ဂ\u0013\u0015ဂ\u0014", new Object[]{"zza", "zzb", "zzc", "zzd", "zze", "zzf", "zzg", "zzh", zzievVar, "zzi", "zzj", "zzk", "zzl", zzievVar, "zzm", "zzn", "zzo", "zzp", "zzu", "zzv", "zzw", "zzx", "zzy", "zzz"});
        }
        if (iOrdinal == 3) {
            return new zzayq();
        }
        byte[] bArr = null;
        if (iOrdinal == 4) {
            return new zzayp(bArr);
        }
        if (iOrdinal == 5) {
            return zzA;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        zzigh zzighVar = zzB;
        if (zzighVar != null) {
            return zzighVar;
        }
        synchronized (zzayq.class) {
            try {
                zziekVar = zzB;
                if (zziekVar == null) {
                    zziekVar = new zziek(zzA);
                    zzB = zziekVar;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return zziekVar;
    }

    public final /* synthetic */ void zze(long j8) {
        this.zza |= 8;
        this.zze = j8;
    }

    public final /* synthetic */ void zzg() {
        this.zza &= -9;
        this.zze = -1L;
    }

    public final /* synthetic */ void zzh(long j8) {
        this.zza |= 16;
        this.zzf = j8;
    }

    public final /* synthetic */ void zzi(long j8) {
        this.zza |= 32;
        this.zzg = j8;
    }

    public final /* synthetic */ void zzj(long j8) {
        this.zza |= 128;
        this.zzi = j8;
    }

    public final /* synthetic */ void zzk(long j8) {
        this.zza |= 256;
        this.zzj = j8;
    }

    public final /* synthetic */ void zzl(long j8) {
        this.zza |= 512;
        this.zzk = j8;
    }

    public final /* synthetic */ void zzm(long j8) {
        this.zza |= 2048;
        this.zzm = j8;
    }

    public final /* synthetic */ void zzn(long j8) {
        this.zza |= 4096;
        this.zzn = j8;
    }

    public final /* synthetic */ void zzo(long j8) {
        this.zza |= Segment.SIZE;
        this.zzo = j8;
    }

    public final /* synthetic */ void zzp(long j8) {
        this.zza |= Http2.INITIAL_MAX_FRAME_SIZE;
        this.zzp = j8;
    }

    public final /* synthetic */ void zzq(long j8) {
        this.zza |= 32768;
        this.zzu = j8;
    }

    public final /* synthetic */ void zzr(long j8) {
        this.zza |= 65536;
        this.zzv = j8;
    }

    public final /* synthetic */ void zzs(long j8) {
        this.zza |= 131072;
        this.zzw = j8;
    }

    public final /* synthetic */ void zzt(long j8) {
        this.zza |= 262144;
        this.zzx = j8;
    }

    public final /* synthetic */ void zzv(int i5) {
        this.zzh = i5 - 1;
        this.zza |= 64;
    }

    public final /* synthetic */ void zzw(int i5) {
        this.zzl = i5 - 1;
        this.zza |= Segment.SHARE_MINIMUM;
    }
}
