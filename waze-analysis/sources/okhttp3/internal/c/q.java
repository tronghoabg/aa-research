package okhttp3.internal.c;

import androidx.core.app.NotificationCompat;
import h.g.b.x;
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
import java.util.Objects;
import okhttp3.ab;
import okhttp3.au;
import okhttp3.w;

/* compiled from: WazeSource */
/* loaded from: classes8.dex */
public final class q {

    /* renamed from: a, reason: collision with root package name */
    private final okhttp3.a f56051a;

    /* renamed from: b, reason: collision with root package name */
    private final okhttp3.f f56052b;

    /* renamed from: c, reason: collision with root package name */
    private List f56053c;

    /* renamed from: d, reason: collision with root package name */
    private int f56054d;

    /* renamed from: e, reason: collision with root package name */
    private List f56055e;

    /* renamed from: f, reason: collision with root package name */
    private final List f56056f;

    /* renamed from: g, reason: collision with root package name */
    private final com.waze.shared_infra.s.c f56057g;

    public q(okhttp3.a aVar, com.waze.shared_infra.s.c cVar, okhttp3.f fVar, w wVar) {
        List listO;
        x.f(aVar, "address");
        x.f(cVar, "routeDatabase");
        x.f(fVar, NotificationCompat.CATEGORY_CALL);
        x.f(wVar, "eventListener");
        this.f56051a = aVar;
        this.f56057g = cVar;
        this.f56052b = fVar;
        this.f56053c = h.a.i.h();
        this.f56055e = h.a.i.h();
        this.f56056f = new ArrayList();
        ab abVarJ = aVar.j();
        x.f(fVar, NotificationCompat.CATEGORY_CALL);
        x.f(abVarJ, "url");
        URI uriI = abVarJ.i();
        if (uriI.getHost() == null) {
            listO = okhttp3.internal.b.o(Proxy.NO_PROXY);
        } else {
            List<Proxy> listSelect = aVar.a().select(uriI);
            List<Proxy> list = listSelect;
            listO = (list == null || list.isEmpty()) ? okhttp3.internal.b.o(Proxy.NO_PROXY) : okhttp3.internal.b.p(listSelect);
        }
        this.f56053c = listO;
        this.f56054d = 0;
        x.f(fVar, NotificationCompat.CATEGORY_CALL);
        x.f(abVarJ, "url");
        x.f(listO, "proxies");
    }

    private final boolean c() {
        return this.f56054d < this.f56053c.size();
    }

    public final boolean a() {
        return c() || !this.f56056f.isEmpty();
    }

    public final com.google.firebase.d.c.b b() throws SocketException, UnknownHostException {
        String strF;
        int iA;
        List listD;
        if (!a()) {
            throw new NoSuchElementException();
        }
        ArrayList arrayList = new ArrayList();
        while (c()) {
            if (!c()) {
                throw new SocketException("No route to " + this.f56051a.j().f() + "; exhausted proxy configurations: " + this.f56053c);
            }
            List list = this.f56053c;
            int i2 = this.f56054d;
            this.f56054d = i2 + 1;
            Proxy proxy = (Proxy) list.get(i2);
            ArrayList arrayList2 = new ArrayList();
            this.f56055e = arrayList2;
            if (proxy.type() == Proxy.Type.DIRECT || proxy.type() == Proxy.Type.SOCKS) {
                okhttp3.a aVar = this.f56051a;
                strF = aVar.j().f();
                iA = aVar.j().a();
            } else {
                SocketAddress socketAddressAddress = proxy.address();
                if (!(socketAddressAddress instanceof InetSocketAddress)) {
                    Class<?> cls = socketAddressAddress.getClass();
                    Objects.toString(cls);
                    throw new IllegalArgumentException("Proxy.address() is not an InetSocketAddress: ".concat(String.valueOf(cls)));
                }
                InetSocketAddress inetSocketAddress = (InetSocketAddress) socketAddressAddress;
                x.f(inetSocketAddress, "<this>");
                InetAddress address = inetSocketAddress.getAddress();
                if (address == null) {
                    strF = inetSocketAddress.getHostName();
                    x.e(strF, "getHostName(...)");
                } else {
                    strF = address.getHostAddress();
                    x.e(strF, "getHostAddress(...)");
                }
                iA = inetSocketAddress.getPort();
            }
            if (iA <= 0 || iA >= 65536) {
                throw new SocketException("No route to " + strF + ":" + iA + "; port is out of range");
            }
            if (proxy.type() == Proxy.Type.SOCKS) {
                arrayList2.add(InetSocketAddress.createUnresolved(strF, iA));
            } else {
                if (okhttp3.internal.b.u(strF)) {
                    listD = h.a.i.d(InetAddress.getByName(strF));
                } else {
                    okhttp3.f fVar = this.f56052b;
                    x.f(fVar, NotificationCompat.CATEGORY_CALL);
                    x.f(strF, "domainName");
                    okhttp3.a aVar2 = this.f56051a;
                    List listD2 = aVar2.i().d(strF);
                    if (listD2.isEmpty()) {
                        throw new UnknownHostException(aVar2.i() + " returned no addresses for " + strF);
                    }
                    x.f(fVar, NotificationCompat.CATEGORY_CALL);
                    x.f(strF, "domainName");
                    x.f(listD2, "inetAddressList");
                    listD = listD2;
                }
                Iterator it = listD.iterator();
                while (it.hasNext()) {
                    arrayList2.add(new InetSocketAddress((InetAddress) it.next(), iA));
                }
            }
            Iterator it2 = this.f56055e.iterator();
            while (it2.hasNext()) {
                au auVar = new au(this.f56051a, proxy, (InetSocketAddress) it2.next());
                if (this.f56057g.g(auVar)) {
                    this.f56056f.add(auVar);
                } else {
                    arrayList.add(auVar);
                }
            }
            if (!arrayList.isEmpty()) {
                break;
            }
        }
        if (arrayList.isEmpty()) {
            List list2 = this.f56056f;
            h.a.i.aD(arrayList, list2);
            list2.clear();
        }
        return new com.google.firebase.d.c.b(arrayList);
    }
}
