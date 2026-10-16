package androidx.constraintlayout.core.widgets.analyzer;

import androidx.constraintlayout.core.widgets.ConstraintWidget;
import androidx.constraintlayout.core.widgets.analyzer.DependencyNode;
import androidx.constraintlayout.core.widgets.analyzer.WidgetRun;

/* compiled from: WazeSource */
/* loaded from: classes3.dex */
public class VerticalWidgetRun extends WidgetRun {
    private static final boolean FORCE_USE = true;
    public DependencyNode baseline;
    DimensionDependency mBaselineDimension;

    /* compiled from: WazeSource */
    /* renamed from: androidx.constraintlayout.core.widgets.analyzer.VerticalWidgetRun$1, reason: invalid class name */
    /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$androidx$constraintlayout$core$widgets$analyzer$WidgetRun$RunType;

        static {
            int[] iArr = new int[WidgetRun.RunType.values().length];
            $SwitchMap$androidx$constraintlayout$core$widgets$analyzer$WidgetRun$RunType = iArr;
            try {
                iArr[WidgetRun.RunType.START.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$androidx$constraintlayout$core$widgets$analyzer$WidgetRun$RunType[WidgetRun.RunType.END.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$androidx$constraintlayout$core$widgets$analyzer$WidgetRun$RunType[WidgetRun.RunType.CENTER.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    public VerticalWidgetRun(ConstraintWidget constraintWidget) {
        super(constraintWidget);
        this.baseline = new DependencyNode(this);
        this.mBaselineDimension = null;
        this.start.mType = DependencyNode.Type.TOP;
        this.end.mType = DependencyNode.Type.BOTTOM;
        this.baseline.mType = DependencyNode.Type.BASELINE;
        this.orientation = 1;
    }

    /* JADX WARN: Removed duplicated region for block: B:116:0x0333  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x0336  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x039b  */
    /* JADX WARN: Removed duplicated region for block: B:158:0x046f  */
    /* JADX WARN: Removed duplicated region for block: B:169:? A[RETURN, SYNTHETIC] */
    @Override // androidx.constraintlayout.core.widgets.analyzer.WidgetRun
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    void apply() {
        /*
            Method dump skipped, instructions count: 1140
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.core.widgets.analyzer.VerticalWidgetRun.apply():void");
    }

    @Override // androidx.constraintlayout.core.widgets.analyzer.WidgetRun
    public void applyToWidget() {
        DependencyNode dependencyNode = this.start;
        if (dependencyNode.resolved) {
            this.mWidget.setY(dependencyNode.value);
        }
    }

    @Override // androidx.constraintlayout.core.widgets.analyzer.WidgetRun
    void clear() {
        this.mRunGroup = null;
        this.start.clear();
        this.end.clear();
        this.baseline.clear();
        this.mDimension.clear();
        this.mResolved = false;
    }

    @Override // androidx.constraintlayout.core.widgets.analyzer.WidgetRun
    void reset() {
        this.mResolved = false;
        this.start.clear();
        this.start.resolved = false;
        this.end.clear();
        this.end.resolved = false;
        this.baseline.clear();
        this.baseline.resolved = false;
        this.mDimension.resolved = false;
    }

    @Override // androidx.constraintlayout.core.widgets.analyzer.WidgetRun
    boolean supportsWrapComputation() {
        return this.mDimensionBehavior != ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT || this.mWidget.mMatchConstraintDefaultHeight == 0;
    }

    public String toString() {
        return "VerticalRun ".concat(String.valueOf(this.mWidget.getDebugName()));
    }

    @Override // androidx.constraintlayout.core.widgets.analyzer.WidgetRun, androidx.constraintlayout.core.widgets.analyzer.Dependency
    public void update(Dependency dependency) {
        float f2;
        float dimensionRatio;
        float dimensionRatio2;
        int i2;
        WidgetRun.RunType runType = WidgetRun.RunType.NONE;
        int iOrdinal = this.mRunType.ordinal();
        if (iOrdinal == 1) {
            updateRunStart(dependency);
        } else if (iOrdinal == 2) {
            updateRunEnd(dependency);
        } else if (iOrdinal == 3) {
            ConstraintWidget constraintWidget = this.mWidget;
            updateRunCenter(dependency, constraintWidget.mTop, constraintWidget.mBottom, 1);
            return;
        }
        DimensionDependency dimensionDependency = this.mDimension;
        if (dimensionDependency.readyToSolve && !dimensionDependency.resolved && this.mDimensionBehavior == ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT) {
            ConstraintWidget constraintWidget2 = this.mWidget;
            int i3 = constraintWidget2.mMatchConstraintDefaultHeight;
            if (i3 == 2) {
                ConstraintWidget parent = constraintWidget2.getParent();
                if (parent != null) {
                    if (parent.mVerticalRun.mDimension.resolved) {
                        this.mDimension.resolve((int) ((r7.value * this.mWidget.mMatchConstraintPercentHeight) + 0.5f));
                    }
                }
            } else if (i3 == 3 && constraintWidget2.mHorizontalRun.mDimension.resolved) {
                int dimensionRatioSide = constraintWidget2.getDimensionRatioSide();
                if (dimensionRatioSide == -1) {
                    ConstraintWidget constraintWidget3 = this.mWidget;
                    f2 = constraintWidget3.mHorizontalRun.mDimension.value;
                    dimensionRatio = constraintWidget3.getDimensionRatio();
                } else if (dimensionRatioSide == 0) {
                    dimensionRatio2 = r7.mHorizontalRun.mDimension.value * this.mWidget.getDimensionRatio();
                    i2 = (int) (dimensionRatio2 + 0.5f);
                    this.mDimension.resolve(i2);
                } else if (dimensionRatioSide != 1) {
                    i2 = 0;
                    this.mDimension.resolve(i2);
                } else {
                    ConstraintWidget constraintWidget4 = this.mWidget;
                    f2 = constraintWidget4.mHorizontalRun.mDimension.value;
                    dimensionRatio = constraintWidget4.getDimensionRatio();
                }
                dimensionRatio2 = f2 / dimensionRatio;
                i2 = (int) (dimensionRatio2 + 0.5f);
                this.mDimension.resolve(i2);
            }
        }
        DependencyNode dependencyNode = this.start;
        if (dependencyNode.readyToSolve) {
            DependencyNode dependencyNode2 = this.end;
            if (dependencyNode2.readyToSolve) {
                if (dependencyNode.resolved && dependencyNode2.resolved && this.mDimension.resolved) {
                    return;
                }
                if (!this.mDimension.resolved && this.mDimensionBehavior == ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT) {
                    ConstraintWidget constraintWidget5 = this.mWidget;
                    if (constraintWidget5.mMatchConstraintDefaultWidth == 0 && !constraintWidget5.isInVerticalChain()) {
                        DependencyNode dependencyNode3 = this.start.mTargets.get(0);
                        DependencyNode dependencyNode4 = this.end.mTargets.get(0);
                        int i4 = dependencyNode3.value;
                        DependencyNode dependencyNode5 = this.start;
                        int i5 = i4 + dependencyNode5.mMargin;
                        int i6 = dependencyNode4.value + this.end.mMargin;
                        dependencyNode5.resolve(i5);
                        this.end.resolve(i6);
                        this.mDimension.resolve(i6 - i5);
                        return;
                    }
                }
                if (!this.mDimension.resolved && this.mDimensionBehavior == ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT && this.matchConstraintsType == 1 && this.start.mTargets.size() > 0 && this.end.mTargets.size() > 0) {
                    DependencyNode dependencyNode6 = this.start.mTargets.get(0);
                    DependencyNode dependencyNode7 = this.end.mTargets.get(0);
                    int i7 = dependencyNode6.value + this.start.mMargin;
                    int i8 = dependencyNode7.value + this.end.mMargin;
                    DimensionDependency dimensionDependency2 = this.mDimension;
                    int i9 = dimensionDependency2.wrapValue;
                    int i10 = i8 - i7;
                    if (i10 < i9) {
                        dimensionDependency2.resolve(i10);
                    } else {
                        dimensionDependency2.resolve(i9);
                    }
                }
                if (!this.mDimension.resolved || this.start.mTargets.size() <= 0 || this.end.mTargets.size() <= 0) {
                    return;
                }
                DependencyNode dependencyNode8 = this.start.mTargets.get(0);
                DependencyNode dependencyNode9 = this.end.mTargets.get(0);
                int i11 = dependencyNode8.value + this.start.mMargin;
                int i12 = dependencyNode9.value + this.end.mMargin;
                float verticalBiasPercent = this.mWidget.getVerticalBiasPercent();
                if (dependencyNode8 == dependencyNode9) {
                    i11 = dependencyNode8.value;
                    i12 = dependencyNode9.value;
                    verticalBiasPercent = 0.5f;
                }
                this.start.resolve((int) (i11 + 0.5f + (((i12 - i11) - this.mDimension.value) * verticalBiasPercent)));
                this.end.resolve(this.start.value + this.mDimension.value);
            }
        }
    }
}
