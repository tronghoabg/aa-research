package com.google.k.a.a;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public enum od implements com.google.v.eg {
    VEHICLE_EMISSIONS_CATEGORY_UNSPECIFIED(0),
    VEHICLE_EMISSIONS_CATEGORY_GAS(1),
    VEHICLE_EMISSIONS_CATEGORY_DIESEL(2),
    VEHICLE_EMISSIONS_CATEGORY_ELECTRIC(3),
    VEHICLE_EMISSIONS_CATEGORY_HYDROGEN(4),
    VEHICLE_EMISSIONS_CATEGORY_HYBRID(5),
    VEHICLE_EMISSIONS_CATEGORY_PLUGIN_HYBRID(6),
    UNRECOGNIZED(-1);


    /* renamed from: j, reason: collision with root package name */
    private final int f12183j;

    od(int i2) {
        this.f12183j = i2;
    }

    public static od a(int i2) {
        switch (i2) {
            case 0:
                return VEHICLE_EMISSIONS_CATEGORY_UNSPECIFIED;
            case 1:
                return VEHICLE_EMISSIONS_CATEGORY_GAS;
            case 2:
                return VEHICLE_EMISSIONS_CATEGORY_DIESEL;
            case 3:
                return VEHICLE_EMISSIONS_CATEGORY_ELECTRIC;
            case 4:
                return VEHICLE_EMISSIONS_CATEGORY_HYDROGEN;
            case 5:
                return VEHICLE_EMISSIONS_CATEGORY_HYBRID;
            case 6:
                return VEHICLE_EMISSIONS_CATEGORY_PLUGIN_HYBRID;
            default:
                return null;
        }
    }

    @Override // com.google.v.eg
    public final int getNumber() {
        return this == UNRECOGNIZED ? com.google.v.ep.b() : this.f12183j;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(this.f12183j);
    }
}
