package com.bytedance.sdk.openadsdk.component.reward;

import android.graphics.SurfaceTexture;
import android.os.CountDownTimer;
import com.bykv.vk.openvk.uef.uef.uef.moa.yo;
import com.bytedance.sdk.openadsdk.core.model.gzw;
import com.bytedance.sdk.openadsdk.core.wk.moa.uef;
import com.bytedance.sdk.openadsdk.moa.lw.oa.wk;
import org.json.JSONException;

/* loaded from: classes3.dex */
public class moa implements com.bykv.vk.openvk.uef.uef.uef.moa.yo {
    private uef.InterfaceC0105uef bcc;

    /* renamed from: oa, reason: collision with root package name */
    private final gzw f25379oa;
    private final uef uef;
    private long xs;
    private final com.bykv.vk.openvk.uef.uef.uef.oa.uef yo;
    private boolean moa = true;
    private long lw = 0;
    private boolean ivm = false;

    public static class uef implements com.bykv.vk.openvk.uef.uef.uef.uef {
        private long bcc;
        private long cz;
        private CountDownTimer ivm;
        private int lw = 0;
        private long moa;

        /* renamed from: oa, reason: collision with root package name */
        private final com.bykv.vk.openvk.uef.uef.uef.oa.uef f25380oa;
        private final long uef;
        private yo.uef xs;
        private final com.bytedance.sdk.openadsdk.moa.xs yo;

        public uef(long j8, com.bykv.vk.openvk.uef.uef.uef.oa.uef uefVar, com.bytedance.sdk.openadsdk.moa.xs xsVar) {
            this.uef = j8;
            this.f25380oa = uefVar;
            this.yo = xsVar;
        }

        public long ab() {
            return this.uef;
        }

        @Override // com.bykv.vk.openvk.uef.uef.uef.uef
        public boolean bcc() {
            return this.lw == 0;
        }

        public long bs() {
            return this.bcc;
        }

        public void cq() {
            this.lw = 0;
            CountDownTimer countDownTimer = this.ivm;
            if (countDownTimer != null) {
                countDownTimer.cancel();
                this.ivm = null;
            }
            if (this.xs != null) {
                this.xs = null;
            }
        }

        public long cz() {
            return this.cz;
        }

        public void dj() {
            if (this.lw == 1) {
                return;
            }
            this.lw = 1;
            final long jAb = ab();
            if (this.moa >= jAb) {
                this.moa = 0L;
            }
            final long j8 = jAb - this.moa;
            CountDownTimer countDownTimer = new CountDownTimer(j8, 200L) { // from class: com.bytedance.sdk.openadsdk.component.reward.moa.uef.1
                @Override // android.os.CountDownTimer
                public void onFinish() throws JSONException {
                    if (uef.this.xs != null) {
                        yo.uef uefVar = uef.this.xs;
                        long j10 = jAb;
                        uefVar.uef(j10, j10);
                    }
                    uef.this.lw = 4;
                    uef.this.bcc = jAb;
                    uef.this.moa = jAb;
                    if (uef.this.xs != null) {
                        uef.this.xs.uef(uef.this.bs(), 100);
                    }
                    wk.uef uefVar2 = new wk.uef();
                    uefVar2.oa(jAb);
                    uefVar2.moa(jAb);
                    uefVar2.yo(uef.this.dz());
                    uefVar2.moa(uef.this.wk());
                    uefVar2.uef(uef.this.cz());
                    com.bytedance.sdk.openadsdk.moa.lw.uef.uef.oa(uef.this.f25380oa, uefVar2, uef.this.yo);
                }

                @Override // android.os.CountDownTimer
                public void onTick(long j10) {
                    long j11 = (j8 - j10) + uef.this.moa;
                    uef.this.bcc = j11;
                    if (uef.this.xs != null) {
                        uef.this.xs.uef(j11, jAb);
                    }
                }
            };
            this.ivm = countDownTimer;
            countDownTimer.start();
        }

