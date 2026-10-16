package com.google.d.d;

import j$.util.Objects;
import java.util.AbstractMap;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
final class d extends h {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    d(t tVar) {
        super(tVar);
        Objects.requireNonNull(tVar);
    }

    @Override // com.google.d.d.h
    final /* synthetic */ Object a(Object obj, Object obj2) {
        return new AbstractMap.SimpleImmutableEntry(obj, obj2);
    }
}
