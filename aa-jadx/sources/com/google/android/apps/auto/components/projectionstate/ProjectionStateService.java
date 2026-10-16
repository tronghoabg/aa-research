package com.google.android.apps.auto.components.projectionstate;

/* JADX INFO: loaded from: classes.dex */
public class ProjectionStateService extends android.app.Service {
    public static volatile defpackage.mie a;
    private final android.os.IBinder b = new defpackage.mig();

    @Override // android.app.Service
    public final android.os.IBinder onBind(android.content.Intent intent) {
        return this.b;
    }
}
