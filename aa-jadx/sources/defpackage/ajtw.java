package defpackage;

/* JADX INFO: loaded from: classes2.dex */
@java.lang.Deprecated
public final class ajtw extends java.net.InetSocketAddress {
    private static final long serialVersionUID = -6650701828361907957L;
    public final defpackage.ajqe a;

    public ajtw(defpackage.ajqe ajqeVar, java.net.InetAddress inetAddress, int i) {
        super(inetAddress, i);
        defpackage.aguw.e(ajqeVar, "HTTP host");
        this.a = ajqeVar;
    }

    @Override // java.net.InetSocketAddress
    public final java.lang.String toString() {
        return this.a.a + ":" + getPort();
    }
}
