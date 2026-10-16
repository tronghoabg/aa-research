package com.google.android.material.datepicker;

import android.view.View;
import j$.util.Objects;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
final class ay implements View.OnClickListener {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ int f6437a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ ba f6438b;

    ay(ba baVar, int i2) {
        this.f6437a = i2;
        Objects.requireNonNull(baVar);
        this.f6438b = baVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        ba baVar = this.f6438b;
        baVar.f6440a.q(baVar.f6440a.i().j(aj.h(this.f6437a, baVar.f6440a.l().f6398a)));
        baVar.f6440a.u(1);
        baVar.f6440a.p();
    }
}
