package com.bytedance.sdk.openadsdk.component.reward.uef;

import android.os.Handler;
import android.os.Message;
import com.bytedance.sdk.component.utils.dhk;
import com.bytedance.sdk.openadsdk.core.model.cp;
import com.bytedance.sdk.openadsdk.orq.uef.uef;
import com.bytedance.sdk.openadsdk.utils.DeviceUtils;
import org.json.JSONException;

/* loaded from: classes3.dex */
public class bcc extends zjm implements Handler.Callback {
    private final Handler dhk;
    private int gr;
    private boolean gsd;
    private int gzw;
    boolean ivm;
    int lw;
    int moa;

    /* renamed from: oa, reason: collision with root package name */
    long f25392oa;
    private int orq;
    private int rt;
    private boolean tpx;

    /* renamed from: ue, reason: collision with root package name */
    private boolean f25393ue;
    boolean uef;
    protected int xs;
    int yo;

    public bcc(oa oaVar) {
        super(oaVar);
        this.dhk = new Handler(this);
        this.uef = false;
        this.f25392oa = 0L;
        this.yo = 0;
        this.moa = 0;
        this.lw = 0;
        this.ivm = false;
        this.tpx = false;
        this.orq = 0;
        this.gsd = false;
        this.rt = 0;
        this.gr = 0;
        this.f25393ue = false;
        this.xs = cp.cz(this.zjm);
        this.moa = this.zjm.ovw();
        int iYc = this.zjm.yc();
        this.lw = iYc;
        this.rt = Math.max(0, this.moa - iYc);
    }

