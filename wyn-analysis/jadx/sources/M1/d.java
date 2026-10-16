package m1;

import ad.L;
import android.os.Build;
import android.os.Bundle;
import android.view.inputmethod.InputConnection;
import android.view.inputmethod.InputConnectionWrapper;
import android.view.inputmethod.InputContentInfo;

/* loaded from: classes.dex */
public final class d extends InputConnectionWrapper {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.unity3d.services.core.webview.b f40303a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(InputConnection inputConnection, com.unity3d.services.core.webview.b bVar) {
        super(inputConnection, false);
        this.f40303a = bVar;
    }

    @Override // android.view.inputmethod.InputConnectionWrapper, android.view.inputmethod.InputConnection
    public final boolean commitContent(InputContentInfo inputContentInfo, int i5, Bundle bundle) {
        L l10 = null;
        if (inputContentInfo != null && Build.VERSION.SDK_INT >= 25) {
            l10 = new L(new f(inputContentInfo), 14);
        }
        if (this.f40303a.j(l10, i5, bundle)) {
            return true;
        }
        return super.commitContent(inputContentInfo, i5, bundle);
    }
}
