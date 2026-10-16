package com.google.android.material.datepicker;

import j$.util.Objects;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
final class ae extends ap {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ ag f6374a;

    ae(ag agVar) {
        Objects.requireNonNull(agVar);
        this.f6374a = agVar;
    }

    @Override // com.google.android.material.datepicker.ap
    public final void a() {
        this.f6374a.z.setEnabled(false);
    }

    @Override // com.google.android.material.datepicker.ap
    public final void b(Object obj) {
        ag agVar = this.f6374a;
        agVar.d(agVar.b());
        agVar.z.setEnabled(agVar.q().k());
    }
}
