package com.google.v;

import com.fasterxml.jackson.core.JsonFactory;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
final class fk {

    /* renamed from: a, reason: collision with root package name */
    private static final char[] f12956a;

    static {
        char[] cArr = new char[80];
        f12956a = cArr;
        Arrays.fill(cArr, ' ');
    }

    static String a(fi fiVar, String str) throws SecurityException {
        StringBuilder sb = new StringBuilder();
        sb.append("# ");
        sb.append(str);
        d(fiVar, sb, 0);
        return sb.toString();
    }

    static void b(StringBuilder sb, int i2, String str, Object obj) {
        String strReplace;
        if (obj instanceof List) {
            Iterator it = ((List) obj).iterator();
            while (it.hasNext()) {
                b(sb, i2, str, it.next());
            }
            return;
        }
        if (obj instanceof Map) {
            Iterator it2 = ((Map) obj).entrySet().iterator();
            while (it2.hasNext()) {
                b(sb, i2, str, (Map.Entry) it2.next());
            }
            return;
        }
        sb.append('\n');
        c(i2, sb);
        if (!str.isEmpty()) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append(Character.toLowerCase(str.charAt(0)));
            for (int i3 = 1; i3 < str.length(); i3++) {
                char cCharAt = str.charAt(i3);
                if (Character.isUpperCase(cCharAt)) {
                    sb2.append("_");
                }
                sb2.append(Character.toLowerCase(cCharAt));
            }
            str = sb2.toString();
        }
        sb.append(str);
        if (!(obj instanceof String)) {
            if (obj instanceof v) {
                sb.append(": \"");
                sb.append(dc.g((v) obj));
                sb.append(JsonFactory.DEFAULT_QUOTE_CHAR);
                return;
            }
            if (obj instanceof du) {
                sb.append(" {");
                d((du) obj, sb, i2 + 2);
                sb.append("\n");
                c(i2, sb);
                sb.append("}");
                return;
            }
            if (!(obj instanceof Map.Entry)) {
                sb.append(": ");
                sb.append(obj);
                return;
            }
            int i4 = i2 + 2;
            sb.append(" {");
            Map.Entry entry = (Map.Entry) obj;
            b(sb, i4, "key", entry.getKey());
            b(sb, i4, "value", entry.getValue());
            sb.append("\n");
            c(i2, sb);
            sb.append("}");
            return;
        }
        sb.append(": \"");
        String strReplace2 = (String) obj;
        boolean z = false;
        boolean z2 = false;
        boolean z3 = false;
        for (int i5 = 0; i5 < strReplace2.length(); i5++) {
            char cCharAt2 = strReplace2.charAt(i5);
            if (cCharAt2 < ' ' || cCharAt2 > '~') {
                strReplace = dc.h(strReplace2.getBytes(StandardCharsets.UTF_8));
                break;
            }
            if (cCharAt2 == '\"') {
                z3 = true;
            } else if (cCharAt2 == '\'') {
                z2 = true;
            } else if (cCharAt2 == '\\') {
                z = true;
            }
        }
        if (z) {
            strReplace2 = strReplace2.replace("\\", "\\\\");
        }
        strReplace = z2 ? strReplace2.replace("'", "\\'") : strReplace2;
        if (z3) {
            strReplace = strReplace.replace("\"", "\\\"");
        }
        sb.append(strReplace);
        sb.append(JsonFactory.DEFAULT_QUOTE_CHAR);
    }

    private static void c(int i2, StringBuilder sb) {
        while (i2 > 0) {
            int i3 = 80;
            if (i2 <= 80) {
                i3 = i2;
            }
            sb.append(f12956a, 0, i3);
            i2 -= i3;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:65:0x0188  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x01f5  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static void d(com.google.v.fi r18, java.lang.StringBuilder r19, int r20) throws java.lang.SecurityException {
        /*
            Method dump skipped, instructions count: 593
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.v.fk.d(com.google.v.fi, java.lang.StringBuilder, int):void");
    }
}
