package defpackage;

import android.R;
import android.os.Bundle;
import android.os.SystemClock;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import android.widget.EditText;
import androidx.preference.EditTextPreference;

/* loaded from: classes2.dex */
public final class exf extends exp {
    private EditText g;
    private CharSequence h;
    private final Runnable i = new elt(this, 5, null);
    private long j = -1;

    private final EditTextPreference n() {
        return (EditTextPreference) m();
    }

    private final void o(boolean z) {
        this.j = z ? SystemClock.currentThreadTimeMillis() : -1L;
    }

    @Override // defpackage.exp
    protected final void h(View view) {
        super.h(view);
        EditText editText = (EditText) view.findViewById(R.id.edit);
        this.g = editText;
        if (editText == null) {
            throw new IllegalStateException("Dialog view must contain an EditText with id @android:id/edit");
        }
        editText.requestFocus();
        this.g.setText(this.h);
        EditText editText2 = this.g;
        editText2.setSelection(editText2.getText().length());
        n();
    }

    @Override // defpackage.exp
    public final void i(boolean z) {
        if (z) {
            String string = this.g.getText().toString();
            EditTextPreference editTextPreferenceN = n();
            if (editTextPreferenceN.N(string)) {
                editTextPreferenceN.i(string);
            }
        }
    }

    @Override // defpackage.exp
    protected final void j() {
        o(true);
        k();
    }

    public final void k() {
        long j = this.j;
        if (j == -1 || j + 1000 <= SystemClock.currentThreadTimeMillis()) {
            return;
        }
        EditText editText = this.g;
        if (editText == null || !editText.isFocused()) {
            o(false);
            return;
        }
        if (((InputMethodManager) this.g.getContext().getSystemService("input_method")).showSoftInput(this.g, 0)) {
            o(false);
            return;
        }
        EditText editText2 = this.g;
        Runnable runnable = this.i;
        editText2.removeCallbacks(runnable);
        this.g.postDelayed(runnable, 50L);
    }

    @Override // defpackage.exp
    protected final boolean l() {
        return true;
    }

    @Override // defpackage.exp, defpackage.ao, android.support.v4.app.Fragment
    /* renamed from: onCreate */
    public final void m107lambda$performCreate$3$androidsupportv4appFragment(Bundle bundle) {
        super.m107lambda$performCreate$3$androidsupportv4appFragment(bundle);
        if (bundle == null) {
            this.h = n().g;
        } else {
            this.h = bundle.getCharSequence("EditTextPreferenceDialogFragment.text");
        }
    }

    @Override // defpackage.exp, defpackage.ao, android.support.v4.app.Fragment
    /* renamed from: onSaveInstanceState */
    public final void m117x22bc4f96(Bundle bundle) {
        super.m117x22bc4f96(bundle);
        bundle.putCharSequence("EditTextPreferenceDialogFragment.text", this.h);
    }
}
