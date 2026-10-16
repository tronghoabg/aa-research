package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.util.List;

/* loaded from: classes3.dex */
public final class zzail implements zzaga {
    private zzagd zzf;
    private boolean zzh;
    private long zzi;
    private int zzj;
    private int zzk;
    private int zzl;
    private long zzm;
    private boolean zzn;
    private zzaij zzo;
    private zzaip zzp;
    private final zzeu zza = new zzeu(4);
    private final zzeu zzb = new zzeu(9);
    private final zzeu zzc = new zzeu(11);
    private final zzeu zzd = new zzeu();
    private final zzaim zze = new zzaim();
    private int zzg = 1;

    private final zzeu zzh(zzagb zzagbVar) throws IOException {
        zzeu zzeuVar = this.zzd;
        if (this.zzl > zzeuVar.zzj()) {
            int iZzj = zzeuVar.zzj();
            zzeuVar.zzb(new byte[Math.max(iZzj + iZzj, this.zzl)], 0);
        } else {
            zzeuVar.zzh(0);
        }
        zzeuVar.zzf(this.zzl);
        zzagbVar.zzc(zzeuVar.zzi(), 0, this.zzl);
        return zzeuVar;
    }

    private final void zzi() {
        if (this.zzn) {
            return;
        }
        this.zzf.zzw(new zzahc(-9223372036854775807L, 0L));
        this.zzn = true;
    }

    @Override // com.google.android.gms.internal.ads.zzaga
    public final boolean zza(zzagb zzagbVar) throws IOException {
        zzeu zzeuVar = this.zza;
        zzagbVar.zzi(zzeuVar.zzi(), 0, 3);
        zzeuVar.zzh(0);
        if (zzeuVar.zzx() != 4607062) {
            return false;
        }
        zzagbVar.zzi(zzeuVar.zzi(), 0, 2);
        zzeuVar.zzh(0);
        if ((zzeuVar.zzt() & 250) != 0) {
            return false;
        }
        zzagbVar.zzi(zzeuVar.zzi(), 0, 4);
        zzeuVar.zzh(0);
        int iZzB = zzeuVar.zzB();
        zzagbVar.zzl();
        zzagbVar.zzk(iZzB);
        zzagbVar.zzi(zzeuVar.zzi(), 0, 4);
        zzeuVar.zzh(0);
        return zzeuVar.zzB() == 0;
    }

    @Override // com.google.android.gms.internal.ads.zzaga
    public final /* synthetic */ List zzb() {
        return AbstractC1742f.a(this);
    }

    @Override // com.google.android.gms.internal.ads.zzaga
    public final void zzc(zzagd zzagdVar) {
        this.zzf = zzagdVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:41:0x00ac  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00b0  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x00ba A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:82:0x0006 A[SYNTHETIC] */
    @Override // com.google.android.gms.internal.ads.zzaga
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int zzd(com.google.android.gms.internal.ads.zzagb r15, com.google.android.gms.internal.ads.zzaha r16) throws java.io.IOException {
        /*
            Method dump skipped, instructions count: 345
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzail.zzd(com.google.android.gms.internal.ads.zzagb, com.google.android.gms.internal.ads.zzaha):int");
    }

    @Override // com.google.android.gms.internal.ads.zzaga
    public final void zze(long j8, long j10) {
        if (j8 == 0) {
            this.zzg = 1;
            this.zzh = false;
        } else {
            this.zzg = 3;
        }
        this.zzj = 0;
    }

    @Override // com.google.android.gms.internal.ads.zzaga
    public final void zzf() {
    }

    @Override // com.google.android.gms.internal.ads.zzaga
    public final /* synthetic */ zzaga zzg() {
        return AbstractC1742f.b(this);
    }
}
