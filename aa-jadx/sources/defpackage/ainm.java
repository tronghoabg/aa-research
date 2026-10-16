package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public enum ainm {
    IN("in"),
    OUT("out"),
    INV("");

    private static final /* synthetic */ defpackage.afef $ENTRIES = defpackage.afga.p(values());
    private final java.lang.String presentation;

    ainm(java.lang.String str) {
        this.presentation = str;
    }

    @Override // java.lang.Enum
    public java.lang.String toString() {
        return this.presentation;
    }
}
