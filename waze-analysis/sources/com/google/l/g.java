package com.google.l;

import java.util.ArrayList;
import java.util.Iterator;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public final class g extends i implements Iterable {

    /* renamed from: a, reason: collision with root package name */
    private final ArrayList f12458a = new ArrayList();

    private final i g() {
        ArrayList arrayList = this.f12458a;
        int size = arrayList.size();
        if (size == 1) {
            return (i) arrayList.get(0);
        }
        throw new IllegalStateException("Array must have size 1, but has size " + size);
    }

    @Override // com.google.l.i
    public final int a() {
        return g().a();
    }

    public final i b(int i2) {
        return (i) this.f12458a.get(i2);
    }

    @Override // com.google.l.i
    public final String c() {
        return g().c();
    }

    public final void d(i iVar) {
        this.f12458a.add(iVar);
    }

    public final boolean equals(Object obj) {
        if (obj != this) {
            return (obj instanceof g) && ((g) obj).f12458a.equals(this.f12458a);
        }
        return true;
    }

    public final int hashCode() {
        return this.f12458a.hashCode();
    }

    @Override // java.lang.Iterable
    public final Iterator<i> iterator() {
        return this.f12458a.iterator();
    }
}
