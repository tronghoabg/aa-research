package defpackage;

import android.content.Context;
import android.view.animation.AnimationUtils;
import android.widget.Scroller;
import androidx.car.app.model.Alert;
import java.util.concurrent.atomic.AtomicLong;

/* loaded from: classes3.dex */
public final class ufv {
    public final float a;
    public final float b;
    public float c;
    public float d;
    public float e;
    public float f;
    public int g;
    public int h;
    public final AtomicLong i = new AtomicLong(0);
    public final gms j;

    public ufv(Context context) {
        int i = ufy.a;
        Boolean bool = false;
        bool.getClass();
        this.j = new gms(context);
        float f = context.getResources().getDisplayMetrics().density;
        this.a = context.getResources().getDisplayMetrics().heightPixels * 0.125f;
        this.b = f + f;
    }

    public final int a(int i, int i2) {
        gms gmsVar = this.j;
        gmsVar.p();
        this.i.set(AnimationUtils.currentAnimationTimeMillis());
        Scroller scroller = (Scroller) gmsVar.a;
        scroller.fling(0, 0, i, 0, -i2, i2, Integer.MIN_VALUE, Alert.DURATION_SHOW_INDEFINITELY);
        return scroller.getFinalX();
    }
}
