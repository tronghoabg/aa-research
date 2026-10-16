package com.google.android.gms.internal.ads;

import java.nio.BufferUnderflowException;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes3.dex */
public final class zzgw {
    public static List zza(ByteBuffer byteBuffer) {
        int iRemaining;
        ByteBuffer byteBufferAsReadOnlyBuffer = byteBuffer.asReadOnlyBuffer();
        ArrayList arrayList = new ArrayList();
        while (byteBufferAsReadOnlyBuffer.hasRemaining()) {
            try {
                byte b5 = byteBufferAsReadOnlyBuffer.get();
                int i5 = b5 >> 3;
                if (((b5 >> 2) & 1) != 0) {
                    byteBufferAsReadOnlyBuffer.get();
                }
                if (((b5 >> 1) & 1) != 0) {
                    iRemaining = 0;
                    for (int i10 = 0; i10 < 8; i10++) {
                        byte b10 = byteBufferAsReadOnlyBuffer.get();
                        iRemaining |= (b10 & 127) << (i10 * 7);
                        if ((b10 & 128) == 0) {
                            break;
                        }
                    }
                } else {
                    iRemaining = byteBufferAsReadOnlyBuffer.remaining();
                }
                if (byteBufferAsReadOnlyBuffer.position() + iRemaining > byteBufferAsReadOnlyBuffer.limit()) {
                    break;
                }
                int i11 = i5 & 15;
                ByteBuffer byteBufferDuplicate = byteBufferAsReadOnlyBuffer.duplicate();
                byteBufferDuplicate.limit(byteBufferAsReadOnlyBuffer.position() + iRemaining);
                arrayList.add(new zzgu(i11, byteBufferDuplicate, null));
                byteBufferAsReadOnlyBuffer.position(byteBufferAsReadOnlyBuffer.position() + iRemaining);
            } catch (BufferUnderflowException unused) {
            }
        }
        return arrayList;
    }

    public static /* synthetic */ void zzb(boolean z2) throws zzgt {
        if (z2) {
            throw new zzgt(null);
        }
    }
}
