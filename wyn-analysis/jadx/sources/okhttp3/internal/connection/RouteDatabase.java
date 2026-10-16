package okhttp3.internal.connection;

import java.util.LinkedHashSet;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC3340k;
import okhttp3.Route;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lokhttp3/internal/connection/RouteDatabase;", "", "<init>", "()V", "okhttp"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class RouteDatabase {

    /* renamed from: a, reason: collision with root package name */
    public final LinkedHashSet f42622a = new LinkedHashSet();

    public final synchronized void a(Route route) {
        AbstractC3340k.e(route, "route");
        this.f42622a.remove(route);
    }
}
