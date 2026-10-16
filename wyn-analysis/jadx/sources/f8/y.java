package f8;

import android.os.Build;
import android.text.TextUtils;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.EditText;
import com.google.android.material.textfield.TextInputLayout;
import k1.C3115b;
import l1.C3375e;
import q.Y;

/* loaded from: classes4.dex */
public final class y extends C3115b {

    /* renamed from: d, reason: collision with root package name */
    public final TextInputLayout f35241d;

    public y(TextInputLayout textInputLayout) {
        this.f35241d = textInputLayout;
    }

    @Override // k1.C3115b
    public final void d(View view, C3375e c3375e) {
        View.AccessibilityDelegate accessibilityDelegate = this.f38800a;
        AccessibilityNodeInfo accessibilityNodeInfo = c3375e.f39862a;
        accessibilityDelegate.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfo);
        TextInputLayout textInputLayout = this.f35241d;
        EditText editText = textInputLayout.getEditText();
        CharSequence text = editText != null ? editText.getText() : null;
        CharSequence hint = textInputLayout.getHint();
        CharSequence error = textInputLayout.getError();
        CharSequence placeholderText = textInputLayout.getPlaceholderText();
        int counterMaxLength = textInputLayout.getCounterMaxLength();
        CharSequence counterOverflowDescription = textInputLayout.getCounterOverflowDescription();
        boolean zIsEmpty = TextUtils.isEmpty(text);
        boolean zIsEmpty2 = TextUtils.isEmpty(hint);
        boolean z2 = textInputLayout.f27071r0;
        boolean zIsEmpty3 = TextUtils.isEmpty(error);
        boolean z10 = (zIsEmpty3 && TextUtils.isEmpty(counterOverflowDescription)) ? false : true;
        String string = !zIsEmpty2 ? hint.toString() : "";
        v vVar = textInputLayout.f27039b;
        Y y10 = vVar.f35228b;
        if (y10.getVisibility() == 0) {
            accessibilityNodeInfo.setLabelFor(y10);
            accessibilityNodeInfo.setTraversalAfter(y10);
        } else {
            accessibilityNodeInfo.setTraversalAfter(vVar.f35230d);
        }
        if (!zIsEmpty) {
            c3375e.n(text);
        } else if (!TextUtils.isEmpty(string)) {
            c3375e.n(string);
            if (!z2 && placeholderText != null) {
                c3375e.n(string + ", " + ((Object) placeholderText));
            }
        } else if (placeholderText != null) {
            c3375e.n(placeholderText);
        }
        if (!TextUtils.isEmpty(string)) {
            int i5 = Build.VERSION.SDK_INT;
            if (i5 >= 26) {
                c3375e.l(string);
            } else {
                if (!zIsEmpty) {
                    string = ((Object) text) + ", " + string;
                }
                c3375e.n(string);
            }
            if (i5 >= 26) {
                accessibilityNodeInfo.setShowingHintText(zIsEmpty);
            } else {
                c3375e.i(4, zIsEmpty);
            }
        }
        if (text == null || text.length() != counterMaxLength) {
            counterMaxLength = -1;
        }
        accessibilityNodeInfo.setMaxTextLength(counterMaxLength);
        if (z10) {
            if (zIsEmpty3) {
                error = counterOverflowDescription;
            }
            accessibilityNodeInfo.setError(error);
        }
        Y y11 = textInputLayout.f27055j.f35211y;
        if (y11 != null) {
            accessibilityNodeInfo.setLabelFor(y11);
        }
        textInputLayout.f27041c.b().n(c3375e);
    }

    @Override // k1.C3115b
    public final void e(View view, AccessibilityEvent accessibilityEvent) {
        super.e(view, accessibilityEvent);
        this.f35241d.f27041c.b().o(accessibilityEvent);
    }
}
