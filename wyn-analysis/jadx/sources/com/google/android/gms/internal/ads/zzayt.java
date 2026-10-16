package com.google.android.gms.internal.ads;

import com.applovin.shadow.okhttp3.internal.http2.Http2;
import com.applovin.shadow.okhttp3.internal.http2.Http2Connection;
import com.applovin.shadow.okio.Segment;

/* loaded from: classes3.dex */
public final class zzayt extends zziep implements zziga {
    private static final zzayt zzbo;
    private static volatile zzigh zzbp;
    private long zzA;
    private long zzB;
    private long zzC;
    private long zzD;
    private long zzH;
    private long zzI;
    private long zzJ;
    private long zzL;
    private zzayv zzO;
    private int zza;
    private zzayo zzaF;
    private zzaym zzaG;
    private long zzaM;
    private long zzaN;
    private long zzaQ;
    private zzayd zzaR;
    private zzayf zzaS;
    private int zzaV;
    private zzayq zzag;
    private zzays zzai;
    private int zzat;
    private int zzau;
    private int zzav;
    private int zzaw;
    private zzazk zzax;
    private int zzb;
    private int zzba;
    private zzayb zzbb;
    private boolean zzbc;
    private long zzbd;
    private boolean zzbg;
    private long zzbi;
    private zzazi zzbj;
    private int zzc;
    private int zzd;
    private long zzg;
    private long zzh;
    private long zzi;
    private long zzj;
    private long zzk;
    private long zzl;
    private long zzm;
    private long zzn;
    private long zzo;
    private long zzp;
    private long zzv;
    private long zzw;
    private long zzx;
    private long zzy;
    private long zzz;
    private String zze = "";
    private String zzf = "";
    private String zzu = "";
    private String zzE = "";
    private String zzF = "D";
    private String zzG = "";
    private String zzK = "";
    private long zzM = -1;
    private long zzN = -1;
    private long zzP = -1;
    private long zzQ = -1;
    private long zzR = -1;
    private long zzS = -1;
    private long zzT = -1;
    private long zzU = -1;
    private String zzV = "D";
    private String zzW = "D";
    private long zzX = -1;
    private int zzY = 1000;
    private int zzZ = 1000;
    private long zzaa = -1;
    private long zzab = -1;
    private long zzac = -1;
    private long zzad = -1;
    private long zzae = -1;
    private int zzaf = 1000;
    private zzifb zzah = zziep.zzbM();
    private long zzaj = -1;
    private long zzak = -1;
    private long zzal = -1;
    private long zzam = -1;
    private long zzan = -1;
    private long zzao = -1;
    private long zzap = -1;
    private long zzaq = -1;
    private String zzar = "D";
    private long zzas = -1;
    private long zzay = -1;
    private int zzaz = 1000;
    private int zzaA = 1000;
    private String zzaB = "D";
    private zzifb zzaC = zziep.zzbM();
    private int zzaD = 1000;
    private zzifb zzaE = zziep.zzbM();
    private String zzaH = "";
    private long zzaI = -1;
    private long zzaJ = -1;
    private long zzaK = -1;
    private long zzaL = -1;
    private long zzaO = -1;
    private String zzaP = "";
    private long zzaT = -1;
    private long zzaU = -1;
    private String zzaW = "";
    private String zzaX = "";
    private long zzaY = -1;
    private long zzaZ = -1;
    private String zzbe = "";
    private int zzbf = 2;
    private String zzbh = "";
    private long zzbk = -1;
    private String zzbl = "";
    private zziex zzbm = zziep.zzbC();
    private long zzbn = -1;

    static {
        zzayt zzaytVar = new zzayt();
        zzbo = zzaytVar;
        zziep.zzbu(zzayt.class, zzaytVar);
    }

    private zzayt() {
    }

    public static zzayt zzi(byte[] bArr, zzidz zzidzVar) throws zzifh {
        return (zzayt) zziep.zzbV(zzbo, bArr, zzidzVar);
    }

    public static zzaxt zzj() {
        return (zzaxt) zzbo.zzbn();
    }

    public static zzayt zzk() {
        return zzbo;
    }

    public final /* synthetic */ void zzA(String str) {
        str.getClass();
        this.zza |= Http2Connection.OKHTTP_CLIENT_WINDOW_SIZE;
        this.zzG = str;
    }

    public final /* synthetic */ void zzB(long j8) {
        this.zza |= 33554432;
        this.zzH = j8;
    }

