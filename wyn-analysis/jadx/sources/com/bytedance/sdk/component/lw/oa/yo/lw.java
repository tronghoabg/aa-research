package com.bytedance.sdk.component.lw.oa.yo;

import android.content.Context;
import com.bytedance.sdk.component.lw.bs;
import com.bytedance.sdk.component.lw.cq;
import com.bytedance.sdk.component.lw.dhk;
import com.bytedance.sdk.component.lw.sy;
import com.bytedance.sdk.component.lw.tpx;
import com.bytedance.sdk.component.lw.wrv;
import java.util.concurrent.ExecutorService;

/* loaded from: classes.dex */
public class lw implements cq {
    private dhk bcc;
    private tpx cz;
    private com.bytedance.sdk.component.lw.yo ivm;
    private sy lw;
    private bs moa;

    /* renamed from: oa, reason: collision with root package name */
    private ExecutorService f25025oa;
    private wrv uef;
    private com.bytedance.sdk.component.lw.oa xs;
    private com.bytedance.sdk.component.lw.moa yo;
    private boolean zjm;

    public static class uef {
        private dhk bcc;
        private tpx cz;
        private com.bytedance.sdk.component.lw.yo ivm;
        private sy lw;
        private bs moa;

        /* renamed from: oa, reason: collision with root package name */
        private ExecutorService f25026oa;
        private wrv uef;
        private com.bytedance.sdk.component.lw.oa xs;
        private com.bytedance.sdk.component.lw.moa yo;
        private boolean zjm;

        public uef uef(com.bytedance.sdk.component.lw.oa oaVar) {
            this.xs = oaVar;
            return this;
        }

        public uef uef(boolean z2) {
            this.zjm = z2;
            return this;
        }

        public uef uef(tpx tpxVar) {
            this.cz = tpxVar;
            return this;
        }

        public uef uef(dhk dhkVar) {
            this.bcc = dhkVar;
            return this;
        }

        public uef uef(com.bytedance.sdk.component.lw.moa moaVar) {
            this.yo = moaVar;
            return this;
        }

        public lw uef() {
            return new lw(this);
        }
    }

    @Override // com.bytedance.sdk.component.lw.cq
    public tpx ivm() {
        return this.cz;
    }

    @Override // com.bytedance.sdk.component.lw.cq
    public com.bytedance.sdk.component.lw.oa lw() {
        return this.xs;
    }

    @Override // com.bytedance.sdk.component.lw.cq
    public com.bytedance.sdk.component.lw.yo moa() {
        return this.ivm;
    }

    @Override // com.bytedance.sdk.component.lw.cq
    public dhk oa() {
        return this.bcc;
    }

    @Override // com.bytedance.sdk.component.lw.cq
    public ExecutorService uef() {
        return this.f25025oa;
    }

    @Override // com.bytedance.sdk.component.lw.cq
    public boolean xs() {
        return this.zjm;
    }

    @Override // com.bytedance.sdk.component.lw.cq
    public com.bytedance.sdk.component.lw.moa yo() {
        return this.yo;
    }

    private lw(uef uefVar) {
        this.uef = uefVar.uef;
        this.f25025oa = uefVar.f25026oa;
        this.yo = uefVar.yo;
        this.moa = uefVar.moa;
        this.lw = uefVar.lw;
        this.ivm = uefVar.ivm;
        this.xs = uefVar.xs;
        this.bcc = uefVar.bcc;
        this.cz = uefVar.cz;
        this.zjm = uefVar.zjm;
    }

    public static lw uef(Context context) {
        return new uef().uef();
    }
}
