package f8;

import android.text.Editable;

/* loaded from: classes4.dex */
public final class k extends W7.j {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ m f35153a;

    public k(m mVar) {
        this.f35153a = mVar;
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
        this.f35153a.b().a();
    }

    @Override // W7.j, android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i5, int i10, int i11) {
        this.f35153a.b().b();
    }
}
