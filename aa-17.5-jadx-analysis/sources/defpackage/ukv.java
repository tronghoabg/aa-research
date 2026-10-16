package defpackage;

import java.nio.charset.StandardCharsets;

/* loaded from: classes3.dex */
public final class ukv {
    private static final String[] a = {"data:", "http:", "https:"};

    public static String a(String str, boolean z, int i, abfk abfkVar) {
        if (!z || abfkVar == null) {
            return str;
        }
        String[] strArr = a;
        for (int i2 = 0; i2 < 3; i2++) {
            if (str.startsWith(strArr[i2])) {
                return str;
            }
        }
        StringBuilder sb = new StringBuilder();
        abfm abfmVar = abfkVar.b;
        if (abfmVar.e(0)) {
            if (abfkVar.m == null) {
                if (abfmVar.e(0)) {
                    abfkVar.m = new String(abfkVar.s, abfmVar.b(0), abfmVar.a(0), StandardCharsets.UTF_8);
                } else {
                    abfkVar.m = "";
                }
            }
            sb.append(abfkVar.m);
        }
        abfo abfoVar = abfkVar.l;
        if (i < abfoVar.b) {
            synchronized (abfoVar) {
                if (abfkVar.q == null) {
                    abfkVar.q = new ajds(abfkVar.s, abfoVar);
                }
            }
            ajds ajdsVar = abfkVar.q;
            String[] strArr2 = (String[]) ajdsVar.b;
            String str2 = strArr2[i];
            if (str2 == null) {
                Object obj = ajdsVar.a;
                abfm abfmVar2 = (abfm) ajdsVar.c;
                str2 = new String((byte[]) obj, abfmVar2.b(i), abfmVar2.a(i), StandardCharsets.UTF_8);
                strArr2[i] = str2;
            }
            sb.append(str2);
        }
        sb.append(str);
        abfm abfmVar3 = abfkVar.b;
        if (abfmVar3.e(1)) {
            if (abfkVar.n == null) {
                if (abfmVar3.e(1)) {
                    abfkVar.n = new String(abfkVar.s, abfmVar3.b(1), abfmVar3.a(1), StandardCharsets.UTF_8);
                } else {
                    abfkVar.n = "";
                }
            }
            sb.append(abfkVar.n);
        }
        return sb.toString();
    }
}
