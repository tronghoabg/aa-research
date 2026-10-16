package androidx.constraintlayout.core.widgets.analyzer;

import androidx.constraintlayout.core.widgets.ConstraintWidgetContainer;
import java.util.ArrayList;

/* compiled from: WazeSource */
/* loaded from: classes3.dex */
class RunGroup {
    public static final int BASELINE = 2;
    public static final int END = 1;
    public static final int START = 0;
    public static int index;
    int mDirection;
    WidgetRun mFirstRun;
    int mGroupIndex;
    WidgetRun mLastRun;
    public int position = 0;
    public boolean dual = false;
    ArrayList<WidgetRun> mRuns = new ArrayList<>();

    RunGroup(WidgetRun widgetRun, int i2) {
        this.mFirstRun = null;
        this.mLastRun = null;
        int i3 = index;
        this.mGroupIndex = i3;
        index = i3 + 1;
        this.mFirstRun = widgetRun;
        this.mLastRun = widgetRun;
        this.mDirection = i2;
    }

    private boolean defineTerminalWidget(WidgetRun widgetRun, int i2) {
        DependencyNode dependencyNode;
        WidgetRun widgetRun2;
        DependencyNode dependencyNode2;
        WidgetRun widgetRun3;
        if (widgetRun.mWidget.isTerminalWidget[i2]) {
            for (Dependency dependency : widgetRun.start.mDependencies) {
                if ((dependency instanceof DependencyNode) && (widgetRun3 = (dependencyNode2 = (DependencyNode) dependency).mRun) != widgetRun && dependencyNode2 == widgetRun3.start) {
                    if (widgetRun instanceof ChainRun) {
                        ArrayList<WidgetRun> arrayList = ((ChainRun) widgetRun).mWidgets;
                        int size = arrayList.size();
                        for (int i3 = 0; i3 < size; i3++) {
                            defineTerminalWidget(arrayList.get(i3), i2);
                        }
                    } else if (!(widgetRun instanceof HelperReferences)) {
                        widgetRun.mWidget.isTerminalWidget[i2] = false;
                    }
                    defineTerminalWidget(dependencyNode2.mRun, i2);
                }
            }
            for (Dependency dependency2 : widgetRun.end.mDependencies) {
                if ((dependency2 instanceof DependencyNode) && (widgetRun2 = (dependencyNode = (DependencyNode) dependency2).mRun) != widgetRun && dependencyNode == widgetRun2.start) {
                    if (widgetRun instanceof ChainRun) {
                        ArrayList<WidgetRun> arrayList2 = ((ChainRun) widgetRun).mWidgets;
                        int size2 = arrayList2.size();
                        for (int i4 = 0; i4 < size2; i4++) {
                            defineTerminalWidget(arrayList2.get(i4), i2);
                        }
                    } else if (!(widgetRun instanceof HelperReferences)) {
                        widgetRun.mWidget.isTerminalWidget[i2] = false;
                    }
                    defineTerminalWidget(dependencyNode.mRun, i2);
                }
            }
        }
        return false;
    }

    private long traverseEnd(DependencyNode dependencyNode, long j2) {
        WidgetRun widgetRun = dependencyNode.mRun;
        if (widgetRun instanceof HelperReferences) {
            return j2;
        }
        int size = dependencyNode.mDependencies.size();
        long jMin = j2;
        for (int i2 = 0; i2 < size; i2++) {
            Dependency dependency = dependencyNode.mDependencies.get(i2);
            if (dependency instanceof DependencyNode) {
                DependencyNode dependencyNode2 = (DependencyNode) dependency;
                if (dependencyNode2.mRun != widgetRun) {
                    jMin = Math.min(jMin, traverseEnd(dependencyNode2, dependencyNode2.mMargin + j2));
                }
            }
        }
        if (dependencyNode != widgetRun.end) {
            return jMin;
        }
        long wrapDimension = j2 - widgetRun.getWrapDimension();
        return Math.min(Math.min(jMin, traverseEnd(widgetRun.start, wrapDimension)), wrapDimension - widgetRun.start.mMargin);
    }

