package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public enum accg implements defpackage.abpb {
    UNKNOWN_EVENT_TYPE(0),
    MAP_CREATE(1),
    NAVIGATION_INIT(2),
    NAVIGATION_SET_WAYPOINTS(3),
    NAVIGATION_SET_WAYPOINTS_WITH_ROUTE_TOKEN(8),
    BASE_MAP_CREATE_DYNAMIC(4),
    BASE_MAP_CREATE_STATIC(5),
    STREETVIEW_CREATE_DYNAMIC(6),
    PREMIUM_MAP_LOAD(7),
    PREMIUM_MAP_LOAD_MEASUREMENT(9);

    public final int k;

    accg(int i) {
        this.k = i;
    }

    public static defpackage.accg b(int i) {
        switch (i) {
            case 0:
                return UNKNOWN_EVENT_TYPE;
            case 1:
                return MAP_CREATE;
            case 2:
                return NAVIGATION_INIT;
            case 3:
                return NAVIGATION_SET_WAYPOINTS;
            case 4:
                return BASE_MAP_CREATE_DYNAMIC;
            case 5:
                return BASE_MAP_CREATE_STATIC;
            case 6:
                return STREETVIEW_CREATE_DYNAMIC;
            case 7:
                return PREMIUM_MAP_LOAD;
            case 8:
                return NAVIGATION_SET_WAYPOINTS_WITH_ROUTE_TOKEN;
            case 9:
                return PREMIUM_MAP_LOAD_MEASUREMENT;
            default:
                return null;
        }
    }

    @Override // defpackage.abpb
    public final int a() {
        return this.k;
    }

    @Override // java.lang.Enum
    public final java.lang.String toString() {
        return java.lang.Integer.toString(this.k);
    }
}
