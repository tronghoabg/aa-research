package i.b.l;

/* compiled from: WazeSource */
/* loaded from: classes8.dex */
public enum ih implements com.google.v.eg {
    UNKNOWN(0),
    INTERNAL_PAGE(1),
    JAVASCRIPT_ENABLED(2),
    FILE_UPLOADING_ENABLED(4),
    FEEDBACK_API_ENABLED(8),
    ADVIL_API_ENABLED(16),
    REQUIRE_RT_SESSION_INFO(32),
    ALLOW_IFRAMES(64);


    /* renamed from: j, reason: collision with root package name */
    private final int f48780j;

    ih(int i2) {
        this.f48780j = i2;
    }

    public static ih a(int i2) {
        if (i2 == 0) {
            return UNKNOWN;
        }
        if (i2 == 1) {
            return INTERNAL_PAGE;
        }
        if (i2 == 2) {
            return JAVASCRIPT_ENABLED;
        }
        if (i2 == 4) {
            return FILE_UPLOADING_ENABLED;
        }
        if (i2 == 8) {
            return FEEDBACK_API_ENABLED;
        }
        if (i2 == 16) {
            return ADVIL_API_ENABLED;
        }
        if (i2 == 32) {
            return REQUIRE_RT_SESSION_INFO;
        }
        if (i2 != 64) {
            return null;
        }
        return ALLOW_IFRAMES;
    }

    @Override // com.google.v.eg
    public final int getNumber() {
        return this.f48780j;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(this.f48780j);
    }
}
