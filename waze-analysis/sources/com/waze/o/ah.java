package com.waze.o;

import com.google.v.eg;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public enum ah implements eg {
    UPDATE_TYPE_UNSPECIFIED(0),
    HOME(1),
    WORK(2),
    OTHER(3);


    /* renamed from: f, reason: collision with root package name */
    private final int f32633f;

    ah(int i2) {
        this.f32633f = i2;
    }

    public static ah a(int i2) {
        if (i2 == 0) {
            return UPDATE_TYPE_UNSPECIFIED;
        }
        if (i2 == 1) {
            return HOME;
        }
        if (i2 == 2) {
            return WORK;
        }
        if (i2 != 3) {
            return null;
        }
        return OTHER;
    }

    @Override // com.google.v.eg
    public final int getNumber() {
        return this.f32633f;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(this.f32633f);
    }
}
