package com.google.android.gms.internal.p002firebaseauthapi;

import R8.v;
import Va.M6;
import java.io.IOException;
import java.io.OutputStream;
import java.util.Locale;
import java.util.logging.Level;
import java.util.logging.Logger;

/* loaded from: classes.dex */
public abstract class zzajg extends zzaim {
    private static final Logger zza = Logger.getLogger(zzajg.class.getName());
    private static final boolean zzb = zzamp.zzc();
    zzajj zze;

    public static abstract class zza extends zzajg {
        final byte[] zza;
        final int zzb;
        int zzc;
        int zzd;

        public zza(int i5) {
            super();
            if (i5 < 0) {
                throw new IllegalArgumentException("bufferSize must be >= 0");
            }
            byte[] bArr = new byte[Math.max(i5, 20)];
            this.zza = bArr;
            this.zzb = bArr.length;
        }

        @Override // com.google.android.gms.internal.p002firebaseauthapi.zzajg
        public final int zza() {
            throw new UnsupportedOperationException("spaceLeft() can only be called on CodedOutputStreams that are writing to a flat array or ByteBuffer.");
        }

        public final void zzb(int i5) {
            if (!zzajg.zzb) {
                while ((i5 & (-128)) != 0) {
                    byte[] bArr = this.zza;
                    int i10 = this.zzc;
                    this.zzc = i10 + 1;
                    bArr[i10] = (byte) (i5 | 128);
                    this.zzd++;
                    i5 >>>= 7;
                }
                byte[] bArr2 = this.zza;
                int i11 = this.zzc;
                this.zzc = i11 + 1;
                bArr2[i11] = (byte) i5;
                this.zzd++;
                return;
            }
            long j8 = this.zzc;
            while ((i5 & (-128)) != 0) {
                byte[] bArr3 = this.zza;
                int i12 = this.zzc;
                this.zzc = i12 + 1;
                zzamp.zza(bArr3, i12, (byte) (i5 | 128));
                i5 >>>= 7;
            }
            byte[] bArr4 = this.zza;
            int i13 = this.zzc;
            this.zzc = i13 + 1;
            zzamp.zza(bArr4, i13, (byte) i5);
            this.zzd += (int) (this.zzc - j8);
        }

        public final void zza(byte b5) {
            byte[] bArr = this.zza;
            int i5 = this.zzc;
            this.zzc = i5 + 1;
            bArr[i5] = b5;
            this.zzd++;
        }

        public final void zza(int i5) {
            byte[] bArr = this.zza;
            int i10 = this.zzc;
            int i11 = i10 + 1;
            this.zzc = i11;
            bArr[i10] = (byte) i5;
            int i12 = i10 + 2;
            this.zzc = i12;
            bArr[i11] = (byte) (i5 >> 8);
            int i13 = i10 + 3;
            this.zzc = i13;
            bArr[i12] = (byte) (i5 >> 16);
            this.zzc = i10 + 4;
            bArr[i13] = (byte) (i5 >>> 24);
            this.zzd += 4;
        }

        public final void zza(long j8) {
            byte[] bArr = this.zza;
            int i5 = this.zzc;
            int i10 = i5 + 1;
            this.zzc = i10;
            bArr[i5] = (byte) (j8 & 255);
            int i11 = i5 + 2;
            this.zzc = i11;
            bArr[i10] = (byte) ((j8 >> 8) & 255);
            int i12 = i5 + 3;
            this.zzc = i12;
            bArr[i11] = (byte) ((j8 >> 16) & 255);
            int i13 = i5 + 4;
            this.zzc = i13;
            bArr[i12] = (byte) (255 & (j8 >> 24));
            int i14 = i5 + 5;
            this.zzc = i14;
            bArr[i13] = (byte) (j8 >> 32);
            int i15 = i5 + 6;
            this.zzc = i15;
            bArr[i14] = (byte) (j8 >> 40);
            int i16 = i5 + 7;
            this.zzc = i16;
            bArr[i15] = (byte) (j8 >> 48);
            this.zzc = i5 + 8;
            bArr[i16] = (byte) (j8 >> 56);
            this.zzd += 8;
        }

