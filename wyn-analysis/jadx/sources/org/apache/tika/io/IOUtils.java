package org.apache.tika.io;

import A7.AbstractC0279p0;
import java.io.IOException;
import java.io.InputStream;

/* loaded from: classes5.dex */
public class IOUtils {
    public static long skip(InputStream inputStream, long j8, byte[] bArr) throws IOException {
        if (j8 < 0) {
            throw new IllegalArgumentException(AbstractC0279p0.k(j8, "Skip count must be non-negative, actual: "));
        }
        long j10 = j8;
        while (j10 > 0) {
            long j11 = inputStream.read(bArr, 0, (int) Math.min(j10, bArr.length));
            if (j11 < 0) {
                break;
            }
            j10 -= j11;
        }
        return j8 - j10;
    }
}
