package androidx.work.impl.constraints.controllers;

import androidx.work.NetworkType;
import androidx.work.impl.constraints.NetworkState;
import androidx.work.impl.constraints.trackers.ConstraintTracker;
import androidx.work.impl.model.WorkSpec;
import h.g.b.x;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
public final class NetworkUnmeteredControllerPre28 extends BaseConstraintController<NetworkState> {
    private final int reason;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NetworkUnmeteredControllerPre28(ConstraintTracker<NetworkState> constraintTracker) {
        super(constraintTracker);
        x.f(constraintTracker, "tracker");
        this.reason = 7;
    }

    @Override // androidx.work.impl.constraints.controllers.BaseConstraintController
    protected int getReason() {
        return this.reason;
    }

    @Override // androidx.work.impl.constraints.controllers.ConstraintController
    public boolean hasConstraint(WorkSpec workSpec) {
        x.f(workSpec, "workSpec");
        return workSpec.constraints.getRequiredNetworkType() == NetworkType.UNMETERED;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.work.impl.constraints.controllers.BaseConstraintController
    public boolean isConstrained(NetworkState networkState) {
        x.f(networkState, "value");
        return !networkState.isConnected() || networkState.isMetered() || networkState.isBlocked();
    }
}
