package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class advl {
    private final java.util.ArrayList a = new java.util.ArrayList();

    public final void a(java.lang.Object obj) {
        this.a.add(obj.toString());
    }

    public final void b(java.lang.String str, java.lang.Object obj) {
        this.a.add(str + "=" + java.lang.String.valueOf(obj));
    }

    public final java.lang.String toString() {
        return this.a.toString();
    }
}
