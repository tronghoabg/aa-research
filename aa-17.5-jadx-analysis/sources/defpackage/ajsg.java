package defpackage;

import java.net.URI;
import java.net.URISyntaxException;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.BitSet;
import java.util.List;

/* loaded from: classes2.dex */
public final class ajsg {
    public String a;
    public String b;
    public String c;
    public String d;
    public String e;
    public String f;
    public String g;
    public List h;
    public String i;
    public List j;
    public Charset k = null;
    private int l;
    private String m;
    private String n;

    public ajsg(URI uri) {
        List listD;
        List listC = null;
        this.a = uri.getScheme();
        this.b = uri.getRawSchemeSpecificPart();
        this.c = uri.getRawAuthority();
        this.f = uri.getHost();
        this.l = uri.getPort();
        this.e = uri.getRawUserInfo();
        this.d = uri.getUserInfo();
        this.g = uri.getRawPath();
        String rawPath = uri.getRawPath();
        Charset charset = this.k;
        charset = charset == null ? ajox.a : charset;
        if (rawPath == null || rawPath.isEmpty()) {
            listD = null;
        } else {
            listD = ajsj.d(rawPath);
            for (int i = 0; i < listD.size(); i++) {
                listD.set(i, ajsj.a((String) listD.get(i), charset != null ? charset : ajox.a, false));
            }
        }
        this.h = listD;
        this.i = uri.getRawQuery();
        String rawQuery = uri.getRawQuery();
        Charset charset2 = this.k;
        charset2 = charset2 == null ? ajox.a : charset2;
        if (rawQuery != null && !rawQuery.isEmpty()) {
            int length = rawQuery.length();
            BitSet bitSet = ajsj.a;
            akbh akbhVar = new akbh(length);
            akbhVar.f(rawQuery);
            listC = ajsj.c(akbhVar, charset2, '&', ';');
        }
        this.j = listC;
        this.n = uri.getRawFragment();
        this.m = uri.getFragment();
    }

    private final String h() {
        StringBuilder sb = new StringBuilder();
        String str = this.a;
        if (str != null) {
            sb.append(str);
            sb.append(':');
        }
        String str2 = this.b;
        if (str2 != null) {
            sb.append(str2);
        } else {
            if (this.c != null) {
                sb.append("//");
                sb.append(this.c);
            } else if (this.f != null) {
                sb.append("//");
                String str3 = this.e;
                if (str3 != null) {
                    sb.append(str3);
                    sb.append("@");
                } else {
                    String str4 = this.d;
                    if (str4 != null) {
                        Charset charset = this.k;
                        if (charset == null) {
                            charset = ajox.a;
                        }
                        sb.append(ajsj.b(str4, charset, ajsj.a, false));
                        sb.append("@");
                    }
                }
                if (ajug.b(this.f)) {
                    sb.append("[");
                    sb.append(this.f);
                    sb.append("]");
                } else {
                    sb.append(this.f);
                }
                if (this.l >= 0) {
                    sb.append(":");
                    sb.append(this.l);
                }
            }
            String strConcat = this.g;
            if (strConcat != null) {
                int length = sb.length();
                if (ahku.a(strConcat)) {
                    strConcat = "";
                } else if (length != 0 && !strConcat.startsWith("/")) {
                    strConcat = "/".concat(strConcat);
                }
                sb.append(strConcat);
            } else {
                List<String> list = this.h;
                if (list != null) {
                    Charset charset2 = this.k;
                    if (charset2 == null) {
                        charset2 = ajox.a;
                    }
                    BitSet bitSet = ajsj.a;
                    StringBuilder sb2 = new StringBuilder();
                    for (String str5 : list) {
                        sb2.append('/');
                        sb2.append(ajsj.b(str5, charset2, ajsj.b, false));
                    }
                    sb.append(sb2.toString());
                }
            }
            if (this.i != null) {
                sb.append("?");
                sb.append(this.i);
            } else {
                List list2 = this.j;
                if (list2 != null && !list2.isEmpty()) {
                    sb.append("?");
                    List list3 = this.j;
                    Charset charset3 = this.k;
                    if (charset3 == null) {
                        charset3 = ajox.a;
                    }
                    sb.append(ajsj.e(list3, charset3));
                }
            }
        }
        if (this.n != null) {
            sb.append("#");
            sb.append(this.n);
        } else if (this.m != null) {
            sb.append("#");
            String str6 = this.m;
            Charset charset4 = this.k;
            if (charset4 == null) {
                charset4 = ajox.a;
            }
            sb.append(ajsj.b(str6, charset4, ajsj.c, false));
        }
        return sb.toString();
    }

    public final URI a() throws URISyntaxException {
        return new URI(h());
    }

    public final List b() {
        List list = this.h;
        return list != null ? new ArrayList(list) : new ArrayList();
    }

    public final void c() {
        this.m = null;
        this.n = null;
    }

    public final void d(String str) {
        this.f = str;
        this.b = null;
        this.c = null;
    }

    public final void e(List list) {
        this.h = (list == null || list.size() <= 0) ? null : new ArrayList(list);
        this.b = null;
        this.g = null;
    }

    public final void f(String... strArr) {
        this.h = Arrays.asList(strArr);
        this.b = null;
        this.g = null;
    }

    public final void g(int i) {
        if (i < 0) {
            i = -1;
        }
        this.l = i;
        this.b = null;
        this.c = null;
    }

    public final String toString() {
        return h();
    }
}
