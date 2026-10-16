package defpackage;

/* JADX INFO: loaded from: classes2.dex */
final class ajwr {
    public static final byte[] a;

    static {
        java.nio.charset.Charset.forName("UnicodeLittleUnmarked");
        java.nio.charset.Charset charset = defpackage.ajpx.a;
        try {
            java.security.SecureRandom.getInstance("SHA1PRNG");
        } catch (java.lang.Exception unused) {
        }
        byte[] bArrA = a("NTLMSSP");
        a = bArrA;
        a("session key to server-to-client signing key magic constant");
        a("session key to client-to-server signing key magic constant");
        a("session key to server-to-client sealing key magic constant");
        a("session key to client-to-server sealing key magic constant");
        "tls-server-end-point:".getBytes(defpackage.ajpx.b);
        defpackage.ajwq ajwqVar = new defpackage.ajwq();
        if (ajwqVar.a == null) {
            ajwqVar.a = new byte[40];
            ajwqVar.b = 0;
            if (bArrA != null) {
                for (byte b : bArrA) {
                    byte[] bArr = ajwqVar.a;
                    int i = ajwqVar.b;
                    bArr[i] = b;
                    ajwqVar.b = i + 1;
                }
            }
            ajwqVar.b(1);
            ajwqVar.b(-1576500735);
            ajwqVar.c(0);
            ajwqVar.c(0);
            ajwqVar.b(40);
            ajwqVar.c(0);
            ajwqVar.c(0);
            ajwqVar.b(40);
            ajwqVar.c(261);
            ajwqVar.b(2600);
            ajwqVar.c(3840);
        }
        byte[] bArr2 = ajwqVar.a;
        int length = bArr2.length;
        int i2 = ajwqVar.b;
        if (length > i2) {
            byte[] bArr3 = new byte[i2];
            java.lang.System.arraycopy(bArr2, 0, bArr3, 0, i2);
            ajwqVar.a = bArr3;
        }
        byte[] bArr4 = ajwqVar.a;
        boolean zA = defpackage.aguo.a(bArr4);
        int i3 = defpackage.ajps.a;
        if (zA) {
            return;
        }
        defpackage.ajps ajpsVar = new defpackage.ajps(defpackage.ajps.b);
        long length2 = ((long) ((bArr4.length + 2) / 3)) * 4;
        if (length2 <= 2147483647L) {
            ajpsVar.c(bArr4);
            return;
        }
        throw new java.lang.IllegalArgumentException("Input array too big, the output array would be bigger (" + length2 + ") than the specified maximum size of 2147483647");
    }

    private static byte[] a(java.lang.String str) {
        byte[] bytes = str.getBytes(defpackage.ajpx.b);
        int length = bytes.length;
        byte[] bArr = new byte[length + 1];
        java.lang.System.arraycopy(bytes, 0, bArr, 0, length);
        bArr[length] = 0;
        return bArr;
    }
}
