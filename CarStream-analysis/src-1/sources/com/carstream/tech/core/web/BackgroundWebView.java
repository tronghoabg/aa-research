package com.carstream.tech.core.web;

import android.content.Context;
import android.view.View;
import android.webkit.WebView;

/* compiled from: r8-map-id-0308adb7379ba4f751dce57ff165d4b8556222573b5bec89923a9da20a3bb2b7 */
/* loaded from: classes.dex */
public class BackgroundWebView extends WebView {
    public boolean a;

    public BackgroundWebView(Context context) {
        super(context);
        this.a = false;
    }

    public final void a(boolean z) {
        this.a = z;
        if (z) {
            try {
                super.onWindowVisibilityChanged(0);
                onVisibilityAggregated(true);
                onResume();
                resumeTimers();
            } catch (Throwable th) {
                String.valueOf(th);
            }
        }
    }

    @Override // android.view.View
    public final int getWindowVisibility() {
        if (this.a) {
            return 0;
        }
        return super.getWindowVisibility();
    }

    @Override // android.view.View
    public final boolean isShown() {
        return this.a || super.isShown();
    }

    @Override // android.view.View
    public final void onVisibilityAggregated(boolean z) {
        super.onVisibilityAggregated(this.a || z);
    }

    @Override // android.webkit.WebView, android.view.View
    public final void onVisibilityChanged(View view, int i) {
        if (this.a) {
            super.onVisibilityChanged(view, 0);
        } else {
            super.onVisibilityChanged(view, i);
        }
    }

    @Override // android.webkit.WebView, android.view.View
    public final void onWindowVisibilityChanged(int i) {
        if (this.a) {
            super.onWindowVisibilityChanged(0);
        } else {
            super.onWindowVisibilityChanged(i);
        }
    }
}
