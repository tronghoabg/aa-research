package com.applovin.impl;

import android.content.Context;
import android.graphics.PorterDuff;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;
import com.applovin.sdk.AppLovinSdkUtils;

/* renamed from: com.applovin.impl.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C1623a extends RelativeLayout {

    /* renamed from: a, reason: collision with root package name */
    private final ProgressBar f20875a;

    public C1623a(Context context, int i5, int i10) {
        RelativeLayout.LayoutParams layoutParams;
        super(context);
        setClickable(false);
        ProgressBar progressBar = new ProgressBar(context, null, i10);
        this.f20875a = progressBar;
        progressBar.setIndeterminate(true);
        progressBar.setClickable(false);
        if (i5 == -2 || i5 == -1) {
            layoutParams = new RelativeLayout.LayoutParams(i5, i5);
        } else {
            int iDpToPx = AppLovinSdkUtils.dpToPx(context, i5);
            layoutParams = new RelativeLayout.LayoutParams(iDpToPx, iDpToPx);
        }
        layoutParams.addRule(13);
        progressBar.setLayoutParams(layoutParams);
        addView(progressBar);
    }

    public void a() {
        setVisibility(0);
    }

    public void b() {
        setVisibility(8);
    }

    public void setColor(int i5) {
        this.f20875a.getIndeterminateDrawable().setColorFilter(i5, PorterDuff.Mode.SRC_IN);
    }
}