        public final void zzb(long j8) {
            if (zzajg.zzb) {
                long j10 = this.zzc;
                while ((j8 & (-128)) != 0) {
                    byte[] bArr = this.zza;
                    int i5 = this.zzc;
                    this.zzc = i5 + 1;
                    zzamp.zza(bArr, i5, (byte) (((int) j8) | 128));
                    j8 >>>= 7;
                }
                byte[] bArr2 = this.zza;
                int i10 = this.zzc;
                this.zzc = i10 + 1;
                zzamp.zza(bArr2, i10, (byte) j8);
                this.zzd += (int) (this.zzc - j10);
                return;
            }
            while ((j8 & (-128)) != 0) {
                byte[] bArr3 = this.zza;
                int i11 = this.zzc;
                this.zzc = i11 + 1;
                bArr3[i11] = (byte) (((int) j8) | 128);
                this.zzd++;
                j8 >>>= 7;
            }
            byte[] bArr4 = this.zza;
            int i12 = this.zzc;
            this.zzc = i12 + 1;
            bArr4[i12] = (byte) j8;
            this.zzd++;
        }

        public final void zza(int i5, int i10) {
            zzb((i5 << 3) | i10);
        }
    }

    public static class zzb extends IOException {
        public zzb() {
            super("CodedOutputStream was writing to a flat byte array and ran out of space.");
        }

        public zzb(Throwable th) {
            super("CodedOutputStream was writing to a flat byte array and ran out of space.", th);
        }

        private zzb(String str, Throwable th) {
            super(v.f("CodedOutputStream was writing to a flat byte array and ran out of space.: ", str), th);
        }

        public zzb(int i5, int i10, int i11, Throwable th) {
            this(i5, i10, i11, th);
        }

        /* JADX WARN: Illegal instructions before constructor call */
        private zzb(long j8, long j10, int i5, Throwable th) {
            Locale locale = Locale.US;
            StringBuilder sbU = M6.u(j8, "Pos: ", ", limit: ");
            sbU.append(j10);
            sbU.append(", len: ");
            sbU.append(i5);
            this(sbU.toString(), th);
        }
    }

    public static class zzc extends zzajg {
        private final byte[] zza;
        private final int zzb;
        private int zzc;

        public zzc(byte[] bArr, int i5, int i10) {
            super();
            if (bArr == null) {
                throw new NullPointerException("buffer");
            }
            if (((bArr.length - i10) | i10) < 0) {
                Locale locale = Locale.US;
                throw new IllegalArgumentException(v.e(bArr.length, i10, "Array range is invalid. Buffer.length=", ", offset=0, length="));
            }
            this.zza = bArr;
            this.zzc = 0;
            this.zzb = i10;
        }

        @Override // com.google.android.gms.internal.p002firebaseauthapi.zzajg
        public final int zza() {
            return this.zzb - this.zzc;
        }

        @Override // com.google.android.gms.internal.p002firebaseauthapi.zzajg
        public final void zzb(byte b5) throws IOException {
            int i5 = this.zzc;
            try {
                int i10 = i5 + 1;
                try {
                    this.zza[i5] = b5;
                    this.zzc = i10;
                } catch (IndexOutOfBoundsException e7) {
                    e = e7;
                    i5 = i10;
                    throw new zzb(i5, this.zzb, 1, (Throwable) e);
                }
            } catch (IndexOutOfBoundsException e10) {
                e = e10;
            }
        }

        @Override // com.google.android.gms.internal.p002firebaseauthapi.zzajg
        public final void zzc() {
        }

        @Override // com.google.android.gms.internal.p002firebaseauthapi.zzajg
        public final void zzd(int i5, zzaip zzaipVar) throws IOException {
            zzk(1, 3);
            zzl(2, i5);
            zzc(3, zzaipVar);
            zzk(1, 4);
        }

        @Override // com.google.android.gms.internal.p002firebaseauthapi.zzajg
        public final void zzf(int i5, long j8) throws IOException {
            zzk(i5, 1);
            zzh(j8);
        }

        @Override // com.google.android.gms.internal.p002firebaseauthapi.zzajg
        public final void zzh(int i5, int i10) throws IOException {
            zzk(i5, 5);
            zzk(i10);
        }

        @Override // com.google.android.gms.internal.p002firebaseauthapi.zzajg
        public final void zzi(int i5, int i10) throws IOException {
            zzk(i5, 0);
            zzl(i10);
        }

