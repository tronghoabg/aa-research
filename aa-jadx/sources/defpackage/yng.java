package defpackage;

/* JADX INFO: loaded from: classes3.dex */
final class yng extends defpackage.ygw {
    final /* synthetic */ defpackage.ynh a;

    public yng(defpackage.ynh ynhVar) {
        this.a = ynhVar;
    }

    @Override // defpackage.ygm
    public final boolean f() {
        return true;
    }

    @Override // java.util.List
    public final java.lang.Object get(int i) {
        return this.a.j(i);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.a.f();
    }

    @Override // defpackage.ygw, defpackage.ygm
    public java.lang.Object writeReplace() {
        return super.writeReplace();
    }
}
