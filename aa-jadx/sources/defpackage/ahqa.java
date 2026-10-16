package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class ahqa extends java.util.AbstractList implements java.util.RandomAccess, defpackage.ahqb {
    public static final defpackage.ahqb EMPTY = new defpackage.ahqa().getUnmodifiableView();
    private final java.util.List<java.lang.Object> list;

    public ahqa(defpackage.ahqb ahqbVar) {
        this.list = new java.util.ArrayList(ahqbVar.size());
        addAll(ahqbVar);
    }

    private static defpackage.ahpa asByteString(java.lang.Object obj) {
        if (obj instanceof defpackage.ahpa) {
            return (defpackage.ahpa) obj;
        }
        return obj instanceof java.lang.String ? defpackage.ahpa.copyFromUtf8((java.lang.String) obj) : defpackage.ahpa.copyFrom((byte[]) obj);
    }

    private static java.lang.String asString(java.lang.Object obj) {
        if (obj instanceof java.lang.String) {
            return (java.lang.String) obj;
        }
        return obj instanceof defpackage.ahpa ? ((defpackage.ahpa) obj).toStringUtf8() : defpackage.ahpt.toStringUtf8((byte[]) obj);
    }

    @Override // java.util.AbstractList, java.util.List
    public void add(int i, java.lang.String str) {
        this.list.add(i, str);
        this.modCount++;
    }

    @Override // java.util.AbstractList, java.util.List
    public boolean addAll(int i, java.util.Collection<? extends java.lang.String> collection) {
        if (collection instanceof defpackage.ahqb) {
            collection = ((defpackage.ahqb) collection).getUnderlyingElements();
        }
        boolean zAddAll = this.list.addAll(i, collection);
        this.modCount++;
        return zAddAll;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public void clear() {
        this.list.clear();
        this.modCount++;
    }

    @Override // java.util.AbstractList, java.util.List
    public java.lang.String get(int i) {
        java.lang.Object obj = this.list.get(i);
        if (obj instanceof java.lang.String) {
            return (java.lang.String) obj;
        }
        if (obj instanceof defpackage.ahpa) {
            defpackage.ahpa ahpaVar = (defpackage.ahpa) obj;
            java.lang.String stringUtf8 = ahpaVar.toStringUtf8();
            if (ahpaVar.isValidUtf8()) {
                this.list.set(i, stringUtf8);
            }
            return stringUtf8;
        }
        byte[] bArr = (byte[]) obj;
        java.lang.String stringUtf9 = defpackage.ahpt.toStringUtf8(bArr);
        if (defpackage.ahpt.isValidUtf8(bArr)) {
            this.list.set(i, stringUtf9);
        }
        return stringUtf9;
    }

    @Override // defpackage.ahqb
    public defpackage.ahpa getByteString(int i) {
        java.lang.Object obj = this.list.get(i);
        defpackage.ahpa ahpaVarAsByteString = asByteString(obj);
        if (ahpaVarAsByteString != obj) {
            this.list.set(i, ahpaVarAsByteString);
        }
        return ahpaVarAsByteString;
    }

    @Override // defpackage.ahqb
    public java.util.List<?> getUnderlyingElements() {
        return j$.util.DesugarCollections.unmodifiableList(this.list);
    }

    @Override // defpackage.ahqb
    public defpackage.ahqb getUnmodifiableView() {
        return new defpackage.ahrb(this);
    }

    @Override // java.util.AbstractList, java.util.List
    public java.lang.String remove(int i) {
        java.lang.Object objRemove = this.list.remove(i);
        this.modCount++;
        return asString(objRemove);
    }

    @Override // java.util.AbstractList, java.util.List
    public java.lang.String set(int i, java.lang.String str) {
        return asString(this.list.set(i, str));
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public int size() {
        return this.list.size();
    }

    @Override // defpackage.ahqb
    public void add(defpackage.ahpa ahpaVar) {
        this.list.add(ahpaVar);
        this.modCount++;
    }

    public ahqa() {
        this.list = new java.util.ArrayList();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean addAll(java.util.Collection<? extends java.lang.String> collection) {
        return addAll(size(), collection);
    }
}
