package android.support.v4.app;

import android.content.DialogInterface;

/* compiled from: WazeSource */
/* loaded from: classes2.dex */
final class y implements DialogInterface.OnDismissListener {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ ab f389a;

    y(ab abVar) {
        this.f389a = abVar;
    }

    @Override // android.content.DialogInterface.OnDismissListener
    public final void onDismiss(DialogInterface dialogInterface) {
        ab abVar = this.f389a;
        if (abVar.mDialog != null) {
            abVar.onDismiss(abVar.mDialog);
        }
    }
}
