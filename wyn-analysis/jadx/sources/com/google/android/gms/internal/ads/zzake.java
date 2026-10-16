package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.util.ArrayDeque;
import org.apache.tika.fork.ForkServer;

/* loaded from: classes3.dex */
final class zzake {
    private final byte[] zza = new byte[8];
    private final ArrayDeque zzb = new ArrayDeque();
    private final zzako zzc = new zzako();
    private zzakf zzd;
    private int zze;
    private int zzf;
    private long zzg;

    private final long zzd(zzagb zzagbVar, int i5) throws IOException {
        zzagbVar.zzc(this.zza, 0, i5);
        long j8 = 0;
        for (int i10 = 0; i10 < i5; i10++) {
            j8 = (j8 << 8) | (r0[i10] & ForkServer.ERROR);
        }
        return j8;
    }

    public final void zza(zzakf zzakfVar) {
        this.zzd = zzakfVar;
    }

    public final void zzb() {
        this.zze = 0;
        this.zzb.clear();
        this.zzc.zza();
    }

    /* JADX WARN: Removed duplicated region for block: B:38:0x00ad A[LOOP:0: B:3:0x0005->B:38:0x00ad, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:79:0x00b7 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:80:0x00fc A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:81:0x0105 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:82:0x014e A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:83:0x017f A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean zzc(com.google.android.gms.internal.ads.zzagb r14) throws java.io.IOException {
        /*
            Method dump skipped, instructions count: 850
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzake.zzc(com.google.android.gms.internal.ads.zzagb):boolean");
    }
}
