package com.google.android.gms.internal.ads;

import java.nio.ByteBuffer;
import org.apache.tika.fork.ForkServer;

/* loaded from: classes3.dex */
public final class zzuf extends zzcq {
    private static void zzq(int i5, ByteBuffer byteBuffer) {
        float f10 = (float) (i5 * 4.656612875245797E-10d);
        byteBuffer.putInt(Float.isNaN(f10) ? 0 : Float.floatToIntBits(f10));
    }

    @Override // com.google.android.gms.internal.ads.zzcp
    public final void zzd(ByteBuffer byteBuffer) {
        ByteBuffer byteBufferZzk;
        int iPosition = byteBuffer.position();
        int iLimit = byteBuffer.limit();
        int i5 = iLimit - iPosition;
        int i10 = this.zzb.zzd;
        if (i10 == 2) {
            byteBufferZzk = zzk(i5 + i5);
            while (iPosition < iLimit) {
                zzq(byteBuffer.getShort(iPosition) << 16, byteBufferZzk);
                iPosition += 2;
            }
        } else if (i10 == 3) {
            byteBufferZzk = zzk(i5 * 4);
            while (iPosition < iLimit) {
                zzq(((byteBuffer.get(iPosition) & ForkServer.ERROR) - 128) << 24, byteBufferZzk);
                iPosition++;
            }
        } else if (i10 == 21) {
            byteBufferZzk = zzk((i5 / 3) * 4);
            while (iPosition < iLimit) {
                zzq(zzhaq.zze(byteBuffer.get(iPosition + 2), byteBuffer.get(iPosition + 1), byteBuffer.get(iPosition), (byte) 0), byteBufferZzk);
                iPosition += 3;
            }
        } else if (i10 == 22) {
            byteBufferZzk = zzk(i5);
            while (iPosition < iLimit) {
                zzq(byteBuffer.getInt(iPosition), byteBufferZzk);
                iPosition += 4;
            }
        } else if (i10 == 268435456) {
            byteBufferZzk = zzk(i5 + i5);
            while (iPosition < iLimit) {
                zzq(Short.reverseBytes(byteBuffer.getShort(iPosition)) << 16, byteBufferZzk);
                iPosition += 2;
            }
        } else if (i10 == 1342177280) {
            byteBufferZzk = zzk((i5 / 3) * 4);
            while (iPosition < iLimit) {
                zzq(zzhaq.zze(byteBuffer.get(iPosition), byteBuffer.get(iPosition + 1), byteBuffer.get(iPosition + 2), (byte) 0), byteBufferZzk);
                iPosition += 3;
            }
        } else if (i10 == 1610612736) {
            byteBufferZzk = zzk(i5);
            while (iPosition < iLimit) {
                zzq(Integer.reverseBytes(byteBuffer.getInt(iPosition)), byteBufferZzk);
                iPosition += 4;
            }
        } else if (i10 == 1879048192) {
            byteBufferZzk = zzk(i5 / 2);
            while (iPosition < iLimit) {
                byteBufferZzk.putFloat((float) byteBuffer.getDouble(iPosition));
                iPosition += 8;
            }
        } else if (i10 == 1895825408) {
            byteBufferZzk = zzk(i5);
            while (iPosition < iLimit) {
                byteBufferZzk.putFloat(Float.intBitsToFloat(Integer.reverseBytes(byteBuffer.getInt(iPosition))));
                iPosition += 4;
            }
        } else {
            if (i10 != 1912602624) {
                throw new IllegalStateException();
            }
            byteBufferZzk = zzk(i5 / 2);
            while (iPosition < iLimit) {
                byteBufferZzk.putFloat((float) Double.longBitsToDouble(Long.reverseBytes(byteBuffer.getLong(iPosition))));
                iPosition += 8;
            }
        }
        byteBuffer.position(byteBuffer.limit());
        byteBufferZzk.flip();
    }

    @Override // com.google.android.gms.internal.ads.zzcq
    public final zzcl zzm(zzcl zzclVar) throws zzco {
        int i5 = zzclVar.zzd;
        if (zzfm.zzE(i5)) {
            return i5 != 4 ? new zzcl(zzclVar.zzb, zzclVar.zzc, 4) : zzcl.zza;
        }
        throw new zzco("Unhandled input format:", zzclVar);
    }
}
