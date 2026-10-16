package com.google.w.a.a;

import com.google.v.eg;
import com.google.v.ep;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public enum b implements eg {
    GANTRY_MATCH_UNSPECIFIED(0),
    GANTRY_MATCH_STATIC_WORKFLOW(1),
    GANTRY_MATCH_PARAMETERIZED_WORKFLOW(2),
    GANTRY_MATCH_PARAMETERIZED_WORKFLOW_WITH_STATIC_STAGES(3),
    GANTRY_MATCH_STATIC_ROLLBACK_WORKFLOW(4),
    GANTRY_MATCH_STAGELESS(5),
    UNRECOGNIZED(-1);


    /* renamed from: i, reason: collision with root package name */
    private final int f13083i;

    b(int i2) {
        this.f13083i = i2;
    }

    @Override // com.google.v.eg
    public final int getNumber() {
        return this == UNRECOGNIZED ? ep.b() : this.f13083i;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(this.f13083i);
    }
}
