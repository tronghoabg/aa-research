package okhttp3.internal.connection;

import ff.t;
import ff.v;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.Proxy;
import java.net.SocketAddress;
import java.net.SocketException;
import java.net.URI;
import java.net.UnknownHostException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC3340k;
import okhttp3.Address;
import okhttp3.Call;
import okhttp3.EventListener;
import okhttp3.HttpUrl;
import okhttp3.Route;
import okhttp3.internal.Util;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\u0018\u00002\u00020\u0001:\u0002\u0002\u0003¨\u0006\u0004"}, d2 = {"Lokhttp3/internal/connection/RouteSelector;", "", "Companion", "Selection", "okhttp"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class RouteSelector {

    /* renamed from: i, reason: collision with root package name */
    public static final Companion f42625i = new Companion(0);

    /* renamed from: a, reason: collision with root package name */
    public final Address f42626a;

    /* renamed from: b, reason: collision with root package name */
    public final RouteDatabase f42627b;

    /* renamed from: c, reason: collision with root package name */
    public final Call f42628c;

    /* renamed from: d, reason: collision with root package name */
    public final EventListener f42629d;

    /* renamed from: e, reason: collision with root package name */
    public final List f42630e;

    /* renamed from: f, reason: collision with root package name */
    public int f42631f;

    /* renamed from: g, reason: collision with root package name */
    public Object f42632g;

    /* renamed from: h, reason: collision with root package name */
    public final ArrayList f42633h;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lokhttp3/internal/connection/RouteSelector$Companion;", "", "<init>", "()V", "okhttp"}, k = 1, mv = {1, 6, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(int i5) {
            this();
        }

        private Companion() {
        }
    }

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lokhttp3/internal/connection/RouteSelector$Selection;", "", "okhttp"}, k = 1, mv = {1, 6, 0}, xi = 48)
    public static final class Selection {

        /* renamed from: a, reason: collision with root package name */
        public final ArrayList f42634a;

        /* renamed from: b, reason: collision with root package name */
        public int f42635b;

        public Selection(ArrayList arrayList) {
            this.f42634a = arrayList;
        }

        public final boolean a() {
            return this.f42635b < this.f42634a.size();
        }
    }

    public RouteSelector(Address address, RouteDatabase routeDatabase, Call call, EventListener eventListener) {
        List listK;
        AbstractC3340k.e(routeDatabase, "routeDatabase");
        AbstractC3340k.e(call, "call");
        AbstractC3340k.e(eventListener, "eventListener");
        this.f42626a = address;
        this.f42627b = routeDatabase;
        this.f42628c = call;
        this.f42629d = eventListener;
        v vVar = v.f35432a;
        this.f42630e = vVar;
        this.f42632g = vVar;
        this.f42633h = new ArrayList();
        HttpUrl url = address.f42144h;
        AbstractC3340k.e(url, "url");
        URI uriI = url.i();
        if (uriI.getHost() == null) {
            listK = Util.k(Proxy.NO_PROXY);
        } else {
            List<Proxy> proxiesOrNull = address.f42143g.select(uriI);
            List<Proxy> list = proxiesOrNull;
            if (list == null || list.isEmpty()) {
                listK = Util.k(Proxy.NO_PROXY);
            } else {
                AbstractC3340k.d(proxiesOrNull, "proxiesOrNull");
                listK = Util.x(proxiesOrNull);
            }
        }
        this.f42630e = listK;
        this.f42631f = 0;
    }

    public final boolean a() {
        return this.f42631f < this.f42630e.size() || !this.f42633h.isEmpty();
    }

    /* JADX WARN: Type inference failed for: r2v14, types: [java.lang.Object, java.util.List] */
    public final Selection b() throws SocketException, UnknownHostException {
        String domainName;
        int port;
        boolean zContains;
        if (!a()) {
            throw new NoSuchElementException();
        }
        ArrayList arrayList = new ArrayList();
        while (this.f42631f < this.f42630e.size()) {
            boolean z2 = this.f42631f < this.f42630e.size();
            Address address = this.f42626a;
            if (!z2) {
                throw new SocketException("No route to " + address.f42144h.f42276d + "; exhausted proxy configurations: " + this.f42630e);
            }
            List list = this.f42630e;
            int i5 = this.f42631f;
            this.f42631f = i5 + 1;
            Proxy proxy = (Proxy) list.get(i5);
            ArrayList arrayList2 = new ArrayList();
            this.f42632g = arrayList2;
            if (proxy.type() == Proxy.Type.DIRECT || proxy.type() == Proxy.Type.SOCKS) {
                HttpUrl httpUrl = address.f42144h;
                domainName = httpUrl.f42276d;
                port = httpUrl.f42277e;
            } else {
                SocketAddress proxyAddress = proxy.address();
                if (!(proxyAddress instanceof InetSocketAddress)) {
                    throw new IllegalArgumentException(AbstractC3340k.k(proxyAddress.getClass(), "Proxy.address() is not an InetSocketAddress: ").toString());
                }
                AbstractC3340k.d(proxyAddress, "proxyAddress");
                InetSocketAddress inetSocketAddress = (InetSocketAddress) proxyAddress;
                f42625i.getClass();
                AbstractC3340k.e(inetSocketAddress, "<this>");
                InetAddress address2 = inetSocketAddress.getAddress();
                if (address2 == null) {
                    domainName = inetSocketAddress.getHostName();
                    AbstractC3340k.d(domainName, "hostName");
                } else {
                    domainName = address2.getHostAddress();
                    AbstractC3340k.d(domainName, "address.hostAddress");
                }
                port = inetSocketAddress.getPort();
            }
            if (1 > port || port >= 65536) {
                throw new SocketException("No route to " + domainName + ':' + port + "; port is out of range");
            }
            if (proxy.type() == Proxy.Type.SOCKS) {
                arrayList2.add(InetSocketAddress.createUnresolved(domainName, port));
            } else {
                this.f42629d.getClass();
                Call call = this.f42628c;
                AbstractC3340k.e(call, "call");
                AbstractC3340k.e(domainName, "domainName");
                List listLookup = address.f42137a.lookup(domainName);
                if (listLookup.isEmpty()) {
                    throw new UnknownHostException(address.f42137a + " returned no addresses for " + domainName);
                }
                Iterator it = listLookup.iterator();
                while (it.hasNext()) {
                    arrayList2.add(new InetSocketAddress((InetAddress) it.next(), port));
                }
            }
            Iterator it2 = this.f42632g.iterator();
            while (it2.hasNext()) {
                Route route = new Route(this.f42626a, proxy, (InetSocketAddress) it2.next());
                RouteDatabase routeDatabase = this.f42627b;
                synchronized (routeDatabase) {
                    zContains = routeDatabase.f42622a.contains(route);
                }
                if (zContains) {
                    this.f42633h.add(route);
                } else {
                    arrayList.add(route);
                }
            }
            if (!arrayList.isEmpty()) {
                break;
            }
        }
        if (arrayList.isEmpty()) {
            t.e0(this.f42633h, arrayList);
            this.f42633h.clear();
        }
        return new Selection(arrayList);
    }
}
