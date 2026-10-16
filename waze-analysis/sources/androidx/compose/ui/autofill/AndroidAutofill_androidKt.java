package androidx.compose.ui.autofill;

import android.support.v4.app.j$$ExternalSyntheticApiModelOutline1;
import android.util.Log;
import android.util.SparseArray;
import android.view.ViewStructure;
import android.view.autofill.AutofillValue;
import androidx.compose.ui.geometry.Rect;
import h.j;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* compiled from: WazeSource */
/* loaded from: classes.dex */
public final class AndroidAutofill_androidKt {
    public static final void performAutofill(AndroidAutofill androidAutofill, SparseArray<AutofillValue> sparseArray) {
        if (androidAutofill.getAutofillTree().getChildren().isEmpty()) {
            return;
        }
        int size = sparseArray.size();
        for (int i2 = 0; i2 < size; i2++) {
            int iKeyAt = sparseArray.keyAt(i2);
            AutofillValue autofillValueM64m = j$$ExternalSyntheticApiModelOutline1.m64m((Object) sparseArray.get(iKeyAt));
            if (AutofillApi26Helper.INSTANCE.isText(autofillValueM64m)) {
                androidAutofill.getAutofillTree().performAutofill(iKeyAt, AutofillApi26Helper.INSTANCE.textValue(autofillValueM64m).toString());
            } else {
                if (AutofillApi26Helper.INSTANCE.isDate(autofillValueM64m)) {
                    throw new j("An operation is not implemented: b/138604541: Add onFill() callback for date");
                }
                if (AutofillApi26Helper.INSTANCE.isList(autofillValueM64m)) {
                    throw new j("An operation is not implemented: b/138604541: Add onFill() callback for list");
                }
                if (AutofillApi26Helper.INSTANCE.isToggle(autofillValueM64m)) {
                    throw new j("An operation is not implemented: b/138604541:  Add onFill() callback for toggle");
                }
            }
        }
    }

    public static final void populateViewStructure(AndroidAutofill androidAutofill, ViewStructure viewStructure) {
        if (androidAutofill.getAutofillTree().getChildren().isEmpty()) {
            return;
        }
        int iAddChildCount = AutofillApi26Helper.INSTANCE.addChildCount(viewStructure, androidAutofill.getAutofillTree().getChildren().size());
        for (Map.Entry<Integer, AutofillNode> entry : androidAutofill.getAutofillTree().getChildren().entrySet()) {
            int iIntValue = entry.getKey().intValue();
            AutofillNode value = entry.getValue();
            ViewStructure viewStructureNewChild = AutofillApi26Helper.INSTANCE.newChild(viewStructure, iAddChildCount);
            AutofillApi26Helper.INSTANCE.setAutofillId(viewStructureNewChild, androidAutofill.getRootAutofillId(), iIntValue);
            AutofillApi26Helper.INSTANCE.setId(viewStructureNewChild, iIntValue, androidAutofill.getView().getContext().getPackageName(), null, null);
            AutofillApi26Helper.INSTANCE.setAutofillType(viewStructureNewChild, ContentDataType_androidKt.getDataType(ContentDataType.Companion.getText()));
            AutofillApi26Helper autofillApi26Helper = AutofillApi26Helper.INSTANCE;
            List<AutofillType> autofillTypes = value.getAutofillTypes();
            ArrayList arrayList = new ArrayList(autofillTypes.size());
            int size = autofillTypes.size();
            for (int i2 = 0; i2 < size; i2++) {
                arrayList.add(AndroidAutofillType_androidKt.getAndroidType(autofillTypes.get(i2)));
            }
            autofillApi26Helper.setAutofillHints(viewStructureNewChild, (String[]) arrayList.toArray(new String[0]));
            Rect boundingBox = value.getBoundingBox();
            if (boundingBox == null) {
                Log.w("Autofill Warning", "Bounding box not set.\n                        Did you call perform autofillTree before the component was positioned? ");
            } else {
                int iRound = Math.round(boundingBox.getLeft());
                int iRound2 = Math.round(boundingBox.getTop());
                int iRound3 = Math.round(boundingBox.getRight());
                AutofillApi26Helper.INSTANCE.setDimens(viewStructureNewChild, iRound, iRound2, 0, 0, iRound3 - iRound, Math.round(boundingBox.getBottom()) - iRound2);
            }
            iAddChildCount++;
        }
    }
}
