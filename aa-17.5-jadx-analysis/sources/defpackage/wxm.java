package defpackage;

import android.text.Editable;
import android.text.SpanWatcher;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.widget.EditText;
import android.widget.TextView;
import com.google.android.material.textfield.TextInputLayout;

/* loaded from: classes3.dex */
public final class wxm extends dzp {
    private final TextInputLayout a;

    public wxm(TextInputLayout textInputLayout) {
        this.a = textInputLayout;
    }

    @Override // defpackage.dzp
    public final void c(View view, edg edgVar) {
        CharSequence charSequence;
        CharSequence charSequenceConcat;
        CharSequence charSequence2;
        TextView textView;
        super.c(view, edgVar);
        TextInputLayout textInputLayout = this.a;
        EditText editText = textInputLayout.c;
        Editable text = editText != null ? editText.getText() : null;
        CharSequence charSequenceF = textInputLayout.f();
        wxd wxdVar = textInputLayout.d;
        CharSequence charSequence3 = wxdVar.n ? wxdVar.m : null;
        CharSequence charSequenceE = textInputLayout.e();
        CharSequence charSequence4 = textInputLayout.j ? textInputLayout.i : null;
        int i = textInputLayout.f;
        CharSequence contentDescription = (textInputLayout.e && textInputLayout.g && (textView = textInputLayout.h) != null) ? textView.getContentDescription() : null;
        boolean zIsEmpty = TextUtils.isEmpty(text);
        boolean z = !zIsEmpty;
        boolean zIsEmpty2 = TextUtils.isEmpty(charSequenceF);
        boolean z2 = textInputLayout.p;
        boolean zIsEmpty3 = TextUtils.isEmpty(charSequenceE);
        boolean z3 = !zIsEmpty3;
        boolean z4 = (zIsEmpty3 && TextUtils.isEmpty(contentDescription)) ? false : true;
        CharSequence charSequence5 = true == zIsEmpty2 ? null : charSequenceF;
        CharSequence charSequenceConcat2 = charSequence3;
        if (TextUtils.isEmpty(charSequence3)) {
            charSequence = charSequenceE;
        } else {
            charSequence = charSequenceE;
            if (wxdVar.e == 2 && wxdVar.o != null && !TextUtils.isEmpty(wxdVar.m)) {
                if (!TextUtils.isEmpty(charSequence5)) {
                    charSequenceConcat2 = TextUtils.concat(charSequence5, ", ", charSequenceConcat2);
                }
                charSequence5 = charSequenceConcat2;
            }
        }
        wxi wxiVar = textInputLayout.a;
        TextView textView2 = wxiVar.a;
        if (textView2.getVisibility() == 0) {
            edgVar.a.setLabelFor(textView2);
            edgVar.R(textView2);
        } else {
            edgVar.R(wxiVar.c);
        }
        if (zIsEmpty) {
            if (!TextUtils.isEmpty(charSequence5)) {
                edgVar.Q(charSequence5);
                if (!z2 && charSequence4 != null) {
                    edgVar.Q(TextUtils.concat(charSequence5, ", ", charSequence4));
                }
            } else if (charSequence4 != null) {
                edgVar.Q(charSequence4);
            }
        } else if (TextUtils.isEmpty(charSequence5)) {
            edgVar.Q(text);
        } else if (text == null) {
            if (charSequence5 == null) {
                charSequence5 = "";
                charSequence2 = null;
                edgVar.Q(charSequence5);
                charSequence5 = charSequence2;
            } else {
                charSequence2 = charSequence5;
                edgVar.Q(charSequence5);
                charSequence5 = charSequence2;
            }
        } else if (charSequence5 == null) {
            charSequence5 = text;
            charSequence2 = null;
            edgVar.Q(charSequence5);
            charSequence5 = charSequence2;
        } else {
            SpanWatcher[] spanWatcherArr = (SpanWatcher[]) text.getSpans(0, text.length(), SpanWatcher.class);
            if (spanWatcherArr == null || (spanWatcherArr.length) == 0) {
                charSequenceConcat = TextUtils.concat(text, ", ", charSequence5);
            } else {
                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(text);
                for (SpanWatcher spanWatcher : spanWatcherArr) {
                    spannableStringBuilder.removeSpan(spanWatcher);
                }
                charSequenceConcat = spannableStringBuilder.append((CharSequence) ", ").append(charSequence5);
            }
            CharSequence charSequence6 = charSequence5;
            charSequence5 = charSequenceConcat;
            charSequence2 = charSequence6;
            edgVar.Q(charSequence5);
            charSequence5 = charSequence2;
        }
        if (!TextUtils.isEmpty(charSequence5)) {
            if (true == z) {
                charSequence5 = null;
            }
            edgVar.C(charSequence5);
            edgVar.N(zIsEmpty);
        }
        if (text == null || text.length() != i) {
            i = -1;
        }
        edgVar.E(i);
        if (z4) {
            edgVar.y(true == z3 ? charSequence : contentDescription);
        }
        textInputLayout.b.c().v(edgVar);
    }

    @Override // defpackage.dzp
    public final void d(View view, AccessibilityEvent accessibilityEvent) {
        super.d(view, accessibilityEvent);
        int i = TextInputLayout.s;
        this.a.b.c().w(accessibilityEvent);
    }
}
