package com.waze.navigate;

import com.waze.ConfigManager;
import com.waze.config.ConfigValues;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
public final /* synthetic */ class dc implements h.g.a.a {

    /* renamed from: a, reason: collision with root package name */
    private final /* synthetic */ int f31225a;

    public /* synthetic */ dc(int i2) {
        this.f31225a = i2;
    }

    @Override // h.g.a.a
    public final Object invoke() {
        switch (this.f31225a) {
            case 0:
                return dd.g();
            case 1:
                return ConfigValues.CONFIG_VALUE_REPORTING_CONVERSATIONAL_REPORTING_AVAILABLE_LOCALE.b();
            case 2:
                return ConfigValues.CONFIG_VALUE_REPORTING_CONVERSATIONAL_REPORTING_TTS_STRINGS_ENABLED.b();
            case 3:
                return ConfigValues.CONFIG_VALUE_REPORTING_CONVERSATIONAL_REPORTING_TTS_STRINGS_ENABLED.b();
            case 4:
                return ConfigValues.CONFIG_VALUE_REPORTING_CONVERSATIONAL_REPORTING_TTS_STRINGS_ENABLED.b();
            case 5:
                return ConfigValues.CONFIG_VALUE_REPORTING_CONVERSATIONAL_REPORTING_TTS_STRINGS_ENABLED.b();
            case 6:
                return h.ab.f48028a;
            case 7:
                return Integer.valueOf(ConfigManager.getInstance().getConfigValueInt(ConfigValues.CONFIG_VALUE_REPORTING_FEEDBACK_COMPONENT_DURATION_SECONDS));
            case 8:
                return h.ab.f48028a;
            case 9:
                return h.ab.f48028a;
            case 10:
                return h.ab.f48028a;
            case 11:
                return h.ab.f48028a;
            case 12:
                com.waze.search.k kVar = com.waze.search.k.f35975a;
                return Integer.valueOf((int) ConfigValues.CONFIG_VALUE_REWIRE_SEARCH_NUM_CATEGORIES_TO_DISPLAY.b().longValue());
            case 13:
                com.waze.search.k kVar2 = com.waze.search.k.f35975a;
                Boolean boolA = ConfigValues.CONFIG_VALUE_SEARCH_AUTOCOMPLETE_ROUTE_DISTANCE_ENABLED.b();
                h.g.b.x.e(boolA, "getValue(...)");
                boolA.booleanValue();
                return boolA;
            case 14:
                return com.waze.search.k.c();
            case 15:
                return h.ab.f48028a;
            case 16:
                return h.ab.f48028a;
            case 17:
                int i2 = com.waze.search.bd.f35538a;
                return ConfigValues.CONFIG_VALUE_SOCIAL_VENUE_IMAGE_URL_PREFIX.b();
            case 18:
                int i3 = com.waze.search.bd.f35538a;
                return ConfigValues.CONFIG_VALUE_SOCIAL_VENUE_IMAGE_URL_THUMB_PREFIX.b();
            case 19:
                int i4 = com.waze.search.bd.f35538a;
                return Integer.valueOf((int) ConfigValues.CONFIG_VALUE_SEARCH_MAX_RESULTS.b().longValue());
            default:
                int i5 = com.waze.search.bd.f35538a;
                return Integer.valueOf((int) ConfigValues.CONFIG_VALUE_REPORT_DUPLICATES_MAX_RESULTS.b().longValue());
        }
    }
}
