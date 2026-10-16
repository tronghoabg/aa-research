package defpackage;

import java.net.URI;
import java.net.URISyntaxException;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes3.dex */
public final class ajhx {
    public final String a;
    public final String b;
    public final int c;
    public final List d;
    public final String e;
    private final String f;
    private final String g;
    private final String h;

    public ajhx(String str, String str2, String str3, String str4, int i, List list, String str5, String str6) {
        this.a = str;
        this.f = str2;
        this.g = str3;
        this.b = str4;
        this.c = i;
        this.d = list;
        this.h = str5;
        this.e = str6;
    }

    public final String a() {
        if (this.g.length() == 0) {
            return "";
        }
        String str = this.e;
        String strSubstring = str.substring(afyh.D(str, ':', this.a.length() + 3) + 1, afyh.D(str, '@', 0));
        strSubstring.getClass();
        return strSubstring;
    }

    public final String b() {
        int length = this.a.length();
        String str = this.e;
        int iD = afyh.D(str, '/', length + 3);
        String strSubstring = str.substring(iD, ajiq.b(str, "?#", iD, str.length()));
        strSubstring.getClass();
        return strSubstring;
    }

    public final String c() {
        if (this.d == null) {
            return null;
        }
        String str = this.e;
        int iD = afyh.D(str, '?', 0) + 1;
        String strSubstring = str.substring(iD, ajiq.a(str, '#', iD, str.length()));
        strSubstring.getClass();
        return strSubstring;
    }

    public final String d() {
        if (this.f.length() == 0) {
            return "";
        }
        String str = this.a;
        String str2 = this.e;
        int length = str.length() + 3;
        String strSubstring = str2.substring(length, ajiq.b(str2, ":@", length, str2.length()));
        strSubstring.getClass();
        return strSubstring;
    }

    public final String e() {
        ajhw ajhwVarH = h("/...");
        ajhwVarH.getClass();
        ajhwVarH.b = ajmq.b("", 0, 0, " \"':;<=>@[]^`{}|/\\?#", false, false, false, false, 123);
        ajhwVarH.c = ajmq.b("", 0, 0, " \"':;<=>@[]^`{}|/\\?#", false, false, false, false, 123);
        return ajhwVarH.a().e;
    }

    public final boolean equals(Object obj) {
        return (obj instanceof ajhx) && affa.f(((ajhx) obj).e, this.e);
    }

    public final URI f() {
        String strSubstring;
        ajhw ajhwVar = new ajhw();
        String str = this.a;
        ajhwVar.a = str;
        ajhwVar.b = d();
        ajhwVar.c = a();
        ajhwVar.d = this.b;
        int i = this.c;
        if (i == ahde.b(str)) {
            i = -1;
        }
        ajhwVar.e = i;
        List list = ajhwVar.f;
        list.clear();
        list.addAll(g());
        ajhwVar.b(c());
        if (this.h == null) {
            strSubstring = null;
        } else {
            String str2 = this.e;
            strSubstring = str2.substring(afyh.D(str2, '#', 0) + 1);
            strSubstring.getClass();
        }
        ajhwVar.h = strSubstring;
        String str3 = ajhwVar.d;
        ajhwVar.d = str3 != null ? new aisp("[\"<>^`{|}]").b(str3, "") : null;
        int size = list.size();
        for (int i2 = 0; i2 < size; i2++) {
            list.set(i2, ajmq.b((String) list.get(i2), 0, 0, "[]", true, true, false, false, 99));
        }
        List list2 = ajhwVar.g;
        if (list2 != null) {
            int size2 = list2.size();
            for (int i3 = 0; i3 < size2; i3++) {
                String str4 = (String) list2.get(i3);
                list2.set(i3, str4 != null ? ajmq.b(str4, 0, 0, "\\^`{|}", true, true, true, false, 67) : null);
            }
        }
        String str5 = ajhwVar.h;
        ajhwVar.h = str5 != null ? ajmq.b(str5, 0, 0, " \"#<>\\^`{|}", true, true, false, true, 35) : null;
        String string = ajhwVar.toString();
        try {
            return new URI(string);
        } catch (URISyntaxException e) {
            try {
                URI uriCreate = URI.create(new aisp("[\\u0000-\\u001F\\u007F-\\u009F\\p{javaWhitespace}]").b(string, ""));
                uriCreate.getClass();
                return uriCreate;
            } catch (Exception unused) {
                throw new RuntimeException(e);
            }
        }
    }

    public final List g() {
        int length = this.a.length();
        String str = this.e;
        int iD = afyh.D(str, '/', length + 3);
        int iB = ajiq.b(str, "?#", iD, str.length());
        ArrayList arrayList = new ArrayList();
        while (iD < iB) {
            int i = iD + 1;
            int iA = ajiq.a(str, '/', i, iB);
            String strSubstring = str.substring(i, iA);
            strSubstring.getClass();
            arrayList.add(strSubstring);
            iD = iA;
        }
        return arrayList;
    }

    public final ajhw h(String str) {
        try {
            ajhw ajhwVar = new ajhw();
            ajhwVar.c(this, str);
            return ajhwVar;
        } catch (IllegalArgumentException unused) {
            return null;
        }
    }

    public final int hashCode() {
        return this.e.hashCode();
    }

    public final boolean i() {
        return affa.f(this.a, "https");
    }

    public final String toString() {
        return this.e;
    }
}
