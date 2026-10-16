package com.waze.search;

import android.os.Bundle;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class e implements com.waze.app_nav.l {

    /* renamed from: a, reason: collision with root package name */
    private boolean f35609a;

    /* renamed from: b, reason: collision with root package name */
    private String f35610b;

    public final com.waze.app_nav.p a() {
        Bundle bundle = new Bundle();
        bundle.putString("EXTRA_SEARCH_TERM", this.f35610b);
        bundle.putBoolean("EXTRA_ADD_STOP_MODE", this.f35609a);
        return new f(bundle);
    }

    public final void b(boolean z) {
        this.f35609a = z;
    }

    public final void c(String str) {
        this.f35610b = str;
    }
}
