package defpackage;

import j$.util.Set;
import j$.util.Spliterator;
import java.io.Serializable;
import java.util.Iterator;

/* loaded from: classes3.dex */
public final class aepy extends aepc implements Serializable, Cloneable, Set, aepx {
    private static final long serialVersionUID = -7046029254386353129L;

    protected aepy() {
    }

    private Object readResolve() {
        return aeqa.a;
    }

    @Override // defpackage.aepc, defpackage.aeld, defpackage.aepb
    /* renamed from: a */
    public final /* synthetic */ aepm m() {
        return aepr.a;
    }

    @Override // defpackage.aeld, java.util.AbstractCollection, java.util.Collection
    @Deprecated
    public final /* synthetic */ boolean add(Object obj) {
        return adqq.as(this, (Long) obj);
    }

    public final Object clone() {
        return aeqa.a;
    }

    @Override // defpackage.aepc, java.util.Collection
    public final boolean equals(Object obj) {
        return (obj instanceof java.util.Set) && ((java.util.Set) obj).isEmpty();
    }

    @Override // defpackage.aepc, defpackage.aeld, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    /* renamed from: iterator */
    public final /* synthetic */ Iterator m() {
        return aepr.a;
    }

    @Override // defpackage.aepc, defpackage.aeld, java.util.Collection, java.lang.Iterable, j$.util.Collection, j$.lang.a
    public final /* synthetic */ Spliterator spliterator() {
        return aeqj.a;
    }
}
