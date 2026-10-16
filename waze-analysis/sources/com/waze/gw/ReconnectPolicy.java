package com.waze.gw;

import androidx.collection.SieveCacheKt;
import java.util.Random;

/* loaded from: classes10.dex */
final class ReconnectPolicy {
    private int attempt;
    private final Random random = new Random();

    ReconnectPolicy() {
    }

    synchronized void reset() {
        this.attempt = 0;
    }

    synchronized long nextDelayMs() {
        long jMin;
        int i2 = this.attempt;
        this.attempt = i2 + 1;
        jMin = Math.min(60000L, 1500 << Math.min(i2, 5));
        return Math.max(250L, (jMin - Math.max(100L, jMin / 5)) + this.random.nextInt((int) Math.min(SieveCacheKt.NodeLinkMask, (r2 * 2) + 1)));
    }

    synchronized int attempt() {
        return this.attempt;
    }
}
