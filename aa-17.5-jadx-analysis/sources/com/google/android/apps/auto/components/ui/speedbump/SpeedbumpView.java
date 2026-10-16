package com.google.android.apps.auto.components.ui.speedbump;

import android.animation.ObjectAnimator;
import android.content.Context;
import android.content.res.Configuration;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.LinearInterpolator;
import android.widget.FrameLayout;
import android.widget.ProgressBar;
import com.google.android.projection.gearhead.R;
import defpackage.kfl;
import defpackage.ksa;
import defpackage.lbh;
import defpackage.leh;
import defpackage.nrd;
import defpackage.ntb;
import defpackage.ntw;

/* loaded from: classes2.dex */
public class SpeedbumpView extends FrameLayout {
    public View a;
    public View b;
    ProgressBar c;
    public ObjectAnimator d;
    public boolean e;
    public ViewGroup f;
    public int g;

    public SpeedbumpView(Context context) {
        this(context, null);
    }

    public static boolean b() {
        return nrd.a().d() || nrd.a().f();
    }

    public final void a() {
        LayoutInflater layoutInflaterFrom = LayoutInflater.from(kfl.j(getContext()));
        leh.a();
        View viewInflate = layoutInflaterFrom.inflate(R.layout.speedbump, (ViewGroup) this, false);
        this.a = viewInflate;
        ProgressBar progressBar = (ProgressBar) viewInflate.findViewById(R.id.progress_bar);
        this.c = progressBar;
        ObjectAnimator objectAnimatorOfInt = ObjectAnimator.ofInt(progressBar, "progress", 0, 100);
        this.d = objectAnimatorOfInt;
        objectAnimatorOfInt.setDuration(5833L);
        this.d.setInterpolator(new LinearInterpolator());
        this.b = this.a.findViewById(R.id.speedbump_container);
        this.a.setVisibility(8);
        this.a.setOnClickListener(new ntb(3));
        addView(this.a);
    }

    @Override // android.view.View
    protected final void onConfigurationChanged(Configuration configuration) {
        if (leh.a().b()) {
            this.e = true;
        }
    }

    @Override // android.view.View
    protected final void onFinishInflate() {
        super.onFinishInflate();
        leh.a();
        ksa.d().e.fE(lbh.d(), new ntw(this, 9));
        a();
        setElevation(2.1311684E9f);
    }

    public SpeedbumpView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public SpeedbumpView(Context context, AttributeSet attributeSet, int i) {
        this(context, attributeSet, i, 0);
    }

    public SpeedbumpView(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
    }
}
