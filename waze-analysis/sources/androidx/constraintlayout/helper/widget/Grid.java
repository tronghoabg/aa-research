package androidx.constraintlayout.helper.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.R;
import androidx.constraintlayout.widget.VirtualLayout;
import androidx.core.internal.view.SupportMenu;
import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

/* compiled from: WazeSource */
/* loaded from: classes3.dex */
public class Grid extends VirtualLayout {
    private static final boolean DEBUG_BOXES = false;
    public static final int HORIZONTAL = 0;
    private static final String TAG = "Grid";
    public static final int VERTICAL = 1;
    private int[] mBoxViewIds;
    private View[] mBoxViews;
    private int mColumns;
    private int mColumnsSet;
    ConstraintLayout mContainer;
    private float mHorizontalGaps;
    private final int mMaxColumns;
    private final int mMaxRows;
    private int mNextAvailableIndex;
    private int mOrientation;
    private boolean[][] mPositionMatrix;
    private int mRows;
    private int mRowsSet;
    Set<Integer> mSpanIds;
    private String mStrColumnWeights;
    private String mStrRowWeights;
    private String mStrSkips;
    private String mStrSpans;
    private boolean mUseRtl;
    private boolean mValidateInputs;
    private float mVerticalGaps;

    public Grid(Context context) {
        super(context);
        this.mMaxRows = 50;
        this.mMaxColumns = 50;
        this.mNextAvailableIndex = 0;
        this.mSpanIds = new HashSet();
    }

    private boolean arrangeWidgets() {
        Grid grid;
        View[] views = getViews(this.mContainer);
        int i2 = 0;
        while (i2 < this.mCount) {
            if (this.mSpanIds.contains(Integer.valueOf(this.mIds[i2]))) {
                grid = this;
            } else {
                int nextPosition = this.getNextPosition();
                int rowByIndex = this.getRowByIndex(nextPosition);
                int colByIndex = this.getColByIndex(nextPosition);
                if (nextPosition == -1) {
                    return false;
                }
                grid = this;
                grid.connectView(views[i2], rowByIndex, colByIndex, 1, 1);
            }
            i2++;
            this = grid;
        }
        return true;
    }

    private void buildBoxes() {
        int iMax = Math.max(this.mRows, this.mColumns);
        View[] viewArr = this.mBoxViews;
        int i2 = 0;
        if (viewArr == null) {
            this.mBoxViews = new View[iMax];
            int i3 = 0;
            while (true) {
                View[] viewArr2 = this.mBoxViews;
                if (i3 >= viewArr2.length) {
                    break;
                }
                viewArr2[i3] = makeNewView();
                i3++;
            }
        } else if (iMax != viewArr.length) {
            View[] viewArr3 = new View[iMax];
            for (int i4 = 0; i4 < iMax; i4++) {
                View[] viewArr4 = this.mBoxViews;
                if (i4 < viewArr4.length) {
                    viewArr3[i4] = viewArr4[i4];
                } else {
                    viewArr3[i4] = makeNewView();
                }
            }
            int i5 = iMax;
            while (true) {
                View[] viewArr5 = this.mBoxViews;
                if (i5 >= viewArr5.length) {
                    break;
                }
                this.mContainer.removeView(viewArr5[i5]);
                i5++;
            }
            this.mBoxViews = viewArr3;
        }
        this.mBoxViewIds = new int[iMax];
        while (true) {
            View[] viewArr6 = this.mBoxViews;
            if (i2 >= viewArr6.length) {
                setBoxViewVerticalChains();
                setBoxViewHorizontalChains();
                return;
            } else {
                this.mBoxViewIds[i2] = viewArr6[i2].getId();
                i2++;
            }
        }
    }

    private void clearHParams(View view) {
        ConstraintLayout.LayoutParams layoutParamsParams = params(view);
        layoutParamsParams.horizontalWeight = -1.0f;
        layoutParamsParams.leftToRight = -1;
        layoutParamsParams.leftToLeft = -1;
        layoutParamsParams.rightToLeft = -1;
        layoutParamsParams.rightToRight = -1;
        layoutParamsParams.leftMargin = -1;
        view.setLayoutParams(layoutParamsParams);
    }

    private void clearVParams(View view) {
        ConstraintLayout.LayoutParams layoutParamsParams = params(view);
        layoutParamsParams.verticalWeight = -1.0f;
        layoutParamsParams.topToBottom = -1;
        layoutParamsParams.topToTop = -1;
        layoutParamsParams.bottomToTop = -1;
        layoutParamsParams.bottomToBottom = -1;
        layoutParamsParams.topMargin = -1;
        view.setLayoutParams(layoutParamsParams);
    }

