package defpackage;

import j$.util.SortedSet;
import j$.util.Spliterator;

/* loaded from: classes3.dex */
public abstract class aeqx<K> extends aeqw<K> implements SortedSet<K>, aeur {
    protected aeqx() {
    }

    @Override // defpackage.aeqw, defpackage.aeqq, defpackage.aetv
    /* renamed from: a */
    public /* bridge */ /* synthetic */ aety iterator() {
        throw null;
    }

    @Override // defpackage.aeqw, defpackage.aeqq, defpackage.aetv
    public /* synthetic */ aeus b() {
        throw null;
    }

    @Override // defpackage.aeqw, defpackage.aeqq, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    /* renamed from: c */
    public abstract aetu iterator();

    public /* synthetic */ java.util.SortedSet headSet(Object obj) {
        return headSet(obj);
    }

    @Override // defpackage.aeqw, defpackage.aeqq, java.util.Collection, java.lang.Iterable, j$.util.Collection, j$.lang.a
    public /* synthetic */ Spliterator spliterator() {
        return b();
    }

    public /* synthetic */ java.util.SortedSet subSet(Object obj, Object obj2) {
        return subSet(obj, obj2);
    }

    public /* synthetic */ java.util.SortedSet tailSet(Object obj) {
        return tailSet(obj);
    }
}
