package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class ahrb extends java.util.AbstractList implements java.util.RandomAccess, defpackage.ahqb {
    private final defpackage.ahqb list;

    public ahrb(defpackage.ahqb ahqbVar) {
        this.list = ahqbVar;
    }

    @Override // defpackage.ahqb
    public void add(defpackage.ahpa ahpaVar) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override // java.util.AbstractList, java.util.List
    public java.lang.String get(int i) {
        return (java.lang.String) this.list.get(i);
    }

    @Override // defpackage.ahqb
    public defpackage.ahpa getByteString(int i) {
        return this.list.getByteString(i);
    }

    @Override // defpackage.ahqb
    public java.util.List<?> getUnderlyingElements() {
        return this.list.getUnderlyingElements();
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
    public java.util.Iterator<java.lang.String> iterator() {
        return new defpackage.ahra(this);
    }

    @Override // java.util.AbstractList, java.util.List
    public java.util.ListIterator<java.lang.String> listIterator(int i) {
        return new defpackage.ahqz(this, i);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public int size() {
        return this.list.size();
    }

    @Override // defpackage.ahqb
    public defpackage.ahqb getUnmodifiableView() {
        return this;
    }
}
