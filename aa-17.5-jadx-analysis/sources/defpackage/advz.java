package defpackage;

import java.net.SocketAddress;
import java.net.URI;
import java.util.Collection;
import java.util.Collections;

/* loaded from: classes.dex */
final class advz extends adms {
    final SocketAddress a;
    final String b;
    final Collection c;

    public advz(SocketAddress socketAddress, String str) {
        this.a = socketAddress;
        this.b = str;
        this.c = Collections.singleton(socketAddress.getClass());
    }

    @Override // defpackage.admo
    public final admr b(URI uri, admm admmVar) {
        return new advy(this);
    }

    @Override // defpackage.admo
    public final String c() {
        return "directaddress";
    }

    @Override // defpackage.adms
    protected final int d() {
        return 5;
    }

    @Override // defpackage.adms
    public final Collection e() {
        return this.c;
    }

    @Override // defpackage.adms
    protected final void f() {
    }
}
