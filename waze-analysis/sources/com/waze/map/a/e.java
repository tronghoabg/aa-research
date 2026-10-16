package com.waze.map.a;

import com.waze.install.ah;
import com.waze.map.b.ca;
import com.waze.map.b.ch;
import com.waze.map.b.cj;
import com.waze.map.b.cq;
import com.waze.map.b.ct;
import com.waze.map.b.dm;
import com.waze.map.b.eb;
import com.waze.map.b.ed;
import com.waze.strings.DisplayStrings;
import com.waze.ui.a.l;
import h.g.b.x;
import j$.time.Duration;
import j$.time.temporal.ChronoUnit;
import java.util.Objects;
import kotlinx.coroutines.af;
import kotlinx.coroutines.aj;
import kotlinx.coroutines.b.ai;
import kotlinx.coroutines.b.k;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
public final class e implements com.waze.ui.r.a.b.a {

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int f27920a = 0;

    /* renamed from: b, reason: collision with root package name */
    private static final long f27921b;

    /* renamed from: c, reason: collision with root package name */
    private final com.waze.shared_infra.i.e f27922c;

    /* renamed from: d, reason: collision with root package name */
    private final af f27923d;

    /* renamed from: e, reason: collision with root package name */
    private final ed f27924e;

    static {
        h.o.c cVar = h.o.a.f48264a;
        f27921b = h.o.c.i(100, h.o.d.f48272c);
    }

    public e(com.waze.shared_infra.i.e eVar, cj cjVar) {
        x.f(eVar, "logger");
        x.f(cjVar, "mapControllerFactory");
        this.f27922c = eVar;
        this.f27923d = l.p(this, "LocationPickerStateHolder");
        this.f27924e = cjVar.a(eVar, ch.f28144a);
    }

    public final ed a() {
        return this.f27924e;
    }

    public final com.waze.shared_infra.h.c b() {
        dm dmVar = (dm) this.f27924e.w().d();
        if (dmVar != null) {
            return dmVar.e();
        }
        return null;
    }

    public final Object c(h.c.e eVar) {
        return ai.i(this.f27924e.t(), new a(null), eVar);
    }

    @Override // com.waze.ui.r.a.b.a, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        aj.h(this.f27923d, null);
    }

    public final k d() {
        d dVar = new d(this.f27924e.w());
        Duration durationOfSeconds = Duration.ofSeconds(h.o.a.p(f27921b), h.o.a.e(r1));
        x.e(durationOfSeconds, "toComponents-impl(...)");
        return ai.N(dVar, durationOfSeconds.compareTo(Duration.ZERO) <= 0 ? 0L : durationOfSeconds.compareTo(ChronoUnit.MILLIS.getDuration()) <= 0 ? 1L : (durationOfSeconds.getSeconds() < 9223372036854775L || (durationOfSeconds.getSeconds() == 9223372036854775L && durationOfSeconds.getNano() < 807000000)) ? durationOfSeconds.toMillis() : Long.MAX_VALUE);
    }

    public final void e(com.waze.shared_infra.h.c cVar, float f2) {
        x.f(cVar, "initialCoordinate");
        Objects.toString(cVar);
        this.f27922c.a("start ".concat(cVar.toString()));
        cq cqVar = new cq(cVar, ct.f28166b, 0.0f, Float.valueOf(f2), null, 20);
        ed edVar = this.f27924e;
        ah.e(edVar, new eb(null), cqVar, false, 12);
        ah.d(edVar, null, null, null, new ca(true, null, false, null, null, 1022), null, null, DisplayStrings.DS_TRIP_OVERVIEW_PERSONALIZATION_LOADER_MESSAGE_TWO_WHEELER_2);
    }

    public final void f(com.waze.shared_infra.h.c cVar) {
        x.f(cVar, "coordinate");
        this.f27922c.a("recenterOn " + cVar + ", animated: true");
        ah.e(this.f27924e, new eb(null), new cq(cVar, ct.f28166b, 0.0f, null, null, 28), true, 4);
    }
}
