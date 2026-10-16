package e.a;

import java.nio.charset.CharacterCodingException;
import java.util.Locale;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class eo {

    /* renamed from: a, reason: collision with root package name */
    private String f47436a;

    /* renamed from: b, reason: collision with root package name */
    private String f47437b = "";

    /* renamed from: c, reason: collision with root package name */
    private String f47438c;

    /* renamed from: d, reason: collision with root package name */
    private String f47439d;

    /* renamed from: e, reason: collision with root package name */
    private String f47440e;

    /* renamed from: f, reason: collision with root package name */
    private String f47441f;

    /* renamed from: g, reason: collision with root package name */
    private String f47442g;

    /* synthetic */ eo() {
    }

    public final ep a() {
        com.google.d.b.an.v(this.f47436a != null, "Missing required scheme.");
        if (this.f47441f == null) {
            com.google.d.b.an.v(this.f47442g == null, "Cannot set port without host.");
            com.google.d.b.an.v(this.f47440e == null, "Cannot set userInfo without host.");
        }
        return new ep(this);
    }

    public final void i(String str) throws CharacterCodingException {
        if (str != null) {
            str = ep.j(str.toLowerCase(Locale.ROOT), ep.f47447e);
        }
        this.f47441f = str;
    }

    public final void j(String str) {
        com.google.d.b.an.m(true, "Path can be empty but not null");
        this.f47437b = ep.j(str, ep.f47450h);
    }

    public final void k() {
        this.f47442g = null;
    }

    public final void l(String str) throws CharacterCodingException, NumberFormatException {
        if (str == null) {
            r();
            i(null);
            k();
            return;
        }
        int iIndexOf = str.indexOf(64);
        if (iIndexOf >= 0) {
            String strSubstring = str.substring(0, iIndexOf);
            ep.l(strSubstring, "userInfo", ep.f47448f);
            this.f47440e = strSubstring;
        } else {
            r();
        }
        int i2 = iIndexOf >= 0 ? iIndexOf + 1 : 0;
        int length = str.length();
        int i3 = ep.f47453k;
        int i4 = -1;
        int i5 = length - 1;
        while (true) {
            if (i5 >= i2) {
                char cCharAt = str.charAt(i5);
                if (cCharAt == ':') {
                    i4 = i5;
                    break;
                } else if (cCharAt == ']' || !ep.f47443a.get(cCharAt)) {
                    break;
                } else {
                    i5--;
                }
            } else {
                break;
            }
        }
        if (i4 < 0) {
            n(str.substring(i2));
            k();
            return;
        }
        n(str.substring(i2, i4));
        String strSubstring2 = str.substring(i4 + 1);
        if (strSubstring2 != null && !strSubstring2.isEmpty()) {
            try {
                Integer.parseInt(strSubstring2);
            } catch (NumberFormatException e2) {
                throw new IllegalArgumentException("Invalid port", e2);
            }
        }
        this.f47442g = strSubstring2;
    }

    public final void m(String str) {
        if (str != null) {
            ep.l(str, "fragment", ep.f47452j);
        }
        this.f47439d = str;
    }

    final void n(String str) {
        int iIndexOf;
        if (str.startsWith("[") && str.endsWith("]") && (iIndexOf = str.indexOf(37)) > 0) {
            ep.l(str.substring(iIndexOf, str.length() - 1), "scope", ep.f47446d);
        }
        if (!com.google.d.k.c.c(str)) {
            ep.l(str, "host", ep.f47447e);
        }
        this.f47441f = str;
    }

    public final void o(String str) throws CharacterCodingException {
        com.google.d.b.an.m(str != null, "Path can be empty but not null");
        ep.m(str, null);
        this.f47437b = str;
    }

    public final void p(String str) {
        if (str != null) {
            ep.l(str, "query", ep.f47451i);
        }
        this.f47438c = str;
    }

    final void q(String str) {
        if (!str.isEmpty()) {
            if (ep.f47444b.get(str.charAt(0))) {
                for (int i2 = 0; i2 < str.length(); i2++) {
                    if (!ep.f47445c.get(str.charAt(i2))) {
                        throw new IllegalArgumentException("Invalid character in scheme at index " + i2);
                    }
                }
                this.f47436a = str;
                return;
            }
        }
        throw new IllegalArgumentException("Scheme must start with an alphabetic char");
    }

    public final void r() {
        this.f47440e = ep.j(null, ep.f47448f);
    }

    public final void s(String str) {
        q(str.toLowerCase(Locale.ROOT));
    }
}
