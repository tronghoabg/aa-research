package defpackage;

import java.util.Locale;
import java.util.StringTokenizer;

/* loaded from: classes2.dex */
public final class ajyy implements ajuh {
    private final /* synthetic */ int a;

    public ajyy(int i) {
        this.a = i;
    }

    public static final boolean e(String str, String str2) {
        if (str.equals(str2)) {
            return true;
        }
        return str2.startsWith(".") && str.endsWith(str2);
    }

    private static boolean f(int i, int[] iArr) {
        for (int i2 : iArr) {
            if (i == i2) {
                return true;
            }
        }
        return false;
    }

    @Override // defpackage.ajuh
    public final String a() {
        int i = this.a;
        return i != 0 ? i != 1 ? i != 2 ? i != 3 ? i != 4 ? "version" : "port" : "domain" : "discard" : "domain" : "commenturl";
    }

    @Override // defpackage.ajuj
    public final void b(ajuu ajuuVar, String str) throws ajut, NumberFormatException {
        int i;
        int i2 = this.a;
        if (i2 == 0) {
            if (ajuuVar instanceof ajyb) {
                return;
            }
            return;
        }
        if (i2 == 1) {
            if (str == null) {
                throw new ajut("Missing value for domain attribute");
            }
            if (str.trim().isEmpty()) {
                throw new ajut("Blank value for domain attribute");
            }
            ajuuVar.j(str);
            return;
        }
        if (i2 == 2) {
            if (ajuuVar instanceof ajyb) {
                ((ajyb) ajuuVar).b = true;
                return;
            }
            return;
        }
        if (i2 == 3) {
            if (str == null) {
                throw new ajut("Missing value for domain attribute");
            }
            if (str.trim().isEmpty()) {
                throw new ajut("Blank value for domain attribute");
            }
            String lowerCase = str.toLowerCase(Locale.ROOT);
            if (!str.startsWith(".")) {
                lowerCase = ".".concat(String.valueOf(lowerCase));
            }
            ajuuVar.j(lowerCase);
            return;
        }
        if (i2 != 4) {
            if (str == null) {
                throw new ajut("Missing value for version attribute");
            }
            try {
                i = Integer.parseInt(str);
            } catch (NumberFormatException unused) {
                i = -1;
            }
            if (i < 0) {
                throw new ajut("Invalid cookie version.");
            }
            ajuuVar.m(i);
            return;
        }
        if (ajuuVar instanceof ajyb) {
            ajyb ajybVar = (ajyb) ajuuVar;
            if (str == null || str.trim().isEmpty()) {
                return;
            }
            StringTokenizer stringTokenizer = new StringTokenizer(str, ",");
            int[] iArr = new int[stringTokenizer.countTokens()];
            int i3 = 0;
            while (stringTokenizer.hasMoreTokens()) {
                try {
                    int i4 = Integer.parseInt(stringTokenizer.nextToken().trim());
                    iArr[i3] = i4;
                    if (i4 < 0) {
                        throw new ajut("Invalid Port attribute.");
                    }
                    i3++;
                } catch (NumberFormatException e) {
                    throw new ajut("Invalid Port attribute: ".concat(String.valueOf(e.getMessage())));
                }
            }
            ajybVar.a = iArr;
        }
    }

