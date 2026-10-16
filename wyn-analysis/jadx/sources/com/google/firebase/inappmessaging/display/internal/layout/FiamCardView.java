package com.google.firebase.inappmessaging.display.internal.layout;

import S3.s;
import android.content.Context;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.View;
import w.AbstractC4346a;

/* loaded from: classes4.dex */
public class FiamCardView extends AbstractC4346a {

    /* renamed from: h, reason: collision with root package name */
    public s f27345h;

    public FiamCardView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        Boolean boolN = this.f27345h.n(keyEvent);
        return boolN != null ? boolN.booleanValue() : super.dispatchKeyEvent(keyEvent);
    }

    public void setDismissListener(View.OnClickListener onClickListener) {
        this.f27345h = new s(8, this, onClickListener);
    }
}
