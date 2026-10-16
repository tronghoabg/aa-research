package defpackage;

import android.text.Editable;

/* loaded from: classes3.dex */
final class wwy extends wqq {
    final /* synthetic */ wxa a;

    public wwy(wxa wxaVar) {
        this.a = wxaVar;
    }

    @Override // defpackage.wqq, android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
        this.a.c().l();
    }

    @Override // defpackage.wqq, android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        this.a.c().y();
    }
}
