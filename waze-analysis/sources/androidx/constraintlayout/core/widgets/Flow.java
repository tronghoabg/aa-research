package androidx.constraintlayout.core.widgets;

import androidx.constraintlayout.core.LinearSystem;
import androidx.constraintlayout.core.widgets.ConstraintWidget;
import java.util.ArrayList;
import java.util.HashMap;

/* compiled from: WazeSource */
/* loaded from: classes3.dex */
public class Flow extends VirtualLayout {
    public static final int HORIZONTAL_ALIGN_CENTER = 2;
    public static final int HORIZONTAL_ALIGN_END = 1;
    public static final int HORIZONTAL_ALIGN_START = 0;
    public static final int VERTICAL_ALIGN_BASELINE = 3;
    public static final int VERTICAL_ALIGN_BOTTOM = 1;
    public static final int VERTICAL_ALIGN_CENTER = 2;
    public static final int VERTICAL_ALIGN_TOP = 0;
    public static final int WRAP_ALIGNED = 2;
    public static final int WRAP_CHAIN = 1;
    public static final int WRAP_CHAIN_NEW = 3;
    public static final int WRAP_NONE = 0;
    private ConstraintWidget[] mDisplayedWidgets;
    private int mHorizontalStyle = -1;
    private int mVerticalStyle = -1;
    private int mFirstHorizontalStyle = -1;
    private int mFirstVerticalStyle = -1;
    private int mLastHorizontalStyle = -1;
    private int mLastVerticalStyle = -1;
    private float mHorizontalBias = 0.5f;
    private float mVerticalBias = 0.5f;
    private float mFirstHorizontalBias = 0.5f;
    private float mFirstVerticalBias = 0.5f;
    private float mLastHorizontalBias = 0.5f;
    private float mLastVerticalBias = 0.5f;
    private int mHorizontalGap = 0;
    private int mVerticalGap = 0;
    private int mHorizontalAlign = 2;
    private int mVerticalAlign = 2;
    private int mWrapMode = 0;
    private int mMaxElementsWrap = -1;
    private int mOrientation = 0;
    private ArrayList<WidgetsList> mChainList = new ArrayList<>();
    private ConstraintWidget[] mAlignedBiggestElementsInRows = null;
    private ConstraintWidget[] mAlignedBiggestElementsInCols = null;
    private int[] mAlignedDimensions = null;
    private int mDisplayedWidgetsCount = 0;

    /* compiled from: WazeSource */
    class WidgetsList {
        private ConstraintAnchor mBottom;
        private ConstraintAnchor mLeft;
        private int mMax;
        private int mOrientation;
        private int mPaddingBottom;
        private int mPaddingLeft;
        private int mPaddingRight;
        private int mPaddingTop;
        private ConstraintAnchor mRight;
        private ConstraintAnchor mTop;
        private ConstraintWidget mBiggest = null;
        int mBiggestDimension = 0;
        private int mWidth = 0;
        private int mHeight = 0;
        private int mStartIndex = 0;
        private int mCount = 0;
        private int mNbMatchConstraintsWidgets = 0;

        WidgetsList(int i2, ConstraintAnchor constraintAnchor, ConstraintAnchor constraintAnchor2, ConstraintAnchor constraintAnchor3, ConstraintAnchor constraintAnchor4, int i3) {
            this.mPaddingLeft = 0;
            this.mPaddingTop = 0;
            this.mPaddingRight = 0;
            this.mPaddingBottom = 0;
            this.mMax = 0;
            this.mOrientation = i2;
            this.mLeft = constraintAnchor;
            this.mTop = constraintAnchor2;
            this.mRight = constraintAnchor3;
            this.mBottom = constraintAnchor4;
            this.mPaddingLeft = Flow.this.getPaddingLeft();
            this.mPaddingTop = Flow.this.getPaddingTop();
            this.mPaddingRight = Flow.this.getPaddingRight();
            this.mPaddingBottom = Flow.this.getPaddingBottom();
            this.mMax = i3;
        }

        private void recomputeDimensions() {
            this.mWidth = 0;
            this.mHeight = 0;
            this.mBiggest = null;
            this.mBiggestDimension = 0;
            int i2 = this.mCount;
            for (int i3 = 0; i3 < i2 && this.mStartIndex + i3 < Flow.this.mDisplayedWidgetsCount; i3++) {
                ConstraintWidget constraintWidget = Flow.this.mDisplayedWidgets[this.mStartIndex + i3];
                if (this.mOrientation == 0) {
                    int width = constraintWidget.getWidth();
                    int i4 = Flow.this.mHorizontalGap;
                    if (constraintWidget.getVisibility() == 8) {
                        i4 = 0;
                    }
                    this.mWidth += width + i4;
                    int widgetHeight = Flow.this.getWidgetHeight(constraintWidget, this.mMax);
                    if (this.mBiggest == null || this.mBiggestDimension < widgetHeight) {
                        this.mBiggest = constraintWidget;
                        this.mBiggestDimension = widgetHeight;
                        this.mHeight = widgetHeight;
                    }
                } else {
                    int widgetWidth = Flow.this.getWidgetWidth(constraintWidget, this.mMax);
                    int widgetHeight2 = Flow.this.getWidgetHeight(constraintWidget, this.mMax);
                    int i5 = Flow.this.mVerticalGap;
                    if (constraintWidget.getVisibility() == 8) {
                        i5 = 0;
                    }
                    this.mHeight += widgetHeight2 + i5;
                    if (this.mBiggest == null || this.mBiggestDimension < widgetWidth) {
                        this.mBiggest = constraintWidget;
                        this.mBiggestDimension = widgetWidth;
                        this.mWidth = widgetWidth;
                    }
                }
            }
        }

