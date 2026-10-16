package com.waze.sharedui.views;

import android.content.Context;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public class aj extends ad {

    /* renamed from: d, reason: collision with root package name */
    ai f39210d;

    /* renamed from: e, reason: collision with root package name */
    ai f39211e;

    /* renamed from: f, reason: collision with root package name */
    private Runnable f39212f;

    public aj(Context context) {
        super(context);
        g().addTextChangedListener(new ah(this, 0));
        g().setOnFocusChangeListener(new af(this, 0));
        f().setOnClickListener(new com.waze.profile.m(this, 16));
        f().setVisibility(8);
        e().setOnClickListener(new com.waze.profile.m(this, 17));
    }

    public final void B(ai aiVar) {
        this.f39210d = aiVar;
    }

    public final void C(ai aiVar) {
        this.f39211e = aiVar;
    }

    @Override // android.view.View
    public final void setEnabled(boolean z) {
        super.setEnabled(z);
        if (!z) {
            t(ac.DISABLED);
        } else if (g().getText().length() == 0) {
            t(ac.EMPTY);
        } else {
            t(ac.FULL);
        }
    }

    @Override // com.waze.sharedui.views.ad
    public final void t(ac acVar) {
        if (acVar != ac.EMPTY) {
            k(true);
        }
        super.t(acVar);
    }
}
