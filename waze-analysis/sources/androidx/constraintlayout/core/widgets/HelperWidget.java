package androidx.constraintlayout.core.widgets;

import androidx.constraintlayout.core.widgets.analyzer.Grouping;
import androidx.constraintlayout.core.widgets.analyzer.WidgetGroup;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

/* compiled from: WazeSource */
/* loaded from: classes3.dex */
public class HelperWidget extends ConstraintWidget implements Helper {
    public ConstraintWidget[] mWidgets = new ConstraintWidget[4];
    public int mWidgetsCount = 0;

    @Override // androidx.constraintlayout.core.widgets.Helper
    public void add(ConstraintWidget constraintWidget) {
        if (constraintWidget == this || constraintWidget == null) {
            return;
        }
        int i2 = this.mWidgetsCount + 1;
        ConstraintWidget[] constraintWidgetArr = this.mWidgets;
        int length = constraintWidgetArr.length;
        if (i2 > length) {
            constraintWidgetArr = (ConstraintWidget[]) Arrays.copyOf(constraintWidgetArr, length + length);
            this.mWidgets = constraintWidgetArr;
        }
        int i3 = this.mWidgetsCount;
        constraintWidgetArr[i3] = constraintWidget;
        this.mWidgetsCount = i3 + 1;
    }

    public void addDependents(ArrayList<WidgetGroup> arrayList, int i2, WidgetGroup widgetGroup) {
        for (int i3 = 0; i3 < this.mWidgetsCount; i3++) {
            widgetGroup.add(this.mWidgets[i3]);
        }
        for (int i4 = 0; i4 < this.mWidgetsCount; i4++) {
            Grouping.findDependents(this.mWidgets[i4], i2, arrayList, widgetGroup);
        }
    }

    @Override // androidx.constraintlayout.core.widgets.ConstraintWidget
    public void copy(ConstraintWidget constraintWidget, HashMap<ConstraintWidget, ConstraintWidget> map) {
        super.copy(constraintWidget, map);
        HelperWidget helperWidget = (HelperWidget) constraintWidget;
        this.mWidgetsCount = 0;
        int i2 = helperWidget.mWidgetsCount;
        for (int i3 = 0; i3 < i2; i3++) {
            add(map.get(helperWidget.mWidgets[i3]));
        }
    }

    public int findGroupInDependents(int i2) {
        int i3;
        for (int i4 = 0; i4 < this.mWidgetsCount; i4++) {
            ConstraintWidget constraintWidget = this.mWidgets[i4];
            if (i2 == 0) {
                int i5 = constraintWidget.horizontalGroup;
                if (i5 != -1) {
                    return i5;
                }
            } else if (i2 == 1 && (i3 = constraintWidget.verticalGroup) != -1) {
                return i3;
            }
        }
        return -1;
    }

    @Override // androidx.constraintlayout.core.widgets.Helper
    public void removeAllIds() {
        this.mWidgetsCount = 0;
        Arrays.fill(this.mWidgets, (Object) null);
    }

    @Override // androidx.constraintlayout.core.widgets.Helper
    public void updateConstraints(ConstraintWidgetContainer constraintWidgetContainer) {
    }
}
