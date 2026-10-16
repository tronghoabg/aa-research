package s9;

import A7.AbstractC0279p0;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import ka.AbstractC3256n;

/* loaded from: classes4.dex */
public final class j extends e {

    /* renamed from: b, reason: collision with root package name */
    public static final j f45378b = new j(Collections.singletonList("__name__"));

    /* renamed from: c, reason: collision with root package name */
    public static final j f45379c = new j(Collections.EMPTY_LIST);

    public static j l(String str) {
        ArrayList arrayList = new ArrayList();
        StringBuilder sb2 = new StringBuilder();
        int i5 = 0;
        boolean z2 = false;
        while (i5 < str.length()) {
            char cCharAt = str.charAt(i5);
            if (cCharAt == '\\') {
                i5++;
                if (i5 == str.length()) {
                    throw new IllegalArgumentException("Trailing escape character is not allowed");
                }
                sb2.append(str.charAt(i5));
            } else if (cCharAt == '.') {
                if (z2) {
                    sb2.append(cCharAt);
                } else {
                    String string = sb2.toString();
                    if (string.isEmpty()) {
                        throw new IllegalArgumentException(AbstractC0279p0.l("Invalid field path (", str, "). Paths must not be empty, begin with '.', end with '.', or contain '..'"));
                    }
                    StringBuilder sb3 = new StringBuilder();
                    arrayList.add(string);
                    sb2 = sb3;
                }
            } else if (cCharAt == '`') {
                z2 = !z2;
            } else {
                sb2.append(cCharAt);
            }
            i5++;
        }
        String string2 = sb2.toString();
        if (string2.isEmpty()) {
            throw new IllegalArgumentException(AbstractC0279p0.l("Invalid field path (", str, "). Paths must not be empty, begin with '.', end with '.', or contain '..'"));
        }
        arrayList.add(string2);
        return new j(arrayList);
    }

    @Override // s9.e
    public final String c() {
        char cCharAt;
        StringBuilder sb2 = new StringBuilder();
        int i5 = 0;
        while (true) {
            List list = this.f45369a;
            if (i5 >= list.size()) {
                return sb2.toString();
            }
            if (i5 > 0) {
                sb2.append(".");
            }
            String strReplace = ((String) list.get(i5)).replace("\\", "\\\\").replace("`", "\\`");
            if (strReplace.isEmpty() || ((cCharAt = strReplace.charAt(0)) != '_' && ((cCharAt < 'a' || cCharAt > 'z') && (cCharAt < 'A' || cCharAt > 'Z')))) {
                strReplace = AbstractC3256n.f('`', "`", strReplace);
                break;
                break;
            }
            for (int i10 = 1; i10 < strReplace.length(); i10++) {
                char cCharAt2 = strReplace.charAt(i10);
                if (cCharAt2 != '_' && ((cCharAt2 < 'a' || cCharAt2 > 'z') && ((cCharAt2 < 'A' || cCharAt2 > 'Z') && (cCharAt2 < '0' || cCharAt2 > '9')))) {
                    strReplace = AbstractC3256n.f('`', "`", strReplace);
                    break;
                }
            }
            sb2.append(strReplace);
            i5++;
        }
    }

    @Override // s9.e
    public final e e(List list) {
        return new j(list);
    }
}
