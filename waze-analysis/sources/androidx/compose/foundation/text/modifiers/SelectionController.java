package androidx.compose.foundation.text.modifiers;

import androidx.compose.foundation.text.selection.MultiWidgetSelectionDelegate;
import androidx.compose.foundation.text.selection.Selectable;
import androidx.compose.foundation.text.selection.Selection;
import androidx.compose.foundation.text.selection.SelectionRegistrar;
import androidx.compose.runtime.RememberObserver;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.ClipOp;
import androidx.compose.ui.graphics.Path;
import androidx.compose.ui.graphics.drawscope.DrawContext;
import androidx.compose.ui.graphics.drawscope.DrawScope;
import androidx.compose.ui.input.pointer.PointerIcon;
import androidx.compose.ui.input.pointer.PointerIconKt;
import androidx.compose.ui.layout.LayoutCoordinates;
import androidx.compose.ui.text.TextLayoutResult;
import androidx.media3.muxer.MuxerUtil;
import h.g.a.a;
import h.g.b.o;
import h.g.b.x;

/* compiled from: WazeSource */
/* loaded from: classes.dex */
public final class SelectionController implements RememberObserver {
    public static final int $stable = 8;
    private final long backgroundSelectionColor;
    private final Modifier modifier;
    private StaticTextSelectionParams params;
    private Selectable selectable;
    private final long selectableId;
    private final SelectionRegistrar selectionRegistrar;

    private SelectionController(long j2, SelectionRegistrar selectionRegistrar, long j3, StaticTextSelectionParams staticTextSelectionParams) {
        this.selectableId = j2;
        this.selectionRegistrar = selectionRegistrar;
        this.backgroundSelectionColor = j3;
        this.params = staticTextSelectionParams;
        this.modifier = PointerIconKt.pointerHoverIcon(SelectionController_androidKt.makeSelectionModifier(selectionRegistrar, j2, new a() { // from class: androidx.compose.foundation.text.modifiers.SelectionController$$ExternalSyntheticLambda2
            @Override // h.g.a.a
            public final Object invoke() {
                return this.f$0.params.getLayoutCoordinates();
            }
        }), PointerIcon.Companion.getText(), false & ((2 & 2) == 0));
    }

    public final void draw(DrawScope drawScope) {
        Selection selection = this.selectionRegistrar.getSubselections().get(this.selectableId);
        if (selection == null) {
            return;
        }
        int offset = !selection.getHandlesCrossed() ? selection.getStart().getOffset() : selection.getEnd().getOffset();
        int offset2 = !selection.getHandlesCrossed() ? selection.getEnd().getOffset() : selection.getStart().getOffset();
        if (offset != offset2) {
            Selectable selectable = this.selectable;
            int lastVisibleOffset = selectable != null ? selectable.getLastVisibleOffset() : 0;
            if (offset > lastVisibleOffset) {
                offset = lastVisibleOffset;
            }
            if (offset2 > lastVisibleOffset) {
                offset2 = lastVisibleOffset;
            }
            Path pathForRange = this.params.getPathForRange(offset, offset2);
            if (pathForRange != null) {
                if (!this.params.getShouldClip()) {
                    DrawScope.CC.m8832drawPathLG529CI$default(drawScope, pathForRange, this.backgroundSelectionColor, 0.0f, null, null, 0, 60, null);
                    return;
                }
                float fIntBitsToFloat = Float.intBitsToFloat((int) (drawScope.mo8751getSizeNHjbRc() >> 32));
                float fIntBitsToFloat2 = Float.intBitsToFloat((int) (drawScope.mo8751getSizeNHjbRc() & MuxerUtil.UNSIGNED_INT_MAX_VALUE));
                int iM8217getIntersectrtfAjoo = ClipOp.Companion.m8217getIntersectrtfAjoo();
                DrawContext drawContext = drawScope.getDrawContext();
                long jMo8758getSizeNHjbRc = drawContext.mo8758getSizeNHjbRc();
                drawContext.getCanvas().save();
                try {
                    drawContext.getTransform().mo8761clipRectN_I0leg(0.0f, 0.0f, fIntBitsToFloat, fIntBitsToFloat2, iM8217getIntersectrtfAjoo);
                    DrawScope.CC.m8832drawPathLG529CI$default(drawScope, pathForRange, this.backgroundSelectionColor, 0.0f, null, null, 0, 60, null);
                } finally {
                    drawContext.getCanvas().restore();
                    drawContext.mo8759setSizeuvyYCjk(jMo8758getSizeNHjbRc);
                }
            }
        }
    }

    public final Modifier getModifier() {
        return this.modifier;
    }

    @Override // androidx.compose.runtime.RememberObserver
    public void onAbandoned() {
        Selectable selectable = this.selectable;
        if (selectable != null) {
            this.selectionRegistrar.unsubscribe(selectable);
            this.selectable = null;
        }
    }

    @Override // androidx.compose.runtime.RememberObserver
    public void onForgotten() {
        Selectable selectable = this.selectable;
        if (selectable != null) {
            this.selectionRegistrar.unsubscribe(selectable);
            this.selectable = null;
        }
    }

    @Override // androidx.compose.runtime.RememberObserver
    public void onRemembered() {
        this.selectable = this.selectionRegistrar.subscribe(new MultiWidgetSelectionDelegate(this.selectableId, new a() { // from class: androidx.compose.foundation.text.modifiers.SelectionController$$ExternalSyntheticLambda0
            @Override // h.g.a.a
            public final Object invoke() {
                return this.f$0.params.getLayoutCoordinates();
            }
        }, new a() { // from class: androidx.compose.foundation.text.modifiers.SelectionController$$ExternalSyntheticLambda1
            @Override // h.g.a.a
            public final Object invoke() {
                return this.f$0.params.getTextLayoutResult();
            }
        }));
    }

    public final void updateGlobalPosition(LayoutCoordinates layoutCoordinates) {
        this.params = StaticTextSelectionParams.copy$default(this.params, layoutCoordinates, null, 2, null);
        this.selectionRegistrar.notifyPositionChange(this.selectableId);
    }

    public final void updateTextLayout(TextLayoutResult textLayoutResult) {
        TextLayoutResult textLayoutResult2 = this.params.getTextLayoutResult();
        if (textLayoutResult2 != null && !x.n(textLayoutResult2.getLayoutInput().getText(), textLayoutResult.getLayoutInput().getText())) {
            this.selectionRegistrar.notifySelectableChange(this.selectableId);
        }
        this.params = StaticTextSelectionParams.copy$default(this.params, null, textLayoutResult, 1, null);
    }

    public /* synthetic */ SelectionController(long j2, SelectionRegistrar selectionRegistrar, long j3, StaticTextSelectionParams staticTextSelectionParams, o oVar) {
        this(j2, selectionRegistrar, j3, staticTextSelectionParams);
    }

    public /* synthetic */ SelectionController(long j2, SelectionRegistrar selectionRegistrar, long j3, StaticTextSelectionParams staticTextSelectionParams, int i2, o oVar) {
        this(j2, selectionRegistrar, j3, (i2 & 8) != 0 ? StaticTextSelectionParams.Companion.getEmpty() : staticTextSelectionParams, null);
    }
}
