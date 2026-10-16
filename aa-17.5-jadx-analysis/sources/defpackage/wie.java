package defpackage;

import android.graphics.Rect;
import android.text.Layout;
import android.text.Spanned;
import android.text.style.ClickableSpan;
import android.util.Log;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.widget.TextView;
import java.util.List;

/* loaded from: classes3.dex */
public final class wie extends eek {
    private final TextView e;

    public wie(TextView textView) {
        super(textView);
        this.e = textView;
    }

    private final CharSequence y(ClickableSpan clickableSpan) {
        CharSequence text = this.e.getText();
        if (!(text instanceof Spanned)) {
            return text;
        }
        Spanned spanned = (Spanned) text;
        return spanned.subSequence(spanned.getSpanStart(clickableSpan), spanned.getSpanEnd(clickableSpan));
    }

    @Override // defpackage.eek, defpackage.dzp
    public final void c(View view, edg edgVar) {
        super.c(view, edgVar);
        edgVar.ab(edf.c);
        edgVar.s(false);
    }

    @Override // defpackage.eek
    protected final int j(float f, float f2) {
        TextView textView = this.e;
        CharSequence text = textView.getText();
        if (!(text instanceof Spanned)) {
            return Integer.MIN_VALUE;
        }
        Spanned spanned = (Spanned) text;
        int offsetForPosition = textView.getOffsetForPosition(f, f2);
        ClickableSpan[] clickableSpanArr = (ClickableSpan[]) spanned.getSpans(offsetForPosition, offsetForPosition, ClickableSpan.class);
        if (clickableSpanArr.length == 1) {
            return spanned.getSpanStart(clickableSpanArr[0]);
        }
        return Integer.MIN_VALUE;
    }

    @Override // defpackage.eek
    protected final void l(List list) {
        CharSequence text = this.e.getText();
        if (text instanceof Spanned) {
            Spanned spanned = (Spanned) text;
            for (ClickableSpan clickableSpan : (ClickableSpan[]) spanned.getSpans(0, spanned.length(), ClickableSpan.class)) {
                list.add(Integer.valueOf(spanned.getSpanStart(clickableSpan)));
            }
        }
    }

    @Override // defpackage.eek
    protected final void n(int i, AccessibilityEvent accessibilityEvent) {
        ClickableSpan clickableSpanW = w(i);
        if (clickableSpanW != null) {
            accessibilityEvent.setContentDescription(y(clickableSpanW));
        } else {
            Log.w("TvLinksAccessibilityHelper", a.bp(i, "LinkSpan is null for offset: "));
            accessibilityEvent.setContentDescription(this.e.getText());
        }
    }

    @Override // defpackage.eek
    protected final void p(int i, edg edgVar) {
        ClickableSpan clickableSpanW = w(i);
        Rect rect = new Rect();
        if (clickableSpanW != null) {
            edgVar.v(y(clickableSpanW));
        } else {
            Log.w("TvLinksAccessibilityHelper", a.bp(i, "LinkSpan is null for offset: "));
            edgVar.v(this.e.getText());
        }
        edgVar.z(true);
        edgVar.s(true);
        x(clickableSpanW, rect);
        if (rect.isEmpty()) {
            Log.w("TvLinksAccessibilityHelper", a.bp(i, "LinkSpan bounds is empty for: "));
            rect.set(0, 0, 1, 1);
            edgVar.n(rect);
        } else {
            x(clickableSpanW, rect);
            edgVar.n(rect);
        }
        edgVar.g(16);
    }

    @Override // defpackage.eek
    public final boolean u(int i, int i2) {
        if (i2 != 16) {
            return false;
        }
        ClickableSpan clickableSpanW = w(i);
        if (clickableSpanW != null) {
            clickableSpanW.onClick(this.e);
            return true;
        }
        Log.e("TvLinksAccessibilityHelper", a.bp(i, "LinkSpan is null for offset: "));
        return false;
    }

    final ClickableSpan w(int i) {
        CharSequence text = this.e.getText();
        if (!(text instanceof Spanned)) {
            return null;
        }
        ClickableSpan[] clickableSpanArr = (ClickableSpan[]) ((Spanned) text).getSpans(i, i, ClickableSpan.class);
        if (clickableSpanArr.length == 1) {
            return clickableSpanArr[0];
        }
        return null;
    }

    final void x(ClickableSpan clickableSpan, Rect rect) {
        Layout layout;
        TextView textView = this.e;
        CharSequence text = textView.getText();
        if (!(text instanceof Spanned) || (layout = textView.getLayout()) == null) {
            return;
        }
        Spanned spanned = (Spanned) text;
        int spanStart = spanned.getSpanStart(clickableSpan);
        int spanEnd = spanned.getSpanEnd(clickableSpan);
        float primaryHorizontal = layout.getPrimaryHorizontal(spanStart);
        float primaryHorizontal2 = layout.getPrimaryHorizontal(spanEnd);
        int lineForOffset = layout.getLineForOffset(spanStart);
        int lineForOffset2 = layout.getLineForOffset(spanEnd);
        layout.getLineBounds(lineForOffset, rect);
        rect.right = (int) primaryHorizontal2;
        if (lineForOffset == lineForOffset2) {
            rect.left = (int) primaryHorizontal;
        } else {
            rect.left = 0;
        }
        rect.top = layout.getLineTop(lineForOffset2);
        rect.bottom = layout.getLineBottom(lineForOffset2);
        rect.offset(textView.getTotalPaddingLeft(), textView.getTotalPaddingTop());
    }
}
