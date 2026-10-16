package com.google.android.gms.internal.ads;

import cb.AbstractC1593a;
import java.io.IOException;
import java.util.Arrays;

/* loaded from: classes3.dex */
public final class zzihe {
    private static final zzihe zza = new zzihe(0, new int[0], new Object[0], false);
    private int zzb;
    private int[] zzc;
    private Object[] zzd;
    private int zze;
    private boolean zzf;

    private zzihe(int i5, int[] iArr, Object[] objArr, boolean z2) {
        this.zze = -1;
        this.zzb = i5;
        this.zzc = iArr;
        this.zzd = objArr;
        this.zzf = z2;
    }

    public static zzihe zza() {
        return zza;
    }

    public static zzihe zzb() {
        return new zzihe();
    }

    public static zzihe zzc(zzihe zziheVar, zzihe zziheVar2) {
        int i5 = zziheVar.zzb + zziheVar2.zzb;
        int[] iArrCopyOf = Arrays.copyOf(zziheVar.zzc, i5);
        System.arraycopy(zziheVar2.zzc, 0, iArrCopyOf, zziheVar.zzb, zziheVar2.zzb);
        Object[] objArrCopyOf = Arrays.copyOf(zziheVar.zzd, i5);
        System.arraycopy(zziheVar2.zzd, 0, objArrCopyOf, zziheVar.zzb, zziheVar2.zzb);
        return new zzihe(i5, iArrCopyOf, objArrCopyOf, true);
    }

