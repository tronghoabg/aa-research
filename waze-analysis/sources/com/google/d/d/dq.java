package com.google.d.d;

import j$.util.Objects;
import java.util.Iterator;
import java.util.Map;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
final class dq extends Cdo {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ dr f7544a;

    dq(dr drVar) {
        Objects.requireNonNull(drVar);
        this.f7544a = drVar;
    }

    @Override // com.google.d.d.Cdo
    final Map a() {
        return this.f7544a;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator<Map.Entry> iterator() {
        return this.f7544a.a();
    }
}
