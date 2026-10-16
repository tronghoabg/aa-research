package com.google.android.gms.common;

import android.app.Activity;
import android.app.AlertDialog;
import android.app.Dialog;
import android.app.DialogFragment;
import android.content.DialogInterface;
import android.os.Bundle;
import com.google.android.gms.common.api.internal.av;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
public final class e extends DialogFragment {

    /* renamed from: a, reason: collision with root package name */
    private Dialog f4936a;

    /* renamed from: b, reason: collision with root package name */
    private DialogInterface.OnCancelListener f4937b;

    /* renamed from: c, reason: collision with root package name */
    private Dialog f4938c;

    public static e a(Dialog dialog, DialogInterface.OnCancelListener onCancelListener) {
        e eVar = new e();
        av.n(dialog, "Cannot display null dialog");
        dialog.setOnCancelListener(null);
        dialog.setOnDismissListener(null);
        eVar.f4936a = dialog;
        eVar.f4937b = onCancelListener;
        return eVar;
    }

    @Override // android.app.DialogFragment, android.content.DialogInterface.OnCancelListener
    public final void onCancel(DialogInterface dialogInterface) {
        DialogInterface.OnCancelListener onCancelListener = this.f4937b;
        if (onCancelListener != null) {
            onCancelListener.onCancel(dialogInterface);
        }
    }

    @Override // android.app.DialogFragment
    public final Dialog onCreateDialog(Bundle bundle) {
        Dialog dialog = this.f4936a;
        if (dialog != null) {
            return dialog;
        }
        setShowsDialog(false);
        if (this.f4938c == null) {
            Activity activity = getActivity();
            av.m(activity);
            this.f4938c = new AlertDialog.Builder(activity).create();
        }
        return this.f4938c;
    }
}
