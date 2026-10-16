package androidx.constraintlayout.compose;

import android.util.Log;
import androidx.collection.IntIntPair;
import androidx.compose.ui.layout.LayoutIdKt;
import androidx.compose.ui.layout.Measurable;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.unit.Constraints;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.IntSizeKt;
import androidx.compose.ui.unit.LayoutDirection;
import androidx.constraintlayout.core.state.WidgetFrame;
import androidx.constraintlayout.core.widgets.ConstraintWidget;
import androidx.constraintlayout.core.widgets.ConstraintWidgetContainer;
import androidx.constraintlayout.core.widgets.Guideline;
import androidx.constraintlayout.core.widgets.VirtualLayout;
import androidx.constraintlayout.core.widgets.analyzer.BasicMeasure;
import h.g.b.x;
import h.i;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* compiled from: WazeSource */
/* loaded from: classes3.dex */
public class Measurer2 implements BasicMeasure.Measurer, DesignInfoProvider {
    public static final int $stable = 8;
    private String computedLayoutResult = "";
    private float forcedScaleFactor;
    private final Map<String, WidgetFrame> frameCache;
    private final int[] heightConstraintsHolder;
    private final Map<String, Integer[]> lastMeasures;
    private LayoutInformationReceiver layoutInformationReceiver;
    private Map<Measurable, Placeable> placeables;
    private final ConstraintWidgetContainer root;
    private final State state;
    private final int[] widthConstraintsHolder;

