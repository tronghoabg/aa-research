package defpackage;

import android.view.MotionEvent;
import android.view.View;

/* compiled from: r8-map-id-0308adb7379ba4f751dce57ff165d4b8556222573b5bec89923a9da20a3bb2b7 */
/* loaded from: classes.dex */
public final class p6 implements View.OnTouchListener {
    public final /* synthetic */ r6 a;

    public p6(r6 r6Var) {
        this.a = r6Var;
    }

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        int i;
        l7 l7Var = k1.g;
        if (l7Var == null) {
            r6.r++;
            if (r6.r <= 8) {
                u5.d("CHAM: co cham nhung KHONG co bo chieu (MirrorHub.live=null)");
            }
            return false;
        }
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            i = 0;
        } else if (actionMasked == 1) {
            i = 1;
        } else if (actionMasked != 2) {
            if (actionMasked != 3) {
                if (actionMasked != 5) {
                    if (actionMasked != 6) {
                        return true;
                    }
                }
                i = 0;
            }
            i = 1;
        } else {
            i = 2;
        }
        if (i == 2 || actionMasked == 3) {
            for (int i2 = 0; i2 < motionEvent.getPointerCount(); i2++) {
                r6.a(this.a, l7Var, view, motionEvent, i2, i);
            }
        } else {
            r6.a(this.a, l7Var, view, motionEvent, motionEvent.getActionIndex(), i);
        }
        return true;
    }
}
