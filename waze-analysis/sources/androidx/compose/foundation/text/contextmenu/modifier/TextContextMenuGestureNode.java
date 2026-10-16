package androidx.compose.foundation.text.contextmenu.modifier;

import androidx.compose.foundation.internal.InlineClassHelperKt;
import androidx.compose.foundation.text.contextmenu.data.TextContextMenuData;
import androidx.compose.foundation.text.contextmenu.gestures.RightClickGesturesKt;
import androidx.compose.foundation.text.contextmenu.provider.TextContextMenuDataProvider;
import androidx.compose.foundation.text.contextmenu.provider.TextContextMenuProvider;
import androidx.compose.foundation.text.contextmenu.provider.TextContextMenuProviderKt;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.geometry.RectKt;
import androidx.compose.ui.geometry.Size;
import androidx.compose.ui.input.pointer.PointerInputEventHandler;
import androidx.compose.ui.input.pointer.PointerInputScope;
import androidx.compose.ui.input.pointer.SuspendingPointerInputFilterKt;
import androidx.compose.ui.layout.LayoutCoordinates;
import androidx.compose.ui.node.CompositionLocalConsumerModifierNode;
import androidx.compose.ui.node.CompositionLocalConsumerModifierNodeKt;
import androidx.compose.ui.node.DelegatingNode;
import androidx.compose.ui.node.GlobalPositionAwareModifierNode;
import h.ab;
import h.c.a.a;
import h.c.e;
import h.g.a.l;
import h.g.a.p;
import h.g.b.o;
import h.g.b.u;
import kotlinx.coroutines.aj;

/* compiled from: WazeSource */
/* loaded from: classes.dex */
final class TextContextMenuGestureNode extends DelegatingNode implements CompositionLocalConsumerModifierNode, GlobalPositionAwareModifierNode {
    private static final Companion Companion = new Companion(null);
    private static final String MESSAGE = "Tried to open context menu before the anchor was placed.";
    private final MutableState localCoordinates$delegate = SnapshotStateKt.mutableStateOf(null, SnapshotStateKt.neverEqualPolicy());
    private p<? super Offset, ? super e<? super ab>, ? extends Object> onPreShowContextMenu;

    public TextContextMenuGestureNode(p<? super Offset, ? super e<? super ab>, ? extends Object> pVar) {
        this.onPreShowContextMenu = pVar;
        delegate(SuspendingPointerInputFilterKt.SuspendingPointerInputModifierNode(new PointerInputEventHandler() { // from class: androidx.compose.foundation.text.contextmenu.modifier.TextContextMenuGestureNode.1

            /* compiled from: WazeSource */
            /* renamed from: androidx.compose.foundation.text.contextmenu.modifier.TextContextMenuGestureNode$1$1, reason: invalid class name and collision with other inner class name */
            final /* synthetic */ class C00451 extends u implements l<Offset, ab> {
                C00451(Object obj) {
                    super(1, obj, TextContextMenuGestureNode.class, "tryShowContextMenu", "tryShowContextMenu-k-4lQ0M(J)V", 0);
                }

                @Override // h.g.a.l
                public /* bridge */ /* synthetic */ ab invoke(Offset offset) {
                    m3450invokek4lQ0M(offset.m7990unboximpl());
                    return ab.f48028a;
                }

                /* renamed from: invoke-k-4lQ0M, reason: not valid java name */
                public final void m3450invokek4lQ0M(long j2) {
                    ((TextContextMenuGestureNode) this.receiver).m3449tryShowContextMenuk4lQ0M(j2);
                }
            }

            @Override // androidx.compose.ui.input.pointer.PointerInputEventHandler
            public final Object invoke(PointerInputScope pointerInputScope, e<? super ab> eVar) {
                Object objOnRightClickDown = RightClickGesturesKt.onRightClickDown(pointerInputScope, new C00451(TextContextMenuGestureNode.this), eVar);
                return objOnRightClickDown == a.f48038a ? objOnRightClickDown : ab.f48028a;
            }
        }));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final LayoutCoordinates getLocalCoordinates() {
        return (LayoutCoordinates) this.localCoordinates$delegate.getValue();
    }

    private final void setLocalCoordinates(LayoutCoordinates layoutCoordinates) {
        this.localCoordinates$delegate.setValue(layoutCoordinates);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: tryShowContextMenu-k-4lQ0M, reason: not valid java name */
    public final void m3449tryShowContextMenuk4lQ0M(long j2) {
        TextContextMenuProvider textContextMenuProvider = (TextContextMenuProvider) CompositionLocalConsumerModifierNodeKt.currentValueOf(this, TextContextMenuProviderKt.getLocalTextContextMenuDropdownProvider());
        if (textContextMenuProvider == null) {
            return;
        }
        aj.z(getCoroutineScope(), null, null, new TextContextMenuGestureNode$tryShowContextMenu$1(this, j2, textContextMenuProvider, new ClickTextContextMenuDataProvider(this, j2, null), null), 3);
    }

    @Override // androidx.compose.ui.node.GlobalPositionAwareModifierNode
    public void onGloballyPositioned(LayoutCoordinates layoutCoordinates) {
        setLocalCoordinates(layoutCoordinates);
    }

    public final void update(p<? super Offset, ? super e<? super ab>, ? extends Object> pVar) {
        this.onPreShowContextMenu = pVar;
    }

    /* compiled from: WazeSource */
    final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(o oVar) {
            this();
        }
    }

    /* compiled from: WazeSource */
    final class ClickTextContextMenuDataProvider implements TextContextMenuDataProvider {
        private final long localClickOffset;

        private ClickTextContextMenuDataProvider(long j2) {
            this.localClickOffset = j2;
        }

        @Override // androidx.compose.foundation.text.contextmenu.provider.TextContextMenuDataProvider
        public Rect contentBounds(LayoutCoordinates layoutCoordinates) {
            return RectKt.m8020Recttz77jQw(mo3451positiontuRUvjQ(layoutCoordinates), Size.Companion.m8058getZeroNHjbRc());
        }

        @Override // androidx.compose.foundation.text.contextmenu.provider.TextContextMenuDataProvider
        public TextContextMenuData data() {
            return TextContextMenuModifierKt.collectTextContextMenuData(TextContextMenuGestureNode.this);
        }

        @Override // androidx.compose.foundation.text.contextmenu.provider.TextContextMenuDataProvider
        /* renamed from: position-tuRUvjQ, reason: not valid java name */
        public long mo3451positiontuRUvjQ(LayoutCoordinates layoutCoordinates) {
            LayoutCoordinates localCoordinates = TextContextMenuGestureNode.this.getLocalCoordinates();
            if (localCoordinates != null) {
                return !localCoordinates.isAttached() ? Offset.Companion.m7996getZeroF1C5BW0() : layoutCoordinates.mo9749screenToLocalMKHz9U(localCoordinates.mo9747localToScreenMKHz9U(this.localClickOffset));
            }
            InlineClassHelperKt.throwIllegalStateExceptionForNullCheck(TextContextMenuGestureNode.MESSAGE);
            throw new h.e();
        }

        public /* synthetic */ ClickTextContextMenuDataProvider(TextContextMenuGestureNode textContextMenuGestureNode, long j2, o oVar) {
            this(j2);
        }
    }
}
