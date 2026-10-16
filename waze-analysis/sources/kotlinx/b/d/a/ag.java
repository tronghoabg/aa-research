package kotlinx.b.d.a;

import androidx.compose.foundation.style.StylePropertiesKt;
import com.fasterxml.jackson.core.JsonFactory;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class ag {

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int f51140a = 0;

    /* renamed from: b, reason: collision with root package name */
    private static final String[] f51141b;

    /* renamed from: c, reason: collision with root package name */
    private static final byte[] f51142c;

    static {
        String[] strArr = new String[93];
        for (int i2 = 0; i2 < 32; i2++) {
            strArr[i2] = "\\u" + d(i2 >> 12) + d(i2 >> 8) + d(i2 >> 4) + d(i2);
        }
        strArr[34] = "\\\"";
        strArr[92] = "\\\\";
        strArr[9] = "\\t";
        strArr[8] = "\\b";
        strArr[10] = "\\n";
        strArr[13] = "\\r";
        strArr[12] = "\\f";
        f51141b = strArr;
        byte[] bArr = new byte[93];
        for (int i3 = 0; i3 < 32; i3++) {
            bArr[i3] = 1;
        }
        bArr[34] = StylePropertiesKt.BackgroundColorId;
        bArr[92] = 92;
        bArr[9] = 116;
        bArr[8] = 98;
        bArr[10] = 110;
        bArr[13] = 114;
        bArr[12] = 102;
        f51142c = bArr;
    }

    public static final void a(StringBuilder sb, String str) {
        h.g.b.x.f(sb, "<this>");
        h.g.b.x.f(str, "value");
        sb.append(JsonFactory.DEFAULT_QUOTE_CHAR);
        String str2 = str;
        int length = str2.length();
        int i2 = 0;
        int i3 = 0;
        while (i2 < length) {
            int i4 = i2 + 1;
            char cCharAt = str.charAt(i2);
            String[] strArr = f51141b;
            int length2 = strArr.length;
            if (cCharAt < ']' && strArr[cCharAt] != null) {
                sb.append((CharSequence) str2, i3, i2);
                sb.append(strArr[cCharAt]);
                i3 = i4;
            }
            i2 = i4;
        }
        if (i3 != 0) {
            sb.append((CharSequence) str2, i3, str.length());
        } else {
            sb.append(str);
        }
        sb.append(JsonFactory.DEFAULT_QUOTE_CHAR);
    }

    public static final byte[] b() {
        return f51142c;
    }

    public static final String[] c() {
        return f51141b;
    }

    private static final char d(int i2) {
        int i3 = i2 & 15;
        return (char) (i3 < 10 ? i3 + 48 : (char) (i3 + 87));
    }
}
