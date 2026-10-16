package i.b.l;

/* compiled from: WazeSource */
/* loaded from: classes8.dex */
public enum at implements com.google.v.eg {
    UNDEF(0),
    AS_IS(1),
    CODE(2);


    /* renamed from: e, reason: collision with root package name */
    private final int f48594e;

    at(int i2) {
        this.f48594e = i2;
    }

    public static at a(int i2) {
        if (i2 == 0) {
            return UNDEF;
        }
        if (i2 == 1) {
            return AS_IS;
        }
        if (i2 != 2) {
            return null;
        }
        return CODE;
    }

    @Override // com.google.v.eg
    public final int getNumber() {
        return this.f48594e;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(this.f48594e);
    }
}
