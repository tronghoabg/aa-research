package com.waze.copilot.presentation;

import h.g.b.x;
import java.util.List;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public final class UpdateCoPilotSelectionRequest {
    public static final int $stable = 8;
    private final List<CopilotSelectionResponse> actions;

    public UpdateCoPilotSelectionRequest(List<CopilotSelectionResponse> list) {
        this.actions = list;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ UpdateCoPilotSelectionRequest copy$default(UpdateCoPilotSelectionRequest updateCoPilotSelectionRequest, List list, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            list = updateCoPilotSelectionRequest.actions;
        }
        return updateCoPilotSelectionRequest.copy(list);
    }

    public final List<CopilotSelectionResponse> component1() {
        return this.actions;
    }

    public final UpdateCoPilotSelectionRequest copy(List<CopilotSelectionResponse> list) {
        return new UpdateCoPilotSelectionRequest(list);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof UpdateCoPilotSelectionRequest) && x.n(this.actions, ((UpdateCoPilotSelectionRequest) obj).actions);
    }

    public final List<CopilotSelectionResponse> getActions() {
        return this.actions;
    }

    public int hashCode() {
        List<CopilotSelectionResponse> list = this.actions;
        if (list == null) {
            return 0;
        }
        return list.hashCode();
    }

    public String toString() {
        return "UpdateCoPilotSelectionRequest(actions=" + this.actions + ")";
    }
}
