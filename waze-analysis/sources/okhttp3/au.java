package okhttp3;

import com.waze.strings.DisplayStrings;
import java.net.InetSocketAddress;
import java.net.Proxy;

/* compiled from: WazeSource */
/* loaded from: classes8.dex */
public final class au {

    /* renamed from: a, reason: collision with root package name */
    private final a f55922a;

    /* renamed from: b, reason: collision with root package name */
    private final Proxy f55923b;

    /* renamed from: c, reason: collision with root package name */
    private final InetSocketAddress f55924c;

    public au(a aVar, Proxy proxy, InetSocketAddress inetSocketAddress) {
        h.g.b.x.f(aVar, "address");
        h.g.b.x.f(proxy, "proxy");
        h.g.b.x.f(inetSocketAddress, "socketAddress");
        this.f55922a = aVar;
        this.f55923b = proxy;
        this.f55924c = inetSocketAddress;
    }

    public final InetSocketAddress a() {
        return this.f55924c;
    }

    public final Proxy b() {
        return this.f55923b;
    }

    public final a c() {
        return this.f55922a;
    }

    public final boolean d() {
        return this.f55922a.f() != null && this.f55923b.type() == Proxy.Type.HTTP;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof au)) {
            return false;
        }
        au auVar = (au) obj;
        return h.g.b.x.n(auVar.f55922a, this.f55922a) && h.g.b.x.n(auVar.f55923b, this.f55923b) && h.g.b.x.n(auVar.f55924c, this.f55924c);
    }

    public final int hashCode() {
        return ((((this.f55922a.hashCode() + DisplayStrings.DS_REPORT_MENU_V2_ANIMAL_ON_SHOULDER_LABEL) * 31) + this.f55923b.hashCode()) * 31) + this.f55924c.hashCode();
    }

    public final String toString() {
        return "Route{" + this.f55924c + "}";
    }
}
