package com.google.android.datatransport.runtime.c;

import android.os.SystemClock;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
public final class b implements a {

    /* renamed from: a, reason: collision with root package name */
    private final /* synthetic */ int f4183a;

    public b(int i2) {
        this.f4183a = i2;
    }

    @Override // com.google.android.datatransport.runtime.c.a
    public final long a() {
        return this.f4183a != 0 ? SystemClock.elapsedRealtime() : System.currentTimeMillis();
    }
}
