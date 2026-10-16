package i.b.v;

/* compiled from: WazeSource */
/* loaded from: classes8.dex */
public enum dh implements com.google.v.eg {
    UNKNOWN(0),
    QUESTION(1);


    /* renamed from: d, reason: collision with root package name */
    private final int f49468d;

    dh(int i2) {
        this.f49468d = i2;
    }

    public static dh a(int i2) {
        if (i2 == 0) {
            return UNKNOWN;
        }
        if (i2 != 1) {
            return null;
        }
        return QUESTION;
    }

    @Override // com.google.v.eg
    public final int getNumber() {
        return this.f49468d;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(this.f49468d);
    }
}
