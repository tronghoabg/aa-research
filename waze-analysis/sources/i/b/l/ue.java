package i.b.l;

/* compiled from: WazeSource */
/* loaded from: classes8.dex */
public enum ue implements com.google.v.eg {
    UNKNOWN(0),
    REPORT(2);


    /* renamed from: d, reason: collision with root package name */
    private final int f49063d;

    ue(int i2) {
        this.f49063d = i2;
    }

    public static ue a(int i2) {
        if (i2 == 0) {
            return UNKNOWN;
        }
        if (i2 != 2) {
            return null;
        }
        return REPORT;
    }

    @Override // com.google.v.eg
    public final int getNumber() {
        return this.f49063d;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(this.f49063d);
    }
}