    @Override // defpackage.ajuj
    public final void c(ajui ajuiVar, ajul ajulVar) throws ajut {
        int i = this.a;
        if (i != 0) {
            if (i == 1) {
                ahgm.e(ajuiVar, "Cookie");
                String strB = ajuiVar.b();
                if (strB == null) {
                    throw new ajun("Cookie domain may not be null");
                }
                String str = ajulVar.a;
                if (strB.equals(str)) {
                    return;
                }
                if (strB.indexOf(46) == -1) {
                    throw new ajun(a.bC(str, strB, "Domain attribute \"", "\" does not match the host \"", "\""));
                }
                if (!strB.startsWith(".")) {
                    throw new ajun(a.bq(strB, "Domain attribute \"", "\" violates RFC 2109: domain must start with a dot"));
                }
                int iIndexOf = strB.indexOf(46, 1);
                if (iIndexOf < 0 || iIndexOf == strB.length() - 1) {
                    throw new ajun(a.bq(strB, "Domain attribute \"", "\" violates RFC 2109: domain must contain an embedded dot"));
                }
                String lowerCase = str.toLowerCase(Locale.ROOT);
                if (!lowerCase.endsWith(strB)) {
                    throw new ajun(a.bC(lowerCase, strB, "Illegal domain attribute \"", "\". Domain of origin: \"", "\""));
                }
                if (lowerCase.substring(0, lowerCase.length() - strB.length()).indexOf(46) != -1) {
                    throw new ajun(a.bq(strB, "Domain attribute \"", "\" violates RFC 2109: host minus domain may not contain any dots"));
                }
                return;
            }
            if (i != 2) {
                if (i != 3) {
                    if (i != 4) {
                        ahgm.e(ajuiVar, "Cookie");
                        if ((ajuiVar instanceof ajyb) && (ajuiVar instanceof ajyc) && !((ajyc) ajuiVar).p("version")) {
                            throw new ajun("Violates RFC 2965. Version attribute is required.");
                        }
                        return;
                    }
                    ahgm.e(ajuiVar, "Cookie");
                    if ((ajuiVar instanceof ajyc) && ((ajyc) ajuiVar).p("port") && !f(ajulVar.b, ajuiVar.i())) {
                        throw new ajun("Port attribute violates RFC 2965: Request port not found in cookie's port list.");
                    }
                    return;
                }
                ahgm.e(ajuiVar, "Cookie");
                String lowerCase2 = ajulVar.a.toLowerCase(Locale.ROOT);
                if (ajuiVar.b() == null) {
                    throw new ajun("Invalid cookie state: domain not specified");
                }
                String lowerCase3 = ajuiVar.b().toLowerCase(Locale.ROOT);
                if (!(ajuiVar instanceof ajyc) || !((ajyc) ajuiVar).p("domain")) {
                    if (ajuiVar.b().equals(lowerCase2)) {
                        return;
                    }
                    throw new ajun("Illegal domain attribute: \"" + ajuiVar.b() + "\".Domain of origin: \"" + lowerCase2 + "\"");
                }
                if (!lowerCase3.startsWith(".")) {
                    throw new ajun("Domain attribute \"" + ajuiVar.b() + "\" violates RFC 2109: domain must start with a dot");
                }
                int iIndexOf2 = lowerCase3.indexOf(46, 1);
                if ((iIndexOf2 < 0 || iIndexOf2 == lowerCase3.length() - 1) && !lowerCase3.equals(".local")) {
                    throw new ajun("Domain attribute \"" + ajuiVar.b() + "\" violates RFC 2965: the value contains no embedded dots and the value is not .local");
                }
                if (!e(lowerCase2, lowerCase3)) {
                    throw new ajun("Domain attribute \"" + ajuiVar.b() + "\" violates RFC 2965: effective host name does not domain-match domain attribute.");
                }
                if (lowerCase2.substring(0, lowerCase2.length() - lowerCase3.length()).indexOf(46) == -1) {
                    return;
                }
                throw new ajun("Domain attribute \"" + ajuiVar.b() + "\" violates RFC 2965: effective host minus domain may not contain any dots");
            }
        }
    }

    @Override // defpackage.ajuj
    public final boolean d(ajui ajuiVar, ajul ajulVar) {
        int i = this.a;
        if (i != 1) {
            if (i != 3) {
                if (i != 4) {
                    return true;
                }
                ahgm.e(ajuiVar, "Cookie");
                return ((ajuiVar instanceof ajyc) && ((ajyc) ajuiVar).p("port") && (ajuiVar.i() == null || !f(ajulVar.b, ajuiVar.i()))) ? false : true;
            }
            ahgm.e(ajuiVar, "Cookie");
            String lowerCase = ajulVar.a.toLowerCase(Locale.ROOT);
            String strB = ajuiVar.b();
            return e(lowerCase, strB) && lowerCase.substring(0, lowerCase.length() - strB.length()).indexOf(46) == -1;
        }
        ahgm.e(ajuiVar, "Cookie");
        String strB2 = ajuiVar.b();
        if (strB2 != null) {
            String str = ajulVar.a;
            if (str.equals(strB2)) {
                return true;
            }
            if (strB2.startsWith(".") && str.endsWith(strB2)) {
                return true;
            }
        }
        return false;
    }
}
