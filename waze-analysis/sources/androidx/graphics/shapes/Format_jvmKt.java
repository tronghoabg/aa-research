package androidx.graphics.shapes;

import h.g.b.x;
import java.util.Arrays;

/* compiled from: WazeSource */
/* loaded from: classes3.dex */
public final class Format_jvmKt {
    public static final String toStringWithLessPrecision(float f2) {
        String str = String.format("%.3f", Arrays.copyOf(new Object[]{Float.valueOf(f2)}, 1));
        x.e(str, "format(...)");
        return str;
    }
}
