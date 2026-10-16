package okhttp3;

import androidx.core.app.NotificationCompat;
import java.io.IOException;
import java.net.InetSocketAddress;
import java.net.Proxy;

/* compiled from: WazeSource */
/* loaded from: classes8.dex */
public final class w {

    /* renamed from: a, reason: collision with root package name */
    public static final w f56345a = new w();

    public static final void a(f fVar, InetSocketAddress inetSocketAddress, Proxy proxy) {
        h.g.b.x.f(fVar, NotificationCompat.CATEGORY_CALL);
        h.g.b.x.f(inetSocketAddress, "inetSocketAddress");
        h.g.b.x.f(proxy, "proxy");
    }

    public static final void b(f fVar, okhttp3.internal.c.m mVar) {
        h.g.b.x.f(fVar, NotificationCompat.CATEGORY_CALL);
        h.g.b.x.f(mVar, "connection");
    }

    public static final void c(f fVar, okhttp3.internal.c.m mVar) {
        h.g.b.x.f(fVar, NotificationCompat.CATEGORY_CALL);
        h.g.b.x.f(mVar, "connection");
    }

    public static final void d(f fVar, IOException iOException) {
        h.g.b.x.f(fVar, NotificationCompat.CATEGORY_CALL);
        h.g.b.x.f(iOException, "ioe");
    }

    public static final void e(f fVar) {
        h.g.b.x.f(fVar, NotificationCompat.CATEGORY_CALL);
    }

    public static final void f(f fVar, IOException iOException) {
        h.g.b.x.f(fVar, NotificationCompat.CATEGORY_CALL);
        h.g.b.x.f(iOException, "ioe");
    }
}
