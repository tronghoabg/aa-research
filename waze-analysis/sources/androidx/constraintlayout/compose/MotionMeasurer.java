package androidx.constraintlayout.compose;

import android.graphics.Matrix;
import androidx.compose.ui.geometry.OffsetKt;
import androidx.compose.ui.geometry.Size;
import androidx.compose.ui.geometry.SizeKt;
import androidx.compose.ui.graphics.AndroidCanvas_androidKt;
import androidx.compose.ui.graphics.AndroidPath_androidKt;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.ColorKt;
import androidx.compose.ui.graphics.Path;
import androidx.compose.ui.graphics.PathEffect;
import androidx.compose.ui.graphics.drawscope.DrawScope;
import androidx.compose.ui.graphics.drawscope.Stroke;
import androidx.compose.ui.layout.LayoutIdKt;
import androidx.compose.ui.layout.Measurable;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.unit.Constraints;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.IntSizeKt;
import androidx.compose.ui.unit.LayoutDirection;
import androidx.constraintlayout.core.state.CorePixelDp;
import androidx.constraintlayout.core.state.WidgetFrame;
import androidx.constraintlayout.core.widgets.ConstraintWidget;
import com.waze.strings.DisplayStrings;
import h.a.i;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* compiled from: WazeSource */
/* loaded from: classes3.dex */
public final class MotionMeasurer extends Measurer2 {
    public static final int $stable = 8;
    private final boolean DEBUG;
    private float lastProgressInInterpolation;
    private Constraints oldConstraints;
    private final androidx.constraintlayout.core.state.Transition transition;

    public MotionMeasurer(final Density density) {
        super(density);
        this.transition = new androidx.constraintlayout.core.state.Transition(new CorePixelDp() { // from class: androidx.constraintlayout.compose.MotionMeasurer$$ExternalSyntheticLambda0
            @Override // androidx.constraintlayout.core.state.CorePixelDp
            public final float toPixels(float f2) {
                return density.mo2127toPx0680j_4(f2);
            }
        });
    }

    /* renamed from: drawFrame-g2O1Hgs, reason: not valid java name */
    private final void m11600drawFrameg2O1Hgs(DrawScope drawScope, WidgetFrame widgetFrame, PathEffect pathEffect, long j2) {
        if (widgetFrame.isDefaultTransform()) {
            DrawScope.CC.m8836drawRectnJ9OG0$default(drawScope, j2, OffsetKt.Offset(widgetFrame.left, widgetFrame.top), SizeKt.Size(widgetFrame.width(), widgetFrame.height()), 0.0f, new Stroke(3.0f, 0.0f, 0, 0, pathEffect, 14, null), null, 0, 104, null);
            return;
        }
        Matrix matrix = new Matrix();
        if (!Float.isNaN(widgetFrame.rotationZ)) {
            matrix.preRotate(widgetFrame.rotationZ, widgetFrame.centerX(), widgetFrame.centerY());
        }
        matrix.preScale(Float.isNaN(widgetFrame.scaleX) ? 1.0f : widgetFrame.scaleX, Float.isNaN(widgetFrame.scaleY) ? 1.0f : widgetFrame.scaleY, widgetFrame.centerX(), widgetFrame.centerY());
        float f2 = widgetFrame.left;
        float f3 = widgetFrame.top;
        float f4 = widgetFrame.right;
        float f5 = widgetFrame.bottom;
        float[] fArr = {f2, f3, f4, f3, f4, f5, f2, f5};
        matrix.mapPoints(fArr);
        DrawScope.CC.m8828drawLineNGM6Ib0$default(drawScope, j2, OffsetKt.Offset(fArr[0], fArr[1]), OffsetKt.Offset(fArr[2], fArr[3]), 3.0f, 0, pathEffect, 0.0f, null, 0, DisplayStrings.DS_REPORT_MENU_MAP_ISSUE_MISSING_BRIDGE_OVERPASS, null);
        DrawScope.CC.m8828drawLineNGM6Ib0$default(drawScope, j2, OffsetKt.Offset(fArr[2], fArr[3]), OffsetKt.Offset(fArr[4], fArr[5]), 3.0f, 0, pathEffect, 0.0f, null, 0, DisplayStrings.DS_REPORT_MENU_MAP_ISSUE_MISSING_BRIDGE_OVERPASS, null);
        DrawScope.CC.m8828drawLineNGM6Ib0$default(drawScope, j2, OffsetKt.Offset(fArr[4], fArr[5]), OffsetKt.Offset(fArr[6], fArr[7]), 3.0f, 0, pathEffect, 0.0f, null, 0, DisplayStrings.DS_REPORT_MENU_MAP_ISSUE_MISSING_BRIDGE_OVERPASS, null);
        DrawScope.CC.m8828drawLineNGM6Ib0$default(drawScope, j2, OffsetKt.Offset(fArr[6], fArr[7]), OffsetKt.Offset(fArr[0], fArr[1]), 3.0f, 0, pathEffect, 0.0f, null, 0, DisplayStrings.DS_REPORT_MENU_MAP_ISSUE_MISSING_BRIDGE_OVERPASS, null);
    }

