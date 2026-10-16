package androidx.constraintlayout.core.state.helpers;

import androidx.constraintlayout.core.state.HelperReference;
import androidx.constraintlayout.core.state.State;
import androidx.constraintlayout.core.utils.GridCore;
import androidx.constraintlayout.core.widgets.HelperWidget;

/* compiled from: WazeSource */
/* loaded from: classes3.dex */
public class GridReference extends HelperReference {
    private static final String SPANS_RESPECT_WIDGET_ORDER_STRING = "spansrespectwidgetorder";
    private static final String SUB_GRID_BY_COL_ROW_STRING = "subgridbycolrow";
    private String mColumnWeights;
    private int mColumnsSet;
    private int mFlags;
    private GridCore mGrid;
    private float mHorizontalGaps;
    private int mOrientation;
    private int mPaddingBottom;
    private int mPaddingEnd;
    private int mPaddingStart;
    private int mPaddingTop;
    private String mRowWeights;
    private int mRowsSet;
    private String mSkips;
    private String mSpans;
    private float mVerticalGaps;

    public GridReference(State state, State.Helper helper) {
        super(state, helper);
        this.mPaddingStart = 0;
        this.mPaddingEnd = 0;
        this.mPaddingTop = 0;
        this.mPaddingBottom = 0;
        if (helper == State.Helper.ROW) {
            this.mRowsSet = 1;
        } else if (helper == State.Helper.COLUMN) {
            this.mColumnsSet = 1;
        }
    }

    @Override // androidx.constraintlayout.core.state.HelperReference, androidx.constraintlayout.core.state.ConstraintReference, androidx.constraintlayout.core.state.Reference
    public void apply() {
        getHelperWidget();
        this.mGrid.setOrientation(this.mOrientation);
        int i2 = this.mRowsSet;
        if (i2 != 0) {
            this.mGrid.setRows(i2);
        }
        int i3 = this.mColumnsSet;
        if (i3 != 0) {
            this.mGrid.setColumns(i3);
        }
        float f2 = this.mHorizontalGaps;
        if (f2 != 0.0f) {
            this.mGrid.setHorizontalGaps(f2);
        }
        float f3 = this.mVerticalGaps;
        if (f3 != 0.0f) {
            this.mGrid.setVerticalGaps(f3);
        }
        String str = this.mRowWeights;
        if (str != null && !str.isEmpty()) {
            this.mGrid.setRowWeights(str);
        }
        String str2 = this.mColumnWeights;
        if (str2 != null && !str2.isEmpty()) {
            this.mGrid.setColumnWeights(str2);
        }
        String str3 = this.mSpans;
        if (str3 != null && !str3.isEmpty()) {
            this.mGrid.setSpans(str3);
        }
        String str4 = this.mSkips;
        if (str4 != null && !str4.isEmpty()) {
            this.mGrid.setSkips(str4);
        }
        this.mGrid.setFlags(this.mFlags);
        this.mGrid.setPaddingStart(this.mPaddingStart);
        this.mGrid.setPaddingEnd(this.mPaddingEnd);
        this.mGrid.setPaddingTop(this.mPaddingTop);
        this.mGrid.setPaddingBottom(this.mPaddingBottom);
        applyBase();
    }

    public String getColumnWeights() {
        return this.mColumnWeights;
    }

    public int getColumnsSet() {
        return this.mColumnsSet;
    }

    public int getFlags() {
        return this.mFlags;
    }

    @Override // androidx.constraintlayout.core.state.HelperReference
    public HelperWidget getHelperWidget() {
        GridCore gridCore = this.mGrid;
        if (gridCore != null) {
            return gridCore;
        }
        GridCore gridCore2 = new GridCore();
        this.mGrid = gridCore2;
        return gridCore2;
    }

    public float getHorizontalGaps() {
        return this.mHorizontalGaps;
    }

    public int getOrientation() {
        return this.mOrientation;
    }

    public int getPaddingBottom() {
        return this.mPaddingBottom;
    }

    public int getPaddingEnd() {
        return this.mPaddingEnd;
    }

    public int getPaddingStart() {
        return this.mPaddingStart;
    }

    public int getPaddingTop() {
        return this.mPaddingTop;
    }

    public String getRowWeights() {
        return this.mRowWeights;
    }

    public int getRowsSet() {
        return this.mRowsSet;
    }

    public String getSkips() {
        return this.mSkips;
    }

    public String getSpans() {
        return this.mSpans;
    }

    public float getVerticalGaps() {
        return this.mVerticalGaps;
    }

    public void setColumnWeights(String str) {
        this.mColumnWeights = str;
    }

    public void setColumnsSet(int i2) {
        if (super.getType() == State.Helper.ROW) {
            return;
        }
        this.mColumnsSet = i2;
    }

    public void setFlags(String str) {
        int i2;
        if (str.isEmpty()) {
            return;
        }
        String[] strArrSplit = str.split("\\|");
        this.mFlags = 0;
        for (String str2 : strArrSplit) {
            String lowerCase = str2.toLowerCase();
            int iHashCode = lowerCase.hashCode();
            if (iHashCode != -578405641) {
                if (iHashCode == 2144989229 && lowerCase.equals(SPANS_RESPECT_WIDGET_ORDER_STRING)) {
                    i2 = this.mFlags | 2;
                    this.mFlags = i2;
                }
            } else if (lowerCase.equals(SUB_GRID_BY_COL_ROW_STRING)) {
                i2 = this.mFlags | 1;
                this.mFlags = i2;
            }
        }
    }

    @Override // androidx.constraintlayout.core.state.HelperReference
    public void setHelperWidget(HelperWidget helperWidget) {
        this.mGrid = helperWidget instanceof GridCore ? (GridCore) helperWidget : null;
    }

    public void setHorizontalGaps(float f2) {
        this.mHorizontalGaps = f2;
    }

    public void setOrientation(int i2) {
        this.mOrientation = i2;
    }

    public void setPaddingBottom(int i2) {
        this.mPaddingBottom = i2;
    }

    public void setPaddingEnd(int i2) {
        this.mPaddingEnd = i2;
    }

    public void setPaddingStart(int i2) {
        this.mPaddingStart = i2;
    }

    public void setPaddingTop(int i2) {
        this.mPaddingTop = i2;
    }

    public void setRowWeights(String str) {
        this.mRowWeights = str;
    }

    public void setRowsSet(int i2) {
        if (super.getType() == State.Helper.COLUMN) {
            return;
        }
        this.mRowsSet = i2;
    }

    public void setSkips(String str) {
        this.mSkips = str;
    }

    public void setSpans(String str) {
        this.mSpans = str;
    }

    public void setVerticalGaps(float f2) {
        this.mVerticalGaps = f2;
    }

    public void setFlags(int i2) {
        this.mFlags = i2;
    }
}
