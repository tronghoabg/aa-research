package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public class mgy extends defpackage.wnc {
    public defpackage.bc k;

    @Override // defpackage.wnc, defpackage.fi, defpackage.ao
    public final android.app.Dialog fv(android.os.Bundle bundle) {
        android.app.Dialog dialogFv = super.fv(bundle);
        final int i = 2;
        ((defpackage.wnb) dialogFv).setOnShowListener(new android.content.DialogInterface.OnShowListener() { // from class: lex
            @Override // android.content.DialogInterface.OnShowListener
            public final void onShow(android.content.DialogInterface dialogInterface) {
                int i2 = i;
                if (i2 == 0) {
                    defpackage.tna.w(dialogInterface);
                    return;
                }
                if (i2 == 1) {
                    defpackage.tna.w(dialogInterface);
                } else if (i2 != 2) {
                    defpackage.tna.w(dialogInterface);
                } else {
                    defpackage.tna.w(dialogInterface);
                }
            }
        });
        return dialogFv;
    }

    public final void i() {
        defpackage.bc bcVar = this.k;
        if (bcVar != null) {
            bcVar.finish();
        }
    }

    @Override // defpackage.ao, android.content.DialogInterface.OnCancelListener
    public void onCancel(android.content.DialogInterface dialogInterface) {
        i();
    }

    @Override // defpackage.ao, android.support.v4.app.Fragment
    /* JADX INFO: renamed from: onCreate */
    public final void m6lambda$performCreate$3$androidsupportv4appFragment(android.os.Bundle bundle) {
        super.m6lambda$performCreate$3$androidsupportv4appFragment(bundle);
        this.k = getActivity();
    }

    @Override // android.support.v4.app.Fragment
    public final void onViewCreated(android.view.View view, android.os.Bundle bundle) {
        android.os.Vibrator vibrator = (android.os.Vibrator) requireContext().getSystemService("vibrator");
        vibrator.getClass();
        ep$.ExternalSyntheticApiModelOutline1.m(vibrator, ep$.ExternalSyntheticApiModelOutline1.m(1000L, -1));
        if (getContext() != null && requireContext().getResources().getDisplayMetrics().widthPixels / requireContext().getResources().getDisplayMetrics().density >= 600.0f) {
            if (defpackage.acwj.n()) {
                defpackage.oml.d(view);
            }
            com.google.android.material.bottomsheet.BottomSheetBehavior.B((android.view.View) requireView().getParent()).f = getResources().getDimensionPixelSize(2131166357);
        }
    }
}
