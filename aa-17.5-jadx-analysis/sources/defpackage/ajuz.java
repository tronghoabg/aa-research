package defpackage;

import j$.util.DesugarCollections;
import java.io.Serializable;
import java.nio.charset.Charset;
import java.nio.charset.UnsupportedCharsetException;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;

/* loaded from: classes2.dex */
public final class ajuz implements Serializable {
    public static final ajuz a;
    public static final ajuz b;
    public static final ajuz c;
    public static final ajuz d;
    public static final ajuz e;
    public static final ajuz f;
    public static final ajuz g;
    public static final ajuz h;
    public static final ajuz i;
    public static final ajuz j;
    public static final ajuz k;
    public static final ajuz l;
    public static final ajuz m;
    public static final ajuz n;
    public static final ajuz o;
    public static final ajuz p;
    public static final ajuz q;
    public static final Map r;
    private static final long serialVersionUID = -7768694718232371896L;
    public final String s;
    public final Charset t;
    private final ajpp[] u;

    static {
        ajuz ajuzVarA = a("application/atom+xml", ajox.c);
        a = ajuzVarA;
        ajuz ajuzVarA2 = a("application/x-www-form-urlencoded", ajox.c);
        b = ajuzVarA2;
        ajuz ajuzVarA3 = a("application/json", ajox.a);
        c = ajuzVarA3;
        a("application/octet-stream", null);
        a("application/soap+xml", ajox.a);
        ajuz ajuzVarA4 = a("application/svg+xml", ajox.c);
        d = ajuzVarA4;
        ajuz ajuzVarA5 = a("application/xhtml+xml", ajox.c);
        e = ajuzVarA5;
        ajuz ajuzVarA6 = a("application/xml", ajox.c);
        f = ajuzVarA6;
        ajuz ajuzVarA7 = a("image/bmp", null);
        g = ajuzVarA7;
        ajuz ajuzVarA8 = a("image/gif", null);
        h = ajuzVarA8;
        ajuz ajuzVarA9 = a("image/jpeg", null);
        i = ajuzVarA9;
        ajuz ajuzVarA10 = a("image/png", null);
        j = ajuzVarA10;
        ajuz ajuzVarA11 = a("image/svg+xml", null);
        k = ajuzVarA11;
        ajuz ajuzVarA12 = a("image/tiff", null);
        l = ajuzVarA12;
        ajuz ajuzVarA13 = a("image/webp", null);
        m = ajuzVarA13;
        ajuz ajuzVarA14 = a("multipart/form-data", ajox.c);
        n = ajuzVarA14;
        ajuz ajuzVarA15 = a("text/html", ajox.c);
        o = ajuzVarA15;
        ajuz ajuzVarA16 = a("text/plain", ajox.c);
        p = ajuzVarA16;
        ajuz ajuzVarA17 = a("text/xml", ajox.c);
        q = ajuzVarA17;
        a("*/*", null);
        ajuz[] ajuzVarArr = {ajuzVarA, ajuzVarA2, ajuzVarA3, ajuzVarA4, ajuzVarA5, ajuzVarA6, ajuzVarA7, ajuzVarA8, ajuzVarA9, ajuzVarA10, ajuzVarA11, ajuzVarA12, ajuzVarA13, ajuzVarA14, ajuzVarA15, ajuzVarA16, ajuzVarA17};
        HashMap map = new HashMap();
        for (int i2 = 0; i2 < 17; i2++) {
            ajuz ajuzVar = ajuzVarArr[i2];
            map.put(ajuzVar.s, ajuzVar);
        }
        r = DesugarCollections.unmodifiableMap(map);
    }

    public ajuz(String str, Charset charset) {
        this.s = str;
        this.t = charset;
        this.u = null;
    }

    public static ajuz a(String str, Charset charset) {
        ahgm.b(str, "MIME type");
        String lowerCase = str.toLowerCase(Locale.ROOT);
        boolean z = false;
        int i2 = 0;
        while (true) {
            if (i2 >= lowerCase.length()) {
                z = true;
                break;
            }
            char cCharAt = lowerCase.charAt(i2);
            if (cCharAt == '\"' || cCharAt == ',' || cCharAt == ';') {
                break;
            }
            i2++;
        }
        ahgm.a(z, "MIME type may not contain reserved characters");
        return new ajuz(lowerCase, charset);
    }

    public static ajuz b(ajpb ajpbVar) throws ajpr, UnsupportedCharsetException {
        ajoy ajoyVarD;
        if (ajpbVar == null || (ajoyVarD = ajpbVar.d()) == null) {
            return null;
        }
        ajzy[] ajzyVarArrA = ajoyVarD.a();
        if (ajzyVarArrA.length <= 0) {
            return null;
        }
        ajzy ajzyVar = ajzyVarArrA[0];
        return c(ajzyVar.a, ajzyVar.d());
    }

    private static ajuz c(String str, ajpp[] ajppVarArr) {
        Charset charsetForName;
        int length = ajppVarArr.length;
        int i2 = 0;
        while (true) {
            if (i2 >= length) {
                break;
            }
            ajpp ajppVar = ajppVarArr[i2];
            if (ajppVar.b().equalsIgnoreCase("charset")) {
                String strC = ajppVar.c();
                if (!ahku.a(strC)) {
                    charsetForName = Charset.forName(strC);
                }
            } else {
                i2++;
            }
        }
        charsetForName = null;
        if (ajppVarArr == null || ajppVarArr.length <= 0) {
            ajppVarArr = null;
        }
        return new ajuz(str, charsetForName, ajppVarArr);
    }

    public final String toString() {
        int iG;
        akbh akbhVar = new akbh(64);
        akbhVar.f(this.s);
        ajpp[] ajppVarArr = this.u;
        if (ajppVarArr != null) {
            akbhVar.f("; ");
            int length = ajppVarArr.length;
            if (length <= 0) {
                iG = 0;
            } else {
                int i2 = length - 1;
                iG = i2 + i2;
                for (ajpp ajppVar : ajppVarArr) {
                    iG += ahgm.g(ajppVar);
                }
            }
            akbhVar.j(iG);
            for (int i3 = 0; i3 < ajppVarArr.length; i3++) {
                if (i3 > 0) {
                    akbhVar.f("; ");
                }
                ahgm.h(akbhVar, ajppVarArr[i3], false);
            }
        } else {
            Charset charset = this.t;
            if (charset != null) {
                akbhVar.f("; charset=");
                akbhVar.f(charset.name());
            }
        }
        return akbhVar.toString();
    }

    public ajuz(String str, Charset charset, ajpp[] ajppVarArr) {
        this.s = str;
        this.t = charset;
        this.u = ajppVarArr;
    }
}
