package com.bytedance.sdk.openadsdk.api;

import android.os.Bundle;
import java.util.Map;

/* loaded from: classes3.dex */
public class PAGRequest {

    /* renamed from: oa, reason: collision with root package name */
    private Map<String, Object> f25269oa;
    private String uef;
    private Bundle yo = null;

    public final void addNetworkExtrasBundle(Class<?> cls, Bundle bundle) {
        if (this.yo == null) {
            this.yo = new Bundle();
        }
        this.yo.putBundle(cls.getName(), bundle);
    }

    public String getAdString() {
        return this.uef;
    }

    public Map<String, Object> getExtraInfo() {
        return this.f25269oa;
    }

    public Bundle getNetworkExtrasBundle() {
        return this.yo;
    }

    public void setAdString(String str) {
        this.uef = str;
    }

    public void setExtraInfo(Map<String, Object> map) {
        this.f25269oa = map;
    }
}
