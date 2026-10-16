package com.waze.uid.c;

import android.os.Bundle;
import android.view.View;
import androidx.lifecycle.ViewModelProvider;
import com.waze.R;
import com.waze.feedback.FeedbackScreenOrigin;
import com.waze.reports.cv;
import com.waze.sharedui.views.OvalButton;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class w extends be {

    /* renamed from: a, reason: collision with root package name */
    public com.waze.uid.f.f f44429a;

    /* renamed from: b, reason: collision with root package name */
    public u f44430b;

    public w() {
        super(R.layout.auth_choose_account, FeedbackScreenOrigin.CONFLICTING_ACCOUNTS_SCREEN_SHOWN, null, false, null, 28);
    }

    public final u a() {
        u uVar = this.f44430b;
        if (uVar != null) {
            return uVar;
        }
        h.g.b.x.j("chooseAccountAdapter");
        return null;
    }

    public final com.waze.uid.f.f b() {
        com.waze.uid.f.f fVar = this.f44429a;
        if (fVar != null) {
            return fVar;
        }
        h.g.b.x.j("viewModel");
        return null;
    }

    @Override // android.support.v4.app.ar
    public final void onViewCreated(View view, Bundle bundle) {
        h.g.b.x.f(view, "view");
        com.waze.uid.f.f fVar = (com.waze.uid.f.f) new ViewModelProvider(this).get(com.waze.uid.f.f.class);
        h.g.b.x.f(fVar, "<set-?>");
        this.f44429a = fVar;
        b().b().observe(getViewLifecycleOwner(), new v(new com.waze.ui.x.p(this, 17)));
        b().a().observe(getViewLifecycleOwner(), new v(new com.waze.ui.x.p(this, 18)));
        ((OvalButton) requireView().findViewById(R.id.chooseAccountNextButton)).setOnClickListener(new cv(this, 9));
    }
}
