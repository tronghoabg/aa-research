package com.waze.bg.a.a;

import com.google.v.eg;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
public enum n implements eg {
    QUESTION_TITLE_TYPE_UNSPECIFIED(0),
    QUESTION_TITLE_TYPE_WHAT_DO_YOU_SEE(1),
    QUESTION_TITLE_TYPE_IS_LANE_CLOSED(2);


    /* renamed from: e, reason: collision with root package name */
    private final int f16318e;

    n(int i2) {
        this.f16318e = i2;
    }

    public static n a(int i2) {
        if (i2 == 0) {
            return QUESTION_TITLE_TYPE_UNSPECIFIED;
        }
        if (i2 == 1) {
            return QUESTION_TITLE_TYPE_WHAT_DO_YOU_SEE;
        }
        if (i2 != 2) {
            return null;
        }
        return QUESTION_TITLE_TYPE_IS_LANE_CLOSED;
    }

    @Override // com.google.v.eg
    public final int getNumber() {
        return this.f16318e;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(this.f16318e);
    }
}