    private void connectView(View view, int i2, int i3, int i4, int i5) {
        ConstraintLayout.LayoutParams layoutParamsParams = params(view);
        int[] iArr = this.mBoxViewIds;
        layoutParamsParams.leftToLeft = iArr[i3];
        layoutParamsParams.topToTop = iArr[i2];
        layoutParamsParams.rightToRight = iArr[(i3 + i5) - 1];
        layoutParamsParams.bottomToBottom = iArr[(i2 + i4) - 1];
        view.setLayoutParams(layoutParamsParams);
    }

    private boolean generateGrid(boolean z) {
        if (this.mContainer == null || this.mRows <= 0 || this.mColumns <= 0) {
            return false;
        }
        if (z) {
            for (int i2 = 0; i2 < this.mPositionMatrix.length; i2++) {
                int i3 = 0;
                while (true) {
                    boolean[][] zArr = this.mPositionMatrix;
                    if (i3 < zArr[0].length) {
                        zArr[i2][i3] = true;
                        i3++;
                    }
                }
            }
            this.mSpanIds.clear();
        }
        this.mNextAvailableIndex = 0;
        buildBoxes();
        String str = this.mStrSkips;
        boolean zHandleSkips = (str == null || str.trim().isEmpty()) ? true : handleSkips(parseSpans(this.mStrSkips));
        String str2 = this.mStrSpans;
        if (str2 != null && !str2.trim().isEmpty()) {
            zHandleSkips &= handleSpans(this.mIds, parseSpans(this.mStrSpans));
        }
        return (zHandleSkips && arrangeWidgets()) || !this.mValidateInputs;
    }

    private int getColByIndex(int i2) {
        return this.mOrientation == 1 ? i2 / this.mRows : i2 % this.mColumns;
    }

    private int getNextPosition() {
        boolean z = false;
        int i2 = 0;
        while (!z) {
            i2 = this.mNextAvailableIndex;
            if (i2 >= this.mRows * this.mColumns) {
                return -1;
            }
            int rowByIndex = getRowByIndex(i2);
            int colByIndex = getColByIndex(this.mNextAvailableIndex);
            boolean[] zArr = this.mPositionMatrix[rowByIndex];
            if (zArr[colByIndex]) {
                zArr[colByIndex] = false;
                z = true;
            }
            this.mNextAvailableIndex++;
        }
        return i2;
    }

    private int getRowByIndex(int i2) {
        return this.mOrientation == 1 ? i2 % this.mRows : i2 / this.mColumns;
    }

    private boolean handleSkips(int[][] iArr) {
        for (int i2 = 0; i2 < iArr.length; i2++) {
            int rowByIndex = getRowByIndex(iArr[i2][0]);
            int colByIndex = getColByIndex(iArr[i2][0]);
            int[] iArr2 = iArr[i2];
            if (!invalidatePositions(rowByIndex, colByIndex, iArr2[1], iArr2[2])) {
                return false;
            }
        }
        return true;
    }

    private boolean handleSpans(int[] iArr, int[][] iArr2) {
        View[] views = getViews(this.mContainer);
        int i2 = 0;
        while (i2 < iArr2.length) {
            int rowByIndex = this.getRowByIndex(iArr2[i2][0]);
            int colByIndex = this.getColByIndex(iArr2[i2][0]);
            int[] iArr3 = iArr2[i2];
            if (!this.invalidatePositions(rowByIndex, colByIndex, iArr3[1], iArr3[2])) {
                return false;
            }
            View view = views[i2];
            int[] iArr4 = iArr2[i2];
            int i3 = iArr4[1];
            int i4 = iArr4[2];
            Grid grid = this;
            grid.connectView(view, rowByIndex, colByIndex, i3, i4);
            grid.mSpanIds.add(Integer.valueOf(iArr[i2]));
            i2++;
            this = grid;
        }
        return true;
    }

    private void initVariables() {
        boolean[][] zArr = (boolean[][]) Array.newInstance((Class<?>) Boolean.TYPE, this.mRows, this.mColumns);
        this.mPositionMatrix = zArr;
        for (boolean[] zArr2 : zArr) {
            Arrays.fill(zArr2, true);
        }
    }

