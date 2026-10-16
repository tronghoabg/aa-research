package defpackage;

import j$.util.Set;
import j$.util.Spliterator;
import java.io.Serializable;
import java.util.Iterator;

/* loaded from: classes3.dex */
public final class aeun extends aetw implements Serializable, Cloneable, Set, aeum {
    private static final long serialVersionUID = -7046029254386353129L;

    protected aeun() {
    }

    private Object readResolve() {
        return aeuq.a;
    }

    @Override // defpackage.aetw, defpackage.aeqq, defpackage.aetv
    /* renamed from: a */
    public final /* synthetic */ aety iterator() {
        return aeue.a;
    }

    public final Object clone() {
        return aeuq.a;
    }

    @Override // defpackage.aetw, java.util.Collection
    public final boolean equals(Object obj) {
        return (obj instanceof java.util.Set) && ((java.util.Set) obj).isEmpty();
    }

    @Override // defpackage.aetw, defpackage.aeqq, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public final /* synthetic */ Iterator iterator() {
        return aeue.a;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean remove(Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // defpackage.aetw, defpackage.aeqq, java.util.Collection, java.lang.Iterable, j$.util.Collection, j$.lang.a
    public final /* synthetic */ Spliterator spliterator() {
        return aeuz.a;
    }
}
