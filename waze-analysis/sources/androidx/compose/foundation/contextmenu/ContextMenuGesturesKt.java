package androidx.compose.foundation.contextmenu;

import androidx.compose.foundation.contextmenu.ContextMenuState;
import androidx.compose.foundation.text.contextmenu.gestures.RightClickGesturesKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.input.pointer.PointerInputEventHandler;
import androidx.compose.ui.input.pointer.PointerInputScope;
import androidx.compose.ui.input.pointer.SuspendingPointerInputFilterKt;
import h.ab;
import h.c.a.a;
import h.c.e;
import h.g.a.l;

/* compiled from: WazeSource */
/* loaded from: classes.dex */
public final class ContextMenuGesturesKt {
    public static final Modifier contextMenuGestures(Modifier modifier, final l<? super Offset, ab> lVar) {
        return SuspendingPointerInputFilterKt.pointerInput(modifier, ContextMenuKey.INSTANCE, new PointerInputEventHandler() { // from class: androidx.compose.foundation.contextmenu.ContextMenuGesturesKt.contextMenuGestures.2
            @Override // androidx.compose.ui.input.pointer.PointerInputEventHandler
            public final Object invoke(PointerInputScope pointerInputScope, e<? super ab> eVar) {
                Object objOnRightClickDown = RightClickGesturesKt.onRightClickDown(pointerInputScope, lVar, eVar);
                return objOnRightClickDown == a.f48038a ? objOnRightClickDown : ab.f48028a;
            }
        });
    }

    static final ab contextMenuGestures$lambda$0(ContextMenuState contextMenuState, Offset offset) {
        contextMenuState.setStatus(new ContextMenuState.Status.Open(offset.m7990unboximpl(), null));
        return ab.f48028a;
    }

    public static final Modifier contextMenuGestures(Modifier modifier, final ContextMenuState contextMenuState) {
        return contextMenuGestures(modifier, (l<? super Offset, ab>) new l() { // from class: androidx.compose.foundation.contextmenu.ContextMenuGesturesKt$$ExternalSyntheticLambda0
            @Override // h.g.a.l
            public final Object invoke(Object obj) {
                return ContextMenuGesturesKt.contextMenuGestures$lambda$0(contextMenuState, (Offset) obj);
            }
        });
    }
}
