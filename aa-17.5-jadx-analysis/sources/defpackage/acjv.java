package defpackage;

import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;

/* loaded from: classes3.dex */
public final class acjv {
    private static final int[] b = {-1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 36, -1, -1, -1, 37, 38, -1, -1, -1, -1, 39, 40, -1, 41, 42, 43, 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 44, -1, -1, -1, -1, -1, -1, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, 26, 27, 28, 29, 30, 31, 32, 33, 34, 35, -1, -1, -1, -1, -1};
    static final Charset a = StandardCharsets.ISO_8859_1;

    static int a(int i) {
        if (i < 96) {
            return b[i];
        }
        return -1;
    }

    /* JADX WARN: Removed duplicated region for block: B:243:0x05ad  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static defpackage.ackc b(java.lang.String r38, defpackage.acjp r39, java.util.Map r40) throws java.lang.NumberFormatException, defpackage.acji {
        /*
            Method dump skipped, instructions count: 1885
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.acjv.b(java.lang.String, acjp, java.util.Map):ackc");
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x0050 A[LOOP:0: B:14:0x0022->B:28:0x0050, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:64:0x005f A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    static void c(java.lang.String r6, defpackage.acjq r7, defpackage.acjj r8, java.nio.charset.Charset r9) throws defpackage.acji {
        /*
            Method dump skipped, instructions count: 274
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.acjv.c(java.lang.String, acjq, acjj, java.nio.charset.Charset):void");
    }

    static void d(acjq acjqVar, acjj acjjVar) {
        acjjVar.d(acjqVar.k, 4);
    }

    static boolean e(String str) {
        byte[] bytes = str.getBytes(acjm.a);
        int length = bytes.length;
        if ((length & 1) != 0) {
            return false;
        }
        for (int i = 0; i < length; i += 2) {
            int i2 = bytes[i] & 255;
            if ((i2 < 129 || i2 > 159) && (i2 < 224 || i2 > 235)) {
                return false;
            }
        }
        return true;
    }

    static boolean f(int i, acjt acjtVar, acjp acjpVar) {
        return acjtVar.b - acjtVar.a(acjpVar).b() >= (i + 7) / 8;
    }

    private static int g(acjq acjqVar, acjj acjjVar, acjj acjjVar2, acjt acjtVar) {
        return acjjVar.b + acjqVar.a(acjtVar) + acjjVar2.b;
    }

    private static acjt h(int i, acjp acjpVar) throws acji {
        for (int i2 = 1; i2 <= 40; i2++) {
            acjt acjtVarB = acjt.b(i2);
            if (f(i, acjtVarB, acjpVar)) {
                return acjtVarB;
            }
        }
        throw new acji("Data too big");
    }
}