    /* renamed from: drawFrameDebug-PE3pjmc, reason: not valid java name */
    private final void m11601drawFrameDebugPE3pjmc(DrawScope drawScope, float f2, float f3, WidgetFrame widgetFrame, WidgetFrame widgetFrame2, PathEffect pathEffect, long j2) {
        m11600drawFrameg2O1Hgs(drawScope, widgetFrame, pathEffect, j2);
        m11600drawFrameg2O1Hgs(drawScope, widgetFrame2, pathEffect, j2);
        int numberKeyPositions = this.transition.getNumberKeyPositions(widgetFrame);
        new MotionRenderDebug(23.0f).draw(AndroidCanvas_androidKt.getNativeCanvas(drawScope.getDrawContext().getCanvas()), this.transition.getMotion(widgetFrame.widget.stringId), 1000, 1, (int) f2, (int) f3);
        if (numberKeyPositions == 0) {
            return;
        }
        float[] fArr = new float[numberKeyPositions];
        float[] fArr2 = new float[numberKeyPositions];
        float[] fArr3 = new float[numberKeyPositions];
        this.transition.fillKeyPositions(widgetFrame, fArr, fArr2, fArr3);
        int i2 = numberKeyPositions - 1;
        if (i2 < 0) {
            return;
        }
        int i3 = 0;
        while (true) {
            float f4 = fArr3[i3] / 100.0f;
            float f5 = 1.0f - f4;
            float fWidth = widgetFrame.width();
            float fWidth2 = widgetFrame2.width();
            float fHeight = widgetFrame.height();
            float fHeight2 = widgetFrame2.height();
            float f6 = fArr[i3] * f2;
            float f7 = fArr2[i3] * f3;
            float f8 = (fWidth * f5) + (fWidth2 * f4);
            Path Path = AndroidPath_androidKt.Path();
            float f9 = f6 + (f8 / 2.0f);
            float f10 = f7 + (((f5 * fHeight) + (f4 * fHeight2)) / 2.0f);
            Path.moveTo(f9 - 20.0f, f10);
            Path.lineTo(f9, f10 + 20.0f);
            Path.lineTo(20.0f + f9, f10);
            Path.lineTo(f9, f10 - 20.0f);
            Path.close();
            DrawScope.CC.m8832drawPathLG529CI$default(drawScope, Path, j2, 1.0f, new Stroke(3.0f, 0.0f, 0, 0, null, 30, null), null, 0, 48, null);
            if (i3 == i2) {
                return;
            } else {
                i3++;
            }
        }
    }

