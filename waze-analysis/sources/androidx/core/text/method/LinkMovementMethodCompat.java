package androidx.core.text.method;

import android.text.method.LinkMovementMethod;

/* compiled from: WazeSource */
/* loaded from: classes3.dex */
public class LinkMovementMethodCompat extends LinkMovementMethod {
    private static LinkMovementMethodCompat sInstance;

    private LinkMovementMethodCompat() {
    }

    public static LinkMovementMethodCompat getInstance() {
        LinkMovementMethodCompat linkMovementMethodCompat = sInstance;
        if (linkMovementMethodCompat != null) {
            return linkMovementMethodCompat;
        }
        LinkMovementMethodCompat linkMovementMethodCompat2 = new LinkMovementMethodCompat();
        sInstance = linkMovementMethodCompat2;
        return linkMovementMethodCompat2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x004d, code lost:
    
        if (r0 <= r2.getLineRight(r1)) goto L19;
     */
    @Override // android.text.method.LinkMovementMethod, android.text.method.ScrollingMovementMethod, android.text.method.BaseMovementMethod, android.text.method.MovementMethod
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean onTouchEvent(android.widget.TextView r5, android.text.Spannable r6, android.view.MotionEvent r7) {
        /*
            r4 = this;
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 35
            if (r0 >= r1) goto L58
            int r0 = r7.getAction()
            r1 = 1
            if (r0 == r1) goto Lf
            if (r0 != 0) goto L58
        Lf:
            float r0 = r7.getX()
            int r0 = (int) r0
            float r1 = r7.getY()
            int r1 = (int) r1
            int r2 = r5.getTotalPaddingLeft()
            int r0 = r0 - r2
            int r2 = r5.getTotalPaddingTop()
            int r1 = r1 - r2
            int r2 = r5.getScrollX()
            int r0 = r0 + r2
            int r2 = r5.getScrollY()
            int r1 = r1 + r2
            android.text.Layout r2 = r5.getLayout()
            if (r1 < 0) goto L50
            int r3 = r2.getHeight()
            if (r1 <= r3) goto L3a
            goto L50
        L3a:
            int r1 = r2.getLineForVertical(r1)
            float r0 = (float) r0
            float r3 = r2.getLineLeft(r1)
            int r3 = (r0 > r3 ? 1 : (r0 == r3 ? 0 : -1))
            if (r3 < 0) goto L50
            float r1 = r2.getLineRight(r1)
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 > 0) goto L50
            goto L58
        L50:
            android.text.Selection.removeSelection(r6)
            boolean r4 = android.text.method.Touch.onTouchEvent(r5, r6, r7)
            return r4
        L58:
            boolean r4 = super.onTouchEvent(r5, r6, r7)
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.core.text.method.LinkMovementMethodCompat.onTouchEvent(android.widget.TextView, android.text.Spannable, android.view.MotionEvent):boolean");
    }
}
