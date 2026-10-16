package com.google.android.material.textfield;

import android.text.method.PasswordTransformationMethod;
import android.view.View;
import android.widget.EditText;
import com.waze.R;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
final class ak extends ac {

    /* renamed from: e, reason: collision with root package name */
    private int f6860e;

    /* renamed from: f, reason: collision with root package name */
    private EditText f6861f;

    /* renamed from: g, reason: collision with root package name */
    private final View.OnClickListener f6862g;

    ak(ab abVar, int i2) {
        super(abVar);
        this.f6860e = R.drawable.design_password_eye;
        this.f6862g = new View.OnClickListener() { // from class: com.google.android.material.textfield.aj
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ak.f(this.f6859a);
            }
        };
        if (i2 != 0) {
            this.f6860e = i2;
        }
    }

    public static /* synthetic */ void f(ak akVar) {
        EditText editText = akVar.f6861f;
        if (editText == null) {
            return;
        }
        int selectionEnd = editText.getSelectionEnd();
        if (akVar.l()) {
            akVar.f6861f.setTransformationMethod(null);
        } else {
            akVar.f6861f.setTransformationMethod(PasswordTransformationMethod.getInstance());
        }
        if (selectionEnd >= 0) {
            akVar.f6861f.setSelection(selectionEnd);
        }
        akVar.A();
    }

    private final boolean l() {
        EditText editText = this.f6861f;
        return editText != null && (editText.getTransformationMethod() instanceof PasswordTransformationMethod);
    }

    @Override // com.google.android.material.textfield.ac
    final void B() {
        A();
    }

    @Override // com.google.android.material.textfield.ac
    final int a() {
        return R.string.password_toggle_content_description;
    }

    @Override // com.google.android.material.textfield.ac
    final int b() {
        return this.f6860e;
    }

    @Override // com.google.android.material.textfield.ac
    final View.OnClickListener c() {
        return this.f6862g;
    }

    @Override // com.google.android.material.textfield.ac
    final void h(EditText editText) {
        this.f6861f = editText;
        A();
    }

    @Override // com.google.android.material.textfield.ac
    final void j() {
        EditText editText = this.f6861f;
        if (editText != null) {
            if (editText.getInputType() == 16 || editText.getInputType() == 128 || editText.getInputType() == 144 || editText.getInputType() == 224) {
                this.f6861f.setTransformationMethod(PasswordTransformationMethod.getInstance());
            }
        }
    }

    @Override // com.google.android.material.textfield.ac
    final void k() {
        EditText editText = this.f6861f;
        if (editText != null) {
            editText.setTransformationMethod(PasswordTransformationMethod.getInstance());
        }
    }

    @Override // com.google.android.material.textfield.ac
    final boolean s() {
        return true;
    }

    @Override // com.google.android.material.textfield.ac
    final boolean t() {
        return !l();
    }
}
