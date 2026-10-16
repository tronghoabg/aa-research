package android.support.v4.app;

import android.content.DialogInterface;

/* compiled from: WazeSource */
/* loaded from: classes2.dex */
final class x implements DialogInterface.OnCancelListener {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ ab f388a;

    x(ab abVar) {
        this.f388a = abVar;
    }

    @Override // android.content.DialogInterface.OnCancelListener
    public final void onCancel(DialogInterface dialogInterface) {
        ab abVar = this.f388a;
        if (abVar.mDialog != null) {
            abVar.onCancel(abVar.mDialog);
        }
    }
}
