package e.a.f.a.b;

import androidx.webkit.ProxyConfig;
import com.waze.strings.DisplayStrings;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    private final String f47548a;

    /* renamed from: b, reason: collision with root package name */
    private final int f47549b;

    /* renamed from: c, reason: collision with root package name */
    private final String f47550c;

    /* synthetic */ b(a aVar) {
        this.f47548a = aVar.f47546b;
        this.f47549b = aVar.a();
        this.f47550c = aVar.toString();
    }

    static int a(char c2) {
        if (c2 >= '0' && c2 <= '9') {
            return c2 - '0';
        }
        if (c2 >= 'a' && c2 <= 'f') {
            return c2 - 'W';
        }
        if (c2 < 'A' || c2 > 'F') {
            return -1;
        }
        return c2 - '7';
    }

    public static int b(String str) {
        if (str.equals(ProxyConfig.MATCH_HTTP)) {
            return 80;
        }
        if (str.equals(ProxyConfig.MATCH_HTTPS)) {
            return DisplayStrings.DS_HEAVY;
        }
        return -1;
    }

    public final int c() {
        return this.f47549b;
    }

    public final String d() {
        return this.f47548a;
    }

    public final boolean equals(Object obj) {
        return (obj instanceof b) && ((b) obj).f47550c.equals(this.f47550c);
    }

    public final int hashCode() {
        return this.f47550c.hashCode();
    }

    public final String toString() {
        return this.f47550c;
    }
}
