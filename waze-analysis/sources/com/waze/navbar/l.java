package com.waze.navbar;

import android.view.MotionEvent;
import android.view.View;
import j$.util.Objects;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
final class l implements View.OnTouchListener {

    /* renamed from: a, reason: collision with root package name */
    float f30897a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ p f30898b;

    l(p pVar) {
        Objects.requireNonNull(pVar);
        this.f30898b = pVar;
        this.f30897a = 0.0f;
    }

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        p pVar = this.f30898b;
        if (!pVar.m) {
            return false;
        }
        if (motionEvent.getAction() == 0) {
            this.f30897a = motionEvent.getY();
        } else if (motionEvent.getAction() == 2) {
            if (pVar.f30911j.bNearingMinimized && motionEvent.getY() - this.f30897a > 40.0f) {
                pVar.s();
            } else if (!pVar.f30911j.bNearingMinimized && this.f30897a - motionEvent.getY() > 40.0f) {
                pVar.s();
            }
        } else if (motionEvent.getAction() == 1) {
            this.f30897a = 0.0f;
        }
        return view == pVar;
    }
}
