package com.google.k.a.a.b;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public enum dg implements com.google.v.eg {
    CONJOINED_NONE(0),
    CONJOINED_SPLIT_LEFT(1),
    CONJOINED_SPLIT_MIDDLE(2),
    CONJOINED_SPLIT_RIGHT(3),
    CONJOINED_MERGE_LEFT(4),
    CONJOINED_MERGE_MIDDLE(5),
    CONJOINED_MERGE_RIGHT(6);


    /* renamed from: i, reason: collision with root package name */
    private final int f11243i;

    dg(int i2) {
        this.f11243i = i2;
    }

    public static dg a(int i2) {
        switch (i2) {
            case 0:
                return CONJOINED_NONE;
            case 1:
                return CONJOINED_SPLIT_LEFT;
            case 2:
                return CONJOINED_SPLIT_MIDDLE;
            case 3:
                return CONJOINED_SPLIT_RIGHT;
            case 4:
                return CONJOINED_MERGE_LEFT;
            case 5:
                return CONJOINED_MERGE_MIDDLE;
            case 6:
                return CONJOINED_MERGE_RIGHT;
            default:
                return null;
        }
    }

    @Override // com.google.v.eg
    public final int getNumber() {
        return this.f11243i;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(this.f11243i);
    }
}
