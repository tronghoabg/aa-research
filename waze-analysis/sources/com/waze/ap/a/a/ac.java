package com.waze.ap.a.a;

import com.google.v.eg;
import com.google.v.ep;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
public enum ac implements eg {
    QUESTION_TITLE_TYPE_UNSPECIFIED(0),
    QUESTION_TITLE_TYPE_INSIGHT_HELPFUL(1),
    UNRECOGNIZED(-1);


    /* renamed from: e, reason: collision with root package name */
    private final int f14917e;

    ac(int i2) {
        this.f14917e = i2;
    }

    @Override // com.google.v.eg
    public final int getNumber() {
        return this == UNRECOGNIZED ? ep.b() : this.f14917e;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(this.f14917e);
    }
}
