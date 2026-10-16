package com.waze.reports;

import android.view.View;
import j$.util.Objects;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
final class ce implements View.OnClickListener {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ bx f33771a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ cg f33772b;

    ce(cg cgVar, bx bxVar) {
        this.f33771a = bxVar;
        Objects.requireNonNull(cgVar);
        this.f33772b = cgVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        cg cgVar = this.f33772b;
        int iA = cgVar.a(this.f33771a);
        if (iA >= 0) {
            cm.l(cgVar.f33775a, iA);
        }
    }
}
