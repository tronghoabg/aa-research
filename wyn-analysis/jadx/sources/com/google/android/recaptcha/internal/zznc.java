package com.google.android.recaptcha.internal;

import com.google.android.gms.internal.consent_sdk.a;
import java.io.IOException;
import java.util.Arrays;

/* loaded from: classes4.dex */
public final class zznc {
    private static final zznc zza = new zznc(0, new int[0], new Object[0], false);
    private int zzb;
    private int[] zzc;
    private Object[] zzd;
    private int zze;
    private boolean zzf;

    private zznc(int i5, int[] iArr, Object[] objArr, boolean z2) {
        this.zze = -1;
        this.zzb = i5;
        this.zzc = iArr;
        this.zzd = objArr;
        this.zzf = z2;
    }

    public static zznc zzc() {
        return zza;
    }

    public static zznc zze(zznc zzncVar, zznc zzncVar2) {
        int i5 = zzncVar.zzb + zzncVar2.zzb;
        int[] iArrCopyOf = Arrays.copyOf(zzncVar.zzc, i5);
        System.arraycopy(zzncVar2.zzc, 0, iArrCopyOf, zzncVar.zzb, zzncVar2.zzb);
        Object[] objArrCopyOf = Arrays.copyOf(zzncVar.zzd, i5);
        System.arraycopy(zzncVar2.zzd, 0, objArrCopyOf, zzncVar.zzb, zzncVar2.zzb);
        return new zznc(i5, iArrCopyOf, objArrCopyOf, true);
    }

    public static zznc zzf() {
        return new zznc(0, new int[8], new Object[8], true);
    }

