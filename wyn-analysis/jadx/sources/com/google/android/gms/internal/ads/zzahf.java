package com.google.android.gms.internal.ads;

import com.applovin.shadow.okio.Segment;
import java.io.IOException;
import java.util.List;

/* loaded from: classes3.dex */
public final class zzahf implements zzaga {
    private final int zza;
    private final int zzb;
    private final String zzc;
    private int zzd;
    private int zze;
    private zzagd zzf;
    private zzahm zzg;

    public zzahf(int i5, int i10, String str) {
        this.zza = i5;
        this.zzb = i10;
        this.zzc = str;
    }

    @Override // com.google.android.gms.internal.ads.zzaga
    public final boolean zza(zzagb zzagbVar) throws IOException {
        int i5 = this.zza;
        zzgtr.zzi((i5 == -1 || this.zzb == -1) ? false : true);
        int i10 = this.zzb;
        zzeu zzeuVar = new zzeu(i10);
        zzagbVar.zzi(zzeuVar.zzi(), 0, i10);
        return zzeuVar.zzt() == i5;
    }

    @Override // com.google.android.gms.internal.ads.zzaga
    public final /* synthetic */ List zzb() {
        return AbstractC1742f.a(this);
    }

    @Override // com.google.android.gms.internal.ads.zzaga
    public final void zzc(zzagd zzagdVar) {
        this.zzf = zzagdVar;
        zzahm zzahmVarZzs = zzagdVar.zzs(Segment.SHARE_MINIMUM, 4);
        this.zzg = zzahmVarZzs;
        zzt zztVar = new zzt();
        String str = this.zzc;
        zztVar.zzn(str);
        zztVar.zzo(str);
        zzahmVarZzs.zzA(zztVar.zzP());
        this.zzf.zzv();
        this.zzf.zzw(new zzahg(-9223372036854775807L));
        this.zze = 1;
    }

    @Override // com.google.android.gms.internal.ads.zzaga
    public final int zzd(zzagb zzagbVar, zzaha zzahaVar) throws IOException {
        int i5 = this.zze;
        if (i5 != 1) {
            if (i5 == 2) {
                return -1;
            }
            throw new IllegalStateException();
        }
        zzahm zzahmVar = this.zzg;
        zzahmVar.getClass();
        int iZza = zzahmVar.zza(zzagbVar, Segment.SHARE_MINIMUM, true);
        if (iZza == -1) {
            this.zze = 2;
            this.zzg.zze(0L, 1, this.zzd, 0, null);
            this.zzd = 0;
        } else {
            this.zzd += iZza;
        }
        return 0;
    }

    @Override // com.google.android.gms.internal.ads.zzaga
    public final void zze(long j8, long j10) {
        if (j8 == 0 || this.zze == 1) {
            this.zze = 1;
            this.zzd = 0;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzaga
    public final void zzf() {
    }

    @Override // com.google.android.gms.internal.ads.zzaga
    public final /* synthetic */ zzaga zzg() {
        return AbstractC1742f.b(this);
    }
}
