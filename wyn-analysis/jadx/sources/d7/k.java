package d7;

import android.app.AlertDialog;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import androidx.fragment.app.DialogInterfaceOnCancelListenerC1430t;
import com.google.android.gms.common.internal.AbstractC1732v;

/* loaded from: classes3.dex */
public class k extends DialogInterfaceOnCancelListenerC1430t {

    /* renamed from: o, reason: collision with root package name */
    public AlertDialog f34139o;

    /* renamed from: p, reason: collision with root package name */
    public DialogInterface.OnCancelListener f34140p;

    /* renamed from: q, reason: collision with root package name */
    public AlertDialog f34141q;

    @Override // androidx.fragment.app.DialogInterfaceOnCancelListenerC1430t
    public final Dialog G() {
        AlertDialog alertDialog = this.f34139o;
        if (alertDialog != null) {
            return alertDialog;
        }
        this.f18540f = false;
        if (this.f34141q == null) {
            Context context = getContext();
            AbstractC1732v.i(context);
            this.f34141q = new AlertDialog.Builder(context).create();
        }
        return this.f34141q;
    }

    @Override // androidx.fragment.app.DialogInterfaceOnCancelListenerC1430t, android.content.DialogInterface.OnCancelListener
    public final void onCancel(DialogInterface dialogInterface) {
        DialogInterface.OnCancelListener onCancelListener = this.f34140p;
        if (onCancelListener != null) {
            onCancelListener.onCancel(dialogInterface);
        }
    }
}
