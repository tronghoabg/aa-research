package defpackage;

import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import com.google.errorprone.annotations.ResultIgnorabilityUnspecified;

/* loaded from: classes2.dex */
public interface rly {
    void a(vw vwVar);

    @ResultIgnorabilityUnspecified
    InputConnection onCreateInputConnection(EditorInfo editorInfo);
}
