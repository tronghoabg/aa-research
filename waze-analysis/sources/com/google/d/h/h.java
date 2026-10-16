package com.google.d.h;

import com.google.d.b.an;
import com.google.d.l.j;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.ArrayDeque;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
public final class h {
    static {
        new g();
    }

    public static long a(InputStream inputStream, OutputStream outputStream) {
        an.B(outputStream);
        byte[] bArr = new byte[8192];
        long j2 = 0;
        while (true) {
            int i2 = inputStream.read(bArr);
            if (i2 == -1) {
                return j2;
            }
            outputStream.write(bArr, 0, i2);
            j2 += i2;
        }
    }

    public static byte[] b(InputStream inputStream) throws IOException {
        int i2;
        an.B(inputStream);
        ArrayDeque arrayDeque = new ArrayDeque(20);
        int iHighestOneBit = Integer.highestOneBit(0);
        int iMin = Math.min(8192, Math.max(128, iHighestOneBit + iHighestOneBit));
        int i3 = 0;
        loop0: while (true) {
            i2 = 2147483639;
            if (i3 < 2147483639) {
                int iMin2 = Math.min(iMin, 2147483639 - i3);
                byte[] bArr = new byte[iMin2];
                arrayDeque.add(bArr);
                int i4 = 0;
                while (i4 < iMin2) {
                    int i5 = inputStream.read(bArr, i4, iMin2 - i4);
                    if (i5 == -1) {
                        i2 = i3;
                        break loop0;
                    }
                    i4 += i5;
                    i3 += i5;
                }
                iMin = j.k(iMin * (iMin < 4096 ? 4 : 2));
            } else if (inputStream.read() != -1) {
                throw new OutOfMemoryError("input is too large to fit in a byte array");
            }
        }
        return com.waze.c.c.e.e(arrayDeque, i2);
    }
}
