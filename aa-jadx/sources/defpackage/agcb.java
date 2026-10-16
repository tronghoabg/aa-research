package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public enum agcb {
    CLASS("class"),
    INTERFACE("interface"),
    ENUM_CLASS("enum class"),
    ENUM_ENTRY(null),
    ANNOTATION_CLASS("annotation class"),
    OBJECT("object");

    private static final /* synthetic */ defpackage.afef $ENTRIES = defpackage.afga.p(values());
    private final java.lang.String codeRepresentation;

    agcb(java.lang.String str) {
        this.codeRepresentation = str;
    }

    public final boolean isSingleton() {
        return this == OBJECT || this == ENUM_ENTRY;
    }
}
