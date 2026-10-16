package defpackage;

/* JADX INFO: loaded from: classes2.dex */
final class hwv implements java.lang.Iterable {
    public final java.util.List a;

    public hwv(java.util.List list) {
        this.a = list;
    }

    final int a() {
        return this.a.size();
    }

    final defpackage.hwv b() {
        return new defpackage.hwv(new java.util.ArrayList(this.a));
    }

    final boolean c(defpackage.iet ietVar) {
        return this.a.contains(new defpackage.hwu(ietVar, defpackage.ify.b));
    }

    final boolean d() {
        return this.a.isEmpty();
    }

    @Override // java.lang.Iterable
    public final java.util.Iterator<defpackage.hwu> iterator() {
        return this.a.iterator();
    }
}
