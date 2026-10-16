package com.waze.reports;

import android.view.View;
import j$.util.Objects;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
final class ap implements View.OnClickListener {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ View f33619a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ View f33620b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ br f33621c;

    /* renamed from: d, reason: collision with root package name */
    final /* synthetic */ aq f33622d;

    ap(aq aqVar, View view, View view2, br brVar) {
        this.f33619a = view;
        this.f33620b = view2;
        this.f33621c = brVar;
        Objects.requireNonNull(aqVar);
        this.f33622d = aqVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        aq aqVar = this.f33622d;
        aqVar.p.removeView(this.f33619a);
        View view2 = this.f33620b;
        if (view2 != null) {
            aqVar.p.removeView(view2);
        }
        aqVar.f33634l.remove(this.f33621c);
        aqVar.q.setVisibility(true != aqVar.f33634l.isEmpty() ? 0 : 8);
    }
}
