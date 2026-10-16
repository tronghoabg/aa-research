package com.google.android.gms.internal.ads;

/* loaded from: classes3.dex */
public final class zzikd extends zziep implements zziga {
    private static final zzikd zzl;
    private static volatile zzigh zzm;
    private int zza;
    private int zzb;
    private zzijj zzd;
    private zzijn zze;
    private int zzf;
    private int zzi;
    private byte zzk = 2;
    private String zzc = "";
    private zziex zzg = zziep.zzbC();
    private String zzh = "";
    private zzifb zzj = zziep.zzbM();

    static {
        zzikd zzikdVar = new zzikd();
        zzl = zzikdVar;
        zziep.zzbu(zzikd.class, zzikdVar);
    }

    private zzikd() {
    }

    public static zzikc zze() {
        return (zzikc) zzl.zzbn();
    }

    public final String zzc() {
        return this.zzc;
    }

    public final int zzd() {
        return this.zzj.size();
    }

    @Override // com.google.android.gms.internal.ads.zziep
    public final Object zzdc(zzieo zzieoVar, Object obj, Object obj2) {
        zzigh zziekVar;
        byte[] bArr = null;
        switch (zzieoVar) {
            case GET_MEMOIZED_IS_INITIALIZED:
                return Byte.valueOf(this.zzk);
            case SET_MEMOIZED_IS_INITIALIZED:
                this.zzk = obj == null ? (byte) 0 : (byte) 1;
                return null;
            case BUILD_MESSAGE_INFO:
                return zziep.zzbv(zzl, "\u0001\t\u0000\u0001\u0001\t\t\u0000\u0002\u0003\u0001ᔄ\u0000\u0002ဈ\u0001\u0003ᐉ\u0002\u0004ᐉ\u0003\u0005င\u0004\u0006\u0016\u0007ဈ\u0005\b᠌\u0006\t\u001a", new Object[]{"zza", "zzb", "zzc", "zzd", "zze", "zzf", "zzg", "zzh", "zzi", zzika.zza, "zzj"});
            case NEW_MUTABLE_INSTANCE:
                return new zzikd();
            case NEW_BUILDER:
                return new zzikc(bArr);
            case GET_DEFAULT_INSTANCE:
                return zzl;
            case GET_PARSER:
                zzigh zzighVar = zzm;
                if (zzighVar != null) {
                    return zzighVar;
                }
                synchronized (zzikd.class) {
                    try {
                        zziekVar = zzm;
                        if (zziekVar == null) {
                            zziekVar = new zziek(zzl);
                            zzm = zziekVar;
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

    public final /* synthetic */ void zzg(int i5) {
        this.zza |= 1;
        this.zzb = i5;
    }

    public final /* synthetic */ void zzh(String str) {
        str.getClass();
        this.zza |= 2;
        this.zzc = str;
    }

    public final /* synthetic */ void zzi(zzijj zzijjVar) {
        zzijjVar.getClass();
        this.zzd = zzijjVar;
        this.zza |= 4;
    }

    public final /* synthetic */ void zzj(String str) {
        str.getClass();
        zzifb zzifbVar = this.zzj;
        if (!zzifbVar.zza()) {
            this.zzj = zziep.zzbN(zzifbVar);
        }
        this.zzj.add(str);
    }

    public final /* synthetic */ void zzl(int i5) {
        this.zzi = i5 - 1;
        this.zza |= 64;
    }
}
