package com.google.android.gms.internal.auth;

import java.util.Arrays;

/* loaded from: classes3.dex */
public final class zzha {
    private static final zzha zza = new zzha(0, new int[0], new Object[0], false);
    private int zzb;
    private int[] zzc;
    private Object[] zzd;
    private boolean zze;

    private zzha(int i5, int[] iArr, Object[] objArr, boolean z2) {
        this.zzb = i5;
        this.zzc = iArr;
        this.zzd = objArr;
        this.zze = z2;
    }

    public static zzha zza() {
        return zza;
    }

    public static zzha zzc(zzha zzhaVar, zzha zzhaVar2) {
        int i5 = zzhaVar.zzb + zzhaVar2.zzb;
        int[] iArrCopyOf = Arrays.copyOf(zzhaVar.zzc, i5);
        System.arraycopy(zzhaVar2.zzc, 0, iArrCopyOf, zzhaVar.zzb, zzhaVar2.zzb);
        Object[] objArrCopyOf = Arrays.copyOf(zzhaVar.zzd, i5);
        System.arraycopy(zzhaVar2.zzd, 0, objArrCopyOf, zzhaVar.zzb, zzhaVar2.zzb);
        return new zzha(i5, iArrCopyOf, objArrCopyOf, true);
    }

    public static zzha zzd() {
        return new zzha(0, new int[8], new Object[8], true);
    }

    private final void zzi(int i5) {
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
        if (obj == null || !(obj instanceof zzha)) {
            return false;
        }
        zzha zzhaVar = (zzha) obj;
        int i5 = this.zzb;
        if (i5 == zzhaVar.zzb) {
            int[] iArr = this.zzc;
            int[] iArr2 = zzhaVar.zzc;
            int i10 = 0;
            while (true) {
                if (i10 >= i5) {
                    Object[] objArr = this.zzd;
                    Object[] objArr2 = zzhaVar.zzd;
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
        int i13 = (i10 * 31) + i11;
        Object[] objArr = this.zzd;
        int i14 = this.zzb;
        for (int i15 = 0; i15 < i14; i15++) {
            iHashCode = (iHashCode * 31) + objArr[i15].hashCode();
        }
        return (i13 * 31) + iHashCode;
    }

    public final zzha zzb(zzha zzhaVar) {
        if (zzhaVar.equals(zza)) {
            return this;
        }
        zze();
        int i5 = this.zzb + zzhaVar.zzb;
        zzi(i5);
        System.arraycopy(zzhaVar.zzc, 0, this.zzc, this.zzb, zzhaVar.zzb);
        System.arraycopy(zzhaVar.zzd, 0, this.zzd, this.zzb, zzhaVar.zzb);
        this.zzb = i5;
        return this;
    }

    public final void zze() {
        if (!this.zze) {
            throw new UnsupportedOperationException();
        }
    }

    public final void zzf() {
        if (this.zze) {
            this.zze = false;
        }
    }

    public final void zzg(StringBuilder sb2, int i5) {
        for (int i10 = 0; i10 < this.zzb; i10++) {
            zzfz.zzb(sb2, i5, String.valueOf(this.zzc[i10] >>> 3), this.zzd[i10]);
        }
    }

    public final void zzh(int i5, Object obj) {
        zze();
        zzi(this.zzb + 1);
        int[] iArr = this.zzc;
        int i10 = this.zzb;
        iArr[i10] = i5;
        this.zzd[i10] = obj;
        this.zzb = i10 + 1;
    }

    private zzha() {
        this(0, new int[8], new Object[8], true);
    }
}
