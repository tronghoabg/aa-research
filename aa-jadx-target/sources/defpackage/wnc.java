package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public class wnc extends defpackage.fi {
    @Override // defpackage.ao
    public final void c() {
        android.app.Dialog dialog = this.e;
        if (dialog instanceof defpackage.wnb) {
            boolean z = ((defpackage.wnb) dialog).a().v;
        }
        super.g(false, false);
    }

    @Override // defpackage.fi, defpackage.ao
    public android.app.Dialog fv(android.os.Bundle bundle) {
        return new defpackage.wnb(getContext(), this.b);
    }
}