        public void add(ConstraintWidget constraintWidget) {
            int i2 = this.mOrientation;
            Flow flow = Flow.this;
            if (i2 == 0) {
                int widgetWidth = flow.getWidgetWidth(constraintWidget, this.mMax);
                if (constraintWidget.getHorizontalDimensionBehaviour() == ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT) {
                    this.mNbMatchConstraintsWidgets++;
                    widgetWidth = 0;
                }
                this.mWidth += widgetWidth + (constraintWidget.getVisibility() != 8 ? Flow.this.mHorizontalGap : 0);
                int widgetHeight = Flow.this.getWidgetHeight(constraintWidget, this.mMax);
                if (this.mBiggest == null || this.mBiggestDimension < widgetHeight) {
                    this.mBiggest = constraintWidget;
                    this.mBiggestDimension = widgetHeight;
                    this.mHeight = widgetHeight;
                }
            } else {
                int widgetWidth2 = flow.getWidgetWidth(constraintWidget, this.mMax);
                int widgetHeight2 = Flow.this.getWidgetHeight(constraintWidget, this.mMax);
                if (constraintWidget.getVerticalDimensionBehaviour() == ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT) {
                    this.mNbMatchConstraintsWidgets++;
                    widgetHeight2 = 0;
                }
                this.mHeight += widgetHeight2 + (constraintWidget.getVisibility() != 8 ? Flow.this.mVerticalGap : 0);
                if (this.mBiggest == null || this.mBiggestDimension < widgetWidth2) {
                    this.mBiggest = constraintWidget;
                    this.mBiggestDimension = widgetWidth2;
                    this.mWidth = widgetWidth2;
                }
            }
            this.mCount++;
        }

        public void clear() {
            this.mBiggestDimension = 0;
            this.mBiggest = null;
            this.mWidth = 0;
            this.mHeight = 0;
            this.mStartIndex = 0;
            this.mCount = 0;
            this.mNbMatchConstraintsWidgets = 0;
        }

