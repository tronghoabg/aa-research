package com.google.d.d;

import j$.util.Objects;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
final class ai extends ak {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ ao f7413a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ai(ao aoVar) {
        super(aoVar);
        Objects.requireNonNull(aoVar);
        this.f7413a = aoVar;
    }

    @Override // com.google.d.d.ak
    final Object a(int i2) {
        return this.f7413a.C(i2);
    }
}
