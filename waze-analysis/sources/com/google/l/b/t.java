package com.google.l.b;

import j$.util.Objects;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.NoSuchElementException;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
abstract class t implements Iterator {

    /* renamed from: a, reason: collision with root package name */
    u f12386a;

    /* renamed from: b, reason: collision with root package name */
    u f12387b;

    /* renamed from: c, reason: collision with root package name */
    int f12388c;

    /* renamed from: d, reason: collision with root package name */
    final /* synthetic */ v f12389d;

    t(v vVar) {
        Objects.requireNonNull(vVar);
        this.f12389d = vVar;
        this.f12386a = vVar.f12403d.f12393d;
        this.f12387b = null;
        this.f12388c = vVar.f12402c;
    }

    final u a() {
        v vVar = this.f12389d;
        u uVar = this.f12386a;
        if (uVar == vVar.f12403d) {
            throw new NoSuchElementException();
        }
        if (vVar.f12402c != this.f12388c) {
            throw new ConcurrentModificationException();
        }
        this.f12386a = uVar.f12393d;
        this.f12387b = uVar;
        return uVar;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f12386a != this.f12389d.f12403d;
    }

    @Override // java.util.Iterator
    public final void remove() {
        u uVar = this.f12387b;
        if (uVar == null) {
            throw new IllegalStateException();
        }
        v vVar = this.f12389d;
        vVar.e(uVar, true);
        this.f12387b = null;
        this.f12388c = vVar.f12402c;
    }
}
