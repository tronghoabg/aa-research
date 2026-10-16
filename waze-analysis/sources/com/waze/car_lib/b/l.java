package com.waze.car_lib.b;

import com.waze.config.ConfigValues;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public final /* synthetic */ class l implements h.g.a.a {

    /* renamed from: a, reason: collision with root package name */
    private final /* synthetic */ int f19108a;

    public /* synthetic */ l(int i2) {
        this.f19108a = i2;
    }

    @Override // h.g.a.a
    public final Object invoke() {
        boolean z = false;
        switch (this.f19108a) {
            case 0:
                return h.ab.f48028a;
            case 1:
                return h.ab.f48028a;
            case 2:
                return h.ab.f48028a;
            case 3:
                return h.ab.f48028a;
            case 4:
                return h.ab.f48028a;
            case 5:
                return h.ab.f48028a;
            case 6:
                return h.ab.f48028a;
            case 7:
                throw null;
            case 8:
                throw null;
            case 9:
                return ConfigValues.CONFIG_VALUE_ALERTS_DEFAULT_ALERTER_TIMEOUT.b();
            case 10:
                return h.ab.f48028a;
            case 11:
                return h.ab.f48028a;
            case 12:
                return h.ab.f48028a;
            case 13:
                String strB = ConfigValues.CONFIG_VALUE_CAR_LIB_INSTRUMENT_CLUSTER_DESTINATION_INFO_DISABLED_OEMS.b();
                h.g.b.x.e(strB, "getValue(...)");
                h.g.b.x.f(strB, "configString");
                List listAf = h.n.o.af(strB, new String[]{"|"}, 0, 6);
                ArrayList arrayList = new ArrayList();
                Iterator it = listAf.iterator();
                while (it.hasNext()) {
                    String string = h.n.o.v((String) it.next()).toString();
                    if (string.length() == 0) {
                        string = null;
                    }
                    if (string != null) {
                        arrayList.add(string);
                    }
                }
                return arrayList;
            case 14:
                Boolean boolB = ConfigValues.CONFIG_VALUE_CAR_LIB_AAOS_LOGARITHMIC_PAN_ENABLED.b();
                Objects.toString(boolB);
                com.waze.shared_infra.i.h.a("CONFIG_VALUE_CAR_LIB_AAOS_LOGARITHMIC_PAN_ENABLED :".concat(boolB.toString()));
                return boolB;
            case 15:
                Long lB = ConfigValues.CONFIG_VALUE_CAR_LIB_AAOS_LOGARITHMIC_PAN_PANNING_RESISTANCE_TIMES_100.b();
                Objects.toString(lB);
                com.waze.shared_infra.i.h.a("CONFIG_VALUE_CAR_LIB_AAOS_LOGARITHMIC_PAN_PANNING_RESISTANCE_TIMES_100 :".concat(lB.toString()));
                return lB;
            case 16:
                Long lB2 = ConfigValues.CONFIG_VALUE_CAR_LIB_AAOS_LOGARITHMIC_PAN_HORIZON_MARGIN_RATIO_TIMES_100.b();
                Objects.toString(lB2);
                com.waze.shared_infra.i.h.a("CONFIG_VALUE_CAR_LIB_AAOS_LOGARITHMIC_PAN_HORIZON_MARGIN_RATIO_TIMES_100 :".concat(lB2.toString()));
                return lB2;
            case 17:
                if (ConfigValues.CONFIG_VALUE_INSIGHT_STANDARD_ENABLED.b().booleanValue() && ConfigValues.CONFIG_VALUE_INSIGHT_INCAR_ENABLED.b().booleanValue()) {
                    z = true;
                }
                return Boolean.valueOf(z);
            case 18:
                return ConfigValues.CONFIG_VALUE_IN_CAR_PILL_SPEED_ZONE_INDICATION.b();
            case 19:
                return ConfigValues.CONFIG_VALUE_IN_CAR_PILL_SPEED_ZONE_DISTANCE_INDICATION.b();
            default:
                return ConfigValues.CONFIG_VALUE_IN_CAR_PILL_SPEED_ZONE_ACTIVATE_SILENTLY.b();
        }
    }
}
