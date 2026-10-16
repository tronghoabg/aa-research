package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class ghq {
    public final java.lang.String a;
    public final java.lang.Class b;
    public final int c;

    public ghq(java.lang.String str, java.lang.Class cls, int i) {
        this.a = str;
        this.b = cls;
        this.c = i;
    }

    public final java.lang.String toString() {
        return "TemplateStackItem { " + this.b.getSimpleName() + "; Step: " + this.c + "; id: " + this.a + " }";
    }
}