        /* JADX WARN: Removed duplicated region for block: B:193:0x038c  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public void createConstraints(boolean r19, int r20, boolean r21) {
            /*
                Method dump skipped, instructions count: 918
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.core.widgets.Flow.WidgetsList.createConstraints(boolean, int, boolean):void");
        }

        public int getHeight() {
            int i2 = this.mOrientation;
            int i3 = this.mHeight;
            return i2 == 1 ? i3 - Flow.this.mVerticalGap : i3;
        }

        public int getWidth() {
            int i2 = this.mOrientation;
            int i3 = this.mWidth;
            return i2 == 0 ? i3 - Flow.this.mHorizontalGap : i3;
        }

        public void measureMatchConstraints(int i2) {
            int i3 = this.mNbMatchConstraintsWidgets;
            if (i3 == 0) {
                return;
            }
            int i4 = this.mCount;
            int i5 = i2 / i3;
            for (int i6 = 0; i6 < i4 && this.mStartIndex + i6 < Flow.this.mDisplayedWidgetsCount; i6++) {
                ConstraintWidget constraintWidget = Flow.this.mDisplayedWidgets[this.mStartIndex + i6];
                if (this.mOrientation == 0) {
                    if (constraintWidget != null && constraintWidget.getHorizontalDimensionBehaviour() == ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT && constraintWidget.mMatchConstraintDefaultWidth == 0) {
                        Flow.this.measure(constraintWidget, ConstraintWidget.DimensionBehaviour.FIXED, i5, constraintWidget.getVerticalDimensionBehaviour(), constraintWidget.getHeight());
                    }
                } else if (constraintWidget != null && constraintWidget.getVerticalDimensionBehaviour() == ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT && constraintWidget.mMatchConstraintDefaultHeight == 0) {
                    int i7 = i5;
                    Flow.this.measure(constraintWidget, constraintWidget.getHorizontalDimensionBehaviour(), constraintWidget.getWidth(), ConstraintWidget.DimensionBehaviour.FIXED, i7);
                    i5 = i7;
                }
            }
            recomputeDimensions();
        }

        public void setStartIndex(int i2) {
            this.mStartIndex = i2;
        }

        public void setup(int i2, ConstraintAnchor constraintAnchor, ConstraintAnchor constraintAnchor2, ConstraintAnchor constraintAnchor3, ConstraintAnchor constraintAnchor4, int i3, int i4, int i5, int i6, int i7) {
            this.mOrientation = i2;
            this.mLeft = constraintAnchor;
            this.mTop = constraintAnchor2;
            this.mRight = constraintAnchor3;
            this.mBottom = constraintAnchor4;
            this.mPaddingLeft = i3;
            this.mPaddingTop = i4;
            this.mPaddingRight = i5;
            this.mPaddingBottom = i6;
            this.mMax = i7;
        }
    }

    private void createAlignedConstraints(boolean z) {
        ConstraintWidget constraintWidget;
        float f2;
        int i2;
        if (this.mAlignedDimensions == null || this.mAlignedBiggestElementsInCols == null || this.mAlignedBiggestElementsInRows == null) {
            return;
        }
        for (int i3 = 0; i3 < this.mDisplayedWidgetsCount; i3++) {
            this.mDisplayedWidgets[i3].resetAnchors();
        }
        int[] iArr = this.mAlignedDimensions;
        int i4 = iArr[0];
        int i5 = iArr[1];
        float f3 = this.mHorizontalBias;
        ConstraintWidget constraintWidget2 = null;
        int i6 = 0;
        while (i6 < i4) {
            if (z) {
                i2 = (i4 - i6) - 1;
                f2 = 1.0f - this.mHorizontalBias;
            } else {
                f2 = f3;
                i2 = i6;
            }
            ConstraintWidget constraintWidget3 = this.mAlignedBiggestElementsInCols[i2];
            if (constraintWidget3 != null && constraintWidget3.getVisibility() != 8) {
                if (i6 == 0) {
                    constraintWidget3.connect(constraintWidget3.mLeft, this.mLeft, getPaddingLeft());
                    constraintWidget3.setHorizontalChainStyle(this.mHorizontalStyle);
                    constraintWidget3.setHorizontalBiasPercent(f2);
                    i6 = 0;
                }
                if (i6 == i4 - 1) {
                    constraintWidget3.connect(constraintWidget3.mRight, this.mRight, getPaddingRight());
                }
                if (i6 > 0 && constraintWidget2 != null) {
                    constraintWidget3.connect(constraintWidget3.mLeft, constraintWidget2.mRight, this.mHorizontalGap);
                    constraintWidget2.connect(constraintWidget2.mRight, constraintWidget3.mLeft, 0);
                }
                constraintWidget2 = constraintWidget3;
            }
            i6++;
            f3 = f2;
        }
        int i7 = 0;
        while (i7 < i5) {
            ConstraintWidget constraintWidget4 = this.mAlignedBiggestElementsInRows[i7];
            if (constraintWidget4 != null && constraintWidget4.getVisibility() != 8) {
                if (i7 == 0) {
                    constraintWidget4.connect(constraintWidget4.mTop, this.mTop, getPaddingTop());
                    constraintWidget4.setVerticalChainStyle(this.mVerticalStyle);
                    constraintWidget4.setVerticalBiasPercent(this.mVerticalBias);
                    i7 = 0;
                }
                if (i7 == i5 - 1) {
                    constraintWidget4.connect(constraintWidget4.mBottom, this.mBottom, getPaddingBottom());
                }
                if (i7 > 0 && constraintWidget2 != null) {
                    constraintWidget4.connect(constraintWidget4.mTop, constraintWidget2.mBottom, this.mVerticalGap);
                    constraintWidget2.connect(constraintWidget2.mBottom, constraintWidget4.mTop, 0);
                }
                constraintWidget2 = constraintWidget4;
            }
            i7++;
        }
        for (int i8 = 0; i8 < i4; i8++) {
            for (int i9 = 0; i9 < i5; i9++) {
                int i10 = (i9 * i4) + i8;
                if (this.mOrientation == 1) {
                    i10 = (i8 * i5) + i9;
                }
                ConstraintWidget[] constraintWidgetArr = this.mDisplayedWidgets;
                if (i10 < constraintWidgetArr.length && (constraintWidget = constraintWidgetArr[i10]) != null && constraintWidget.getVisibility() != 8) {
                    ConstraintWidget constraintWidget5 = this.mAlignedBiggestElementsInCols[i8];
                    ConstraintWidget constraintWidget6 = this.mAlignedBiggestElementsInRows[i9];
                    if (constraintWidget != constraintWidget5) {
                        constraintWidget.connect(constraintWidget.mLeft, constraintWidget5.mLeft, 0);
                        constraintWidget.connect(constraintWidget.mRight, constraintWidget5.mRight, 0);
                    }
                    if (constraintWidget != constraintWidget6) {
                        constraintWidget.connect(constraintWidget.mTop, constraintWidget6.mTop, 0);
                        constraintWidget.connect(constraintWidget.mBottom, constraintWidget6.mBottom, 0);
                    }
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public int getWidgetHeight(ConstraintWidget constraintWidget, int i2) {
        ConstraintWidget constraintWidget2;
        if (constraintWidget == null) {
            return 0;
        }
        if (constraintWidget.getVerticalDimensionBehaviour() == ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT) {
            int i3 = constraintWidget.mMatchConstraintDefaultHeight;
            if (i3 == 0) {
                return 0;
            }
            if (i3 == 2) {
                int i4 = (int) (constraintWidget.mMatchConstraintPercentHeight * i2);
                if (i4 != constraintWidget.getHeight()) {
                    constraintWidget.setMeasureRequested(true);
                    measure(constraintWidget, constraintWidget.getHorizontalDimensionBehaviour(), constraintWidget.getWidth(), ConstraintWidget.DimensionBehaviour.FIXED, i4);
                }
                return i4;
            }
            constraintWidget2 = constraintWidget;
            if (i3 == 1) {
                return constraintWidget2.getHeight();
            }
            if (i3 == 3) {
                return (int) ((constraintWidget2.getWidth() * constraintWidget2.mDimensionRatio) + 0.5f);
            }
        } else {
            constraintWidget2 = constraintWidget;
        }
        return constraintWidget2.getHeight();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public int getWidgetWidth(ConstraintWidget constraintWidget, int i2) {
        ConstraintWidget constraintWidget2;
        if (constraintWidget == null) {
            return 0;
        }
        if (constraintWidget.getHorizontalDimensionBehaviour() == ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT) {
            int i3 = constraintWidget.mMatchConstraintDefaultWidth;
            if (i3 == 0) {
                return 0;
            }
            if (i3 == 2) {
                int i4 = (int) (constraintWidget.mMatchConstraintPercentWidth * i2);
                if (i4 != constraintWidget.getWidth()) {
                    constraintWidget.setMeasureRequested(true);
                    measure(constraintWidget, ConstraintWidget.DimensionBehaviour.FIXED, i4, constraintWidget.getVerticalDimensionBehaviour(), constraintWidget.getHeight());
                }
                return i4;
            }
            constraintWidget2 = constraintWidget;
            if (i3 == 1) {
                return constraintWidget2.getWidth();
            }
            if (i3 == 3) {
                return (int) ((constraintWidget2.getHeight() * constraintWidget2.mDimensionRatio) + 0.5f);
            }
        } else {
            constraintWidget2 = constraintWidget;
        }
        return constraintWidget2.getWidth();
    }

    /* JADX WARN: Removed duplicated region for block: B:43:0x005c  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:103:0x0109 -> B:37:0x0052). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:104:0x010b -> B:37:0x0052). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:106:0x0111 -> B:37:0x0052). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:107:0x0113 -> B:37:0x0052). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void measureAligned(androidx.constraintlayout.core.widgets.ConstraintWidget[] r11, int r12, int r13, int r14, int[] r15) {
        /*
            Method dump skipped, instructions count: 288
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.core.widgets.Flow.measureAligned(androidx.constraintlayout.core.widgets.ConstraintWidget[], int, int, int, int[]):void");
    }

    private void measureChainWrap(ConstraintWidget[] constraintWidgetArr, int i2, int i3, int i4, int[] iArr) {
        int i5;
        int i6;
        Flow flow;
        int i7;
        int i8;
        int i9;
        ConstraintAnchor constraintAnchor;
        ConstraintAnchor constraintAnchor2;
        int i10;
        int width;
        int i11;
        Flow flow2 = this;
        if (i2 == 0) {
            return;
        }
        flow2.mChainList.clear();
        int i12 = i4;
        WidgetsList widgetsList = flow2.new WidgetsList(i3, flow2.mLeft, flow2.mTop, flow2.mRight, flow2.mBottom, i12);
        flow2.mChainList.add(widgetsList);
        if (i3 == 0) {
            i5 = 0;
            int i13 = 0;
            int i14 = 0;
            while (i14 < i2) {
                ConstraintWidget constraintWidget = constraintWidgetArr[i14];
                int widgetWidth = flow2.getWidgetWidth(constraintWidget, i12);
                if (constraintWidget.getHorizontalDimensionBehaviour() == ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT) {
                    i5++;
                }
                int i15 = i5;
                if (((i13 == i12 || flow2.mHorizontalGap + i13 + widgetWidth > i12) && widgetsList.mBiggest != null) || (i14 > 0 && (i11 = flow2.mMaxElementsWrap) > 0 && i14 % i11 == 0)) {
                    widgetsList = flow2.new WidgetsList(0, flow2.mLeft, flow2.mTop, flow2.mRight, flow2.mBottom, i12);
                    widgetsList.setStartIndex(i14);
                    flow2.mChainList.add(widgetsList);
                } else {
                    if (i14 > 0) {
                        i13 += flow2.mHorizontalGap + widgetWidth;
                    }
                    widgetsList.add(constraintWidget);
                    i14++;
                    i5 = i15;
                }
                i13 = widgetWidth;
                widgetsList.add(constraintWidget);
                i14++;
                i5 = i15;
            }
            i6 = 0;
        } else {
            i5 = 0;
            int i16 = 0;
            int i17 = 0;
            while (i17 < i2) {
                ConstraintWidget constraintWidget2 = constraintWidgetArr[i17];
                int widgetHeight = flow2.getWidgetHeight(constraintWidget2, i12);
                if (constraintWidget2.getVerticalDimensionBehaviour() == ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT) {
                    i5++;
                }
                int i18 = i5;
                if (((i16 == i12 || flow2.mVerticalGap + i16 + widgetHeight > i12) && widgetsList.mBiggest != null) || (i17 > 0 && (i7 = flow2.mMaxElementsWrap) > 0 && i17 % i7 == 0)) {
                    widgetsList = flow2.new WidgetsList(i3, flow2.mLeft, flow2.mTop, flow2.mRight, flow2.mBottom, i12);
                    flow = flow2;
                    widgetsList.setStartIndex(i17);
                    flow.mChainList.add(widgetsList);
                } else {
                    flow = flow2;
                    if (i17 > 0) {
                        i16 += flow.mVerticalGap + widgetHeight;
                    }
                    widgetsList.add(constraintWidget2);
                    i17++;
                    i12 = i4;
                    i5 = i18;
                    flow2 = flow;
                }
                i16 = widgetHeight;
                widgetsList.add(constraintWidget2);
                i17++;
                i12 = i4;
                i5 = i18;
                flow2 = flow;
            }
            i6 = i3;
        }
        Flow flow3 = flow2;
        int size = flow3.mChainList.size();
        ConstraintAnchor constraintAnchor3 = flow3.mLeft;
        ConstraintAnchor constraintAnchor4 = flow3.mTop;
        ConstraintAnchor constraintAnchor5 = flow3.mRight;
        ConstraintAnchor constraintAnchor6 = flow3.mBottom;
        int paddingLeft = flow3.getPaddingLeft();
        int paddingTop = flow3.getPaddingTop();
        int paddingRight = flow3.getPaddingRight();
        int paddingBottom = flow3.getPaddingBottom();
        boolean z = flow3.getHorizontalDimensionBehaviour() == ConstraintWidget.DimensionBehaviour.WRAP_CONTENT || flow3.getVerticalDimensionBehaviour() == ConstraintWidget.DimensionBehaviour.WRAP_CONTENT;
        if (i5 > 0 && z) {
            for (int i19 = 0; i19 < size; i19++) {
                WidgetsList widgetsList2 = flow3.mChainList.get(i19);
                if (i6 == 0) {
                    widgetsList2.measureMatchConstraints(i4 - widgetsList2.getWidth());
                } else {
                    widgetsList2.measureMatchConstraints(i4 - widgetsList2.getHeight());
                }
            }
        }
        ConstraintAnchor constraintAnchor7 = constraintAnchor3;
        int paddingBottom2 = paddingBottom;
        int i20 = 0;
        int height = 0;
        int paddingRight2 = paddingRight;
        int i21 = paddingTop;
        int i22 = paddingLeft;
        ConstraintAnchor constraintAnchor8 = constraintAnchor6;
        ConstraintAnchor constraintAnchor9 = constraintAnchor5;
        ConstraintAnchor constraintAnchor10 = constraintAnchor4;
        int i23 = 0;
        while (i20 < size) {
            int i24 = size - 1;
            WidgetsList widgetsList3 = flow3.mChainList.get(i20);
            if (i6 == 0) {
                if (i20 < i24) {
                    constraintAnchor8 = flow3.mChainList.get(i20 + 1).mBiggest.mTop;
                    paddingBottom2 = 0;
                } else {
                    constraintAnchor8 = flow3.mBottom;
                    paddingBottom2 = flow3.getPaddingBottom();
                }
                ConstraintAnchor constraintAnchor11 = widgetsList3.mBiggest.mBottom;
                i8 = i20;
                int i25 = i6;
                i9 = size;
                widgetsList3.setup(0, constraintAnchor7, constraintAnchor10, constraintAnchor9, constraintAnchor8, i22, i21, paddingRight2, paddingBottom2, i4);
                int iMax = Math.max(i23, widgetsList3.getWidth());
                height += widgetsList3.getHeight();
                if (i8 > 0) {
                    height += flow3.mVerticalGap;
                }
                constraintAnchor10 = constraintAnchor11;
                i21 = 0;
                constraintAnchor2 = constraintAnchor7;
                width = iMax;
                i10 = i25;
            } else {
                i8 = i20;
                int i26 = i6;
                i9 = size;
                int i27 = i23;
                int i28 = height;
                if (i8 < i24) {
                    constraintAnchor = flow3.mChainList.get(i8 + 1).mBiggest.mLeft;
                    paddingRight2 = 0;
                } else {
                    constraintAnchor = flow3.mRight;
                    paddingRight2 = flow3.getPaddingRight();
                }
                constraintAnchor9 = constraintAnchor;
                constraintAnchor2 = widgetsList3.mBiggest.mRight;
                i10 = i26;
                widgetsList3.setup(i10, constraintAnchor7, constraintAnchor10, constraintAnchor9, constraintAnchor8, i22, i21, paddingRight2, paddingBottom2, i4);
                width = widgetsList3.getWidth() + i27;
                int iMax2 = Math.max(i28, widgetsList3.getHeight());
                if (i8 > 0) {
                    width += flow3.mHorizontalGap;
                }
                height = iMax2;
                i22 = 0;
            }
            i20 = i8 + 1;
            size = i9;
            i6 = i10;
            i23 = width;
            constraintAnchor7 = constraintAnchor2;
        }
        iArr[0] = i23;
        iArr[1] = height;
    }

    private void measureChainWrap_new(ConstraintWidget[] constraintWidgetArr, int i2, int i3, int i4, int[] iArr) {
        int i5;
        int i6;
        Flow flow;
        int i7;
        int i8;
        int i9;
        ConstraintAnchor constraintAnchor;
        ConstraintAnchor constraintAnchor2;
        int i10;
        int width;
        int i11;
        Flow flow2 = this;
        if (i2 == 0) {
            return;
        }
        flow2.mChainList.clear();
        int i12 = i4;
        WidgetsList widgetsList = flow2.new WidgetsList(i3, flow2.mLeft, flow2.mTop, flow2.mRight, flow2.mBottom, i12);
        flow2.mChainList.add(widgetsList);
        boolean z = true;
        if (i3 == 0) {
            int i13 = 0;
            i5 = 0;
            int i14 = 0;
            int i15 = 0;
            while (i15 < i2) {
                i13++;
                ConstraintWidget constraintWidget = constraintWidgetArr[i15];
                int widgetWidth = flow2.getWidgetWidth(constraintWidget, i12);
                if (constraintWidget.getHorizontalDimensionBehaviour() == ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT) {
                    i5++;
                }
                int i16 = i5;
                if (((i14 == i12 || flow2.mHorizontalGap + i14 + widgetWidth > i12) && widgetsList.mBiggest != null) || (i15 > 0 && (i11 = flow2.mMaxElementsWrap) > 0 && i13 > i11)) {
                    widgetsList = flow2.new WidgetsList(0, flow2.mLeft, flow2.mTop, flow2.mRight, flow2.mBottom, i12);
                    widgetsList.setStartIndex(i15);
                    flow2.mChainList.add(widgetsList);
                    i13 = 1;
                } else {
                    if (i15 > 0) {
                        i14 += flow2.mHorizontalGap + widgetWidth;
                    }
                    widgetsList.add(constraintWidget);
                    i15++;
                    i5 = i16;
                }
                i14 = widgetWidth;
                widgetsList.add(constraintWidget);
                i15++;
                i5 = i16;
            }
            i6 = 0;
        } else {
            int i17 = 0;
            i5 = 0;
            int i18 = 0;
            int i19 = 0;
            while (i19 < i2) {
                i17++;
                ConstraintWidget constraintWidget2 = constraintWidgetArr[i19];
                int widgetHeight = flow2.getWidgetHeight(constraintWidget2, i12);
                if (constraintWidget2.getVerticalDimensionBehaviour() == ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT) {
                    i5++;
                }
                int i20 = i5;
                if (((i18 == i12 || flow2.mVerticalGap + i18 + widgetHeight > i12) && widgetsList.mBiggest != null) || (i19 > 0 && (i7 = flow2.mMaxElementsWrap) > 0 && i17 > i7)) {
                    widgetsList = flow2.new WidgetsList(i3, flow2.mLeft, flow2.mTop, flow2.mRight, flow2.mBottom, i12);
                    flow = flow2;
                    widgetsList.setStartIndex(i19);
                    flow.mChainList.add(widgetsList);
                    i17 = 1;
                } else {
                    flow = flow2;
                    if (i19 > 0) {
                        i18 += flow.mVerticalGap + widgetHeight;
                    }
                    widgetsList.add(constraintWidget2);
                    i19++;
                    i12 = i4;
                    i5 = i20;
                    flow2 = flow;
                }
                i18 = widgetHeight;
                widgetsList.add(constraintWidget2);
                i19++;
                i12 = i4;
                i5 = i20;
                flow2 = flow;
            }
            i6 = i3;
        }
        Flow flow3 = flow2;
        int size = flow3.mChainList.size();
        ConstraintAnchor constraintAnchor3 = flow3.mLeft;
        ConstraintAnchor constraintAnchor4 = flow3.mTop;
        ConstraintAnchor constraintAnchor5 = flow3.mRight;
        ConstraintAnchor constraintAnchor6 = flow3.mBottom;
        int paddingLeft = flow3.getPaddingLeft();
        int paddingTop = flow3.getPaddingTop();
        int paddingRight = flow3.getPaddingRight();
        int paddingBottom = flow3.getPaddingBottom();
        boolean z2 = flow3.getHorizontalDimensionBehaviour() == ConstraintWidget.DimensionBehaviour.WRAP_CONTENT || flow3.getVerticalDimensionBehaviour() == ConstraintWidget.DimensionBehaviour.WRAP_CONTENT;
        if (i5 > 0 && z2) {
            for (int i21 = 0; i21 < size; i21++) {
                WidgetsList widgetsList2 = flow3.mChainList.get(i21);
                if (i6 == 0) {
                    widgetsList2.measureMatchConstraints(i4 - widgetsList2.getWidth());
                } else {
                    widgetsList2.measureMatchConstraints(i4 - widgetsList2.getHeight());
                }
            }
        }
        ConstraintAnchor constraintAnchor7 = constraintAnchor4;
        int paddingBottom2 = paddingBottom;
        int i22 = 0;
        int height = 0;
        int paddingRight2 = paddingRight;
        int i23 = paddingTop;
        int i24 = paddingLeft;
        ConstraintAnchor constraintAnchor8 = constraintAnchor6;
        ConstraintAnchor constraintAnchor9 = constraintAnchor5;
        ConstraintAnchor constraintAnchor10 = constraintAnchor3;
        int i25 = 0;
        while (i25 < size) {
            boolean z3 = z;
            int i26 = size - 1;
            WidgetsList widgetsList3 = flow3.mChainList.get(i25);
            if (i6 == 0) {
                if (i25 < i26) {
                    constraintAnchor8 = flow3.mChainList.get(i25 + 1).mBiggest.mTop;
                    paddingBottom2 = 0;
                } else {
                    constraintAnchor8 = flow3.mBottom;
                    paddingBottom2 = flow3.getPaddingBottom();
                }
                ConstraintAnchor constraintAnchor11 = widgetsList3.mBiggest.mBottom;
                i8 = i25;
                int i27 = i6;
                i9 = size;
                widgetsList3.setup(0, constraintAnchor10, constraintAnchor7, constraintAnchor9, constraintAnchor8, i24, i23, paddingRight2, paddingBottom2, i4);
                int iMax = Math.max(i22, widgetsList3.getWidth());
                height += widgetsList3.getHeight();
                if (i8 > 0) {
                    height += flow3.mVerticalGap;
                }
                constraintAnchor7 = constraintAnchor11;
                i23 = 0;
                constraintAnchor2 = constraintAnchor10;
                width = iMax;
                i10 = i27;
            } else {
                i8 = i25;
                int i28 = i6;
                i9 = size;
                int i29 = i22;
                int i30 = height;
                if (i8 < i26) {
                    constraintAnchor = flow3.mChainList.get(i8 + 1).mBiggest.mLeft;
                    paddingRight2 = 0;
                } else {
                    constraintAnchor = flow3.mRight;
                    paddingRight2 = flow3.getPaddingRight();
                }
                constraintAnchor9 = constraintAnchor;
                constraintAnchor2 = widgetsList3.mBiggest.mRight;
                i10 = i28;
                widgetsList3.setup(i10, constraintAnchor10, constraintAnchor7, constraintAnchor9, constraintAnchor8, i24, i23, paddingRight2, paddingBottom2, i4);
                width = widgetsList3.getWidth() + i29;
                int iMax2 = Math.max(i30, widgetsList3.getHeight());
                if (i8 > 0) {
                    width += flow3.mHorizontalGap;
                }
                height = iMax2;
                i24 = 0;
            }
            i25 = i8 + 1;
            size = i9;
            i6 = i10;
            i22 = width;
            constraintAnchor10 = constraintAnchor2;
            z = z3;
        }
        iArr[0] = i22;
        iArr[z ? 1 : 0] = height;
    }

    private void measureNoWrap(ConstraintWidget[] constraintWidgetArr, int i2, int i3, int i4, int[] iArr) {
        WidgetsList widgetsList;
        if (i2 == 0) {
            return;
        }
        if (this.mChainList.size() == 0) {
            widgetsList = new WidgetsList(i3, this.mLeft, this.mTop, this.mRight, this.mBottom, i4);
            this.mChainList.add(widgetsList);
        } else {
            WidgetsList widgetsList2 = this.mChainList.get(0);
            widgetsList2.clear();
            widgetsList2.setup(i3, this.mLeft, this.mTop, this.mRight, this.mBottom, getPaddingLeft(), getPaddingTop(), getPaddingRight(), getPaddingBottom(), i4);
            widgetsList = widgetsList2;
        }
        for (int i5 = 0; i5 < i2; i5++) {
            widgetsList.add(constraintWidgetArr[i5]);
        }
        iArr[0] = widgetsList.getWidth();
        iArr[1] = widgetsList.getHeight();
    }

    @Override // androidx.constraintlayout.core.widgets.ConstraintWidget
    public void addToSolver(LinearSystem linearSystem, boolean z) {
        super.addToSolver(linearSystem, z);
        boolean z2 = getParent() != null && ((ConstraintWidgetContainer) getParent()).isRtl();
        int i2 = this.mWrapMode;
        if (i2 != 0) {
            if (i2 == 1) {
                int size = this.mChainList.size();
                int i3 = 0;
                while (i3 < size) {
                    this.mChainList.get(i3).createConstraints(z2, i3, i3 == size + (-1));
                    i3++;
                }
            } else if (i2 == 2) {
                createAlignedConstraints(z2);
            } else if (i2 == 3) {
                int size2 = this.mChainList.size();
                int i4 = 0;
                while (i4 < size2) {
                    this.mChainList.get(i4).createConstraints(z2, i4, i4 == size2 + (-1));
                    i4++;
                }
            }
        } else if (this.mChainList.size() > 0) {
            this.mChainList.get(0).createConstraints(z2, 0, true);
        }
        needsCallbackFromSolver(false);
    }

    @Override // androidx.constraintlayout.core.widgets.HelperWidget, androidx.constraintlayout.core.widgets.ConstraintWidget
    public void copy(ConstraintWidget constraintWidget, HashMap<ConstraintWidget, ConstraintWidget> map) {
        super.copy(constraintWidget, map);
        Flow flow = (Flow) constraintWidget;
        this.mHorizontalStyle = flow.mHorizontalStyle;
        this.mVerticalStyle = flow.mVerticalStyle;
        this.mFirstHorizontalStyle = flow.mFirstHorizontalStyle;
        this.mFirstVerticalStyle = flow.mFirstVerticalStyle;
        this.mLastHorizontalStyle = flow.mLastHorizontalStyle;
        this.mLastVerticalStyle = flow.mLastVerticalStyle;
        this.mHorizontalBias = flow.mHorizontalBias;
        this.mVerticalBias = flow.mVerticalBias;
        this.mFirstHorizontalBias = flow.mFirstHorizontalBias;
        this.mFirstVerticalBias = flow.mFirstVerticalBias;
        this.mLastHorizontalBias = flow.mLastHorizontalBias;
        this.mLastVerticalBias = flow.mLastVerticalBias;
        this.mHorizontalGap = flow.mHorizontalGap;
        this.mVerticalGap = flow.mVerticalGap;
        this.mHorizontalAlign = flow.mHorizontalAlign;
        this.mVerticalAlign = flow.mVerticalAlign;
        this.mWrapMode = flow.mWrapMode;
        this.mMaxElementsWrap = flow.mMaxElementsWrap;
        this.mOrientation = flow.mOrientation;
    }

    public float getMaxElementsWrap() {
        return this.mMaxElementsWrap;
    }

    @Override // androidx.constraintlayout.core.widgets.VirtualLayout
    public void measure(int i2, int i3, int i4, int i5) {
        int i6;
        if (this.mWidgetsCount > 0 && !measureChildren()) {
            setMeasure(0, 0);
            needsCallbackFromSolver(false);
            return;
        }
        int paddingLeft = getPaddingLeft();
        int paddingRight = getPaddingRight();
        int paddingTop = getPaddingTop();
        int paddingBottom = getPaddingBottom();
        int i7 = (i3 - paddingLeft) - paddingRight;
        int[] iArr = new int[2];
        int i8 = this.mOrientation;
        if (i8 == 1) {
            i7 = (i5 - paddingTop) - paddingBottom;
            i8 = 1;
        }
        int i9 = i7;
        int i10 = this.mHorizontalStyle;
        if (i8 == 0) {
            if (i10 == -1) {
                this.mHorizontalStyle = 0;
            }
            if (this.mVerticalStyle == -1) {
                this.mVerticalStyle = 0;
            }
        } else {
            if (i10 == -1) {
                this.mHorizontalStyle = 0;
            }
            if (this.mVerticalStyle == -1) {
                this.mVerticalStyle = 0;
            }
        }
        ConstraintWidget[] constraintWidgetArr = this.mWidgets;
        int i11 = 0;
        int i12 = 0;
        while (true) {
            i6 = this.mWidgetsCount;
            if (i11 >= i6) {
                break;
            }
            if (this.mWidgets[i11].getVisibility() == 8) {
                i12++;
            }
            i11++;
        }
        if (i12 > 0) {
            constraintWidgetArr = new ConstraintWidget[i6 - i12];
            int i13 = 0;
            i6 = 0;
            while (i13 < this.mWidgetsCount) {
                ConstraintWidget constraintWidget = this.mWidgets[i13];
                ConstraintWidget[] constraintWidgetArr2 = constraintWidgetArr;
                if (constraintWidget.getVisibility() != 8) {
                    constraintWidgetArr2[i6] = constraintWidget;
                    i6++;
                }
                i13++;
                constraintWidgetArr = constraintWidgetArr2;
            }
        }
        int i14 = i6;
        this.mDisplayedWidgets = constraintWidgetArr;
        this.mDisplayedWidgetsCount = i14;
        int i15 = this.mWrapMode;
        if (i15 == 0) {
            measureNoWrap(constraintWidgetArr, i14, this.mOrientation, i9, iArr);
        } else if (i15 == 1) {
            measureChainWrap(constraintWidgetArr, i14, this.mOrientation, i9, iArr);
        } else if (i15 == 2) {
            measureAligned(constraintWidgetArr, i14, this.mOrientation, i9, iArr);
        } else if (i15 == 3) {
            measureChainWrap_new(constraintWidgetArr, i14, this.mOrientation, i9, iArr);
        }
        int iMin = iArr[0] + paddingLeft + paddingRight;
        int iMin2 = iArr[1] + paddingTop + paddingBottom;
        if (i2 == 1073741824) {
            iMin = i3;
        } else if (i2 == Integer.MIN_VALUE) {
            iMin = Math.min(iMin, i3);
        } else if (i2 != 0) {
            iMin = 0;
        }
        if (i4 == 1073741824) {
            iMin2 = i5;
        } else if (i4 == Integer.MIN_VALUE) {
            iMin2 = Math.min(iMin2, i5);
        } else if (i4 != 0) {
            iMin2 = 0;
        }
        setMeasure(iMin, iMin2);
        setWidth(iMin);
        setHeight(iMin2);
        needsCallbackFromSolver(this.mWidgetsCount > 0);
    }

    public void setFirstHorizontalBias(float f2) {
        this.mFirstHorizontalBias = f2;
    }

    public void setFirstHorizontalStyle(int i2) {
        this.mFirstHorizontalStyle = i2;
    }

    public void setFirstVerticalBias(float f2) {
        this.mFirstVerticalBias = f2;
    }

    public void setFirstVerticalStyle(int i2) {
        this.mFirstVerticalStyle = i2;
    }

    public void setHorizontalAlign(int i2) {
        this.mHorizontalAlign = i2;
    }

    public void setHorizontalBias(float f2) {
        this.mHorizontalBias = f2;
    }

    public void setHorizontalGap(int i2) {
        this.mHorizontalGap = i2;
    }

    public void setHorizontalStyle(int i2) {
        this.mHorizontalStyle = i2;
    }

    public void setLastHorizontalBias(float f2) {
        this.mLastHorizontalBias = f2;
    }

    public void setLastHorizontalStyle(int i2) {
        this.mLastHorizontalStyle = i2;
    }

    public void setLastVerticalBias(float f2) {
        this.mLastVerticalBias = f2;
    }

    public void setLastVerticalStyle(int i2) {
        this.mLastVerticalStyle = i2;
    }

    public void setMaxElementsWrap(int i2) {
        this.mMaxElementsWrap = i2;
    }

    public void setOrientation(int i2) {
        this.mOrientation = i2;
    }

    public void setVerticalAlign(int i2) {
        this.mVerticalAlign = i2;
    }

    public void setVerticalBias(float f2) {
        this.mVerticalBias = f2;
    }

    public void setVerticalGap(int i2) {
        this.mVerticalGap = i2;
    }

    public void setVerticalStyle(int i2) {
        this.mVerticalStyle = i2;
    }

    public void setWrapMode(int i2) {
        this.mWrapMode = i2;
    }
}
