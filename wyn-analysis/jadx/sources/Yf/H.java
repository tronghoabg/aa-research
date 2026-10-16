package Yf;

import kotlin.jvm.internal.AbstractC3340k;

/* loaded from: classes5.dex */
public abstract class H {

    /* renamed from: a, reason: collision with root package name */
    public static final String[] f16832a;

    /* renamed from: b, reason: collision with root package name */
    public static final byte[] f16833b;

    static {
        String[] strArr = new String[93];
        for (int i5 = 0; i5 < 32; i5++) {
            strArr[i5] = "\\u" + b(i5 >> 12) + b(i5 >> 8) + b(i5 >> 4) + b(i5);
        }
        strArr[34] = "\\\"";
        strArr[92] = "\\\\";
        strArr[9] = "\\t";
        strArr[8] = "\\b";
        strArr[10] = "\\n";
        strArr[13] = "\\r";
        strArr[12] = "\\f";
        f16832a = strArr;
        byte[] bArr = new byte[93];
        for (int i10 = 0; i10 < 32; i10++) {
            bArr[i10] = 1;
        }
        bArr[34] = 34;
        bArr[92] = 92;
        bArr[9] = 116;
        bArr[8] = 98;
        bArr[10] = 110;
        bArr[13] = 114;
        bArr[12] = 102;
        f16833b = bArr;
    }

    public static final void a(String value, StringBuilder sb2) {
        AbstractC3340k.e(value, "value");
        sb2.append('\"');
        int length = value.length();
        int i5 = 0;
        for (int i10 = 0; i10 < length; i10++) {
            char cCharAt = value.charAt(i10);
            String[] strArr = f16832a;
            if (cCharAt < strArr.length && strArr[cCharAt] != null) {
                sb2.append((CharSequence) value, i5, i10);
                sb2.append(strArr[cCharAt]);
                i5 = i10 + 1;
            }
        }
        if (i5 != 0) {
            sb2.append((CharSequence) value, i5, value.length());
        } else {
            sb2.append(value);
        }
        sb2.append('\"');
    }

    public static final char b(int i5) {
        int i10 = i5 & 15;
        return (char) (i10 < 10 ? i10 + 48 : i10 + 87);
    }
}
