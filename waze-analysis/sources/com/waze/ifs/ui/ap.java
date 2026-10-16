package com.waze.ifs.ui;

import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.ex;
import android.support.v7.widget.fa;
import android.view.MotionEvent;
import android.view.View;
import j$.util.Objects;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
final class ap extends ex {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ fa f24520a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ at f24521b;

    ap(at atVar, fa faVar) {
        this.f24520a = faVar;
        Objects.requireNonNull(atVar);
        this.f24521b = atVar;
    }

    @Override // android.support.v7.widget.ex, android.support.v7.widget.eq
    public final boolean h(RecyclerView recyclerView, MotionEvent motionEvent) {
        View viewR = recyclerView.r(motionEvent.getX(), motionEvent.getY());
        if (viewR == null) {
            return false;
        }
        at atVar = this.f24521b;
        if (!atVar.f24532b.onTouchEvent(motionEvent)) {
            return false;
        }
        int iE = atVar.f24531a.e(viewR);
        atVar.f24537g = iE % atVar.b();
        fa faVar = this.f24520a;
        faVar.h(iE);
        atVar.f24533c.bh(faVar);
        return true;
    }
}
