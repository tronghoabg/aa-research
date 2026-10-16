package com.google.android.gms.internal.ads;

import com.applovin.shadow.okhttp3.internal.http2.Http2Connection;
import com.applovin.shadow.okio.Segment;

/* loaded from: classes3.dex */
public final class zzgdq extends zziep implements zziga {
    private static final zzgdq zzE;
    private static volatile zzigh zzF;
    private boolean zzC;
    private boolean zzD;
    private int zza;
    private int zzb;
    private boolean zze;
    private boolean zzf;
    private int zzh;
    private zzgei zzj;
    private boolean zzk;
    private zzgek zzn;
    private int zzc = 1;
    private boolean zzd = true;
    private String zzg = "unknown_host";
    private boolean zzi = true;
    private long zzl = 100;
    private long zzm = 2000;
    private long zzo = 10;
    private long zzp = 100;
    private long zzu = 20000;
    private String zzv = "";
    private String zzw = "";
    private long zzx = 500;
    private long zzy = 3000;
    private boolean zzz = true;
    private boolean zzA = true;
    private boolean zzB = true;

    static {
        zzgdq zzgdqVar = new zzgdq();
        zzE = zzgdqVar;
        zziep.zzbu(zzgdq.class, zzgdqVar);
    }

    private zzgdq() {
    }

    public static zzgdo zzx() {
        return (zzgdo) zzE.zzbn();
    }

    public final /* synthetic */ void zzA(boolean z2) {
        this.zza |= 16;
        this.zzf = z2;
    }

    public final /* synthetic */ void zzB(String str) {
        str.getClass();
        this.zza |= 32;
        this.zzg = str;
    }

    public final /* synthetic */ void zzC(zzgei zzgeiVar) {
        zzgeiVar.getClass();
        this.zzj = zzgeiVar;
        this.zza |= 256;
    }

    public final /* synthetic */ void zzD(long j8) {
        this.zza |= Segment.SHARE_MINIMUM;
        this.zzl = j8;
    }

    public final /* synthetic */ void zzE(long j8) {
        this.zza |= 2048;
        this.zzm = j8;
    }

    public final /* synthetic */ void zzF(zzgek zzgekVar) {
        zzgekVar.getClass();
        this.zzn = zzgekVar;
        this.zza |= 4096;
    }

    public final /* synthetic */ void zzG(long j8) {
        this.zza |= 524288;
        this.zzy = j8;
    }

    public final /* synthetic */ void zzH(boolean z2) {
        this.zza |= 1048576;
        this.zzz = z2;
    }

    public final /* synthetic */ void zzI(boolean z2) {
        this.zza |= Http2Connection.OKHTTP_CLIENT_WINDOW_SIZE;
        this.zzD = z2;
    }

    public final int zzK() {
        int iZza = zzgds.zza(this.zzb);
        if (iZza == 0) {
            return 1;
        }
        return iZza;
    }

    public final int zzL() {
        int iZza = zzgds.zza(this.zzc);
        if (iZza == 0) {
            return 2;
        }
        return iZza;
    }

    public final int zzM() {
        int i5 = this.zzh;
        int i10 = i5 != 0 ? i5 != 1 ? i5 != 2 ? i5 != 3 ? 0 : 5 : 4 : 3 : 2;
        if (i10 == 0) {
            return 1;
        }
        return i10;
    }

    public final /* synthetic */ void zzN(int i5) {
        this.zzb = i5 - 1;
        this.zza |= 1;
    }

    public final /* synthetic */ void zzO(int i5) {
        this.zzh = zzgdp.zza(3);
        this.zza |= 64;
    }

    public final boolean zza() {
        return this.zzd;
    }

    public final boolean zzb() {
        return this.zze;
    }

    public final boolean zzc() {
        return this.zzf;
    }

    public final String zzd() {
        return this.zzg;
    }

    @Override // com.google.android.gms.internal.ads.zziep
    public final Object zzdc(zzieo zzieoVar, Object obj, Object obj2) {
        zzigh zziekVar;
        int iOrdinal = zzieoVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            zziev zzievVar = zzgdr.zza;
            return zziep.zzbv(zzE, "\u0004\u0019\u0000\u0001\u0001\u001a\u0019\u0000\u0000\u0000\u0001᠌\u0000\u0003ဈ\u0005\u0004ဇ\u0007\u0005ဉ\b\u0006ဇ\t\u0007ဂ\u000b\bဉ\f\tဇ\u0002\nဂ\r\u000bဂ\u000e\fဂ\u000f\rဈ\u0010\u000eဈ\u0011\u000fဂ\u0012\u0010ဂ\u0013\u0011ဇ\u0014\u0012ဂ\n\u0013ဇ\u0015\u0014ဇ\u0016\u0015ဇ\u0017\u0016᠌\u0001\u0017ဇ\u0003\u0018ဇ\u0004\u0019ဌ\u0006\u001aဇ\u0018", new Object[]{"zza", "zzb", zzievVar, "zzg", "zzi", "zzj", "zzk", "zzm", "zzn", "zzd", "zzo", "zzp", "zzu", "zzv", "zzw", "zzx", "zzy", "zzz", "zzl", "zzA", "zzB", "zzC", "zzc", zzievVar, "zze", "zzf", "zzh", "zzD"});
        }
        if (iOrdinal == 3) {
            return new zzgdq();
        }
        byte[] bArr = null;
        if (iOrdinal == 4) {
            return new zzgdo(bArr);
        }
        if (iOrdinal == 5) {
            return zzE;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        zzigh zzighVar = zzF;
        if (zzighVar != null) {
            return zzighVar;
        }
        synchronized (zzgdq.class) {
            try {
                zziekVar = zzF;
                if (zziekVar == null) {
                    zziekVar = new zziek(zzE);
                    zzF = zziekVar;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return zziekVar;
    }

    public final boolean zze() {
        return this.zzi;
    }

    public final zzgei zzg() {
        zzgei zzgeiVar = this.zzj;
        return zzgeiVar == null ? zzgei.zzg() : zzgeiVar;
    }

    public final boolean zzh() {
        return this.zzk;
    }

    public final long zzi() {
        return this.zzl;
    }

    public final long zzj() {
        return this.zzm;
    }

    public final zzgek zzk() {
        zzgek zzgekVar = this.zzn;
        return zzgekVar == null ? zzgek.zzj() : zzgekVar;
    }

    public final long zzl() {
        return this.zzo;
    }

    public final long zzm() {
        return this.zzp;
    }

    public final long zzn() {
        return this.zzu;
    }

    public final String zzo() {
        return this.zzv;
    }

    public final String zzp() {
        return this.zzw;
    }

    public final long zzq() {
        return this.zzx;
    }

    public final long zzr() {
        return this.zzy;
    }

    public final boolean zzs() {
        return this.zzz;
    }

    public final boolean zzt() {
        return this.zzA;
    }

    public final boolean zzu() {
        return this.zzB;
    }

    public final boolean zzv() {
        return this.zzC;
    }

    public final boolean zzw() {
        return this.zzD;
    }

    public final /* synthetic */ void zzy(boolean z2) {
        this.zza |= 4;
        this.zzd = z2;
    }

    public final /* synthetic */ void zzz(boolean z2) {
        this.zza |= 8;
        this.zze = z2;
    }
}
