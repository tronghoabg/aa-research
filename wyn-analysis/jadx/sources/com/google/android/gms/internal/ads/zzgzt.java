package com.google.android.gms.internal.ads;

import com.applovin.shadow.okio.Segment;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Queue;

/* loaded from: classes3.dex */
public final class zzgzt {
    public static final /* synthetic */ int zza = 0;

    static {
        new zzgzr();
    }

    public static byte[] zza(InputStream inputStream) throws IOException {
        inputStream.getClass();
        ArrayDeque arrayDeque = new ArrayDeque(20);
        int iHighestOneBit = Integer.highestOneBit(0);
        int iMin = Math.min(Segment.SIZE, Math.max(128, iHighestOneBit + iHighestOneBit));
        int i5 = 0;
        while (i5 < 2147483639) {
            int iMin2 = Math.min(iMin, 2147483639 - i5);
            byte[] bArr = new byte[iMin2];
            arrayDeque.add(bArr);
            int i10 = 0;
            while (i10 < iMin2) {
                int i11 = inputStream.read(bArr, i10, iMin2 - i10);
                if (i11 == -1) {
                    return zzc(arrayDeque, i5);
                }
                i10 += i11;
                i5 += i11;
            }
            iMin = zzhaq.zzb(iMin * (iMin < 4096 ? 4 : 2));
        }
        if (inputStream.read() == -1) {
            return zzc(arrayDeque, 2147483639);
        }
        throw new OutOfMemoryError("input is too large to fit in a byte array");
    }

    public static InputStream zzb(InputStream inputStream, long j8) {
        return new zzgzs(inputStream, j8);
    }

    private static byte[] zzc(Queue queue, int i5) {
        if (queue.isEmpty()) {
            return new byte[0];
        }
        byte[] bArr = (byte[]) queue.remove();
        int length = bArr.length;
        if (length == i5) {
            return bArr;
        }
        byte[] bArrCopyOf = Arrays.copyOf(bArr, i5);
        int i10 = i5 - length;
        while (i10 > 0) {
            byte[] bArr2 = (byte[]) queue.remove();
            int iMin = Math.min(i10, bArr2.length);
            System.arraycopy(bArr2, 0, bArrCopyOf, i5 - i10, iMin);
            i10 -= iMin;
        }
        return bArrCopyOf;
    }
}
