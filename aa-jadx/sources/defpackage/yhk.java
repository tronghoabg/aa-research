package defpackage;

/* JADX INFO: loaded from: classes3.dex */
final class yhk extends defpackage.ygw {
    final /* synthetic */ defpackage.ygw a;

    public yhk(defpackage.ygw ygwVar) {
        this.a = ygwVar;
    }

    @Override // defpackage.ygm
    public final boolean f() {
        return true;
    }

    @Override // java.util.List
    public final java.lang.Object get(int i) {
        return ((java.util.Map.Entry) this.a.get(i)).getValue();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.a.size();
    }

    @Override // defpackage.ygw, defpackage.ygm
    public java.lang.Object writeReplace() {
        return super.writeReplace();
    }
}
