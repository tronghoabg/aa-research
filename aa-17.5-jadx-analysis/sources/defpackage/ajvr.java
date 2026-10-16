package defpackage;

import java.nio.charset.Charset;
import java.security.SecureRandom;

/* loaded from: classes2.dex */
final class ajvr {
    public static final byte[] a;

    static {
        Charset.forName("UnicodeLittleUnmarked");
        Charset charset = ajox.a;
        try {
            SecureRandom.getInstance("SHA1PRNG");
        } catch (Exception unused) {
        }
        byte[] bArrA = a("NTLMSSP");
        a = bArrA;
        a("session key to server-to-client signing key magic constant");
        a("session key to client-to-server signing key magic constant");
        a("session key to server-to-client sealing key magic constant");
        a("session key to client-to-server sealing key magic constant");
        "tls-server-end-point:".getBytes(ajox.b);
        ajvq ajvqVar = new ajvq();
        if (ajvqVar.a == null) {
            ajvqVar.a = new byte[40];
            ajvqVar.b = 0;
            if (bArrA != null) {
                for (byte b : bArrA) {
                    byte[] bArr = ajvqVar.a;
                    int i = ajvqVar.b;
                    bArr[i] = b;
                    ajvqVar.b = i + 1;
                }
            }
            ajvqVar.b(1);
            ajvqVar.b(-1576500735);
            ajvqVar.c(0);
            ajvqVar.c(0);
            ajvqVar.b(40);
            ajvqVar.c(0);
            ajvqVar.c(0);
            ajvqVar.b(40);
            ajvqVar.c(261);
            ajvqVar.b(2600);
            ajvqVar.c(3840);
        }
        byte[] bArr2 = ajvqVar.a;
        int length = bArr2.length;
        int i2 = ajvqVar.b;
        if (length > i2) {
            byte[] bArr3 = new byte[i2];
            System.arraycopy(bArr2, 0, bArr3, 0, i2);
            ajvqVar.a = bArr3;
        }
        byte[] bArr4 = ajvqVar.a;
        boolean zA = ahfz.a(bArr4);
        int i3 = ajos.a;
        if (zA) {
            return;
        }
        ajos ajosVar = new ajos(ajos.b);
        long length2 = ((bArr4.length + 2) / 3) * 4;
        if (length2 <= 2147483647L) {
            ajosVar.c(bArr4);
            return;
        }
        throw new IllegalArgumentException("Input array too big, the output array would be bigger (" + length2 + ") than the specified maximum size of 2147483647");
    }

    private static byte[] a(String str) {
        byte[] bytes = str.getBytes(ajox.b);
        int length = bytes.length;
        byte[] bArr = new byte[length + 1];
        System.arraycopy(bytes, 0, bArr, 0, length);
        bArr[length] = 0;
        return bArr;
    }
}
