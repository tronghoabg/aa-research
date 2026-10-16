package com.google.android.gms.internal.ads;

/* loaded from: classes3.dex */
public final class zzijj extends zziep implements zziga {
    private static final zzijj zzh;
    private static volatile zzigh zzi;
    private int zza;
    private zziji zzb;
    private zzidl zzd;
    private zzidl zze;
    private int zzf;
    private byte zzg = 2;
    private zzifb zzc = zziep.zzbM();

    static {
        zzijj zzijjVar = new zzijj();
        zzh = zzijjVar;
        zziep.zzbu(zzijj.class, zzijjVar);
    }

    private zzijj() {
        zzidl zzidlVar = zzidl.zza;
        this.zzd = zzidlVar;
        this.zze = zzidlVar;
    }

    public static zzijg zzc() {
        return (zzijg) zzh.zzbn();
    }

    public final /* synthetic */ void zzd(zzijf zzijfVar) {
        zzijfVar.getClass();
        zzifb zzifbVar = this.zzc;
        if (!zzifbVar.zza()) {
            this.zzc = zziep.zzbN(zzifbVar);
        }
        this.zzc.add(zzijfVar);
    }

    @Override // com.google.android.gms.internal.ads.zziep
    public final Object zzdc(zzieo zzieoVar, Object obj, Object obj2) {
        zzigh zziekVar;
        byte[] bArr = null;
        switch (zzieoVar) {
            case GET_MEMOIZED_IS_INITIALIZED:
                return Byte.valueOf(this.zzg);
            case SET_MEMOIZED_IS_INITIALIZED:
                this.zzg = obj == null ? (byte) 0 : (byte) 1;
                return null;
            case BUILD_MESSAGE_INFO:
                return zziep.zzbv(zzh, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0001\u0001\u0001ဉ\u0000\u0002Л\u0003ည\u0001\u0004ည\u0002\u0005င\u0003", new Object[]{"zza", "zzb", "zzc", zzijf.class, "zzd", "zze", "zzf"});
            case NEW_MUTABLE_INSTANCE:
                return new zzijj();
            case NEW_BUILDER:
                return new zzijg(bArr);
            case GET_DEFAULT_INSTANCE:
                return zzh;
            case GET_PARSER:
                zzigh zzighVar = zzi;
                if (zzighVar != null) {
                    return zzighVar;
                }
                synchronized (zzijj.class) {
                    try {
                        zziekVar = zzi;
                        if (zziekVar == null) {
                            zziekVar = new zziek(zzh);
                            zzi = zziekVar;
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
}
