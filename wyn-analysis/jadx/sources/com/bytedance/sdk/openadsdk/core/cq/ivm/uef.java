package com.bytedance.sdk.openadsdk.core.cq.ivm;

import com.bytedance.adsdk.ugeno.core.sy;
import com.bytedance.sdk.component.adexpress.oa.cq;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public class uef extends cq {
    private boolean lw;
    private float moa;

    /* renamed from: oa, reason: collision with root package name */
    private sy f25512oa;
    private JSONObject uef;
    private float yo;

    /* renamed from: com.bytedance.sdk.openadsdk.core.cq.ivm.uef$uef, reason: collision with other inner class name */
    public static class C0081uef extends cq.uef {
        private boolean lw;
        private float moa;

        /* renamed from: oa, reason: collision with root package name */
        private sy f25517oa;
        private JSONObject uef;
        private float yo;

        public C0081uef ivm(boolean z2) {
            this.lw = z2;
            return this;
        }

        public C0081uef oa(float f10) {
            this.moa = f10;
            return this;
        }

        @Override // com.bytedance.sdk.component.adexpress.oa.cq.uef
        /* renamed from: oa, reason: merged with bridge method [inline-methods] */
        public uef uef() {
            return new uef(this);
        }

        public C0081uef uef(JSONObject jSONObject) {
            this.uef = jSONObject;
            return this;
        }

        public C0081uef uef(sy syVar) {
            this.f25517oa = syVar;
            return this;
        }

        public C0081uef uef(float f10) {
            this.yo = f10;
            return this;
        }
    }

    public uef(C0081uef c0081uef) {
        super(c0081uef);
        this.uef = c0081uef.uef;
        this.f25512oa = c0081uef.f25517oa;
        this.yo = c0081uef.yo;
        this.moa = c0081uef.moa;
        this.lw = c0081uef.lw;
    }

    public float cp() {
        return this.yo;
    }

    public sy dxx() {
        return this.f25512oa;
    }

    public JSONObject fz() {
        return this.uef;
    }

    public float ku() {
        return this.moa;
    }

    public boolean lz() {
        return this.lw;
    }
}
