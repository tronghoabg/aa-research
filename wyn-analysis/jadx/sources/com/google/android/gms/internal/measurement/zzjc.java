package com.google.android.gms.internal.measurement;

import R8.v;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

/* loaded from: classes4.dex */
public abstract class zzjc extends zzil {
    private static final Logger zzb = Logger.getLogger(zzjc.class.getName());
    private static final boolean zzc = zzml.zzc();
    zzjf zza;

    public static class zza extends zzjc {
        private final byte[] zzb;
        private final int zzc;
        private int zzd;

        public zza(byte[] bArr, int i5, int i10) {
            super();
            if (bArr == null) {
                throw new NullPointerException("buffer");
            }
            if (((bArr.length - i10) | i10) < 0) {
                throw new IllegalArgumentException(String.format("Array range is invalid. Buffer.length=%d, offset=%d, length=%d", Integer.valueOf(bArr.length), 0, Integer.valueOf(i10)));
            }
            this.zzb = bArr;
            this.zzd = 0;
            this.zzc = i10;
        }

        private final void zzc(byte[] bArr, int i5, int i10) throws IOException {
            try {
                System.arraycopy(bArr, i5, this.zzb, this.zzd, i10);
                this.zzd += i10;
            } catch (IndexOutOfBoundsException e7) {
                throw new zzb(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.zzd), Integer.valueOf(this.zzc), Integer.valueOf(i10)), e7);
            }
        }

        @Override // com.google.android.gms.internal.measurement.zzjc
        public final int zza() {
            return this.zzc - this.zzd;
        }

        @Override // com.google.android.gms.internal.measurement.zzjc
        public final void zzb(byte[] bArr, int i5, int i10) throws IOException {
            zzc(i10);
            zzc(bArr, 0, i10);
        }

        @Override // com.google.android.gms.internal.measurement.zzjc
        public final void zzd(int i5, int i10) throws IOException {
            zzc(i5, 0);
            zzc(i10);
        }

        @Override // com.google.android.gms.internal.measurement.zzjc
        public final void zza(byte b5) throws IOException {
            int i5 = this.zzd;
            try {
                int i10 = i5 + 1;
                try {
                    this.zzb[i5] = b5;
                    this.zzd = i10;
                } catch (IndexOutOfBoundsException e7) {
                    e = e7;
                    i5 = i10;
                    throw new zzb(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(i5), Integer.valueOf(this.zzc), 1), e);
                }
            } catch (IndexOutOfBoundsException e10) {
                e = e10;
            }
        }

        @Override // com.google.android.gms.internal.measurement.zzjc
        public final void zzb(int i5, int i10) throws IOException {
            zzc(i5, 0);
            zzb(i10);
        }

        @Override // com.google.android.gms.internal.measurement.zzjc
        public final void zzb(int i5) throws IOException {
            if (i5 >= 0) {
                zzc(i5);
            } else {
                zzb(i5);
            }
        }

        @Override // com.google.android.gms.internal.measurement.zzjc
        public final void zzc(int i5, int i10) throws IOException {
            zzc((i5 << 3) | i10);
        }

        @Override // com.google.android.gms.internal.measurement.zzjc
        public final void zzc(int i5) throws IOException {
            while ((i5 & (-128)) != 0) {
                try {
                    byte[] bArr = this.zzb;
                    int i10 = this.zzd;
                    this.zzd = i10 + 1;
                    bArr[i10] = (byte) (i5 | 128);
                    i5 >>>= 7;
                } catch (IndexOutOfBoundsException e7) {
                    throw new zzb(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.zzd), Integer.valueOf(this.zzc), 1), e7);
                }
            }
            byte[] bArr2 = this.zzb;
            int i11 = this.zzd;
            this.zzd = i11 + 1;
            bArr2[i11] = (byte) i5;
        }

        @Override // com.google.android.gms.internal.measurement.zzjc
        public final void zza(int i5, boolean z2) throws IOException {
            zzc(i5, 0);
            zza(z2 ? (byte) 1 : (byte) 0);
        }

        @Override // com.google.android.gms.internal.measurement.zzjc
        public final void zzb(int i5, zzik zzikVar) throws IOException {
            zzc(1, 3);
            zzd(2, i5);
            zza(3, zzikVar);
            zzc(1, 4);
        }

        @Override // com.google.android.gms.internal.measurement.zzjc
        public final void zza(int i5, zzik zzikVar) throws IOException {
            zzc(i5, 2);
            zza(zzikVar);
        }

        @Override // com.google.android.gms.internal.measurement.zzjc
        public final void zza(zzik zzikVar) throws IOException {
            zzc(zzikVar.zzb());
            zzikVar.zza(this);
        }

        @Override // com.google.android.gms.internal.measurement.zzjc
        public final void zzb(int i5, long j8) throws IOException {
            zzc(i5, 0);
            zzb(j8);
        }

        @Override // com.google.android.gms.internal.measurement.zzjc
        public final void zza(int i5, int i10) throws IOException {
            zzc(i5, 5);
            zza(i10);
        }

        @Override // com.google.android.gms.internal.measurement.zzjc
        public final void zzb(long j8) throws IOException {
            if (zzjc.zzc && zza() >= 10) {
                while ((j8 & (-128)) != 0) {
                    byte[] bArr = this.zzb;
                    int i5 = this.zzd;
                    this.zzd = i5 + 1;
                    zzml.zza(bArr, i5, (byte) (((int) j8) | 128));
                    j8 >>>= 7;
                }
                byte[] bArr2 = this.zzb;
                int i10 = this.zzd;
                this.zzd = 1 + i10;
                zzml.zza(bArr2, i10, (byte) j8);
                return;
            }
            while ((j8 & (-128)) != 0) {
                try {
                    byte[] bArr3 = this.zzb;
                    int i11 = this.zzd;
                    this.zzd = i11 + 1;
                    bArr3[i11] = (byte) (((int) j8) | 128);
                    j8 >>>= 7;
                } catch (IndexOutOfBoundsException e7) {
                    throw new zzb(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.zzd), Integer.valueOf(this.zzc), 1), e7);
                }
            }
            byte[] bArr4 = this.zzb;
            int i12 = this.zzd;
            this.zzd = i12 + 1;
            bArr4[i12] = (byte) j8;
        }

        @Override // com.google.android.gms.internal.measurement.zzjc
        public final void zza(int i5) throws IOException {
            try {
                byte[] bArr = this.zzb;
                int i10 = this.zzd;
                int i11 = i10 + 1;
                this.zzd = i11;
                bArr[i10] = (byte) i5;
                int i12 = i10 + 2;
                this.zzd = i12;
                bArr[i11] = (byte) (i5 >> 8);
                int i13 = i10 + 3;
                this.zzd = i13;
                bArr[i12] = (byte) (i5 >> 16);
                this.zzd = i10 + 4;
                bArr[i13] = (byte) (i5 >>> 24);
            } catch (IndexOutOfBoundsException e7) {
                throw new zzb(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.zzd), Integer.valueOf(this.zzc), 1), e7);
            }
        }

        @Override // com.google.android.gms.internal.measurement.zzjc
        public final void zza(int i5, long j8) throws IOException {
            zzc(i5, 1);
            zza(j8);
        }

        @Override // com.google.android.gms.internal.measurement.zzjc
        public final void zza(long j8) throws IOException {
            try {
                byte[] bArr = this.zzb;
                int i5 = this.zzd;
                int i10 = i5 + 1;
                this.zzd = i10;
                bArr[i5] = (byte) j8;
                int i11 = i5 + 2;
                this.zzd = i11;
                bArr[i10] = (byte) (j8 >> 8);
                int i12 = i5 + 3;
                this.zzd = i12;
                bArr[i11] = (byte) (j8 >> 16);
                int i13 = i5 + 4;
                this.zzd = i13;
                bArr[i12] = (byte) (j8 >> 24);
                int i14 = i5 + 5;
                this.zzd = i14;
                bArr[i13] = (byte) (j8 >> 32);
                int i15 = i5 + 6;
                this.zzd = i15;
                bArr[i14] = (byte) (j8 >> 40);
                int i16 = i5 + 7;
                this.zzd = i16;
                bArr[i15] = (byte) (j8 >> 48);
                this.zzd = i5 + 8;
                bArr[i16] = (byte) (j8 >> 56);
            } catch (IndexOutOfBoundsException e7) {
                throw new zzb(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.zzd), Integer.valueOf(this.zzc), 1), e7);
            }
        }

        @Override // com.google.android.gms.internal.measurement.zzil
        public final void zza(byte[] bArr, int i5, int i10) throws IOException {
            zzc(bArr, i5, i10);
        }

        @Override // com.google.android.gms.internal.measurement.zzjc
        public final void zza(int i5, zzlc zzlcVar, zzlu zzluVar) throws IOException {
            zzc(i5, 2);
            zzc(((zzib) zzlcVar).zza(zzluVar));
            zzluVar.zza((zzlu) zzlcVar, (zznb) this.zza);
        }

        @Override // com.google.android.gms.internal.measurement.zzjc
        public final void zza(zzlc zzlcVar) throws IOException {
            zzc(zzlcVar.zzcb());
            zzlcVar.zza(this);
        }

        @Override // com.google.android.gms.internal.measurement.zzjc
        public final void zza(int i5, zzlc zzlcVar) throws IOException {
            zzc(1, 3);
            zzd(2, i5);
            zzc(3, 2);
            zza(zzlcVar);
            zzc(1, 4);
        }

        @Override // com.google.android.gms.internal.measurement.zzjc
        public final void zza(int i5, String str) throws IOException {
            zzc(i5, 2);
            zza(str);
        }

        @Override // com.google.android.gms.internal.measurement.zzjc
        public final void zza(String str) throws IOException {
            int i5 = this.zzd;
            try {
                int iZzj = zzjc.zzj(str.length() * 3);
                int iZzj2 = zzjc.zzj(str.length());
                if (iZzj2 == iZzj) {
                    int i10 = i5 + iZzj2;
                    this.zzd = i10;
                    int iZza = zzmp.zza(str, this.zzb, i10, zza());
                    this.zzd = i5;
                    zzc((iZza - i5) - iZzj2);
                    this.zzd = iZza;
                    return;
                }
                zzc(zzmp.zza(str));
                this.zzd = zzmp.zza(str, this.zzb, this.zzd, zza());
            } catch (zzmt e7) {
                this.zzd = i5;
                zza(str, e7);
            } catch (IndexOutOfBoundsException e10) {
                throw new zzb(e10);
            }
        }
    }

    public static class zzb extends IOException {
        public zzb() {
            super("CodedOutputStream was writing to a flat byte array and ran out of space.");
        }

        public zzb(Throwable th) {
            super("CodedOutputStream was writing to a flat byte array and ran out of space.", th);
        }

        public zzb(String str, Throwable th) {
            super(v.f("CodedOutputStream was writing to a flat byte array and ran out of space.: ", str), th);
        }
    }

    public static int zza(double d3) {
        return 8;
    }

    public static int zzb(int i5, boolean z2) {
        return zzj(i5 << 3) + 1;
    }

    public static int zzc(long j8) {
        return 8;
    }

    public static int zzd(int i5) {
        return zzg(i5);
    }

    public static int zze(int i5) {
        return 4;
    }

    public static int zzf(int i5, int i10) {
        return zzj(i5 << 3) + 4;
    }

    public static int zzg(int i5) {
        return 4;
    }

    public static int zzh(int i5, int i10) {
        return zzj(i5 << 3) + 4;
    }

    private static long zzi(long j8) {
        return (j8 >> 63) ^ (j8 << 1);
    }

    public static int zzj(int i5, int i10) {
        return zzj(i10) + zzj(i5 << 3);
    }

    private static int zzl(int i5) {
        return (i5 >> 31) ^ (i5 << 1);
    }

    public abstract int zza();

    public abstract void zza(byte b5) throws IOException;

    public abstract void zza(int i5) throws IOException;

    public abstract void zza(int i5, int i10) throws IOException;

    public abstract void zza(int i5, long j8) throws IOException;

    public abstract void zza(int i5, zzik zzikVar) throws IOException;

    public abstract void zza(int i5, zzlc zzlcVar) throws IOException;

    public abstract void zza(int i5, zzlc zzlcVar, zzlu zzluVar) throws IOException;

    public abstract void zza(int i5, String str) throws IOException;

    public abstract void zza(int i5, boolean z2) throws IOException;

    public abstract void zza(long j8) throws IOException;

    public abstract void zza(zzik zzikVar) throws IOException;

    public abstract void zza(zzlc zzlcVar) throws IOException;

    public abstract void zza(String str) throws IOException;

    public abstract void zzb(int i5) throws IOException;

    public abstract void zzb(int i5, int i10) throws IOException;

    public abstract void zzb(int i5, long j8) throws IOException;

    public abstract void zzb(int i5, zzik zzikVar) throws IOException;

    public abstract void zzb(long j8) throws IOException;

    public abstract void zzb(byte[] bArr, int i5, int i10) throws IOException;

    public abstract void zzc(int i5) throws IOException;

    public abstract void zzc(int i5, int i10) throws IOException;

    public abstract void zzd(int i5, int i10) throws IOException;

    public final void zzk(int i5, int i10) throws IOException {
        zzd(i5, zzl(i10));
    }

    private zzjc() {
    }

    public static int zza(float f10) {
        return 4;
    }

    public static int zzb(zzik zzikVar) {
        int iZzb = zzikVar.zzb();
        return zzj(iZzb) + iZzb;
    }

    public static int zzd(int i5, long j8) {
        return zzg(j8) + zzj(i5 << 3);
    }

    public static int zze(long j8) {
        return 8;
    }

    public static int zzf(int i5) {
        return zzg(i5);
    }

    public static int zzg(int i5, int i10) {
        return zzg(i10) + zzj(i5 << 3);
    }

    public static int zzh(int i5) {
        return zzj(zzl(i5));
    }

    public static int zzi(int i5, int i10) {
        return zzj(zzl(i10)) + zzj(i5 << 3);
    }

    public final void zzk(int i5) throws IOException {
        zzc(zzl(i5));
    }

    public static int zza(boolean z2) {
        return 1;
    }

    public static int zzc(int i5, zzik zzikVar) {
        int iZzj = zzj(i5 << 3);
        int iZzb = zzikVar.zzb();
        return zzj(iZzb) + iZzb + iZzj;
    }

    public static int zze(int i5, int i10) {
        return zzg(i10) + zzj(i5 << 3);
    }

    public static int zzf(int i5, long j8) {
        return zzg(zzi(j8)) + zzj(i5 << 3);
    }

    public static int zzj(int i5) {
        return (352 - (Integer.numberOfLeadingZeros(i5) * 9)) >>> 6;
    }

    public final void zzh(int i5, long j8) throws IOException {
        zzb(i5, zzi(j8));
    }

    public static int zza(byte[] bArr) {
        int length = bArr.length;
        return zzj(length) + length;
    }

    @Deprecated
    public static int zzb(int i5, zzlc zzlcVar, zzlu zzluVar) {
        return ((zzib) zzlcVar).zza(zzluVar) + (zzj(i5 << 3) << 1);
    }

    public static int zzd(long j8) {
        return zzg(j8);
    }

    public static int zzg(int i5, long j8) {
        return zzg(j8) + zzj(i5 << 3);
    }

    public static int zzi(int i5) {
        return zzj(i5 << 3);
    }

    public final void zzh(long j8) throws IOException {
        zzb(zzi(j8));
    }

    public static int zzd(int i5, zzik zzikVar) {
        return zzc(3, zzikVar) + zzj(2, i5) + (zzj(8) << 1);
    }

    public static int zze(int i5, long j8) {
        return zzj(i5 << 3) + 8;
    }

    public static int zzf(long j8) {
        return zzg(zzi(j8));
    }

    public static int zza(int i5, double d3) {
        return zzj(i5 << 3) + 8;
    }

    @Deprecated
    public static int zzb(zzlc zzlcVar) {
        return zzlcVar.zzcb();
    }

    public static int zzc(int i5, long j8) {
        return zzj(i5 << 3) + 8;
    }

    public static int zzg(long j8) {
        return (640 - (Long.numberOfLeadingZeros(j8) * 9)) >>> 6;
    }

    public static int zza(int i5, float f10) {
        return zzj(i5 << 3) + 4;
    }

    public static int zzb(int i5, zzkk zzkkVar) {
        int iZzj = zzj(i5 << 3);
        int iZza = zzkkVar.zza();
        return zzj(iZza) + iZza + iZzj;
    }

    public static int zzc(int i5, zzlc zzlcVar, zzlu zzluVar) {
        return zza(zzlcVar, zzluVar) + zzj(i5 << 3);
    }

    public static int zza(int i5, zzkk zzkkVar) {
        return zzb(3, zzkkVar) + zzj(2, i5) + (zzj(8) << 1);
    }

    public static int zzc(zzlc zzlcVar) {
        int iZzcb = zzlcVar.zzcb();
        return zzj(iZzcb) + iZzcb;
    }

    public static int zzb(int i5, zzlc zzlcVar) {
        return zzc(zzlcVar) + zzj(24) + zzj(2, i5) + (zzj(8) << 1);
    }

    public static int zza(zzkk zzkkVar) {
        int iZza = zzkkVar.zza();
        return zzj(iZza) + iZza;
    }

    public static int zza(zzlc zzlcVar, zzlu zzluVar) {
        int iZza = ((zzib) zzlcVar).zza(zzluVar);
        return zzj(iZza) + iZza;
    }

    public static int zzb(int i5, String str) {
        return zzb(str) + zzj(i5 << 3);
    }

    public final void zza(String str, zzmt zzmtVar) throws IOException {
        zzb.logp(Level.WARNING, "com.google.protobuf.CodedOutputStream", "inefficientWriteStringNoTag", "Converting ill-formed UTF-16. Your Protocol Buffer will not round trip correctly!", (Throwable) zzmtVar);
        byte[] bytes = str.getBytes(zzjv.zza);
        try {
            zzc(bytes.length);
            zza(bytes, 0, bytes.length);
        } catch (IndexOutOfBoundsException e7) {
            throw new zzb(e7);
        }
    }

    public static int zzb(String str) {
        int length;
        try {
            length = zzmp.zza(str);
        } catch (zzmt unused) {
            length = str.getBytes(zzjv.zza).length;
        }
        return zzj(length) + length;
    }

    public static zzjc zzb(byte[] bArr) {
        return new zza(bArr, 0, bArr.length);
    }

    public final void zzb() {
        if (zza() != 0) {
            throw new IllegalStateException("Did not write as much data as expected.");
        }
    }

    public final void zzb(boolean z2) throws IOException {
        zza(z2 ? (byte) 1 : (byte) 0);
    }

    public final void zzb(int i5, double d3) throws IOException {
        zza(i5, Double.doubleToRawLongBits(d3));
    }

    public final void zzb(double d3) throws IOException {
        zza(Double.doubleToRawLongBits(d3));
    }

    public final void zzb(int i5, float f10) throws IOException {
        zza(i5, Float.floatToRawIntBits(f10));
    }

    public final void zzb(float f10) throws IOException {
        zza(Float.floatToRawIntBits(f10));
    }
}
