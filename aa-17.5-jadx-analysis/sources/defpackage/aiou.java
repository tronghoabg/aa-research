package defpackage;

import java.util.Locale;

/* loaded from: classes3.dex */
public final class aiou {
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object a(defpackage.aiyk r5, defpackage.aiyl r6, defpackage.afck r7) throws java.lang.Throwable {
        /*
            boolean r0 = r7 instanceof defpackage.aiyw
            if (r0 == 0) goto L13
            r0 = r7
            aiyw r0 = (defpackage.aiyw) r0
            int r1 = r0.b
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.b = r1
            goto L18
        L13:
            aiyw r0 = new aiyw
            r0.<init>(r7)
        L18:
            java.lang.Object r7 = r0.a
            afcr r1 = defpackage.afcr.a
            int r2 = r0.b
            r3 = 1
            if (r2 == 0) goto L33
            if (r2 != r3) goto L2b
            affv r5 = r0.c
            defpackage.woy.dF(r7)     // Catch: java.lang.Throwable -> L29
            goto L4d
        L29:
            r6 = move-exception
            goto L52
        L2b:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L33:
            defpackage.woy.dF(r7)
            affv r7 = new affv
            r7.<init>()
            hla r2 = new hla     // Catch: java.lang.Throwable -> L4f
            r4 = 10
            r2.<init>(r6, r7, r4)     // Catch: java.lang.Throwable -> L4f
            r0.c = r7     // Catch: java.lang.Throwable -> L4f
            r0.b = r3     // Catch: java.lang.Throwable -> L4f
            java.lang.Object r5 = r5.hR(r2, r0)     // Catch: java.lang.Throwable -> L4f
            if (r5 != r1) goto L4d
            return r1
        L4d:
            r5 = 0
            return r5
        L4f:
            r5 = move-exception
            r6 = r5
            r5 = r7
        L52:
            java.lang.Object r5 = r5.a
            java.lang.Throwable r5 = (java.lang.Throwable) r5
            boolean r7 = b(r6, r5)
            if (r7 != 0) goto L8a
            afco r7 = r0.hH()
            bwi r0 = defpackage.aivh.d
            afcm r7 = r7.get(r0)
            aivh r7 = (defpackage.aivh) r7
            if (r7 == 0) goto L7b
            boolean r0 = r7.v()
            if (r0 != 0) goto L71
            goto L7b
        L71:
            java.util.concurrent.CancellationException r7 = r7.o()
            boolean r7 = b(r6, r7)
            if (r7 != 0) goto L8a
        L7b:
            if (r5 != 0) goto L7e
            return r6
        L7e:
            boolean r7 = r6 instanceof java.util.concurrent.CancellationException
            if (r7 == 0) goto L86
            defpackage.adqs.y(r5, r6)
            throw r5
        L86:
            defpackage.adqs.y(r6, r5)
            throw r6
        L8a:
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.aiou.a(aiyk, aiyl, afck):java.lang.Object");
    }

    private static final boolean b(Throwable th, Throwable th2) {
        if (th2 == null) {
            return false;
        }
        boolean z = ajbn.a;
        boolean z2 = ajbn.a;
        if (!z2 && aitz.b) {
            th2 = ajcy.c(th2);
        }
        if (!z2 && aitz.b) {
            th = ajcy.c(th);
        }
        return affa.f(th2, th);
    }

    public static final String capitalizeAsciiOnly(String str) {
        char cCharAt;
        str.getClass();
        if (str.length() == 0 || (cCharAt = str.charAt(0)) < 'a' || cCharAt >= '{') {
            return str;
        }
        StringBuilder sb = new StringBuilder(str.length());
        sb.append(Character.toUpperCase(cCharAt));
        sb.append((CharSequence) str, 1, str.length());
        return sb.toString();
    }

    public static final String decapitalizeAsciiOnly(String str) {
        char cCharAt;
        str.getClass();
        if (str.length() == 0 || (cCharAt = str.charAt(0)) < 'A' || cCharAt >= '[') {
            return str;
        }
        char lowerCase = Character.toLowerCase(cCharAt);
        String strSubstring = str.substring(1);
        strSubstring.getClass();
        return lowerCase + strSubstring;
    }

    public static final String decapitalizeSmartForCompiler(String str, boolean z) {
        Object next;
        str.getClass();
        if (str.length() == 0 || !isUpperCaseCharAt(str, 0, z)) {
            return str;
        }
        if (str.length() == 1 || !isUpperCaseCharAt(str, 1, z)) {
            if (z) {
                return decapitalizeAsciiOnly(str);
            }
            if (str.length() <= 0) {
                return str;
            }
            char lowerCase = Character.toLowerCase(str.charAt(0));
            String strSubstring = str.substring(1);
            strSubstring.getClass();
            return lowerCase + strSubstring;
        }
        afbk it = new afha(0, str.length() - 1).iterator();
        while (true) {
            if (!((afgz) it).a) {
                next = null;
                break;
            }
            next = it.next();
            if (!isUpperCaseCharAt(str, ((Number) next).intValue(), z)) {
                break;
            }
        }
        Integer num = (Integer) next;
        if (num == null) {
            return toLowerCase(str, z);
        }
        int iIntValue = num.intValue() - 1;
        String strSubstring2 = str.substring(0, iIntValue);
        strSubstring2.getClass();
        String lowerCase2 = toLowerCase(strSubstring2, z);
        String strSubstring3 = str.substring(iIntValue);
        strSubstring3.getClass();
        return String.valueOf(lowerCase2).concat(strSubstring3);
    }

    private static final boolean isUpperCaseCharAt(String str, int i, boolean z) {
        char cCharAt = str.charAt(i);
        return z ? cCharAt >= 'A' && cCharAt < '[' : Character.isUpperCase(cCharAt);
    }

    private static final String toLowerCase(String str, boolean z) {
        if (z) {
            return toLowerCaseAsciiOnly(str);
        }
        String lowerCase = str.toLowerCase(Locale.ROOT);
        lowerCase.getClass();
        return lowerCase;
    }

    public static final String toLowerCaseAsciiOnly(String str) {
        str.getClass();
        StringBuilder sb = new StringBuilder(str.length());
        for (int i = 0; i < str.length(); i++) {
            char cCharAt = str.charAt(i);
            if (cCharAt >= 'A' && cCharAt < '[') {
                cCharAt = Character.toLowerCase(cCharAt);
            }
            sb.append(cCharAt);
        }
        return sb.toString();
    }
}
