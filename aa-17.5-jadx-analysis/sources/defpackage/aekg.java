package defpackage;

import j$.util.Set;
import j$.util.Spliterator;
import java.io.Serializable;
import java.util.Iterator;

/* loaded from: classes3.dex */
public final class aekg extends aejg implements Serializable, Cloneable, Set, aekf {
    private static final long serialVersionUID = -7046029254386353129L;

    protected aekg() {
    }

    private Object readResolve() {
        return aekj.a;
    }

    @Override // defpackage.aejg, defpackage.aegj, defpackage.aejf
    /* renamed from: a */
    public final /* synthetic */ aejr m() {
        return aejx.a;
    }

    @Override // defpackage.aegj, java.util.AbstractCollection, java.util.Collection
    @Deprecated
    public final /* synthetic */ boolean add(Object obj) {
        return adzo.q(this, (Integer) obj);
    }

    public final Object clone() {
        return aekj.a;
    }

    @Override // defpackage.aejg, java.util.Collection
    public final boolean equals(Object obj) {
        return (obj instanceof java.util.Set) && ((java.util.Set) obj).isEmpty();
    }

    @Override // defpackage.aejg, defpackage.aegj, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    /* renamed from: iterator */
    public final /* synthetic */ Iterator m() {
        return aejx.a;
    }

    @Override // defpackage.aejg, defpackage.aegj, java.util.Collection, java.lang.Iterable, j$.util.Collection, j$.lang.a
    public final /* synthetic */ Spliterator spliterator() {
        return aekt.a;
    }
}
