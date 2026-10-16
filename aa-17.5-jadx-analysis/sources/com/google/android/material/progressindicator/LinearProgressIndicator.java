package com.google.android.material.progressindicator;

import android.content.Context;
import android.util.AttributeSet;
import com.google.android.projection.gearhead.R;
import defpackage.wro;
import defpackage.wrp;
import defpackage.wsd;
import defpackage.wsm;
import defpackage.wsn;
import defpackage.wsq;
import defpackage.wsu;
import defpackage.wsv;
import java.util.Arrays;

/* loaded from: classes3.dex */
public class LinearProgressIndicator extends wro<wsv> {
    public LinearProgressIndicator(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i, R.style.Widget_MaterialComponents_LinearProgressIndicator);
        wsn wsnVar = new wsn((wsv) this.a);
        Context context2 = getContext();
        wsv wsvVar = (wsv) this.a;
        setIndeterminateDrawable(new wsm(context2, wsvVar, wsnVar, wsvVar.q == 0 ? new wsq(wsvVar) : new wsu(context2, wsvVar)));
        setProgressDrawable(new wsd(getContext(), (wsv) this.a, wsnVar));
        this.f = true;
    }

    @Override // defpackage.wro
    public final /* synthetic */ wrp a(Context context, AttributeSet attributeSet) {
        return new wsv(context, attributeSet);
    }

    @Override // defpackage.wro
    public final void i(int i) {
        wrp wrpVar = this.a;
        if (wrpVar != null && ((wsv) wrpVar).q == 0 && isIndeterminate()) {
            return;
        }
        super.i(i);
    }

    public final void j(int... iArr) {
        if (!Arrays.equals(h(), iArr)) {
            this.a.e = iArr;
            getIndeterminateDrawable().b.b();
            invalidate();
        }
        ((wsv) this.a).b();
    }

    public final void k() {
        wsv wsvVar = (wsv) this.a;
        if (wsvVar.t != 0) {
            wsvVar.t = 0;
            wsvVar.b();
            invalidate();
        }
    }

    @Override // defpackage.wro, android.view.View
    protected final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        wsv wsvVar = (wsv) this.a;
        int i5 = wsvVar.r;
        boolean z2 = true;
        if (i5 != 1 && ((getLayoutDirection() != 1 || i5 != 2) && (getLayoutDirection() != 0 || i5 != 3))) {
            z2 = false;
        }
        wsvVar.s = z2;
    }

    @Override // android.widget.ProgressBar, android.view.View
    protected final void onSizeChanged(int i, int i2, int i3, int i4) {
        int paddingLeft = getPaddingLeft() + getPaddingRight();
        int paddingTop = getPaddingTop() + getPaddingBottom();
        wsm indeterminateDrawable = getIndeterminateDrawable();
        int i5 = i - paddingLeft;
        int i6 = i2 - paddingTop;
        if (indeterminateDrawable != null) {
            indeterminateDrawable.setBounds(0, 0, i5, i6);
        }
        wsd progressDrawable = getProgressDrawable();
        if (progressDrawable != null) {
            progressDrawable.setBounds(0, 0, i5, i6);
        }
    }

    public LinearProgressIndicator(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.linearProgressIndicatorStyle);
    }

    public LinearProgressIndicator(Context context) {
        this(context, null);
    }
}
