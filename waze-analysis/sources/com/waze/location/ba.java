package com.waze.location;

import j$.util.Objects;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
final class ba implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ bb f25332a;

    ba(bb bbVar) {
        Objects.requireNonNull(bbVar);
        this.f25332a = bbVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        bb bbVar = this.f25332a;
        LocationSensorListener locationSensorListener = bbVar.f25333a;
        locationSensorListener.logger.g("WatchDogTask Restarting GPS");
        bbVar.f25335c = true;
        locationSensorListener.stop();
        locationSensorListener.start();
        bbVar.f25335c = false;
        bbVar.f25334b = false;
    }
}
