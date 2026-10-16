package com.google.d.d;

import j$.util.Objects;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
final class ba extends fv {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ Iterable[] f7444a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ba(bb bbVar, Iterable[] iterableArr) {
        super(2, 0);
        this.f7444a = iterableArr;
        Objects.requireNonNull(bbVar);
    }

    @Override // com.google.d.d.fv
    final /* bridge */ /* synthetic */ Object a(int i2) {
        return this.f7444a[i2].iterator();
    }
}