        public long dz() {
            return 0L;
        }

        @Override // com.bykv.vk.openvk.uef.uef.uef.uef
        public int lw() {
            return 0;
        }

        @Override // com.bykv.vk.openvk.uef.uef.uef.uef
        public int moa() {
            return 0;
        }

        @Override // com.bykv.vk.openvk.uef.uef.uef.uef
        public boolean uef() {
            return false;
        }

        public int wk() {
            return 0;
        }

        public void wrv() {
            this.lw = 2;
            this.moa = this.bcc;
            CountDownTimer countDownTimer = this.ivm;
            if (countDownTimer != null) {
                countDownTimer.cancel();
                this.ivm = null;
            }
        }

        @Override // com.bykv.vk.openvk.uef.uef.uef.uef
        public boolean xs() {
            return this.lw == 2;
        }

        @Override // com.bykv.vk.openvk.uef.uef.uef.uef
        public boolean yo() {
            return false;
        }

        public void zjm() {
            this.bcc = 0L;
            dj();
        }

        @Override // com.bykv.vk.openvk.uef.uef.uef.uef
        public boolean ivm() {
            return this.lw == 1;
        }

        @Override // com.bykv.vk.openvk.uef.uef.uef.uef
        public boolean oa() {
            return this.lw == 4;
        }

        public void oa(long j8) {
            this.moa = j8;
        }

        public void uef(long j8) {
            this.cz = j8;
        }

        public void uef(yo.uef uefVar) {
            this.xs = uefVar;
        }
    }

    public moa(gzw gzwVar, com.bytedance.sdk.openadsdk.moa.xs xsVar) {
        com.bykv.vk.openvk.uef.uef.uef.oa.uef uefVar = new com.bykv.vk.openvk.uef.uef.uef.oa.uef() { // from class: com.bytedance.sdk.openadsdk.component.reward.moa.1
        };
        this.yo = uefVar;
        this.f25379oa = gzwVar;
        com.bykv.vk.openvk.uef.uef.uef.yo.oa oaVarNj = gzwVar.nj();
        long j8 = 10;
        long jIvm = oaVarNj != null ? (long) oaVarNj.ivm() : 10L;
        if (jIvm <= 0) {
            oaVarNj.uef(10.0d);
        } else {
            j8 = jIvm;
        }
        this.uef = new uef(j8 * 1000, uefVar, xsVar);
    }

    public long ab() {
        return this.xs;
    }

    @Override // com.bykv.vk.openvk.uef.uef.uef.moa.yo
    public int bcc() {
        return 0;
    }

    public com.bykv.vk.openvk.uef.uef.uef.oa.uef bs() {
        return this.yo;
    }

    @Override // com.bykv.vk.openvk.uef.uef.uef.moa.yo
    public boolean cq() {
        return this.uef.oa();
    }

    @Override // com.bykv.vk.openvk.uef.uef.uef.moa.yo
    public long cz() {
        return this.uef.ab();
    }

    @Override // com.bykv.vk.openvk.uef.uef.uef.moa.yo
    public com.bykv.vk.openvk.uef.uef.uef.uef dj() {
        return this.uef;
    }

    @Override // com.bykv.vk.openvk.uef.uef.uef.moa.yo
    public boolean dz() {
        return false;
    }

    @Override // com.bykv.vk.openvk.uef.uef.uef.moa.yo
    public long ivm() {
        return this.uef.bs();
    }

    @Override // com.bykv.vk.openvk.uef.uef.uef.moa.yo
    public void lw() {
        moa();
    }

    @Override // com.bykv.vk.openvk.uef.uef.uef.moa.yo
    public void moa() {
        this.uef.cq();
    }