    private boolean invalidatePositions(int i2, int i3, int i4, int i5) {
        for (int i6 = i2; i6 < i2 + i4; i6++) {
            for (int i7 = i3; i7 < i3 + i5; i7++) {
                boolean[][] zArr = this.mPositionMatrix;
                if (i6 < zArr.length && i7 < zArr[0].length) {
                    boolean[] zArr2 = zArr[i6];
                    if (zArr2[i7]) {
                        zArr2[i7] = false;
                    }
                }
                return false;
            }
        }
        return true;
    }

    private boolean isSpansValid(CharSequence charSequence) {
        return true;
    }

    private boolean isWeightsValid(String str) {
        return true;
    }

    private View makeNewView() {
        View view = new View(getContext());
        view.setId(View.generateViewId());
        view.setVisibility(4);
        this.mContainer.addView(view, new ConstraintLayout.LayoutParams(0, 0));
        return view;
    }

    private ConstraintLayout.LayoutParams params(View view) {
        return (ConstraintLayout.LayoutParams) view.getLayoutParams();
    }

    private int[][] parseSpans(String str) {
        String[] strArrSplit = str.split(",");
        int[][] iArr = (int[][]) Array.newInstance((Class<?>) Integer.TYPE, strArrSplit.length, 3);
        for (int i2 = 0; i2 < strArrSplit.length; i2++) {
            String[] strArrSplit2 = strArrSplit[i2].trim().split(":");
            String[] strArrSplit3 = strArrSplit2[1].split("x");
            iArr[i2][0] = Integer.parseInt(strArrSplit2[0]);
            iArr[i2][1] = Integer.parseInt(strArrSplit3[0]);
            iArr[i2][2] = Integer.parseInt(strArrSplit3[1]);
        }
        return iArr;
    }

    private float[] parseWeights(int i2, String str) {
        float[] fArr = null;
        if (str != null && !str.trim().isEmpty()) {
            String[] strArrSplit = str.split(",");
            if (strArrSplit.length != i2) {
                return null;
            }
            fArr = new float[i2];
            for (int i3 = 0; i3 < i2; i3++) {
                fArr[i3] = Float.parseFloat(strArrSplit[i3].trim());
            }
        }
        return fArr;
    }

    private void setBoxViewHorizontalChains() {
        int i2;
        int id = getId();
        int iMax = Math.max(this.mRows, this.mColumns);
        float[] weights = parseWeights(this.mColumns, this.mStrColumnWeights);
        int i3 = 0;
        ConstraintLayout.LayoutParams layoutParamsParams = params(this.mBoxViews[0]);
        if (this.mColumns == 1) {
            clearHParams(this.mBoxViews[0]);
            layoutParamsParams.leftToLeft = id;
            layoutParamsParams.rightToRight = id;
            this.mBoxViews[0].setLayoutParams(layoutParamsParams);
            return;
        }
        while (true) {
            i2 = this.mColumns;
            if (i3 >= i2) {
                break;
            }
            ConstraintLayout.LayoutParams layoutParamsParams2 = params(this.mBoxViews[i3]);
            clearHParams(this.mBoxViews[i3]);
            if (weights != null) {
                layoutParamsParams2.horizontalWeight = weights[i3];
            }
            if (i3 > 0) {
                layoutParamsParams2.leftToRight = this.mBoxViewIds[i3 - 1];
            } else {
                layoutParamsParams2.leftToLeft = id;
            }
            if (i3 < this.mColumns - 1) {
                layoutParamsParams2.rightToLeft = this.mBoxViewIds[i3 + 1];
            } else {
                layoutParamsParams2.rightToRight = id;
            }
            if (i3 > 0) {
                layoutParamsParams2.leftMargin = (int) this.mHorizontalGaps;
            }
            this.mBoxViews[i3].setLayoutParams(layoutParamsParams2);
            i3++;
        }
        while (i2 < iMax) {
            ConstraintLayout.LayoutParams layoutParamsParams3 = params(this.mBoxViews[i2]);
            clearHParams(this.mBoxViews[i2]);
            layoutParamsParams3.leftToLeft = id;
            layoutParamsParams3.rightToRight = id;
            this.mBoxViews[i2].setLayoutParams(layoutParamsParams3);
            i2++;
        }
    }

