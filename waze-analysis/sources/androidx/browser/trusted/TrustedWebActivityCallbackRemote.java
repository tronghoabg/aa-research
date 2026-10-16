package androidx.browser.trusted;

import android.os.Bundle;
import android.os.IBinder;
import android.support.a.a.b;
import android.support.a.a.c;

/* compiled from: WazeSource */
/* loaded from: classes2.dex */
public class TrustedWebActivityCallbackRemote {
    private final c mCallbackBinder;

    private TrustedWebActivityCallbackRemote(c cVar) {
        this.mCallbackBinder = cVar;
    }

    static TrustedWebActivityCallbackRemote fromBinder(IBinder iBinder) {
        c cVarAsInterface = iBinder == null ? null : b.asInterface(iBinder);
        if (cVarAsInterface == null) {
            return null;
        }
        return new TrustedWebActivityCallbackRemote(cVarAsInterface);
    }

    public void runExtraCallback(String str, Bundle bundle) {
        this.mCallbackBinder.onExtraCallback(str, bundle);
    }
}
