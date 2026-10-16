package defpackage;

import j$.util.SortedSet;
import j$.util.Spliterator;
import java.util.Comparator;

/* loaded from: classes3.dex */
public abstract class aegs extends aegr implements SortedSet, aekk {
    protected aegs() {
    }

    @Override // defpackage.aegr, defpackage.aegj, defpackage.aejf
    /* renamed from: a */
    public /* bridge */ /* synthetic */ aejr iterator() {
        throw null;
    }

    @Override // defpackage.aegr, defpackage.aegj, java.util.AbstractCollection, java.util.Collection
    @Deprecated
    public /* synthetic */ boolean add(Object obj) {
        return adzo.q(this, (Integer) obj);
    }

    @Override // defpackage.aegr, defpackage.aegj, defpackage.aejf
    /* renamed from: b */
    public /* synthetic */ aekm spliterator() {
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
        return n((Integer) obj);
    }

    @Override // java.util.SortedSet
    public final /* synthetic */ Object last() {
        return r();
    }

    @Override // defpackage.aegr, defpackage.aegj, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public abstract aejd m();

    @Override // defpackage.aekk
    public final /* synthetic */ aekk n(Integer num) {
        num.intValue();
        return v();
    }

    @Override // defpackage.aekk
    public final /* synthetic */ aekk o(Integer num, Integer num2) {
        num.intValue();
        num2.intValue();
        return w();
    }

    @Override // defpackage.aekk
    public final /* synthetic */ aekk p(Integer num) {
        num.intValue();
        return x();
    }

    @Override // defpackage.aekk
    public final /* synthetic */ Integer q() {
        return Integer.valueOf(s());
    }

    @Override // defpackage.aekk
    public final /* synthetic */ Integer r() {
        return Integer.valueOf(t());
    }

    @Override // defpackage.aegr, defpackage.aegj, java.util.Collection, java.lang.Iterable, j$.util.Collection, j$.lang.a
    public /* synthetic */ Spliterator spliterator() {
        return spliterator();
    }

    @Override // java.util.SortedSet
    public final /* bridge */ /* synthetic */ java.util.SortedSet subSet(Object obj, Object obj2) {
        return o((Integer) obj, (Integer) obj2);
    }

    @Override // java.util.SortedSet
    public final /* bridge */ /* synthetic */ java.util.SortedSet tailSet(Object obj) {
        return p((Integer) obj);
    }
}
