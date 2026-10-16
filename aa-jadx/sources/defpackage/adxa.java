package defpackage;

/* JADX INFO: loaded from: classes.dex */
final class adxa extends defpackage.adnt {
    final java.net.SocketAddress a;
    final java.lang.String b;
    final java.util.Collection c;

    public adxa(java.net.SocketAddress socketAddress, java.lang.String str) {
        this.a = socketAddress;
        this.b = str;
        this.c = java.util.Collections.singleton(socketAddress.getClass());
    }

    @Override // defpackage.adnp
    public final defpackage.adns b(java.net.URI uri, defpackage.adnn adnnVar) {
        return new defpackage.adwz(this);
    }

    @Override // defpackage.adnp
    public final java.lang.String c() {
        return "directaddress";
    }

    @Override // defpackage.adnt
    protected final int d() {
        return 5;
    }

    @Override // defpackage.adnt
    public final java.util.Collection e() {
        return this.c;
    }

    @Override // defpackage.adnt
    protected final void f() {
    }
}
