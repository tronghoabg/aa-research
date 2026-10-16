package defpackage;

/* loaded from: classes.dex */
public enum ouq implements abnz {
    BATCH_KEY_UNSPECIFIED(0),
    BATCH_KEY_CONTEXT(1),
    BATCH_KEY_SCREEN(2),
    BATCH_KEY_APP_PACKAGE(3),
    BATCH_KEY_COMPONENT_NAME(4),
    BATCH_KEY_COMPONENT_NAMES(5);

    private final int h;

    ouq(int i) {
        this.h = i;
    }

    @Override // defpackage.abnz
    public final int a() {
        return this.h;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(this.h);
    }
}
