package okhttp3;

import androidx.autofill.HintConstants;
import androidx.webkit.ProxyConfig;
import java.net.MalformedURLException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;

/* compiled from: WazeSource */
/* loaded from: classes8.dex */
public final class ab {

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int f55817a = 0;

    /* renamed from: b, reason: collision with root package name */
    private static final char[] f55818b = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};

    /* renamed from: c, reason: collision with root package name */
    private final String f55819c;

    /* renamed from: d, reason: collision with root package name */
    private final String f55820d;

    /* renamed from: e, reason: collision with root package name */
    private final String f55821e;

    /* renamed from: f, reason: collision with root package name */
    private final String f55822f;

    /* renamed from: g, reason: collision with root package name */
    private final int f55823g;

    /* renamed from: h, reason: collision with root package name */
    private final List f55824h;

    /* renamed from: i, reason: collision with root package name */
    private final List f55825i;

    /* renamed from: j, reason: collision with root package name */
    private final String f55826j;

    /* renamed from: k, reason: collision with root package name */
    private final String f55827k;

    /* renamed from: l, reason: collision with root package name */
    private final boolean f55828l;

    public ab(String str, String str2, String str3, String str4, int i2, List list, List list2, String str5, String str6) {
        h.g.b.x.f(str, "scheme");
        h.g.b.x.f(str2, HintConstants.AUTOFILL_HINT_USERNAME);
        h.g.b.x.f(str3, HintConstants.AUTOFILL_HINT_PASSWORD);
        h.g.b.x.f(str4, "host");
        h.g.b.x.f(list, "pathSegments");
        h.g.b.x.f(str6, "url");
        this.f55819c = str;
        this.f55820d = str2;
        this.f55821e = str3;
        this.f55822f = str4;
        this.f55823g = i2;
        this.f55824h = list;
        this.f55825i = list2;
        this.f55826j = str5;
        this.f55827k = str6;
        this.f55828l = h.g.b.x.n(str, ProxyConfig.MATCH_HTTPS);
    }

    public static final ab o(String str) {
        h.g.b.x.f(str, "<this>");
        try {
            return kotlinx.b.a.b.C(str);
        } catch (IllegalArgumentException unused) {
            return null;
        }
    }

    public final int a() {
        return this.f55823g;
    }

    public final String b() {
        if (this.f55821e.length() == 0) {
            return "";
        }
        String str = this.f55827k;
        String str2 = str;
        String strSubstring = str.substring(h.n.o.W(str2, ':', this.f55819c.length() + 3, 4) + 1, h.n.o.W(str2, '@', 0, 6));
        h.g.b.x.e(strSubstring, "substring(...)");
        return strSubstring;
    }

    public final String c() {
        int length = this.f55819c.length() + 3;
        String str = this.f55827k;
        int iW = h.n.o.W(str, '/', length, 4);
        String strSubstring = str.substring(iW, okhttp3.internal.b.b(str, "?#", iW, str.length()));
        h.g.b.x.e(strSubstring, "substring(...)");
        return strSubstring;
    }

    public final String d() {
        if (this.f55825i == null) {
            return null;
        }
        String str = this.f55827k;
        int iW = h.n.o.W(str, '?', 0, 6) + 1;
        String strSubstring = str.substring(iW, okhttp3.internal.b.a(str, '#', iW, str.length()));
        h.g.b.x.e(strSubstring, "substring(...)");
        return strSubstring;
    }

    public final String e() {
        if (this.f55820d.length() == 0) {
            return "";
        }
        String str = this.f55819c;
        String str2 = this.f55827k;
        int length = str.length() + 3;
        String strSubstring = str2.substring(length, okhttp3.internal.b.b(str2, ":@", length, str2.length()));
        h.g.b.x.e(strSubstring, "substring(...)");
        return strSubstring;
    }

    public final boolean equals(Object obj) {
        return (obj instanceof ab) && h.g.b.x.n(((ab) obj).f55827k, this.f55827k);
    }

    public final String f() {
        return this.f55822f;
    }

    public final String g() {
        aa aaVarN = n("/...");
        h.g.b.x.c(aaVarN);
        return aaVarN.t().r().g().f55827k;
    }

    public final String h() {
        return this.f55819c;
    }

    public final int hashCode() {
        return this.f55827k.hashCode();
    }

    public final URI i() {
        String string = m().d().toString();
        try {
            return new URI(string);
        } catch (URISyntaxException e2) {
            try {
                URI uriCreate = URI.create(new h.n.l("[\\u0000-\\u001F\\u007F-\\u009F\\p{javaWhitespace}]").b(string, ""));
                h.g.b.x.c(uriCreate);
                return uriCreate;
            } catch (Exception unused) {
                throw new RuntimeException(e2);
            }
        }
    }

    public final URL j() {
        try {
            return new URL(this.f55827k);
        } catch (MalformedURLException e2) {
            throw new RuntimeException(e2);
        }
    }

    public final List k() {
        int length = this.f55819c.length() + 3;
        String str = this.f55827k;
        int iW = h.n.o.W(str, '/', length, 4);
        int iB = okhttp3.internal.b.b(str, "?#", iW, str.length());
        ArrayList arrayList = new ArrayList();
        while (iW < iB) {
            int i2 = iW + 1;
            int iA = okhttp3.internal.b.a(str, '/', i2, iB);
            String strSubstring = str.substring(i2, iA);
            h.g.b.x.e(strSubstring, "substring(...)");
            arrayList.add(strSubstring);
            iW = iA;
        }
        return arrayList;
    }

    public final List l() {
        return this.f55824h;
    }

    public final aa m() {
        String strSubstring;
        aa aaVar = new aa();
        String str = this.f55819c;
        aaVar.m(str);
        aaVar.j(e());
        aaVar.i(b());
        aaVar.k(this.f55822f);
        int i2 = this.f55823g;
        if (i2 == kotlinx.b.a.b.B(str)) {
            i2 = -1;
        }
        aaVar.l(i2);
        aaVar.a().clear();
        aaVar.a().addAll(k());
        aaVar.o(d());
        if (this.f55826j == null) {
            strSubstring = null;
        } else {
            String str2 = this.f55827k;
            strSubstring = str2.substring(h.n.o.W(str2, '#', 0, 6) + 1);
            h.g.b.x.e(strSubstring, "substring(...)");
        }
        aaVar.h(strSubstring);
        return aaVar;
    }

    public final aa n(String str) {
        h.g.b.x.f(str, "link");
        try {
            aa aaVar = new aa();
            aaVar.q(this, str);
            return aaVar;
        } catch (IllegalArgumentException unused) {
            return null;
        }
    }

    public final ab p(String str) {
        h.g.b.x.f(str, "link");
        aa aaVarN = n(str);
        if (aaVarN != null) {
            return aaVarN.g();
        }
        return null;
    }

    public final boolean q() {
        return this.f55828l;
    }

    public final String toString() {
        return this.f55827k;
    }
}
