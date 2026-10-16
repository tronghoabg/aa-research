package androidx.constraintlayout.compose;

import androidx.car.app.CarContext;
import androidx.compose.ui.layout.LayoutIdKt;
import androidx.compose.ui.layout.Measurable;
import androidx.compose.ui.semantics.SemanticsPropertyKey;
import androidx.compose.ui.semantics.SemanticsPropertyReceiver;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import androidx.constraintlayout.core.widgets.ConstraintAnchor;
import androidx.constraintlayout.core.widgets.ConstraintWidget;
import androidx.constraintlayout.core.widgets.ConstraintWidgetContainer;
import androidx.constraintlayout.core.widgets.HelperWidget;
import androidx.media3.extractor.text.ttml.TtmlNode;
import androidx.savedstate.serialization.ClassDiscriminatorModeKt;
import h.a.i;
import h.g.a.p;
import h.g.b.ad;
import h.g.b.o;
import h.g.b.x;
import h.l.r;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: WazeSource */
/* loaded from: classes3.dex */
public final class ToolingUtilsKt {
    private static final int BOUNDS = 1;
    private static final int CONSTRAINTS = 0;
    private static final int CONSTRAINTS_JSON_VERSION = 1;
    static final /* synthetic */ r<Object>[] $$delegatedProperties = {new ad(ToolingUtilsKt.class, "designInfoProvider", "getDesignInfoProvider(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)Landroidx/constraintlayout/compose/DesignInfoProvider;", 1)};
    private static final SemanticsPropertyKey<DesignInfoProvider> DesignInfoDataKey = new SemanticsPropertyKey<>("DesignInfoProvider", (p) null, 2, (o) null);

    private static final void addReferencesIds(HelperWidget helperWidget, List<String> list, ConstraintWidgetContainer constraintWidgetContainer, String str) {
        int i2 = helperWidget.mWidgetsCount;
        for (int i3 = 0; i3 < i2; i3++) {
            ConstraintWidget constraintWidget = helperWidget.mWidgets[i3];
            list.add(x.n(constraintWidget, constraintWidgetContainer) ? str : getRefId(constraintWidget));
        }
    }

    private static final JSONObject boundsToJson(ConstraintWidget constraintWidget, int i2, int i3) {
        return new JSONObject().put(TtmlNode.LEFT, constraintWidget.getLeft() + i2).put("top", constraintWidget.getTop() + i3).put(TtmlNode.RIGHT, constraintWidget.getRight() + i2).put("bottom", constraintWidget.getBottom() + i3);
    }

    private static final String createDesignInfoJson(JSONObject jSONObject) {
        return new JSONObject().put(ClassDiscriminatorModeKt.CLASS_DISCRIMINATOR_KEY, "CONSTRAINTS").put("version", 1).put("content", jSONObject).toString();
    }

    public static final SemanticsPropertyKey<DesignInfoProvider> getDesignInfoDataKey() {
        return DesignInfoDataKey;
    }

    public static final DesignInfoProvider getDesignInfoProvider(SemanticsPropertyReceiver semanticsPropertyReceiver) {
        return DesignInfoDataKey.getValue(semanticsPropertyReceiver, $$delegatedProperties[0]);
    }

    public static /* synthetic */ void getDesignInfoProvider$annotations(SemanticsPropertyReceiver semanticsPropertyReceiver) {
    }

    private static final String getHelperId(ConstraintWidget constraintWidget, State state) {
        x.d(constraintWidget, "null cannot be cast to non-null type androidx.constraintlayout.core.widgets.HelperWidget");
        return String.valueOf(state.getKeyId$constraintlayout_compose((HelperWidget) constraintWidget));
    }

    private static final String getRefId(ConstraintWidget constraintWidget) {
        Object layoutId;
        String string;
        Object companionWidget = constraintWidget != null ? constraintWidget.getCompanionWidget() : null;
        Measurable measurable = companionWidget instanceof Measurable ? (Measurable) companionWidget : null;
        if (measurable == null || (layoutId = LayoutIdKt.getLayoutId(measurable)) == null || (string = layoutId.toString()) == null) {
            return String.valueOf(constraintWidget != null ? constraintWidget.stringId : null);
        }
        return string;
    }

