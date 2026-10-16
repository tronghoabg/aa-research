package e.a.d;

import java.net.SocketAddress;
import java.net.URI;
import java.util.Collection;
import java.util.Collections;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
final class ft extends e.a.de {

    /* renamed from: a, reason: collision with root package name */
    final SocketAddress f46957a;

    /* renamed from: b, reason: collision with root package name */
    final String f46958b;

    /* renamed from: c, reason: collision with root package name */
    final Collection f46959c;

    ft(SocketAddress socketAddress, String str) {
        this.f46957a = socketAddress;
        this.f46958b = str;
        this.f46959c = Collections.singleton(socketAddress.getClass());
    }

    @Override // e.a.cz
    public final e.a.dd b(URI uri, e.a.cx cxVar) {
        return new fs(this);
    }

    @Override // e.a.cz
    public final String c() {
        return "directaddress";
    }

    @Override // e.a.de
    protected final int d() {
        return 5;
    }

    @Override // e.a.de
    public final Collection e() {
        return this.f46959c;
    }

    @Override // e.a.de
    protected final void f() {
    }
}
