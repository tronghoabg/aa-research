package com.google.e.a.j;

import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
public final class q {

    /* renamed from: a, reason: collision with root package name */
    private static final Charset f8749a = Charset.forName("UTF-8");

    public static String a(byte[] bArr) {
        int length = bArr.length;
        p pVar = new p();
        int i2 = (length / 3) * 4;
        if (length % 3 > 0) {
            i2 += 4;
        }
        pVar.f8739a = new byte[i2];
        pVar.a(bArr, length);
        return new String(pVar.f8739a, StandardCharsets.US_ASCII);
    }

    public static byte[] b(String str) {
        byte[] bytes = str.getBytes(f8749a);
        int length = bytes.length;
        o oVar = new o(new byte[(length * 3) / 4]);
        if (!oVar.a(bytes, length)) {
            throw new IllegalArgumentException("bad base-64");
        }
        int i2 = oVar.f8740b;
        byte[] bArr = oVar.f8739a;
        if (i2 == bArr.length) {
            return bArr;
        }
        byte[] bArr2 = new byte[i2];
        System.arraycopy(bArr, 0, bArr2, 0, i2);
        return bArr2;
    }
}
