package f8;

import android.text.method.PasswordTransformationMethod;
import android.view.View;
import android.widget.EditText;
import com.wynauto.wyn.R;

/* loaded from: classes4.dex */
public final class u extends n {

    /* renamed from: e, reason: collision with root package name */
    public final int f35224e;

    /* renamed from: f, reason: collision with root package name */
    public EditText f35225f;

    /* renamed from: g, reason: collision with root package name */
    public final Lb.h f35226g;

    public u(m mVar, int i5) {
        super(mVar);
        this.f35224e = R.drawable.design_password_eye;
        this.f35226g = new Lb.h(this, 7);
        if (i5 != 0) {
            this.f35224e = i5;
        }
    }

    @Override // f8.n
    public final void b() {
        q();
    }

    @Override // f8.n
    public final int c() {
        return R.string.password_toggle_content_description;
    }

    @Override // f8.n
    public final int d() {
        return this.f35224e;
    }

    @Override // f8.n
    public final View.OnClickListener f() {
        return this.f35226g;
    }

    @Override // f8.n
    public final boolean k() {
        return true;
    }

    @Override // f8.n
    public final boolean l() {
        EditText editText = this.f35225f;
        return !(editText != null && (editText.getTransformationMethod() instanceof PasswordTransformationMethod));
    }

    @Override // f8.n
    public final void m(EditText editText) {
        this.f35225f = editText;
        q();
    }

    @Override // f8.n
    public final void r() {
        EditText editText = this.f35225f;
        if (editText != null) {
            if (editText.getInputType() == 16 || editText.getInputType() == 128 || editText.getInputType() == 144 || editText.getInputType() == 224) {
                this.f35225f.setTransformationMethod(PasswordTransformationMethod.getInstance());
            }
        }
    }

    @Override // f8.n
    public final void s() {
        EditText editText = this.f35225f;
        if (editText != null) {
            editText.setTransformationMethod(PasswordTransformationMethod.getInstance());
        }
    }
}
