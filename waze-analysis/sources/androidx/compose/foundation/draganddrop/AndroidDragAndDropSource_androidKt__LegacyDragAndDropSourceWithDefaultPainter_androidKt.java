package androidx.compose.foundation.draganddrop;

import androidx.compose.ui.Modifier;
import h.ab;
import h.c.e;
import h.g.a.p;

/* compiled from: WazeSource */
/* loaded from: classes.dex */
final /* synthetic */ class AndroidDragAndDropSource_androidKt__LegacyDragAndDropSourceWithDefaultPainter_androidKt {
    public static final Modifier dragAndDropSource(Modifier modifier, p<? super DragAndDropSourceScope, ? super e<? super ab>, ? extends Object> pVar) {
        return modifier.then(new LegacyDragAndDropSourceWithDefaultShadowElement(pVar));
    }
}
