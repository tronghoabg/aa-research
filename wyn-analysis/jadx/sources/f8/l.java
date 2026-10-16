package f8;

import android.widget.EditText;
import com.google.android.material.textfield.TextInputLayout;

/* loaded from: classes4.dex */
public final class l {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ m f35154a;

    public l(m mVar) {
        this.f35154a = mVar;
    }

    public final void a(TextInputLayout textInputLayout) {
        m mVar = this.f35154a;
        if (mVar.f35172s == textInputLayout.getEditText()) {
            return;
        }
        EditText editText = mVar.f35172s;
        k kVar = mVar.f35175v;
        if (editText != null) {
            editText.removeTextChangedListener(kVar);
            if (mVar.f35172s.getOnFocusChangeListener() == mVar.b().e()) {
                mVar.f35172s.setOnFocusChangeListener(null);
            }
        }
        EditText editText2 = textInputLayout.getEditText();
        mVar.f35172s = editText2;
        if (editText2 != null) {
            editText2.addTextChangedListener(kVar);
        }
        mVar.b().m(mVar.f35172s);
        mVar.i(mVar.b());
    }
}
