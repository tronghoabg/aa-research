package com.waze.gw;

/* loaded from: classes10.dex */
public final class MinimumSpeedPolicy {
    private static final int BACKEND_NOT_LOADED = Integer.MIN_VALUE;
    public static final int NONE = -1;
    private static volatile BackendSnapshot backend = new BackendSnapshot(-1, Integer.MIN_VALUE);

    private static final class BackendSnapshot {
        final int minimumSpeed;
        final long segmentId;

        BackendSnapshot(long j2, int i2) {
            this.segmentId = j2;
            this.minimumSpeed = i2;
        }
    }

    private MinimumSpeedPolicy() {
    }

    public static int inferFromMaximum(int i2) {
        if (i2 == 120) {
            return 80;
        }
        return i2 >= 80 ? 60 : -1;
    }

    public static int resolve(int i2, long j2, boolean z) {
        BackendSnapshot backendSnapshot = backend;
        if (j2 > 0 && backendSnapshot.segmentId == j2) {
            int i3 = backendSnapshot.minimumSpeed;
            if (i3 == -1) {
                return -1;
            }
            if (i3 > 0 && (i2 <= 0 || i3 <= i2)) {
                return i3;
            }
        }
        if (z || i2 >= 120) {
            return inferFromMaximum(i2);
        }
        return -1;
    }

    public static void publishBackendMinimumSpeed(long j2, Integer num) {
        int iIntValue;
        if (j2 <= 0) {
            return;
        }
        if (num == null) {
            iIntValue = Integer.MIN_VALUE;
        } else {
            iIntValue = num.intValue() > 0 ? num.intValue() : -1;
        }
        backend = new BackendSnapshot(j2, iIntValue);
    }

    public static void clearBackendState() {
        backend = new BackendSnapshot(-1L, Integer.MIN_VALUE);
    }
}
