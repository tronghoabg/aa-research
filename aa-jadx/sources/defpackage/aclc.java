package defpackage;

/* JADX INFO: loaded from: classes3.dex */
enum aclc {
    SMALL("version 1-9"),
    MEDIUM("version 10-26"),
    LARGE("version 27-40");

    private final java.lang.String e;

    aclc(java.lang.String str) {
        this.e = str;
    }

    @Override // java.lang.Enum
    public final java.lang.String toString() {
        return this.e;
    }
}
