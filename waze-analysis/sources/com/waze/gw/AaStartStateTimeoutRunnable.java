package com.waze.gw;

import com.waze.car_lib.f.av;
import com.waze.car_lib.screens.ap;

/* compiled from: WazeSource */
/* loaded from: classes10.dex */
public final class AaStartStateTimeoutRunnable implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final ap f24288a;

    public AaStartStateTimeoutRunnable(ap apVar) {
        this.f24288a = apVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            this.f24288a.f21782e.y(av.f19393b);
        } catch (Throwable th) {
        }
    }
}
