package com.applovin.impl;

import android.view.View;

/* loaded from: classes.dex */
public final /* synthetic */ class K implements View.OnClickListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f20793a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f20794b;

    public /* synthetic */ K(Object obj, int i5) {
        this.f20793a = i5;
        this.f20794b = obj;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.f20793a) {
            case 0:
                ((e1) this.f20794b).a(view);
                break;
            case 1:
                ((o1) this.f20794b).a(view);
                break;
            default:
                ((w1) this.f20794b).a(view);
                break;
        }
    }
}
