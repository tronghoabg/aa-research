package i.b.l;

/* compiled from: WazeSource */
/* loaded from: classes8.dex */
public enum gy implements com.google.v.eg {
    REPORT_CATEGORY_UNSPECIFIED(0),
    MAP_ISSUES(1),
    ROADSIDE_HELP(2),
    GAS(3),
    CLOSURE(4),
    MAP_CHAT(5),
    ADD_PLACE(6);


    /* renamed from: i, reason: collision with root package name */
    private final int f48724i;

    gy(int i2) {
        this.f48724i = i2;
    }

    public static gy a(int i2) {
        switch (i2) {
            case 0:
                return REPORT_CATEGORY_UNSPECIFIED;
            case 1:
                return MAP_ISSUES;
            case 2:
                return ROADSIDE_HELP;
            case 3:
                return GAS;
            case 4:
                return CLOSURE;
            case 5:
                return MAP_CHAT;
            case 6:
                return ADD_PLACE;
            default:
                return null;
        }
    }

    @Override // com.google.v.eg
    public final int getNumber() {
        return this.f48724i;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(this.f48724i);
    }
}
