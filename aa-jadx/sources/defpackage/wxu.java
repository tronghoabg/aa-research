package defpackage;

/* JADX INFO: loaded from: classes3.dex */
final class wxu extends defpackage.wrn {
    final /* synthetic */ defpackage.wxw a;

    public wxu(defpackage.wxw wxwVar) {
        this.a = wxwVar;
    }

    @Override // defpackage.wrn, android.text.TextWatcher
    public final void afterTextChanged(android.text.Editable editable) {
        this.a.c().l();
    }

    @Override // defpackage.wrn, android.text.TextWatcher
    public final void beforeTextChanged(java.lang.CharSequence charSequence, int i, int i2, int i3) {
        this.a.c().y();
    }
}
