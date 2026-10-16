package com.waze.trip_overview.c.a;

import android.view.View;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final /* synthetic */ class b implements View.OnClickListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Object f41205a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f41206b;

    /* renamed from: c, reason: collision with root package name */
    private final /* synthetic */ int f41207c;

    public /* synthetic */ b(ab abVar, ac acVar, int i2) {
        this.f41207c = i2;
        this.f41206b = abVar;
        this.f41205a = acVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        if (this.f41207c != 0) {
            ab.x((ab) this.f41206b, (ac) this.f41205a);
        } else {
            ab.w((ab) this.f41205a, (com.waze.trip_overview.r) this.f41206b);
        }
    }

    public /* synthetic */ b(ab abVar, com.waze.trip_overview.r rVar, int i2) {
        this.f41207c = i2;
        this.f41205a = abVar;
        this.f41206b = rVar;
    }
}
