package com.google.android.gms.internal.measurement;

import java.io.IOException;
import java.util.Arrays;

/* loaded from: classes4.dex */
public final class zzmj {
    private static final zzmj zza = new zzmj(0, new int[0], new Object[0], false);
    private int zzb;
    private int[] zzc;
    private Object[] zzd;
    private int zze;
    private boolean zzf;

    private zzmj() {
        this(0, new int[8], new Object[8], true);
    }

    public static zzmj zzc() {
        return zza;
    }

    public static zzmj zzd() {
        return new zzmj();
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
        if (obj == null || !(obj instanceof zzmj)) {
            return false;
        }
        zzmj zzmjVar = (zzmj) obj;
        int i5 = this.zzb;
        if (i5 == zzmjVar.zzb) {
            int[] iArr = this.zzc;
            int[] iArr2 = zzmjVar.zzc;
            int i10 = 0;
            while (true) {
                if (i10 >= i5) {
                    Object[] objArr = this.zzd;
                    Object[] objArr2 = zzmjVar.zzd;
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
        int iZzg;
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
                iZzg = zzjc.zzg(i12, ((Long) this.zzd[i10]).longValue());
            } else if (i13 == 1) {
                iZzg = zzjc.zzc(i12, ((Long) this.zzd[i10]).longValue());
            } else if (i13 == 2) {
                iZzg = zzjc.zzc(i12, (zzik) this.zzd[i10]);
            } else if (i13 == 3) {
                iZza = ((zzmj) this.zzd[i10]).zza() + (zzjc.zzi(i12) << 1) + iZza;
            } else {
                if (i13 != 5) {
                    throw new IllegalStateException(zzkb.zza());
                }
                iZzg = zzjc.zzf(i12, ((Integer) this.zzd[i10]).intValue());
            }
            iZza = iZzg + iZza;
        }
        this.zze = iZza;
        return iZza;
    }

    public final int zzb() {
        int i5 = this.zze;
        if (i5 != -1) {
            return i5;
        }
        int iZzd = 0;
        for (int i10 = 0; i10 < this.zzb; i10++) {
            iZzd += zzjc.zzd(this.zzc[i10] >>> 3, (zzik) this.zzd[i10]);
        }
        this.zze = iZzd;
        return iZzd;
    }

    public final void zze() {
        if (this.zzf) {
            this.zzf = false;
        }
    }

    private zzmj(int i5, int[] iArr, Object[] objArr, boolean z2) {
        this.zze = -1;
        this.zzb = i5;
        this.zzc = iArr;
        this.zzd = objArr;
        this.zzf = z2;
    }

    public final void zzb(zznb zznbVar) throws IOException {
        if (this.zzb == 0) {
            return;
        }
        if (zznbVar.zza() == 1) {
            for (int i5 = 0; i5 < this.zzb; i5++) {
                zza(this.zzc[i5], this.zzd[i5], zznbVar);
            }
            return;
        }
        for (int i10 = this.zzb - 1; i10 >= 0; i10--) {
            zza(this.zzc[i10], this.zzd[i10], zznbVar);
        }
    }

    public final zzmj zza(zzmj zzmjVar) {
        if (zzmjVar.equals(zza)) {
            return this;
        }
        zzf();
        int i5 = this.zzb + zzmjVar.zzb;
        zza(i5);
        System.arraycopy(zzmjVar.zzc, 0, this.zzc, this.zzb, zzmjVar.zzb);
        System.arraycopy(zzmjVar.zzd, 0, this.zzd, this.zzb, zzmjVar.zzb);
        this.zzb = i5;
        return this;
    }

    public static zzmj zza(zzmj zzmjVar, zzmj zzmjVar2) {
        int i5 = zzmjVar.zzb + zzmjVar2.zzb;
        int[] iArrCopyOf = Arrays.copyOf(zzmjVar.zzc, i5);
        System.arraycopy(zzmjVar2.zzc, 0, iArrCopyOf, zzmjVar.zzb, zzmjVar2.zzb);
        Object[] objArrCopyOf = Arrays.copyOf(zzmjVar.zzd, i5);
        System.arraycopy(zzmjVar2.zzd, 0, objArrCopyOf, zzmjVar.zzb, zzmjVar2.zzb);
        return new zzmj(i5, iArrCopyOf, objArrCopyOf, true);
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
            zzld.zza(sb2, i5, String.valueOf(this.zzc[i10] >>> 3), this.zzd[i10]);
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

    public final void zza(zznb zznbVar) throws IOException {
        if (zznbVar.zza() == 2) {
            for (int i5 = this.zzb - 1; i5 >= 0; i5--) {
                zznbVar.zza(this.zzc[i5] >>> 3, this.zzd[i5]);
            }
            return;
        }
        for (int i10 = 0; i10 < this.zzb; i10++) {
            zznbVar.zza(this.zzc[i10] >>> 3, this.zzd[i10]);
        }
    }

    private static void zza(int i5, Object obj, zznb zznbVar) throws IOException {
        int i10 = i5 >>> 3;
        int i11 = i5 & 7;
        if (i11 == 0) {
            zznbVar.zzb(i10, ((Long) obj).longValue());
            return;
        }
        if (i11 == 1) {
            zznbVar.zza(i10, ((Long) obj).longValue());
            return;
        }
        if (i11 == 2) {
            zznbVar.zza(i10, (zzik) obj);
            return;
        }
        if (i11 != 3) {
            if (i11 == 5) {
                zznbVar.zzb(i10, ((Integer) obj).intValue());
                return;
            }
            throw new RuntimeException(zzkb.zza());
        }
        if (zznbVar.zza() == 1) {
            zznbVar.zzb(i10);
            ((zzmj) obj).zzb(zznbVar);
            zznbVar.zza(i10);
        } else {
            zznbVar.zza(i10);
            ((zzmj) obj).zzb(zznbVar);
            zznbVar.zzb(i10);
        }
    }
}
