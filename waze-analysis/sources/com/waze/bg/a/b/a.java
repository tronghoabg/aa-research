package com.waze.bg.a.b;

import com.google.v.eg;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
public enum a implements eg {
    UNKNOWN_CANCEL_CONVERSATION_REASON(0),
    MAX_LIMIT_MESSAGES(1),
    USER_CANCEL(2);


    /* renamed from: e, reason: collision with root package name */
    private final int f16337e;

    a(int i2) {
        this.f16337e = i2;
    }

    public static a a(int i2) {
        if (i2 == 0) {
            return UNKNOWN_CANCEL_CONVERSATION_REASON;
        }
        if (i2 == 1) {
            return MAX_LIMIT_MESSAGES;
        }
        if (i2 != 2) {
            return null;
        }
        return USER_CANCEL;
    }

    @Override // com.google.v.eg
    public final int getNumber() {
        return this.f16337e;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(this.f16337e);
    }
}
