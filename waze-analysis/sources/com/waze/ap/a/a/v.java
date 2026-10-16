package com.waze.ap.a.a;

import com.google.v.eg;
import com.google.v.ep;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
public enum v implements eg {
    QUESTION_TITLE_TYPE_UNSPECIFIED(0),
    QUESTION_TITLE_TYPE_IS_NEAR_LANE(1),
    QUESTION_TITLE_TYPE_IS_CLEARLY_MARKED(2),
    QUESTION_TITLE_TYPE_ARE_PEOPLE_PRESENT(3),
    UNRECOGNIZED(-1);


    /* renamed from: g, reason: collision with root package name */
    private final int f14977g;

    v(int i2) {
        this.f14977g = i2;
    }

    @Override // com.google.v.eg
    public final int getNumber() {
        return this == UNRECOGNIZED ? ep.b() : this.f14977g;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(this.f14977g);
    }
}
