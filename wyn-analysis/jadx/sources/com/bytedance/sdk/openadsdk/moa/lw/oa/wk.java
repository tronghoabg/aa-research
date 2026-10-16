package com.bytedance.sdk.openadsdk.moa.lw.oa;

import com.bytedance.sdk.openadsdk.core.model.gzw;

/* loaded from: classes3.dex */
public class wk {
    private gzw lw;
    private com.bykv.vk.openvk.uef.uef.uef.yo.yo moa;

    /* renamed from: oa, reason: collision with root package name */
    private String f25962oa;
    private long uef;
    private int yo;

    public static class uef {
        private int bcc;
        private int cz;
        private int dj;
        private com.bykv.vk.openvk.uef.uef.uef.yo.uef dz;
        private boolean lw;
        private boolean moa;
        private int wrv;
        private int zjm;
        private long uef = 0;

        /* renamed from: oa, reason: collision with root package name */
        private long f25963oa = 0;
        private long yo = 0;
        private long ivm = 0;
        private boolean xs = false;
        private boolean cq = false;

        private void ab() {
            long j8 = this.yo;
            if (j8 > 0) {
                long j10 = this.uef;
                if (j10 > j8) {
                    long j11 = j10 % j8;
                    this.uef = j11;
                    if (j11 == 0) {
                        this.uef = j8;
                    }
                }
            }
        }

        public int bcc() {
            return this.zjm;
        }

        public com.bykv.vk.openvk.uef.uef.uef.yo.uef cq() {
            return this.dz;
        }

        public int cz() {
            return this.dj;
        }

        public boolean dj() {
            return this.cq;
        }

        public boolean dz() {
            return this.moa;
        }

        public int ivm() {
            return this.cz;
        }

        public int lw() {
            return this.bcc;
        }

        public long moa() {
            return this.yo;
        }

        public long oa() {
            return this.uef;
        }

        public long uef() {
            return this.ivm;
        }

        public boolean wk() {
            return this.lw;
        }

        public boolean wrv() {
            return this.xs;
        }

        public int xs() {
            long j8 = this.yo;
            if (j8 <= 0) {
                return 0;
            }
            return Math.min((int) ((this.uef * 100) / j8), 100);
        }

        public long yo() {
            return this.f25963oa;
        }

        public int zjm() {
            return this.wrv;
        }

        public void moa(long j8) {
            this.yo = j8;
            ab();
        }

        public void oa(long j8) {
            this.uef = j8;
            ab();
        }

        public void uef(long j8) {
            this.ivm = j8;
        }

        public void yo(long j8) {
            this.f25963oa = j8;
        }

        public void uef(int i5) {
            this.bcc = i5;
        }

        public void yo(int i5) {
            this.zjm = i5;
        }

        public void moa(int i5) {
            this.wrv = i5;
        }

        public void oa(int i5) {
            this.cz = i5;
        }

        public void uef(boolean z2) {
            this.xs = z2;
        }

        public void yo(boolean z2) {
            this.lw = z2;
        }

        public void oa(boolean z2) {
            this.moa = z2;
        }

        public void uef(com.bykv.vk.openvk.uef.uef.uef.yo.uef uefVar) {
            this.dz = uefVar;
        }
    }

    public wk(long j8, String str, int i5, com.bykv.vk.openvk.uef.uef.uef.yo.yo yoVar, gzw gzwVar) {
        this.uef = j8;
        this.f25962oa = str;
        this.yo = i5;
        this.moa = yoVar;
        this.lw = gzwVar;
    }

    public gzw lw() {
        return this.lw;
    }

    public com.bykv.vk.openvk.uef.uef.uef.yo.yo moa() {
        return this.moa;
    }

    public String oa() {
        return this.f25962oa;
    }

    public long uef() {
        return this.uef;
    }

    public int yo() {
        return this.yo;
    }
}
