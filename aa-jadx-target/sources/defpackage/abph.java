package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class abph<T> extends java.util.AbstractList<T> {
    private final defpackage.abpf a;
    private final defpackage.abpg b;

    public abph(defpackage.abpf abpfVar, defpackage.abpg abpgVar) {
        this.a = abpfVar;
        this.b = abpgVar;
    }

    @Override // java.util.AbstractList, java.util.List
    public final T get(int i) {
        return (T) this.b.a(this.a.e(i));
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.a.size();
    }
}
