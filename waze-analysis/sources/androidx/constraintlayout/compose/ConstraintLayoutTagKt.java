package androidx.constraintlayout.compose;

import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.LayoutIdKt;
import androidx.compose.ui.layout.Measurable;
import androidx.compose.ui.platform.InspectableValueKt;

/* compiled from: WazeSource */
/* loaded from: classes3.dex */
public final class ConstraintLayoutTagKt {
    public static final Object getConstraintLayoutId(Measurable measurable) {
        Object parentData = measurable.getParentData();
        ConstraintLayoutTagParentData constraintLayoutTagParentData = parentData instanceof ConstraintLayoutTagParentData ? (ConstraintLayoutTagParentData) parentData : null;
        if (constraintLayoutTagParentData != null) {
            return constraintLayoutTagParentData.getConstraintLayoutId();
        }
        return null;
    }

    public static final Object getConstraintLayoutTag(Measurable measurable) {
        Object parentData = measurable.getParentData();
        ConstraintLayoutTagParentData constraintLayoutTagParentData = parentData instanceof ConstraintLayoutTagParentData ? (ConstraintLayoutTagParentData) parentData : null;
        if (constraintLayoutTagParentData != null) {
            return constraintLayoutTagParentData.getConstraintLayoutTag();
        }
        return null;
    }

    public static final Modifier layoutId(Modifier modifier, String str, String str2) {
        if (str2 == null) {
            return LayoutIdKt.layoutId(modifier, str);
        }
        return modifier.then(new ConstraintLayoutTag(str2, str, InspectableValueKt.isDebugInspectorInfoEnabled() ? new ConstraintLayoutTagKt$layoutId$$inlined$debugInspectorInfo$1(str) : InspectableValueKt.getNoInspectorInfo()));
    }

    public static /* synthetic */ Modifier layoutId$default(Modifier modifier, String str, String str2, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            str2 = null;
        }
        return layoutId(modifier, str, str2);
    }
}
