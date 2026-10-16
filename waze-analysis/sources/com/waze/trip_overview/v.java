package com.waze.trip_overview;

import com.waze.config.ConfigValues;
import java.util.ArrayList;
import java.util.List;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class v implements z {

    /* renamed from: a, reason: collision with root package name */
    private final long f41495a;

    /* renamed from: b, reason: collision with root package name */
    private final h.f f41496b;

    public v() {
        Long lB = ConfigValues.CONFIG_VALUE_TRIP_OVERVIEW_VEHICLE_TYPE_SELECTOR_TOOLTIP_MAX_SHOWS.b();
        h.g.b.x.e(lB, "getValue(...)");
        this.f41495a = lB.longValue();
        this.f41496b = h.g.a(new com.waze.bx.a(10));
    }

    @Override // com.waze.trip_overview.z
    public final long a() {
        return this.f41495a;
    }

    @Override // com.waze.trip_overview.z
    public final long b() {
        Long lB = ConfigValues.CONFIG_VALUE_TRIP_OVERVIEW_VEHICLE_TYPE_SELECTOR_TOOLTIP_TIMES_SHOWN.b();
        h.g.b.x.e(lB, "getValue(...)");
        return lB.longValue();
    }

    @Override // com.waze.trip_overview.z
    public final long c() {
        Long lB = ConfigValues.CONFIG_VALUE_TRIP_OVERVIEW_MIN_MINUTES_SAVED_BY_HOV_FOR_DISPLAY.b();
        h.g.b.x.e(lB, "getValue(...)");
        return lB.longValue();
    }

    @Override // com.waze.trip_overview.z
    public final y d() {
        return new y(ConfigValues.CONFIG_VALUE_TRIP_OVERVIEW_START_DRIVE_TIMER_DURATION.b().longValue(), ConfigValues.CONFIG_VALUE_TRIP_OVERVIEW_START_DRIVE_TIMER_GPS_MAX_ACCURACY_THRESHOLD.b().longValue());
    }

    @Override // com.waze.trip_overview.z
    public final List e() {
        String strB = ConfigValues.CONFIG_VALUE_TRIP_OVERVIEW_VEHICLE_TYPE_SELECTOR_OPTIONS.b();
        h.g.b.x.e(strB, "getValue(...)");
        List<String> listAf = h.n.o.af(strB, new String[]{","}, 0, 6);
        ArrayList arrayList = new ArrayList(h.a.i.q(listAf, 10));
        for (String str : listAf) {
            com.waze.modules.c.de deVar = com.waze.modules.c.de.f30053a;
            arrayList.add(com.waze.aj.b.e(h.n.o.v(str).toString()));
        }
        ArrayList arrayList2 = new ArrayList();
        for (Object obj : arrayList) {
            if (((com.waze.modules.c.de) obj) != com.waze.modules.c.de.f30053a) {
                arrayList2.add(obj);
            }
        }
        return h.a.i.aa(arrayList2);
    }

    @Override // com.waze.trip_overview.z
    public final void f(long j2) {
        ConfigValues.CONFIG_VALUE_TRIP_OVERVIEW_VEHICLE_TYPE_SELECTOR_TOOLTIP_TIMES_SHOWN.d(Long.valueOf(j2));
    }

    @Override // com.waze.trip_overview.z
    public final boolean g() {
        Boolean boolB = ConfigValues.CONFIG_VALUE_TRIP_OVERVIEW_PREFERRED_ROUTE_IS_BEST_MESSAGE_CARD_SHOWN.b();
        h.g.b.x.e(boolB, "getValue(...)");
        return boolB.booleanValue();
    }

    @Override // com.waze.trip_overview.z
    public final boolean h() {
        Boolean boolB = ConfigValues.CONFIG_VALUE_TRIP_OVERVIEW_PREFERRED_ROUTE_IS_SLOWER_MESSAGE_CARD_SHOWN.b();
        h.g.b.x.e(boolB, "getValue(...)");
        return boolB.booleanValue();
    }

    @Override // com.waze.trip_overview.z
    public final boolean i() {
        Object value = this.f41496b.getValue();
        h.g.b.x.e(value, "getValue(...)");
        return ((Boolean) value).booleanValue();
    }

    @Override // com.waze.trip_overview.z
    public final boolean j() {
        Boolean boolB = ConfigValues.CONFIG_VALUE_TRIP_OVERVIEW_VEHICLE_TYPE_SELECTOR_INTERACTED.b();
        h.g.b.x.e(boolB, "getValue(...)");
        return boolB.booleanValue();
    }

    @Override // com.waze.trip_overview.z
    public final boolean k() {
        Boolean boolB = ConfigValues.CONFIG_VALUE_TRIP_OVERVIEW_VEHICLE_TYPE_SELECTOR_ENABLED.b();
        h.g.b.x.e(boolB, "getValue(...)");
        return boolB.booleanValue();
    }

    @Override // com.waze.trip_overview.z
    public final boolean l() {
        Boolean boolB = ConfigValues.CONFIG_VALUE_TRIP_OVERVIEW_V2_API_ENABLED.b();
        h.g.b.x.e(boolB, "getValue(...)");
        return boolB.booleanValue();
    }

    @Override // com.waze.trip_overview.z
    public final boolean m() {
        Boolean boolB = ConfigValues.CONFIG_VALUE_TRIP_OVERVIEW_USE_WAZE_MAP_IN_ANDROID_AUTO.b();
        h.g.b.x.e(boolB, "getValue(...)");
        return boolB.booleanValue();
    }

    @Override // com.waze.trip_overview.z
    public final void n() {
    }

    @Override // com.waze.trip_overview.z
    public final void o() {
        ConfigValues.CONFIG_VALUE_TRIP_OVERVIEW_PREFERRED_ROUTE_IS_BEST_MESSAGE_CARD_SHOWN.d(true);
    }

    @Override // com.waze.trip_overview.z
    public final void p() {
        ConfigValues.CONFIG_VALUE_TRIP_OVERVIEW_PREFERRED_ROUTE_IS_SLOWER_MESSAGE_CARD_SHOWN.d(true);
    }

    @Override // com.waze.trip_overview.z
    public final void q() {
        if (h.g.b.x.n(ConfigValues.CONFIG_VALUE_TRIP_OVERVIEW_VEHICLE_TYPE_SELECTOR_INTERACTED.b(), true)) {
            return;
        }
        ConfigValues.CONFIG_VALUE_TRIP_OVERVIEW_VEHICLE_TYPE_SELECTOR_INTERACTED.d(true);
    }

    @Override // com.waze.trip_overview.z
    public final void r() {
    }

    @Override // com.waze.trip_overview.z
    public final com.waze.uid.r s() {
        Boolean boolB = ConfigValues.CONFIG_VALUE_TRIP_OVERVIEW_NO_PREFIX_PERMIT_STRINGS.b();
        return ConfigValues.CONFIG_VALUE_TRIP_OVERVIEW_ALT_PERMIT_STRINGS.b().booleanValue() ? new x(boolB.booleanValue()) : new w(boolB.booleanValue());
    }
}
