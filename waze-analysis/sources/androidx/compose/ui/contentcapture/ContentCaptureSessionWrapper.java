package androidx.compose.ui.contentcapture;

import android.view.ViewStructure;
import android.view.autofill.AutofillId;
import androidx.compose.ui.platform.coreshims.ViewStructureCompat;
import java.util.List;

/* compiled from: WazeSource */
/* loaded from: classes.dex */
public interface ContentCaptureSessionWrapper {
    void flush();

    AutofillId newAutofillId(long j2);

    ViewStructureCompat newVirtualViewStructure(AutofillId autofillId, long j2);

    void notifyViewAppeared(ViewStructure viewStructure);

    void notifyViewDisappeared(AutofillId autofillId);

    void notifyViewTextChanged(AutofillId autofillId, CharSequence charSequence);

    void notifyViewsAppeared(List<ViewStructure> list);

    void notifyViewsDisappeared(long[] jArr);
}
