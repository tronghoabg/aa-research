package com.bytedance.sdk.component.ivm.uef;

/* loaded from: classes.dex */
public class uef {
    private lw bcc;
    private boolean cz;
    private int dj;
    private com.bytedance.sdk.component.ivm.uef.moa.oa.uef ivm;
    private com.bytedance.sdk.component.ivm.uef.moa.oa.uef lw;
    private com.bytedance.sdk.component.ivm.uef.moa.oa.uef moa;

    /* renamed from: oa, reason: collision with root package name */
    private com.bytedance.sdk.component.ivm.uef.oa.yo f25007oa;
    private com.bytedance.sdk.component.ivm.uef.uef.lw uef;
    private long wrv;
    private com.bytedance.sdk.component.ivm.uef.moa.oa.uef xs;
    private com.bytedance.sdk.component.ivm.uef.moa.oa.uef yo;
    private int zjm;

    /* renamed from: com.bytedance.sdk.component.ivm.uef.uef$uef, reason: collision with other inner class name */
    public static class C0060uef {
        private boolean bcc;
        private long dj;
        private lw ivm;
        private com.bytedance.sdk.component.ivm.uef.moa.oa.uef lw;
        private com.bytedance.sdk.component.ivm.uef.moa.oa.uef moa;

        /* renamed from: oa, reason: collision with root package name */
        private com.bytedance.sdk.component.ivm.uef.moa.oa.uef f25011oa;
        private com.bytedance.sdk.component.ivm.uef.oa.yo uef;
        private com.bytedance.sdk.component.ivm.uef.uef.lw xs;
        private com.bytedance.sdk.component.ivm.uef.moa.oa.uef yo;
        private int cz = 5000;
        private int zjm = 10;

        public C0060uef oa(com.bytedance.sdk.component.ivm.uef.moa.oa.uef uefVar) {
            this.yo = uefVar;
            return this;
        }

        public C0060uef uef(long j8) {
            this.dj = j8;
            return this;
        }

        public C0060uef yo(com.bytedance.sdk.component.ivm.uef.moa.oa.uef uefVar) {
            this.moa = uefVar;
            return this;
        }

        public C0060uef oa(int i5) {
            this.zjm = i5;
            return this;
        }

        public C0060uef uef(com.bytedance.sdk.component.ivm.uef.uef.lw lwVar) {
            this.xs = lwVar;
            return this;
        }

        public C0060uef uef(lw lwVar) {
            this.ivm = lwVar;
            return this;
        }

        public C0060uef uef(com.bytedance.sdk.component.ivm.uef.moa.oa.uef uefVar) {
            this.f25011oa = uefVar;
            return this;
        }

        public C0060uef uef(com.bytedance.sdk.component.ivm.uef.oa.yo yoVar) {
            this.uef = yoVar;
            return this;
        }

        public C0060uef uef(int i5) {
            this.cz = i5;
            return this;
        }

        public uef uef() {
            uef uefVar = new uef();
            uefVar.f25007oa = this.uef;
            uefVar.yo = this.f25011oa;
            uefVar.moa = this.yo;
            uefVar.lw = this.moa;
            uefVar.ivm = this.lw;
            uefVar.bcc = this.ivm;
            uefVar.uef = this.xs;
            uefVar.cz = this.bcc;
            uefVar.dj = this.zjm;
            uefVar.zjm = this.cz;
            uefVar.wrv = this.dj;
            return uefVar;
        }
    }

    public com.bytedance.sdk.component.ivm.uef.moa.oa.uef bcc() {
        return this.moa;
    }

    public com.bytedance.sdk.component.ivm.uef.moa.oa.uef cz() {
        return this.lw;
    }

    public int dj() {
        return this.zjm;
    }

    public com.bytedance.sdk.component.ivm.uef.moa.oa.uef ivm() {
        return this.xs;
    }

    public long lw() {
        return this.wrv;
    }

    public int wrv() {
        return this.dj;
    }

    public com.bytedance.sdk.component.ivm.uef.moa.oa.uef xs() {
        return this.yo;
    }

    public com.bytedance.sdk.component.ivm.uef.oa.yo zjm() {
        return this.f25007oa;
    }

    private uef() {
        this.zjm = 200;
        this.dj = 10;
    }

    public lw moa() {
        return this.bcc;
    }

    public boolean yo() {
        return this.cz;
    }

    public com.bytedance.sdk.component.ivm.uef.moa.oa.uef oa() {
        return this.ivm;
    }

    public com.bytedance.sdk.component.ivm.uef.uef.lw uef() {
        return this.uef;
    }
}