        @Override // com.google.android.gms.internal.p002firebaseauthapi.zzajg
        public final void zzj(long j8) throws IOException {
            if (zzajg.zzb && zza() >= 10) {
                while ((j8 & (-128)) != 0) {
                    byte[] bArr = this.zza;
                    int i5 = this.zzc;
                    this.zzc = i5 + 1;
                    zzamp.zza(bArr, i5, (byte) (((int) j8) | 128));
                    j8 >>>= 7;
                }
                byte[] bArr2 = this.zza;
                int i10 = this.zzc;
                this.zzc = i10 + 1;
                zzamp.zza(bArr2, i10, (byte) j8);
                return;
            }
            while ((j8 & (-128)) != 0) {
                try {
                    byte[] bArr3 = this.zza;
                    int i11 = this.zzc;
                    this.zzc = i11 + 1;
                    bArr3[i11] = (byte) (((int) j8) | 128);
                    j8 >>>= 7;
                } catch (IndexOutOfBoundsException e7) {
                    throw new zzb(this.zzc, this.zzb, 1, (Throwable) e7);
                }
            }
            byte[] bArr4 = this.zza;
            int i12 = this.zzc;
            this.zzc = i12 + 1;
            bArr4[i12] = (byte) j8;
        }

        @Override // com.google.android.gms.internal.p002firebaseauthapi.zzajg
        public final void zzk(int i5) throws IOException {
            int i10 = this.zzc;
            try {
                byte[] bArr = this.zza;
                bArr[i10] = (byte) i5;
                bArr[i10 + 1] = (byte) (i5 >> 8);
                bArr[i10 + 2] = (byte) (i5 >> 16);
                bArr[i10 + 3] = (byte) (i5 >>> 24);
                this.zzc = i10 + 4;
            } catch (IndexOutOfBoundsException e7) {
                throw new zzb(i10, this.zzb, 4, (Throwable) e7);
            }
        }

        @Override // com.google.android.gms.internal.p002firebaseauthapi.zzajg
        public final void zzl(int i5) throws IOException {
            if (i5 >= 0) {
                zzn(i5);
            } else {
                zzj(i5);
            }
        }

        @Override // com.google.android.gms.internal.p002firebaseauthapi.zzajg
        public final void zzn(int i5) throws IOException {
            while ((i5 & (-128)) != 0) {
                try {
                    byte[] bArr = this.zza;
                    int i10 = this.zzc;
                    this.zzc = i10 + 1;
                    bArr[i10] = (byte) (i5 | 128);
                    i5 >>>= 7;
                } catch (IndexOutOfBoundsException e7) {
                    throw new zzb(this.zzc, this.zzb, 1, (Throwable) e7);
                }
            }
            byte[] bArr2 = this.zza;
            int i11 = this.zzc;
            this.zzc = i11 + 1;
            bArr2[i11] = (byte) i5;
        }

        private final void zzc(byte[] bArr, int i5, int i10) throws IOException {
            try {
                System.arraycopy(bArr, i5, this.zza, this.zzc, i10);
                this.zzc += i10;
            } catch (IndexOutOfBoundsException e7) {
                throw new zzb(this.zzc, this.zzb, i10, (Throwable) e7);
            }
        }

        @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaim
        public final void zza(byte[] bArr, int i5, int i10) throws IOException {
            zzc(bArr, i5, i10);
        }

        @Override // com.google.android.gms.internal.p002firebaseauthapi.zzajg
        public final void zzh(long j8) throws IOException {
            int i5 = this.zzc;
            try {
                byte[] bArr = this.zza;
                bArr[i5] = (byte) j8;
                bArr[i5 + 1] = (byte) (j8 >> 8);
                bArr[i5 + 2] = (byte) (j8 >> 16);
                bArr[i5 + 3] = (byte) (j8 >> 24);
                bArr[i5 + 4] = (byte) (j8 >> 32);
                bArr[i5 + 5] = (byte) (j8 >> 40);
                bArr[i5 + 6] = (byte) (j8 >> 48);
                bArr[i5 + 7] = (byte) (j8 >> 56);
                this.zzc = i5 + 8;
            } catch (IndexOutOfBoundsException e7) {
                throw new zzb(i5, this.zzb, 8, (Throwable) e7);
            }
        }

