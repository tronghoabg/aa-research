package defpackage;

import android.content.Context;
import com.google.android.libraries.handwriting.networkrecognizer.CloudRecognizerProtocolStrings;

/* loaded from: classes3.dex */
public final class adgx implements adgw {
    private static final wcj a = adgr.b.u(CloudRecognizerProtocolStrings.CLIENT_SOURCE_VALUE, false);

    @Override // defpackage.adgw
    public final boolean a(Context context) {
        return ((Boolean) a.gv(context)).booleanValue();
    }
}
