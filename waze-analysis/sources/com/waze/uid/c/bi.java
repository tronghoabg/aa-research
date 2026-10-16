package com.waze.uid.c;

import android.webkit.JavascriptInterface;
import androidx.lifecycle.LifecycleOwnerKt;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class bi {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ bl f44274a;

    public bi(bl blVar) {
        this.f44274a = blVar;
    }

    @JavascriptInterface
    public final void getAccessTokenSuccessful(String str) {
        h.g.b.x.f(str, "token");
        bl blVar = this.f44274a;
        blVar.f44277b.a("2FA auth successful");
        kotlinx.coroutines.aj.z(LifecycleOwnerKt.getLifecycleScope(blVar), null, null, new bh(blVar, str, null), 3);
    }
}
