package com.google.d.c;

import j$.util.Objects;
import java.util.Iterator;
import java.util.Map;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
final class ab extends o {

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ bd f7258b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ab(bd bdVar) {
        super(bdVar);
        Objects.requireNonNull(bdVar);
        this.f7258b = bdVar;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        Map.Entry entry;
        Object key;
        bd bdVar;
        Object obj2;
        if ((obj instanceof Map.Entry) && (key = (entry = (Map.Entry) obj).getKey()) != null && (obj2 = (bdVar = this.f7258b).get(key)) != null) {
            if (bdVar.f7352i.f(entry.getValue(), obj2)) {
                return true;
            }
        }
        return false;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator<Map.Entry> iterator() {
        return new aa(this.f7258b);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean remove(Object obj) {
        Map.Entry entry;
        Object key;
        return (obj instanceof Map.Entry) && (key = (entry = (Map.Entry) obj).getKey()) != null && this.f7258b.remove(key, entry.getValue());
    }
}
