package defpackage;

import android.app.Dialog;
import android.os.Bundle;

/* loaded from: classes.dex */
public class fh extends ao {
    @Override // defpackage.ao
    public final void d(Dialog dialog, int i) {
        if (!(dialog instanceof fg)) {
            super.d(dialog, i);
            return;
        }
        fg fgVar = (fg) dialog;
        if (i != 1 && i != 2) {
            if (i != 3) {
                return;
            } else {
                dialog.getWindow().addFlags(24);
            }
        }
        fgVar.e();
    }

    @Override // defpackage.ao
    public Dialog gn(Bundle bundle) {
        return new fg(getContext(), this.b);
    }
}
