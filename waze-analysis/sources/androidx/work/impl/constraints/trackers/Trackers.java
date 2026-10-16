package androidx.work.impl.constraints.trackers;

import android.content.Context;
import androidx.work.impl.constraints.NetworkState;
import androidx.work.impl.utils.taskexecutor.TaskExecutor;
import h.g.b.x;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
public final class Trackers {
    private final ConstraintTracker<Boolean> batteryChargingTracker;
    private final BatteryNotLowTracker batteryNotLowTracker;
    private final Context context;
    private final ConstraintTracker<NetworkState> networkStateTracker;
    private final ConstraintTracker<Boolean> storageNotLowTracker;

    /*  JADX ERROR: NullPointerException in pass: InitCodeVariables
        java.lang.NullPointerException
        */
    public /* synthetic */ Trackers(android.content.Context r8, androidx.work.impl.utils.taskexecutor.TaskExecutor r9, androidx.work.impl.constraints.trackers.ConstraintTracker r10, androidx.work.impl.constraints.trackers.BatteryNotLowTracker r11, androidx.work.impl.constraints.trackers.ConstraintTracker r12, androidx.work.impl.constraints.trackers.ConstraintTracker r13, int r14, h.g.b.o r15) {
        /*
            r7 = this;
            r0 = r14 & 4
            java.lang.String r1 = "getApplicationContext(...)"
            if (r0 == 0) goto L16
            androidx.work.impl.constraints.trackers.BatteryChargingTracker r0 = new androidx.work.impl.constraints.trackers.BatteryChargingTracker
            android.content.Context r3 = r8.getApplicationContext()
            h.g.b.x.e(r3, r1)
            r0.<init>(r3, r9)
            androidx.work.impl.constraints.trackers.ConstraintTracker r0 = (androidx.work.impl.constraints.trackers.ConstraintTracker) r0
            r3 = r0
            goto L17
        L16:
            r3 = r10
        L17:
            r0 = r14 & 8
            if (r0 == 0) goto L29
            androidx.work.impl.constraints.trackers.BatteryNotLowTracker r0 = new androidx.work.impl.constraints.trackers.BatteryNotLowTracker
            android.content.Context r4 = r8.getApplicationContext()
            h.g.b.x.e(r4, r1)
            r0.<init>(r4, r9)
            r4 = r0
            goto L2a
        L29:
            r4 = r11
        L2a:
            r0 = r14 & 16
            if (r0 == 0) goto L31
            r0 = 0
            r5 = r0
            goto L32
        L31:
            r5 = r12
        L32:
            r0 = r14 & 32
            if (r0 == 0) goto L49
            androidx.work.impl.constraints.trackers.StorageNotLowTracker r0 = new androidx.work.impl.constraints.trackers.StorageNotLowTracker
            android.content.Context r6 = r8.getApplicationContext()
            h.g.b.x.e(r6, r1)
            r0.<init>(r6, r9)
            androidx.work.impl.constraints.trackers.ConstraintTracker r0 = (androidx.work.impl.constraints.trackers.ConstraintTracker) r0
            r6 = r0
            r1 = r8
            r2 = r9
            r0 = r7
            goto L4d
        L49:
            r6 = r13
            r0 = r7
            r1 = r8
            r2 = r9
        L4d:
            r0.<init>(r1, r2, r3, r4, r5, r6)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.work.impl.constraints.trackers.Trackers.<init>(android.content.Context, androidx.work.impl.utils.taskexecutor.TaskExecutor, androidx.work.impl.constraints.trackers.ConstraintTracker, androidx.work.impl.constraints.trackers.BatteryNotLowTracker, androidx.work.impl.constraints.trackers.ConstraintTracker, androidx.work.impl.constraints.trackers.ConstraintTracker, int, h.g.b.o):void");
    }

    public final ConstraintTracker<Boolean> getBatteryChargingTracker() {
        return this.batteryChargingTracker;
    }

    public final BatteryNotLowTracker getBatteryNotLowTracker() {
        return this.batteryNotLowTracker;
    }

    public final Context getContext() {
        return this.context;
    }

    public final ConstraintTracker<NetworkState> getNetworkStateTracker() {
        return this.networkStateTracker;
    }

    public final ConstraintTracker<Boolean> getStorageNotLowTracker() {
        return this.storageNotLowTracker;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public Trackers(Context context, TaskExecutor taskExecutor, ConstraintTracker<Boolean> constraintTracker) {
        this(context, taskExecutor, constraintTracker, null, null, null, 56, null);
        x.f(context, "context");
        x.f(taskExecutor, "taskExecutor");
        x.f(constraintTracker, "batteryChargingTracker");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public Trackers(Context context, TaskExecutor taskExecutor, ConstraintTracker<Boolean> constraintTracker, BatteryNotLowTracker batteryNotLowTracker) {
        this(context, taskExecutor, constraintTracker, batteryNotLowTracker, null, null, 48, null);
        x.f(context, "context");
        x.f(taskExecutor, "taskExecutor");
        x.f(constraintTracker, "batteryChargingTracker");
        x.f(batteryNotLowTracker, "batteryNotLowTracker");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public Trackers(Context context, TaskExecutor taskExecutor, ConstraintTracker<Boolean> constraintTracker, BatteryNotLowTracker batteryNotLowTracker, ConstraintTracker<NetworkState> constraintTracker2) {
        this(context, taskExecutor, constraintTracker, batteryNotLowTracker, constraintTracker2, null, 32, null);
        x.f(context, "context");
        x.f(taskExecutor, "taskExecutor");
        x.f(constraintTracker, "batteryChargingTracker");
        x.f(batteryNotLowTracker, "batteryNotLowTracker");
    }

    public Trackers(Context context, TaskExecutor taskExecutor, ConstraintTracker<Boolean> constraintTracker, BatteryNotLowTracker batteryNotLowTracker, ConstraintTracker<NetworkState> constraintTracker2, ConstraintTracker<Boolean> constraintTracker3) {
        x.f(context, "context");
        x.f(taskExecutor, "taskExecutor");
        x.f(constraintTracker, "batteryChargingTracker");
        x.f(batteryNotLowTracker, "batteryNotLowTracker");
        x.f(constraintTracker3, "storageNotLowTracker");
        this.context = context;
        this.batteryChargingTracker = constraintTracker;
        this.batteryNotLowTracker = batteryNotLowTracker;
        this.networkStateTracker = constraintTracker2;
        this.storageNotLowTracker = constraintTracker3;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public Trackers(Context context, TaskExecutor taskExecutor) {
        this(context, taskExecutor, null, null, null, null, 60, null);
        x.f(context, "context");
        x.f(taskExecutor, "taskExecutor");
    }
}
