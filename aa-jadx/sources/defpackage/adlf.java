package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class adlf extends defpackage.adod {
    private static final long serialVersionUID = 0;
    public final java.net.SocketAddress a;
    public final java.net.InetSocketAddress b;
    public final java.lang.String c;
    public final java.lang.String d;
    private final java.util.Map e;

    public adlf(java.net.SocketAddress socketAddress, java.net.InetSocketAddress inetSocketAddress, java.util.Map map, java.lang.String str, java.lang.String str2) {
        defpackage.ysr.bn(!((java.net.InetSocketAddress) socketAddress).isUnresolved(), "The proxy address %s is not resolved", socketAddress);
        this.a = socketAddress;
        this.b = inetSocketAddress;
        this.e = map;
        this.c = str;
        this.d = str2;
    }

    public final boolean equals(java.lang.Object obj) {
        if (!(obj instanceof defpackage.adlf)) {
            return false;
        }
        defpackage.adlf adlfVar = (defpackage.adlf) obj;
        return j$.util.Objects.equals(this.a, adlfVar.a) && j$.util.Objects.equals(this.b, adlfVar.b) && j$.util.Objects.equals(this.e, adlfVar.e) && j$.util.Objects.equals(this.c, adlfVar.c) && j$.util.Objects.equals(this.d, adlfVar.d);
    }

    public final int hashCode() {
        return j$.util.Objects.hash(this.a, this.b, this.c, this.d, this.e);
    }

    public final java.lang.String toString() {
        defpackage.xym xymVarBy = defpackage.ysr.by(this);
        xymVarBy.b("proxyAddr", this.a);
        xymVarBy.b("targetAddr", this.b);
        xymVarBy.b("headers", this.e);
        xymVarBy.b("username", this.c);
        xymVarBy.h("hasPassword", this.d != null);
        return xymVarBy.toString();
    }
}
