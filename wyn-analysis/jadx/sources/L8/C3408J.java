package l8;

import java.util.Iterator;
import java.util.ListIterator;

/* renamed from: l8.J, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C3408J extends AbstractC3409K {

    /* renamed from: c, reason: collision with root package name */
    public final transient int f40053c;

    /* renamed from: d, reason: collision with root package name */
    public final transient int f40054d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ AbstractC3409K f40055e;

    public C3408J(AbstractC3409K abstractC3409K, int i5, int i10) {
        this.f40055e = abstractC3409K;
        this.f40053c = i5;
        this.f40054d = i10;
    }

    @Override // l8.AbstractC3404F
    public final Object[] c() {
        return this.f40055e.c();
    }

    @Override // l8.AbstractC3404F
    public final int d() {
        return this.f40055e.e() + this.f40053c + this.f40054d;
    }

    @Override // l8.AbstractC3404F
    public final int e() {
        return this.f40055e.e() + this.f40053c;
    }

    @Override // l8.AbstractC3404F
    public final boolean f() {
        return true;
    }

    @Override // java.util.List
    public final Object get(int i5) {
        Fe.e.s(i5, this.f40054d);
        return this.f40055e.get(i5 + this.f40053c);
    }

    @Override // l8.AbstractC3409K, l8.AbstractC3404F, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        return listIterator(0);
    }

    @Override // l8.AbstractC3409K, java.util.List
    public final ListIterator listIterator() {
        return listIterator(0);
    }

    @Override // l8.AbstractC3409K, java.util.List
    /* renamed from: q */
    public final AbstractC3409K subList(int i5, int i10) {
        Fe.e.v(i5, i10, this.f40054d);
        int i11 = this.f40053c;
        return this.f40055e.subList(i5 + i11, i10 + i11);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f40054d;
    }

    @Override // l8.AbstractC3409K, java.util.List
    public final /* bridge */ /* synthetic */ ListIterator listIterator(int i5) {
        return listIterator(i5);
    }
}