    private final void zzm(int i5) {
        int[] iArr = this.zzc;
        if (i5 > iArr.length) {
            int i10 = this.zzb;
            int i11 = (i10 / 2) + i10;
            if (i11 >= i5) {
                i5 = i11;
            }
            if (i5 < 8) {
                i5 = 8;
            }
            this.zzc = Arrays.copyOf(iArr, i5);
            this.zzd = Arrays.copyOf(this.zzd, i5);
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof zznc)) {
            return false;
        }
        zznc zzncVar = (zznc) obj;
        int i5 = this.zzb;
        if (i5 == zzncVar.zzb) {
            int[] iArr = this.zzc;
            int[] iArr2 = zzncVar.zzc;
            int i10 = 0;
            while (true) {
                if (i10 >= i5) {
                    Object[] objArr = this.zzd;
                    Object[] objArr2 = zzncVar.zzd;
                    int i11 = this.zzb;
                    for (int i12 = 0; i12 < i11; i12++) {
                        if (objArr[i12].equals(objArr2[i12])) {
                        }
                    }
                    return true;
                }
                if (iArr[i10] != iArr2[i10]) {
                    break;
                }
                i10++;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i5 = this.zzb;
        int i10 = i5 + 527;
        int[] iArr = this.zzc;
        int iHashCode = 17;
        int i11 = 17;
        for (int i12 = 0; i12 < i5; i12++) {
            i11 = (i11 * 31) + iArr[i12];
        }
        int i13 = ((i10 * 31) + i11) * 31;
        Object[] objArr = this.zzd;
        int i14 = this.zzb;
        for (int i15 = 0; i15 < i14; i15++) {
            iHashCode = (iHashCode * 31) + objArr[i15].hashCode();
        }
        return i13 + iHashCode;
    }

    public final int zza() {
        int iZzx;
        int iZzy;
        int iZzx2;
        int i5 = this.zze;
        if (i5 != -1) {
            return i5;
        }
        int iZzx3 = 0;
        for (int i10 = 0; i10 < this.zzb; i10++) {
            int i11 = this.zzc[i10];
            int i12 = i11 >>> 3;
            int i13 = i11 & 7;
            if (i13 != 0) {
                if (i13 == 1) {
                    ((Long) this.zzd[i10]).getClass();
                    iZzx2 = zzjg.zzx(i12 << 3) + 8;
                } else if (i13 == 2) {
                    int i14 = i12 << 3;
                    zziv zzivVar = (zziv) this.zzd[i10];
                    int iZzx4 = zzjg.zzx(i14);
                    int iZzd = zzivVar.zzd();
                    iZzx3 = zzjg.zzx(iZzd) + iZzd + iZzx4 + iZzx3;
                } else if (i13 == 3) {
                    int iZzx5 = zzjg.zzx(i12 << 3);
                    iZzx = iZzx5 + iZzx5;
                    iZzy = ((zznc) this.zzd[i10]).zza();
                } else {
                    if (i13 != 5) {
                        throw new IllegalStateException(zzlc.zza());
                    }
                    ((Integer) this.zzd[i10]).getClass();
                    iZzx2 = zzjg.zzx(i12 << 3) + 4;
                }
                iZzx3 = iZzx2 + iZzx3;
            } else {
                int i15 = i12 << 3;
                long jLongValue = ((Long) this.zzd[i10]).longValue();
                iZzx = zzjg.zzx(i15);
                iZzy = zzjg.zzy(jLongValue);
            }
            iZzx3 = iZzy + iZzx + iZzx3;
        }
        this.zze = iZzx3;
        return iZzx3;
    }

    public final int zzb() {
        int i5 = this.zze;
        if (i5 != -1) {
            return i5;
        }
        int iD = 0;
        for (int i10 = 0; i10 < this.zzb; i10++) {
            int i11 = this.zzc[i10] >>> 3;
            zziv zzivVar = (zziv) this.zzd[i10];
            int iZzx = zzjg.zzx(8);
            int iZzx2 = zzjg.zzx(i11) + zzjg.zzx(16);
            int iZzx3 = zzjg.zzx(24);
            int iZzd = zzivVar.zzd();
            iD += iZzx + iZzx + iZzx2 + a.D(iZzd, iZzd, iZzx3);
        }
        this.zze = iD;
        return iD;
    }

    public final zznc zzd(zznc zzncVar) {
        if (zzncVar.equals(zza)) {
            return this;
        }
        zzg();
        int i5 = this.zzb + zzncVar.zzb;
        zzm(i5);
        System.arraycopy(zzncVar.zzc, 0, this.zzc, this.zzb, zzncVar.zzb);
        System.arraycopy(zzncVar.zzd, 0, this.zzd, this.zzb, zzncVar.zzb);
        this.zzb = i5;
        return this;
    }

    public final void zzg() {
        if (!this.zzf) {
            throw new UnsupportedOperationException();
        }
    }

    public final void zzh() {
        if (this.zzf) {
            this.zzf = false;
        }
    }

    public final void zzi(StringBuilder sb2, int i5) {
        for (int i10 = 0; i10 < this.zzb; i10++) {
            zzlz.zzb(sb2, i5, String.valueOf(this.zzc[i10] >>> 3), this.zzd[i10]);
        }
    }

    public final void zzj(int i5, Object obj) {
        zzg();
        zzm(this.zzb + 1);
        int[] iArr = this.zzc;
        int i10 = this.zzb;
        iArr[i10] = i5;
        this.zzd[i10] = obj;
        this.zzb = i10 + 1;
    }

    public final void zzk(zzno zznoVar) throws IOException {
        for (int i5 = 0; i5 < this.zzb; i5++) {
            zznoVar.zzw(this.zzc[i5] >>> 3, this.zzd[i5]);
        }
    }

    public final void zzl(zzno zznoVar) throws IOException {
        if (this.zzb != 0) {
            for (int i5 = 0; i5 < this.zzb; i5++) {
                int i10 = this.zzc[i5];
                Object obj = this.zzd[i5];
                int i11 = i10 & 7;
                int i12 = i10 >>> 3;
                if (i11 == 0) {
                    zznoVar.zzt(i12, ((Long) obj).longValue());
                } else if (i11 == 1) {
                    zznoVar.zzm(i12, ((Long) obj).longValue());
                } else if (i11 == 2) {
                    zznoVar.zzd(i12, (zziv) obj);
                } else if (i11 == 3) {
                    zznoVar.zzF(i12);
                    ((zznc) obj).zzl(zznoVar);
                    zznoVar.zzh(i12);
                } else {
                    if (i11 != 5) {
                        throw new RuntimeException(zzlc.zza());
                    }
                    zznoVar.zzk(i12, ((Integer) obj).intValue());
                }
            }
        }
    }

    private zznc() {
        this(0, new int[8], new Object[8], true);
    }
}
