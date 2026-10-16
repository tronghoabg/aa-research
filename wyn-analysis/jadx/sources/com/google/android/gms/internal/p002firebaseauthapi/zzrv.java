package com.google.android.gms.internal.p002firebaseauthapi;

import com.google.android.gms.internal.p002firebaseauthapi.zzajy;

/* loaded from: classes.dex */
public final class zzrv extends zzajy<zzrv, zza> implements zzale {
    private static final zzrv zzc;
    private static volatile zzalp<zzrv> zzd;
    private int zze;

    public static final class zza extends zzajy.zza<zzrv, zza> implements zzale {
        public final zza zza(int i5) {
            zzh();
            ((zzrv) this.zza).zze = i5;
            return this;
        }

        private zza() {
            super(zzrv.zzc);
        }
    }

    static {
        zzrv zzrvVar = new zzrv();
        zzc = zzrvVar;
        zzajy.zza((Class<zzrv>) zzrv.class, zzrvVar);
    }

    private zzrv() {
    }

    public static zza zzb() {
        return zzc.zzm();
    }

    public static zzrv zzd() {
        return zzc;
    }

    public final int zza() {
        return this.zze;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzajy
    public final Object zza(int i5, Object obj, Object obj2) {
        zzalp zzcVar;
        switch (zzrx.zza[i5 - 1]) {
            case 1:
                return new zzrv();
            case 2:
                return new zza();
            case 3:
                return zzajy.zza(zzc, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u000b", new Object[]{"zze"});
            case 4:
                return zzc;
            case 5:
                zzalp<zzrv> zzalpVar = zzd;
                if (zzalpVar != null) {
                    return zzalpVar;
                }
                synchronized (zzrv.class) {
                    try {
                        zzcVar = zzd;
                        if (zzcVar == null) {
                            zzcVar = new zzajy.zzc(zzc);
                            zzd = zzcVar;
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                return zzcVar;
            case 6:
                return (byte) 1;
            case 7:
                return null;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
