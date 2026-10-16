package com.waze.uid.c;

import android.content.Intent;
import android.view.View;
import com.waze.sharedui.views.CheckBoxView;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final /* synthetic */ class ag implements View.OnClickListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Object f44201a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ be f44202b;

    /* renamed from: c, reason: collision with root package name */
    private final /* synthetic */ int f44203c;

    public /* synthetic */ ag(CheckBoxView checkBoxView, ah ahVar, int i2) {
        this.f44203c = i2;
        this.f44201a = checkBoxView;
        this.f44202b = ahVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        if (this.f44203c == 0) {
            ah.b((CheckBoxView) this.f44201a, (ah) this.f44202b);
            return;
        }
        com.waze.uid.state_impl.email.u uVar = new com.waze.uid.state_impl.email.u();
        be beVar = this.f44202b;
        beVar.j(uVar);
        android.support.v4.app.av activity = beVar.getActivity();
        if (activity != null) {
            activity.startActivity((Intent) this.f44201a);
        }
    }

    public /* synthetic */ ag(i iVar, Intent intent, int i2) {
        this.f44203c = i2;
        this.f44202b = iVar;
        this.f44201a = intent;
    }
}
