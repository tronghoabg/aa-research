package com.waze.o;

import com.google.v.eg;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public enum g implements eg {
    COLOR_UNSPECIFIED(0),
    GREEN(1),
    BLUE(2),
    ORANGE(3);


    /* renamed from: f, reason: collision with root package name */
    private final int f32905f;

    g(int i2) {
        this.f32905f = i2;
    }

    public static g a(int i2) {
        if (i2 == 0) {
            return COLOR_UNSPECIFIED;
        }
        if (i2 == 1) {
            return GREEN;
        }
        if (i2 == 2) {
            return BLUE;
        }
        if (i2 != 3) {
            return null;
        }
        return ORANGE;
    }

    @Override // com.google.v.eg
    public final int getNumber() {
        return this.f32905f;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(this.f32905f);
    }
}
