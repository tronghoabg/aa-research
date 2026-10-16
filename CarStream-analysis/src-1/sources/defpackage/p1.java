package defpackage;

import android.view.MotionEvent;
import android.view.View;

/* compiled from: r8-map-id-0308adb7379ba4f751dce57ff165d4b8556222573b5bec89923a9da20a3bb2b7 */
/* loaded from: classes.dex */
public final class p1 implements View.OnTouchListener {
    public float a;
    public boolean b;
    public final /* synthetic */ r1 c;

    public p1(r1 r1Var) {
        this.c = r1Var;
    }

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        o5 o5Var;
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            this.a = motionEvent.getRawX();
            this.b = false;
            return true;
        }
        if (actionMasked != 1) {
            if (actionMasked == 2) {
                float rawX = motionEvent.getRawX() - this.a;
                if (!this.b && rawX < (-this.c.c(12)) && (o5Var = u1.e) != null && o5Var.h != null) {
                    this.b = true;
                }
                if (this.b && rawX < 0.0f) {
                    view.setTranslationX(rawX);
                    view.setAlpha(Math.max(0.35f, (rawX / (view.getWidth() * 1.2f)) + 1.0f));
                }
                return true;
            }
            if (actionMasked != 3) {
                return false;
            }
        }
        float rawX2 = motionEvent.getRawX() - this.a;
        if (!this.b || rawX2 >= (-view.getWidth()) / 3.0f) {
            view.animate().translationX(0.0f).alpha(1.0f).setDuration(150L).start();
            return true;
        }
        view.animate().translationX(-view.getWidth()).alpha(0.0f).setDuration(150L).withEndAction(new o1(0)).start();
        return true;
    }
}
