package defpackage;

import android.content.DialogInterface;

/* loaded from: classes3.dex */
public final class xan implements DialogInterface.OnClickListener {
    private final /* synthetic */ int a;

    public xan(int i) {
        this.a = i;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        int i2 = this.a;
        if (i2 == 0) {
            dialogInterface.dismiss();
        } else {
            if (i2 != 1) {
                return;
            }
            yph yphVar = pgt.a;
        }
    }
}
