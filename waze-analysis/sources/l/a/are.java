package l.a;

/* compiled from: WazeSource */
/* loaded from: classes9.dex */
public enum are implements com.google.v.eg {
    RENDER_ERROR_TYPE_UNSPECIFIED(0),
    MISSING_BEGIN_POLYGON(1),
    MISSING_END_POLYGON(2),
    MISSING_BEGIN_CONTOUR(3),
    MISSING_END_CONTOUR(4),
    COORD_TOO_LARGE(5),
    NEED_COMBINE_CALLBACK(6),
    UNRECOGNIZED(-1);


    /* renamed from: j, reason: collision with root package name */
    private final int f53070j;

    are(int i2) {
        this.f53070j = i2;
    }

    @Override // com.google.v.eg
    public final int getNumber() {
        return this == UNRECOGNIZED ? com.google.v.ep.b() : this.f53070j;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(this.f53070j);
    }
}
