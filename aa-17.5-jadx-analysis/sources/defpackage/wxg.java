package defpackage;

import android.text.method.PasswordTransformationMethod;
import android.view.View;
import android.widget.EditText;
import com.google.android.projection.gearhead.R;

/* loaded from: classes3.dex */
final class wxg extends wxb {
    public EditText a;
    private int b;
    private final View.OnClickListener c;

    public wxg(wxa wxaVar, int i) {
        super(wxaVar);
        this.b = R.drawable.design_password_eye;
        this.c = new wwt(this, 2);
        if (i != 0) {
            this.b = i;
        }
    }

    @Override // defpackage.wxb
    public final int a() {
        return R.string.password_toggle_content_description;
    }

    @Override // defpackage.wxb
    public final int b() {
        return this.b;
    }

    @Override // defpackage.wxb
    public final View.OnClickListener c() {
        return this.c;
    }

    @Override // defpackage.wxb
    public final void g(EditText editText) {
        this.a = editText;
        x();
    }

    @Override // defpackage.wxb
    public final void i() {
        EditText editText = this.a;
        if (editText != null) {
            if (editText.getInputType() == 16 || editText.getInputType() == 128 || editText.getInputType() == 144 || editText.getInputType() == 224) {
                this.a.setTransformationMethod(PasswordTransformationMethod.getInstance());
            }
        }
    }

    @Override // defpackage.wxb
    public final void j() {
        EditText editText = this.a;
        if (editText != null) {
            editText.setTransformationMethod(PasswordTransformationMethod.getInstance());
        }
    }

    public final boolean k() {
        EditText editText = this.a;
        return editText != null && (editText.getTransformationMethod() instanceof PasswordTransformationMethod);
    }

    @Override // defpackage.wxb
    public final boolean s() {
        return true;
    }

    @Override // defpackage.wxb
    public final boolean t() {
        return !k();
    }

    @Override // defpackage.wxb
    public final void y() {
        x();
    }
}
