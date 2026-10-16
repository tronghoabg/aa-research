package f8;

import android.content.res.Resources;
import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.view.KeyEvent;
import android.widget.TextView;
import androidx.appcompat.widget.SearchView;
import com.google.android.material.textfield.TextInputLayout;
import l4.C3389e;
import l4.DialogC3391g;

/* loaded from: classes4.dex */
public final class w implements TextWatcher {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f35237a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ KeyEvent.Callback f35238b;

    public /* synthetic */ w(KeyEvent.Callback callback, int i5) {
        this.f35237a = i5;
        this.f35238b = callback;
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) throws Resources.NotFoundException {
        switch (this.f35237a) {
            case 0:
                TextInputLayout textInputLayout = (TextInputLayout) this.f35238b;
                textInputLayout.t(!textInputLayout.f27082x0, false);
                if (textInputLayout.k) {
                    textInputLayout.n(editable);
                }
                if (textInputLayout.f27072s) {
                    textInputLayout.u(editable);
                    break;
                }
                break;
        }
    }

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i5, int i10, int i11) {
        int i12 = this.f35237a;
    }

    @Override // android.text.TextWatcher
    public final void onTextChanged(CharSequence charSequence, int i5, int i10, int i11) throws IllegalAccessException, NoSuchFieldException, SecurityException, IllegalArgumentException {
        switch (this.f35237a) {
            case 0:
                break;
            case 1:
                int length = charSequence.toString().length();
                DialogC3391g dialogC3391g = (DialogC3391g) this.f35238b;
                dialogC3391g.f39988c.getClass();
                boolean z2 = length == 0;
                dialogC3391g.f39997m.setEnabled(!z2);
                TextView textView = dialogC3391g.k;
                C3389e c3389e = dialogC3391g.f39988c;
                if (textView != null) {
                    c3389e.getClass();
                    dialogC3391g.k.setVisibility(8);
                    boolean z10 = (z2 && length == 0) || length < -1;
                    gc.b.I(dialogC3391g.f39992g, z10 ? 0 : c3389e.f39973n);
                    dialogC3391g.f39997m.setEnabled(!z10);
                }
                c3389e.getClass();
                break;
            default:
                SearchView searchView = (SearchView) this.f35238b;
                Editable text = searchView.f17903p.getText();
                searchView.f17895V = text;
                boolean zIsEmpty = TextUtils.isEmpty(text);
                searchView.x(!zIsEmpty);
                int i12 = 8;
                if (searchView.f17894U && !searchView.f17887N && zIsEmpty) {
                    searchView.f17908u.setVisibility(8);
                    i12 = 0;
                }
                searchView.f17910w.setVisibility(i12);
                searchView.t();
                searchView.w();
                charSequence.toString();
                break;
        }
    }

    private final void a(Editable editable) {
    }

    private final void b(Editable editable) {
    }

    private final void c(int i5, int i10, int i11, CharSequence charSequence) {
    }

    private final void d(int i5, int i10, int i11, CharSequence charSequence) {
    }

    private final void e(int i5, int i10, int i11, CharSequence charSequence) {
    }

    private final void f(int i5, int i10, int i11, CharSequence charSequence) {
    }
}