    @Override // com.bykv.vk.openvk.uef.uef.uef.moa.yo
    public void oa() {
        this.uef.wrv();
        wk.uef uefVar = new wk.uef();
        uefVar.oa(ivm());
        uefVar.moa(cz());
        uefVar.yo(xs());
        uefVar.uef(ab());
        com.bytedance.sdk.openadsdk.moa.lw.uef.uef.uef(this.yo, uefVar);
        uef.InterfaceC0105uef interfaceC0105uef = this.bcc;
        if (interfaceC0105uef != null) {
            interfaceC0105uef.uef(2);
        }
    }

    @Override // com.bykv.vk.openvk.uef.uef.uef.moa.yo
    public void uef(SurfaceTexture surfaceTexture) {
    }

    @Override // com.bykv.vk.openvk.uef.uef.uef.moa.yo
    public boolean wk() {
        return false;
    }

    @Override // com.bykv.vk.openvk.uef.uef.uef.moa.yo
    public com.bykv.vk.openvk.uef.uef.uef.moa.oa wrv() {
        return null;
    }

    @Override // com.bykv.vk.openvk.uef.uef.uef.moa.yo
    public long xs() {
        return 0L;
    }

    @Override // com.bykv.vk.openvk.uef.uef.uef.moa.yo
    public void yo() throws JSONException {
        this.uef.dj();
        wk.uef uefVar = new wk.uef();
        uefVar.oa(ivm());
        uefVar.moa(cz());
        uefVar.yo(xs());
        com.bytedance.sdk.openadsdk.moa.lw.uef.uef.oa(this.yo, uefVar);
        uef.InterfaceC0105uef interfaceC0105uef = this.bcc;
        if (interfaceC0105uef != null) {
            interfaceC0105uef.uef(1);
        }
    }

    @Override // com.bykv.vk.openvk.uef.uef.uef.moa.yo
    public int zjm() {
        return com.bykv.vk.openvk.uef.uef.oa.moa.uef.uef(this.uef.bcc, this.uef.uef);
    }

    @Override // com.bykv.vk.openvk.uef.uef.uef.moa.yo
    public boolean uef(float f10) {
        return false;
    }

    @Override // com.bykv.vk.openvk.uef.uef.uef.moa.yo
    public void uef(long j8) {
        this.xs = j8;
        uef uefVar = this.uef;
        if (uefVar != null) {
            uefVar.uef(j8);
        }
    }

    @Override // com.bykv.vk.openvk.uef.uef.uef.moa.yo
    public void uef(boolean z2, int i5) {
        moa();
    }

    @Override // com.bykv.vk.openvk.uef.uef.uef.moa.yo
    public boolean uef(com.bykv.vk.openvk.uef.uef.uef.yo.yo yoVar) throws JSONException {
        this.ivm = yoVar.dj();
        if (yoVar.zjm() > 0) {
            this.uef.oa(yoVar.zjm());
        }
        yoVar.oa(com.bytedance.sdk.openadsdk.gzw.lw.uef("player_force_raw_url", 0) == 1);
        com.bytedance.sdk.openadsdk.moa.lw.uef.uef.uef(this.f25379oa, this.yo, yoVar);
        this.uef.dj();
        uef.InterfaceC0105uef interfaceC0105uef = this.bcc;
        if (interfaceC0105uef != null) {
            interfaceC0105uef.uef(1);
        }
        return true;
    }

    @Override // com.bykv.vk.openvk.uef.uef.uef.moa.yo
    public void uef(boolean z2, String str) {
        this.ivm = z2;
    }

    @Override // com.bykv.vk.openvk.uef.uef.uef.moa.yo
    public void uef(yo.uef uefVar) {
        this.uef.uef(uefVar);
    }

    public void uef(uef.InterfaceC0105uef interfaceC0105uef) {
        this.bcc = interfaceC0105uef;
    }

    @Override // com.bykv.vk.openvk.uef.uef.uef.moa.yo
    public void uef() {
        this.uef.zjm();
    }
}
