package com.google.android.libraries.surveys.internal.view;

import android.app.Activity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import defpackage.ao;
import defpackage.wja;
import defpackage.wjb;

/* loaded from: classes3.dex */
public final class PromptDialogFragment extends ao implements wja {
    private final wjb g = new wjb(this);

    @Override // defpackage.wja
    public final /* bridge */ /* synthetic */ Activity getActivity() {
        return super.getActivity();
    }

    @Override // defpackage.ao, android.support.v4.app.Fragment
    /* renamed from: onCreate */
    public final void m107lambda$performCreate$3$androidsupportv4appFragment(Bundle bundle) {
        super.m107lambda$performCreate$3$androidsupportv4appFragment(bundle);
        this.g.k();
    }

    @Override // android.support.v4.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return this.g.l(viewGroup);
    }

    @Override // android.support.v4.app.Fragment
    public final void onDestroy() {
        this.g.d();
        super.onDestroy();
    }

    @Override // android.support.v4.app.Fragment
    public final void onResume() {
        super.onResume();
        this.g.e(getView());
    }
}
