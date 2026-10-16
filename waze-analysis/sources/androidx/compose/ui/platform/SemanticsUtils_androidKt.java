package androidx.compose.ui.platform;

import android.view.View;
import androidx.compose.ui.node.LayoutNode;
import androidx.compose.ui.semantics.AccessibilityAction;
import androidx.compose.ui.semantics.Role;
import androidx.compose.ui.semantics.SemanticsActions;
import androidx.compose.ui.semantics.SemanticsConfiguration;
import androidx.compose.ui.semantics.SemanticsConfigurationKt;
import androidx.compose.ui.text.TextLayoutResult;
import androidx.compose.ui.viewinterop.AndroidViewHolder;
import h.g.a.l;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* compiled from: WazeSource */
/* loaded from: classes.dex */
public final class SemanticsUtils_androidKt {
    public static final ScrollObservationScope findById(List<ScrollObservationScope> list, int i2) {
        int size = list.size();
        for (int i3 = 0; i3 < size; i3++) {
            if (list.get(i3).getSemanticsNodeId() == i2) {
                return list.get(i3);
            }
        }
        return null;
    }

    public static final Float getScrollViewportLength(SemanticsConfiguration semanticsConfiguration) {
        l lVar;
        ArrayList arrayList = new ArrayList();
        AccessibilityAction accessibilityAction = (AccessibilityAction) SemanticsConfigurationKt.getOrNull(semanticsConfiguration, SemanticsActions.INSTANCE.getGetScrollViewportLength());
        if (accessibilityAction == null || (lVar = (l) accessibilityAction.getAction()) == null || !((Boolean) lVar.invoke(arrayList)).booleanValue()) {
            return null;
        }
        return (Float) arrayList.get(0);
    }

    public static final TextLayoutResult getTextLayoutResult(SemanticsConfiguration semanticsConfiguration) {
        l lVar;
        ArrayList arrayList = new ArrayList();
        AccessibilityAction accessibilityAction = (AccessibilityAction) SemanticsConfigurationKt.getOrNull(semanticsConfiguration, SemanticsActions.INSTANCE.getGetTextLayoutResult());
        if (accessibilityAction == null || (lVar = (l) accessibilityAction.getAction()) == null || !((Boolean) lVar.invoke(arrayList)).booleanValue()) {
            return null;
        }
        return (TextLayoutResult) arrayList.get(0);
    }

    public static final View semanticsIdToView(AndroidViewsHandler androidViewsHandler, int i2) {
        Object next;
        Iterator<T> it = androidViewsHandler.getLayoutNodeToHolder().entrySet().iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            if (((LayoutNode) ((Map.Entry) next).getKey()).getSemanticsId() == i2) {
                break;
            }
        }
        Map.Entry entry = (Map.Entry) next;
        return entry != null ? (AndroidViewHolder) entry.getValue() : null;
    }

    /* renamed from: toLegacyClassName-V4PA4sw, reason: not valid java name */
    public static final String m10288toLegacyClassNameV4PA4sw(int i2) {
        if (Role.m10312equalsimpl0(i2, Role.Companion.m10316getButtono7Vup1c())) {
            return "android.widget.Button";
        }
        if (Role.m10312equalsimpl0(i2, Role.Companion.m10318getCheckboxo7Vup1c())) {
            return "android.widget.CheckBox";
        }
        if (Role.m10312equalsimpl0(i2, Role.Companion.m10321getRadioButtono7Vup1c())) {
            return "android.widget.RadioButton";
        }
        if (Role.m10312equalsimpl0(i2, Role.Companion.m10320getImageo7Vup1c())) {
            return "android.widget.ImageView";
        }
        if (Role.m10312equalsimpl0(i2, Role.Companion.m10319getDropdownListo7Vup1c())) {
            return "android.widget.Spinner";
        }
        if (Role.m10312equalsimpl0(i2, Role.Companion.m10324getValuePickero7Vup1c())) {
            return "android.widget.NumberPicker";
        }
        return null;
    }
}