    private final void drawPaths(DrawScope drawScope, float f2, float f3, WidgetFrame widgetFrame, boolean z, boolean z2) {
        new MotionRenderDebug(23.0f).basicDraw(AndroidCanvas_androidKt.getNativeCanvas(drawScope.getDrawContext().getCanvas()), this.transition.getMotion(widgetFrame.widget.stringId), 1000, (int) f2, (int) f3, z, z2);
    }

    private final void encodeKeyFrames(StringBuilder sb, float[] fArr, int[] iArr, int[] iArr2, int i2) {
        if (i2 == 0) {
            return;
        }
        sb.append("keyTypes : [");
        for (int i3 = 0; i3 < i2; i3++) {
            sb.append(" " + iArr[i3] + ',');
        }
        sb.append("],\nkeyPos : [");
        for (int i4 = 0; i4 < i2 + i2; i4++) {
            sb.append(" " + fArr[i4] + ',');
        }
        sb.append("],\n keyFrames : [");
        for (int i5 = 0; i5 < i2; i5++) {
            sb.append(" " + iArr2[i5] + ',');
        }
        sb.append("],\n ");
    }

    /* renamed from: measureConstraintSet--hBUhpc, reason: not valid java name */
    private final void m11602measureConstraintSethBUhpc(int i2, ConstraintSet constraintSet, List<? extends Measurable> list, long j2) {
        String string;
        Object layoutId;
        getState().reset();
        constraintSet.applyTo(getState(), list);
        ConstraintLayoutKt.buildMapping(getState(), list);
        getState().apply(getRoot());
        ArrayList<ConstraintWidget> children = getRoot().getChildren();
        int size = children.size();
        for (int i3 = 0; i3 < size; i3++) {
            children.get(i3).setAnimated(true);
        }
        m11568applyRootSizeBRTryo0(j2);
        getRoot().updateHierarchy();
        if (this.DEBUG) {
            getRoot().setDebugName("ConstraintLayout");
            ArrayList<ConstraintWidget> children2 = getRoot().getChildren();
            int size2 = children2.size();
            for (int i4 = 0; i4 < size2; i4++) {
                ConstraintWidget constraintWidget = children2.get(i4);
                Object companionWidget = constraintWidget.getCompanionWidget();
                Measurable measurable = companionWidget instanceof Measurable ? (Measurable) companionWidget : null;
                if (measurable == null || (layoutId = LayoutIdKt.getLayoutId(measurable)) == null || (string = layoutId.toString()) == null) {
                    string = "NOTAG";
                }
                constraintWidget.setDebugName(string);
            }
        }
        getRoot().setOptimizationLevel(i2);
        getRoot().measure(0, 0, 0, 0, 0, 0, 0, 0, 0);
    }

    /* renamed from: needsRemeasure-NN6Ew-U, reason: not valid java name */
    private final boolean m11603needsRemeasureNN6EwU(long j2, CompositionSource compositionSource, ShouldInvalidateCallback shouldInvalidateCallback) {
        if (this.transition.isEmpty() || getFrameCache().isEmpty()) {
            return true;
        }
        Constraints constraints = this.oldConstraints;
        if (constraints == null || shouldInvalidateCallback == null) {
            if ((Constraints.m11104getHasFixedHeightimpl(j2) && !getState().sameFixedHeight(Constraints.m11106getMaxHeightimpl(j2))) || (Constraints.m11105getHasFixedWidthimpl(j2) && !getState().sameFixedWidth(Constraints.m11107getMaxWidthimpl(j2)))) {
                return true;
            }
        } else if (shouldInvalidateCallback.mo11546invokeN9IONVI(constraints.m11113unboximpl(), j2)) {
            return true;
        }
        return compositionSource == CompositionSource.Content;
    }

