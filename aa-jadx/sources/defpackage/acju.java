package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public enum acju implements defpackage.abpb {
    FRONT(1),
    LEFT(2),
    BACK(3),
    RIGHT(4),
    UP(5),
    DOWN(6);

    private final int h;

    acju(int i) {
        this.h = i;
    }

    public static defpackage.acju b(int i) {
        switch (i) {
            case 1:
                return FRONT;
            case 2:
                return LEFT;
            case 3:
                return BACK;
            case 4:
                return RIGHT;
            case 5:
                return UP;
            case 6:
                return DOWN;
            default:
                return null;
        }
    }

    @Override // defpackage.abpb
    public final int a() {
        return this.h;
    }

    @Override // java.lang.Enum
    public final java.lang.String toString() {
        return java.lang.Integer.toString(this.h);
    }
}
