package l.a;

/* compiled from: WazeSource */
/* loaded from: classes9.dex */
public enum axv implements com.google.v.eg {
    SDK_TYPE_UNSPECIFIED(0),
    SDK_TYPE_AUDIO(1),
    SDK_TYPE_TRANSPORT(2),
    UNRECOGNIZED(-1);


    /* renamed from: f, reason: collision with root package name */
    private final int f53420f;

    axv(int i2) {
        this.f53420f = i2;
    }

    public static axv a(int i2) {
        if (i2 == 0) {
            return SDK_TYPE_UNSPECIFIED;
        }
        if (i2 == 1) {
            return SDK_TYPE_AUDIO;
        }
        if (i2 != 2) {
            return null;
        }
        return SDK_TYPE_TRANSPORT;
    }

    @Override // com.google.v.eg
    public final int getNumber() {
        return this == UNRECOGNIZED ? com.google.v.ep.b() : this.f53420f;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(this.f53420f);
    }
}
