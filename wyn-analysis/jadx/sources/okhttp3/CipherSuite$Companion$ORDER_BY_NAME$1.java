package okhttp3;

import java.util.Comparator;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC3340k;

@Metadata(d1 = {"\u0000\u0013\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u0012\u0012\u0004\u0012\u00020\u00020\u0001j\b\u0012\u0004\u0012\u00020\u0002`\u0003¨\u0006\u0004"}, d2 = {"okhttp3/CipherSuite$Companion$ORDER_BY_NAME$1", "Ljava/util/Comparator;", "", "Lkotlin/Comparator;", "okhttp"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class CipherSuite$Companion$ORDER_BY_NAME$1 implements Comparator<String> {
    @Override // java.util.Comparator
    public final int compare(String str, String str2) {
        String a5 = str;
        String b5 = str2;
        AbstractC3340k.e(a5, "a");
        AbstractC3340k.e(b5, "b");
        int iMin = Math.min(a5.length(), b5.length());
        for (int i5 = 4; i5 < iMin; i5++) {
            char cCharAt = a5.charAt(i5);
            char cCharAt2 = b5.charAt(i5);
            if (cCharAt != cCharAt2) {
                return AbstractC3340k.g(cCharAt, cCharAt2) < 0 ? -1 : 1;
            }
        }
        int length = a5.length();
        int length2 = b5.length();
        if (length != length2) {
            return length < length2 ? -1 : 1;
        }
        return 0;
    }
}
