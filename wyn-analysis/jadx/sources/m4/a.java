package m4;

import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.webkit.WebView;
import com.afollestad.materialdialogs.internal.MDRootLayout;

/* loaded from: classes.dex */
public final class a implements ViewTreeObserver.OnPreDrawListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ View f40353a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ boolean f40354b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ MDRootLayout f40355c;

    public a(MDRootLayout mDRootLayout, View view, boolean z2) {
        this.f40355c = mDRootLayout;
        this.f40353a = view;
        this.f40354b = z2;
    }

    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    public final boolean onPreDraw() {
        View view = this.f40353a;
        if (view.getMeasuredHeight() == 0) {
            return true;
        }
        WebView webView = (WebView) view;
        int i5 = MDRootLayout.f19950t;
        float measuredHeight = webView.getMeasuredHeight();
        float scale = webView.getScale() * webView.getContentHeight();
        boolean z2 = this.f40354b;
        MDRootLayout mDRootLayout = this.f40355c;
        if (measuredHeight < scale) {
            mDRootLayout.b((ViewGroup) view, z2);
        } else {
            if (z2) {
                mDRootLayout.f19955e = false;
            }
            mDRootLayout.f19956f = false;
        }
        view.getViewTreeObserver().removeOnPreDrawListener(this);
        return true;
    }
}
