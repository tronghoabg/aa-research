package com.waze.reports;

import android.text.Editable;
import android.text.TextWatcher;
import j$.util.Objects;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
final class d implements TextWatcher {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ f f33820a;

    /* renamed from: b, reason: collision with root package name */
    private final PointsView f33821b;

    /* renamed from: c, reason: collision with root package name */
    private final int f33822c;

    /* renamed from: d, reason: collision with root package name */
    private String f33823d;

    /* renamed from: e, reason: collision with root package name */
    private e f33824e;

    /* synthetic */ d(f fVar, PointsView pointsView, int i2, e eVar) {
        Objects.requireNonNull(fVar);
        this.f33820a = fVar;
        this.f33824e = null;
        this.f33821b = pointsView;
        this.f33822c = i2;
        this.f33823d = "";
        pointsView.a(i2);
        this.f33824e = eVar;
        if (eVar == null) {
            pointsView.c(true);
        } else {
            pointsView.c(eVar.a(this.f33823d));
            fVar.f33932k.add(pointsView);
        }
        pointsView.f(false, false);
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
        boolean zA;
        PointsView pointsView = this.f33821b;
        if (pointsView.d()) {
            this.f33820a.f33925d -= this.f33822c;
        }
        e eVar = this.f33824e;
        if (eVar != null) {
            zA = eVar.a(editable.toString());
            pointsView.c(zA);
        } else {
            zA = true;
        }
        boolean zContentEquals = this.f33823d.contentEquals(editable);
        boolean z = false;
        if (editable.length() > 0 && !zContentEquals && zA) {
            z = true;
        }
        pointsView.f(z, true);
        if (z) {
            this.f33820a.f33925d += this.f33822c;
        }
    }

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i2, int i3, int i4) {
    }

    @Override // android.text.TextWatcher
    public final void onTextChanged(CharSequence charSequence, int i2, int i3, int i4) {
    }
}
