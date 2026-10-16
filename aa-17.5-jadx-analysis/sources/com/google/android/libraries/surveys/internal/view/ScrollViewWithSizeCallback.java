package com.google.android.libraries.surveys.internal.view;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.ScrollView;
import defpackage.wjl;

/* loaded from: classes3.dex */
public class ScrollViewWithSizeCallback extends ScrollView {
    public wjl a;

    public ScrollViewWithSizeCallback(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    @Override // android.widget.ScrollView, android.view.View
    protected final void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        wjl wjlVar = this.a;
        if (wjlVar == null || i4 == i2 || i2 == 0) {
            return;
        }
        wjlVar.a(i2);
    }
}
