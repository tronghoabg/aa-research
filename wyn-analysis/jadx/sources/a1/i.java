package A1;

import android.text.Editable;
import android.text.Selection;
import android.text.Spannable;
import android.text.TextWatcher;
import android.widget.EditText;
import y1.C4526g;

/* loaded from: classes.dex */
public final class i implements TextWatcher {

    /* renamed from: a, reason: collision with root package name */
    public final EditText f251a;

    /* renamed from: b, reason: collision with root package name */
    public h f252b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f253c = true;

    public i(EditText editText) {
        this.f251a = editText;
    }

    public static void a(EditText editText, int i5) {
        int length;
        if (i5 == 1 && editText != null && editText.isAttachedToWindow()) {
            Editable editableText = editText.getEditableText();
            int selectionStart = Selection.getSelectionStart(editableText);
            int selectionEnd = Selection.getSelectionEnd(editableText);
            C4526g c4526gA = C4526g.a();
            if (editableText == null) {
                length = 0;
            } else {
                c4526gA.getClass();
                length = editableText.length();
            }
            c4526gA.e(editableText, 0, length);
            if (selectionStart >= 0 && selectionEnd >= 0) {
                Selection.setSelection(editableText, selectionStart, selectionEnd);
            } else if (selectionStart >= 0) {
                Selection.setSelection(editableText, selectionStart);
            } else if (selectionEnd >= 0) {
                Selection.setSelection(editableText, selectionEnd);
            }
        }
    }

    @Override // android.text.TextWatcher
    public final void onTextChanged(CharSequence charSequence, int i5, int i10, int i11) {
        EditText editText = this.f251a;
        if (editText.isInEditMode() || !this.f253c || C4526g.f47922j == null || i10 > i11 || !(charSequence instanceof Spannable)) {
            return;
        }
        int iB = C4526g.a().b();
        if (iB != 0) {
            if (iB == 1) {
                C4526g.a().e((Spannable) charSequence, i5, i11 + i5);
                return;
            } else if (iB != 3) {
                return;
            }
        }
        C4526g c4526gA = C4526g.a();
        if (this.f252b == null) {
            this.f252b = new h(editText);
        }
        c4526gA.f(this.f252b);
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
    }

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i5, int i10, int i11) {
    }
}
