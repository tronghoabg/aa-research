package defpackage;

import java.util.EnumSet;

/* loaded from: classes2.dex */
public final class pon implements ackr {
    private final /* synthetic */ int a;

    public pon(int i) {
        this.a = i;
    }

    @Override // defpackage.aezk, defpackage.aezj
    public final /* synthetic */ Object a() {
        switch (this.a) {
            case 0:
                return acef.NAVIGATION;
            case 1:
                return acef.NAVIGATION2;
            case 2:
                return acef.NAVIGATION_SDK;
            case 3:
                return acef.NETWORK;
            case 4:
                return acef.OMNI_MAPS;
            case 5:
                return acef.PAINT_PARAMETERS;
            case 6:
                return acef.PLATFORM;
            case 7:
                return acef.PREFETCHER_SETTINGS;
            case 8:
                return acef.PRIVACY;
            case 9:
                return acef.PROMOTED_PLACES;
            case 10:
                return acef.SATELLITE;
            case 11:
                return acef.SAVED_STATE_EXPIRATION;
            case 12:
                return acef.SERVER_SETTING;
            case 13:
                return acef.SQLITE_TILE_CACHE;
            case 14:
                return acef.SYSTEM_HEALTH;
            case 15:
                return acef.TILE_TYPE_EXPIRATION;
            case 16:
                return acef.TRAFFIC;
            case 17:
                return acef.TRIGGER_EXPERIMENT_ID;
            case 18:
                return acef.VECTOR_MAPS;
            case 19:
                return acef.ZERO_RATING;
            default:
                Boolean bool = false;
                bool.getClass();
                EnumSet enumSetOf = EnumSet.of(acef.ENABLE_FEATURES, acef.EXPERIMENT_ATTRIBUTION_MAP, acef.LOGGING, acef.MAPS_ACTIVITIES, acef.PAINT_PARAMETERS, acef.PARTNER_APPS, acef.PHENOTYPE_MIGRATION, acef.TRIGGER_EXPERIMENT_ID, acef.VECTOR_MAPS, acef.MAP_CORE, acef.MAP_CORE_GEO_CONSUMER);
                enumSetOf.getClass();
                return enumSetOf;
        }
    }
}
