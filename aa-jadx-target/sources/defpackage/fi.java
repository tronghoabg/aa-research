package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public class fi extends defpackage.ao {
    @Override // defpackage.ao
    public final void d(android.app.Dialog dialog, int i) {
        if (!(dialog instanceof defpackage.fh)) {
            super.d(dialog, i);
            return;
        }
        defpackage.fh fhVar = (defpackage.fh) dialog;
        if (i != 1 && i != 2) {
            if (i != 3) {
                return;
            } else {
                dialog.getWindow().addFlags(24);
            }
        }
        fhVar.e();
    }

    @Override // defpackage.ao
    public android.app.Dialog fv(android.os.Bundle bundle) {
        return new defpackage.fh(getContext(), this.b);
    }
}
