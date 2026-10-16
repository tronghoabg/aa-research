package defpackage;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;

@Deprecated
/* loaded from: classes2.dex */
public final class sps {
    @Deprecated
    public static byte[] a(InputStream inputStream, boolean z) throws IOException {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        byte[] bArr = new byte[1024];
        while (true) {
            try {
                int i = inputStream.read(bArr, 0, 1024);
                if (i == -1) {
                    break;
                }
                byteArrayOutputStream.write(bArr, 0, i);
            } catch (Throwable th) {
                if (z) {
                    roc.j(inputStream);
                    roc.j(byteArrayOutputStream);
                }
                throw th;
            }
        }
        if (z) {
            roc.j(inputStream);
            roc.j(byteArrayOutputStream);
        }
        return byteArrayOutputStream.toByteArray();
    }
}
