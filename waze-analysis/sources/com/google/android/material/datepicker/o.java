package com.google.android.material.datepicker;

import android.view.View;
import j$.util.Objects;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
final class o implements View.OnClickListener {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ ao f6482a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ z f6483b;

    o(z zVar, ao aoVar) {
        this.f6482a = aoVar;
        Objects.requireNonNull(zVar);
        this.f6483b = zVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        z zVar = this.f6483b;
        int iN = zVar.b().N();
        ao aoVar = this.f6482a;
        aoVar.d(1);
        zVar.q(aoVar.b(iN - 1));
    }
}
