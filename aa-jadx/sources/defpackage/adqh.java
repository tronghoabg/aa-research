package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class adqh extends java.net.SocketAddress {
    private static final long serialVersionUID = 0;
    private final int a;

    public adqh(int i) {
        this.a = i;
    }

    public final boolean equals(java.lang.Object obj) {
        return (obj instanceof defpackage.adqh) && this.a == ((defpackage.adqh) obj).a;
    }

    public final int hashCode() {
        return this.a;
    }

    public final java.lang.String toString() {
        return "BoundClientAddress[" + this.a + "]";
    }
}
