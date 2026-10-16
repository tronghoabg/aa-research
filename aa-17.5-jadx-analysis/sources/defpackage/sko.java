package defpackage;

import android.app.AlertDialog;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;

/* loaded from: classes2.dex */
public final class sko extends ao {
    public Dialog g;
    public DialogInterface.OnCancelListener h;
    private Dialog i;

    @Override // defpackage.ao
    public final Dialog gn(Bundle bundle) {
        Dialog dialog = this.g;
        if (dialog != null) {
            return dialog;
        }
        this.d = false;
        if (this.i == null) {
            Context context = getContext();
            spu.aw(context);
            this.i = new AlertDialog.Builder(context).create();
        }
        return this.i;
    }

    @Override // defpackage.ao, android.content.DialogInterface.OnCancelListener
    public final void onCancel(DialogInterface dialogInterface) {
        DialogInterface.OnCancelListener onCancelListener = this.h;
        if (onCancelListener != null) {
            onCancelListener.onCancel(dialogInterface);
        }
    }
}
