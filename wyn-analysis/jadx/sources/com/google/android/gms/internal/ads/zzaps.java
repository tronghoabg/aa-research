package com.google.android.gms.internal.ads;

import com.applovin.shadow.okhttp3.internal.http2.Http2;
import java.io.IOException;
import java.util.List;
import org.apache.tika.fork.ForkServer;

/* loaded from: classes3.dex */
public final class zzaps implements zzaga {
    private final zzapt zza = new zzapt(null, 0, "audio/ac4");
    private final zzeu zzb = new zzeu(Http2.INITIAL_MAX_FRAME_SIZE);
    private boolean zzc;

    @Override // com.google.android.gms.internal.ads.zzaga
    public final boolean zza(zzagb zzagbVar) throws IOException {
        int i5;
        zzeu zzeuVar = new zzeu(10);
        int i10 = 0;
        while (true) {
            zzagbVar.zzi(zzeuVar.zzi(), 0, 10);
            zzeuVar.zzh(0);
            if (zzeuVar.zzx() != 4801587) {
                break;
            }
            zzeuVar.zzk(3);
            int iZzG = zzeuVar.zzG();
            i10 += iZzG + 10;
            zzagbVar.zzk(iZzG);
        }
        zzagbVar.zzl();
        zzagbVar.zzk(i10);
        int i11 = 0;
        int i12 = i10;
        while (true) {
            int i13 = 7;
            zzagbVar.zzi(zzeuVar.zzi(), 0, 7);
            zzeuVar.zzh(0);
            int iZzt = zzeuVar.zzt();
            if (iZzt == 44096 || iZzt == 44097) {
                i11++;
                if (i11 >= 4) {
                    return true;
                }
                byte[] bArrZzi = zzeuVar.zzi();
                if (bArrZzi.length < 7) {
                    i5 = -1;
                } else {
                    int i14 = ((bArrZzi[2] & ForkServer.ERROR) << 8) | (bArrZzi[3] & ForkServer.ERROR);
                    if (i14 == 65535) {
                        i14 = ((bArrZzi[4] & ForkServer.ERROR) << 16) | ((bArrZzi[5] & ForkServer.ERROR) << 8) | (bArrZzi[6] & ForkServer.ERROR);
                    } else {
                        i13 = 4;
                    }
                    if (iZzt == 44097) {
                        i13 += 2;
                    }
                    i5 = i14 + i13;
                }
                if (i5 == -1) {
                    return false;
                }
                zzagbVar.zzk(i5 - 7);
            } else {
                zzagbVar.zzl();
                i12++;
                if (i12 - i10 >= 8192) {
                    return false;
                }
                zzagbVar.zzk(i12);
                i11 = 0;
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzaga
    public final /* synthetic */ List zzb() {
        return AbstractC1742f.a(this);
    }

    @Override // com.google.android.gms.internal.ads.zzaga
    public final void zzc(zzagd zzagdVar) {
        this.zza.zzb(zzagdVar, new zzaro(Integer.MIN_VALUE, 0, 1));
        zzagdVar.zzv();
        zzagdVar.zzw(new zzahc(-9223372036854775807L, 0L));
    }

    @Override // com.google.android.gms.internal.ads.zzaga
    public final int zzd(zzagb zzagbVar, zzaha zzahaVar) throws IOException {
        zzeu zzeuVar = this.zzb;
        int iZza = zzagbVar.zza(zzeuVar.zzi(), 0, Http2.INITIAL_MAX_FRAME_SIZE);
        if (iZza == -1) {
            return -1;
        }
        zzeuVar.zzh(0);
        zzeuVar.zzf(iZza);
        if (!this.zzc) {
            this.zza.zzc(0L, 4);
            this.zzc = true;
        }
        this.zza.zzd(zzeuVar);
        return 0;
    }

    @Override // com.google.android.gms.internal.ads.zzaga
    public final void zze(long j8, long j10) {
        this.zzc = false;
        this.zza.zza();
    }

    @Override // com.google.android.gms.internal.ads.zzaga
    public final void zzf() {
    }

    @Override // com.google.android.gms.internal.ads.zzaga
    public final /* synthetic */ zzaga zzg() {
        return AbstractC1742f.b(this);
    }
}
