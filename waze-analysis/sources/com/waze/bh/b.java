package com.waze.bh;

import android.os.Bundle;
import com.waze.app_nav.l;
import com.waze.app_nav.p;
import h.g.b.x;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class b implements l {

    /* renamed from: a, reason: collision with root package name */
    private String f16754a = "";

    public final p a() {
        Bundle bundle = new Bundle();
        bundle.putString("token", this.f16754a);
        return new c(this.f16754a, bundle);
    }

    public final void b(String str) {
        x.f(str, "<set-?>");
        this.f16754a = str;
    }
}
