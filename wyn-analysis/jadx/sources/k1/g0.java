package k1;

import android.os.Build;
import android.view.animation.Interpolator;

/* loaded from: classes.dex */
public final class g0 {

    /* renamed from: a, reason: collision with root package name */
    public f0 f38830a;

    public g0(int i5, Interpolator interpolator, long j8) {
        if (Build.VERSION.SDK_INT >= 30) {
            this.f38830a = new e0(com.applovin.impl.sdk.z.i(i5, interpolator, j8));
        } else {
            this.f38830a = new b0(i5, interpolator, j8);
        }
    }
}
