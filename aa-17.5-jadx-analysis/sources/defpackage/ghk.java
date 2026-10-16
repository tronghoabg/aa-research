package defpackage;

/* loaded from: classes2.dex */
public final class ghk {
    public final String a;
    public final Class b;
    public final int c;

    public ghk(String str, Class cls, int i) {
        this.a = str;
        this.b = cls;
        this.c = i;
    }

    public final String toString() {
        return "TemplateStackItem { " + this.b.getSimpleName() + "; Step: " + this.c + "; id: " + this.a + " }";
    }
}
