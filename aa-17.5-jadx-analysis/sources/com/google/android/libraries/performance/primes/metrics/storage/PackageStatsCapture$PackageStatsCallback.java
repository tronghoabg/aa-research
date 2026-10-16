package com.google.android.libraries.performance.primes.metrics.storage;

import android.content.pm.IPackageStatsObserver;
import android.content.pm.PackageStats;
import defpackage.vlj;
import defpackage.ynz;
import java.util.concurrent.Semaphore;

/* loaded from: classes3.dex */
final class PackageStatsCapture$PackageStatsCallback extends IPackageStatsObserver.Stub {
    private final Semaphore a = new Semaphore(1);
    private volatile PackageStats b;

    private PackageStatsCapture$PackageStatsCallback() {
    }

    public void onGetStatsCompleted(PackageStats packageStats, boolean z) {
        if (z) {
            ((ynz) ((ynz) vlj.a.e()).ai((char) 9858)).y("Success getting PackageStats: %s", packageStats);
            this.b = packageStats;
        } else {
            ((ynz) ((ynz) vlj.a.h()).ai((char) 9857)).u("Failure getting PackageStats");
        }
        this.a.release();
    }
}
