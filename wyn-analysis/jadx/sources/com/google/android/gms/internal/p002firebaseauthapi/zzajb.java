package com.google.android.gms.internal.p002firebaseauthapi;

import com.google.android.gms.common.api.f;
import java.io.IOException;

/* loaded from: classes.dex */
public abstract class zzajb {
    private static volatile int zze = 100;
    int zza;
    int zzb;
    int zzc;
    zzajf zzd;

    public static long zza(long j8) {
        return (-(j8 & 1)) ^ (j8 >>> 1);
    }

    public static int zze(int i5) {
        return (-(i5 & 1)) ^ (i5 >>> 1);
    }

    public abstract double zza() throws IOException;

    public abstract int zza(int i5) throws zzakf;

    public abstract float zzb() throws IOException;

    public abstract void zzb(int i5) throws zzakf;

    public abstract int zzc();

    public abstract void zzc(int i5);

    public abstract int zzd() throws IOException;

    public abstract boolean zzd(int i5) throws IOException;

    public abstract int zze() throws IOException;

    public abstract int zzf() throws IOException;

    public abstract int zzg() throws IOException;

    public abstract int zzh() throws IOException;

    public abstract int zzi() throws IOException;

    public abstract int zzj() throws IOException;

    public abstract long zzk() throws IOException;

    public abstract long zzl() throws IOException;

    public abstract long zzm() throws IOException;

    public abstract long zzn() throws IOException;

    public abstract long zzo() throws IOException;

    public abstract long zzp() throws IOException;

    public abstract zzaip zzq() throws IOException;

    public abstract String zzr() throws IOException;

    public abstract String zzs() throws IOException;

    public abstract boolean zzt() throws IOException;

    public abstract boolean zzu() throws IOException;

    public final void zzv() throws IOException {
        int iZzi;
        do {
            iZzi = zzi();
            if (iZzi == 0) {
                return;
            }
            int i5 = this.zza;
            if (i5 >= this.zzb) {
                throw zzakf.zzh();
            }
            this.zza = i5 + 1;
            this.zza--;
        } while (zzd(iZzi));
    }

    private zzajb() {
        this.zzb = zze;
        this.zzc = f.API_PRIORITY_OTHER;
    }

    public static zzajb zza(byte[] bArr, int i5, int i10, boolean z2) {
        zzaja zzajaVar = new zzaja(bArr, i5, i10, z2);
        try {
            zzajaVar.zza(i10);
            return zzajaVar;
        } catch (zzakf e7) {
            throw new IllegalArgumentException(e7);
        }
    }
}
