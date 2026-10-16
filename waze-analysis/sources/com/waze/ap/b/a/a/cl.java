package com.waze.ap.b.a.a;

import com.google.v.eg;
import com.google.v.ep;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
public enum cl implements eg {
    ROAD_TYPE_UNKNOWN(0),
    ROAD_TYPE_FREEWAY(1),
    ROAD_TYPE_PRIMARY(2),
    ROAD_TYPE_SECONDARY(3),
    ROAD_TYPE_RAMP(4),
    ROAD_TYPE_MAIN(5),
    ROAD_TYPE_EXIT(6),
    ROAD_TYPE_STREET(7),
    ROAD_TYPE_PEDESTRIAN(8),
    ROAD_TYPE_4X4(9),
    ROAD_TYPE_TRAIL(10),
    ROAD_TYPE_WALKWAY(11),
    ROAD_TYPE_RAILROAD(12),
    ROAD_TYPE_RUNWAY(13),
    ROAD_TYPE_FERRY(14),
    ROAD_TYPE_PRIVATE(15),
    ROAD_TYPE_PARKING(16),
    ROAD_TYPE_DIRT(17),
    ROAD_TYPE_MINOR(18),
    UNRECOGNIZED(-1);

    private final int v;

    cl(int i2) {
        this.v = i2;
    }

    @Override // com.google.v.eg
    public final int getNumber() {
        return this == UNRECOGNIZED ? ep.b() : this.v;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(this.v);
    }
}
