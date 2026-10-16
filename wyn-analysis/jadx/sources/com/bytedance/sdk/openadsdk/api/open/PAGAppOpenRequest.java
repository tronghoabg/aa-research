package com.bytedance.sdk.openadsdk.api.open;

import com.bytedance.sdk.openadsdk.api.PAGRequest;

/* loaded from: classes3.dex */
public class PAGAppOpenRequest extends PAGRequest {
    private int uef;

    public int getTimeout() {
        return this.uef;
    }

    public void setTimeout(int i5) {
        this.uef = i5;
    }
}
