package com.google.android.gms.common;

import android.app.AlertDialog;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import com.google.android.gms.common.api.internal.av;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
public final class ai extends android.support.v4.app.ab {

    /* renamed from: a, reason: collision with root package name */
    private Dialog f4680a;

    /* renamed from: b, reason: collision with root package name */
    private DialogInterface.OnCancelListener f4681b;

    /* renamed from: c, reason: collision with root package name */
    private Dialog f4682c;

    public static ai a(Dialog dialog, DialogInterface.OnCancelListener onCancelListener) {
        ai aiVar = new ai();
        av.n(dialog, "Cannot display null dialog");
        dialog.setOnCancelListener(null);
        dialog.setOnDismissListener(null);
        aiVar.f4680a = dialog;
        aiVar.f4681b = onCancelListener;
        return aiVar;
    }

    @Override // android.support.v4.app.ab, android.content.DialogInterface.OnCancelListener
    public final void onCancel(DialogInterface dialogInterface) {
        DialogInterface.OnCancelListener onCancelListener = this.f4681b;
        if (onCancelListener != null) {
            onCancelListener.onCancel(dialogInterface);
        }
    }

    @Override // android.support.v4.app.ab
    public final Dialog onCreateDialog(Bundle bundle) {
        Dialog dialog = this.f4680a;
        if (dialog != null) {
            return dialog;
        }
        setShowsDialog(false);
        if (this.f4682c == null) {
            Context context = getContext();
            av.m(context);
            this.f4682c = new AlertDialog.Builder(context).create();
        }
        return this.f4682c;
    }
}
