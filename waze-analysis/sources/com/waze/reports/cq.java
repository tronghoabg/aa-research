package com.waze.reports;

import android.text.Editable;
import android.text.TextWatcher;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class cq implements TextWatcher {

    /* renamed from: a, reason: collision with root package name */
    private final PointsView f33794a;

    /* renamed from: b, reason: collision with root package name */
    private final int f33795b;

    /* renamed from: c, reason: collision with root package name */
    private final String f33796c;

    /* renamed from: d, reason: collision with root package name */
    private cp f33797d;

    /* renamed from: e, reason: collision with root package name */
    private final ax f33798e;

    public cq(ax axVar, PointsView pointsView, int i2, cp cpVar, String str) {
        this.f33797d = null;
        this.f33798e = axVar;
        this.f33794a = pointsView;
        boolean z = (str == null || str.isEmpty()) ? false : true;
        this.f33795b = i2;
        str = str == null ? "" : str;
        this.f33796c = str;
        this.f33797d = cpVar;
        if (cpVar == null) {
            pointsView.c(true);
        } else {
            axVar.s(pointsView);
            pointsView.c(cpVar.a(str));
        }
        pointsView.b(i2, z);
        pointsView.f(false, false);
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
        boolean zA;
        PointsView pointsView = this.f33794a;
        int i2 = pointsView.d() ? -this.f33795b : 0;
        cp cpVar = this.f33797d;
        if (cpVar != null) {
            zA = cpVar.a(editable.toString());
            pointsView.c(zA);
        } else {
            zA = true;
        }
        boolean zContentEquals = this.f33796c.contentEquals(editable);
        if (!zContentEquals) {
            this.f33798e.t();
        }
        editable.length();
        boolean z = zContentEquals || !zA;
        pointsView.f(z, true);
        if (z) {
            i2 += this.f33795b;
        }
        this.f33798e.F(i2);
    }

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i2, int i3, int i4) {
    }

    @Override // android.text.TextWatcher
    public final void onTextChanged(CharSequence charSequence, int i2, int i3, int i4) {
    }
}
