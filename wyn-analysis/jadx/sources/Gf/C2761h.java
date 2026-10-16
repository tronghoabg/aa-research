package gf;

import ff.i;
import java.io.Serializable;
import java.util.Collection;
import java.util.Iterator;
import kotlin.jvm.internal.AbstractC3340k;

/* renamed from: gf.h, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C2761h extends i implements Serializable {

    /* renamed from: b, reason: collision with root package name */
    public static final C2761h f35909b;

    /* renamed from: a, reason: collision with root package name */
    public final C2759f f35910a;

    static {
        C2759f c2759f = C2759f.f35894n;
        f35909b = new C2761h(C2759f.f35894n);
    }

    public C2761h(C2759f backing) {
        AbstractC3340k.e(backing, "backing");
        this.f35910a = backing;
    }

    @Override // ff.i
    public final int a() {
        return this.f35910a.f35903i;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean add(Object obj) {
        return this.f35910a.a(obj) >= 0;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean addAll(Collection elements) {
        AbstractC3340k.e(elements, "elements");
        this.f35910a.d();
        return super.addAll(elements);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final void clear() {
        this.f35910a.clear();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        return this.f35910a.containsKey(obj);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean isEmpty() {
        return this.f35910a.isEmpty();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        C2759f c2759f = this.f35910a;
        c2759f.getClass();
        return new C2756c(c2759f, 1);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean remove(Object obj) {
        C2759f c2759f = this.f35910a;
        c2759f.d();
        int i5 = c2759f.i(obj);
        if (i5 < 0) {
            return false;
        }
        c2759f.m(i5);
        return true;
    }

    @Override // java.util.AbstractSet, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean removeAll(Collection elements) {
        AbstractC3340k.e(elements, "elements");
        this.f35910a.d();
        return super.removeAll(elements);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean retainAll(Collection elements) {
        AbstractC3340k.e(elements, "elements");
        this.f35910a.d();
        return super.retainAll(elements);
    }

    public C2761h() {
        this(new C2759f());
    }
}
