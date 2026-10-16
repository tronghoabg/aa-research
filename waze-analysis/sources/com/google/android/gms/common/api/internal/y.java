package com.google.android.gms.common.api.internal;

import android.os.Handler;
import java.util.concurrent.Executor;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
public final /* synthetic */ class y implements Executor {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Handler f4855a;

    /* renamed from: b, reason: collision with root package name */
    private final /* synthetic */ int f4856b;

    public /* synthetic */ y(Handler handler, int i2) {
        this.f4856b = i2;
        this.f4855a = handler;
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        int i2 = this.f4856b;
        Handler handler = this.f4855a;
        if (i2 != 0) {
            handler.post(runnable);
        } else {
            handler.post(runnable);
        }
    }
}
