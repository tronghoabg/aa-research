package k;

import androidx.compose.foundation.style.StylePropertiesKt;

/* compiled from: WazeSource */
/* loaded from: classes8.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    private static final byte[] f50742a;

    static {
        k kVar = k.f50843a;
        f50742a = okhttp3.internal.publicsuffix.a.d("ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789+/").q();
        okhttp3.internal.publicsuffix.a.d("ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789-_");
    }

    public static /* synthetic */ String a(byte[] bArr) {
        byte[] bArr2 = f50742a;
        h.g.b.x.f(bArr, "<this>");
        h.g.b.x.f(bArr2, "map");
        int length = bArr.length;
        int i2 = length + 2;
        int i3 = length - (length % 3);
        byte[] bArr3 = new byte[(i2 / 3) * 4];
        int i4 = 0;
        int i5 = 0;
        while (i4 < i3) {
            int i6 = i5 + 3;
            byte b2 = bArr[i4];
            int i7 = i4 + 2;
            byte b3 = bArr[i4 + 1];
            i4 += 3;
            byte b4 = bArr[i7];
            bArr3[i5] = bArr2[(b2 & 255) >> 2];
            bArr3[i5 + 1] = bArr2[((b2 & 3) << 4) | ((b3 & 255) >> 4)];
            bArr3[i5 + 2] = bArr2[((b3 & StylePropertiesKt.RightId) << 2) | ((b4 & 255) >> 6)];
            i5 += 4;
            bArr3[i6] = bArr2[b4 & 63];
        }
        int length2 = bArr.length - i3;
        if (length2 == 1) {
            byte b5 = bArr[i4];
            bArr3[i5] = bArr2[(b5 & 255) >> 2];
            bArr3[i5 + 1] = bArr2[(b5 & 3) << 4];
            bArr3[i5 + 2] = 61;
            bArr3[i5 + 3] = 61;
        } else if (length2 == 2) {
            int i8 = i4 + 1;
            byte b6 = bArr[i4];
            byte b7 = bArr[i8];
            bArr3[i5] = bArr2[(b6 & 255) >> 2];
            bArr3[i5 + 1] = bArr2[((b6 & 3) << 4) | ((b7 & 255) >> 4)];
            bArr3[i5 + 2] = bArr2[(b7 & StylePropertiesKt.RightId) << 2];
            bArr3[i5 + 3] = 61;
        }
        return aq.a(bArr3);
    }
}
