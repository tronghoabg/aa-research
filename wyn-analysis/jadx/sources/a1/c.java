package A1;

import android.text.InputFilter;
import android.text.Selection;
import android.text.Spannable;
import android.widget.TextView;
import java.lang.ref.WeakReference;
import y1.AbstractC4524e;
import y1.C4526g;

/* loaded from: classes.dex */
public final class c extends AbstractC4524e {

    /* renamed from: a, reason: collision with root package name */
    public final WeakReference f239a;

    /* renamed from: b, reason: collision with root package name */
    public final WeakReference f240b;

    public c(TextView textView, d dVar) {
        this.f239a = new WeakReference(textView);
        this.f240b = new WeakReference(dVar);
    }

    @Override // y1.AbstractC4524e
    public final void b() {
        InputFilter[] filters;
        int length;
        TextView textView = (TextView) this.f239a.get();
        InputFilter inputFilter = (InputFilter) this.f240b.get();
        if (inputFilter == null || textView == null || (filters = textView.getFilters()) == null) {
            return;
        }
        for (InputFilter inputFilter2 : filters) {
            if (inputFilter2 == inputFilter) {
                if (textView.isAttachedToWindow()) {
                    CharSequence text = textView.getText();
                    C4526g c4526gA = C4526g.a();
                    if (text == null) {
                        length = 0;
                    } else {
                        c4526gA.getClass();
                        length = text.length();
                    }
                    CharSequence charSequenceE = c4526gA.e(text, 0, length);
                    if (text == charSequenceE) {
                        return;
                    }
                    int selectionStart = Selection.getSelectionStart(charSequenceE);
                    int selectionEnd = Selection.getSelectionEnd(charSequenceE);
                    textView.setText(charSequenceE);
                    if (charSequenceE instanceof Spannable) {
                        Spannable spannable = (Spannable) charSequenceE;
                        if (selectionStart >= 0 && selectionEnd >= 0) {
                            Selection.setSelection(spannable, selectionStart, selectionEnd);
                            return;
                        } else if (selectionStart >= 0) {
                            Selection.setSelection(spannable, selectionStart);
                            return;
                        } else {
                            if (selectionEnd >= 0) {
                                Selection.setSelection(spannable, selectionEnd);
                                return;
                            }
                            return;
                        }
                    }
                    return;
                }
                return;
            }
        }
    }
}
