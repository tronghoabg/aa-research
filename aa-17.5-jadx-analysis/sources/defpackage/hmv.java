package defpackage;

import java.util.List;

/* loaded from: classes2.dex */
public final class hmv implements gmw {
    public final String a;
    public final List b;
    public final boolean c;
    public final boolean d;
    public final boolean e;
    public final List f;

    public hmv(String str, List list, boolean z, boolean z2, boolean z3, List list2) {
        this.a = str;
        this.b = list;
        this.c = z;
        this.d = z2;
        this.e = z3;
        this.f = list2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof hmv)) {
            return false;
        }
        hmv hmvVar = (hmv) obj;
        return affa.f(this.a, hmvVar.a) && affa.f(this.b, hmvVar.b) && this.c == hmvVar.c && this.d == hmvVar.d && this.e == hmvVar.e && affa.f(this.f, hmvVar.f);
    }

    public final int hashCode() {
        String str = this.a;
        int iHashCode = str == null ? 0 : str.hashCode();
        List list = this.b;
        return (((((((((iHashCode * 31) + (list != null ? list.hashCode() : 0)) * 31) + a.f(this.c)) * 31) + a.f(this.d)) * 31) + a.f(this.e)) * 31) + this.f.hashCode();
    }

    public final String toString() {
        return "WebViewTemplateInternal(url=" + this.a + ", actionStrip=" + this.b + ", isDomStorageEnabled=" + this.c + ", shouldBlockNetworkLoads=" + this.d + ", isJavascriptEnabled=" + this.e + ", urlsToOpenOnPhone=" + this.f + ")";
    }
}
