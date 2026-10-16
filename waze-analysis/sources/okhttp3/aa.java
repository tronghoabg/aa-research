package okhttp3;

import androidx.autofill.HintConstants;
import androidx.webkit.ProxyConfig;
import com.waze.strings.DisplayStrings;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* compiled from: WazeSource */
/* loaded from: classes8.dex */
public final class aa {

    /* renamed from: a, reason: collision with root package name */
    private String f55809a;

    /* renamed from: d, reason: collision with root package name */
    private String f55812d;

    /* renamed from: f, reason: collision with root package name */
    private final List f55814f;

    /* renamed from: g, reason: collision with root package name */
    private List f55815g;

    /* renamed from: h, reason: collision with root package name */
    private String f55816h;

    /* renamed from: b, reason: collision with root package name */
    private String f55810b = "";

    /* renamed from: c, reason: collision with root package name */
    private String f55811c = "";

    /* renamed from: e, reason: collision with root package name */
    private int f55813e = -1;

    public aa() {
        ArrayList arrayList = new ArrayList();
        this.f55814f = arrayList;
        arrayList.add("");
    }

    private final int u() {
        int i2 = this.f55813e;
        if (i2 != -1) {
            return i2;
        }
        int i3 = ab.f55817a;
        String str = this.f55809a;
        h.g.b.x.c(str);
        return kotlinx.b.a.b.B(str);
    }

    private final void v(String str, int i2, int i3, boolean z, boolean z2) {
        int i4 = ab.f55817a;
        String strF = kotlinx.b.a.b.F(str, i2, i3, " \"<>^`{}|/\\?#", z2, false, false, false, 240);
        if (h.g.b.x.n(strF, ".") || h.n.o.m(strF, "%2e", true)) {
            return;
        }
        if (h.g.b.x.n(strF, "..") || h.n.o.m(strF, "%2e.", true) || h.n.o.m(strF, ".%2e", true) || h.n.o.m(strF, "%2e%2e", true)) {
            List list = this.f55814f;
            if (((String) list.remove(list.size() - 1)).length() != 0 || list.isEmpty()) {
                list.add("");
                return;
            } else {
                list.set(list.size() - 1, "");
                return;
            }
        }
        List list2 = this.f55814f;
        if (((CharSequence) list2.get(list2.size() - 1)).length() == 0) {
            list2.set(list2.size() - 1, strF);
        } else {
            list2.add(strF);
        }
        if (z) {
            list2.add("");
        }
    }

    public final List a() {
        return this.f55814f;
    }

    public final aa b(String str) {
        h.g.b.x.f(str, "host");
        int i2 = ab.f55817a;
        String strD = kotlinx.b.d.aa.d(kotlinx.b.a.b.D(str, 0, 0, false, 7));
        if (strD == null) {
            throw new IllegalArgumentException("unexpected host: ".concat(str));
        }
        this.f55812d = strD;
        return this;
    }

    public final aa c(int i2) {
        if (i2 > 0) {
            this.f55813e = i2;
            return this;
        }
        throw new IllegalArgumentException("unexpected port: " + i2);
    }

    public final aa d() {
        String strF;
        String str = this.f55812d;
        String strF2 = null;
        this.f55812d = str != null ? new h.n.l("[\"<>^`{|}]").b(str, "") : null;
        List list = this.f55814f;
        int size = list.size();
        for (int i2 = 0; i2 < size; i2++) {
            int i3 = ab.f55817a;
            list.set(i2, kotlinx.b.a.b.F((String) list.get(i2), 0, 0, "[]", true, true, false, false, DisplayStrings.DS_TRIP_OVERVIEW_PERSONALIZATION_LOADER_MESSAGE_TWO_WHEELER_6));
        }
        List list2 = this.f55815g;
        if (list2 != null) {
            int size2 = list2.size();
            for (int i4 = 0; i4 < size2; i4++) {
                String str2 = (String) list2.get(i4);
                if (str2 != null) {
                    int i5 = ab.f55817a;
                    strF = kotlinx.b.a.b.F(str2, 0, 0, "\\^`{|}", true, true, true, false, DisplayStrings.DS_TRIP_OVERVIEW_BADGE_HAZARD);
                } else {
                    strF = null;
                }
                list2.set(i4, strF);
            }
        }
        String str3 = this.f55816h;
        if (str3 != null) {
            int i6 = ab.f55817a;
            strF2 = kotlinx.b.a.b.F(str3, 0, 0, " \"#<>\\^`{|}", true, true, false, true, 163);
        }
        this.f55816h = strF2;
        return this;
    }

