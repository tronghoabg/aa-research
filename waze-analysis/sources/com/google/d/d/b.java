package com.google.d.d;

import j$.util.DesugarCollections;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Map;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: WazeSource */
/* loaded from: classes4.dex */
public class b<K, V> extends t<K, V> implements dc<K, V> {
    private static final long serialVersionUID = 6588350623831699109L;

    b(Map map) {
        super(map);
    }

    @Override // com.google.d.d.t
    /* bridge */ /* synthetic */ Collection a() {
        throw null;
    }

    @Override // com.google.d.d.t
    final /* synthetic */ Collection b() {
        return Collections.EMPTY_LIST;
    }

    @Override // com.google.d.d.t, com.google.d.d.dw
    public final /* bridge */ /* synthetic */ Collection d(Object obj) {
        return (List) super.d(obj);
    }

    @Override // com.google.d.d.t
    final Collection e(Collection collection) {
        return DesugarCollections.unmodifiableList((List) collection);
    }

    @Override // com.google.d.d.t
    final Collection f(Object obj, Collection collection) {
        return n(obj, (List) collection, null);
    }

    @Override // com.google.d.d.t, com.google.d.d.dw
    public final List g(Object obj) {
        return (List) super.g(obj);
    }
}
