package defpackage;

/* JADX INFO: loaded from: classes2.dex */
final class hwu {
    final defpackage.iet a;
    final java.util.concurrent.Executor b;

    public hwu(defpackage.iet ietVar, java.util.concurrent.Executor executor) {
        this.a = ietVar;
        this.b = executor;
    }

    public final boolean equals(java.lang.Object obj) {
        if (obj instanceof defpackage.hwu) {
            return this.a.equals(((defpackage.hwu) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
