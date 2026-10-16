package androidx.compose.ui.text.style;

import androidx.compose.ui.util.MathHelpersKt;
import h.g.a.a;

/* compiled from: WazeSource */
/* loaded from: classes.dex */
public final class BaselineShiftKt {
    /* renamed from: isSpecified-4Dl_Bck, reason: not valid java name */
    public static final boolean m10888isSpecified4Dl_Bck(float f2) {
        return !Float.isNaN(f2);
    }

    /* renamed from: lerp-jWV1Mfo, reason: not valid java name */
    public static final float m10889lerpjWV1Mfo(float f2, float f3, float f4) {
        return MathHelpersKt.lerp(f2, f3, f4);
    }

    /* renamed from: takeOrElse-JpAxnlU, reason: not valid java name */
    public static final float m10890takeOrElseJpAxnlU(float f2, a<BaselineShift> aVar) {
        return Float.isNaN(f2) ? aVar.invoke().m10879unboximpl() : f2;
    }
}
