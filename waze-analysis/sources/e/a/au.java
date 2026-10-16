package e.a;

import j$.util.concurrent.ConcurrentHashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.ConcurrentNavigableMap;
import java.util.concurrent.ConcurrentSkipListMap;
import java.util.logging.Logger;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class au {

    /* renamed from: a, reason: collision with root package name */
    private static final Logger f46289a = Logger.getLogger(au.class.getName());

    /* renamed from: b, reason: collision with root package name */
    private static final au f46290b = new au();

    /* renamed from: c, reason: collision with root package name */
    private final ConcurrentNavigableMap f46291c;

    /* renamed from: d, reason: collision with root package name */
    private final ConcurrentMap f46292d;

    /* renamed from: e, reason: collision with root package name */
    private final ConcurrentMap f46293e;

    public au() {
        new ConcurrentSkipListMap();
        this.f46291c = new ConcurrentSkipListMap();
        this.f46292d = new ConcurrentHashMap();
        this.f46293e = new ConcurrentHashMap();
        new ConcurrentHashMap();
    }

    public static au a() {
        return f46290b;
    }

    private static void i(Map map, ay ayVar) {
    }

    private static void j(Map map, ay ayVar) {
    }

    public final void c(ay ayVar) {
        i(this.f46293e, ayVar);
    }

    public final void d(ay ayVar) {
        i(this.f46291c, ayVar);
    }

    public final void e(ay ayVar) {
        i(this.f46292d, ayVar);
    }

    public final void f(ay ayVar) {
        j(this.f46293e, ayVar);
    }

    public final void g(ay ayVar) {
        j(this.f46291c, ayVar);
    }

    public final void h(ay ayVar) {
        j(this.f46292d, ayVar);
    }
}
