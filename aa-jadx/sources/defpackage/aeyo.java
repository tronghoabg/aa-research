package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class aeyo extends defpackage.aeyl implements java.io.Serializable, java.lang.Cloneable, j$.util.Set, defpackage.aeyn {
    private static final long serialVersionUID = -7046029254386353129L;

    protected aeyo() {
    }

    private java.lang.Object readResolve() {
        return defpackage.aeyp.a;
    }

    @Override // defpackage.aeyl, defpackage.aesf, defpackage.aeyk
    /* JADX INFO: renamed from: a */
    public final /* synthetic */ defpackage.aeuy iterator() {
        return defpackage.aeve.a;
    }

    public final java.lang.Object clone() {
        return defpackage.aeyp.a;
    }

    @Override // defpackage.aeyl, java.util.Collection
    public final boolean equals(java.lang.Object obj) {
        return (obj instanceof java.util.Set) && ((java.util.Set) obj).isEmpty();
    }

    @Override // defpackage.aeyl, defpackage.aesf, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public final /* synthetic */ java.util.Iterator iterator() {
        return defpackage.aeve.a;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean remove(java.lang.Object obj) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override // defpackage.aeyl, defpackage.aesf, java.util.Collection, java.lang.Iterable, j$.util.Collection, j$.lang.a
    public final /* synthetic */ j$.util.Spliterator spliterator() {
        return defpackage.aevz.a;
    }
}
