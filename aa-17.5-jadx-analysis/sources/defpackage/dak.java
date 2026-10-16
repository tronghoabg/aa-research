package defpackage;

import android.os.Build;
import android.view.ViewConfiguration;

/* loaded from: classes.dex */
public final class dak implements dcc {
    private final ViewConfiguration a;

    public dak(ViewConfiguration viewConfiguration) {
        this.a = viewConfiguration;
    }

    @Override // defpackage.dcc
    public final float a() {
        if (Build.VERSION.SDK_INT >= 34) {
            return this.a.getScaledHandwritingGestureLineMargin();
        }
        return 16.0f;
    }

    @Override // defpackage.dcc
    public final float b() {
        if (Build.VERSION.SDK_INT >= 34) {
            return this.a.getScaledHandwritingSlop();
        }
        return 2.0f;
    }

    @Override // defpackage.dcc
    public final float c() {
        return this.a.getScaledMaximumFlingVelocity();
    }

    @Override // defpackage.dcc
    public final float d() {
        return this.a.getScaledTouchSlop();
    }

    @Override // defpackage.dcc
    public final long e() {
        return ViewConfiguration.getDoubleTapTimeout();
    }

    @Override // defpackage.dcc
    public final long f() {
        return ViewConfiguration.getLongPressTimeout();
    }

    @Override // defpackage.dcc
    public final /* synthetic */ long g() {
        return roc.aA(48.0f, 48.0f);
    }

    @Override // defpackage.dcc
    public final void h() {
    }
}