    private void setBoxViewVerticalChains() {
        int i2;
        int id = getId();
        int iMax = Math.max(this.mRows, this.mColumns);
        float[] weights = parseWeights(this.mRows, this.mStrRowWeights);
        int i3 = 0;
        if (this.mRows == 1) {
            ConstraintLayout.LayoutParams layoutParamsParams = params(this.mBoxViews[0]);
            clearVParams(this.mBoxViews[0]);
            layoutParamsParams.topToTop = id;
            layoutParamsParams.bottomToBottom = id;
            this.mBoxViews[0].setLayoutParams(layoutParamsParams);
            return;
        }
        while (true) {
            i2 = this.mRows;
            if (i3 >= i2) {
                break;
            }
            ConstraintLayout.LayoutParams layoutParamsParams2 = params(this.mBoxViews[i3]);
            clearVParams(this.mBoxViews[i3]);
            if (weights != null) {
                layoutParamsParams2.verticalWeight = weights[i3];
            }
            if (i3 > 0) {
                layoutParamsParams2.topToBottom = this.mBoxViewIds[i3 - 1];
            } else {
                layoutParamsParams2.topToTop = id;
            }
            if (i3 < this.mRows - 1) {
                layoutParamsParams2.bottomToTop = this.mBoxViewIds[i3 + 1];
            } else {
                layoutParamsParams2.bottomToBottom = id;
            }
            if (i3 > 0) {
                layoutParamsParams2.topMargin = (int) this.mHorizontalGaps;
            }
            this.mBoxViews[i3].setLayoutParams(layoutParamsParams2);
            i3++;
        }
        while (i2 < iMax) {
            ConstraintLayout.LayoutParams layoutParamsParams3 = params(this.mBoxViews[i2]);
            clearVParams(this.mBoxViews[i2]);
            layoutParamsParams3.topToTop = id;
            layoutParamsParams3.bottomToBottom = id;
            this.mBoxViews[i2].setLayoutParams(layoutParamsParams3);
            i2++;
        }
    }

    private void updateActualRowsAndColumns() {
        int i2;
        int i3 = this.mRowsSet;
        if (i3 != 0 && (i2 = this.mColumnsSet) != 0) {
            this.mRows = i3;
            this.mColumns = i2;
            return;
        }
        int i4 = this.mColumnsSet;
        if (i4 > 0) {
            this.mColumns = i4;
            this.mRows = ((this.mCount + i4) - 1) / i4;
        } else if (i3 > 0) {
            this.mRows = i3;
            this.mColumns = ((this.mCount + i3) - 1) / i3;
        } else {
            int iSqrt = (int) (Math.sqrt(this.mCount) + 1.5d);
            this.mRows = iSqrt;
            this.mColumns = ((this.mCount + iSqrt) - 1) / iSqrt;
        }
    }

    public String getColumnWeights() {
        return this.mStrColumnWeights;
    }

    public int getColumns() {
        return this.mColumnsSet;
    }

    public float getHorizontalGaps() {
        return this.mHorizontalGaps;
    }

    public int getOrientation() {
        return this.mOrientation;
    }

    public String getRowWeights() {
        return this.mStrRowWeights;
    }

    public int getRows() {
        return this.mRowsSet;
    }

    public String getSkips() {
        return this.mStrSkips;
    }

    public String getSpans() {
        return this.mStrSpans;
    }

    public float getVerticalGaps() {
        return this.mVerticalGaps;
    }

