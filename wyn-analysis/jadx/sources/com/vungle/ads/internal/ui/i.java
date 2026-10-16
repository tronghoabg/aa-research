package com.vungle.ads.internal.ui;

import android.view.MotionEvent;

/* loaded from: classes5.dex */
public final class i implements com.vungle.ads.internal.ui.view.h {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ l f33727a;

    public i(l lVar) {
        this.f33727a = lVar;
    }

    @Override // com.vungle.ads.internal.ui.view.h
    public final boolean onTouch(MotionEvent motionEvent) {
        com.vungle.ads.internal.presenter.r rVar = this.f33727a.f33732a;
        if (rVar == null) {
            return false;
        }
        rVar.a(motionEvent);
        return false;
    }
}