    public final aa e(int i2) {
        List list = this.f55814f;
        list.remove(i2);
        if (list.isEmpty()) {
            list.add("");
        }
        return this;
    }

    public final aa f(String str) {
        h.g.b.x.f(str, "scheme");
        if (h.n.o.m(str, ProxyConfig.MATCH_HTTP, true)) {
            this.f55809a = ProxyConfig.MATCH_HTTP;
            return this;
        }
        if (!h.n.o.m(str, ProxyConfig.MATCH_HTTPS, true)) {
            throw new IllegalArgumentException("unexpected scheme: ".concat(str));
        }
        this.f55809a = ProxyConfig.MATCH_HTTPS;
        return this;
    }

    public final ab g() {
        ArrayList arrayList;
        String str = this.f55809a;
        if (str == null) {
            throw new IllegalStateException("scheme == null");
        }
        int i2 = ab.f55817a;
        String strD = kotlinx.b.a.b.D(this.f55810b, 0, 0, false, 7);
        String strD2 = kotlinx.b.a.b.D(this.f55811c, 0, 0, false, 7);
        String str2 = this.f55812d;
        if (str2 == null) {
            throw new IllegalStateException("host == null");
        }
        int iU = u();
        List list = this.f55814f;
        ArrayList arrayList2 = new ArrayList(h.a.i.q(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList2.add(kotlinx.b.a.b.D((String) it.next(), 0, 0, false, 7));
        }
        ArrayList arrayList3 = arrayList2;
        List list2 = this.f55815g;
        if (list2 != null) {
            List<String> list3 = list2;
            ArrayList arrayList4 = new ArrayList(h.a.i.q(list3, 10));
            for (String str3 : list3) {
                arrayList4.add(str3 != null ? kotlinx.b.a.b.D(str3, 0, 0, true, 3) : null);
            }
            arrayList = arrayList4;
        } else {
            arrayList = null;
        }
        String str4 = this.f55816h;
        return new ab(str, strD, strD2, str2, iU, arrayList3, arrayList, str4 != null ? kotlinx.b.a.b.D(str4, 0, 0, false, 7) : null, toString());
    }

    public final void h(String str) {
        this.f55816h = str;
    }

    public final void i(String str) {
        h.g.b.x.f(str, "<set-?>");
        this.f55811c = str;
    }

    public final void j(String str) {
        h.g.b.x.f(str, "<set-?>");
        this.f55810b = str;
    }

    public final void k(String str) {
        this.f55812d = str;
    }

    public final void l(int i2) {
        this.f55813e = i2;
    }

    public final void m(String str) {
        this.f55809a = str;
    }

    public final aa n() {
        h.g.b.x.f("static", "pathSegment");
        v("static", 0, 6, false, false);
        return this;
    }

    public final void o(String str) {
        List listE = null;
        if (str != null) {
            int i2 = ab.f55817a;
            String strF = kotlinx.b.a.b.F(str, 0, 0, " \"'<>#", true, false, true, false, DisplayStrings.DS_TRIP_OVERVIEW_PERSONALIZATION_LOADER_MESSAGE_NEW_USER_2);
            if (strF != null) {
                listE = kotlinx.b.a.b.E(strF);
            }
        }
        this.f55815g = listE;
    }

    public final aa p() {
        this.f55816h = null;
        return this;
    }

    /* JADX WARN: Removed duplicated region for block: B:4:0x0026  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void q(okhttp3.ab r26, java.lang.String r27) {
        /*
            Method dump skipped, instructions count: 838
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: okhttp3.aa.q(okhttp3.ab, java.lang.String):void");
    }

    public final aa r() {
        h.g.b.x.f("", HintConstants.AUTOFILL_HINT_PASSWORD);
        int i2 = ab.f55817a;
        this.f55811c = kotlinx.b.a.b.F("", 0, 0, " \"':;<=>@[]^`{}|/\\?#", false, false, false, false, 251);
        return this;
    }

    public final aa s() {
        this.f55815g = null;
        return this;
    }

    public final aa t() {
        h.g.b.x.f("", HintConstants.AUTOFILL_HINT_USERNAME);
        int i2 = ab.f55817a;
        this.f55810b = kotlinx.b.a.b.F("", 0, 0, " \"':;<=>@[]^`{}|/\\?#", false, false, false, false, 251);
        return this;
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x0089  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.String toString() {
        /*
            Method dump skipped, instructions count: 294
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: okhttp3.aa.toString():java.lang.String");
    }
}
