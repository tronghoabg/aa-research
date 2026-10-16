package com.waze.planned_drive;

import android.app.Activity;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
public final /* synthetic */ class v implements com.waze.ab.h {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Object f33370a;

    /* renamed from: b, reason: collision with root package name */
    private final /* synthetic */ int f33371b;

    public /* synthetic */ v(Object obj, int i2) {
        this.f33371b = i2;
        this.f33370a = obj;
    }

    @Override // com.waze.ab.h
    public final void a() {
        int i2 = this.f33371b;
        if (i2 == 0) {
            ((PlannedDriveFragment) this.f33370a).F(y.f33375b);
            return;
        }
        Object obj = this.f33370a;
        if (i2 != 1) {
            ((PlannedDriveFragment) obj).r.q();
        } else {
            ((Activity) obj).finish();
        }
    }
}
