package defpackage;

import j$.util.Set;
import j$.util.Spliterator;
import java.io.Serializable;
import java.util.Iterator;

/* loaded from: classes3.dex */
public final class aepz extends aepd implements Serializable, Set, aepx {
    private static final long serialVersionUID = -7046029254386353129L;

    public aepz(aepx aepxVar) {
        super(aepxVar);
    }

    @Override // defpackage.aepd, java.util.Collection
    @Deprecated
    public final /* bridge */ /* synthetic */ boolean add(Object obj) {
        return aepd.d();
    }

    @Override // defpackage.aepd, defpackage.aepb
    public final /* bridge */ /* synthetic */ boolean c(long j) {
        throw null;
    }

    @Override // defpackage.aepd, java.util.Collection
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        return this.a.equals(obj);
    }

    @Override // defpackage.aepd, defpackage.aepb
    @Deprecated
    public final boolean g(long j) {
        throw null;
    }

    @Override // defpackage.aepd, java.util.Collection
    public final int hashCode() {
        return this.a.hashCode();
    }

    @Override // defpackage.aepd, java.util.Collection, java.lang.Iterable
    public final /* bridge */ /* synthetic */ Iterator iterator() {
        return super.m();
    }

    @Override // defpackage.aepd, defpackage.aepb
    public final /* bridge */ /* synthetic */ long[] k() {
        throw null;
    }

    @Override // defpackage.aepd, j$.util.Collection, java.lang.Iterable, j$.lang.a
    public final /* bridge */ /* synthetic */ Spliterator spliterator() {
        return super.spliterator();
    }
}
