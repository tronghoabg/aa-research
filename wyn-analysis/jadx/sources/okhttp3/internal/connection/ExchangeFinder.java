package okhttp3.internal.connection;

import java.io.IOException;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC3340k;
import okhttp3.Address;
import okhttp3.EventListener;
import okhttp3.HttpUrl;
import okhttp3.Route;
import okhttp3.internal.connection.RouteSelector;
import okhttp3.internal.http2.ConnectionShutdownException;
import okhttp3.internal.http2.ErrorCode;
import okhttp3.internal.http2.StreamResetException;

@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lokhttp3/internal/connection/ExchangeFinder;", "", "okhttp"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class ExchangeFinder {

    /* renamed from: a, reason: collision with root package name */
    public final RealConnectionPool f42567a;

    /* renamed from: b, reason: collision with root package name */
    public final Address f42568b;

    /* renamed from: c, reason: collision with root package name */
    public final RealCall f42569c;

    /* renamed from: d, reason: collision with root package name */
    public final EventListener f42570d;

    /* renamed from: e, reason: collision with root package name */
    public RouteSelector.Selection f42571e;

    /* renamed from: f, reason: collision with root package name */
    public RouteSelector f42572f;

    /* renamed from: g, reason: collision with root package name */
    public int f42573g;

    /* renamed from: h, reason: collision with root package name */
    public int f42574h;

    /* renamed from: i, reason: collision with root package name */
    public int f42575i;

    /* renamed from: j, reason: collision with root package name */
    public Route f42576j;

    public ExchangeFinder(RealConnectionPool connectionPool, Address address, RealCall call, EventListener eventListener) {
        AbstractC3340k.e(connectionPool, "connectionPool");
        AbstractC3340k.e(call, "call");
        AbstractC3340k.e(eventListener, "eventListener");
        this.f42567a = connectionPool;
        this.f42568b = address;
        this.f42569c = call;
        this.f42570d = eventListener;
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x007c  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x013b  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x015a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final okhttp3.internal.connection.RealConnection a(int r13, int r14, int r15, boolean r16, boolean r17) throws java.io.IOException {
        /*
            Method dump skipped, instructions count: 472
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: okhttp3.internal.connection.ExchangeFinder.a(int, int, int, boolean, boolean):okhttp3.internal.connection.RealConnection");
    }

    public final boolean b(HttpUrl url) {
        AbstractC3340k.e(url, "url");
        HttpUrl httpUrl = this.f42568b.f42144h;
        return url.f42277e == httpUrl.f42277e && AbstractC3340k.a(url.f42276d, httpUrl.f42276d);
    }

    public final void c(IOException e7) {
        AbstractC3340k.e(e7, "e");
        this.f42576j = null;
        if (e7 instanceof StreamResetException) {
            if (((StreamResetException) e7).f42854a == ErrorCode.REFUSED_STREAM) {
                this.f42573g++;
                return;
            }
        }
        if (e7 instanceof ConnectionShutdownException) {
            this.f42574h++;
        } else {
            this.f42575i++;
        }
    }
}