        @Override // com.google.android.gms.internal.p002firebaseauthapi.zzajg
        public final void zzl(int i5, int i10) throws IOException {
            zzk(i5, 0);
            zzn(i10);
        }

        @Override // com.google.android.gms.internal.p002firebaseauthapi.zzajg
        public final void zzb(int i5, boolean z2) throws IOException {
            zzk(i5, 0);
            zzb(z2 ? (byte) 1 : (byte) 0);
        }

        @Override // com.google.android.gms.internal.p002firebaseauthapi.zzajg
        public final void zzc(int i5, zzaip zzaipVar) throws IOException {
            zzk(i5, 2);
            zzb(zzaipVar);
        }

        @Override // com.google.android.gms.internal.p002firebaseauthapi.zzajg
        public final void zzb(byte[] bArr, int i5, int i10) throws IOException {
            zzn(i10);
            zzc(bArr, 0, i10);
        }

        @Override // com.google.android.gms.internal.p002firebaseauthapi.zzajg
        public final void zzc(int i5, zzalc zzalcVar, zzalv zzalvVar) throws IOException {
            zzk(i5, 2);
            zzn(((zzaif) zzalcVar).zza(zzalvVar));
            zzalvVar.zza((zzalv) zzalcVar, (zzanf) this.zze);
        }

        @Override // com.google.android.gms.internal.p002firebaseauthapi.zzajg
        public final void zzk(int i5, int i10) throws IOException {
            zzn((i5 << 3) | i10);
        }

        @Override // com.google.android.gms.internal.p002firebaseauthapi.zzajg
        public final void zzb(zzaip zzaipVar) throws IOException {
            zzn(zzaipVar.zzb());
            zzaipVar.zza(this);
        }

        @Override // com.google.android.gms.internal.p002firebaseauthapi.zzajg
        public final void zzc(zzalc zzalcVar) throws IOException {
            zzn(zzalcVar.zzl());
            zzalcVar.zza(this);
        }

        @Override // com.google.android.gms.internal.p002firebaseauthapi.zzajg
        public final void zzb(zzalc zzalcVar, zzalv zzalvVar) throws IOException {
            zzn(((zzaif) zzalcVar).zza(zzalvVar));
            zzalvVar.zza((zzalv) zzalcVar, (zzanf) this.zze);
        }

        @Override // com.google.android.gms.internal.p002firebaseauthapi.zzajg
        public final void zzb(int i5, zzalc zzalcVar) throws IOException {
            zzk(1, 3);
            zzl(2, i5);
            zzk(3, 2);
            zzc(zzalcVar);
            zzk(1, 4);
        }

        @Override // com.google.android.gms.internal.p002firebaseauthapi.zzajg
        public final void zzh(int i5, long j8) throws IOException {
            zzk(i5, 0);
            zzj(j8);
        }

        @Override // com.google.android.gms.internal.p002firebaseauthapi.zzajg
        public final void zzb(int i5, String str) throws IOException {
            zzk(i5, 2);
            zzb(str);
        }

        @Override // com.google.android.gms.internal.p002firebaseauthapi.zzajg
        public final void zzb(String str) throws IOException {
            int i5 = this.zzc;
            try {
                int iZzj = zzajg.zzj(str.length() * 3);
                int iZzj2 = zzajg.zzj(str.length());
                if (iZzj2 == iZzj) {
                    int i10 = i5 + iZzj2;
                    this.zzc = i10;
                    int iZza = zzamt.zza(str, this.zza, i10, zza());
                    this.zzc = i5;
                    zzn((iZza - i5) - iZzj2);
                    this.zzc = iZza;
                    return;
                }
                zzn(zzamt.zza(str));
                this.zzc = zzamt.zza(str, this.zza, this.zzc, zza());
            } catch (zzamx e7) {
                this.zzc = i5;
                zza(str, e7);
            } catch (IndexOutOfBoundsException e10) {
                throw new zzb(e10);
            }
        }
    }

    public static int zza(double d3) {
        return 8;
    }

    public static int zzb(int i5, int i10) {
        return zzg(i10) + zzj(i5 << 3);
    }

    public static int zzc(long j8) {
        return 8;
    }

    public static int zzd(int i5) {
        return 4;
    }

