package com.google.android.gms.internal.ads;

import java.nio.ByteBuffer;
import org.apache.tika.fork.ForkServer;
import org.apache.tika.pipes.PipesConfigBase;

/* loaded from: classes3.dex */
public final class zzuc extends zzcq {
    private int zzd;
    private boolean zze;
    private int zzf;
    private long zzg;
    private byte[] zzi;
    private byte[] zzl;
    private int zzh = 0;
    private int zzj = 0;
    private int zzk = 0;

    public zzuc() {
        byte[] bArr = zzfm.zzb;
        this.zzi = bArr;
        this.zzl = bArr;
    }

    private final void zzs(boolean z2) {
        int i5;
        int length;
        int i10 = this.zzk;
        int length2 = this.zzi.length;
        if (i10 != length2) {
            if (!z2) {
                return;
            } else {
                z2 = true;
            }
        }
        if (this.zzh == 0) {
            if (z2) {
                zzu(i10, 3);
                length = i10;
            } else {
                zzgtr.zzi(i10 >= (length2 >> 1));
                length = this.zzi.length >> 1;
                zzu(length, 0);
            }
            i5 = length;
        } else {
            int i11 = length2 >> 1;
            int i12 = i10 - i11;
            if (z2) {
                int iZzt = zzt(i12) + (this.zzi.length >> 1);
                zzu(iZzt, 2);
                int i13 = i11 + i12;
                i5 = iZzt;
                length = i13;
            } else {
                int iZzt2 = zzt(i12);
                zzu(iZzt2, 1);
                i5 = iZzt2;
                length = i12;
            }
        }
        if (length % this.zzd != 0) {
            throw new IllegalStateException(zzgui.zzd("bytesConsumed is not aligned to frame size: %s", Integer.valueOf(length)));
        }
        zzgtr.zzi(i10 >= i5);
        this.zzk -= length;
        int i14 = this.zzj + length;
        this.zzj = i14;
        this.zzj = i14 % this.zzi.length;
        this.zzh = (i5 / this.zzd) + this.zzh;
        this.zzg += (length - i5) / r1;
    }

    private final int zzt(int i5) {
        int iZzw = ((zzw(2000000L) - this.zzh) * this.zzd) - (this.zzi.length >> 1);
        zzgtr.zzi(iZzw >= 0);
        int iMin = (int) Math.min((i5 * 0.2f) + 0.5f, iZzw);
        int i10 = this.zzd;
        return (iMin / i10) * i10;
    }

    private final void zzu(int i5, int i10) {
        int i11;
        if (i5 == 0) {
            return;
        }
        zzgtr.zza(this.zzk >= i5);
        if (i10 == 2) {
            int i12 = this.zzj;
            int i13 = this.zzk;
            int i14 = i12 + i13;
            byte[] bArr = this.zzi;
            int length = bArr.length;
            if (i14 <= length) {
                System.arraycopy(bArr, i14 - i5, this.zzl, 0, i5);
            } else {
                int i15 = i13 - (length - i12);
                if (i15 >= i5) {
                    System.arraycopy(bArr, i15 - i5, this.zzl, 0, i5);
                } else {
                    int i16 = i5 - i15;
                    System.arraycopy(bArr, length - i16, this.zzl, 0, i16);
                    System.arraycopy(this.zzi, 0, this.zzl, i16, i15);
                }
            }
        } else {
            int i17 = this.zzj;
            int i18 = i17 + i5;
            byte[] bArr2 = this.zzi;
            int length2 = bArr2.length;
            if (i18 <= length2) {
                System.arraycopy(bArr2, i17, this.zzl, 0, i5);
            } else {
                int i19 = length2 - i17;
                System.arraycopy(bArr2, i17, this.zzl, 0, i19);
                System.arraycopy(this.zzi, 0, this.zzl, i19, i5 - i19);
            }
        }
        zzgtr.zzd(i5 % this.zzd == 0, "sizeToOutput is not aligned to frame size: %s", i5);
        zzgtr.zzi(this.zzj < this.zzi.length);
        byte[] bArr3 = this.zzl;
        zzgtr.zzd(i5 % this.zzd == 0, "byteOutput size is not aligned to frame size %s", i5);
        if (i10 != 3) {
            for (int i20 = 0; i20 < i5; i20 += 2) {
                int i21 = i20 + 1;
                int iZzv = zzv(bArr3[i21], bArr3[i20]);
                if (i10 == 0) {
                    i11 = ((((i20 * 1000) / (i5 - 1)) * (-90)) / 1000) + 100;
                } else {
                    i11 = 10;
                    if (i10 == 2) {
                        i11 = 10 + (((90000 * i20) / (i5 - 1)) / 1000);
                    }
                }
                int i22 = (iZzv * i11) / 100;
                if (i22 >= 32767) {
                    bArr3[i20] = -1;
                    bArr3[i21] = 127;
                } else if (i22 <= -32768) {
                    bArr3[i20] = 0;
                    bArr3[i21] = -128;
                } else {
                    bArr3[i20] = (byte) (i22 & 255);
                    bArr3[i21] = (byte) (i22 >> 8);
                }
            }
        }
        zzk(i5).put(bArr3, 0, i5).flip();
    }

