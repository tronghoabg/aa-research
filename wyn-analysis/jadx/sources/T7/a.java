package T7;

import android.R;
import android.app.Dialog;
import android.graphics.Rect;
import android.graphics.RectF;
import android.os.Build;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;

/* loaded from: classes4.dex */
public final class a implements View.OnTouchListener {

    /* renamed from: a, reason: collision with root package name */
    public final Dialog f11772a;

    /* renamed from: b, reason: collision with root package name */
    public final int f11773b;

    /* renamed from: c, reason: collision with root package name */
    public final int f11774c;

    /* renamed from: d, reason: collision with root package name */
    public final int f11775d;

    public a(Dialog dialog, Rect rect) {
        this.f11772a = dialog;
        this.f11773b = rect.left;
        this.f11774c = rect.top;
        this.f11775d = ViewConfiguration.get(dialog.getContext()).getScaledWindowTouchSlop();
    }

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        View viewFindViewById = view.findViewById(R.id.content);
        int left = viewFindViewById.getLeft() + this.f11773b;
        int width = viewFindViewById.getWidth() + left;
        if (new RectF(left, viewFindViewById.getTop() + this.f11774c, width, viewFindViewById.getHeight() + r4).contains(motionEvent.getX(), motionEvent.getY())) {
            return false;
        }
        MotionEvent motionEventObtain = MotionEvent.obtain(motionEvent);
        if (motionEvent.getAction() == 1) {
            motionEventObtain.setAction(4);
        }
        if (Build.VERSION.SDK_INT < 28) {
            motionEventObtain.setAction(0);
            int i5 = this.f11775d;
            motionEventObtain.setLocation((-i5) - 1, (-i5) - 1);
        }
        view.performClick();
        return this.f11772a.onTouchEvent(motionEventObtain);
    }
}
