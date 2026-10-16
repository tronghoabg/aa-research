package androidx.compose.ui.graphics.vector;

import androidx.compose.runtime.Composition;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.ui.geometry.Size;
import androidx.compose.ui.graphics.ColorFilter;
import androidx.compose.ui.graphics.drawscope.DrawContext;
import androidx.compose.ui.graphics.drawscope.DrawScope;
import androidx.compose.ui.graphics.painter.Painter;
import androidx.compose.ui.unit.LayoutDirection;
import h.ab;
import h.g.b.o;

/* compiled from: WazeSource */
/* loaded from: classes.dex */
public final class VectorPainter extends Painter {
    public static final int $stable = 8;
    private final MutableState autoMirror$delegate;
    private Composition composition;
    private float currentAlpha;
    private ColorFilter currentColorFilter;
    private final MutableState drawInvalidation$delegate;
    private final MutableState size$delegate;
    private final VectorComponent vector;

    public VectorPainter(GroupComponent groupComponent) {
        this.size$delegate = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Size.m8037boximpl(Size.Companion.m8058getZeroNHjbRc()), null, 2, null);
        this.autoMirror$delegate = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(false, null, 2, null);
        VectorComponent vectorComponent = new VectorComponent(groupComponent);
        vectorComponent.setInvalidateCallback$ui(new VectorPainter$vector$1$1(this));
        this.vector = vectorComponent;
        this.drawInvalidation$delegate = SnapshotStateKt.mutableStateOf(ab.f48028a, SnapshotStateKt.neverEqualPolicy());
        this.currentAlpha = 1.0f;
    }

    private final ab getDrawInvalidation() {
        this.drawInvalidation$delegate.getValue();
        return ab.f48028a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void setDrawInvalidation(ab abVar) {
        this.drawInvalidation$delegate.setValue(abVar);
    }

    @Override // androidx.compose.ui.graphics.painter.Painter
    protected boolean applyAlpha(float f2) {
        this.currentAlpha = f2;
        return true;
    }

    @Override // androidx.compose.ui.graphics.painter.Painter
    protected boolean applyColorFilter(ColorFilter colorFilter) {
        this.currentColorFilter = colorFilter;
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final boolean getAutoMirror$ui() {
        return ((Boolean) this.autoMirror$delegate.getValue()).booleanValue();
    }

    /* renamed from: getBitmapConfig-_sVssgQ$ui, reason: not valid java name */
    public final int m9015getBitmapConfig_sVssgQ$ui() {
        return this.vector.m9006getCacheBitmapConfig_sVssgQ$ui();
    }

    public final Composition getComposition$ui() {
        return this.composition;
    }

    public final ColorFilter getIntrinsicColorFilter$ui() {
        return this.vector.getIntrinsicColorFilter$ui();
    }

    @Override // androidx.compose.ui.graphics.painter.Painter
    /* renamed from: getIntrinsicSize-NH-jbRc */
    public long mo8959getIntrinsicSizeNHjbRc() {
        return m9016getSizeNHjbRc$ui();
    }

    public final String getName$ui() {
        return this.vector.getName();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: getSize-NH-jbRc$ui, reason: not valid java name */
    public final long m9016getSizeNHjbRc$ui() {
        return ((Size) this.size$delegate.getValue()).m8054unboximpl();
    }

    public final VectorComponent getVector$ui() {
        return this.vector;
    }

    /* renamed from: getViewportSize-NH-jbRc$ui, reason: not valid java name */
    public final long m9017getViewportSizeNHjbRc$ui() {
        return this.vector.m9007getViewportSizeNHjbRc$ui();
    }

    @Override // androidx.compose.ui.graphics.painter.Painter
    protected void onDraw(DrawScope drawScope) {
        VectorComponent vectorComponent = this.vector;
        ColorFilter intrinsicColorFilter$ui = this.currentColorFilter;
        if (intrinsicColorFilter$ui == null) {
            intrinsicColorFilter$ui = vectorComponent.getIntrinsicColorFilter$ui();
        }
        if (getAutoMirror$ui() && drawScope.getLayoutDirection() == LayoutDirection.Rtl) {
            long jMo8750getCenterF1C5BW0 = drawScope.mo8750getCenterF1C5BW0();
            DrawContext drawContext = drawScope.getDrawContext();
            long jMo8758getSizeNHjbRc = drawContext.mo8758getSizeNHjbRc();
            drawContext.getCanvas().save();
            try {
                drawContext.getTransform().mo8765scale0AR0LA0(-1.0f, 1.0f, jMo8750getCenterF1C5BW0);
                vectorComponent.draw(drawScope, this.currentAlpha, intrinsicColorFilter$ui);
            } finally {
                drawContext.getCanvas().restore();
                drawContext.mo8759setSizeuvyYCjk(jMo8758getSizeNHjbRc);
            }
        } else {
            vectorComponent.draw(drawScope, this.currentAlpha, intrinsicColorFilter$ui);
        }
        getDrawInvalidation();
    }

    public final void setAutoMirror$ui(boolean z) {
        this.autoMirror$delegate.setValue(Boolean.valueOf(z));
    }

    public final void setComposition$ui(Composition composition) {
        this.composition = composition;
    }

    public final void setIntrinsicColorFilter$ui(ColorFilter colorFilter) {
        this.vector.setIntrinsicColorFilter$ui(colorFilter);
    }

    public final void setName$ui(String str) {
        this.vector.setName(str);
    }

    /* renamed from: setSize-uvyYCjk$ui, reason: not valid java name */
    public final void m9018setSizeuvyYCjk$ui(long j2) {
        this.size$delegate.setValue(Size.m8037boximpl(j2));
    }

    /* renamed from: setViewportSize-uvyYCjk$ui, reason: not valid java name */
    public final void m9019setViewportSizeuvyYCjk$ui(long j2) {
        this.vector.m9008setViewportSizeuvyYCjk$ui(j2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public VectorPainter() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    public /* synthetic */ VectorPainter(GroupComponent groupComponent, int i2, o oVar) {
        this((i2 & 1) != 0 ? new GroupComponent() : groupComponent);
    }
}
