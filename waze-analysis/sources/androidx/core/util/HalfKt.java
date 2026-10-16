package androidx.core.util;

import android.util.Half;
import h.g.b.x;

/* compiled from: WazeSource */
/* loaded from: classes3.dex */
public final class HalfKt {
    public static final Half toHalf(String str) {
        x.f(str, "<this>");
        Half halfValueOf = Half.valueOf(str);
        x.e(halfValueOf, "valueOf(...)");
        return halfValueOf;
    }

    public static final Half toHalf(float f2) {
        Half halfValueOf = Half.valueOf(f2);
        x.e(halfValueOf, "valueOf(...)");
        return halfValueOf;
    }

    public static final Half toHalf(double d2) {
        Half halfValueOf = Half.valueOf((float) d2);
        x.e(halfValueOf, "valueOf(...)");
        return halfValueOf;
    }

    public static final Half toHalf(short s) {
        Half halfValueOf = Half.valueOf(s);
        x.e(halfValueOf, "valueOf(...)");
        return halfValueOf;
    }
}
