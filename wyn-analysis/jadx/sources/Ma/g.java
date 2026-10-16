package Ma;

/* loaded from: classes4.dex */
public enum g {
    DEFINED_BY_JAVASCRIPT("definedByJavaScript"),
    UNSPECIFIED("unspecified"),
    LOADED("loaded"),
    BEGIN_TO_RENDER("beginToRender"),
    ONE_PIXEL("onePixel"),
    VIEWABLE("viewable"),
    AUDIBLE("audible"),
    OTHER("other");


    /* renamed from: a, reason: collision with root package name */
    public final String f7600a;

    g(String str) {
        this.f7600a = str;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return this.f7600a;
    }
}