    public static int zze(long j8) {
        return 8;
    }

    public static int zzf(int i5) {
        if (i5 > 4096) {
            return 4096;
        }
        return i5;
    }

    public static int zzg(int i5) {
        return 4;
    }

    public static int zzh(int i5) {
        return zzj(zza(i5));
    }

    public static int zzi(int i5) {
        return zzj(i5 << 3);
    }

    public static int zzj(int i5) {
        return (352 - (Integer.numberOfLeadingZeros(i5) * 9)) >>> 6;
    }

    public abstract int zza();

    public abstract void zzb(byte b5) throws IOException;

    public abstract void zzb(int i5, zzalc zzalcVar) throws IOException;

    public abstract void zzb(int i5, String str) throws IOException;

    public abstract void zzb(int i5, boolean z2) throws IOException;

    public abstract void zzb(zzaip zzaipVar) throws IOException;

    public abstract void zzb(zzalc zzalcVar, zzalv zzalvVar) throws IOException;

    public abstract void zzb(String str) throws IOException;

    public abstract void zzb(byte[] bArr, int i5, int i10) throws IOException;

    public abstract void zzc() throws IOException;

    public abstract void zzc(int i5, zzaip zzaipVar) throws IOException;

    public abstract void zzc(int i5, zzalc zzalcVar, zzalv zzalvVar) throws IOException;

    public abstract void zzc(zzalc zzalcVar) throws IOException;

    public abstract void zzd(int i5, zzaip zzaipVar) throws IOException;

    public abstract void zzf(int i5, long j8) throws IOException;

    public abstract void zzh(int i5, int i10) throws IOException;

    public abstract void zzh(int i5, long j8) throws IOException;

    public abstract void zzh(long j8) throws IOException;

    public abstract void zzi(int i5, int i10) throws IOException;

    public abstract void zzj(long j8) throws IOException;

    public abstract void zzk(int i5) throws IOException;

    public abstract void zzk(int i5, int i10) throws IOException;

    public abstract void zzl(int i5) throws IOException;

    public abstract void zzl(int i5, int i10) throws IOException;

    public final void zzm(int i5) throws IOException {
        zzn(zza(i5));
    }

    public abstract void zzn(int i5) throws IOException;

    public static final class zzd extends zza {
        private final OutputStream zzf;

        public zzd(OutputStream outputStream, int i5) {
            super(i5);
            if (outputStream == null) {
                throw new NullPointerException("out");
            }
            this.zzf = outputStream;
        }

        private final void zze() throws IOException {
            this.zzf.write(this.zza, 0, this.zzc);
            this.zzc = 0;
        }

        private final void zzo(int i5) throws IOException {
            if (this.zzb - this.zzc < i5) {
                zze();
            }
        }

        @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaim
        public final void zza(byte[] bArr, int i5, int i10) throws IOException {
            zzc(bArr, i5, i10);
        }

        @Override // com.google.android.gms.internal.p002firebaseauthapi.zzajg
        public final void zzb(byte b5) throws IOException {
            if (this.zzc == this.zzb) {
                zze();
            }
            zza(b5);
        }

        @Override // com.google.android.gms.internal.p002firebaseauthapi.zzajg
        public final void zzc() throws IOException {
            if (this.zzc > 0) {
                zze();
            }
        }

        @Override // com.google.android.gms.internal.p002firebaseauthapi.zzajg
        public final void zzd(int i5, zzaip zzaipVar) throws IOException {
            zzk(1, 3);
            zzl(2, i5);
            zzc(3, zzaipVar);
            zzk(1, 4);
        }

        @Override // com.google.android.gms.internal.p002firebaseauthapi.zzajg
        public final void zzf(int i5, long j8) throws IOException {
            zzo(18);
            zza(i5, 1);
            zza(j8);
        }

        @Override // com.google.android.gms.internal.p002firebaseauthapi.zzajg
        public final void zzh(int i5, int i10) throws IOException {
            zzo(14);
            zza(i5, 5);
            zza(i10);
        }

        @Override // com.google.android.gms.internal.p002firebaseauthapi.zzajg
        public final void zzi(int i5, int i10) throws IOException {
            zzo(20);
            zza(i5, 0);
            if (i10 >= 0) {
                zzb(i10);
            } else {
                zzb(i10);
            }
        }

