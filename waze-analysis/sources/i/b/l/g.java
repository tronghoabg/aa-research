package i.b.l;

/* compiled from: WazeSource */
/* loaded from: classes8.dex */
public enum g implements com.google.v.eg {
    UNKNOWN(0),
    DELETE_IF_NOT_UPDATE(1),
    DO_NOT_DELETE(2);


    /* renamed from: e, reason: collision with root package name */
    private final int f48715e;

    g(int i2) {
        this.f48715e = i2;
    }

    public static g a(int i2) {
        if (i2 == 0) {
            return UNKNOWN;
        }
        if (i2 == 1) {
            return DELETE_IF_NOT_UPDATE;
        }
        if (i2 != 2) {
            return null;
        }
        return DO_NOT_DELETE;
    }

    @Override // com.google.v.eg
    public final int getNumber() {
        return this.f48715e;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(this.f48715e);
    }
}
