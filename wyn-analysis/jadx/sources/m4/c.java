package m4;

import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import com.afollestad.materialdialogs.internal.MDRootLayout;

/* loaded from: classes.dex */
public final class c implements ViewTreeObserver.OnScrollChangedListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ ViewGroup f40359a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ boolean f40360b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ MDRootLayout f40361c;

    public c(MDRootLayout mDRootLayout, ViewGroup viewGroup, boolean z2) {
        this.f40361c = mDRootLayout;
        this.f40359a = viewGroup;
        this.f40360b = z2;
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x003f  */
    @Override // android.view.ViewTreeObserver.OnScrollChangedListener
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onScrollChanged() {
        /*
            r8 = this;
            com.afollestad.materialdialogs.internal.MDRootLayout r0 = r8.f40361c
            com.afollestad.materialdialogs.internal.MDButton[] r1 = r0.f19951a
            int r2 = r1.length
            r3 = 0
            r4 = r3
        L7:
            r5 = 1
            r6 = 8
            if (r4 >= r2) goto L1b
            r7 = r1[r4]
            if (r7 == 0) goto L18
            int r7 = r7.getVisibility()
            if (r7 == r6) goto L18
            r1 = r5
            goto L1c
        L18:
            int r4 = r4 + 1
            goto L7
        L1b:
            r1 = r3
        L1c:
            android.view.ViewGroup r2 = r8.f40359a
            boolean r4 = r2 instanceof android.webkit.WebView
            boolean r7 = r8.f40360b
            if (r4 == 0) goto L65
            android.webkit.WebView r2 = (android.webkit.WebView) r2
            if (r7 == 0) goto L42
            android.view.View r4 = r0.f19953c
            if (r4 == 0) goto L3f
            int r4 = r4.getVisibility()
            if (r4 == r6) goto L3f
            int r4 = r2.getScrollY()
            int r6 = r2.getPaddingTop()
            int r6 = r6 + r4
            if (r6 <= 0) goto L3f
            r4 = r5
            goto L40
        L3f:
            r4 = r3
        L40:
            r0.f19955e = r4
        L42:
            if (r1 == 0) goto L62
            int r1 = r2.getScrollY()
            int r4 = r2.getMeasuredHeight()
            int r4 = r4 + r1
            int r1 = r2.getPaddingBottom()
            int r4 = r4 - r1
            float r1 = (float) r4
            int r4 = r2.getContentHeight()
            float r4 = (float) r4
            float r2 = r2.getScale()
            float r2 = r2 * r4
            int r1 = (r1 > r2 ? 1 : (r1 == r2 ? 0 : -1))
            if (r1 >= 0) goto L62
            r3 = r5
        L62:
            r0.f19956f = r3
            goto L68
        L65:
            com.afollestad.materialdialogs.internal.MDRootLayout.a(r0, r2, r7, r1)
        L68:
            r0.invalidate()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: m4.c.onScrollChanged():void");
    }
}
