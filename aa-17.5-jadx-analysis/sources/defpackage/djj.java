package defpackage;

import android.os.Bundle;
import android.view.inputmethod.InputConnection;
import android.view.inputmethod.InputContentInfo;

/* loaded from: classes.dex */
public class djj extends dji {
    public djj(InputConnection inputConnection, afec afecVar) {
        super(inputConnection, afecVar);
    }

    @Override // defpackage.djh, android.view.inputmethod.InputConnection
    public final boolean commitContent(InputContentInfo inputContentInfo, int i, Bundle bundle) {
        return false;
    }
}
