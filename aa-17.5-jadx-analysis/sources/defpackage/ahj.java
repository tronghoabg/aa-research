package defpackage;

import android.R;
import android.view.animation.BounceInterpolator;
import java.util.HashMap;

/* loaded from: classes2.dex */
public final class ahj {
    public static final aes a;
    public static final aes b;
    public static final aes c = new ahg(new BounceInterpolator());
    public static final aes d;
    public static final HashMap e;

    static {
        final int i = 1;
        a = new aes() { // from class: ahi
            @Override // defpackage.aes
            public final float a(float f) {
                int i2 = i;
                if (i2 == 0) {
                    aes aesVar = ahj.a;
                    return f * f;
                }
                if (i2 == 1) {
                    aes aesVar2 = ahj.a;
                    return (float) ((Math.cos((f + 1.0f) * 3.141592653589793d) / 2.0d) + 0.5d);
                }
                aes aesVar3 = ahj.a;
                float f2 = 1.0f - f;
                return 1.0f - (f2 * f2);
            }
        };
        final int i2 = 0;
        b = new aes() { // from class: ahi
            @Override // defpackage.aes
            public final float a(float f) {
                int i22 = i2;
                if (i22 == 0) {
                    aes aesVar = ahj.a;
                    return f * f;
                }
                if (i22 == 1) {
                    aes aesVar2 = ahj.a;
                    return (float) ((Math.cos((f + 1.0f) * 3.141592653589793d) / 2.0d) + 0.5d);
                }
                aes aesVar3 = ahj.a;
                float f2 = 1.0f - f;
                return 1.0f - (f2 * f2);
            }
        };
        final int i3 = 2;
        d = new aes() { // from class: ahi
            @Override // defpackage.aes
            public final float a(float f) {
                int i22 = i3;
                if (i22 == 0) {
                    aes aesVar = ahj.a;
                    return f * f;
                }
                if (i22 == 1) {
                    aes aesVar2 = ahj.a;
                    return (float) ((Math.cos((f + 1.0f) * 3.141592653589793d) / 2.0d) + 0.5d);
                }
                aes aesVar3 = ahj.a;
                float f2 = 1.0f - f;
                return 1.0f - (f2 * f2);
            }
        };
        Integer numValueOf = Integer.valueOf(R.interpolator.fast_out_linear_in);
        Integer numValueOf2 = Integer.valueOf(R.interpolator.fast_out_slow_in);
        Integer numValueOf3 = Integer.valueOf(R.interpolator.linear_out_slow_in);
        aes aesVar = aev.b;
        e = woy.aZ(new aezu(Integer.valueOf(R.anim.linear_interpolator), aev.d), new aezu(numValueOf, aev.c), new aezu(numValueOf2, aev.a), new aezu(Integer.valueOf(R.interpolator.linear), aev.d), new aezu(numValueOf3, aesVar), new aezu(numValueOf, aev.c), new aezu(numValueOf2, aev.a), new aezu(numValueOf3, aesVar));
    }
}
