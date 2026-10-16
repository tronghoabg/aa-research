package X2;

import Q1.o;
import Va.M6;
import android.text.TextUtils;
import j$.util.DesugarCollections;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* loaded from: classes.dex */
public abstract class i {

    /* renamed from: a, reason: collision with root package name */
    public static final Pattern f16069a = Pattern.compile("^(\\S+)\\s+-->\\s+(\\S+)(.*)?$");

    /* renamed from: b, reason: collision with root package name */
    public static final Pattern f16070b = Pattern.compile("(\\S+?):(\\S+)");

    /* renamed from: c, reason: collision with root package name */
    public static final Map f16071c;

    /* renamed from: d, reason: collision with root package name */
    public static final Map f16072d;

    static {
        HashMap map = new HashMap();
        M6.w(255, 255, 255, map, "white");
        M6.w(0, 255, 0, map, "lime");
        M6.w(0, 255, 255, map, "cyan");
        M6.w(255, 0, 0, map, "red");
        M6.w(255, 255, 0, map, "yellow");
        M6.w(255, 0, 255, map, "magenta");
        M6.w(0, 0, 255, map, "blue");
        M6.w(0, 0, 0, map, "black");
        f16071c = DesugarCollections.unmodifiableMap(map);
        HashMap map2 = new HashMap();
        M6.w(255, 255, 255, map2, "bg_white");
        M6.w(0, 255, 0, map2, "bg_lime");
        M6.w(0, 255, 255, map2, "bg_cyan");
        M6.w(255, 0, 0, map2, "bg_red");
        M6.w(255, 255, 0, map2, "bg_yellow");
        M6.w(255, 0, 255, map2, "bg_magenta");
        M6.w(0, 0, 255, map2, "bg_blue");
        M6.w(0, 0, 0, map2, "bg_black");
        f16072d = DesugarCollections.unmodifiableMap(map2);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:4:0x001e  */
    /* JADX WARN: Type inference failed for: r4v21 */
    /* JADX WARN: Type inference failed for: r4v3 */
    /* JADX WARN: Type inference failed for: r4v5 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void a(java.lang.String r19, X2.f r20, java.util.List r21, android.text.SpannableStringBuilder r22, java.util.List r23) {
        /*
            Method dump skipped, instructions count: 652
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X2.i.a(java.lang.String, X2.f, java.util.List, android.text.SpannableStringBuilder, java.util.List):void");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0069  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.util.ArrayList b(java.util.List r8, java.lang.String r9, X2.f r10) {
        /*
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r1 = 0
            r2 = r1
        L7:
            int r3 = r8.size()
            if (r2 >= r3) goto L77
            java.lang.Object r3 = r8.get(r2)
            X2.c r3 = (X2.c) r3
            java.lang.String r4 = r10.f16053a
            java.lang.String r5 = r3.f16031a
            boolean r5 = r5.isEmpty()
            if (r5 == 0) goto L3a
            java.lang.String r5 = r3.f16032b
            boolean r5 = r5.isEmpty()
            if (r5 == 0) goto L3a
            java.util.Set r5 = r3.f16033c
            boolean r5 = r5.isEmpty()
            if (r5 == 0) goto L3a
            java.lang.String r5 = r3.f16034d
            boolean r5 = r5.isEmpty()
            if (r5 == 0) goto L3a
            boolean r4 = android.text.TextUtils.isEmpty(r4)
            goto L6a
        L3a:
            java.lang.String r5 = r3.f16031a
            r6 = 1073741824(0x40000000, float:2.0)
            int r5 = X2.c.a(r1, r6, r5, r9)
            java.lang.String r6 = r3.f16032b
            r7 = 2
            int r4 = X2.c.a(r5, r7, r6, r4)
            java.lang.String r5 = r3.f16034d
            java.lang.String r6 = r10.f16055c
            r7 = 4
            int r4 = X2.c.a(r4, r7, r5, r6)
            r5 = -1
            if (r4 == r5) goto L69
            java.util.Set r5 = r3.f16033c
            java.util.Set r6 = r10.f16056d
            boolean r5 = r6.containsAll(r5)
            if (r5 != 0) goto L60
            goto L69
        L60:
            java.util.Set r5 = r3.f16033c
            int r5 = r5.size()
            int r5 = r5 * r7
            int r4 = r4 + r5
            goto L6a
        L69:
            r4 = r1
        L6a:
            if (r4 <= 0) goto L74
            X2.g r5 = new X2.g
            r5.<init>(r4, r3)
            r0.add(r5)
        L74:
            int r2 = r2 + 1
            goto L7
        L77:
            java.util.Collections.sort(r0)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X2.i.b(java.util.List, java.lang.String, X2.f):java.util.ArrayList");
    }

    public static int c(List list, String str, f fVar) {
        ArrayList arrayListB = b(list, str, fVar);
        for (int i5 = 0; i5 < arrayListB.size(); i5++) {
            int i10 = ((g) arrayListB.get(i5)).f16058b.f16045p;
            if (i10 != -1) {
                return i10;
            }
        }
        return -1;
    }

    public static d d(String str, Matcher matcher, o oVar, ArrayList arrayList) {
        h hVar = new h();
        try {
            String strGroup = matcher.group(1);
            strGroup.getClass();
            hVar.f16059a = k.c(strGroup);
            String strGroup2 = matcher.group(2);
            strGroup2.getClass();
            hVar.f16060b = k.c(strGroup2);
            String strGroup3 = matcher.group(3);
            strGroup3.getClass();
            e(strGroup3, hVar);
            StringBuilder sb2 = new StringBuilder();
            oVar.getClass();
            String strI = oVar.i(StandardCharsets.UTF_8);
            while (!TextUtils.isEmpty(strI)) {
                if (sb2.length() > 0) {
                    sb2.append("\n");
                }
                sb2.append(strI.trim());
                strI = oVar.i(StandardCharsets.UTF_8);
            }
            hVar.f16061c = f(str, sb2.toString(), arrayList);
            return new d(hVar.a().a(), hVar.f16059a, hVar.f16060b);
        } catch (NumberFormatException unused) {
            Q1.k.w("WebvttCueParser", "Skipping cue with bad header: " + matcher.group());
            return null;
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0048  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00be  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void e(java.lang.String r18, X2.h r19) {
        /*
            Method dump skipped, instructions count: 480
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X2.i.e(java.lang.String, X2.h):void");
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to find 'out' block for switch in B:69:0x0105. Please report as an issue. */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:101:0x01b5  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00a9  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static android.text.SpannedString f(java.lang.String r18, java.lang.String r19, java.util.List r20) {
        /*
            Method dump skipped, instructions count: 660
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X2.i.f(java.lang.String, java.lang.String, java.util.List):android.text.SpannedString");
    }

    public static void g(String str, h hVar) {
        String strSubstring;
        int i5 = 2;
        int iIndexOf = str.indexOf(44);
        if (iIndexOf != -1) {
            strSubstring = str.substring(iIndexOf + 1);
            strSubstring.getClass();
            switch (strSubstring) {
                case "center":
                case "middle":
                    i5 = 1;
                    break;
                case "end":
                    break;
                case "start":
                    i5 = 0;
                    break;
                default:
                    Q1.k.w("WebvttCueParser", "Invalid anchor value: ".concat(strSubstring));
                    i5 = Integer.MIN_VALUE;
                    break;
            }
            hVar.f16065g = i5;
            str = str.substring(0, iIndexOf);
        }
        if (str.endsWith("%")) {
            hVar.f16063e = k.b(str);
            hVar.f16064f = 0;
        } else {
            hVar.f16063e = Integer.parseInt(str);
            hVar.f16064f = 1;
        }
    }
}
