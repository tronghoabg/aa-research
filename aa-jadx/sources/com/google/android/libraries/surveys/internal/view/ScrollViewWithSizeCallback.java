package com.google.android.libraries.surveys.internal.view;

/* JADX INFO: loaded from: classes3.dex */
public class ScrollViewWithSizeCallback extends android.widget.ScrollView {
    public defpackage.wkj a;

    public ScrollViewWithSizeCallback(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    @Override // android.widget.ScrollView, android.view.View
    protected final void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        defpackage.wkj wkjVar = this.a;
        if (wkjVar == null || i4 == i2 || i2 == 0) {
            return;
        }
        wkjVar.a(i2);
    }
}
