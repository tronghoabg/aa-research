package androidx.compose.foundation;

import android.os.Build;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.layout.LayoutCoordinates;
import h.g.a.l;

/* compiled from: WazeSource */
/* loaded from: classes.dex */
public final class PreferKeepClear_androidKt {
    public static final Modifier preferKeepClear(Modifier modifier) {
        return Build.VERSION.SDK_INT < 33 ? modifier : modifier.then(new PreferKeepClearElement(null));
    }

    private static final Modifier preferKeepClearT(l<? super LayoutCoordinates, Rect> lVar) {
        return new PreferKeepClearElement(lVar);
    }

    public static final Modifier preferKeepClear(Modifier modifier, l<? super LayoutCoordinates, Rect> lVar) {
        return Build.VERSION.SDK_INT < 33 ? modifier : modifier.then(new PreferKeepClearElement(lVar));
    }
}
