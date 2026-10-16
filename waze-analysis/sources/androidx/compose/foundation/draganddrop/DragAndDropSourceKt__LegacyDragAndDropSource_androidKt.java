package androidx.compose.foundation.draganddrop;

import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.drawscope.DrawScope;
import h.ab;
import h.c.e;
import h.g.a.l;
import h.g.a.p;

/* compiled from: WazeSource */
/* loaded from: classes.dex */
final /* synthetic */ class DragAndDropSourceKt__LegacyDragAndDropSource_androidKt {
    public static final Modifier dragAndDropSource(Modifier modifier, l<? super DrawScope, ab> lVar, p<? super DragAndDropSourceScope, ? super e<? super ab>, ? extends Object> pVar) {
        return modifier.then(new LegacyDragAndDropSourceElement(lVar, pVar));
    }
}
