package com.waze.reports;

import android.view.View;
import j$.util.Objects;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
final class bu implements View.OnClickListener {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ bx f33732a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ cl f33733b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ bv f33734c;

    bu(bv bvVar, bx bxVar, cl clVar) {
        this.f33732a = bxVar;
        this.f33733b = clVar;
        Objects.requireNonNull(bvVar);
        this.f33734c = bvVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        bv bvVar = this.f33734c;
        int iB = bvVar.b(this.f33732a);
        if (iB < 0) {
            return;
        }
        bz bzVar = bvVar.f33736b;
        if (iB != bzVar.f33753g.getCurrentItem()) {
            bzVar.f33753g.setCurrentItem(iB, true);
            return;
        }
        bzVar.f33754h = bz.e(view, bzVar.f33756j, iB, this.f33733b);
        bzVar.f33754h.setOnDismissListener(new bt(this));
    }
}
