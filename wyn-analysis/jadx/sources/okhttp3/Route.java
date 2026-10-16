package okhttp3;

import java.net.InetSocketAddress;
import java.net.Proxy;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC3340k;

@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lokhttp3/Route;", "", "okhttp"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class Route {

    /* renamed from: a, reason: collision with root package name */
    public final Address f42427a;

    /* renamed from: b, reason: collision with root package name */
    public final Proxy f42428b;

    /* renamed from: c, reason: collision with root package name */
    public final InetSocketAddress f42429c;

    public Route(Address address, Proxy proxy, InetSocketAddress socketAddress) {
        AbstractC3340k.e(socketAddress, "socketAddress");
        this.f42427a = address;
        this.f42428b = proxy;
        this.f42429c = socketAddress;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof Route)) {
            return false;
        }
        Route route = (Route) obj;
        return AbstractC3340k.a(route.f42427a, this.f42427a) && AbstractC3340k.a(route.f42428b, this.f42428b) && AbstractC3340k.a(route.f42429c, this.f42429c);
    }

    public final int hashCode() {
        return this.f42429c.hashCode() + ((this.f42428b.hashCode() + ((this.f42427a.hashCode() + 527) * 31)) * 31);
    }

    public final String toString() {
        return "Route{" + this.f42429c + '}';
    }
}
