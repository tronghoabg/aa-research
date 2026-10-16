package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class ajvz implements java.io.Serializable {
    public static final defpackage.ajvz a;
    public static final defpackage.ajvz b;
    public static final defpackage.ajvz c;
    public static final defpackage.ajvz d;
    public static final defpackage.ajvz e;
    public static final defpackage.ajvz f;
    public static final defpackage.ajvz g;
    public static final defpackage.ajvz h;
    public static final defpackage.ajvz i;
    public static final defpackage.ajvz j;
    public static final defpackage.ajvz k;
    public static final defpackage.ajvz l;
    public static final defpackage.ajvz m;
    public static final defpackage.ajvz n;
    public static final defpackage.ajvz o;
    public static final defpackage.ajvz p;
    public static final defpackage.ajvz q;
    public static final java.util.Map r;
    private static final long serialVersionUID = -7768694718232371896L;
    public final java.lang.String s;
    public final java.nio.charset.Charset t;
    private final defpackage.ajqp[] u;

    static {
        defpackage.ajvz ajvzVarA = a("application/atom+xml", defpackage.ajpx.c);
        a = ajvzVarA;
        defpackage.ajvz ajvzVarA2 = a("application/x-www-form-urlencoded", defpackage.ajpx.c);
        b = ajvzVarA2;
        defpackage.ajvz ajvzVarA3 = a("application/json", defpackage.ajpx.a);
        c = ajvzVarA3;
        a("application/octet-stream", null);
        a("application/soap+xml", defpackage.ajpx.a);
        defpackage.ajvz ajvzVarA4 = a("application/svg+xml", defpackage.ajpx.c);
        d = ajvzVarA4;
        defpackage.ajvz ajvzVarA5 = a("application/xhtml+xml", defpackage.ajpx.c);
        e = ajvzVarA5;
        defpackage.ajvz ajvzVarA6 = a("application/xml", defpackage.ajpx.c);
        f = ajvzVarA6;
        defpackage.ajvz ajvzVarA7 = a("image/bmp", null);
        g = ajvzVarA7;
        defpackage.ajvz ajvzVarA8 = a("image/gif", null);
        h = ajvzVarA8;
        defpackage.ajvz ajvzVarA9 = a("image/jpeg", null);
        i = ajvzVarA9;
        defpackage.ajvz ajvzVarA10 = a("image/png", null);
        j = ajvzVarA10;
        defpackage.ajvz ajvzVarA11 = a("image/svg+xml", null);
        k = ajvzVarA11;
        defpackage.ajvz ajvzVarA12 = a("image/tiff", null);
        l = ajvzVarA12;
        defpackage.ajvz ajvzVarA13 = a("image/webp", null);
        m = ajvzVarA13;
        defpackage.ajvz ajvzVarA14 = a("multipart/form-data", defpackage.ajpx.c);
        n = ajvzVarA14;
        defpackage.ajvz ajvzVarA15 = a("text/html", defpackage.ajpx.c);
        o = ajvzVarA15;
        defpackage.ajvz ajvzVarA16 = a("text/plain", defpackage.ajpx.c);
        p = ajvzVarA16;
        defpackage.ajvz ajvzVarA17 = a("text/xml", defpackage.ajpx.c);
        q = ajvzVarA17;
        a("*/*", null);
        defpackage.ajvz[] ajvzVarArr = {ajvzVarA, ajvzVarA2, ajvzVarA3, ajvzVarA4, ajvzVarA5, ajvzVarA6, ajvzVarA7, ajvzVarA8, ajvzVarA9, ajvzVarA10, ajvzVarA11, ajvzVarA12, ajvzVarA13, ajvzVarA14, ajvzVarA15, ajvzVarA16, ajvzVarA17};
        java.util.HashMap map = new java.util.HashMap();
        for (int i2 = 0; i2 < 17; i2++) {
            defpackage.ajvz ajvzVar = ajvzVarArr[i2];
            map.put(ajvzVar.s, ajvzVar);
        }
        r = j$.util.DesugarCollections.unmodifiableMap(map);
    }

    public ajvz(java.lang.String str, java.nio.charset.Charset charset) {
        this.s = str;
        this.t = charset;
        this.u = null;
    }

    public static defpackage.ajvz a(java.lang.String str, java.nio.charset.Charset charset) {
        defpackage.aguw.b(str, "MIME type");
        java.lang.String lowerCase = str.toLowerCase(java.util.Locale.ROOT);
        boolean z = false;
        for (int i2 = 0; i2 < lowerCase.length(); i2++) {
            char cCharAt = lowerCase.charAt(i2);
            if (cCharAt == '\"' || cCharAt == ',' || cCharAt == ';') {
                defpackage.aguw.a(z, "MIME type may not contain reserved characters");
                return new defpackage.ajvz(lowerCase, charset);
            }
        }
        z = true;
        defpackage.aguw.a(z, "MIME type may not contain reserved characters");
        return new defpackage.ajvz(lowerCase, charset);
    }

    public static defpackage.ajvz b(defpackage.ajqb ajqbVar) throws defpackage.ajqr, java.nio.charset.UnsupportedCharsetException {
        defpackage.ajpy ajpyVarD;
        if (ajqbVar == null || (ajpyVarD = ajqbVar.d()) == null) {
            return null;
        }
        defpackage.akay[] akayVarArrA = ajpyVarD.a();
        if (akayVarArrA.length <= 0) {
            return null;
        }
        defpackage.akay akayVar = akayVarArrA[0];
        return c(akayVar.a, akayVar.d());
    }

    private static defpackage.ajvz c(java.lang.String str, defpackage.ajqp[] ajqpVarArr) {
        java.nio.charset.Charset charsetForName;
        int length = ajqpVarArr.length;
        int i2 = 0;
        while (true) {
            if (i2 < length) {
                defpackage.ajqp ajqpVar = ajqpVarArr[i2];
                if (ajqpVar.b().equalsIgnoreCase("charset")) {
                    java.lang.String strC = ajqpVar.c();
                    if (!defpackage.agwh.a(strC)) {
                        charsetForName = java.nio.charset.Charset.forName(strC);
                        break;
                    }
                } else {
                    i2++;
                }
            }
            charsetForName = null;
            break;
        }
        if (ajqpVarArr == null || ajqpVarArr.length <= 0) {
            ajqpVarArr = null;
        }
        return new defpackage.ajvz(str, charsetForName, ajqpVarArr);
    }

    public final java.lang.String toString() {
        int iG;
        defpackage.akch akchVar = new defpackage.akch(64);
        akchVar.f(this.s);
        defpackage.ajqp[] ajqpVarArr = this.u;
        if (ajqpVarArr != null) {
            akchVar.f("; ");
            int length = ajqpVarArr.length;
            if (length <= 0) {
                iG = 0;
            } else {
                int i2 = length - 1;
                iG = i2 + i2;
                for (defpackage.ajqp ajqpVar : ajqpVarArr) {
                    iG += defpackage.aguw.g(ajqpVar);
                }
            }
            akchVar.j(iG);
            for (int i3 = 0; i3 < ajqpVarArr.length; i3++) {
                if (i3 > 0) {
                    akchVar.f("; ");
                }
                defpackage.aguw.h(akchVar, ajqpVarArr[i3], false);
            }
        } else {
            java.nio.charset.Charset charset = this.t;
            if (charset != null) {
                akchVar.f("; charset=");
                akchVar.f(charset.name());
            }
        }
        return akchVar.toString();
    }

    public ajvz(java.lang.String str, java.nio.charset.Charset charset, defpackage.ajqp[] ajqpVarArr) {
        this.s = str;
        this.t = charset;
        this.u = ajqpVarArr;
    }
}