    @Override // androidx.constraintlayout.widget.VirtualLayout, androidx.constraintlayout.widget.ConstraintHelper
    protected void init(AttributeSet attributeSet) {
        super.init(attributeSet);
        this.mUseViewMeasure = true;
        if (attributeSet != null) {
            TypedArray typedArrayObtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, R.styleable.Grid);
            int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
            for (int i2 = 0; i2 < indexCount; i2++) {
                int index = typedArrayObtainStyledAttributes.getIndex(i2);
                if (index == 5) {
                    this.mRowsSet = typedArrayObtainStyledAttributes.getInteger(5, 0);
                } else if (index == 1) {
                    this.mColumnsSet = typedArrayObtainStyledAttributes.getInteger(1, 0);
                } else if (index == 7) {
                    this.mStrSpans = typedArrayObtainStyledAttributes.getString(7);
                } else if (index == 6) {
                    this.mStrSkips = typedArrayObtainStyledAttributes.getString(6);
                } else if (index == 4) {
                    this.mStrRowWeights = typedArrayObtainStyledAttributes.getString(4);
                } else if (index == R.styleable.Grid_grid_columnWeights) {
                    this.mStrColumnWeights = typedArrayObtainStyledAttributes.getString(index);
                } else if (index == 3) {
                    this.mOrientation = typedArrayObtainStyledAttributes.getInt(3, 0);
                } else if (index == 2) {
                    this.mHorizontalGaps = typedArrayObtainStyledAttributes.getDimension(2, 0.0f);
                } else if (index == 10) {
                    this.mVerticalGaps = typedArrayObtainStyledAttributes.getDimension(10, 0.0f);
                } else if (index == 9) {
                    this.mValidateInputs = typedArrayObtainStyledAttributes.getBoolean(9, false);
                } else if (index == 8) {
                    this.mUseRtl = typedArrayObtainStyledAttributes.getBoolean(8, false);
                }
            }
            updateActualRowsAndColumns();
            initVariables();
            typedArrayObtainStyledAttributes.recycle();
        }
    }

    @Override // androidx.constraintlayout.widget.VirtualLayout, androidx.constraintlayout.widget.ConstraintHelper, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.mContainer = (ConstraintLayout) getParent();
        generateGrid(false);
    }

    @Override // androidx.constraintlayout.widget.ConstraintHelper, android.view.View
    public void onDraw(Canvas canvas) {
        if (isInEditMode()) {
            Paint paint = new Paint();
            paint.setColor(SupportMenu.CATEGORY_MASK);
            paint.setStyle(Paint.Style.STROKE);
            int top = getTop();
            int left = getLeft();
            int bottom = getBottom();
            int right = getRight();
            View[] viewArr = this.mBoxViews;
            int length = viewArr.length;
            int i2 = 0;
            while (i2 < length) {
                View view = viewArr[i2];
                int left2 = view.getLeft() - left;
                int top2 = view.getTop() - top;
                int right2 = view.getRight() - left;
                int bottom2 = view.getBottom() - top;
                Canvas canvas2 = canvas;
                canvas2.drawRect(left2, 0.0f, right2, bottom - top, paint);
                canvas2.drawRect(0.0f, top2, right - left, bottom2, paint);
                i2++;
                canvas = canvas2;
            }
        }
    }

    public void setColumnWeights(String str) {
        String str2 = this.mStrColumnWeights;
        if (str2 == null || !str2.equals(str)) {
            this.mStrColumnWeights = str;
            generateGrid(true);
            invalidate();
        }
    }

    public void setColumns(int i2) {
        if (i2 <= 50 && this.mColumnsSet != i2) {
            this.mColumnsSet = i2;
            updateActualRowsAndColumns();
            initVariables();
            generateGrid(false);
            invalidate();
        }
    }

    public void setHorizontalGaps(float f2) {
        if (f2 >= 0.0f && this.mHorizontalGaps != f2) {
            this.mHorizontalGaps = f2;
            generateGrid(true);
            invalidate();
        }
    }

    public void setOrientation(int i2) {
        if (i2 != 0) {
            if (i2 != 1) {
                return;
            } else {
                i2 = 1;
            }
        }
        if (this.mOrientation == i2) {
            return;
        }
        this.mOrientation = i2;
        generateGrid(true);
        invalidate();
    }

    public void setRowWeights(String str) {
        String str2 = this.mStrRowWeights;
        if (str2 == null || !str2.equals(str)) {
            this.mStrRowWeights = str;
            generateGrid(true);
            invalidate();
        }
    }

    public void setRows(int i2) {
        if (i2 <= 50 && this.mRowsSet != i2) {
            this.mRowsSet = i2;
            updateActualRowsAndColumns();
            initVariables();
            generateGrid(false);
            invalidate();
        }
    }

    public void setSkips(String str) {
        String str2 = this.mStrSkips;
        if (str2 == null || !str2.equals(str)) {
            this.mStrSkips = str;
            generateGrid(true);
            invalidate();
        }
    }

    public void setSpans(CharSequence charSequence) {
        String str = this.mStrSpans;
        if (str == null || !str.contentEquals(charSequence)) {
            this.mStrSpans = charSequence.toString();
            generateGrid(true);
            invalidate();
        }
    }

    public void setVerticalGaps(float f2) {
        if (f2 >= 0.0f && this.mVerticalGaps != f2) {
            this.mVerticalGaps = f2;
            generateGrid(true);
            invalidate();
        }
    }

    public Grid(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.mMaxRows = 50;
        this.mMaxColumns = 50;
        this.mNextAvailableIndex = 0;
        this.mSpanIds = new HashSet();
    }

    public Grid(Context context, AttributeSet attributeSet, int i2) {
        super(context, attributeSet, i2);
        this.mMaxRows = 50;
        this.mMaxColumns = 50;
        this.mNextAvailableIndex = 0;
        this.mSpanIds = new HashSet();
    }
}
