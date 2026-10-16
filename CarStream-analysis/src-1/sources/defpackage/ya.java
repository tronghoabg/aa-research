package defpackage;

import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import com.carstream.tech.car.CarScreen;
import com.carstream.tech.car.e;

/* compiled from: r8-map-id-0308adb7379ba4f751dce57ff165d4b8556222573b5bec89923a9da20a3bb2b7 */
/* loaded from: classes.dex */
public final class ya implements View.OnTouchListener {
    public float a;
    public float b;
    public int c;
    public int d;
    public final /* synthetic */ za e;

    public ya(za zaVar) {
        this.e = zaVar;
    }

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) view.getLayoutParams();
        e eVar = this.e.a;
        FrameLayout frameLayout = eVar.b.rootLayout;
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            this.a = motionEvent.getRawX();
            this.b = motionEvent.getRawY();
            this.c = layoutParams.leftMargin;
            this.d = layoutParams.topMargin;
            return true;
        }
        if (actionMasked != 1) {
            if (actionMasked == 2) {
                layoutParams.leftMargin = za.e(this.c + ((int) (motionEvent.getRawX() - this.a)), frameLayout.getWidth() - view.getWidth());
                layoutParams.topMargin = za.e(this.d + ((int) (motionEvent.getRawY() - this.b)), frameLayout.getHeight() - view.getHeight());
                view.setLayoutParams(layoutParams);
                return true;
            }
            if (actionMasked != 3) {
                return false;
            }
        }
        CarScreen carScreen = eVar.b;
        xc.n(layoutParams.leftMargin, carScreen, za.a(frameLayout));
        xc.n(layoutParams.topMargin, carScreen, za.b(frameLayout));
        xc.n(layoutParams.leftMargin, carScreen, "speedX");
        xc.n(layoutParams.topMargin, carScreen, "speedY");
        int i = layoutParams.leftMargin;
        int i2 = layoutParams.topMargin;
        c1 c1Var = za.h;
        if (c1Var != null) {
            ic icVar = (ic) c1Var.b;
            icVar.f = ic.b(i, Math.max(0, icVar.b - icVar.d));
            icVar.g = ic.b(i2, Math.max(0, icVar.c - icVar.e));
            icVar.invalidate();
        }
        return true;
    }
}