    private long traverseStart(DependencyNode dependencyNode, long j2) {
        WidgetRun widgetRun = dependencyNode.mRun;
        if (widgetRun instanceof HelperReferences) {
            return j2;
        }
        int size = dependencyNode.mDependencies.size();
        long jMax = j2;
        for (int i2 = 0; i2 < size; i2++) {
            Dependency dependency = dependencyNode.mDependencies.get(i2);
            if (dependency instanceof DependencyNode) {
                DependencyNode dependencyNode2 = (DependencyNode) dependency;
                if (dependencyNode2.mRun != widgetRun) {
                    jMax = Math.max(jMax, traverseStart(dependencyNode2, dependencyNode2.mMargin + j2));
                }
            }
        }
        if (dependencyNode != widgetRun.start) {
            return jMax;
        }
        long wrapDimension = j2 + widgetRun.getWrapDimension();
        return Math.max(Math.max(jMax, traverseStart(widgetRun.end, wrapDimension)), wrapDimension - widgetRun.end.mMargin);
    }

    public void add(WidgetRun widgetRun) {
        this.mRuns.add(widgetRun);
        this.mLastRun = widgetRun;
    }

    public long computeWrapSize(ConstraintWidgetContainer constraintWidgetContainer, int i2) {
        WidgetRun widgetRun = this.mFirstRun;
        if (widgetRun instanceof ChainRun) {
            if (((ChainRun) widgetRun).orientation != i2) {
                return 0L;
            }
        } else if (i2 == 0) {
            if (!(widgetRun instanceof HorizontalWidgetRun)) {
                return 0L;
            }
        } else if (!(widgetRun instanceof VerticalWidgetRun)) {
            return 0L;
        }
        DependencyNode dependencyNode = i2 == 0 ? constraintWidgetContainer.mHorizontalRun.start : constraintWidgetContainer.mVerticalRun.start;
        DependencyNode dependencyNode2 = i2 == 0 ? constraintWidgetContainer.mHorizontalRun.end : constraintWidgetContainer.mVerticalRun.end;
        boolean zContains = widgetRun.start.mTargets.contains(dependencyNode);
        boolean zContains2 = this.mFirstRun.end.mTargets.contains(dependencyNode2);
        long wrapDimension = this.mFirstRun.getWrapDimension();
        if (!zContains || !zContains2) {
            if (zContains) {
                return Math.max(traverseStart(this.mFirstRun.start, r12.mMargin), this.mFirstRun.start.mMargin + wrapDimension);
            }
            WidgetRun widgetRun2 = this.mFirstRun;
            if (!zContains2) {
                return (widgetRun2.start.mMargin + widgetRun2.getWrapDimension()) - this.mFirstRun.end.mMargin;
            }
            return Math.max(-traverseEnd(widgetRun2.end, r12.mMargin), (-this.mFirstRun.end.mMargin) + wrapDimension);
        }
        long jTraverseStart = traverseStart(this.mFirstRun.start, 0L);
        long jTraverseEnd = traverseEnd(this.mFirstRun.end, 0L);
        long j2 = jTraverseStart - wrapDimension;
        WidgetRun widgetRun3 = this.mFirstRun;
        int i3 = widgetRun3.end.mMargin;
        if (j2 >= (-i3)) {
            j2 += i3;
        }
        long j3 = widgetRun3.start.mMargin;
        long j4 = ((-jTraverseEnd) - wrapDimension) - j3;
        if (j4 >= j3) {
            j4 -= j3;
        }
        float biasPercent = widgetRun3.mWidget.getBiasPercent(i2);
        float f2 = 1.0f - biasPercent;
        float f3 = biasPercent > 0.0f ? (long) ((j4 / biasPercent) + (j2 / f2)) : 0L;
        WidgetRun widgetRun4 = this.mFirstRun;
        return (widgetRun4.start.mMargin + ((((long) ((biasPercent * f3) + 0.5f)) + wrapDimension) + ((long) ((f3 * f2) + 0.5f)))) - widgetRun4.end.mMargin;
    }

    public void defineTerminalWidgets(boolean z, boolean z2) {
        if (z) {
            WidgetRun widgetRun = this.mFirstRun;
            if (widgetRun instanceof HorizontalWidgetRun) {
                defineTerminalWidget(widgetRun, 0);
            }
        }
        if (z2) {
            WidgetRun widgetRun2 = this.mFirstRun;
            if (widgetRun2 instanceof VerticalWidgetRun) {
                defineTerminalWidget(widgetRun2, 1);
            }
        }
    }
}
