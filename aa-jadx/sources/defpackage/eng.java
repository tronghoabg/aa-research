package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class eng implements android.text.TextWatcher {
    public boolean a = true;
    private final android.widget.EditText b;

    public eng(android.widget.EditText editText) {
        this.b = editText;
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(android.text.Editable editable) {
        if (this.b.isInEditMode() || !this.a) {
            return;
        }
        defpackage.emx emxVar = defpackage.emx.b;
    }

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(java.lang.CharSequence charSequence, int i, int i2, int i3) {
    }

    @Override // android.text.TextWatcher
    public final void onTextChanged(java.lang.CharSequence charSequence, int i, int i2, int i3) {
    }
}
