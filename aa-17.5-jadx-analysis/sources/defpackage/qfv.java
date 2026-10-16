package defpackage;

import android.view.MotionEvent;
import android.view.View;
import com.google.android.gearhead.appdecor.DrawerContentLayout;
import com.google.android.libraries.maps.model.BitmapDescriptorFactory;
import com.google.android.projection.gearhead.sdk.CarAppLayout;

/* loaded from: classes2.dex */
public final /* synthetic */ class qfv implements View.OnTouchListener {
    private final /* synthetic */ int a;

    public /* synthetic */ qfv(int i) {
        this.a = i;
    }

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        int i = this.a;
        if (i == 0) {
            yph yphVar = DrawerContentLayout.a;
            return true;
        }
        if (i == 1) {
            afia[] afiaVarArr = niy.a;
            view.performClick();
            lau.c().j(ywk.UNKNOWN_CANCEL_TRIGGER);
            return false;
        }
        if (i == 2) {
            yph yphVar2 = DrawerContentLayout.a;
            return true;
        }
        if (i == 3) {
            if (motionEvent.getAction() == 1) {
                view.performClick();
            }
            return true;
        }
        if (i == 4) {
            if (motionEvent.getAction() == 0) {
                view.setPressed(true);
            } else if (motionEvent.getAction() == 1) {
                view.performClick();
                view.setPressed(false);
            }
            return false;
        }
        if (i == 5) {
            return true;
        }
        yph yphVar3 = CarAppLayout.a;
        if (motionEvent.getActionMasked() != 1 || motionEvent.getX() < BitmapDescriptorFactory.HUE_RED || motionEvent.getX() >= view.getWidth() || motionEvent.getY() < BitmapDescriptorFactory.HUE_RED || motionEvent.getY() >= view.getHeight()) {
            return false;
        }
        return view.performClick();
    }
}
