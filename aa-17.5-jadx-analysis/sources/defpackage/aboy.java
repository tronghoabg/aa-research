package defpackage;

import java.nio.charset.StandardCharsets;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* loaded from: classes.dex */
final class aboy {
    public static final /* synthetic */ int a = 0;
    private static final char[] b;

    static {
        char[] cArr = new char[80];
        b = cArr;
        Arrays.fill(cArr, ' ');
    }

    static void a(StringBuilder sb, int i, String str, Object obj) {
        if (obj instanceof List) {
            Iterator it = ((List) obj).iterator();
            while (it.hasNext()) {
                a(sb, i, str, it.next());
            }
            return;
        }
        if (obj instanceof Map) {
            Iterator it2 = ((Map) obj).entrySet().iterator();
            while (it2.hasNext()) {
                a(sb, i, str, (Map.Entry) it2.next());
            }
            return;
        }
        sb.append('\n');
        c(i, sb);
        sb.append(a.D(str));
        if (!(obj instanceof String)) {
            if (obj instanceof abms) {
                sb.append(": \"");
                sb.append(abps.a((abms) obj));
                sb.append('\"');
                return;
            }
            if (obj instanceof abnv) {
                sb.append(" {");
                b((abnv) obj, sb, i + 2);
                sb.append("\n");
                c(i, sb);
                sb.append("}");
                return;
            }
            if (!(obj instanceof Map.Entry)) {
                sb.append(": ");
                sb.append(obj);
                return;
            }
            int i2 = i + 2;
            sb.append(" {");
            Map.Entry entry = (Map.Entry) obj;
            a(sb, i2, "key", entry.getKey());
            a(sb, i2, "value", entry.getValue());
            sb.append("\n");
            c(i, sb);
            sb.append("}");
            return;
        }
        sb.append(": \"");
        String string = (String) obj;
        String[] strArr = abps.a;
        int length = string.length();
        int i3 = 0;
        StringBuilder sb2 = null;
        int i4 = 0;
        while (true) {
            if (i3 < length) {
                char cCharAt = string.charAt(i3);
                if (cCharAt > 127) {
                    string = abps.b(string.getBytes(StandardCharsets.UTF_8));
                    break;
                }
                int i5 = i3 + 1;
                String str2 = abps.a[cCharAt];
                if (str2 != null) {
                    if (sb2 == null) {
                        sb2 = new StringBuilder(length + 16);
                    }
                    if (i4 < i3) {
                        sb2.append((CharSequence) string, i4, i3);
                    }
                    sb2.append(str2);
                    i4 = i5;
                }
                i3 = i5;
            } else if (sb2 != null) {
                if (i4 < length) {
                    sb2.append((CharSequence) string, i4, length);
                }
                string = sb2.toString();
            }
        }
        sb.append(string);
        sb.append('\"');
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x01ff  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0192  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void b(defpackage.abow r19, java.lang.StringBuilder r20, int r21) {
        /*
            Method dump skipped, instructions count: 627
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.aboy.b(abow, java.lang.StringBuilder, int):void");
    }

    private static void c(int i, StringBuilder sb) {
        while (i > 0) {
            int i2 = 80;
            if (i <= 80) {
                i2 = i;
            }
            sb.append(b, 0, i2);
            i -= i2;
        }
    }
}
