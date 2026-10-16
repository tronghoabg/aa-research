package com.google.android.gms.internal.fido;

import A7.AbstractC0279p0;
import Va.M6;
import java.io.IOException;
import java.util.ArrayDeque;
import java.util.Deque;

/* loaded from: classes.dex */
final class zzdv {
    private final Deque zza = new ArrayDeque(16);

    private zzdv(boolean z2) {
    }

    public static zzdv zza() {
        return new zzdv(false);
    }

    private final long zzh() {
        if (this.zza.isEmpty()) {
            return 0L;
        }
        return ((Long) this.zza.peek()).longValue();
    }

    private final void zzi(long j8) {
        this.zza.pop();
        this.zza.push(Long.valueOf(j8));
    }

    public final void zzb() throws IOException {
        if (this.zza.isEmpty()) {
            return;
        }
        throw new IOException("data item not completed, stackSize: " + this.zza.size() + " scope: " + zzh());
    }

    public final void zzc() throws IOException {
        long jZzh = zzh();
        if (jZzh >= 0) {
            throw new IOException(AbstractC0279p0.k(jZzh, "expected indefinite length scope but found "));
        }
        if (jZzh == -5) {
            throw new IOException("expected a value for dangling key in indefinite-length map");
        }
        this.zza.pop();
    }

    public final void zzd() throws IOException {
        long jZzh = zzh();
        if (jZzh != -1) {
            if (jZzh != -2) {
                return;
            } else {
                jZzh = -2;
            }
        }
        throw new IOException(AbstractC0279p0.k(jZzh, "expected non-string scope but found "));
    }

    public final void zze(long j8) throws IOException {
        long jZzh = zzh();
        if (jZzh != j8) {
            if (jZzh != -1) {
                if (jZzh != -2) {
                    return;
                } else {
                    jZzh = -2;
                }
            }
            StringBuilder sbU = M6.u(j8, "expected non-string scope or scope ", " but found ");
            sbU.append(jZzh);
            throw new IOException(sbU.toString());
        }
    }

    public final void zzf() {
        long jZzh = zzh();
        if (jZzh == 1) {
            this.zza.pop();
            return;
        }
        if (jZzh > 1) {
            zzi(jZzh - 1);
        } else if (jZzh == -4) {
            zzi(-5L);
        } else if (jZzh == -5) {
            zzi(-4L);
        }
    }

    public final void zzg(long j8) {
        this.zza.push(Long.valueOf(j8));
    }
}
