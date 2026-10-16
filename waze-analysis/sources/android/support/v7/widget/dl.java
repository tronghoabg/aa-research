package android.support.v7.widget;

import android.view.MotionEvent;
import android.view.View;
import android.widget.PopupWindow;

/* compiled from: WazeSource */
/* loaded from: classes2.dex */
final class dl implements View.OnTouchListener {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ dm f1350a;

    dl(dm dmVar) {
        this.f1350a = dmVar;
    }

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        int x = (int) motionEvent.getX();
        int y = (int) motionEvent.getY();
        if (action != 0) {
            if (action != 1) {
                return false;
            }
            dm dmVar = this.f1350a;
            dmVar.f1355e.removeCallbacks(dmVar.f1357g);
            return false;
        }
        dm dmVar2 = this.f1350a;
        PopupWindow popupWindow = dmVar2.f1356f;
        if (popupWindow == null || !popupWindow.isShowing() || x < 0 || x >= dmVar2.f1356f.getWidth() || y < 0 || y >= dmVar2.f1356f.getHeight()) {
            return false;
        }
        dmVar2.f1355e.postDelayed(dmVar2.f1357g, 250L);
        return false;
    }
}
