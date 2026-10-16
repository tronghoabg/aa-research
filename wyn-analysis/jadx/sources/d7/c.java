package d7;

import android.app.Activity;
import android.app.AlertDialog;
import android.app.Dialog;
import android.app.DialogFragment;
import android.content.DialogInterface;
import android.os.Bundle;
import com.google.android.gms.common.internal.AbstractC1732v;

/* loaded from: classes3.dex */
public class c extends DialogFragment {

    /* renamed from: a, reason: collision with root package name */
    public AlertDialog f34119a;

    /* renamed from: b, reason: collision with root package name */
    public DialogInterface.OnCancelListener f34120b;

    /* renamed from: c, reason: collision with root package name */
    public AlertDialog f34121c;

    @Override // android.app.DialogFragment, android.content.DialogInterface.OnCancelListener
    public final void onCancel(DialogInterface dialogInterface) {
        DialogInterface.OnCancelListener onCancelListener = this.f34120b;
        if (onCancelListener != null) {
            onCancelListener.onCancel(dialogInterface);
        }
    }

    @Override // android.app.DialogFragment
    public final Dialog onCreateDialog(Bundle bundle) {
        AlertDialog alertDialog = this.f34119a;
        if (alertDialog != null) {
            return alertDialog;
        }
        setShowsDialog(false);
        if (this.f34121c == null) {
            Activity activity = getActivity();
            AbstractC1732v.i(activity);
            this.f34121c = new AlertDialog.Builder(activity).create();
        }
        return this.f34121c;
    }
}
