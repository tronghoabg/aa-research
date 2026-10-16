package com.waze.navigate.location_preview;

import android.view.MotionEvent;
import androidx.compose.ui.platform.ComposeView;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
final class n implements kotlinx.coroutines.b.l {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ ComposeView f31745a;

    n(ComposeView composeView) {
        this.f31745a = composeView;
    }

    @Override // kotlinx.coroutines.b.l
    public final /* bridge */ /* synthetic */ Object emit(Object obj, h.c.e eVar) {
        MotionEvent motionEvent = (MotionEvent) obj;
        this.f31745a.dispatchTouchEvent(motionEvent);
        motionEvent.recycle();
        return h.ab.f48028a;
    }
}
