package com.google.android.setupcompat.view;

import android.content.Context;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;
import android.view.WindowInsets;
import android.widget.FrameLayout;
import com.google.android.projection.gearhead.R;
import defpackage.a;
import defpackage.oct;
import defpackage.xql;
import java.util.Locale;

/* loaded from: classes3.dex */
public class StatusBarBackgroundLayout extends FrameLayout {
    private static final oct b = new oct("StatusBarBgLayout", (byte[]) null);
    private WindowInsets a;

    public StatusBarBackgroundLayout(Context context) {
        super(context);
    }

    @Override // android.view.View
    public final WindowInsets onApplyWindowInsets(WindowInsets windowInsets) {
        int systemWindowInsetBottom = windowInsets.getSystemWindowInsetBottom();
        boolean zB = xql.b(getContext());
        oct octVar = b;
        String str = String.format(Locale.US, "Apply edge to edge, glifExpressiveEnabled: %s, isAtLeastLollipop: %s, windowInsetBottom: %d", Boolean.valueOf(zB), true, Integer.valueOf(systemWindowInsetBottom));
        if (Log.isLoggable("SetupLibrary", 4)) {
            Log.i("SetupLibrary", ((String) octVar.a).concat(str));
        }
        if (zB && systemWindowInsetBottom >= 0) {
            View viewFindViewById = findViewById(R.id.suc_layout_status);
            int paddingBottom = viewFindViewById != null ? viewFindViewById.getPaddingBottom() : 0;
            String strBp = a.bp(paddingBottom, "applyEdgeToEdge, paddingBottom: ");
            if (Log.isLoggable("SetupLibrary", 3)) {
                Log.d("SetupLibrary", ((String) octVar.a).concat(strBp));
            }
            windowInsets = windowInsets.replaceSystemWindowInsets(0, windowInsets.getSystemWindowInsetTop(), 0, paddingBottom);
        }
        this.a = windowInsets;
        return super.onApplyWindowInsets(windowInsets);
    }

    @Override // android.view.ViewGroup, android.view.View
    protected final void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.a == null) {
            requestApplyInsets();
        }
    }

    @Override // android.view.View
    protected final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        WindowInsets windowInsets = this.a;
        if (windowInsets == null || windowInsets.getSystemWindowInsetTop() <= 0) {
            return;
        }
        getWidth();
        throw null;
    }

    public StatusBarBackgroundLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public StatusBarBackgroundLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
