package com.google.android.gms.internal.p002firebaseauthapi;

import com.google.android.gms.internal.p002firebaseauthapi.zzajy;

/* loaded from: classes.dex */
public final class zzxb extends zzajy<zzxb, zza> implements zzale {
    private static final zzxb zzc;
    private static volatile zzalp<zzxb> zzd;
    private int zze;
    private int zzf;
    private zzxe zzg;

    public static final class zza extends zzajy.zza<zzxb, zza> implements zzale {
        public final zza zza(zzxe zzxeVar) {
            zzh();
            zzxb.zza((zzxb) this.zza, zzxeVar);
            return this;
        }

        private zza() {
            super(zzxb.zzc);
        }
    }

    static {
        zzxb zzxbVar = new zzxb();
        zzc = zzxbVar;
        zzajy.zza((Class<zzxb>) zzxb.class, zzxbVar);
    }

    private zzxb() {
    }

    public static zza zzb() {
        return zzc.zzm();
    }

    public final int zza() {
        return this.zzf;
    }

    public final zzxe zzd() {
        zzxe zzxeVar = this.zzg;
        return zzxeVar == null ? zzxe.zzd() : zzxeVar;
    }

    public static zzxb zza(zzaip zzaipVar, zzajk zzajkVar) throws zzakf {
        return (zzxb) zzajy.zza(zzc, zzaipVar, zzajkVar);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzajy
    public final Object zza(int i5, Object obj, Object obj2) {
        zzalp zzcVar;
        switch (zzxa.zza[i5 - 1]) {
            case 1:
                return new zzxb();
            case 2:
                return new zza();
            case 3:
                return zzajy.zza(zzc, "\u0000\u0002\u0000\u0001\u0001\u0003\u0002\u0000\u0000\u0000\u0001\u000b\u0003ဉ\u0000", new Object[]{"zze", "zzf", "zzg"});
            case 4:
                return zzc;
            case 5:
                zzalp<zzxb> zzalpVar = zzd;
                if (zzalpVar != null) {
                    return zzalpVar;
                }
                synchronized (zzxb.class) {
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

    public static /* synthetic */ void zza(zzxb zzxbVar, zzxe zzxeVar) {
        zzxeVar.getClass();
        zzxbVar.zzg = zzxeVar;
        zzxbVar.zze |= 1;
    }
}