        @Override // com.google.android.gms.internal.p002firebaseauthapi.zzajg
        public final void zzj(long j8) throws IOException {
            zzo(10);
            zzb(j8);
        }

        @Override // com.google.android.gms.internal.p002firebaseauthapi.zzajg
        public final void zzk(int i5) throws IOException {
            zzo(4);
            zza(i5);
        }

        @Override // com.google.android.gms.internal.p002firebaseauthapi.zzajg
        public final void zzl(int i5) throws IOException {
            if (i5 >= 0) {
                zzn(i5);
            } else {
                zzj(i5);
            }
        }

        @Override // com.google.android.gms.internal.p002firebaseauthapi.zzajg
        public final void zzn(int i5) throws IOException {
            zzo(5);
            zzb(i5);
        }

        private final void zzc(byte[] bArr, int i5, int i10) throws IOException {
            int i11 = this.zzb;
            int i12 = this.zzc;
            if (i11 - i12 >= i10) {
                System.arraycopy(bArr, i5, this.zza, i12, i10);
                this.zzc += i10;
            } else {
                int i13 = i11 - i12;
                System.arraycopy(bArr, i5, this.zza, i12, i13);
                int i14 = i5 + i13;
                i10 -= i13;
                this.zzc = this.zzb;
                this.zzd += i13;
                zze();
                if (i10 <= this.zzb) {
                    System.arraycopy(bArr, i14, this.zza, 0, i10);
                    this.zzc = i10;
                } else {
                    this.zzf.write(bArr, i14, i10);
                }
            }
            this.zzd += i10;
        }

        @Override // com.google.android.gms.internal.p002firebaseauthapi.zzajg
        public final void zzk(int i5, int i10) throws IOException {
            zzn((i5 << 3) | i10);
        }

        @Override // com.google.android.gms.internal.p002firebaseauthapi.zzajg
        public final void zzl(int i5, int i10) throws IOException {
            zzo(20);
            zza(i5, 0);
            zzb(i10);
        }

        @Override // com.google.android.gms.internal.p002firebaseauthapi.zzajg
        public final void zzb(int i5, boolean z2) throws IOException {
            zzo(11);
            zza(i5, 0);
            zza(z2 ? (byte) 1 : (byte) 0);
        }

        @Override // com.google.android.gms.internal.p002firebaseauthapi.zzajg
        public final void zzh(long j8) throws IOException {
            zzo(8);
            zza(j8);
        }

        @Override // com.google.android.gms.internal.p002firebaseauthapi.zzajg
        public final void zzh(int i5, long j8) throws IOException {
            zzo(20);
            zza(i5, 0);
            zzb(j8);
        }

        @Override // com.google.android.gms.internal.p002firebaseauthapi.zzajg
        public final void zzb(byte[] bArr, int i5, int i10) throws IOException {
            zzn(i10);
            zzc(bArr, 0, i10);
        }

        @Override // com.google.android.gms.internal.p002firebaseauthapi.zzajg
        public final void zzb(zzaip zzaipVar) throws IOException {
            zzn(zzaipVar.zzb());
            zzaipVar.zza(this);
        }

        @Override // com.google.android.gms.internal.p002firebaseauthapi.zzajg
        public final void zzb(zzalc zzalcVar, zzalv zzalvVar) throws IOException {
            zzn(((zzaif) zzalcVar).zza(zzalvVar));
            zzalvVar.zza((zzalv) zzalcVar, (zzanf) this.zze);
        }

        @Override // com.google.android.gms.internal.p002firebaseauthapi.zzajg
        public final void zzb(int i5, zzalc zzalcVar) throws IOException {
            zzk(1, 3);
            zzl(2, i5);
            zzk(3, 2);
            zzc(zzalcVar);
            zzk(1, 4);
        }

        @Override // com.google.android.gms.internal.p002firebaseauthapi.zzajg
        public final void zzc(int i5, zzaip zzaipVar) throws IOException {
            zzk(i5, 2);
            zzb(zzaipVar);
        }

        @Override // com.google.android.gms.internal.p002firebaseauthapi.zzajg
        public final void zzc(int i5, zzalc zzalcVar, zzalv zzalvVar) throws IOException {
            zzk(i5, 2);
            zzb(zzalcVar, zzalvVar);
        }

