package com.applovin.impl;

import android.view.MotionEvent;
import android.view.View;

/* loaded from: classes.dex */
public final /* synthetic */ class C implements View.OnTouchListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f20754a;

    public /* synthetic */ C(int i5) {
        this.f20754a = i5;
    }

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        switch (this.f20754a) {
            case 0:
                return a2.a(view, motionEvent);
            default:
                return com.applovin.impl.adview.b.a(view, motionEvent);
        }
    }
}
