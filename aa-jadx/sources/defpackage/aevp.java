package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class aevp extends defpackage.aeux implements java.io.Serializable, j$.util.Set, defpackage.aevm {
    private static final long serialVersionUID = -7046029254386353129L;

    public aevp(defpackage.aevm aevmVar) {
        super(aevmVar);
    }

    @Override // defpackage.aeux, java.util.Collection
    public final boolean equals(java.lang.Object obj) {
        if (obj == this) {
            return true;
        }
        return this.a.equals(obj);
    }

    @Override // defpackage.aeux, java.util.Collection
    public final int hashCode() {
        return this.a.hashCode();
    }

    @Override // defpackage.aeux, java.util.Collection, java.lang.Iterable
    public final /* bridge */ /* synthetic */ java.util.Iterator iterator() {
        return super.iterator();
    }

    @Override // defpackage.aeux, java.util.Collection
    public final boolean remove(java.lang.Object obj) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override // defpackage.aeux, j$.util.Collection, java.lang.Iterable, j$.lang.a
    public final /* bridge */ /* synthetic */ j$.util.Spliterator spliterator() {
        return super.spliterator();
    }
}
