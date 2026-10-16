package defpackage;

import android.content.Context;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;

/* compiled from: r8-map-id-0308adb7379ba4f751dce57ff165d4b8556222573b5bec89923a9da20a3bb2b7 */
/* loaded from: classes.dex */
public final class z7 implements View.OnTouchListener {
    public float a;
    public float b;
    public int c;
    public int d;
    public boolean e;
    public final /* synthetic */ FrameLayout f;
    public final /* synthetic */ int g;
    public final /* synthetic */ Context h;
    public final /* synthetic */ a8 i;

    public z7(a8 a8Var, FrameLayout frameLayout, int i, Context context) {
        this.i = a8Var;
        this.f = frameLayout;
        this.g = i;
        this.h = context;
    }

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) view.getLayoutParams();
        int actionMasked = motionEvent.getActionMasked();
        FrameLayout frameLayout = this.f;
        if (actionMasked == 0) {
            this.a = motionEvent.getRawX();
            this.b = motionEvent.getRawY();
            this.e = false;
            if (layoutParams.gravity != 8388659) {
                int[] iArr = new int[2];
                int[] iArr2 = new int[2];
                view.getLocationInWindow(iArr);
                frameLayout.getLocationInWindow(iArr2);
                int i = iArr[0] - iArr2[0];
                int i2 = iArr[1] - iArr2[1];
                layoutParams.gravity = 8388659;
                layoutParams.setMarginEnd(0);
                layoutParams.bottomMargin = 0;
                layoutParams.leftMargin = i;
                layoutParams.topMargin = i2;
                view.setLayoutParams(layoutParams);
            }
            this.c = layoutParams.leftMargin;
            this.d = layoutParams.topMargin;
            view.setPressed(true);
            return true;
        }
        if (actionMasked != 1) {
            if (actionMasked == 2) {
                float rawX = motionEvent.getRawX() - this.a;
                float rawY = motionEvent.getRawY() - this.b;
                if (!this.e && Math.hypot(rawX, rawY) > this.g) {
                    this.e = true;
                }
                if (this.e) {
                    view.setPressed(false);
                    layoutParams.leftMargin = Math.max(0, Math.min(this.c + ((int) rawX), Math.max(0, frameLayout.getWidth() - view.getWidth())));
                    layoutParams.topMargin = Math.max(0, Math.min(this.d + ((int) rawY), Math.max(0, frameLayout.getHeight() - view.getHeight())));
                    view.setLayoutParams(layoutParams);
                }
                return true;
            }
            if (actionMasked != 3) {
                return false;
            }
        }
        view.setPressed(false);
        if (!this.e) {
            view.performClick();
            return true;
        }
        a8 a8Var = this.i;
        String strA = a8.a(a8Var, "fabX");
        int i3 = layoutParams.leftMargin;
        Context context = this.h;
        xc.n(i3, context, strA);
        xc.n(layoutParams.topMargin, context, a8.a(a8Var, "fabY"));
        return true;
    }
}