    /* renamed from: recalculateInterpolation-36Wf7g4, reason: not valid java name */
    private final void m11604recalculateInterpolation36Wf7g4(long j2, LayoutDirection layoutDirection, ConstraintSet constraintSet, ConstraintSet constraintSet2, TransitionImpl transitionImpl, List<? extends Measurable> list, int i2, float f2, boolean z) {
        WidgetFrame interpolated;
        androidx.constraintlayout.core.state.Dimension dimensionCreateFixed;
        androidx.constraintlayout.core.state.Dimension dimensionCreateFixed2;
        this.lastProgressInInterpolation = f2;
        int i3 = 0;
        if (z) {
            this.transition.clear();
            resetMeasureState$constraintlayout_compose();
            State state = getState();
            if (Constraints.m11105getHasFixedWidthimpl(j2)) {
                dimensionCreateFixed = androidx.constraintlayout.core.state.Dimension.createFixed(Constraints.m11107getMaxWidthimpl(j2));
            } else {
                int iM11109getMinWidthimpl = Constraints.m11109getMinWidthimpl(j2);
                androidx.constraintlayout.core.state.Dimension dimensionCreateWrap = androidx.constraintlayout.core.state.Dimension.createWrap();
                dimensionCreateWrap.min(iM11109getMinWidthimpl);
                dimensionCreateFixed = dimensionCreateWrap;
            }
            state.width(dimensionCreateFixed);
            State state2 = getState();
            if (Constraints.m11104getHasFixedHeightimpl(j2)) {
                dimensionCreateFixed2 = androidx.constraintlayout.core.state.Dimension.createFixed(Constraints.m11106getMaxHeightimpl(j2));
            } else {
                int iM11108getMinHeightimpl = Constraints.m11108getMinHeightimpl(j2);
                androidx.constraintlayout.core.state.Dimension dimensionCreateWrap2 = androidx.constraintlayout.core.state.Dimension.createWrap();
                dimensionCreateWrap2.min(iM11108getMinHeightimpl);
                dimensionCreateFixed2 = dimensionCreateWrap2;
            }
            state2.height(dimensionCreateFixed2);
            getState().m11633setRootIncomingConstraintsBRTryo0(j2);
            getState().setRtl(layoutDirection == LayoutDirection.Rtl);
            m11602measureConstraintSethBUhpc(i2, constraintSet, list, j2);
            this.transition.updateFrom(getRoot(), 0);
            m11602measureConstraintSethBUhpc(i2, constraintSet2, list, j2);
            this.transition.updateFrom(getRoot(), 1);
            if (transitionImpl != null) {
                transitionImpl.applyKeyFramesTo(this.transition);
            }
        } else {
            ConstraintLayoutKt.buildMapping(getState(), list);
        }
        this.transition.interpolate(getRoot().getWidth(), getRoot().getHeight(), f2);
        getRoot().setWidth(this.transition.getInterpolatedWidth());
        getRoot().setHeight(this.transition.getInterpolatedHeight());
        ArrayList<ConstraintWidget> children = getRoot().getChildren();
        int size = children.size();
        while (true) {
            if (i3 >= size) {
                break;
            }
            ConstraintWidget constraintWidget = children.get(i3);
            Object companionWidget = constraintWidget.getCompanionWidget();
            Measurable measurable = companionWidget instanceof Measurable ? (Measurable) companionWidget : null;
            if (measurable != null && (interpolated = this.transition.getInterpolated(constraintWidget)) != null) {
                getPlaceables().put(measurable, measurable.mo9741measureBRTryo0(Constraints.Companion.m11117fixedJhjzzOo(interpolated.width(), interpolated.height())));
                getFrameCache().put(MeasurerKt.getAnyOrNullId(measurable), interpolated);
            }
            i3++;
        }
        LayoutInformationReceiver layoutInformationReceiver = getLayoutInformationReceiver();
        if ((layoutInformationReceiver != null ? layoutInformationReceiver.getLayoutInformationMode() : null) == LayoutInfoFlags.BOUNDS) {
            computeLayoutResult();
        }
    }

    public final void clearConstraintSets() {
        this.transition.clear();
        getFrameCache().clear();
    }

