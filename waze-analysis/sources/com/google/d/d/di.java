package com.google.d.d;

import j$.util.Objects;
import java.util.ListIterator;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
final class di extends fq {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ dj f7538a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    di(dj djVar, ListIterator listIterator) {
        super(listIterator);
        Objects.requireNonNull(djVar);
        this.f7538a = djVar;
    }

    @Override // com.google.d.d.fp
    final Object a(Object obj) {
        return this.f7538a.f7540b.apply(obj);
    }
}
