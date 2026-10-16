package com.google.d.d;

import j$.util.Objects;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
final class ah extends ak {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ ao f7412a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ah(ao aoVar) {
        super(aoVar);
        Objects.requireNonNull(aoVar);
        this.f7412a = aoVar;
    }

    @Override // com.google.d.d.ak
    final /* bridge */ /* synthetic */ Object a(int i2) {
        return new am(this.f7412a, i2);
    }
}
