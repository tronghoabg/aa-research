package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class yva {
    public static final byte[] a(java.io.File file) throws java.lang.Throwable {
        defpackage.yuz yuzVar = new defpackage.yuz();
        try {
            java.io.FileInputStream fileInputStream = new java.io.FileInputStream(file);
            yuzVar.a.addFirst(fileInputStream);
            long size = j$.nio.channels.DesugarChannels.convertMaybeLegacyFileChannelFromLibrary(fileInputStream.getChannel()).size();
            int i = defpackage.yux.a;
            defpackage.ysr.bb(size >= 0, "expectedSize (%s) must be non-negative", size);
            if (size > 2147483639) {
                throw new java.lang.OutOfMemoryError(size + " bytes is too large to fit in a byte array");
            }
            int i2 = (int) size;
            byte[] bArrD = new byte[i2];
            int i3 = i2;
            while (i3 > 0) {
                int i4 = i2 - i3;
                int i5 = fileInputStream.read(bArrD, i4, i3);
                if (i5 == -1) {
                    bArrD = java.util.Arrays.copyOf(bArrD, i4);
                    yuzVar.close();
                    return bArrD;
                }
                i3 -= i5;
            }
            int i6 = fileInputStream.read();
            if (i6 != -1) {
                java.util.ArrayDeque arrayDeque = new java.util.ArrayDeque(22);
                arrayDeque.add(bArrD);
                arrayDeque.add(new byte[]{(byte) i6});
                bArrD = defpackage.yux.d(fileInputStream, arrayDeque, i2 + 1);
            }
            yuzVar.close();
            return bArrD;
        } catch (java.lang.Throwable th) {
            try {
                yuzVar.b = th;
                defpackage.xzm.b(th, java.io.IOException.class);
                defpackage.xzm.c(th);
                throw new java.lang.RuntimeException(th);
            } catch (java.lang.Throwable th2) {
                yuzVar.close();
                throw th2;
            }
        }
    }
}
