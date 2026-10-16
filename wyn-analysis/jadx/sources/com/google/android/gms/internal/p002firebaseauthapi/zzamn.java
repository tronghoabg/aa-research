package com.google.android.gms.internal.p002firebaseauthapi;

import java.io.IOException;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class zzamn {
    private static final zzamn zza = new zzamn(0, new int[0], new Object[0], false);
    private int zzb;
    private int[] zzc;
    private Object[] zzd;
    private int zze;
    private boolean zzf;

    private zzamn() {
        this(0, new int[8], new Object[8], true);
    }

    public static zzamn zzc() {
        return zza;
    }

    public static zzamn zzd() {
        return new zzamn();
    }

    private final void zzf() {
        if (!this.zzf) {
            throw new UnsupportedOperationException();
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof zzamn)) {
            return false;
        }
        zzamn zzamnVar = (zzamn) obj;
        int i5 = this.zzb;
        if (i5 == zzamnVar.zzb) {
            int[] iArr = this.zzc;
            int[] iArr2 = zzamnVar.zzc;
            int i10 = 0;
            while (true) {
                if (i10 >= i5) {
                    Object[] objArr = this.zzd;
                    Object[] objArr2 = zzamnVar.zzd;
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
        int i10 = (i5 + 527) * 31;
        int[] iArr = this.zzc;
        int iHashCode = 17;
        int i11 = 17;
        for (int i12 = 0; i12 < i5; i12++) {
            i11 = (i11 * 31) + iArr[i12];
        }
        int i13 = (i10 + i11) * 31;
        Object[] objArr = this.zzd;
        int i14 = this.zzb;
        for (int i15 = 0; i15 < i14; i15++) {
            iHashCode = (iHashCode * 31) + objArr[i15].hashCode();
        }
        return i13 + iHashCode;
    }

    public final int zza() {
        int iZze;
        int i5 = this.zze;
        if (i5 != -1) {
            return i5;
        }
        int iZza = 0;
        for (int i10 = 0; i10 < this.zzb; i10++) {
            int i11 = this.zzc[i10];
            int i12 = i11 >>> 3;
            int i13 = i11 & 7;
            if (i13 == 0) {
                iZze = zzajg.zze(i12, ((Long) this.zzd[i10]).longValue());
            } else if (i13 == 1) {
                iZze = zzajg.zza(i12, ((Long) this.zzd[i10]).longValue());
            } else if (i13 == 2) {
                iZze = zzajg.zza(i12, (zzaip) this.zzd[i10]);
            } else if (i13 == 3) {
                iZza = ((zzamn) this.zzd[i10]).zza() + (zzajg.zzi(i12) << 1) + iZza;
            } else {
                if (i13 != 5) {
                    throw new IllegalStateException(zzakf.zza());
                }
                iZze = zzajg.zzc(i12, ((Integer) this.zzd[i10]).intValue());
            }
            iZza = iZze + iZza;
        }
        this.zze = iZza;
        return iZza;
    }

    public final int zzb() {
        int i5 = this.zze;
        if (i5 != -1) {
            return i5;
        }
        int iZzb = 0;
        for (int i10 = 0; i10 < this.zzb; i10++) {
            iZzb += zzajg.zzb(this.zzc[i10] >>> 3, (zzaip) this.zzd[i10]);
        }
        this.zze = iZzb;
        return iZzb;
    }

    public final void zze() {
        if (this.zzf) {
            this.zzf = false;
        }
    }

    private zzamn(int i5, int[] iArr, Object[] objArr, boolean z2) {
        this.zze = -1;
        this.zzb = i5;
        this.zzc = iArr;
        this.zzd = objArr;
        this.zzf = z2;
    }

    public final void zzb(zzanf zzanfVar) throws IOException {
        if (this.zzb == 0) {
            return;
        }
        if (zzanfVar.zza() == 1) {
            for (int i5 = 0; i5 < this.zzb; i5++) {
                zza(this.zzc[i5], this.zzd[i5], zzanfVar);
            }
            return;
        }
        for (int i10 = this.zzb - 1; i10 >= 0; i10--) {
            zza(this.zzc[i10], this.zzd[i10], zzanfVar);
        }
    }

    public final zzamn zza(zzamn zzamnVar) {
        if (zzamnVar.equals(zza)) {
            return this;
        }
        zzf();
        int i5 = this.zzb + zzamnVar.zzb;
        zza(i5);
        System.arraycopy(zzamnVar.zzc, 0, this.zzc, this.zzb, zzamnVar.zzb);
        System.arraycopy(zzamnVar.zzd, 0, this.zzd, this.zzb, zzamnVar.zzb);
        this.zzb = i5;
        return this;
    }

    public static zzamn zza(zzamn zzamnVar, zzamn zzamnVar2) {
        int i5 = zzamnVar.zzb + zzamnVar2.zzb;
        int[] iArrCopyOf = Arrays.copyOf(zzamnVar.zzc, i5);
        System.arraycopy(zzamnVar2.zzc, 0, iArrCopyOf, zzamnVar.zzb, zzamnVar2.zzb);
        Object[] objArrCopyOf = Arrays.copyOf(zzamnVar.zzd, i5);
        System.arraycopy(zzamnVar2.zzd, 0, objArrCopyOf, zzamnVar.zzb, zzamnVar2.zzb);
        return new zzamn(i5, iArrCopyOf, objArrCopyOf, true);
    }

    private final void zza(int i5) {
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

    public final void zza(StringBuilder sb2, int i5) {
        for (int i10 = 0; i10 < this.zzb; i10++) {
            zzalh.zza(sb2, i5, String.valueOf(this.zzc[i10] >>> 3), this.zzd[i10]);
        }
    }

    public final void zza(int i5, Object obj) {
        zzf();
        zza(this.zzb + 1);
        int[] iArr = this.zzc;
        int i10 = this.zzb;
        iArr[i10] = i5;
        this.zzd[i10] = obj;
        this.zzb = i10 + 1;
    }

    public final void zza(zzanf zzanfVar) throws IOException {
        if (zzanfVar.zza() == 2) {
            for (int i5 = this.zzb - 1; i5 >= 0; i5--) {
                zzanfVar.zza(this.zzc[i5] >>> 3, this.zzd[i5]);
            }
            return;
        }
        for (int i10 = 0; i10 < this.zzb; i10++) {
            zzanfVar.zza(this.zzc[i10] >>> 3, this.zzd[i10]);
        }
    }

    private static void zza(int i5, Object obj, zzanf zzanfVar) throws IOException {
        int i10 = i5 >>> 3;
        int i11 = i5 & 7;
        if (i11 == 0) {
            zzanfVar.zzb(i10, ((Long) obj).longValue());
            return;
        }
        if (i11 == 1) {
            zzanfVar.zza(i10, ((Long) obj).longValue());
            return;
        }
        if (i11 == 2) {
            zzanfVar.zza(i10, (zzaip) obj);
            return;
        }
        if (i11 != 3) {
            if (i11 == 5) {
                zzanfVar.zzb(i10, ((Integer) obj).intValue());
                return;
            }
            throw new RuntimeException(zzakf.zza());
        }
        if (zzanfVar.zza() == 1) {
            zzanfVar.zzb(i10);
            ((zzamn) obj).zzb(zzanfVar);
            zzanfVar.zza(i10);
        } else {
            zzanfVar.zza(i10);
            ((zzamn) obj).zzb(zzanfVar);
            zzanfVar.zzb(i10);
        }
    }
}
