package defpackage;

import java.io.ByteArrayOutputStream;

/* loaded from: classes.dex */
public abstract class g1 {
    public static final h1 a = new h1();

    public static byte[] a(byte[] bArr) {
        int length = bArr.length;
        h1 h1Var = a;
        h1Var.getClass();
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(((length + 2) / 3) * 4);
        try {
            h1Var.a(bArr, length, byteArrayOutputStream);
            return byteArrayOutputStream.toByteArray();
        } catch (Exception e) {
            h4 h4Var = new h4("exception encoding base64 string: " + e.getMessage(), 1);
            h4Var.b = e;
            throw h4Var;
        }
    }
}
