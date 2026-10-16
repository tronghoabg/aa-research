package A1;

import android.text.InputFilter;
import android.text.Spanned;
import android.widget.TextView;
import y1.C4526g;

/* loaded from: classes.dex */
public final class d implements InputFilter {

    /* renamed from: a, reason: collision with root package name */
    public final TextView f241a;

    /* renamed from: b, reason: collision with root package name */
    public c f242b;

    public d(TextView textView) {
        this.f241a = textView;
    }

    @Override // android.text.InputFilter
    public final CharSequence filter(CharSequence charSequence, int i5, int i10, Spanned spanned, int i11, int i12) {
        TextView textView = this.f241a;
        if (textView.isInEditMode()) {
            return charSequence;
        }
        int iB = C4526g.a().b();
        if (iB != 0) {
            if (iB == 1) {
                if ((i12 == 0 && i11 == 0 && spanned.length() == 0 && charSequence == textView.getText()) || charSequence == null) {
                    return charSequence;
                }
                if (i5 != 0 || i10 != charSequence.length()) {
                    charSequence = charSequence.subSequence(i5, i10);
                }
                return C4526g.a().e(charSequence, 0, charSequence.length());
            }
            if (iB != 3) {
                return charSequence;
            }
        }
        C4526g c4526gA = C4526g.a();
        if (this.f242b == null) {
            this.f242b = new c(textView, this);
        }
        c4526gA.f(this.f242b);
        return charSequence;
    }
}
