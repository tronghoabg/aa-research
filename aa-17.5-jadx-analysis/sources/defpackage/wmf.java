package defpackage;

import android.app.Dialog;
import android.os.Bundle;

/* loaded from: classes.dex */
public class wmf extends fh {
    @Override // defpackage.ao
    public final void c() {
        Dialog dialog = this.e;
        if (dialog instanceof wme) {
            boolean z = ((wme) dialog).a().v;
        }
        super.g(false, false);
    }

    @Override // defpackage.fh, defpackage.ao
    public Dialog gn(Bundle bundle) {
        return new wme(getContext(), this.b);
    }
}
