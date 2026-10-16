package com.waze.uid;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class VehicleType {
    private static final /* synthetic */ h.d.a $ENTRIES;
    private static final /* synthetic */ VehicleType[] $VALUES;
    private final String value;
    public static final VehicleType Private = new VehicleType("Private", 0, "PRIVATE");
    public static final VehicleType Motorcycle = new VehicleType("Motorcycle", 1, "MOTORCYCLE");
    public static final VehicleType Taxi = new VehicleType("Taxi", 2, "TAXI");

    private static final /* synthetic */ VehicleType[] $values() {
        return new VehicleType[]{Private, Motorcycle, Taxi};
    }

    static {
        VehicleType[] vehicleTypeArr$values = $values();
        $VALUES = vehicleTypeArr$values;
        $ENTRIES = h.d.b.a(vehicleTypeArr$values);
    }

    private VehicleType(String str, int i2, String str2) {
        this.value = str2;
    }

    public static h.d.a<VehicleType> getEntries() {
        return $ENTRIES;
    }

    public static VehicleType valueOf(String str) {
        return (VehicleType) Enum.valueOf(VehicleType.class, str);
    }

    public static VehicleType[] values() {
        return (VehicleType[]) $VALUES.clone();
    }

    public final String getValue() {
        return this.value;
    }
}
