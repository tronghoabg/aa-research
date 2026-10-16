package defpackage;

import j$.nio.channels.DesugarChannels;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayDeque;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class ytv {
    public static final byte[] a(File file) throws Throwable {
        ytu ytuVar = new ytu();
        try {
            FileInputStream fileInputStream = new FileInputStream(file);
            ytuVar.a.addFirst(fileInputStream);
            long size = DesugarChannels.convertMaybeLegacyFileChannelFromLibrary(fileInputStream.getChannel()).size();
            int i = yts.a;
            woy.R(size >= 0, "expectedSize (%s) must be non-negative", size);
            if (size > 2147483639) {
                throw new OutOfMemoryError(size + " bytes is too large to fit in a byte array");
            }
            int i2 = (int) size;
            byte[] bArrD = new byte[i2];
            int i3 = i2;
            while (true) {
                if (i3 > 0) {
                    int i4 = i2 - i3;
                    int i5 = fileInputStream.read(bArrD, i4, i3);
                    if (i5 == -1) {
                        bArrD = Arrays.copyOf(bArrD, i4);
                        break;
                    }
                    i3 -= i5;
                } else {
                    int i6 = fileInputStream.read();
                    if (i6 != -1) {
                        ArrayDeque arrayDeque = new ArrayDeque(22);
                        arrayDeque.add(bArrD);
                        arrayDeque.add(new byte[]{(byte) i6});
                        bArrD = yts.d(fileInputStream, arrayDeque, i2 + 1);
                    }
                }
            }
            return bArrD;
        } catch (Throwable th) {
            try {
                ytuVar.b = th;
                xyg.b(th, IOException.class);
                xyg.c(th);
                throw new RuntimeException(th);
            } finally {
                ytuVar.close();
            }
        }
    }
}
