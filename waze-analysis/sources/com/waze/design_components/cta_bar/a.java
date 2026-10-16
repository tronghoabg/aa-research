package com.waze.design_components.cta_bar;

import android.view.View;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public final /* synthetic */ class a implements h.g.a.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ View.OnClickListener f23419a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ CallToActionBar f23420b;

    /* renamed from: c, reason: collision with root package name */
    private final /* synthetic */ int f23421c;

    public /* synthetic */ a(View.OnClickListener onClickListener, CallToActionBar callToActionBar, int i2) {
        this.f23421c = i2;
        this.f23419a = onClickListener;
        this.f23420b = callToActionBar;
    }

    @Override // h.g.a.a
    public final Object invoke() {
        int i2 = this.f23421c;
        if (i2 == 0) {
            return CallToActionBar.a(this.f23419a, this.f23420b);
        }
        CallToActionBar callToActionBar = this.f23420b;
        View.OnClickListener onClickListener = this.f23419a;
        return i2 != 1 ? CallToActionBar.b(onClickListener, callToActionBar) : CallToActionBar.c(onClickListener, callToActionBar);
    }
}
