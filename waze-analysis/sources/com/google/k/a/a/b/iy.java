package com.google.k.a.a.b;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public enum iy implements com.google.v.eg {
    TYPE_ANY(0),
    TYPE_GLADE(1),
    TYPE_TRAIL_TERRAIN(2),
    TYPE_TRAIL(3),
    TYPE_RACE_COURSE(4),
    TYPE_BOWL(5);


    /* renamed from: h, reason: collision with root package name */
    private final int f11619h;

    iy(int i2) {
        this.f11619h = i2;
    }

    public static iy a(int i2) {
        if (i2 == 0) {
            return TYPE_ANY;
        }
        if (i2 == 1) {
            return TYPE_GLADE;
        }
        if (i2 == 2) {
            return TYPE_TRAIL_TERRAIN;
        }
        if (i2 == 3) {
            return TYPE_TRAIL;
        }
        if (i2 == 4) {
            return TYPE_RACE_COURSE;
        }
        if (i2 != 5) {
            return null;
        }
        return TYPE_BOWL;
    }

    @Override // com.google.v.eg
    public final int getNumber() {
        return this.f11619h;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(this.f11619h);
    }
}
