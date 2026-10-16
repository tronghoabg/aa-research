package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public enum aguq {
    IGNORE("ignore"),
    WARN("warn"),
    STRICT("strict");

    private final java.lang.String description;
    private static final /* synthetic */ defpackage.afef $ENTRIES = defpackage.afga.p(values());
    public static final defpackage.agup Companion = new defpackage.agup(null);

    aguq(java.lang.String str) {
        this.description = str;
    }

    public final java.lang.String getDescription() {
        return this.description;
    }

    public final boolean isIgnore() {
        return this == IGNORE;
    }

    public final boolean isWarning() {
        return this == WARN;
    }
}
