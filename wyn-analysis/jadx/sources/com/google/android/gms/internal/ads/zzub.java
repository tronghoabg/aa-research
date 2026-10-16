package com.google.android.gms.internal.ads;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.List;

/* loaded from: classes3.dex */
public final class zzub {
    private static final byte[] zza = {79, 103, 103, 83, 0, 2, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 28, -43, -59, -9, 1, 19, 79, 112, 117, 115, 72, 101, 97, 100, 1, 2, 56, 1, -128, -69, 0, 0, 0, 0, 0};
    private static final byte[] zzb = {79, 103, 103, 83, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 11, -103, 87, 83, 1, 16, 79, 112, 117, 115, 84, 97, 103, 115, 0, 0, 0, 0, 0, 0, 0, 0};
    private ByteBuffer zzc = zzcp.zza;
    private int zze = 0;
    private int zzd = 2;

    private static final void zzc(ByteBuffer byteBuffer, long j8, int i5, int i10, boolean z2) {
        byteBuffer.put((byte) 79);
        byteBuffer.put((byte) 103);
        byteBuffer.put((byte) 103);
        byteBuffer.put((byte) 83);
        byteBuffer.put((byte) 0);
        byteBuffer.put(true != z2 ? (byte) 0 : (byte) 2);
        byteBuffer.putLong(j8);
        byteBuffer.putInt(0);
        byteBuffer.putInt(i5);
        byteBuffer.putInt(0);
        byteBuffer.put(zzhau.zza(i10));
    }

    public final void zza(zzix zzixVar, List list) {
        int length;
        ByteBuffer byteBuffer;
        int i5;
        ByteBuffer byteBuffer2 = zzixVar.zzc;
        byteBuffer2.getClass();
        if (byteBuffer2.limit() - zzixVar.zzc.position() == 0) {
            return;
        }
        byte[] bArr = null;
        if (this.zzd == 2 && (list.size() == 1 || list.size() == 3)) {
            bArr = (byte[]) list.get(0);
        }
        ByteBuffer byteBuffer3 = zzixVar.zzc;
        int iPosition = byteBuffer3.position();
        int iLimit = byteBuffer3.limit();
        int i10 = iLimit - iPosition;
        int i11 = (i10 + 255) / 255;
        int i12 = i11 + 27 + i10;
        if (this.zzd == 2) {
            length = bArr != null ? bArr.length + 28 : 47;
            i12 += length + 44;
        } else {
            length = 0;
        }
        if (this.zzc.capacity() < i12) {
            this.zzc = ByteBuffer.allocate(i12).order(ByteOrder.LITTLE_ENDIAN);
        } else {
            this.zzc.clear();
        }
        ByteBuffer byteBuffer4 = this.zzc;
        if (this.zzd == 2) {
            if (bArr != null) {
                byteBuffer = byteBuffer4;
                i5 = 22;
                zzc(byteBuffer, 0L, 0, 1, true);
                int length2 = bArr.length;
                byteBuffer.put(zzhau.zza(length2));
                byteBuffer.put(bArr);
                int i13 = length2 + 28;
                byteBuffer.putInt(22, zzfm.zzL(byteBuffer.array(), byteBuffer.arrayOffset(), i13, 0));
                byteBuffer.position(i13);
            } else {
                byteBuffer = byteBuffer4;
                i5 = 22;
                byteBuffer.put(zza);
            }
            byteBuffer.put(zzb);
        } else {
            byteBuffer = byteBuffer4;
            i5 = 22;
        }
        int iZzc = this.zze + zzgx.zzc(byteBuffer3);
        this.zze = iZzc;
        int i14 = i5;
        ByteBuffer byteBuffer5 = byteBuffer;
        zzc(byteBuffer5, iZzc, this.zzd, i11, false);
        for (int i15 = 0; i15 < i11; i15++) {
            if (i10 >= 255) {
                byteBuffer5.put((byte) -1);
                i10 -= 255;
            } else {
                byteBuffer5.put((byte) i10);
                i10 = 0;
            }
        }
        while (iPosition < iLimit) {
            byteBuffer5.put(byteBuffer3.get(iPosition));
            iPosition++;
        }
        byteBuffer3.position(byteBuffer3.limit());
        byteBuffer5.flip();
        if (this.zzd == 2) {
            byteBuffer5.putInt(length + 66, zzfm.zzL(byteBuffer5.array(), byteBuffer5.arrayOffset() + length + 44, byteBuffer5.limit() - byteBuffer5.position(), 0));
        } else {
            byteBuffer5.putInt(i14, zzfm.zzL(byteBuffer5.array(), byteBuffer5.arrayOffset(), byteBuffer5.limit() - byteBuffer5.position(), 0));
        }
        this.zzd++;
        this.zzc = byteBuffer5;
        zzixVar.zza();
        zzixVar.zzj(this.zzc.remaining());
        zzixVar.zzc.put(this.zzc);
        zzixVar.zzl();
    }

    public final void zzb() {
        this.zzc = zzcp.zza;
        this.zze = 0;
        this.zzd = 2;
    }
}
