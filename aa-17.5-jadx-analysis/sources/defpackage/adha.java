package defpackage;

import android.content.Context;
import com.google.android.libraries.handwriting.networkrecognizer.CloudRecognizerProtocolStrings;

/* loaded from: classes3.dex */
public final class adha implements adgz {
    private static final wcj a;
    private static final wcj b;

    static {
        rju rjuVar = adgr.b;
        a = rjuVar.t("3", CloudRecognizerProtocolStrings.CLIENT_SOURCE_VALUE);
        b = rjuVar.t("45403852", "1.13.531108431");
    }

    @Override // defpackage.adgz
    public final String a(Context context) {
        return (String) a.gv(context);
    }

    @Override // defpackage.adgz
    public final String b(Context context) {
        return (String) b.gv(context);
    }
}
