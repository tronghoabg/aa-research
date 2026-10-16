package androidx.media3.datasource;

import java.io.IOException;
import java.util.Arrays;

/* compiled from: WazeSource */
/* loaded from: classes3.dex */
public final class DataSourceUtil {
    private DataSourceUtil() {
    }

    public static void closeQuietly(DataSource dataSource) {
        if (dataSource != null) {
            try {
                dataSource.close();
            } catch (IOException unused) {
            }
        }
    }

    public static byte[] readExactly(DataSource dataSource, int i2) {
        byte[] bArr = new byte[i2];
        int i3 = 0;
        while (i3 < i2) {
            int i4 = dataSource.read(bArr, i3, i2 - i3);
            if (i4 == -1) {
                throw new IllegalStateException("Not enough data could be read: " + i3 + " < " + i2);
            }
            i3 += i4;
        }
        return bArr;
    }

    public static byte[] readToEnd(DataSource dataSource) {
        byte[] bArrCopyOf = new byte[1024];
        int i2 = 0;
        int i3 = 0;
        while (i2 != -1) {
            int length = bArrCopyOf.length;
            if (i3 == length) {
                bArrCopyOf = Arrays.copyOf(bArrCopyOf, length + length);
            }
            i2 = dataSource.read(bArrCopyOf, i3, bArrCopyOf.length - i3);
            if (i2 != -1) {
                i3 += i2;
            }
        }
        return Arrays.copyOf(bArrCopyOf, i3);
    }
}