    public final /* synthetic */ void zzC(long j8) {
        this.zza |= 67108864;
        this.zzI = j8;
    }

    public final /* synthetic */ void zzD(long j8) {
        this.zza |= 134217728;
        this.zzJ = j8;
    }

    public final /* synthetic */ void zzE(String str) {
        str.getClass();
        this.zza |= 268435456;
        this.zzK = str;
    }

    public final /* synthetic */ void zzF(long j8) {
        this.zza |= 536870912;
        this.zzL = j8;
    }

    public final /* synthetic */ void zzG(long j8) {
        this.zza |= 1073741824;
        this.zzM = j8;
    }

    public final /* synthetic */ void zzH(long j8) {
        this.zza |= Integer.MIN_VALUE;
        this.zzN = j8;
    }

    public final /* synthetic */ void zzI(long j8) {
        this.zzb |= 2;
        this.zzP = j8;
    }

    public final /* synthetic */ void zzJ(long j8) {
        this.zzb |= 4;
        this.zzQ = j8;
    }

    public final /* synthetic */ void zzK(long j8) {
        this.zzb |= 8;
        this.zzR = j8;
    }

    public final /* synthetic */ void zzL(long j8) {
        this.zzb |= 16;
        this.zzS = j8;
    }

    public final /* synthetic */ void zzM(long j8) {
        this.zzb |= 32;
        this.zzT = j8;
    }

    public final /* synthetic */ void zzN(long j8) {
        this.zzb |= 64;
        this.zzU = j8;
    }

    public final /* synthetic */ void zzO(String str) {
        str.getClass();
        this.zzb |= 128;
        this.zzV = str;
    }

    public final /* synthetic */ void zzP(String str) {
        str.getClass();
        this.zzb |= 256;
        this.zzW = str;
    }

    public final /* synthetic */ void zzQ(long j8) {
        this.zzb |= 4096;
        this.zzaa = j8;
    }

    public final /* synthetic */ void zzR(long j8) {
        this.zzb |= Segment.SIZE;
        this.zzab = j8;
    }

    public final /* synthetic */ void zzS(long j8) {
        this.zzb |= Http2.INITIAL_MAX_FRAME_SIZE;
        this.zzac = j8;
    }

    public final /* synthetic */ void zzT(zzayq zzayqVar) {
        zzayqVar.getClass();
        this.zzag = zzayqVar;
        this.zzb |= 262144;
    }

    public final /* synthetic */ void zzU(zzayq zzayqVar) {
        zzayqVar.getClass();
        zzifb zzifbVar = this.zzah;
        if (!zzifbVar.zza()) {
            this.zzah = zziep.zzbN(zzifbVar);
        }
        this.zzah.add(zzayqVar);
    }

    public final /* synthetic */ void zzV() {
        this.zzah = zziep.zzbM();
    }

    public final /* synthetic */ void zzW(zzays zzaysVar) {
        zzaysVar.getClass();
        this.zzai = zzaysVar;
        this.zzb |= 524288;
    }

    public final /* synthetic */ void zzX(long j8) {
        this.zzb |= 1048576;
        this.zzaj = j8;
    }

    public final /* synthetic */ void zzY(long j8) {
        this.zzb |= 2097152;
        this.zzak = j8;
    }

    public final /* synthetic */ void zzZ(long j8) {
        this.zzb |= 4194304;
        this.zzal = j8;
    }

    public final boolean zza() {
        return (this.zza & 4194304) != 0;
    }

    public final /* synthetic */ void zzaa(long j8) {
        this.zzb |= 8388608;
        this.zzam = j8;
    }

    public final /* synthetic */ void zzab(long j8) {
        this.zzb |= Http2Connection.OKHTTP_CLIENT_WINDOW_SIZE;
        this.zzan = j8;
    }

    public final /* synthetic */ void zzac(long j8) {
        this.zzb |= 67108864;
        this.zzap = j8;
    }

    public final /* synthetic */ void zzad(long j8) {
        this.zzb |= 134217728;
        this.zzaq = j8;
    }

    public final /* synthetic */ void zzae(String str) {
        str.getClass();
        this.zzb |= 268435456;
        this.zzar = str;
    }

    public final /* synthetic */ void zzaf(String str) {
        str.getClass();
        this.zzc |= Segment.SHARE_MINIMUM;
        this.zzaH = str;
    }

