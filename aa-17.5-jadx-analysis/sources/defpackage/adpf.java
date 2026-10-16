package defpackage;

import java.net.SocketAddress;

/* loaded from: classes3.dex */
public final class adpf extends SocketAddress {
    private static final long serialVersionUID = 0;
    private final int a;

    public adpf(int i) {
        this.a = i;
    }

    public final boolean equals(Object obj) {
        return (obj instanceof adpf) && this.a == ((adpf) obj).a;
    }

    public final int hashCode() {
        return this.a;
    }

    public final String toString() {
        return "BoundClientAddress[" + this.a + "]";
    }
}
