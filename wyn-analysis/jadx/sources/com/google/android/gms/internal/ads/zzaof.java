package com.google.android.gms.internal.ads;

import android.graphics.Bitmap;
import java.util.Arrays;

/* loaded from: classes3.dex */
final class zzaof {
    private final zzeu zza = new zzeu();
    private final int[] zzb = new int[256];
    private boolean zzc;
    private int zzd;
    private int zze;
    private int zzf;
    private int zzg;
    private int zzh;
    private int zzi;

    public final zzcy zza() {
        int i5;
        if (this.zzd == 0 || this.zze == 0 || this.zzh == 0 || this.zzi == 0) {
            return null;
        }
        zzeu zzeuVar = this.zza;
        if (zzeuVar.zze() == 0 || zzeuVar.zzg() != zzeuVar.zze() || !this.zzc) {
            return null;
        }
        zzeuVar.zzh(0);
        int i10 = this.zzh * this.zzi;
        int[] iArr = new int[i10];
        int i11 = 0;
        while (i11 < i10) {
            int iZzs = zzeuVar.zzs();
            if (iZzs != 0) {
                i5 = i11 + 1;
                iArr[i11] = this.zzb[iZzs];
            } else {
                int iZzs2 = zzeuVar.zzs();
                if (iZzs2 != 0) {
                    int iZzs3 = iZzs2 & 63;
                    if ((iZzs2 & 64) != 0) {
                        iZzs3 = (iZzs3 << 8) | zzeuVar.zzs();
                    }
                    i5 = iZzs3 + i11;
                    Arrays.fill(iArr, i11, i5, (iZzs2 & 128) == 0 ? this.zzb[0] : this.zzb[zzeuVar.zzs()]);
                }
            }
            i11 = i5;
        }
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(iArr, this.zzh, this.zzi, Bitmap.Config.ARGB_8888);
        zzcx zzcxVar = new zzcx();
        zzcxVar.zzc(bitmapCreateBitmap);
        zzcxVar.zzi(this.zzf / this.zzd);
        zzcxVar.zzj(0);
        zzcxVar.zzf(this.zzg / this.zze, 0);
        zzcxVar.zzg(0);
        zzcxVar.zzm(this.zzh / this.zzd);
        zzcxVar.zzn(this.zzi / this.zze);
        return zzcxVar.zzr();
    }

    public final void zzb() {
        this.zzd = 0;
        this.zze = 0;
        this.zzf = 0;
        this.zzg = 0;
        this.zzh = 0;
        this.zzi = 0;
        this.zza.zza(0);
        this.zzc = false;
    }

    public final /* synthetic */ void zzc(zzeu zzeuVar, int i5) {
        if (i5 % 5 != 2) {
            return;
        }
        zzeu zzeuVar2 = zzeuVar;
        zzeuVar2.zzk(2);
        int[] iArr = this.zzb;
        Arrays.fill(iArr, 0);
        int i10 = i5 / 5;
        int i11 = 0;
        while (i11 < i10) {
            int iZzs = zzeuVar2.zzs();
            int iZzs2 = zzeuVar2.zzs();
            int iZzs3 = zzeuVar2.zzs();
            int iZzs4 = zzeuVar2.zzs();
            double d3 = iZzs2;
            int iZzs5 = zzeuVar2.zzs() << 24;
            String str = zzfm.zza;
            double d5 = iZzs3 - 128;
            double d10 = iZzs4 - 128;
            iArr[iZzs] = (Math.max(0, Math.min((int) ((1.402d * d5) + d3), 255)) << 16) | iZzs5 | (Math.max(0, Math.min((int) ((d3 - (0.34414d * d10)) - (d5 * 0.71414d)), 255)) << 8) | Math.max(0, Math.min((int) ((d10 * 1.772d) + d3), 255));
            i11++;
            zzeuVar2 = zzeuVar;
        }
        this.zzc = true;
    }

    public final /* synthetic */ void zzd(zzeu zzeuVar, int i5) {
        int iZzx;
        if (i5 < 4) {
            return;
        }
        zzeuVar.zzk(3);
        int i10 = i5 - 4;
        if ((zzeuVar.zzs() & 128) != 0) {
            if (i10 < 7 || (iZzx = zzeuVar.zzx()) < 4) {
                return;
            }
            this.zzh = zzeuVar.zzt();
            this.zzi = zzeuVar.zzt();
            this.zza.zza(iZzx - 4);
            i10 = i5 - 11;
        }
        zzeu zzeuVar2 = this.zza;
        int iZzg = zzeuVar2.zzg();
        int iZze = zzeuVar2.zze();
        if (iZzg >= iZze || i10 <= 0) {
            return;
        }
        int iMin = Math.min(i10, iZze - iZzg);
        zzeuVar.zzm(zzeuVar2.zzi(), iZzg, iMin);
        zzeuVar2.zzh(iZzg + iMin);
    }

    public final /* synthetic */ void zze(zzeu zzeuVar, int i5) {
        if (i5 < 19) {
            return;
        }
        this.zzd = zzeuVar.zzt();
        this.zze = zzeuVar.zzt();
        zzeuVar.zzk(11);
        this.zzf = zzeuVar.zzt();
        this.zzg = zzeuVar.zzt();
    }
}