    private boolean ab() {
        if (this.wrv.vjj) {
            return false;
        }
        int i5 = this.xs;
        return 1 == i5 || 2 == i5;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void bs() {
        int i5 = !this.gsd ? this.lw - this.yo : this.lw + this.gr;
        int i10 = com.bytedance.sdk.openadsdk.core.sy.moa().ue(String.valueOf(this.wrv.ivm)).ivm;
        int i11 = this.moa;
        boolean z2 = false;
        boolean z10 = i11 <= 0 || (((float) i5) / ((float) i11)) * 100.0f >= ((float) i10);
        int iUef = com.bytedance.sdk.openadsdk.core.sy.moa().uef(String.valueOf(this.wrv.ivm));
        if (iUef == 0) {
            com.bytedance.sdk.openadsdk.orq.uef.uef uefVar = this.sy;
            boolean zIvm = uefVar != null ? uefVar.ivm() : false;
            if (this.wk) {
                zIvm = true;
            }
            if (z10 && zIvm) {
                z2 = true;
            }
        } else if (iUef == 1) {
            z2 = z10;
        }
        if (z2) {
            this.wrv.gb.oa(true);
        }
    }

    private boolean sy() {
        return this.bcc && cp.yo(this.wrv.f25412oa) && !this.oib.get();
    }

    @Override // com.bytedance.sdk.openadsdk.component.reward.uef.zjm
    public int bcc() {
        return this.gzw;
    }

    @Override // com.bytedance.sdk.openadsdk.component.reward.uef.zjm
    public void cz() {
        if (this.dz) {
            this.tpx = true;
            this.dhk.removeMessages(900);
            this.dhk.removeMessages(600);
        }
    }

    @Override // android.os.Handler.Callback
    public boolean handleMessage(Message message) {
        if (message.what != 900 || !sy()) {
            return true;
        }
        int i5 = message.arg1;
        boolean z2 = false;
        if (this.gsd) {
            int i10 = this.lw;
            int i11 = this.gr;
            int i12 = i10 + i11;
            int i13 = this.moa;
            if (i12 < i13) {
                this.gr = i11 + 1;
                Message messageObtain = Message.obtain();
                messageObtain.what = 900;
                messageObtain.arg1 = 0;
                this.dhk.sendMessageDelayed(messageObtain, 1000L);
            } else {
                this.gr = i13 - i10;
            }
        } else if (i5 > 0) {
            if (this.orq == 0 && 2 == this.xs) {
                z2 = true;
            }
            this.wrv.dxx.moa(true);
            if (!z2) {
                this.wrv.dxx.uef(String.valueOf(i5), null);
            }
            Message messageObtain2 = Message.obtain();
            messageObtain2.what = 900;
            int i14 = i5 - 1;
            messageObtain2.arg1 = i14;
            this.dhk.sendMessageDelayed(messageObtain2, 1000L);
            this.yo = i14;
            this.gzw = i5;
        } else {
            this.ivm = true;
            if (!cp.bcc(this.zjm) || (cp.dhk(this.zjm) && this.sy.lw())) {
                this.wrv.dxx.moa(false);
                this.wrv.f25409ab.set(true);
                this.wrv.f25410hg.cq();
            } else {
                this.wrv.dxx.yo();
                this.wrv.dxx.lw(true);
            }
            com.bytedance.sdk.openadsdk.orq.uef.uef uefVar = this.sy;
            if (uefVar == null || uefVar.lw()) {
                this.wk = true;
            }
            if (this.rt > 0) {
                this.gsd = true;
                this.gr++;
                Message messageObtain3 = Message.obtain();
                messageObtain3.what = 900;
                messageObtain3.arg1 = 0;
                this.dhk.sendMessageDelayed(messageObtain3, 1000L);
            }
            this.gzw = 0;
        }
        bs();
        return true;
    }

    @Override // com.bytedance.sdk.openadsdk.component.reward.uef.zjm
    public void ivm() {
        if (this.dz && !this.f25437ab) {
            super.ivm();
            this.dhk.removeCallbacksAndMessages(null);
        }
    }

    @Override // com.bytedance.sdk.openadsdk.component.reward.uef.zjm
    public void lw() {
        if (this.dz) {
            super.lw();
            cz();
        }
    }

    @Override // com.bytedance.sdk.openadsdk.component.reward.uef.zjm
    public void moa() throws JSONException {
        com.bytedance.sdk.openadsdk.core.widget.oa oaVar;
        if (this.dz) {
            super.moa();
            if (DeviceUtils.xs() == 0) {
                this.wrv.gem = true;
            }
            oa oaVar2 = this.wrv;
            if (oaVar2.gem) {
                oaVar2.dxx.oa(true);
                yo(true);
            }
            com.bytedance.sdk.openadsdk.component.reward.oa.oa oaVar3 = this.wrv.f25410hg;
            if ((oaVar3 == null || (oaVar = oaVar3.wrv) == null || !oaVar.isShowing()) && dj() && xs() > 0) {
                uef(0L);
            }
        }
    }

    @Override // com.bytedance.sdk.openadsdk.component.reward.uef.zjm
    public int xs() {
        return this.yo;
    }

    @Override // com.bytedance.sdk.openadsdk.component.reward.uef.zjm
    public void yo() throws JSONException {
        if (this.dz) {
            this.bcc = true;
            boolean zAb = ab();
            if (zAb) {
                this.sy.uef(new uef.InterfaceC0133uef() { // from class: com.bytedance.sdk.openadsdk.component.reward.uef.bcc.2
                    @Override // com.bytedance.sdk.openadsdk.orq.uef.uef.InterfaceC0133uef
                    public void uef(int i5) {
                        if (bcc.this.f25393ue) {
                            return;
                        }
                        bcc.this.orq = i5;
                        bcc.this.sy.uef((uef.InterfaceC0133uef) null);
                        bcc.this.oa(i5);
                    }
                });
            }
            this.sy.uef();
            if (cp.bcc(this.zjm)) {
                this.wrv.ku.ivm();
            }
            this.f25392oa = System.currentTimeMillis();
            if (!zAb) {
                oa(0);
            }
            this.wrv.gb.hg();
            com.bytedance.sdk.openadsdk.component.reward.wrv wrvVar = this.wrv.xvp;
            if (wrvVar != null) {
                wrvVar.uef(this.moa);
            }
        }
    }

    @Override // com.bytedance.sdk.openadsdk.component.reward.uef.zjm
    public boolean zjm() {
        return this.ivm;
    }

    @Override // com.bytedance.sdk.openadsdk.component.reward.uef.zjm
    public com.bytedance.sdk.openadsdk.cq.xs oa() {
        return new com.bytedance.sdk.openadsdk.cq.xs() { // from class: com.bytedance.sdk.openadsdk.component.reward.uef.bcc.1
            @Override // com.bytedance.sdk.openadsdk.cq.xs
            public void uef() {
                bcc.this.bs();
            }
        };
    }

    @Override // com.bytedance.sdk.openadsdk.component.reward.uef.zjm
    public void uef() {
        if (this.dz && !this.cq) {
            super.uef();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void oa(int i5) {
        uef(this.lw);
        if (this.tpx) {
            return;
        }
        Handler handler = this.dhk;
        handler.sendMessage(handler.obtainMessage(900, this.lw, i5));
    }

    @Override // com.bytedance.sdk.openadsdk.component.reward.uef.zjm
    public void uef(boolean z2) {
        if (this.bs != null) {
            try {
                com.bytedance.sdk.openadsdk.orq.uef.oa oaVarUef = com.bytedance.sdk.openadsdk.orq.uef.moa.uef().uef(this.zjm, this.bs, oa());
                this.sy = oaVarUef;
                oaVarUef.uef(this.wrv.gb);
            } catch (Throwable th) {
                dhk.yo("RVIVPlayableNewManager", "PreRender injection exception" + th.getMessage());
            }
            if (this.sy == null) {
                super.uef(z2);
            }
        }
    }

    @Override // com.bytedance.sdk.openadsdk.component.reward.uef.zjm
    public void uef(int i5) {
        this.yo = i5;
        this.gzw = i5;
    }

    @Override // com.bytedance.sdk.openadsdk.component.reward.uef.zjm
    public void uef(long j8) {
        if (this.dz && this.bcc && !this.wrv.zjm.get() && this.tpx) {
            this.tpx = false;
            Message messageObtain = Message.obtain();
            messageObtain.what = 900;
            messageObtain.arg1 = xs();
            messageObtain.arg2 = this.orq;
            this.dhk.sendMessageDelayed(messageObtain, j8);
        }
    }
}