        @Override // com.google.android.gms.internal.p002firebaseauthapi.zzajg
        public final void zzb(int i5, String str) throws IOException {
            zzk(i5, 2);
            zzb(str);
        }

        @Override // com.google.android.gms.internal.p002firebaseauthapi.zzajg
        public final void zzc(zzalc zzalcVar) throws IOException {
            zzn(zzalcVar.zzl());
            zzalcVar.zza(this);
        }

        @Override // com.google.android.gms.internal.p002firebaseauthapi.zzajg
        public final void zzb(String str) throws IOException {
            int iZza;
            try {
                int length = str.length() * 3;
                int iZzj = zzajg.zzj(length);
                int i5 = iZzj + length;
                int i10 = this.zzb;
                if (i5 > i10) {
                    byte[] bArr = new byte[length];
                    int iZza2 = zzamt.zza(str, bArr, 0, length);
                    zzn(iZza2);
                    zza(bArr, 0, iZza2);
                    return;
                }
                if (i5 > i10 - this.zzc) {
                    zze();
                }
                int iZzj2 = zzajg.zzj(str.length());
                int i11 = this.zzc;
                try {
                    if (iZzj2 == iZzj) {
                        int i12 = i11 + iZzj2;
                        this.zzc = i12;
                        int iZza3 = zzamt.zza(str, this.zza, i12, this.zzb - i12);
                        this.zzc = i11;
                        iZza = (iZza3 - i11) - iZzj2;
                        zzb(iZza);
                        this.zzc = iZza3;
                    } else {
                        iZza = zzamt.zza(str);
                        zzb(iZza);
                        this.zzc = zzamt.zza(str, this.zza, this.zzc, iZza);
                    }
                    this.zzd += iZza;
                } catch (zzamx e7) {
                    this.zzd -= this.zzc - i11;
                    this.zzc = i11;
                    throw e7;
                } catch (ArrayIndexOutOfBoundsException e10) {
                    throw new zzb(e10);
                }
            } catch (zzamx e11) {
                zza(str, e11);
            }
        }
    }

    private zzajg() {
    }

    public static int zza(float f10) {
        return 4;
    }

    public static int zzc(int i5) {
        return zzg(i5);
    }

    public static int zze(int i5) {
        return zzg(i5);
    }

    public static int zzf(int i5, int i10) {
        return zzj(zza(i10)) + zzj(i5 << 3);
    }

    public static int zzg(int i5, int i10) {
        return zzj(i10) + zzj(i5 << 3);
    }

    public final void zzi(long j8) throws IOException {
        zzj(zza(j8));
    }

    public final void zzj(int i5, int i10) throws IOException {
        zzl(i5, zza(i10));
    }

    private static int zza(int i5) {
        return (i5 >> 31) ^ (i5 << 1);
    }

    public static int zzb(int i5, long j8) {
        return zzg(j8) + zzj(i5 << 3);
    }

    public static int zzc(int i5, int i10) {
        return zzj(i5 << 3) + 4;
    }

    public static int zzd(int i5, int i10) {
        return zzg(i10) + zzj(i5 << 3);
    }

    public static int zze(int i5, int i10) {
        return zzj(i5 << 3) + 4;
    }

    public static int zza(boolean z2) {
        return 1;
    }

    public static int zzc(int i5, long j8) {
        return zzj(i5 << 3) + 8;
    }

    public static int zze(int i5, long j8) {
        return zzg(j8) + zzj(i5 << 3);
    }

    public static int zzf(long j8) {
        return zzg(zza(j8));
    }

    public static int zzg(long j8) {
        return (640 - (Long.numberOfLeadingZeros(j8) * 9)) >>> 6;
    }

    private static long zza(long j8) {
        return (j8 >> 63) ^ (j8 << 1);
    }

    public static int zzb(int i5, zzakk zzakkVar) {
        int iZzj = zzj(i5 << 3);
        int iZza = zzakkVar.zza();
        return zzj(iZza) + iZza + iZzj;
    }

    public static int zzd(long j8) {
        return zzg(j8);
    }

    public final void zzg(int i5, long j8) throws IOException {
        zzh(i5, zza(j8));
    }

    public static int zza(int i5, boolean z2) {
        return zzj(i5 << 3) + 1;
    }

