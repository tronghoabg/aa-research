package com.waze.a;

import android.support.v4.app.ar;
import android.support.v4.app.av;
import android.text.style.ClickableSpan;
import android.view.View;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public final class ad extends ClickableSpan {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ h.g.a.l f13603a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ ar f13604b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ String f13605c;

    /* renamed from: d, reason: collision with root package name */
    final /* synthetic */ String f13606d;

    ad(h.g.a.l lVar, ar arVar, String str, String str2) {
        this.f13603a = lVar;
        this.f13604b = arVar;
        this.f13605c = str;
        this.f13606d = str2;
    }

    @Override // android.text.style.ClickableSpan
    public final void onClick(View view) {
        h.g.b.x.f(view, "p0");
        this.f13603a.invoke(q.f13648a);
        com.waze.uid.d.s sVar = com.waze.uid.d.q.f44463a.a().f44466d;
        ar arVar = this.f13604b;
        av avVarRequireActivity = arVar.requireActivity();
        h.g.b.x.e(avVarRequireActivity, "requireActivity(...)");
        arVar.startActivity(sVar.a(avVarRequireActivity, new com.waze.uid.d.r(this.f13605c, true), this.f13606d));
    }
}
