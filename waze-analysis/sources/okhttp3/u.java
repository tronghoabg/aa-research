package okhttp3;

import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.List;

/* compiled from: WazeSource */
/* loaded from: classes8.dex */
final class u implements v {
    @Override // okhttp3.v
    public final List d(String str) throws UnknownHostException {
        h.g.b.x.f(str, "hostname");
        try {
            InetAddress[] allByName = InetAddress.getAllByName(str);
            h.g.b.x.e(allByName, "getAllByName(...)");
            return h.a.c.X(allByName);
        } catch (NullPointerException e2) {
            UnknownHostException unknownHostException = new UnknownHostException("Broken system behaviour for dns lookup of ".concat(String.valueOf(str)));
            unknownHostException.initCause(e2);
            throw unknownHostException;
        }
    }
}
