package com.applovin.impl;

import com.applovin.sdk.AppLovinSdkUtils;
import java.util.concurrent.Executor;
import r.C3894a;

/* loaded from: classes.dex */
public final /* synthetic */ class T0 implements Executor {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f20845a;

    public /* synthetic */ T0(int i5) {
        this.f20845a = i5;
    }

    private final void b(Runnable runnable) {
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        switch (this.f20845a) {
            case 0:
                AppLovinSdkUtils.runOnUiThread(runnable);
                break;
            case 1:
                runnable.run();
                break;
            case 2:
                break;
            default:
                C3894a.h0().f44285a.f44287b.execute(runnable);
                break;
        }
    }
}
