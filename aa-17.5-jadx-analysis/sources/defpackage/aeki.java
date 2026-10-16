package defpackage;

import j$.util.Set;
import j$.util.Spliterator;
import java.io.Serializable;
import java.util.Iterator;

/* loaded from: classes3.dex */
public final class aeki extends aejh implements Serializable, Set, aekf {
    private static final long serialVersionUID = -7046029254386353129L;

    public aeki(aekf aekfVar) {
        super(aekfVar);
    }

    @Override // defpackage.aejh, java.util.Collection
    @Deprecated
    public final /* bridge */ /* synthetic */ boolean add(Object obj) {
        return aejh.f();
    }

    @Override // defpackage.aejh, defpackage.aejf
    public final /* bridge */ /* synthetic */ boolean c(int i) {
        throw null;
    }

    @Override // defpackage.aejh, defpackage.aejf
    public final /* bridge */ /* synthetic */ boolean d(aejf aejfVar) {
        throw null;
    }

    @Override // defpackage.aejh, java.util.Collection
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        return this.a.equals(obj);
    }

    @Override // defpackage.aejh, defpackage.aejf
    @Deprecated
    public final boolean g(int i) {
        throw null;
    }

    @Override // defpackage.aejh, java.util.Collection
    public final int hashCode() {
        return this.a.hashCode();
    }

    @Override // defpackage.aejh, java.util.Collection, java.lang.Iterable
    public final /* bridge */ /* synthetic */ Iterator iterator() {
        return super.iterator();
    }

    @Override // defpackage.aejh, j$.util.Collection, java.lang.Iterable, j$.lang.a
    public final /* bridge */ /* synthetic */ Spliterator spliterator() {
        return super.spliterator();
    }
}
