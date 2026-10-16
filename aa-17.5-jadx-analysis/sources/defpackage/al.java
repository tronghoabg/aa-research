package defpackage;

import android.app.Dialog;
import android.content.DialogInterface;

/* loaded from: classes.dex */
final class al implements DialogInterface.OnDismissListener {
    final /* synthetic */ ao a;

    public al(ao aoVar) {
        this.a = aoVar;
    }

    @Override // android.content.DialogInterface.OnDismissListener
    public final void onDismiss(DialogInterface dialogInterface) {
        ao aoVar = this.a;
        Dialog dialog = aoVar.e;
        if (dialog != null) {
            aoVar.onDismiss(dialog);
        }
    }
}
