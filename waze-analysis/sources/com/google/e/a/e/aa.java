package com.google.e.a.e;

import j$.util.Objects;
import java.util.Iterator;
import java.util.List;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
final class aa implements Iterable {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ List f8409a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ List f8410b;

    aa(ad adVar, List list, List list2) {
        this.f8409a = list;
        this.f8410b = list2;
        Objects.requireNonNull(adVar);
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return new ac(this.f8409a.iterator(), this.f8410b.iterator());
    }
}
