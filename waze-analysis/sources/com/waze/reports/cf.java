package com.waze.reports;

import android.view.View;
import j$.util.Objects;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
final class cf implements View.OnClickListener {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ bx f33773a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ cg f33774b;

    cf(cg cgVar, bx bxVar) {
        this.f33773a = bxVar;
        Objects.requireNonNull(cgVar);
        this.f33774b = cgVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        cg cgVar = this.f33774b;
        int iA = cgVar.a(this.f33773a);
        if (iA < 0) {
            return;
        }
        cm.n(cgVar.f33775a, iA);
    }
}