    /* compiled from: WazeSource */
    public final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[ConstraintWidget.DimensionBehaviour.values().length];
            try {
                iArr[ConstraintWidget.DimensionBehaviour.FIXED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[ConstraintWidget.DimensionBehaviour.WRAP_CONTENT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[ConstraintWidget.DimensionBehaviour.MATCH_PARENT.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public Measurer2(Density density) {
        ConstraintWidgetContainer constraintWidgetContainer = new ConstraintWidgetContainer(0, 0);
        constraintWidgetContainer.setMeasurer(this);
        this.root = constraintWidgetContainer;
        this.placeables = new LinkedHashMap();
        this.lastMeasures = new LinkedHashMap();
        this.frameCache = new LinkedHashMap();
        this.state = new State(density);
        this.widthConstraintsHolder = new int[2];
        this.heightConstraintsHolder = new int[2];
        this.forcedScaleFactor = Float.NaN;
    }

    private final void copyFrom(Integer[] numArr, BasicMeasure.Measure measure) {
        numArr[0] = Integer.valueOf(measure.measuredWidth);
        numArr[1] = Integer.valueOf(measure.measuredHeight);
        numArr[2] = Integer.valueOf(measure.measuredBaseline);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: measureWidget-yQShABA, reason: not valid java name */
    private final long m11567measureWidgetyQShABA(ConstraintWidget constraintWidget, long j2) {
        boolean z = constraintWidget instanceof VirtualLayout;
        Object companionWidget = constraintWidget.getCompanionWidget();
        String str = constraintWidget.stringId;
        int i2 = 0;
        if (!z) {
            if (!(companionWidget instanceof Measurable)) {
                Log.w("CCL", "Nothing to measure for widget: ".concat(String.valueOf(str)));
                return IntIntPair.m1687constructorimpl(0, 0);
            }
            Placeable placeableMo9741measureBRTryo0 = ((Measurable) companionWidget).mo9741measureBRTryo0(j2);
            this.placeables.put(companionWidget, placeableMo9741measureBRTryo0);
            return IntIntPair.m1687constructorimpl(placeableMo9741measureBRTryo0.getWidth(), placeableMo9741measureBRTryo0.getHeight());
        }
        int i3 = Constraints.m11105getHasFixedWidthimpl(j2) ? 1073741824 : Constraints.m11103getHasBoundedWidthimpl(j2) ? Integer.MIN_VALUE : 0;
        if (Constraints.m11104getHasFixedHeightimpl(j2)) {
            i2 = 1073741824;
        } else if (Constraints.m11102getHasBoundedHeightimpl(j2)) {
            i2 = Integer.MIN_VALUE;
        }
        VirtualLayout virtualLayout = (VirtualLayout) constraintWidget;
        virtualLayout.measure(i3, Constraints.m11107getMaxWidthimpl(j2), i2, Constraints.m11106getMaxHeightimpl(j2));
        return IntIntPair.m1687constructorimpl(virtualLayout.getMeasuredWidth(), virtualLayout.getMeasuredHeight());
    }

    private final boolean obtainConstraints(ConstraintWidget.DimensionBehaviour dimensionBehaviour, int i2, int i3, int i4, boolean z, boolean z2, int i5, int[] iArr) {
        ConstraintWidget.DimensionBehaviour dimensionBehaviour2 = ConstraintWidget.DimensionBehaviour.FIXED;
        int iOrdinal = dimensionBehaviour.ordinal();
        if (iOrdinal == 0) {
            iArr[0] = i2;
            iArr[1] = i2;
            return false;
        }
        if (iOrdinal == 1) {
            iArr[0] = 0;
            iArr[1] = i5;
            return true;
        }
        if (iOrdinal != 2) {
            if (iOrdinal != 3) {
                throw new i();
            }
            iArr[0] = i5;
            iArr[1] = i5;
            return false;
        }
        boolean z3 = z2 || ((i4 == BasicMeasure.Measure.TRY_GIVEN_DIMENSIONS || i4 == BasicMeasure.Measure.USE_GIVEN_DIMENSIONS) && (i4 == BasicMeasure.Measure.USE_GIVEN_DIMENSIONS || i3 != 1 || z));
        iArr[0] = true != z3 ? 0 : i2;
        if (true != z3) {
            i2 = i5;
        }
        iArr[1] = i2;
        return !z3;
    }

    public final void addLayoutInformationReceiver(LayoutInformationReceiver layoutInformationReceiver) {
        this.layoutInformationReceiver = layoutInformationReceiver;
        if (layoutInformationReceiver != null) {
            layoutInformationReceiver.setLayoutInformation(this.computedLayoutResult);
        }
    }

    /* renamed from: applyRootSize-BRTryo0, reason: not valid java name */
    protected final void m11568applyRootSizeBRTryo0(long j2) {
        this.root.setWidth(Constraints.m11107getMaxWidthimpl(j2));
        this.root.setHeight(Constraints.m11106getMaxHeightimpl(j2));
        this.forcedScaleFactor = Float.NaN;
        LayoutInformationReceiver layoutInformationReceiver = this.layoutInformationReceiver;
        if (layoutInformationReceiver != null && layoutInformationReceiver.getForcedWidth() != Integer.MIN_VALUE) {
            LayoutInformationReceiver layoutInformationReceiver2 = this.layoutInformationReceiver;
            x.c(layoutInformationReceiver2);
            int forcedWidth = layoutInformationReceiver2.getForcedWidth();
            if (forcedWidth > this.root.getWidth()) {
                this.forcedScaleFactor = this.root.getWidth() / forcedWidth;
            } else {
                this.forcedScaleFactor = 1.0f;
            }
            this.root.setWidth(forcedWidth);
        }
        LayoutInformationReceiver layoutInformationReceiver3 = this.layoutInformationReceiver;
        if (layoutInformationReceiver3 == null || layoutInformationReceiver3.getForcedHeight() == Integer.MIN_VALUE) {
            return;
        }
        LayoutInformationReceiver layoutInformationReceiver4 = this.layoutInformationReceiver;
        x.c(layoutInformationReceiver4);
        int forcedHeight = layoutInformationReceiver4.getForcedHeight();
        if (Float.isNaN(this.forcedScaleFactor)) {
            this.forcedScaleFactor = 1.0f;
        }
        float height = forcedHeight > this.root.getHeight() ? this.root.getHeight() / forcedHeight : 1.0f;
        if (height < this.forcedScaleFactor) {
            this.forcedScaleFactor = height;
        }
        this.root.setHeight(forcedHeight);
    }

    public void computeLayoutResult() {
        ConstraintWidget constraintWidget;
        StringBuilder sb = new StringBuilder();
        sb.append("{   root: {interpolated: { left:  0,  top:  0,");
        sb.append("  right:   " + this.root.getWidth() + " ,");
        sb.append("  bottom:  " + this.root.getHeight() + " ,");
        sb.append(" } }");
        ArrayList<ConstraintWidget> children = this.root.getChildren();
        int size = children.size();
        for (int i2 = 0; i2 < size; i2++) {
            ConstraintWidget constraintWidget2 = children.get(i2);
            Object companionWidget = constraintWidget2.getCompanionWidget();
            if (companionWidget instanceof Measurable) {
                WidgetFrame widgetFrame = null;
                if (constraintWidget2.stringId == null) {
                    Measurable measurable = (Measurable) companionWidget;
                    Object layoutId = LayoutIdKt.getLayoutId(measurable);
                    if (layoutId == null) {
                        layoutId = ConstraintLayoutTagKt.getConstraintLayoutId(measurable);
                    }
                    constraintWidget2.stringId = layoutId != null ? layoutId.toString() : null;
                }
                WidgetFrame widgetFrame2 = this.frameCache.get(MeasurerKt.getAnyOrNullId((Measurable) companionWidget));
                if (widgetFrame2 != null && (constraintWidget = widgetFrame2.widget) != null) {
                    widgetFrame = constraintWidget.frame;
                }
                if (widgetFrame != null) {
                    sb.append(" " + constraintWidget2.stringId + ": {");
                    sb.append(" interpolated : ");
                    widgetFrame.serialize(sb, true);
                    sb.append("}, ");
                }
            } else if (constraintWidget2 instanceof Guideline) {
                StringBuilder sb2 = new StringBuilder(" ");
                Guideline guideline = (Guideline) constraintWidget2;
                sb2.append(guideline.stringId);
                sb2.append(": {");
                sb.append(sb2.toString());
                if (guideline.getOrientation() == 0) {
                    sb.append(" type: 'hGuideline', ");
                } else {
                    sb.append(" type: 'vGuideline', ");
                }
                sb.append(" interpolated: ");
                sb.append(" { left: " + guideline.getX() + ", top: " + guideline.getY() + ", right: " + (guideline.getX() + guideline.getWidth()) + ", bottom: " + (guideline.getY() + guideline.getHeight()) + " }");
                sb.append("}, ");
            }
        }
        sb.append(" }");
        String string = sb.toString();
        this.computedLayoutResult = string;
        LayoutInformationReceiver layoutInformationReceiver = this.layoutInformationReceiver;
        if (layoutInformationReceiver != null) {
            layoutInformationReceiver.setLayoutInformation(string);
        }
    }

    @Override // androidx.constraintlayout.core.widgets.analyzer.BasicMeasure.Measurer
    public void didMeasures() {
    }

    @Override // androidx.constraintlayout.compose.DesignInfoProvider
    public String getDesignInfo(int i2, int i3, String str) {
        return ToolingUtilsKt.parseConstraintsToJson(this.root, this.state, i2, i3, str);
    }

    public final float getForcedScaleFactor() {
        return this.forcedScaleFactor;
    }

    protected final Map<String, WidgetFrame> getFrameCache() {
        return this.frameCache;
    }

    public final int getLayoutCurrentHeight() {
        return this.root.getHeight();
    }

    public final int getLayoutCurrentWidth() {
        return this.root.getWidth();
    }

    protected final LayoutInformationReceiver getLayoutInformationReceiver() {
        return this.layoutInformationReceiver;
    }

    protected final Map<Measurable, Placeable> getPlaceables() {
        return this.placeables;
    }

    protected final ConstraintWidgetContainer getRoot() {
        return this.root;
    }

    protected final State getState() {
        return this.state;
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x009b  */
    @Override // androidx.constraintlayout.core.widgets.analyzer.BasicMeasure.Measurer
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void measure(androidx.constraintlayout.core.widgets.ConstraintWidget r17, androidx.constraintlayout.core.widgets.analyzer.BasicMeasure.Measure r18) {
        /*
            Method dump skipped, instructions count: 446
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.compose.Measurer2.measure(androidx.constraintlayout.core.widgets.ConstraintWidget, androidx.constraintlayout.core.widgets.analyzer.BasicMeasure$Measure):void");
    }

    public final void performLayout(Placeable.PlacementScope placementScope, List<? extends Measurable> list, Map<Measurable, Placeable> map) {
        Placeable placeable;
        Placeable.PlacementScope placementScope2;
        this.placeables = map;
        int i2 = 0;
        if (this.frameCache.isEmpty()) {
            ArrayList<ConstraintWidget> children = this.root.getChildren();
            int size = children.size();
            for (int i3 = 0; i3 < size; i3++) {
                ConstraintWidget constraintWidget = children.get(i3);
                Object companionWidget = constraintWidget.getCompanionWidget();
                if (companionWidget instanceof Measurable) {
                    this.frameCache.put(MeasurerKt.getAnyOrNullId((Measurable) companionWidget), new WidgetFrame(constraintWidget.frame.update()));
                }
            }
        }
        int size2 = list.size();
        while (i2 < size2) {
            Measurable measurable = list.get(i2);
            WidgetFrame widgetFrame = this.frameCache.get(MeasurerKt.getAnyOrNullId(measurable));
            if (widgetFrame == null || (placeable = this.placeables.get(measurable)) == null) {
                placementScope2 = placementScope;
            } else {
                placementScope2 = placementScope;
                ConstraintLayoutKt.m11509placeWithFrameTransformKtjjmr4$default(placementScope2, placeable, widgetFrame, 0L, 4, null);
            }
            i2++;
            placementScope = placementScope2;
        }
        LayoutInformationReceiver layoutInformationReceiver = this.layoutInformationReceiver;
        if ((layoutInformationReceiver != null ? layoutInformationReceiver.getLayoutInformationMode() : null) == LayoutInfoFlags.BOUNDS) {
            computeLayoutResult();
        }
    }

    /* renamed from: performMeasure-DjhGOtQ, reason: not valid java name */
    public final long m11569performMeasureDjhGOtQ(long j2, LayoutDirection layoutDirection, ConstraintSet constraintSet, List<? extends Measurable> list, Map<Measurable, Placeable> map, int i2) {
        androidx.constraintlayout.core.state.Dimension dimensionCreateFixed;
        androidx.constraintlayout.core.state.Dimension dimensionCreateFixed2;
        this.placeables = map;
        if (list.isEmpty()) {
            return IntSizeKt.IntSize(Constraints.m11109getMinWidthimpl(j2), Constraints.m11108getMinHeightimpl(j2));
        }
        State state = this.state;
        if (Constraints.m11105getHasFixedWidthimpl(j2)) {
            dimensionCreateFixed = androidx.constraintlayout.core.state.Dimension.createFixed(Constraints.m11107getMaxWidthimpl(j2));
        } else {
            int iM11109getMinWidthimpl = Constraints.m11109getMinWidthimpl(j2);
            androidx.constraintlayout.core.state.Dimension dimensionCreateWrap = androidx.constraintlayout.core.state.Dimension.createWrap();
            dimensionCreateWrap.min(iM11109getMinWidthimpl);
            dimensionCreateFixed = dimensionCreateWrap;
        }
        state.width(dimensionCreateFixed);
        State state2 = this.state;
        if (Constraints.m11104getHasFixedHeightimpl(j2)) {
            dimensionCreateFixed2 = androidx.constraintlayout.core.state.Dimension.createFixed(Constraints.m11106getMaxHeightimpl(j2));
        } else {
            int iM11108getMinHeightimpl = Constraints.m11108getMinHeightimpl(j2);
            androidx.constraintlayout.core.state.Dimension dimensionCreateWrap2 = androidx.constraintlayout.core.state.Dimension.createWrap();
            dimensionCreateWrap2.min(iM11108getMinHeightimpl);
            dimensionCreateFixed2 = dimensionCreateWrap2;
        }
        state2.height(dimensionCreateFixed2);
        this.state.mParent.getWidth().apply(this.state, this.root, 0);
        this.state.mParent.getHeight().apply(this.state, this.root, 1);
        this.state.m11633setRootIncomingConstraintsBRTryo0(j2);
        this.state.setRtl(layoutDirection == LayoutDirection.Rtl);
        resetMeasureState$constraintlayout_compose();
        boolean zIsDirty = constraintSet.isDirty(list);
        State state3 = this.state;
        if (zIsDirty) {
            state3.reset();
            constraintSet.applyTo(this.state, list);
            ConstraintLayoutKt.buildMapping(this.state, list);
            this.state.apply(this.root);
        } else {
            ConstraintLayoutKt.buildMapping(state3, list);
        }
        m11568applyRootSizeBRTryo0(j2);
        this.root.updateHierarchy();
        this.root.setOptimizationLevel(i2);
        ConstraintWidgetContainer constraintWidgetContainer = this.root;
        constraintWidgetContainer.measure(constraintWidgetContainer.getOptimizationLevel(), 0, 0, 0, 0, 0, 0, 0, 0);
        ConstraintWidgetContainer constraintWidgetContainer2 = this.root;
        return IntSizeKt.IntSize(constraintWidgetContainer2.getWidth(), constraintWidgetContainer2.getHeight());
    }

    public final void resetMeasureState$constraintlayout_compose() {
        this.placeables.clear();
        this.lastMeasures.clear();
        this.frameCache.clear();
    }

    public final void setForcedScaleFactor(float f2) {
        this.forcedScaleFactor = f2;
    }

    protected final void setLayoutInformationReceiver(LayoutInformationReceiver layoutInformationReceiver) {
        this.layoutInformationReceiver = layoutInformationReceiver;
    }

    protected final void setPlaceables(Map<Measurable, Placeable> map) {
        this.placeables = map;
    }
}
