package kotlin.reflect.jvm.internal.impl.metadata.jvm.deserialization;

import kotlin.jvm.internal.AbstractC3340k;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes5.dex */
public final class UtfEncodingKt {
    @NotNull
    public static final byte[] stringsToBytes(@NotNull String[] strings) {
        AbstractC3340k.e(strings, "strings");
        int length = 0;
        for (String str : strings) {
            length += str.length();
        }
        byte[] bArr = new byte[length];
        int i5 = 0;
        for (String str2 : strings) {
            int length2 = str2.length();
            int i10 = 0;
            while (i10 < length2) {
                bArr[i5] = (byte) str2.charAt(i10);
                i10++;
                i5++;
            }
        }
        return bArr;
    }
}
