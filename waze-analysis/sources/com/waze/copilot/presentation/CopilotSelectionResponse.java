package com.waze.copilot.presentation;

import androidx.savedstate.serialization.ClassDiscriminatorModeKt;
import h.g.b.x;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public final class CopilotSelectionResponse {
    public static final int $stable = 0;
    private final String assetId;
    private final String campaignId;
    private final CopilotOperationResponse operation;
    private final CopilotTypeResponse type;

    public CopilotSelectionResponse(CopilotTypeResponse copilotTypeResponse, String str, String str2, CopilotOperationResponse copilotOperationResponse) {
        x.f(copilotTypeResponse, ClassDiscriminatorModeKt.CLASS_DISCRIMINATOR_KEY);
        x.f(str, "assetId");
        x.f(str2, "campaignId");
        x.f(copilotOperationResponse, "operation");
        this.type = copilotTypeResponse;
        this.assetId = str;
        this.campaignId = str2;
        this.operation = copilotOperationResponse;
    }

    public static /* synthetic */ CopilotSelectionResponse copy$default(CopilotSelectionResponse copilotSelectionResponse, CopilotTypeResponse copilotTypeResponse, String str, String str2, CopilotOperationResponse copilotOperationResponse, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            copilotTypeResponse = copilotSelectionResponse.type;
        }
        if ((i2 & 2) != 0) {
            str = copilotSelectionResponse.assetId;
        }
        if ((i2 & 4) != 0) {
            str2 = copilotSelectionResponse.campaignId;
        }
        if ((i2 & 8) != 0) {
            copilotOperationResponse = copilotSelectionResponse.operation;
        }
        return copilotSelectionResponse.copy(copilotTypeResponse, str, str2, copilotOperationResponse);
    }

    public final CopilotTypeResponse component1() {
        return this.type;
    }

    public final String component2() {
        return this.assetId;
    }

    public final String component3() {
        return this.campaignId;
    }

    public final CopilotOperationResponse component4() {
        return this.operation;
    }

    public final CopilotSelectionResponse copy(CopilotTypeResponse copilotTypeResponse, String str, String str2, CopilotOperationResponse copilotOperationResponse) {
        x.f(copilotTypeResponse, ClassDiscriminatorModeKt.CLASS_DISCRIMINATOR_KEY);
        x.f(str, "assetId");
        x.f(str2, "campaignId");
        x.f(copilotOperationResponse, "operation");
        return new CopilotSelectionResponse(copilotTypeResponse, str, str2, copilotOperationResponse);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CopilotSelectionResponse)) {
            return false;
        }
        CopilotSelectionResponse copilotSelectionResponse = (CopilotSelectionResponse) obj;
        return this.type == copilotSelectionResponse.type && x.n(this.assetId, copilotSelectionResponse.assetId) && x.n(this.campaignId, copilotSelectionResponse.campaignId) && this.operation == copilotSelectionResponse.operation;
    }

    public final String getAssetId() {
        return this.assetId;
    }

    public final String getCampaignId() {
        return this.campaignId;
    }

    public final CopilotOperationResponse getOperation() {
        return this.operation;
    }

    public final CopilotTypeResponse getType() {
        return this.type;
    }

    public int hashCode() {
        return (((((this.type.hashCode() * 31) + this.assetId.hashCode()) * 31) + this.campaignId.hashCode()) * 31) + this.operation.hashCode();
    }

    public String toString() {
        return "CopilotSelectionResponse(type=" + this.type + ", assetId=" + this.assetId + ", campaignId=" + this.campaignId + ", operation=" + this.operation + ")";
    }
}
