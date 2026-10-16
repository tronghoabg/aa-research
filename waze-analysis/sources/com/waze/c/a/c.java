package com.waze.c.a;

import com.waze.config.ConfigValues;
import h.f;
import h.g;
import h.g.b.x;
import h.o.d;
import java.util.Iterator;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public final class c implements b {

    /* renamed from: a, reason: collision with root package name */
    private static boolean f18221a;

    /* renamed from: b, reason: collision with root package name */
    private final f f18222b = g.a(new android.support.v4.a.a.c(15));

    @Override // com.waze.c.a.b
    public final long a() {
        h.o.c cVar = h.o.a.f48264a;
        Long lB = ConfigValues.CONFIG_VALUE_ALTERNATIVE_ROUTES_V2_ENTRY_POINT_FTE_ANIMATION_DURATION_SECONDS.b();
        x.e(lB, "getValue(...)");
        return h.o.a.m(h.o.c.j(lB.longValue(), d.f48273d));
    }

    @Override // com.waze.c.a.b
    public final long b() {
        Long lB = ConfigValues.CONFIG_VALUE_GENERAL_MIN_DRIVING_SPEED_KMH.b();
        x.e(lB, "getValue(...)");
        return lB.longValue();
    }

    @Override // com.waze.c.a.b
    public final long c() {
        Long lB = ConfigValues.CONFIG_VALUE_ALTERNATIVE_ROUTES_V2_NUMBER_OF_TIMES_TO_SHOW_FTE.b();
        x.e(lB, "getValue(...)");
        return lB.longValue();
    }

    @Override // com.waze.c.a.b
    public final long d() {
        Long lB = ConfigValues.CONFIG_VALUE_ALTERNATIVE_ROUTES_V2_NUMBER_OF_TIMES_FTE_TOOLTIP_SHOWN.b();
        x.e(lB, "getValue(...)");
        return lB.longValue();
    }

    @Override // com.waze.c.a.b
    public final a e() {
        Object next;
        a aVar = a.f18216a;
        String strB = ConfigValues.CONFIG_VALUE_ALTERNATIVE_ROUTES_V2_DISPLAY_PREFERNCE.b();
        x.e(strB, "getValue(...)");
        x.f(strB, "key");
        Iterator<E> it = a.b().iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            if (x.n(((a) next).a(), strB)) {
                break;
            }
        }
        a aVar2 = (a) next;
        return aVar2 == null ? a.f18217b : aVar2;
    }

    @Override // com.waze.c.a.b
    public final void f() {
        ConfigValues.CONFIG_VALUE_ALTERNATIVE_ROUTES_V2_ENTRY_POINT_BUTTON_TAPPED.d(true);
    }

    @Override // com.waze.c.a.b
    public final void g(a aVar) {
        x.f(aVar, "displayPreference");
        ConfigValues.CONFIG_VALUE_ALTERNATIVE_ROUTES_V2_DISPLAY_PREFERNCE.d(aVar.a());
    }

    @Override // com.waze.c.a.b
    public final void h(long j2) {
        ConfigValues.CONFIG_VALUE_ALTERNATIVE_ROUTES_V2_NUMBER_OF_TIMES_FTE_TOOLTIP_SHOWN.d(Long.valueOf(j2));
    }

    @Override // com.waze.c.a.b
    public final void i() {
        f18221a = true;
    }

    @Override // com.waze.c.a.b
    public final boolean j() {
        return f18221a;
    }

    @Override // com.waze.c.a.b
    public final boolean k() {
        Object value = this.f18222b.getValue();
        x.e(value, "getValue(...)");
        return ((Boolean) value).booleanValue();
    }

    @Override // com.waze.c.a.b
    public final boolean l() {
        return d() < c() && !m();
    }

    @Override // com.waze.c.a.b
    public final boolean m() {
        Boolean boolB = ConfigValues.CONFIG_VALUE_ALTERNATIVE_ROUTES_V2_ENTRY_POINT_BUTTON_TAPPED.b();
        x.e(boolB, "getValue(...)");
        return boolB.booleanValue();
    }
}
