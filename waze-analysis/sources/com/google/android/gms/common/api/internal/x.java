package com.google.android.gms.common.api.internal;

import j$.util.Objects;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
final class x implements j {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ ah f4854a;

    x(ah ahVar) {
        Objects.requireNonNull(ahVar);
        this.f4854a = ahVar;
    }

    @Override // com.google.android.gms.common.api.internal.j
    public final void a(boolean z) {
        ah ahVar = this.f4854a;
        ahVar.s.sendMessage(ahVar.s.obtainMessage(1, Boolean.valueOf(z)));
    }
}
