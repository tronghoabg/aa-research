package o8;

import java.util.Arrays;

/* renamed from: o8.c, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public abstract class AbstractC3657c {

    /* renamed from: a, reason: collision with root package name */
    public static final byte[] f41430a;

    static {
        byte[] bArr = new byte[128];
        Arrays.fill(bArr, (byte) -1);
        for (int i5 = 0; i5 < 10; i5++) {
            bArr[i5 + 48] = (byte) i5;
        }
        for (int i10 = 0; i10 < 26; i10++) {
            byte b5 = (byte) (i10 + 10);
            bArr[i10 + 65] = b5;
            bArr[i10 + 97] = b5;
        }
        f41430a = bArr;
    }
}
