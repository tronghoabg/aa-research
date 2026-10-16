package com.waze.ap.a.a;

import com.google.v.eg;
import com.google.v.ei;
import com.google.v.ep;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
public enum o implements eg {
    INSIGHT_ANSWER_TYPE_UNSPECIFIED(0),
    HAZARD_CONSTRUCTION(1),
    HAZARD_VEHICLE_STOPPED(2),
    HAZARD_POTHOLE(3),
    BLOCKED_LANE_RIGHT(4),
    BLOCKED_LANE_LEFT(5),
    BLOCKED_LANE_CENTER(6),
    UNRECOGNIZED(-1);


    /* renamed from: j, reason: collision with root package name */
    private final int f14967j;

    o(int i2) {
        this.f14967j = i2;
    }

    public static ei a() {
        return n.f14954a;
    }

    public static o b(int i2) {
        switch (i2) {
            case 0:
                return INSIGHT_ANSWER_TYPE_UNSPECIFIED;
            case 1:
                return HAZARD_CONSTRUCTION;
            case 2:
                return HAZARD_VEHICLE_STOPPED;
            case 3:
                return HAZARD_POTHOLE;
            case 4:
                return BLOCKED_LANE_RIGHT;
            case 5:
                return BLOCKED_LANE_LEFT;
            case 6:
                return BLOCKED_LANE_CENTER;
            default:
                return null;
        }
    }

    @Override // com.google.v.eg
    public final int getNumber() {
        return this == UNRECOGNIZED ? ep.b() : this.f14967j;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(this.f14967j);
    }
}
