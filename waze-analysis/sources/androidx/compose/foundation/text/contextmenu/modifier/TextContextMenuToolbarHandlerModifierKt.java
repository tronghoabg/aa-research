package androidx.compose.foundation.text.contextmenu.modifier;

import androidx.compose.ui.Modifier;
import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.geometry.RectKt;
import androidx.compose.ui.layout.LayoutCoordinates;
import androidx.compose.ui.layout.LayoutCoordinatesKt;
import h.ab;
import h.c.e;
import h.g.a.l;

/* compiled from: WazeSource */
/* loaded from: classes.dex */
public final class TextContextMenuToolbarHandlerModifierKt {
    private static final String ToolbarRequesterNotInitialized = "ToolbarRequester is not initialized.";

    public static final Modifier textContextMenuToolbarHandler(Modifier modifier, ToolbarRequester toolbarRequester, l<? super e<? super ab>, ? extends Object> lVar, l<? super e<? super ab>, ? extends Object> lVar2, l<? super LayoutCoordinates, Rect> lVar3) {
        return modifier.then(new TextContextMenuToolbarHandlerElement(toolbarRequester, lVar, lVar2, lVar3));
    }

    public static /* synthetic */ Modifier textContextMenuToolbarHandler$default(Modifier modifier, ToolbarRequester toolbarRequester, l lVar, l lVar2, l lVar3, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            lVar = null;
        }
        if ((i2 & 4) != 0) {
            lVar2 = null;
        }
        return textContextMenuToolbarHandler(modifier, toolbarRequester, lVar, lVar2, lVar3);
    }

    public static final Rect translateRootToDestination(Rect rect, LayoutCoordinates layoutCoordinates, LayoutCoordinates layoutCoordinates2) {
        if (!layoutCoordinates.isAttached() || !layoutCoordinates2.isAttached()) {
            return Rect.Companion.getZero();
        }
        return RectKt.m8020Recttz77jQw(layoutCoordinates2.mo9749screenToLocalMKHz9U(LayoutCoordinatesKt.findRootCoordinates(layoutCoordinates).mo9747localToScreenMKHz9U(rect.m8015getTopLeftF1C5BW0())), rect.m8013getSizeNHjbRc());
    }
}
