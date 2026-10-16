package com.google.firebase.perf.a;

import com.google.firebase.perf.f.i;
import java.lang.ref.WeakReference;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
public class d implements b {
    private final WeakReference<b> appStateCallback;
    private final c appStateMonitor;
    private i currentAppState;
    private boolean isRegisteredForAppState;

    protected d(c cVar) {
        this.isRegisteredForAppState = false;
        this.currentAppState = i.APPLICATION_PROCESS_STATE_UNKNOWN;
        this.appStateMonitor = cVar;
        this.appStateCallback = new WeakReference<>(this);
    }

    public i getAppState() {
        return this.currentAppState;
    }

    public WeakReference<b> getAppStateCallback() {
        return this.appStateCallback;
    }

    protected void incrementTsnsCount(int i2) {
        this.appStateMonitor.c(i2);
    }

    @Override // com.google.firebase.perf.a.b
    public void onUpdateAppState(i iVar) {
        i iVar2 = this.currentAppState;
        i iVar3 = i.APPLICATION_PROCESS_STATE_UNKNOWN;
        if (iVar2 == iVar3) {
            this.currentAppState = iVar;
        } else {
            if (iVar2 == iVar || iVar == iVar3) {
                return;
            }
            this.currentAppState = i.FOREGROUND_BACKGROUND;
        }
    }

    protected void registerForAppState() {
        if (this.isRegisteredForAppState) {
            return;
        }
        this.currentAppState = this.appStateMonitor.b();
        this.appStateMonitor.f(this.appStateCallback);
        this.isRegisteredForAppState = true;
    }

    protected void unregisterForAppState() {
        if (this.isRegisteredForAppState) {
            this.appStateMonitor.g(this.appStateCallback);
            this.isRegisteredForAppState = false;
        }
    }

    protected d() {
        this(c.a());
    }
}