    private final void zzn(int i5) {
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
        if (obj == null || !(obj instanceof zzihe)) {
            return false;
        }
        zzihe zziheVar = (zzihe) obj;
        int i5 = this.zzb;
        if (i5 == zziheVar.zzb) {
            int[] iArr = this.zzc;
            int[] iArr2 = zziheVar.zzc;
            int i10 = 0;
            while (true) {
                if (i10 >= i5) {
                    Object[] objArr = this.zzd;
                    Object[] objArr2 = zziheVar.zzd;
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

    public final void zzd() {
        if (this.zzf) {
            this.zzf = false;
        }
    }

    public final void zze() {
        if (!this.zzf) {
            throw new UnsupportedOperationException();
        }
    }

    public final void zzf(zzihs zzihsVar) throws IOException {
        for (int i5 = 0; i5 < this.zzb; i5++) {
            zzihsVar.zzv(this.zzc[i5] >>> 3, this.zzd[i5]);
        }
    }

    public final void zzg(zzihs zzihsVar) throws IOException {
        if (this.zzb != 0) {
            for (int i5 = 0; i5 < this.zzb; i5++) {
                int i10 = this.zzc[i5];
                Object obj = this.zzd[i5];
                int i11 = i10 & 7;
                int i12 = i10 >>> 3;
                if (i11 == 0) {
                    zzihsVar.zzc(i12, ((Long) obj).longValue());
                } else if (i11 == 1) {
                    zzihsVar.zzj(i12, ((Long) obj).longValue());
                } else if (i11 == 2) {
                    zzihsVar.zzn(i12, (zzidl) obj);
                } else if (i11 == 3) {
                    zzihsVar.zzt(i12);
                    ((zzihe) obj).zzg(zzihsVar);
                    zzihsVar.zzu(i12);
                } else {
                    if (i11 != 5) {
                        throw new RuntimeException(new zzifg("Protocol message tag had invalid wire type."));
                    }
                    zzihsVar.zzk(i12, ((Integer) obj).intValue());
                }
            }
        }
    }

    public final int zzh() {
        int i5 = this.zze;
        if (i5 != -1) {
            return i5;
        }
        int iA = 0;
        for (int i10 = 0; i10 < this.zzb; i10++) {
            int i11 = this.zzc[i10] >>> 3;
            zzidl zzidlVar = (zzidl) this.zzd[i10];
            int iZzF = zzidu.zzF(8);
            int iZzF2 = zzidu.zzF(i11) + zzidu.zzF(16);
            int iZzF3 = zzidu.zzF(24);
            int iZzb = zzidlVar.zzb();
            iA += iZzF + iZzF + iZzF2 + AbstractC1593a.a(iZzb, iZzb, iZzF3);
        }
        this.zze = iA;
        return iA;
    }

    public final int zzi() {
        int iZzF;
        int iZzG;
        int iZzF2;
        int i5 = this.zze;
        if (i5 != -1) {
            return i5;
        }
        int iB = 0;
        for (int i10 = 0; i10 < this.zzb; i10++) {
            int i11 = this.zzc[i10];
            int i12 = i11 >>> 3;
            int i13 = i11 & 7;
            if (i13 != 0) {
                if (i13 == 1) {
                    ((Long) this.zzd[i10]).getClass();
                    iZzF2 = zzidu.zzF(i12 << 3) + 8;
                } else if (i13 == 2) {
                    int i14 = i12 << 3;
                    zzidl zzidlVar = (zzidl) this.zzd[i10];
                    int iZzF3 = zzidu.zzF(i14);
                    int iZzb = zzidlVar.zzb();
                    iB = AbstractC1593a.B(iZzb, iZzb, iZzF3, iB);
                } else if (i13 == 3) {
                    int iZzF4 = zzidu.zzF(i12 << 3);
                    iZzF = iZzF4 + iZzF4;
                    iZzG = ((zzihe) this.zzd[i10]).zzi();
                } else {
                    if (i13 != 5) {
                        throw new IllegalStateException(new zzifg("Protocol message tag had invalid wire type."));
                    }
                    ((Integer) this.zzd[i10]).getClass();
                    iZzF2 = zzidu.zzF(i12 << 3) + 4;
                }
                iB = iZzF2 + iB;
            } else {
                int i15 = i12 << 3;
                long jLongValue = ((Long) this.zzd[i10]).longValue();
                iZzF = zzidu.zzF(i15);
                iZzG = zzidu.zzG(jLongValue);
            }
            iB = iZzG + iZzF + iB;
        }
        this.zze = iB;
        return iB;
    }

    public final void zzj(StringBuilder sb2, int i5) {
        for (int i10 = 0; i10 < this.zzb; i10++) {
            zzigb.zzb(sb2, i5, String.valueOf(this.zzc[i10] >>> 3), this.zzd[i10]);
        }
    }

    public final void zzk(int i5, Object obj) {
        zze();
        zzn(this.zzb + 1);
        int[] iArr = this.zzc;
        int i10 = this.zzb;
        iArr[i10] = i5;
        this.zzd[i10] = obj;
        this.zzb = i10 + 1;
    }

    public final boolean zzl(int i5, zzidp zzidpVar) throws IOException {
        int iZza;
        zze();
        int i10 = i5 & 7;
        if (i10 == 0) {
            zzk(i5, Long.valueOf(zzidpVar.zzg()));
            return true;
        }
        if (i10 == 1) {
            zzk(i5, Long.valueOf(zzidpVar.zzi()));
            return true;
        }
        if (i10 == 2) {
            zzk(i5, zzidpVar.zzn());
            return true;
        }
        if (i10 != 3) {
            if (i10 == 4) {
                zzidpVar.zzK();
                return false;
            }
            if (i10 != 5) {
                throw new zzifg("Protocol message tag had invalid wire type.");
            }
            zzk(i5, Integer.valueOf(zzidpVar.zzj()));
            return true;
        }
        zzidpVar.zzJ();
        zzidpVar.zzb++;
        zzihe zziheVar = new zzihe();
        do {
            iZza = zzidpVar.zza();
            if (iZza == 0) {
                break;
            }
        } while (zziheVar.zzl(iZza, zzidpVar));
        zzidpVar.zzb--;
        zzidpVar.zzb(4 | ((i5 >>> 3) << 3));
        zzk(i5, zziheVar);
        return true;
    }

    public final zzihe zzm(zzihe zziheVar) {
        if (zziheVar.equals(zza)) {
            return this;
        }
        zze();
        int i5 = this.zzb + zziheVar.zzb;
        zzn(i5);
        System.arraycopy(zziheVar.zzc, 0, this.zzc, this.zzb, zziheVar.zzb);
        System.arraycopy(zziheVar.zzd, 0, this.zzd, this.zzb, zziheVar.zzb);
        this.zzb = i5;
        return this;
    }

    private zzihe() {
        this(0, new int[8], new Object[8], true);
    }
}
