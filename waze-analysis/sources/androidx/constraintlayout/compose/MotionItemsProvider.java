package androidx.constraintlayout.compose;

import androidx.compose.runtime.Composer;
import androidx.constraintlayout.compose.MotionLayoutScope;
import h.ab;
import h.g.a.p;

/* compiled from: WazeSource */
/* loaded from: classes3.dex */
public interface MotionItemsProvider {
    int count();

    p<Composer, Integer, ab> getContent(int i2);

    p<Composer, Integer, ab> getContent(int i2, androidx.compose.runtime.State<MotionLayoutScope.MotionProperties> state);

    boolean hasItemsWithProperties();
}
