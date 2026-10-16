package com.carstream.tech.core.web;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;

/* compiled from: r8-map-id-0308adb7379ba4f751dce57ff165d4b8556222573b5bec89923a9da20a3bb2b7 */
/* loaded from: classes.dex */
public class KeepAliveFrame extends FrameLayout {
    public boolean a;

    public KeepAliveFrame(Context context) {
        super(context);
        this.a = false;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchVisibilityChanged(View view, int i) {
        if (this.a) {
            i = 0;
        }
        super.dispatchVisibilityChanged(view, i);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchWindowVisibilityChanged(int i) {
        if (this.a) {
            i = 0;
        }
        super.dispatchWindowVisibilityChanged(i);
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
}
