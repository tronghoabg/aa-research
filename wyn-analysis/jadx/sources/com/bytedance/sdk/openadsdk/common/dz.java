package com.bytedance.sdk.openadsdk.common;

import com.bytedance.sdk.openadsdk.common.uef;

/* loaded from: classes3.dex */
public class dz {
    private ab ivm;
    private boolean lw;
    private final uef.oa moa;

    /* renamed from: oa, reason: collision with root package name */
    private final String f25305oa;
    private final com.bytedance.sdk.openadsdk.component.reward.uef.oa uef;
    private uef.InterfaceC0076uef xs;
    private final Runnable yo;

    public static class uef {
        private final uef.oa moa;

        /* renamed from: oa, reason: collision with root package name */
        private final String f25306oa;
        private final com.bytedance.sdk.openadsdk.component.reward.uef.oa uef;
        private final Runnable yo;
        private boolean lw = false;
        private ab ivm = null;
        private uef.InterfaceC0076uef xs = null;

        public uef(com.bytedance.sdk.openadsdk.component.reward.uef.oa oaVar, String str, Runnable runnable, uef.oa oaVar2) {
            this.uef = oaVar;
            this.f25306oa = str;
            this.yo = runnable;
            this.moa = oaVar2;
        }

        public uef uef(boolean z2) {
            this.lw = z2;
            return this;
        }

        public uef uef(ab abVar) {
            this.ivm = abVar;
            return this;
        }

        public uef uef(uef.InterfaceC0076uef interfaceC0076uef) {
            this.xs = interfaceC0076uef;
            return this;
        }

        public dz uef() {
            if (this.uef != null) {
                if (this.yo != null) {
                    if (this.moa != null) {
                        return new dz(this);
                    }
                    throw new IllegalArgumentException("SkipResultHandler cannot be null");
                }
                throw new IllegalArgumentException("Runnable finishAction cannot be null");
            }
            throw new IllegalArgumentException("RewardFullContext cannot be null");
        }
    }

    public ab ivm() {
        return this.ivm;
    }

    public boolean lw() {
        return this.lw;
    }

    public uef.oa moa() {
        return this.moa;
    }

    public String oa() {
        return this.f25305oa;
    }

    public com.bytedance.sdk.openadsdk.component.reward.uef.oa uef() {
        return this.uef;
    }

    public uef.InterfaceC0076uef xs() {
        return this.xs;
    }

    public Runnable yo() {
        return this.yo;
    }

    private dz(uef uefVar) {
        this.uef = uefVar.uef;
        this.f25305oa = uefVar.f25306oa;
        this.yo = uefVar.yo;
        this.moa = uefVar.moa;
        this.lw = uefVar.lw;
        this.ivm = uefVar.ivm;
        this.xs = uefVar.xs;
    }
}
