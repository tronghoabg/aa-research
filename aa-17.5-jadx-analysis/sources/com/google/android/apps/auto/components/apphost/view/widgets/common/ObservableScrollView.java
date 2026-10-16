package com.google.android.apps.auto.components.apphost.view.widgets.common;

import android.content.Context;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.widget.ScrollView;
import defpackage.ajmd;

/* loaded from: classes2.dex */
public class ObservableScrollView extends ScrollView {
    public ajmd a;

    public ObservableScrollView(Context context) {
        super(context);
    }

    @Override // android.widget.ScrollView
    public final boolean executeKeyEvent(KeyEvent keyEvent) {
        return false;
    }

    @Override // android.view.View
    protected final void onScrollChanged(int i, int i2, int i3, int i4) {
        super.onScrollChanged(i, i2, i3, i4);
        ajmd ajmdVar = this.a;
        if (ajmdVar != null) {
            ((ScrollableContentView) ajmdVar.a).c();
        }
    }

    public ObservableScrollView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public ObservableScrollView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }

    public ObservableScrollView(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
    }
}
