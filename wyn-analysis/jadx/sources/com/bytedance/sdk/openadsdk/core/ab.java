package com.bytedance.sdk.openadsdk.core;

import android.app.Application;
import android.content.Context;
import com.bytedance.sdk.openadsdk.ApmHelper;

/* loaded from: classes3.dex */
public class ab {

    /* renamed from: oa, reason: collision with root package name */
    private boolean f25491oa;
    private final com.bytedance.sdk.openadsdk.utils.uef uef = new com.bytedance.sdk.openadsdk.utils.uef();

    public static class uef {
        private static final ab uef = new ab();
    }

    public static ab uef() {
        return uef.uef;
    }

    public com.bytedance.sdk.openadsdk.utils.uef lw() {
        return this.uef;
    }

    public boolean moa() {
        return this.uef.uef();
    }

    public void oa() {
        try {
            Context contextUef = sy.uef();
            if (contextUef instanceof Application) {
                ((Application) contextUef).registerActivityLifecycleCallbacks(this.uef);
                this.f25491oa = true;
            } else {
                if (contextUef == null || contextUef.getApplicationContext() == null) {
                    return;
                }
                ((Application) contextUef.getApplicationContext()).registerActivityLifecycleCallbacks(this.uef);
                this.f25491oa = true;
            }
        } catch (Throwable th) {
            ApmHelper.reportCustomError("registerActivityLifecycleError", "registerActivityLifecycle", th);
        }
    }

    public boolean yo() {
        return this.f25491oa;
    }

    public boolean uef(boolean z2) {
        return this.uef.uef(z2);
    }
}
