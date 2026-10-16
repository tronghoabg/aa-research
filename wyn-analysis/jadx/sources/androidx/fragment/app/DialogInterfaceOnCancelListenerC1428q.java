package androidx.fragment.app;

import android.app.Dialog;
import android.content.DialogInterface;

/* renamed from: androidx.fragment.app.q, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class DialogInterfaceOnCancelListenerC1428q implements DialogInterface.OnCancelListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ DialogInterfaceOnCancelListenerC1430t f18523a;

    public DialogInterfaceOnCancelListenerC1428q(DialogInterfaceOnCancelListenerC1430t dialogInterfaceOnCancelListenerC1430t) {
        this.f18523a = dialogInterfaceOnCancelListenerC1430t;
    }

    @Override // android.content.DialogInterface.OnCancelListener
    public final void onCancel(DialogInterface dialogInterface) {
        DialogInterfaceOnCancelListenerC1430t dialogInterfaceOnCancelListenerC1430t = this.f18523a;
        Dialog dialog = dialogInterfaceOnCancelListenerC1430t.f18544j;
        if (dialog != null) {
            dialogInterfaceOnCancelListenerC1430t.onCancel(dialog);
        }
    }
}