    public final /* synthetic */ void zzag(long j8) {
        this.zzc |= 2048;
        this.zzaI = j8;
    }

    public final /* synthetic */ void zzah(long j8) {
        this.zzc |= 4096;
        this.zzaJ = j8;
    }

    public final /* synthetic */ void zzai(long j8) {
        this.zzc |= Segment.SIZE;
        this.zzaK = j8;
    }

    public final /* synthetic */ void zzaj(long j8) {
        this.zzc |= Http2.INITIAL_MAX_FRAME_SIZE;
        this.zzaL = j8;
    }

    public final /* synthetic */ void zzak(String str) {
        str.getClass();
        this.zzc |= 262144;
        this.zzaP = str;
    }

    public final /* synthetic */ void zzal(long j8) {
        this.zzc |= 8388608;
        this.zzaU = j8;
    }

    public final /* synthetic */ void zzam(long j8) {
        this.zzd |= 32;
        this.zzbi = j8;
    }

    public final /* synthetic */ void zzan(zzazi zzaziVar) {
        zzaziVar.getClass();
        this.zzbj = zzaziVar;
        this.zzd |= 64;
    }

    public final /* synthetic */ void zzap(int i5) {
        this.zzY = i5 - 1;
        this.zzb |= Segment.SHARE_MINIMUM;
    }

    public final /* synthetic */ void zzaq(int i5) {
        this.zzZ = i5 - 1;
        this.zzb |= 2048;
    }

    public final /* synthetic */ void zzar(int i5) {
        this.zzaf = i5 - 1;
        this.zzb |= 131072;
    }

    public final /* synthetic */ void zzas(int i5) {
        this.zzaz = i5 - 1;
        this.zzc |= 16;
    }

    public final /* synthetic */ void zzat(int i5) {
        this.zzaA = i5 - 1;
        this.zzc |= 32;
    }

    public final /* synthetic */ void zzau(int i5) {
        this.zzaV = i5 - 1;
        this.zzc |= Http2Connection.OKHTTP_CLIENT_WINDOW_SIZE;
    }

    public final String zzb() {
        return this.zzE;
    }

    public final boolean zzc() {
        return (this.zzb & 1048576) != 0;
    }

