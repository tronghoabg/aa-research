package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
final class yrl extends java.util.AbstractSet {
    final /* synthetic */ defpackage.yrn a;

    public yrl(defpackage.yrn yrnVar) {
        this.a = yrnVar;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final java.util.Iterator<defpackage.ypx<?>> iterator() {
        return new defpackage.yrk(this);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.a.b;
    }
}
