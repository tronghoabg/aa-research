package com.google.d.d;

import java.util.Iterator;
import java.util.List;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
final class ct extends bc {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ Iterable f7511a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ int f7512b;

    ct(Iterable iterable, int i2) {
        this.f7511a = iterable;
        this.f7512b = i2;
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        List list = (List) this.f7511a;
        return list.subList(Math.min(list.size(), this.f7512b), list.size()).iterator();
    }
}
