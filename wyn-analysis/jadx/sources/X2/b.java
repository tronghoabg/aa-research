package X2;

import Q1.o;
import java.util.regex.Pattern;

/* loaded from: classes.dex */
public final class b {

    /* renamed from: c, reason: collision with root package name */
    public static final Pattern f16027c = Pattern.compile("\\[voice=\"([^\"]*)\"\\]");

    /* renamed from: d, reason: collision with root package name */
    public static final Pattern f16028d = Pattern.compile("^((?:[0-9]*\\.)?[0-9]+)(px|em|%)$");

    /* renamed from: a, reason: collision with root package name */
    public final o f16029a = new o();

    /* renamed from: b, reason: collision with root package name */
    public final StringBuilder f16030b = new StringBuilder();

    public static String a(o oVar, StringBuilder sb2) {
        boolean z2 = false;
        sb2.setLength(0);
        int i5 = oVar.f9703b;
        int i10 = oVar.f9704c;
        while (i5 < i10 && !z2) {
            char c10 = (char) oVar.f9702a[i5];
            if ((c10 < 'A' || c10 > 'Z') && ((c10 < 'a' || c10 > 'z') && !((c10 >= '0' && c10 <= '9') || c10 == '#' || c10 == '-' || c10 == '.' || c10 == '_'))) {
                z2 = true;
            } else {
                i5++;
                sb2.append(c10);
            }
        }
        oVar.H(i5 - oVar.f9703b);
        return sb2.toString();
    }

    public static String b(o oVar, StringBuilder sb2) {
        c(oVar);
        if (oVar.a() == 0) {
            return null;
        }
        String strA = a(oVar, sb2);
        if (!"".equals(strA)) {
            return strA;
        }
        return "" + ((char) oVar.u());
    }

    public static void c(o oVar) {
        while (true) {
            for (boolean z2 = true; oVar.a() > 0 && z2; z2 = false) {
                int i5 = oVar.f9703b;
                byte[] bArr = oVar.f9702a;
                byte b5 = bArr[i5];
                char c10 = (char) b5;
                if (c10 == '\t' || c10 == '\n' || c10 == '\f' || c10 == '\r' || c10 == ' ') {
                    oVar.H(1);
                } else {
                    int i10 = oVar.f9704c;
                    int i11 = i5 + 2;
                    if (i11 <= i10) {
                        int i12 = i5 + 1;
                        if (b5 == 47 && bArr[i12] == 42) {
                            while (true) {
                                int i13 = i11 + 1;
                                if (i13 >= i10) {
                                    break;
                                }
                                if (((char) bArr[i11]) == '*' && ((char) bArr[i13]) == '/') {
                                    i11 += 2;
                                    i10 = i11;
                                } else {
                                    i11 = i13;
                                }
                            }
                            oVar.H(i10 - oVar.f9703b);
                        }
                    }
                }
            }
            return;
        }
    }
}
