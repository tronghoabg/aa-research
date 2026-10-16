package e.a;

import java.net.InetSocketAddress;
import java.net.SocketAddress;
import java.util.Collections;
import java.util.Map;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class ap {

    /* renamed from: a, reason: collision with root package name */
    private SocketAddress f46265a;

    /* renamed from: b, reason: collision with root package name */
    private InetSocketAddress f46266b;

    /* renamed from: c, reason: collision with root package name */
    private final Map f46267c = Collections.EMPTY_MAP;

    /* renamed from: d, reason: collision with root package name */
    private String f46268d;

    /* renamed from: e, reason: collision with root package name */
    private String f46269e;

    /* synthetic */ ap() {
    }

    public final aq a() {
        return new aq(this.f46265a, this.f46266b, this.f46267c, this.f46268d, this.f46269e);
    }

    public final void b(String str) {
        this.f46269e = str;
    }

    public final void c(SocketAddress socketAddress) {
        com.google.d.b.an.C(socketAddress, "proxyAddress");
        this.f46265a = socketAddress;
    }

    public final void d(InetSocketAddress inetSocketAddress) {
        com.google.d.b.an.C(inetSocketAddress, "targetAddress");
        this.f46266b = inetSocketAddress;
    }

    public final void e(String str) {
        this.f46268d = str;
    }
}
