package com.google.firebase.inappmessaging.display.internal.layout;

import S3.s;
import android.content.Context;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.View;
import android.widget.RelativeLayout;

/* loaded from: classes4.dex */
public class FiamRelativeLayout extends RelativeLayout {

    /* renamed from: a, reason: collision with root package name */
    public s f27347a;

    public FiamRelativeLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        Boolean boolN = this.f27347a.n(keyEvent);
        return boolN != null ? boolN.booleanValue() : super.dispatchKeyEvent(keyEvent);
    }

    public void setDismissListener(View.OnClickListener onClickListener) {
        this.f27347a = new s(8, this, onClickListener);
    }
}
