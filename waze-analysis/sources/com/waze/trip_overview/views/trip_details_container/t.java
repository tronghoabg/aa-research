package com.waze.trip_overview.views.trip_details_container;

import com.waze.R;
import com.waze.config.ConfigValues;
import h.ab;
import h.g.b.x;
import java.util.ArrayList;
import java.util.List;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class t {

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int f41597a = 0;

    /* renamed from: b, reason: collision with root package name */
    private static final Boolean f41598b = ConfigValues.CONFIG_VALUE_ECO_REGULATIONS_FEATURE_ENABLED.b();

    /* renamed from: c, reason: collision with root package name */
    private static final Boolean f41599c = ConfigValues.CONFIG_VALUE_ECO_REGULATIONS_TRIP_OVERVIEW_ALTERNATIVE_TRANSPORT_FOOTER_ENABLED.b();

    /* renamed from: d, reason: collision with root package name */
    private static final Boolean f41600d = ConfigValues.CONFIG_VALUE_ECO_REGULATIONS_TRIP_OVERVIEW_ALTERNATIVE_TRANSPORT_FOOTER_CLICKABLE.b();

    /* renamed from: e, reason: collision with root package name */
    private static final Boolean f41601e = ConfigValues.CONFIG_VALUE_ECO_REGULATIONS_TRIP_OVERVIEW_CARBON_EMISSION_FOOTER_ENABLED.b();

    /* renamed from: f, reason: collision with root package name */
    private static final Long f41602f = ConfigValues.CONFIG_VALUE_ECO_REGULATIONS_TRIP_OVERVIEW_ALTERNATIVE_TRANSPORT_FOOTER_LOW_RANGE_KM.b();

    /* renamed from: g, reason: collision with root package name */
    private static final Long f41603g = ConfigValues.CONFIG_VALUE_ECO_REGULATIONS_TRIP_OVERVIEW_ALTERNATIVE_TRANSPORT_FOOTER_MID_RANGE_KM.b();

    public static final List a(int i2, h.g.a.l lVar) {
        x.f(lVar, "actions");
        if (!f41598b.booleanValue()) {
            return h.a.i.h();
        }
        ArrayList arrayList = new ArrayList();
        if (f41601e.booleanValue()) {
            arrayList.add(new h(R.drawable.icon_outline_leaf_16px, R.string.TRIP_OVERVIEW_ECO_REGULATIONS_CARBON_EMISSION_LINK, new com.waze.settings.g.a.b(lVar, 11), null));
        }
        if (f41599c.booleanValue()) {
            double dC = c(i2 / 1000.0f);
            Long l2 = f41602f;
            a aVar = dC <= ((double) l2.longValue()) ? new a(R.drawable.icon_outline_bicycle_16px, R.string.TRIP_OVERVIEW_ECO_REGULATIONS_ALTERNATIVE_TRANSPORT_BICYCLE) : (dC <= ((double) l2.longValue()) || dC > ((double) f41603g.longValue())) ? new a(R.drawable.carpool_driver_outline_16px, R.string.TRIP_OVERVIEW_ECO_REGULATIONS_ALTERNATIVE_TRANSPORT_RIDE_SHARING) : new a(R.drawable.icon_outline_train_16px, R.string.TRIP_OVERVIEW_ECO_REGULATIONS_ALTERNATIVE_TRANSPORT_PUBLIC_TRANSPORT);
            arrayList.add(new h(aVar.a(), aVar.b(), new s(lVar, 0), Integer.valueOf(R.string.TRIP_OVERVIEW_ECO_REGULATIONS_ALTERNATIVE_TRANSPORT_HASH_TAG)));
        }
        return arrayList;
    }

    static final ab b(h.g.a.l lVar) {
        if (f41600d.booleanValue()) {
            lVar.invoke(b.f41556a);
        }
        return ab.f48028a;
    }

    private static final double c(float f2) {
        return h.h.a.c(f2 * r2) / Math.pow(10.0d, 1.0d);
    }
}
