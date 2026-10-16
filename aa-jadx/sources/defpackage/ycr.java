package defpackage;

/* JADX INFO: loaded from: classes3.dex */
class ycr extends defpackage.ycm implements java.util.SortedSet {
    final /* synthetic */ defpackage.ycs g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ycr(defpackage.ycs ycsVar, java.lang.Object obj, java.util.SortedSet sortedSet, defpackage.ycm ycmVar) {
        super(ycsVar, obj, sortedSet, ycmVar);
        this.g = ycsVar;
    }

    @Override // java.util.SortedSet
    public final java.util.Comparator comparator() {
        return e().comparator();
    }

    public java.util.SortedSet e() {
        return (java.util.SortedSet) this.b;
    }

    @Override // java.util.SortedSet
    public final java.lang.Object first() {
        b();
        return e().first();
    }

    @Override // java.util.SortedSet
    public final java.util.SortedSet headSet(java.lang.Object obj) {
        b();
        java.util.SortedSet sortedSetHeadSet = e().headSet(obj);
        defpackage.ycm ycmVar = this.c;
        if (ycmVar == null) {
            ycmVar = this;
        }
        return new defpackage.ycr(this.g, this.a, sortedSetHeadSet, ycmVar);
    }

    @Override // java.util.SortedSet
    public final java.lang.Object last() {
        b();
        return e().last();
    }

    @Override // java.util.SortedSet
    public final java.util.SortedSet subSet(java.lang.Object obj, java.lang.Object obj2) {
        b();
        java.util.SortedSet sortedSetSubSet = e().subSet(obj, obj2);
        defpackage.ycm ycmVar = this.c;
        if (ycmVar == null) {
            ycmVar = this;
        }
        return new defpackage.ycr(this.g, this.a, sortedSetSubSet, ycmVar);
    }

    @Override // java.util.SortedSet
    public final java.util.SortedSet tailSet(java.lang.Object obj) {
        b();
        java.util.SortedSet sortedSetTailSet = e().tailSet(obj);
        defpackage.ycm ycmVar = this.c;
        if (ycmVar == null) {
            ycmVar = this;
        }
        return new defpackage.ycr(this.g, this.a, sortedSetTailSet, ycmVar);
    }
}