    @Override // androidx.constraintlayout.compose.Measurer2
    public void computeLayoutResult() {
        MotionMeasurer motionMeasurer = this;
        StringBuilder sb = new StringBuilder();
        sb.append("{ ");
        motionMeasurer.encodeRoot(sb);
        int[] iArr = new int[50];
        int[] iArr2 = new int[50];
        float[] fArr = new float[100];
        ArrayList<ConstraintWidget> children = motionMeasurer.getRoot().getChildren();
        int size = children.size();
        int i2 = 0;
        while (i2 < size) {
            ConstraintWidget constraintWidget = children.get(i2);
            WidgetFrame start = motionMeasurer.transition.getStart(constraintWidget.stringId);
            WidgetFrame end = motionMeasurer.transition.getEnd(constraintWidget.stringId);
            WidgetFrame interpolated = motionMeasurer.transition.getInterpolated(constraintWidget.stringId);
            float[] path = motionMeasurer.transition.getPath(constraintWidget.stringId);
            int keyFrames = motionMeasurer.transition.getKeyFrames(constraintWidget.stringId, fArr, iArr, iArr2);
            sb.append(" " + constraintWidget.stringId + ": {");
            sb.append(" interpolated : ");
            interpolated.serialize(sb, true);
            sb.append(", start : ");
            start.serialize(sb);
            sb.append(", end : ");
            end.serialize(sb);
            motionMeasurer.encodeKeyFrames(sb, fArr, iArr, iArr2, keyFrames);
            sb.append(" path : [");
            for (float f2 : path) {
                sb.append(" " + f2 + " ,");
            }
            sb.append(" ] }, ");
            i2++;
            motionMeasurer = this;
        }
        sb.append(" }");
        LayoutInformationReceiver layoutInformationReceiver = getLayoutInformationReceiver();
        if (layoutInformationReceiver != null) {
            layoutInformationReceiver.setLayoutInformation(sb.toString());
        }
    }

    public final void drawDebug(DrawScope drawScope, boolean z, boolean z2, boolean z3) {
        WidgetFrame widgetFrame;
        PathEffect pathEffect;
        PathEffect pathEffectDashPathEffect = PathEffect.Companion.dashPathEffect(new float[]{10.0f, 10.0f}, 0.0f);
        ArrayList<ConstraintWidget> children = getRoot().getChildren();
        int size = children.size();
        int i2 = 0;
        while (i2 < size) {
            ConstraintWidget constraintWidget = children.get(i2);
            WidgetFrame start = this.transition.getStart(constraintWidget);
            WidgetFrame end = this.transition.getEnd(constraintWidget);
            if (z) {
                m11600drawFrameg2O1Hgs(drawScope, start, pathEffectDashPathEffect, Color.Companion.m8255getBlue0d7_KjU());
                m11600drawFrameg2O1Hgs(drawScope, end, pathEffectDashPathEffect, Color.Companion.m8255getBlue0d7_KjU());
                drawScope.getDrawContext().getTransform().translate(2.0f, 2.0f);
                try {
                    m11600drawFrameg2O1Hgs(drawScope, start, pathEffectDashPathEffect, Color.Companion.m8265getWhite0d7_KjU());
                    widgetFrame = start;
                    m11600drawFrameg2O1Hgs(drawScope, end, pathEffectDashPathEffect, Color.Companion.m8265getWhite0d7_KjU());
                    pathEffect = pathEffectDashPathEffect;
                } finally {
                    drawScope.getDrawContext().getTransform().translate(-2.0f, -2.0f);
                }
            } else {
                widgetFrame = start;
                pathEffect = pathEffectDashPathEffect;
            }
            drawPaths(drawScope, Size.m8049getWidthimpl(drawScope.mo8751getSizeNHjbRc()), Size.m8046getHeightimpl(drawScope.mo8751getSizeNHjbRc()), widgetFrame, z2, z3);
            i2++;
            pathEffectDashPathEffect = pathEffect;
        }
    }