    public static final String parseConstraintsToJson(ConstraintWidgetContainer constraintWidgetContainer, State state, int i2, int i3, String str) throws JSONException {
        boolean z;
        boolean z2;
        int i4;
        int i5;
        String str2;
        ConstraintWidgetContainer constraintWidgetContainer2 = constraintWidgetContainer;
        String strValueOf = String.valueOf(androidx.constraintlayout.core.state.State.PARENT);
        JSONObject jSONObject = new JSONObject();
        Integer numF = h.n.o.f(str);
        if (numF != null) {
            int iIntValue = numF.intValue();
            boolean z3 = (iIntValue >> 1) == 1;
            if (iIntValue == 1) {
                z = true;
                z2 = z3;
            } else {
                z2 = z3;
                z = false;
            }
        } else {
            z = true;
            z2 = true;
        }
        ArrayList<ConstraintWidget> children = constraintWidgetContainer2.getChildren();
        int size = children.size();
        int i6 = 0;
        while (i6 < size) {
            ConstraintWidget constraintWidget = children.get(i6);
            boolean z4 = z2;
            JSONArray jSONArray = new JSONArray();
            ArrayList arrayList = new ArrayList();
            boolean z5 = constraintWidget instanceof HelperWidget;
            int i7 = i6;
            String str3 = constraintWidget.stringId;
            if (z5) {
                x.d(constraintWidget, "null cannot be cast to non-null type androidx.constraintlayout.core.widgets.HelperWidget");
                addReferencesIds((HelperWidget) constraintWidget, arrayList, constraintWidgetContainer2, strValueOf);
            }
            ArrayList<ConstraintAnchor> anchors = constraintWidget.getAnchors();
            ArrayList<ConstraintWidget> arrayList2 = children;
            int size2 = anchors.size();
            JSONObject jSONObject2 = jSONObject;
            int i8 = 0;
            while (i8 < size2) {
                ConstraintAnchor constraintAnchor = anchors.get(i8);
                if (constraintAnchor.isConnected()) {
                    i4 = size2;
                    ConstraintWidget owner = constraintAnchor.getTarget().getOwner();
                    String helperId = x.n(constraintWidgetContainer2, owner) ? strValueOf : owner instanceof HelperWidget ? getHelperId(owner, state) : getRefId(owner);
                    i5 = i8;
                    str2 = strValueOf;
                    JSONObject jSONObjectPut = new JSONObject().put("originAnchor", constraintAnchor.getType());
                    ConstraintAnchor target = constraintAnchor.getTarget();
                    x.c(target);
                    jSONArray.put(jSONObjectPut.put("targetAnchor", target.getType()).put(TypedValues.AttributesType.S_TARGET, helperId).put("margin", constraintAnchor.getMargin()));
                } else {
                    i4 = size2;
                    i5 = i8;
                    str2 = strValueOf;
                }
                i8 = i5 + 1;
                constraintWidgetContainer2 = constraintWidgetContainer;
                size2 = i4;
                strValueOf = str2;
            }
            boolean z6 = z;
            putViewIdToBoundsAndConstraints(jSONObject2, str3, boundsToJson(constraintWidget, i2, i3), z5, false, arrayList, jSONArray, z6, z4);
            i6 = i7 + 1;
            size = size;
            z = z6;
            z2 = z4;
            children = arrayList2;
            jSONObject = jSONObject2;
            constraintWidgetContainer2 = constraintWidgetContainer;
        }
        putViewIdToBoundsAndConstraints(jSONObject, strValueOf, boundsToJson(constraintWidgetContainer, i2, i3), false, true, i.h(), new JSONArray(), z, z2);
        return createDesignInfoJson(jSONObject);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void putViewIdToBoundsAndConstraints(JSONObject jSONObject, String str, JSONObject jSONObject2, boolean z, boolean z2, List<String> list, JSONArray jSONArray, boolean z3, boolean z4) throws JSONException {
        JSONObject jSONObject3 = new JSONObject();
        jSONObject3.put("viewId", str);
        if (z4) {
            jSONObject3.put("box", jSONObject2);
        }
        jSONObject3.put("isHelper", z);
        jSONObject3.put("isRoot", z2);
        JSONArray jSONArray2 = new JSONArray();
        int size = list.size();
        for (int i2 = 0; i2 < size; i2++) {
            jSONArray2.put(list.get(i2));
        }
        jSONObject3.put("helperReferences", jSONArray2);
        if (z3) {
            jSONObject3.put(CarContext.CONSTRAINT_SERVICE, jSONArray);
        }
        jSONObject.put(str, jSONObject3);
    }

    public static final void setDesignInfoProvider(SemanticsPropertyReceiver semanticsPropertyReceiver, DesignInfoProvider designInfoProvider) {
        DesignInfoDataKey.setValue(semanticsPropertyReceiver, $$delegatedProperties[0], designInfoProvider);
    }
}