    public static int zzd(int i5, long j8) {
        return zzg(zza(j8)) + zzj(i5 << 3);
    }

    public static int zza(byte[] bArr) {
        int length = bArr.length;
        return zzj(length) + length;
    }

    public static int zzb(int i5, zzalc zzalcVar, zzalv zzalvVar) {
        return zza(zzalcVar, zzalvVar) + zzj(i5 << 3);
    }

    public static int zza(int i5, zzaip zzaipVar) {
        int iZzj = zzj(i5 << 3);
        int iZzb = zzaipVar.zzb();
        return zzj(iZzb) + iZzb + iZzj;
    }

    public static int zzb(zzalc zzalcVar) {
        int iZzl = zzalcVar.zzl();
        return zzj(iZzl) + iZzl;
    }

    public static int zza(zzaip zzaipVar) {
        int iZzb = zzaipVar.zzb();
        return zzj(iZzb) + iZzb;
    }

    public static int zzb(int i5, zzaip zzaipVar) {
        return zza(3, zzaipVar) + zzg(2, i5) + (zzj(8) << 1);
    }

    public static int zza(int i5, double d3) {
        return zzj(i5 << 3) + 8;
    }

    public static int zza(int i5, long j8) {
        return zzj(i5 << 3) + 8;
    }

    public static zzajg zzb(byte[] bArr) {
        return new zzc(bArr, 0, bArr.length);
    }

    public static int zza(int i5, float f10) {
        return zzj(i5 << 3) + 4;
    }

    @Deprecated
    public static int zza(int i5, zzalc zzalcVar, zzalv zzalvVar) {
        return ((zzaif) zzalcVar).zza(zzalvVar) + (zzj(i5 << 3) << 1);
    }

    public final void zzb() {
        if (zza() != 0) {
            throw new IllegalStateException("Did not write as much data as expected.");
        }
    }

    @Deprecated
    public static int zza(zzalc zzalcVar) {
        return zzalcVar.zzl();
    }

    public final void zzb(boolean z2) throws IOException {
        zzb(z2 ? (byte) 1 : (byte) 0);
    }

    public static int zza(int i5, zzakk zzakkVar) {
        return zzb(3, zzakkVar) + zzg(2, i5) + (zzj(8) << 1);
    }

    public final void zzb(int i5, double d3) throws IOException {
        zzf(i5, Double.doubleToRawLongBits(d3));
    }

    public final void zzb(double d3) throws IOException {
        zzh(Double.doubleToRawLongBits(d3));
    }

    public final void zzb(int i5, float f10) throws IOException {
        zzh(i5, Float.floatToRawIntBits(f10));
    }

    public static int zza(zzakk zzakkVar) {
        int iZza = zzakkVar.zza();
        return zzj(iZza) + iZza;
    }

    public final void zzb(float f10) throws IOException {
        zzk(Float.floatToRawIntBits(f10));
    }

    public static int zza(int i5, zzalc zzalcVar) {
        return zzb(zzalcVar) + zzj(24) + zzg(2, i5) + (zzj(8) << 1);
    }

    public static int zza(zzalc zzalcVar, zzalv zzalvVar) {
        int iZza = ((zzaif) zzalcVar).zza(zzalvVar);
        return zzj(iZza) + iZza;
    }

    public static int zza(int i5, String str) {
        return zza(str) + zzj(i5 << 3);
    }

    public static int zza(String str) {
        int length;
        try {
            length = zzamt.zza(str);
        } catch (zzamx unused) {
            length = str.getBytes(zzakb.zza).length;
        }
        return zzj(length) + length;
    }

    public static zzajg zza(OutputStream outputStream, int i5) {
        return new zzd(outputStream, i5);
    }

    public final void zza(String str, zzamx zzamxVar) throws IOException {
        zza.logp(Level.WARNING, "com.google.protobuf.CodedOutputStream", "inefficientWriteStringNoTag", "Converting ill-formed UTF-16. Your Protocol Buffer will not round trip correctly!", (Throwable) zzamxVar);
        byte[] bytes = str.getBytes(zzakb.zza);
        try {
            zzn(bytes.length);
            zza(bytes, 0, bytes.length);
        } catch (IndexOutOfBoundsException e7) {
            throw new zzb(e7);
        }
    }
}
