package defpackage;

import android.content.DialogInterface;

/* loaded from: classes2.dex */
public final /* synthetic */ class les implements DialogInterface.OnShowListener {
    private final /* synthetic */ int a;

    public /* synthetic */ les(int i) {
        this.a = i;
    }

    @Override // android.content.DialogInterface.OnShowListener
    public final void onShow(DialogInterface dialogInterface) {
        int i = this.a;
        if (i == 0) {
            roc.m(dialogInterface);
        } else if (i != 1) {
            roc.m(dialogInterface);
        } else {
            roc.m(dialogInterface);
        }
    }
}
