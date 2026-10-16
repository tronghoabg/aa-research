package defpackage;

/* loaded from: classes3.dex */
public final class zcw {
    private static final xwp b = xwp.h(".。．｡");
    private static final xxx c = xxx.c('.');
    private static final xwp d;
    private static final xwp e;
    private static final xwp f;
    private static final xwp g;
    public final String a;
    private final yfq h;

    static {
        xwp xwpVarH = xwp.h("-_");
        d = xwpVarH;
        xwh xwhVar = new xwh('0', '9');
        e = xwhVar;
        xwn xwnVar = new xwn(new xwh('a', 'z'), new xwh('A', 'Z'));
        f = xwnVar;
        g = new xwn(new xwn(xwhVar, xwnVar), xwpVarH);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public zcw(String str) {
        String strAr = woy.ar(b.d(str));
        boolean z = false;
        strAr = strAr.endsWith(".") ? strAr.substring(0, strAr.length() - 1) : strAr;
        woy.S(strAr.length() <= 253, "Domain name too long: '%s':", strAr);
        this.a = strAr;
        yfq yfqVarN = yfq.n(c.g(strAr));
        this.h = yfqVarN;
        woy.S(yfqVarN.size() <= 127, "Domain has too many parts: '%s'", strAr);
        int size = yfqVarN.size() - 1;
        if (a((String) yfqVarN.get(size), true)) {
            int i = 0;
            while (true) {
                if (i >= size) {
                    z = true;
                    break;
                } else if (!a((String) yfqVarN.get(i), false)) {
                    break;
                } else {
                    i++;
                }
            }
        }
        woy.S(z, "Not a valid domain name: '%s'", strAr);
    }

    private static boolean a(String str, boolean z) {
        if (str.length() > 0 && str.length() <= 63) {
            xwl xwlVar = new xwl(xwf.a);
            String string = str.toString();
            int iF = xwlVar.f(string, 0);
            if (iF != -1) {
                char[] charArray = string.toCharArray();
                int i = 1;
                loop0: while (true) {
                    iF++;
                    while (iF != charArray.length) {
                        char c2 = charArray[iF];
                        if (xwlVar.b(c2)) {
                            break;
                        }
                        charArray[iF - i] = c2;
                        iF++;
                    }
                    i++;
                }
                string = new String(charArray, 0, iF - i);
            }
            if (!g.j(string)) {
                return false;
            }
            xwp xwpVar = d;
            if (!xwpVar.b(str.charAt(0)) && !xwpVar.b(str.charAt(str.length() - 1))) {
                return (z && e.b(str.charAt(0))) ? false : true;
            }
        }
        return false;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof zcw) {
            return this.a.equals(((zcw) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return this.a;
    }
}
