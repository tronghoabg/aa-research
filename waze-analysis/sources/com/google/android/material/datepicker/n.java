package com.google.android.material.datepicker;

import android.view.View;
import j$.util.Objects;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
final class n implements View.OnClickListener {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ ao f6480a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ z f6481b;

    n(z zVar, ao aoVar) {
        this.f6480a = aoVar;
        Objects.requireNonNull(zVar);
        this.f6481b = zVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        z zVar = this.f6481b;
        int iM = zVar.b().M();
        ao aoVar = this.f6480a;
        aoVar.d(2);
        zVar.q(aoVar.b(iM + 1));
    }
}
