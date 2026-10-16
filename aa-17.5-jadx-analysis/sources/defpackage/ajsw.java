package defpackage;

import java.net.InetAddress;
import java.net.InetSocketAddress;

@Deprecated
/* loaded from: classes2.dex */
public final class ajsw extends InetSocketAddress {
    private static final long serialVersionUID = -6650701828361907957L;
    public final ajpe a;

    public ajsw(ajpe ajpeVar, InetAddress inetAddress, int i) {
        super(inetAddress, i);
        ahgm.e(ajpeVar, "HTTP host");
        this.a = ajpeVar;
    }

    @Override // java.net.InetSocketAddress
    public final String toString() {
        return this.a.a + ":" + getPort();
    }
}
