package defpackage;

import android.content.DialogInterface;
import android.support.v4.app.Fragment;

/* loaded from: classes2.dex */
public final /* synthetic */ class sdm implements DialogInterface.OnCancelListener {
    public final /* synthetic */ Fragment a;
    private final /* synthetic */ int b;

    public /* synthetic */ sdm(Fragment fragment, int i) {
        this.b = i;
        this.a = fragment;
    }

    @Override // android.content.DialogInterface.OnCancelListener
    public final void onCancel(DialogInterface dialogInterface) {
        int i = this.b;
        if (i == 0) {
            sei seiVar = (sei) this.a;
            seiVar.c(yzy.bK);
            seiVar.b().f("EVENT_INTRO_DECLINED", null);
            return;
        }
        if (i == 1) {
            mku mkuVar = (mku) this.a;
            mkuVar.m(yzy.tu);
            mkuVar.o(new mlf());
            return;
        }
        Fragment fragment = this.a;
        if (i == 2) {
            ((sfw) fragment).c().h(9);
            return;
        }
        sfh sfhVar = (sfh) fragment;
        sfhVar.b();
        sfhVar.a();
    }
}
