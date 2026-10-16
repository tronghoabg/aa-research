package com.google.k.a.a.b;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public enum ix implements com.google.v.eg {
    DIFFICULTY_EASIEST(0),
    DIFFICULTY_EASY(1),
    DIFFICULTY_INTERMEDIATE(2),
    DIFFICULTY_ADVANCED_INTERMEDIATE(3),
    DIFFICULTY_DIFFICULT(4),
    DIFFICULTY_ADVANCED_DIFFICULT(5);


    /* renamed from: h, reason: collision with root package name */
    private final int f11611h;

    ix(int i2) {
        this.f11611h = i2;
    }

    public static ix a(int i2) {
        if (i2 == 0) {
            return DIFFICULTY_EASIEST;
        }
        if (i2 == 1) {
            return DIFFICULTY_EASY;
        }
        if (i2 == 2) {
            return DIFFICULTY_INTERMEDIATE;
        }
        if (i2 == 3) {
            return DIFFICULTY_ADVANCED_INTERMEDIATE;
        }
        if (i2 == 4) {
            return DIFFICULTY_DIFFICULT;
        }
        if (i2 != 5) {
            return null;
        }
        return DIFFICULTY_ADVANCED_DIFFICULT;
    }

    @Override // com.google.v.eg
    public final int getNumber() {
        return this.f11611h;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(this.f11611h);
    }
}