    public final void encodeRoot(StringBuilder sb) {
        sb.append("  root: {interpolated: { left:  0,  top:  0,");
        sb.append("  right:   " + getRoot().getWidth() + " ,");
        sb.append("  bottom:  " + getRoot().getHeight() + " ,");
        sb.append(" } }");
    }

    /* renamed from: getCustomColor-XeAY9LY, reason: not valid java name */
    public final long m11605getCustomColorXeAY9LY(String str, String str2, float f2) {
        if (!this.transition.contains(str)) {
            return Color.Companion.m8264getUnspecified0d7_KjU();
        }
        this.transition.interpolate(getRoot().getWidth(), getRoot().getHeight(), f2);
        WidgetFrame interpolated = this.transition.getInterpolated(str);
        return !interpolated.containsCustom(str2) ? Color.Companion.m8264getUnspecified0d7_KjU() : ColorKt.Color(interpolated.getCustomColor(str2));
    }

    public final float getCustomFloat(String str, String str2, float f2) {
        if (!this.transition.contains(str)) {
            return Float.NaN;
        }
        this.transition.interpolate(getRoot().getWidth(), getRoot().getHeight(), f2);
        return this.transition.getInterpolated(str).getCustomFloat(str2);
    }

    public final androidx.constraintlayout.core.state.Transition getTransition() {
        return this.transition;
    }

    public final void initWith(ConstraintSet constraintSet, ConstraintSet constraintSet2, LayoutDirection layoutDirection, TransitionImpl transitionImpl, float f2) {
        clearConstraintSets();
        getState().setRtl(layoutDirection == LayoutDirection.Rtl);
        constraintSet.applyTo(getState(), i.h());
        constraintSet.applyTo(this.transition, 0);
        getState().apply(getRoot());
        this.transition.updateFrom(getRoot(), 0);
        constraintSet.applyTo(getState(), i.h());
        constraintSet2.applyTo(this.transition, 1);
        getState().apply(getRoot());
        this.transition.updateFrom(getRoot(), 1);
        this.transition.interpolate(0, 0, f2);
        transitionImpl.applyAllTo(this.transition);
    }

    /* renamed from: performInterpolationMeasure-LzAeyeM, reason: not valid java name */
    public final long m11606performInterpolationMeasureLzAeyeM(long j2, LayoutDirection layoutDirection, ConstraintSet constraintSet, ConstraintSet constraintSet2, TransitionImpl transitionImpl, List<? extends Measurable> list, Map<Measurable, Placeable> map, int i2, float f2, CompositionSource compositionSource, ShouldInvalidateCallback shouldInvalidateCallback) {
        LayoutInformationReceiver layoutInformationReceiver;
        LayoutInformationReceiver layoutInformationReceiver2;
        setPlaceables(map);
        boolean zM11603needsRemeasureNN6EwU = m11603needsRemeasureNN6EwU(j2, compositionSource, shouldInvalidateCallback);
        if (this.lastProgressInInterpolation != f2 || (((layoutInformationReceiver = getLayoutInformationReceiver()) == null || layoutInformationReceiver.getForcedWidth() != Integer.MIN_VALUE) && ((layoutInformationReceiver2 = getLayoutInformationReceiver()) == null || layoutInformationReceiver2.getForcedHeight() != Integer.MIN_VALUE))) {
            m11604recalculateInterpolation36Wf7g4(j2, layoutDirection, constraintSet, constraintSet2, transitionImpl, list, i2, f2, zM11603needsRemeasureNN6EwU);
        } else if (zM11603needsRemeasureNN6EwU) {
            zM11603needsRemeasureNN6EwU = true;
            m11604recalculateInterpolation36Wf7g4(j2, layoutDirection, constraintSet, constraintSet2, transitionImpl, list, i2, f2, zM11603needsRemeasureNN6EwU);
        }
        this.oldConstraints = Constraints.m11094boximpl(j2);
        return IntSizeKt.IntSize(getRoot().getWidth(), getRoot().getHeight());
    }
}
