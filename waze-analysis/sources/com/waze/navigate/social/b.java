package com.waze.navigate.social;

import android.view.View;
import com.waze.alerters.a.k;
import com.waze.app_nav.ah;
import com.waze.app_nav.m;
import com.waze.app_nav.w;
import com.waze.main_screen.u;
import j$.util.Objects;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
final class b implements View.OnClickListener {
    b(ShareHelpActivity shareHelpActivity) {
        Objects.requireNonNull(shareHelpActivity);
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        w wVarE = k.e();
        u uVar = u.f27645a;
        wVarE.a(new m(u.c().a(), ah.d()));
    }
}
