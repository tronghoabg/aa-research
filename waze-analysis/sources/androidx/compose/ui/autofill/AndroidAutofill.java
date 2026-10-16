package androidx.compose.ui.autofill;

import android.support.v4.app.j$$ExternalSyntheticApiModelOutline1;
import android.view.View;
import android.view.autofill.AutofillId;
import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.internal.InlineClassHelperKt;
import androidx.compose.ui.platform.coreshims.ViewCompatShims;
import h.e;

/* compiled from: WazeSource */
/* loaded from: classes.dex */
public final class AndroidAutofill implements Autofill {
    public static final int $stable = 8;
    private android.view.autofill.AutofillManager _autofillManager;
    private final AutofillTree autofillTree;
    private AutofillId rootAutofillId;
    private final View view;

    public AndroidAutofill(View view, AutofillTree autofillTree) {
        this.view = view;
        this.autofillTree = autofillTree;
        view.setImportantForAutofill(1);
        AutofillId autofillId = ViewCompatShims.getAutofillId(view).toAutofillId();
        if (autofillId != null) {
            this.rootAutofillId = autofillId;
        } else {
            InlineClassHelperKt.throwIllegalStateExceptionForNullCheck("Required value was null.");
            throw new e();
        }
    }

    @Override // androidx.compose.ui.autofill.Autofill
    public void cancelAutofillForNode(AutofillNode autofillNode) {
        getAutofillManager().notifyViewExited(this.view, autofillNode.getId());
    }

    public final android.view.autofill.AutofillManager getAutofillManager() {
        android.view.autofill.AutofillManager autofillManager = this._autofillManager;
        if (autofillManager != null) {
            return autofillManager;
        }
        android.view.autofill.AutofillManager autofillManagerM63m = j$$ExternalSyntheticApiModelOutline1.m63m(this.view.getContext().getSystemService(j$$ExternalSyntheticApiModelOutline1.m81m$2()));
        if (autofillManagerM63m == null) {
            throw new IllegalStateException("Could not locate AutofillManager from context");
        }
        this._autofillManager = autofillManagerM63m;
        return autofillManagerM63m;
    }

    public final AutofillTree getAutofillTree() {
        return this.autofillTree;
    }

    public final AutofillId getRootAutofillId() {
        return this.rootAutofillId;
    }

    public final View getView() {
        return this.view;
    }

    @Override // androidx.compose.ui.autofill.Autofill
    public void requestAutofillForNode(AutofillNode autofillNode) {
        Rect boundingBox = autofillNode.getBoundingBox();
        if (boundingBox == null) {
            throw new IllegalStateException("requestAutofill called before onChildPositioned()");
        }
        getAutofillManager().notifyViewEntered(this.view, autofillNode.getId(), new android.graphics.Rect(Math.round(boundingBox.getLeft()), Math.round(boundingBox.getTop()), Math.round(boundingBox.getRight()), Math.round(boundingBox.getBottom())));
    }

    public final void setRootAutofillId(AutofillId autofillId) {
        this.rootAutofillId = autofillId;
    }
}
