package i.b.l;

/* compiled from: WazeSource */
/* loaded from: classes8.dex */
public enum p implements com.google.v.eg {
    IRRELEVANT(0),
    FOLLOWING(1),
    ACTIVE(2);


    /* renamed from: e, reason: collision with root package name */
    private final int f48951e;

    p(int i2) {
        this.f48951e = i2;
    }

    public static p a(int i2) {
        if (i2 == 0) {
            return IRRELEVANT;
        }
        if (i2 == 1) {
            return FOLLOWING;
        }
        if (i2 != 2) {
            return null;
        }
        return ACTIVE;
    }

    @Override // com.google.v.eg
    public final int getNumber() {
        return this.f48951e;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(this.f48951e);
    }
}
