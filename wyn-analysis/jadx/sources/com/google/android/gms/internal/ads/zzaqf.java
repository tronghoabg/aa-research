package com.google.android.gms.internal.ads;

import java.util.Arrays;
import java.util.Collections;
import org.apache.tika.fork.ForkServer;

/* loaded from: classes3.dex */
public final class zzaqf implements zzaqa {
    private static final float[] zza = {1.0f, 1.0f, 1.0909091f, 0.90909094f, 1.4545455f, 1.2121212f, 1.0f};
    private final zzars zzb;
    private zzaqe zzg;
    private long zzh;
    private String zzi;
    private zzahm zzj;
    private boolean zzk;
    private final boolean[] zzd = new boolean[4];
    private final zzaqd zze = new zzaqd(128);
    private long zzl = -9223372036854775807L;
    private final zzaqr zzf = new zzaqr(178, 128);
    private final zzeu zzc = new zzeu();

    public zzaqf(zzars zzarsVar, String str) {
        this.zzb = zzarsVar;
    }

    @Override // com.google.android.gms.internal.ads.zzaqa
    public final void zza() {
        zzgr.zzj(this.zzd);
        this.zze.zza();
        zzaqe zzaqeVar = this.zzg;
        if (zzaqeVar != null) {
            zzaqeVar.zza();
        }
        this.zzf.zza();
        this.zzh = 0L;
        this.zzl = -9223372036854775807L;
    }

    @Override // com.google.android.gms.internal.ads.zzaqa
    public final void zzb(zzagd zzagdVar, zzaro zzaroVar) {
        zzaroVar.zza();
        this.zzi = zzaroVar.zzc();
        zzahm zzahmVarZzs = zzagdVar.zzs(zzaroVar.zzb(), 2);
        this.zzj = zzahmVarZzs;
        this.zzg = new zzaqe(zzahmVarZzs);
        this.zzb.zza(zzagdVar, zzaroVar);
    }

    @Override // com.google.android.gms.internal.ads.zzaqa
    public final void zzc(long j8, int i5) {
        this.zzl = j8;
    }

