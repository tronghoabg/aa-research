package defpackage;

import android.app.Dialog;
import android.content.DialogInterface;

/* loaded from: classes.dex */
final class ak implements DialogInterface.OnCancelListener {
    final /* synthetic */ ao a;

    public ak(ao aoVar) {
        this.a = aoVar;
    }

    @Override // android.content.DialogInterface.OnCancelListener
    public final void onCancel(DialogInterface dialogInterface) {
        ao aoVar = this.a;
        Dialog dialog = aoVar.e;
        if (dialog != null) {
            aoVar.onCancel(dialog);
        }
    }
}
