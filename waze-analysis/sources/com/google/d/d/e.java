package com.google.d.d;

import j$.util.Objects;
import java.util.Iterator;
import java.util.Map;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
final class e extends Cdo {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ g f7553a;

    e(g gVar) {
        Objects.requireNonNull(gVar);
        this.f7553a = gVar;
    }

    @Override // com.google.d.d.Cdo
    final Map a() {
        return this.f7553a;
    }

    @Override // com.google.d.d.Cdo, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        return fo.ai(this.f7553a.f7631a.entrySet(), obj);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator<Map.Entry> iterator() {
        return new f(this.f7553a);
    }

    @Override // com.google.d.d.Cdo, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean remove(Object obj) {
        if (!contains(obj)) {
            return false;
        }
        Map.Entry entry = (Map.Entry) Objects.requireNonNull((Map.Entry) obj);
        g gVar = this.f7553a;
        t.v(gVar.f7632b, entry.getKey());
        return true;
    }
}
