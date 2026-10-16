package com.waze.ap.a.a;

import com.google.v.eg;
import com.google.v.ep;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
public enum k implements eg {
    QUESTION_TITLE_TYPE_UNSPECIFIED(0),
    QUESTION_TITLE_TYPE_WHAT_DO_YOU_SEE(1),
    QUESTION_TITLE_TYPE_IS_LANE_CLOSED(2),
    UNRECOGNIZED(-1);


    /* renamed from: f, reason: collision with root package name */
    private final int f14953f;

    k(int i2) {
        this.f14953f = i2;
    }

    @Override // com.google.v.eg
    public final int getNumber() {
        return this == UNRECOGNIZED ? ep.b() : this.f14953f;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(this.f14953f);
    }
}
