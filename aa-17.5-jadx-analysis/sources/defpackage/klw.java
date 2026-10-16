package defpackage;

import android.content.Intent;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import com.google.android.projection.gearhead.R;

/* loaded from: classes2.dex */
final class klw implements View.OnTouchListener {
    float a;
    float b;
    float c;
    boolean d;
    VelocityTracker e;
    final float f;
    final int g;
    final int h;
    final int i;
    final /* synthetic */ klx j;

    public klw(klx klxVar) {
        this.j = klxVar;
        this.f = klxVar.getResources().getDisplayMetrics().density * 105.0f;
        this.g = klxVar.getResources().getDimensionPixelSize(R.dimen.car_home_touch_slop);
        ViewConfiguration viewConfiguration = ViewConfiguration.get(klxVar.getActivity());
        this.h = viewConfiguration.getScaledMinimumFlingVelocity();
        this.i = viewConfiguration.getScaledMaximumFlingVelocity();
    }

    private final float b(MotionEvent motionEvent) {
        return motionEvent.getRawY() + this.a;
    }

    private final void c() {
        klx klxVar = this.j;
        klxVar.c();
        klxVar.b();
        klxVar.e.animate().y(klxVar.c).setDuration(200L).start();
    }

    private final void d() {
        VelocityTracker velocityTracker = this.e;
        if (velocityTracker != null) {
            velocityTracker.recycle();
            this.e = null;
        }
    }

    public final void a() {
        this.d = true;
        d();
        bc activity = this.j.getActivity();
        ((ype) klx.a.l().ai((char) 3201)).u("UnlockSwipeListener.unlock");
        mox.b().e();
        activity.finish();
        activity.overridePendingTransition(0, R.anim.abc_fade_out);
        activity.startActivity(new Intent("android.intent.action.MAIN").addCategory("android.intent.category.HOME"));
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x0085  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x008a  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0133  */
    @Override // android.view.View.OnTouchListener
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean onTouch(android.view.View r8, android.view.MotionEvent r9) {
        /*
            Method dump skipped, instructions count: 364
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.klw.onTouch(android.view.View, android.view.MotionEvent):boolean");
    }
}
