package com.google.android.gms.common.util.a;

import android.os.Handler;
import android.os.Looper;
import com.waze.native_managers.j;
import java.util.concurrent.Executor;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
public final class a implements Executor {

    /* renamed from: a, reason: collision with root package name */
    private final Handler f5140a;

    public a(Looper looper) {
        this.f5140a = new j(looper);
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        this.f5140a.post(runnable);
    }
}
