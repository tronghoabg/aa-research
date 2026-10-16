package com.waze.profile;

import android.webkit.JavascriptInterface;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ g f33380a;

    public a(g gVar) {
        this.f33380a = gVar;
    }

    @JavascriptInterface
    public final void changePasswordSuccessful() {
        g gVar = this.f33380a;
        gVar.f33388c.e("Password changed, logout account");
        gVar.k().b(s.f33412a);
    }
}
