package androidx.core.view.autofill;

import android.view.autofill.AutofillId;
import androidx.core.util.HalfKt$$ExternalSyntheticApiModelOutline0;

/* compiled from: WazeSource */
/* loaded from: classes3.dex */
public class AutofillIdCompat {
    private final Object mWrappedObj;

    private AutofillIdCompat(AutofillId autofillId) {
        this.mWrappedObj = autofillId;
    }

    public static AutofillIdCompat toAutofillIdCompat(AutofillId autofillId) {
        return new AutofillIdCompat(autofillId);
    }

    public AutofillId toAutofillId() {
        return HalfKt$$ExternalSyntheticApiModelOutline0.m11756m(this.mWrappedObj);
    }
}
