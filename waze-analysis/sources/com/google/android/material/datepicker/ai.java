package com.google.android.material.datepicker;

import android.os.Bundle;
import android.view.ContextThemeWrapper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
public final class ai extends aq {

    /* renamed from: b, reason: collision with root package name */
    private int f6395b;

    /* renamed from: c, reason: collision with root package name */
    private c f6396c;

    /* renamed from: d, reason: collision with root package name */
    private at f6397d;

    @Override // android.support.v4.app.ar
    /* renamed from: onCreate */
    public final void m37lambda$performCreate$3$androidsupportv4appFragment(Bundle bundle) {
        super.m37lambda$performCreate$3$androidsupportv4appFragment(bundle);
        if (bundle == null) {
            bundle = getArguments();
        }
        this.f6395b = bundle.getInt("THEME_RES_ID_KEY");
        this.f6397d = (at) bundle.getParcelable("DATE_SELECTOR_KEY");
        this.f6396c = (c) bundle.getParcelable("CALENDAR_CONSTRAINTS_KEY");
    }

    @Override // android.support.v4.app.ar
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return this.f6397d.l(layoutInflater.cloneInContext(new ContextThemeWrapper(getContext(), this.f6395b)), viewGroup, this.f6396c, new ah(this));
    }

    @Override // android.support.v4.app.ar
    /* renamed from: onSaveInstanceState */
    public final void m47x22bc4f96(Bundle bundle) {
        bundle.putInt("THEME_RES_ID_KEY", this.f6395b);
        bundle.putParcelable("DATE_SELECTOR_KEY", this.f6397d);
        bundle.putParcelable("CALENDAR_CONSTRAINTS_KEY", this.f6396c);
    }
}
