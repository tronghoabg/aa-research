package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public enum zej implements java.util.Comparator {
    TRUE_FIRST(1, "Booleans.trueFirst()"),
    FALSE_FIRST(-1, "Booleans.falseFirst()");

    private final int d;
    private final java.lang.String e;

    zej(int i, java.lang.String str) {
        this.d = i;
        this.e = str;
    }

    @Override // java.util.Comparator
    public final /* bridge */ /* synthetic */ int compare(java.lang.Object obj, java.lang.Object obj2) {
        java.lang.Boolean bool = (java.lang.Boolean) obj2;
        return (bool.booleanValue() ? this.d : 0) - (((java.lang.Boolean) obj).booleanValue() ? this.d : 0);
    }

    @Override // java.lang.Enum
    public final java.lang.String toString() {
        return this.e;
    }
}