    @Override // com.google.android.gms.internal.ads.zzaqa
    public final void zzd(zzeu zzeuVar) {
        int i5;
        int i10 = 3;
        this.zzg.getClass();
        this.zzj.getClass();
        int iZzg = zzeuVar.zzg();
        int iZze = zzeuVar.zze();
        byte[] bArrZzi = zzeuVar.zzi();
        this.zzh += zzeuVar.zzd();
        this.zzj.zzc(zzeuVar, zzeuVar.zzd());
        while (true) {
            int iZzi = zzgr.zzi(bArrZzi, iZzg, iZze, this.zzd);
            if (iZzi == iZze) {
                break;
            }
            int i11 = iZzi + 3;
            int i12 = zzeuVar.zzi()[i11] & ForkServer.ERROR;
            int i13 = iZzi - iZzg;
            if (!this.zzk) {
                if (i13 > 0) {
                    this.zze.zzc(bArrZzi, iZzg, iZzi);
                }
                int i14 = i13 < 0 ? -i13 : 0;
                zzaqd zzaqdVar = this.zze;
                if (zzaqdVar.zzb(i12, i14)) {
                    zzahm zzahmVar = this.zzj;
                    int i15 = zzaqdVar.zzb;
                    String str = this.zzi;
                    str.getClass();
                    byte[] bArrCopyOf = Arrays.copyOf(zzaqdVar.zzc, zzaqdVar.zza);
                    zzet zzetVar = new zzet(bArrCopyOf, bArrCopyOf.length);
                    zzetVar.zzo(i15);
                    zzetVar.zzo(4);
                    zzetVar.zzg();
                    zzetVar.zzh(8);
                    if (zzetVar.zzi()) {
                        zzetVar.zzh(4);
                        zzetVar.zzh(i10);
                    }
                    int iZzj = zzetVar.zzj(4);
                    float f10 = 1.0f;
                    if (iZzj == 15) {
                        int iZzj2 = zzetVar.zzj(8);
                        int iZzj3 = zzetVar.zzj(8);
                        if (iZzj3 == 0) {
                            zzeh.zzc("H263Reader", "Invalid aspect ratio");
                        } else {
                            f10 = iZzj2 / iZzj3;
                        }
                    } else if (iZzj < 7) {
                        f10 = zza[iZzj];
                    } else {
                        zzeh.zzc("H263Reader", "Invalid aspect ratio");
                    }
                    float f11 = f10;
                    if (zzetVar.zzi()) {
                        zzetVar.zzh(2);
                        zzetVar.zzh(1);
                        if (zzetVar.zzi()) {
                            zzetVar.zzh(15);
                            zzetVar.zzg();
                            zzetVar.zzh(15);
                            zzetVar.zzg();
                            zzetVar.zzh(15);
                            zzetVar.zzg();
                            zzetVar.zzh(3);
                            zzetVar.zzh(11);
                            zzetVar.zzg();
                            zzetVar.zzh(15);
                            zzetVar.zzg();
                        }
                    }
                    if (zzetVar.zzj(2) != 0) {
                        zzeh.zzc("H263Reader", "Unhandled video object layer shape");
                    }
                    zzetVar.zzg();
                    int iZzj4 = zzetVar.zzj(16);
                    zzetVar.zzg();
                    if (zzetVar.zzi()) {
                        if (iZzj4 == 0) {
                            zzeh.zzc("H263Reader", "Invalid vop_increment_time_resolution");
                        } else {
                            int i16 = iZzj4 - 1;
                            int i17 = 0;
                            while (i16 > 0) {
                                i16 >>= 1;
                                i17++;
                            }
                            zzetVar.zzh(i17);
                        }
                    }
                    zzetVar.zzg();
                    int iZzj5 = zzetVar.zzj(13);
                    zzetVar.zzg();
                    int iZzj6 = zzetVar.zzj(13);
                    zzetVar.zzg();
                    zzetVar.zzg();
                    zzt zztVar = new zzt();
                    zztVar.zza(str);
                    zztVar.zzn("video/mp2t");
                    zztVar.zzo("video/mp4v-es");
                    zztVar.zzv(iZzj5);
                    zztVar.zzw(iZzj6);
                    zztVar.zzB(f11);
                    zztVar.zzr(Collections.singletonList(bArrCopyOf));
                    zzahmVar.zzA(zztVar.zzP());
                    this.zzk = true;
                }
            }
            this.zzg.zzc(bArrZzi, iZzg, iZzi);
            zzaqr zzaqrVar = this.zzf;
            if (i13 > 0) {
                zzaqrVar.zzd(bArrZzi, iZzg, iZzi);
                i5 = 0;
            } else {
                i5 = -i13;
            }
            if (zzaqrVar.zze(i5)) {
                int iZza = zzgr.zza(zzaqrVar.zza, zzaqrVar.zzb);
                zzeu zzeuVar2 = this.zzc;
                String str2 = zzfm.zza;
                zzeuVar2.zzb(zzaqrVar.zza, iZza);
                this.zzb.zzb(this.zzl, zzeuVar2);
            }
            if (i12 == 178) {
                if (zzeuVar.zzi()[iZzi + 2] == 1) {
                    zzaqrVar.zzc(178);
                }
                i12 = 178;
            }
            int i18 = iZze - iZzi;
            this.zzg.zzd(this.zzh - i18, i18, this.zzk);
            this.zzg.zzb(i12, this.zzl);
            iZzg = i11;
            i10 = 3;
        }
        if (!this.zzk) {
            this.zze.zzc(bArrZzi, iZzg, iZze);
        }
        this.zzg.zzc(bArrZzi, iZzg, iZze);
        this.zzf.zzd(bArrZzi, iZzg, iZze);
    }

    @Override // com.google.android.gms.internal.ads.zzaqa
    public final void zze(boolean z2) {
        zzaqe zzaqeVar = this.zzg;
        zzaqeVar.getClass();
        if (z2) {
            zzaqeVar.zzd(this.zzh, 0, this.zzk);
            this.zzg.zza();
        }
    }
}
