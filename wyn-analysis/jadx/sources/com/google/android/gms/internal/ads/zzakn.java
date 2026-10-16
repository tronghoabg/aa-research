package com.google.android.gms.internal.ads;

import com.applovin.shadow.okhttp3.internal.ws.RealWebSocket;
import java.io.IOException;
import org.apache.tika.fork.ForkServer;

/* loaded from: classes3.dex */
final class zzakn {
    private final zzeu zza = new zzeu(8);
    private int zzb;

    private final long zzb(zzagb zzagbVar) throws IOException {
        int i5;
        zzeu zzeuVar = this.zza;
        int i10 = 0;
        zzagbVar.zzi(zzeuVar.zzi(), 0, 1);
        int i11 = zzeuVar.zzi()[0] & ForkServer.ERROR;
        if (i11 == 0) {
            return Long.MIN_VALUE;
        }
        int i12 = 128;
        int i13 = 0;
        while (true) {
            i5 = i13 + 1;
            if ((i11 & i12) != 0) {
                break;
            }
            i12 >>= 1;
            i13 = i5;
        }
        int i14 = i11 & (~i12);
        zzagbVar.zzi(zzeuVar.zzi(), 1, i13);
        while (i10 < i13) {
            i10++;
            i14 = (zzeuVar.zzi()[i10] & ForkServer.ERROR) + (i14 << 8);
        }
        this.zzb += i5;
        return i14;
    }

    public final boolean zza(zzagb zzagbVar) throws IOException {
        long jZzo = zzagbVar.zzo();
        long j8 = RealWebSocket.DEFAULT_MINIMUM_DEFLATE_SIZE;
        if (jZzo != -1 && jZzo <= RealWebSocket.DEFAULT_MINIMUM_DEFLATE_SIZE) {
            j8 = jZzo;
        }
        zzeu zzeuVar = this.zza;
        zzagbVar.zzi(zzeuVar.zzi(), 0, 4);
        this.zzb = 4;
        for (long jZzz = zzeuVar.zzz(); jZzz != 440786851; jZzz = ((jZzz << 8) & (-256)) | (zzeuVar.zzi()[0] & ForkServer.ERROR)) {
            int i5 = (int) j8;
            int i10 = this.zzb + 1;
            this.zzb = i10;
            if (i10 == i5) {
                return false;
            }
            zzagbVar.zzi(zzeuVar.zzi(), 0, 1);
        }
        long jZzb = zzb(zzagbVar);
        long j10 = this.zzb;
        if (jZzb != Long.MIN_VALUE) {
            long j11 = j10 + jZzb;
            if (jZzo == -1 || j11 < jZzo) {
                while (true) {
                    long j12 = this.zzb;
                    if (j12 < j11) {
                        if (zzb(zzagbVar) == Long.MIN_VALUE) {
                            return false;
                        }
                        long jZzb2 = zzb(zzagbVar);
                        if (jZzb2 < 0) {
                            return false;
                        }
                        if (jZzb2 != 0) {
                            int i11 = (int) jZzb2;
                            zzagbVar.zzk(i11);
                            this.zzb += i11;
                        }
                    } else if (j12 == j11) {
                        return true;
                    }
                }
            }
        }
        return false;
    }
}
