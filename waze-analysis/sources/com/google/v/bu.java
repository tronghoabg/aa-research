package com.google.v;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public enum bu implements eg {
    JS_NORMAL(0),
    JS_STRING(1),
    JS_NUMBER(2);


    /* renamed from: e, reason: collision with root package name */
    private final int f12767e;

    bu(int i2) {
        this.f12767e = i2;
    }

    public static bu a(int i2) {
        if (i2 == 0) {
            return JS_NORMAL;
        }
        if (i2 == 1) {
            return JS_STRING;
        }
        if (i2 != 2) {
            return null;
        }
        return JS_NUMBER;
    }

    @Override // com.google.v.eg
    public final int getNumber() {
        return this.f12767e;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(this.f12767e);
    }
}
