package androidx.compose.ui.layout;

import android.graphics.Rect;
import androidx.collection.MutableObjectList;
import androidx.collection.ScatterMap;
import androidx.compose.runtime.MutableState;
import java.util.List;

/* compiled from: WazeSource */
/* loaded from: classes.dex */
public interface WindowInsetsRulerProvider {
    MutableObjectList<MutableState<Rect>> getCutoutRects();

    List<RectRulers> getCutoutRulers();

    InsetsListener getInsetsListener();

    ScatterMap<Object, WindowWindowInsetsAnimationValues> getInsetsValues();
}