    public final long zzd() {
        return this.zzaj;
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
            return zziep.zzbv(zzbo, "\u0001n\u0000\u0004\u0001Įn\u0000\u0004\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003ဂ\u0002\u0004ဂ\u0003\u0005ဂ\u0004\u0006ဂ\u0005\u0007ဂ\u0006\bဂ\u0007\tဂ\b\nဂ\t\u000bဂ\n\fဂ\u000b\rဈ\f\u000eဂ\r\u000fဂ\u000e\u0010ဂ\u000f\u0011ဂ\u0010\u0012ဂ\u0011\u0013ဂ\u0012\u0014ဂ\u0013\u0015ဂ`\u0016ဂ\u0014\u0017ဂ\u0015\u0018ဈa\u0019ဂe\u001a᠌b\u001bဈ\u0016\u001cဇc\u001dဈ\u0018\u001eဈd\u001fဂ\u0019 ဂ\u001a!ဂ\u001b\"ဈ\u001c#ဂ\u001d$ဂ\u001e%ဂ\u001f&ဉ 'ဂ!(ဂ\")ဂ#*ဂ$+\u001b,ဂ%-ဂ&.ဈ'/ဈ(0᠌*1᠌+2ဉ23ဂ,4ဂ-5ဂ.6ဂ/7ဂ08᠌19ဉ3:ဂ4;ဂ5<ဂ6=ဂ7>ဂ:?ဂ;@ဂ=A᠌>B᠌?Cဈ<D᠌AEဉBFဂCGဂ8Hဂ9I᠌DJဂ)Kဈ\u0017L᠌EMဈFN\u001bO᠌GP\u001bQဉHRဈJSဂKTဂLUဂMVဂNWဂOXဂQYဈRZဉT[ဉU\\ဂV]ဂW^᠌X_᠌@`ဉIaဂPbဈYcဈZdဂ[eဂ\\f᠌]gဂShဉ^iဇ_j'kဂiÉဉfĭဂgĮဈh", new Object[]{"zza", "zzb", "zzc", "zzd", "zze", "zzf", "zzg", "zzh", "zzi", "zzj", "zzk", "zzl", "zzm", "zzn", "zzo", "zzp", "zzu", "zzv", "zzw", "zzx", "zzy", "zzz", "zzA", "zzB", "zzbd", "zzC", "zzD", "zzbe", "zzbi", "zzbf", zzaxx.zza, "zzE", "zzbg", "zzG", "zzbh", "zzH", "zzI", "zzJ", "zzK", "zzL", "zzM", "zzN", "zzO", "zzP", "zzQ", "zzR", "zzS", "zzah", zzayq.class, "zzT", "zzU", "zzV", "zzW", "zzY", zzievVar, "zzZ", zzievVar, "zzag", "zzaa", "zzab", "zzac", "zzad", "zzae", "zzaf", zzievVar, "zzai", "zzaj", "zzak", "zzal", "zzam", "zzap", "zzaq", "zzas", "zzat", zzazc.zza, "zzau", zzazg.zza, "zzar", "zzaw", zzaxu.zza, "zzax", "zzay", "zzan", "zzao", "zzaz", zzievVar, "zzX", "zzF", "zzaA", zzievVar, "zzaB", "zzaC", zzayk.class, "zzaD", zzievVar, "zzaE", zzaxw.class, "zzaF", "zzaH", "zzaI", "zzaJ", "zzaK", "zzaL", "zzaM", "zzaO", "zzaP", "zzaR", "zzaS", "zzaT", "zzaU", "zzaV", zzayg.zza, "zzav", zzaxy.zza, "zzaG", "zzaN", "zzaW", "zzaX", "zzaY", "zzaZ", "zzba", zzayi.zza, "zzaQ", "zzbb", "zzbc", "zzbm", "zzbn", "zzbj", "zzbk", "zzbl"});
        }
        if (iOrdinal == 3) {
            return new zzayt();
        }
        byte[] bArr = null;
        if (iOrdinal == 4) {
            return new zzaxt(bArr);
        }
        if (iOrdinal == 5) {
            return zzbo;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        zzigh zzighVar = zzbp;
        if (zzighVar != null) {
            return zzighVar;
        }
        synchronized (zzayt.class) {
            try {
                zziekVar = zzbp;
                if (zziekVar == null) {
                    zziekVar = new zziek(zzbo);
                    zzbp = zziekVar;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return zziekVar;
    }

    public final long zze() {
        return this.zzan;
    }

    public final boolean zzg() {
        return (this.zzd & 64) != 0;
    }

    public final zzazi zzh() {
        zzazi zzaziVar = this.zzbj;
        return zzaziVar == null ? zzazi.zze() : zzaziVar;
    }

    public final /* synthetic */ void zzl(String str) {
        str.getClass();
        this.zza |= 1;
        this.zze = str;
    }

    public final /* synthetic */ void zzm(String str) {
        str.getClass();
        this.zza |= 2;
        this.zzf = str;
    }

    public final /* synthetic */ void zzn(long j8) {
        this.zza |= 4;
        this.zzg = j8;
    }

    public final /* synthetic */ void zzo(long j8) {
        this.zza |= 16;
        this.zzi = j8;
    }

    public final /* synthetic */ void zzp(long j8) {
        this.zza |= 32;
        this.zzj = j8;
    }

    public final /* synthetic */ void zzq(long j8) {
        this.zza |= Segment.SHARE_MINIMUM;
        this.zzo = j8;
    }

    public final /* synthetic */ void zzr(long j8) {
        this.zza |= 2048;
        this.zzp = j8;
    }

    public final /* synthetic */ void zzs(long j8) {
        this.zza |= Segment.SIZE;
        this.zzv = j8;
    }

    public final /* synthetic */ void zzt(long j8) {
        this.zza |= Http2.INITIAL_MAX_FRAME_SIZE;
        this.zzw = j8;
    }

    public final /* synthetic */ void zzu(long j8) {
        this.zza |= 32768;
        this.zzx = j8;
    }

    public final /* synthetic */ void zzv(long j8) {
        this.zza |= 65536;
        this.zzy = j8;
    }

    public final /* synthetic */ void zzw(long j8) {
        this.zza |= 524288;
        this.zzB = j8;
    }

    public final /* synthetic */ void zzx(long j8) {
        this.zza |= 1048576;
        this.zzC = j8;
    }

    public final /* synthetic */ void zzy(long j8) {
        this.zza |= 2097152;
        this.zzD = j8;
    }

    public final /* synthetic */ void zzz(String str) {
        str.getClass();
        this.zza |= 4194304;
        this.zzE = str;
    }
}
