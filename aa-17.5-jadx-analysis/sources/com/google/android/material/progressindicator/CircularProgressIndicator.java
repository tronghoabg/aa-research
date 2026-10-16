package com.google.android.material.progressindicator;

import android.content.Context;
import android.util.AttributeSet;
import com.google.android.projection.gearhead.R;
import defpackage.fhu;
import defpackage.wro;
import defpackage.wrp;
import defpackage.wrq;
import defpackage.wrv;
import defpackage.wsa;
import defpackage.wsb;
import defpackage.wsd;
import defpackage.wsm;

/* loaded from: classes3.dex */
public class CircularProgressIndicator extends wro<wsb> {
    public CircularProgressIndicator(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i, R.style.Widget_MaterialComponents_CircularProgressIndicator);
        wrq wrqVar = new wrq((wsb) this.a);
        Context context2 = getContext();
        wsb wsbVar = (wsb) this.a;
        wsm wsmVar = new wsm(context2, wsbVar, wrqVar, wsbVar.q == 1 ? new wsa(context2, wsbVar) : new wrv(wsbVar));
        wsmVar.c = fhu.b(context2.getResources(), R.drawable.ic_mtrl_arrow_circle, null);
        setIndeterminateDrawable(wsmVar);
        setProgressDrawable(new wsd(getContext(), (wsb) this.a, wrqVar));
        this.f = true;
    }

    @Override // defpackage.wro
    public final /* synthetic */ wrp a(Context context, AttributeSet attributeSet) {
        return new wsb(context, attributeSet);
    }

    public CircularProgressIndicator(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.circularProgressIndicatorStyle);
    }

    public CircularProgressIndicator(Context context) {
        this(context, null);
    }
}
