package androidx.fragment.app;

import android.app.Dialog;
import android.content.DialogInterface;

/* loaded from: classes.dex */
public final class r implements DialogInterface.OnDismissListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ DialogInterfaceOnCancelListenerC1430t f18526a;

    public r(DialogInterfaceOnCancelListenerC1430t dialogInterfaceOnCancelListenerC1430t) {
        this.f18526a = dialogInterfaceOnCancelListenerC1430t;
    }

    @Override // android.content.DialogInterface.OnDismissListener
    public final void onDismiss(DialogInterface dialogInterface) {
        DialogInterfaceOnCancelListenerC1430t dialogInterfaceOnCancelListenerC1430t = this.f18526a;
        Dialog dialog = dialogInterfaceOnCancelListenerC1430t.f18544j;
        if (dialog != null) {
            dialogInterfaceOnCancelListenerC1430t.onDismiss(dialog);
        }
    }
}
