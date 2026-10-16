package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class dha implements android.text.style.LeadingMarginSpan {
    @Override // android.text.style.LeadingMarginSpan
    public final void drawLeadingMargin(android.graphics.Canvas canvas, android.graphics.Paint paint, int i, int i2, int i3, int i4, int i5, java.lang.CharSequence charSequence, int i6, int i7, boolean z, android.text.Layout layout) {
        int lineForOffset;
        if (layout == null || paint == null || (lineForOffset = layout.getLineForOffset(i6)) != layout.getLineCount() - 1) {
            return;
        }
        java.lang.ThreadLocal threadLocal = defpackage.dgq.a;
        if (layout.getEllipsisCount(lineForOffset) > 0) {
            float fI = defpackage.day.i(layout, lineForOffset, paint) + defpackage.day.j(layout, lineForOffset, paint);
            if (fI == 0.0f) {
                return;
            }
            canvas.getClass();
            canvas.translate(fI, 0.0f);
        }
    }

    @Override // android.text.style.LeadingMarginSpan
    public final int getLeadingMargin(boolean z) {
        return 0;
    }
}
