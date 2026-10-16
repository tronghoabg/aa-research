package com.waze.planned_drive;

import android.os.Bundle;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
public final class ac implements com.waze.app_nav.l {

    /* renamed from: a, reason: collision with root package name */
    private boolean f33182a;

    public final com.waze.app_nav.p a() {
        Bundle bundle = new Bundle();
        bundle.putBoolean("search", this.f33182a);
        return new com.waze.app_nav.p(ay.class, bundle, 4);
    }

    public final void b(boolean z) {
        this.f33182a = z;
    }
}
