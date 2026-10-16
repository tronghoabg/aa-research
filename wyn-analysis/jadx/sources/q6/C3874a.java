package q6;

import java.util.regex.Pattern;

/* renamed from: q6.a, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C3874a {

    /* renamed from: c, reason: collision with root package name */
    public static final Pattern f44129c = Pattern.compile("\\[voice=\"([^\"]*)\"\\]");

    /* renamed from: d, reason: collision with root package name */
    public static final Pattern f44130d = Pattern.compile("^((?:[0-9]*\\.)?[0-9]+)(px|em|%)$");

    /* renamed from: a, reason: collision with root package name */
    public final Y4.b f44131a = new Y4.b();

    /* renamed from: b, reason: collision with root package name */
    public final StringBuilder f44132b = new StringBuilder();

    public static String a(Y4.b bVar, StringBuilder sb2) {
        boolean z2 = false;
        sb2.setLength(0);
        int i5 = bVar.f16680b;
        int i10 = bVar.f16681c;
        while (i5 < i10 && !z2) {
            char c10 = (char) bVar.f16679a[i5];
            if ((c10 < 'A' || c10 > 'Z') && ((c10 < 'a' || c10 > 'z') && !((c10 >= '0' && c10 <= '9') || c10 == '#' || c10 == '-' || c10 == '.' || c10 == '_'))) {
                z2 = true;
            } else {
                i5++;
                sb2.append(c10);
            }
        }
        bVar.B(i5 - bVar.f16680b);
        return sb2.toString();
    }

    public static String b(Y4.b bVar, StringBuilder sb2) {
        c(bVar);
        if (bVar.a() == 0) {
            return null;
        }
        String strA = a(bVar, sb2);
        if (!"".equals(strA)) {
            return strA;
        }
        return "" + ((char) bVar.q());
    }

    public static void c(Y4.b bVar) {
        while (true) {
            for (boolean z2 = true; bVar.a() > 0 && z2; z2 = false) {
                int i5 = bVar.f16680b;
                byte[] bArr = bVar.f16679a;
                byte b5 = bArr[i5];
                char c10 = (char) b5;
                if (c10 == '\t' || c10 == '\n' || c10 == '\f' || c10 == '\r' || c10 == ' ') {
                    bVar.B(1);
                } else {
                    int i10 = bVar.f16681c;
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
                            bVar.B(i10 - bVar.f16680b);
                        }
                    }
                }
            }
            return;
        }
    }
}
