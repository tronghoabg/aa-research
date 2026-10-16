package com.waze.reports;

import android.view.View;
import j$.util.Objects;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
final class cb implements View.OnClickListener {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ cg f33761a;

    cb(cg cgVar) {
        Objects.requireNonNull(cgVar);
        this.f33761a = cgVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        cm.k(this.f33761a.f33775a);
    }
}
