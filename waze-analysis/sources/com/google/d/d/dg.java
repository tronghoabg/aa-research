package com.google.d.d;

import j$.util.Objects;
import java.util.ListIterator;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
final class dg extends fq {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ dh f7535a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    dg(dh dhVar, ListIterator listIterator) {
        super(listIterator);
        Objects.requireNonNull(dhVar);
        this.f7535a = dhVar;
    }

    @Override // com.google.d.d.fp
    final Object a(Object obj) {
        return this.f7535a.f7537b.apply(obj);
    }
}
