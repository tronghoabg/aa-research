package androidx.compose.foundation.text.handwriting;

import android.os.Build;

/* compiled from: WazeSource */
/* loaded from: classes.dex */
public final class StylusHandwriting_androidKt {
    private static final boolean isStylusHandwritingSupported;

    static {
        isStylusHandwritingSupported = Build.VERSION.SDK_INT >= 34;
    }

    public static final boolean isStylusHandwritingSupported() {
        return isStylusHandwritingSupported;
    }
}
