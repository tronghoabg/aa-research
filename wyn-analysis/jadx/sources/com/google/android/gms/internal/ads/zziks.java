package com.google.android.gms.internal.ads;

import com.applovin.shadow.okio.Segment;
import java.util.List;

/* loaded from: classes3.dex */
public final class zziks extends zziep implements zziga {
    private static final zziks zzQ;
    private static volatile zzigh zzR;
    private zziko zzA;
    private zziiz zzC;
    private zziir zzE;
    private int zzG;
    private long zzJ;
    private zzikr zzK;
    private zzijs zzL;
    private zzikl zzN;
    private int zza;
    private int zzb;
    private int zzc;
    private zziiv zzg;
    private zzijy zzk;
    private boolean zzl;
    private boolean zzo;
    private boolean zzp;
    private zzikf zzv;
    private boolean zzw;
    private byte zzP = 2;
    private String zzd = "";
    private String zze = "";
    private String zzf = "";
    private zzifb zzh = zziep.zzbM();
    private zzifb zzi = zziep.zzbM();
    private String zzj = "";
    private zzifb zzm = zziep.zzbM();
    private String zzn = "";
    private zzidl zzu = zzidl.zza;
    private String zzx = "";
    private zzifb zzy = zziep.zzbM();
    private zzifb zzz = zziep.zzbM();
    private zzifb zzB = zziep.zzbM();
    private String zzD = "";
    private zzifb zzF = zziep.zzbM();
    private zzifb zzH = zziep.zzbM();
    private zzifb zzI = zziep.zzbM();
    private String zzM = "";
    private zzifb zzO = zziep.zzbM();

    static {
        zziks zziksVar = new zziks();
        zzQ = zziksVar;
        zziep.zzbu(zziks.class, zziksVar);
    }

    private zziks() {
    }

    public static zziit zzg() {
        return (zziit) zzQ.zzbn();
    }

    public final String zzc() {
        return this.zzd;
    }

    public final List zzd() {
        return this.zzh;
    }

    @Override // com.google.android.gms.internal.ads.zziep
    public final Object zzdc(zzieo zzieoVar, Object obj, Object obj2) {
        zzigh zziekVar;
        byte[] bArr = null;
        switch (zzieoVar) {
            case GET_MEMOIZED_IS_INITIALIZED:
                return Byte.valueOf(this.zzP);
            case SET_MEMOIZED_IS_INITIALIZED:
                this.zzP = obj == null ? (byte) 0 : (byte) 1;
                return null;
            case BUILD_MESSAGE_INFO:
                return zziep.zzbv(zzQ, "\u0001$\u0000\u0001\u0001%$\u0000\n\u0001\u0001ဈ\u0002\u0002ဈ\u0003\u0003ဈ\u0004\u0004Л\u0005ဇ\b\u0006\u001a\u0007ဈ\t\bဇ\n\tဇ\u000b\n᠌\u0000\u000b᠌\u0001\fဉ\u0005\rဈ\u0006\u000eဉ\u0007\u000fည\f\u0010\u001b\u0011ဉ\r\u0012ဇ\u000e\u0013ဈ\u000f\u0014\u001a\u0015\u001a\u0016ဉ\u0010\u0017\u001b\u0018ဉ\u0011\u0019ဈ\u0012\u001aဉ\u0013\u001b\u001b\u001d᠌\u0014\u001e\u001b\u001f\u001b ဂ\u0015!ဉ\u0016\"ဉ\u0017#ဈ\u0018$ဉ\u0019%\u001b", new Object[]{"zza", "zzd", "zze", "zzf", "zzh", zzikd.class, "zzl", "zzm", "zzn", "zzo", "zzp", "zzb", zzijz.zza, "zzc", zziis.zza, "zzg", "zzj", "zzk", "zzu", "zzi", zzikw.class, "zzv", "zzw", "zzx", "zzy", "zzz", "zzA", "zzB", zzilc.class, "zzC", "zzD", "zzE", "zzF", zzijd.class, "zzG", zzikm.zza, "zzH", zzijq.class, "zzI", zzijv.class, "zzJ", "zzK", "zzL", "zzM", "zzN", "zzO", zziki.class});
            case NEW_MUTABLE_INSTANCE:
                return new zziks();
            case NEW_BUILDER:
                return new zziit(bArr);
            case GET_DEFAULT_INSTANCE:
                return zzQ;
            case GET_PARSER:
                zzigh zzighVar = zzR;
                if (zzighVar != null) {
                    return zzighVar;
                }
                synchronized (zziks.class) {
                    try {
                        zziekVar = zzR;
                        if (zziekVar == null) {
                            zziekVar = new zziek(zzQ);
                            zzR = zziekVar;
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                return zziekVar;
            default:
                throw null;
        }
    }

    public final String zze() {
        return this.zzj;
    }

    public final /* synthetic */ void zzh(String str) {
        this.zza |= 4;
        this.zzd = str;
    }

    public final /* synthetic */ void zzi(String str) {
        this.zza |= 8;
        this.zze = str;
    }

    public final /* synthetic */ void zzj(zziiv zziivVar) {
        zziivVar.getClass();
        this.zzg = zziivVar;
        this.zza |= 32;
    }

    public final /* synthetic */ void zzk(zzikd zzikdVar) {
        zzikdVar.getClass();
        zzifb zzifbVar = this.zzh;
        if (!zzifbVar.zza()) {
            this.zzh = zziep.zzbN(zzifbVar);
        }
        this.zzh.add(zzikdVar);
    }

    public final /* synthetic */ void zzl(String str) {
        this.zza |= 64;
        this.zzj = str;
    }

    public final /* synthetic */ void zzm() {
        this.zza &= -65;
        this.zzj = zzQ.zzj;
    }

    public final /* synthetic */ void zzn(zzijy zzijyVar) {
        zzijyVar.getClass();
        this.zzk = zzijyVar;
        this.zza |= 128;
    }

    public final /* synthetic */ void zzo(zzikf zzikfVar) {
        zzikfVar.getClass();
        this.zzv = zzikfVar;
        this.zza |= Segment.SIZE;
    }

    public final /* synthetic */ void zzp(Iterable iterable) {
        zzifb zzifbVar = this.zzy;
        if (!zzifbVar.zza()) {
            this.zzy = zziep.zzbN(zzifbVar);
        }
        zzicu.zzaW(iterable, this.zzy);
    }

    public final /* synthetic */ void zzq(Iterable iterable) {
        zzifb zzifbVar = this.zzz;
        if (!zzifbVar.zza()) {
            this.zzz = zziep.zzbN(zzifbVar);
        }
        zzicu.zzaW(iterable, this.zzz);
    }

    public final /* synthetic */ void zzs(int i5) {
        this.zzb = i5 - 1;
        this.zza |= 1;
    }
}
