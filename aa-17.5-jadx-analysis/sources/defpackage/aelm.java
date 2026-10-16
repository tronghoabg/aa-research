package defpackage;

import j$.util.SortedSet;
import j$.util.Spliterator;
import java.util.Comparator;

/* loaded from: classes3.dex */
public abstract class aelm extends aell implements SortedSet, aeqb {
    protected aelm() {
    }

    @Override // defpackage.aell, defpackage.aeld, defpackage.aepb
    /* renamed from: a */
    public /* bridge */ /* synthetic */ aepm m() {
        throw null;
    }

    @Override // defpackage.aell, defpackage.aeld, java.util.AbstractCollection, java.util.Collection
    @Deprecated
    public /* synthetic */ boolean add(Object obj) {
        return adqq.as(this, (Long) obj);
    }

    @Override // defpackage.aell, defpackage.aeld, defpackage.aepb
    /* renamed from: b */
    public /* synthetic */ aeqd spliterator() {
        throw null;
    }

    @Override // java.util.SortedSet
    public /* bridge */ /* synthetic */ Comparator comparator() {
        return null;
    }

    @Override // java.util.SortedSet
    public final /* synthetic */ Object first() {
        return q();
    }

    @Override // java.util.SortedSet
    public final /* bridge */ /* synthetic */ java.util.SortedSet headSet(Object obj) {
        return n((Long) obj);
    }

    @Override // java.util.SortedSet
    public final /* synthetic */ Object last() {
        return r();
    }

    @Override // defpackage.aell, defpackage.aeld, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public abstract aeoz m();

    @Override // defpackage.aeqb
    public final /* synthetic */ aeqb n(Long l) {
        l.longValue();
        return v();
    }

    @Override // defpackage.aeqb
    public final /* synthetic */ aeqb o(Long l, Long l2) {
        l.longValue();
        l2.longValue();
        return w();
    }

    @Override // defpackage.aeqb
    public final /* synthetic */ aeqb p(Long l) {
        l.longValue();
        return x();
    }

    @Override // defpackage.aeqb
    public final /* synthetic */ Long q() {
        return Long.valueOf(s());
    }

    @Override // defpackage.aeqb
    public final /* synthetic */ Long r() {
        return Long.valueOf(t());
    }

    @Override // defpackage.aell, defpackage.aeld, java.util.Collection, java.lang.Iterable, j$.util.Collection, j$.lang.a
    public /* synthetic */ Spliterator spliterator() {
        return spliterator();
    }

    @Override // java.util.SortedSet
    public final /* bridge */ /* synthetic */ java.util.SortedSet subSet(Object obj, Object obj2) {
        return o((Long) obj, (Long) obj2);
    }

    @Override // java.util.SortedSet
    public final /* bridge */ /* synthetic */ java.util.SortedSet tailSet(Object obj) {
        return p((Long) obj);
    }
}
