package defpackage;

/* JADX INFO: loaded from: classes.dex */
public enum ovn implements defpackage.abpb {
    BATCH_KEY_UNSPECIFIED(0),
    BATCH_KEY_CONTEXT(1),
    BATCH_KEY_SCREEN(2),
    BATCH_KEY_APP_PACKAGE(3),
    BATCH_KEY_COMPONENT_NAME(4),
    BATCH_KEY_COMPONENT_NAMES(5);

    private final int h;

    ovn(int i) {
        this.h = i;
    }

    @Override // defpackage.abpb
    public final int a() {
        return this.h;
    }

    @Override // java.lang.Enum
    public final java.lang.String toString() {
        return java.lang.Integer.toString(this.h);
    }
}
