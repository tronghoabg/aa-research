package i.b.v;

/* compiled from: WazeSource */
/* loaded from: classes8.dex */
public enum cn implements com.google.v.eg {
    R_1_TO_10(0),
    R_11_TO_30(1),
    R_31_TO_60(2),
    R_61_TO_100(3),
    R_101_TO_300(4),
    R_301_TO_600(5),
    R_600_PLUS(6);


    /* renamed from: i, reason: collision with root package name */
    private final int f49428i;

    cn(int i2) {
        this.f49428i = i2;
    }

    public static cn a(int i2) {
        switch (i2) {
            case 0:
                return R_1_TO_10;
            case 1:
                return R_11_TO_30;
            case 2:
                return R_31_TO_60;
            case 3:
                return R_61_TO_100;
            case 4:
                return R_101_TO_300;
            case 5:
                return R_301_TO_600;
            case 6:
                return R_600_PLUS;
            default:
                return null;
        }
    }

    @Override // com.google.v.eg
    public final int getNumber() {
        return this.f49428i;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(this.f49428i);
    }
}
