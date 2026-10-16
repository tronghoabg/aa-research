package com.carstream.tech.car;

import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import defpackage.l3;

/* compiled from: r8-map-id-0308adb7379ba4f751dce57ff165d4b8556222573b5bec89923a9da20a3bb2b7 */
/* loaded from: classes.dex */
public final class k extends FrameLayout {
    public final /* synthetic */ CarScreen a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(CarScreen carScreen, CarScreen carScreen2) {
        super(carScreen2);
        this.a = carScreen;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        c cVar;
        int actionMasked = motionEvent.getActionMasked();
        CarScreen carScreen = this.a;
        if (actionMasked == 0 && (cVar = carScreen.autoOpen) != null && cVar.c) {
            cVar.c = false;
        }
        if (motionEvent.getActionMasked() == 0 && carScreen.controlsAutoHide() && !carScreen.lopPhuDangMo()) {
            l3 l3Var = carScreen.controlBar;
            View view = l3Var == null ? null : l3Var.c;
            boolean z = view == null || view.getVisibility() != 0;
            if (z && !carScreen.isFullscreen() && carScreen.hitsChrome(motionEvent)) {
                return super.dispatchTouchEvent(motionEvent);
            }
            carScreen.revealControls();
            if (z) {
                return true;
            }
        }
        return super.dispatchTouchEvent(motionEvent);
    }
}
