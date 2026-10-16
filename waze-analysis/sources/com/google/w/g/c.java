package com.google.w.g;

import com.google.v.eg;
import com.google.v.ep;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public enum c implements eg {
    CONNECTOR_TYPE_UNSPECIFIED(0),
    J_1772(2),
    MENNEKES(3),
    CHADEMO(4),
    CCS_COMBO_1(5),
    CCS_COMBO_2(6),
    GB_T(10),
    WALL_OUTLET(11),
    LECCS(12),
    TYPE_6(13),
    NACS(14),
    TYPE_3C(15),
    TYPE_3A(16),
    IEC_60309_1_PHASE(17),
    IEC_60309_3_PHASE(18),
    UNRECOGNIZED(-1);

    private final int r;

    c(int i2) {
        this.r = i2;
    }

    @Override // com.google.v.eg
    public final int getNumber() {
        return this == UNRECOGNIZED ? ep.b() : this.r;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(this.r);
    }
}