    private static int zzv(byte b5, byte b10) {
        return (b5 << 8) | (b10 & ForkServer.ERROR);
    }

    private final int zzw(long j8) {
        return (int) ((j8 * this.zzb.zzb) / 1000000);
    }

    private static final boolean zzx(byte b5, byte b10) {
        return Math.abs(zzv(b5, b10)) > 1024;
    }

    @Override // com.google.android.gms.internal.ads.zzcq, com.google.android.gms.internal.ads.zzcp
    public final boolean zzc() {
        return super.zzc() && this.zze;
    }

    @Override // com.google.android.gms.internal.ads.zzcp
    public final void zzd(ByteBuffer byteBuffer) {
        int iLimit;
        int i5;
        int iPosition;
        while (byteBuffer.hasRemaining() && !zzl()) {
            if (this.zzf != 0) {
                zzgtr.zzi(this.zzj < this.zzi.length);
                int iLimit2 = byteBuffer.limit();
                int iPosition2 = byteBuffer.position() + 1;
                while (true) {
                    if (iPosition2 >= byteBuffer.limit()) {
                        iLimit = byteBuffer.limit();
                        break;
                    } else {
                        if (zzx(byteBuffer.get(iPosition2), byteBuffer.get(iPosition2 - 1))) {
                            int i10 = this.zzd;
                            iLimit = (iPosition2 / i10) * i10;
                            break;
                        }
                        iPosition2 += 2;
                    }
                }
                int iPosition3 = iLimit - byteBuffer.position();
                int i11 = this.zzj;
                int i12 = this.zzk;
                int i13 = i11 + i12;
                int length = this.zzi.length;
                if (i13 < length) {
                    i5 = length - i13;
                } else {
                    i13 = i12 - (length - i11);
                    i5 = i11 - i13;
                }
                int iMin = Math.min(iPosition3, i5);
                byteBuffer.limit(byteBuffer.position() + iMin);
                byteBuffer.get(this.zzi, i13, iMin);
                int i14 = this.zzk + iMin;
                this.zzk = i14;
                zzgtr.zzi(i14 <= this.zzi.length);
                boolean z2 = iLimit < iLimit2 && iPosition3 < i5;
                zzs(z2);
                if (z2) {
                    this.zzf = 0;
                    this.zzh = 0;
                }
                byteBuffer.limit(iLimit2);
            } else {
                int iLimit3 = byteBuffer.limit();
                byteBuffer.limit(Math.min(iLimit3, byteBuffer.position() + this.zzi.length));
                int iLimit4 = byteBuffer.limit() - 1;
                while (true) {
                    if (iLimit4 < byteBuffer.position()) {
                        iPosition = byteBuffer.position();
                        break;
                    } else {
                        if (zzx(byteBuffer.get(iLimit4), byteBuffer.get(iLimit4 - 1))) {
                            int i15 = this.zzd;
                            iPosition = ((iLimit4 / i15) * i15) + i15;
                            break;
                        }
                        iLimit4 -= 2;
                    }
                }
                if (iPosition == byteBuffer.position()) {
                    this.zzf = 1;
                } else {
                    byteBuffer.limit(Math.min(iPosition, byteBuffer.capacity()));
                    zzk(byteBuffer.remaining()).put(byteBuffer).flip();
                }
                byteBuffer.limit(iLimit3);
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcq
    public final zzcl zzm(zzcl zzclVar) throws zzco {
        if (zzclVar.zzd == 2) {
            return zzclVar.zzb == -1 ? zzcl.zza : zzclVar;
        }
        throw new zzco("Unhandled input format:", zzclVar);
    }

    @Override // com.google.android.gms.internal.ads.zzcq
    public final void zzn() {
        if (this.zzk > 0) {
            zzs(true);
            this.zzh = 0;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcq
    public final void zzo(zzcn zzcnVar) {
        if (zzc()) {
            int i5 = this.zzb.zzc;
            this.zzd = i5 + i5;
            int iZzw = zzw(PipesConfigBase.DEFAULT_MAX_FOR_EMIT_BATCH) / 2;
            int i10 = this.zzd;
            int i11 = (iZzw / i10) * i10;
            int i12 = i11 + i11;
            if (this.zzi.length != i12) {
                this.zzi = new byte[i12];
                this.zzl = new byte[i12];
            }
        }
        this.zzf = 0;
        this.zzg = 0L;
        this.zzh = 0;
        this.zzj = 0;
        this.zzk = 0;
    }

    @Override // com.google.android.gms.internal.ads.zzcq
    public final void zzp() {
        this.zze = false;
        byte[] bArr = zzfm.zzb;
        this.zzi = bArr;
        this.zzl = bArr;
    }

    public final void zzq(boolean z2) {
        this.zze = z2;
    }

    public final long zzr() {
        return this.zzg;
    }
}
