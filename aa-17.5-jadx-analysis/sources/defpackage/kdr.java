package defpackage;

import android.text.Editable;
import android.text.TextWatcher;
import androidx.car.app.model.signin.InputSignInMethod;

/* loaded from: classes2.dex */
public final class kdr implements TextWatcher {
    final /* synthetic */ geu a;
    final /* synthetic */ InputSignInMethod b;

    public kdr(geu geuVar, InputSignInMethod inputSignInMethod) {
        this.a = geuVar;
        this.b = inputSignInMethod;
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
        geu geuVar = this.a;
        String string = editable.toString();
        geuVar.t().k(this.b.getInputCallbackDelegate(), string);
    }

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }

    @Override // android.text.TextWatcher
    public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }
}
