package com.bytedance.sdk.openadsdk.utils;

import android.app.Activity;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import com.applovin.shadow.okio.Segment;
import com.bytedance.sdk.openadsdk.activity.single.TTFullScreenVideoActivity;
import com.bytedance.sdk.openadsdk.activity.single.TTRewardVideoActivity;
import com.bytedance.sdk.openadsdk.common.TTAdDislikeToast;
import com.bytedance.sdk.openadsdk.core.wk.moa.uef;
import com.unity3d.services.UnityAdsConstants;

/* loaded from: classes3.dex */
public class dxx implements Handler.Callback, uef.InterfaceC0105uef {
    private boolean bcc;
    private boolean cz;
    private boolean ivm;
    private final com.bytedance.sdk.openadsdk.component.reward.uef.oa lw;
    private final com.bytedance.sdk.openadsdk.core.model.gzw moa;
    private int wrv;
    private boolean xs;
    private int zjm;
    private float uef = 1.0f;

    /* renamed from: oa, reason: collision with root package name */
    private int f26146oa = 1000;
    private final Handler yo = new Handler(Looper.getMainLooper(), this);
    private int dj = 0;

    public dxx(com.bytedance.sdk.openadsdk.component.reward.uef.oa oaVar, com.bytedance.sdk.openadsdk.core.model.gzw gzwVar) {
        this.zjm = 0;
        this.wrv = 0;
        this.lw = oaVar;
        this.moa = gzwVar;
        if (gzwVar.nyn()) {
            if (gzwVar.ho() >= 0) {
                this.wrv = gzwVar.ho();
            } else {
                this.wrv = com.bytedance.sdk.openadsdk.core.sy.moa().dj(String.valueOf(gzwVar.jnk()));
            }
        } else if (gzwVar.yd()) {
            if (gzwVar.qe() >= 0) {
                this.wrv = gzwVar.qe();
            } else {
                this.wrv = com.bytedance.sdk.openadsdk.core.sy.moa().dhk(String.valueOf(gzwVar.jnk()));
            }
        }
        this.zjm = (int) oaVar.tpx.gb();
        com.bytedance.sdk.component.utils.dhk.uef("TTAD.TopLayoutHelper", "totalTime: " + this.zjm + ", skipTime=" + this.wrv);
    }

    @Override // android.os.Handler.Callback
    public boolean handleMessage(Message message) throws NumberFormatException {
        if (message.what == 1024) {
            int i5 = this.zjm;
            int i10 = this.dj;
            int i11 = i5 - i10;
            this.lw.tpx.uef(i10 * 1000);
            com.bytedance.sdk.component.utils.dhk.uef("TTAD.TopLayoutHelper", "handleMessage: currentTime= " + this.dj + ", mRemainTimeInSeconds=" + i11);
            if (i11 > 0) {
                Activity activity = this.lw.pu;
                if (activity instanceof TTRewardVideoActivity) {
                    ((TTRewardVideoActivity) activity).yo(this.dj * 1000, this.zjm);
                }
                com.bytedance.sdk.openadsdk.component.reward.view.cz czVar = this.lw.gsd;
                boolean z2 = false;
                if (czVar != null && czVar.uef() != null) {
                    this.lw.gsd.uef().setTime(String.valueOf(i11), this.dj, 0, false);
                }
                if (this.moa.nyn()) {
                    com.bytedance.sdk.openadsdk.component.reward.view.cz czVar2 = this.lw.gsd;
                    if (czVar2 != null) {
                        if (czVar2.cz() && this.wrv > 0) {
                            z2 = true;
                        }
                        this.cz = z2;
                    }
                    if (!this.cz || this.dj < this.wrv || this.lw.f25412oa.wxf() == 5 || this.lw.f25412oa.wxf() == 33) {
                        this.lw.dxx.uef(String.valueOf(i11), null);
                    } else {
                        this.lw.uef(true);
                        this.lw.dxx.uef(String.valueOf(i11), TTAdDislikeToast.getSkipText());
                        this.lw.dxx.lw(true);
                    }
                } else if (this.moa.yd() && (this.lw.gsd.cz() || this.lw.f25412oa.ib())) {
                    Activity activity2 = this.lw.pu;
                    if (activity2 instanceof TTFullScreenVideoActivity) {
                        ((TTFullScreenVideoActivity) activity2).uef(this.dj);
                    }
                    this.lw.dxx.moa(true);
                    this.lw.dxx.uef(String.valueOf(i11), null);
                }
                this.dj++;
                if (this.lw.tpx.yo()) {
                    com.bytedance.sdk.openadsdk.core.model.ku kuVarBbb = this.lw.f25412oa.bbb();
                    if (kuVarBbb != null) {
                        float fUef = kuVarBbb.uef();
                        this.uef = fUef;
                        if (fUef <= UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
                            this.uef = 1.0f;
                        }
                    }
                } else {
                    this.uef = 1.0f;
                }
                int i12 = (int) (1000.0f / this.uef);
                com.bytedance.sdk.component.utils.dhk.uef("TTAD.TopLayoutHelper", "handleMessage: next msg intervalInMillis = ".concat(String.valueOf(i12)));
                this.yo.sendEmptyMessageDelayed(message.what, i12);
            }
        }
        return true;
    }

    public void lw() {
        this.yo.removeMessages(Segment.SHARE_MINIMUM);
        this.ivm = false;
        this.bcc = true;
        com.bytedance.sdk.openadsdk.component.reward.uef.oa oaVar = this.lw;
        if (oaVar != null) {
            oaVar.tpx.dxx();
        }
    }

    public void moa() {
        if (!this.ivm || this.xs) {
            return;
        }
        this.yo.removeMessages(Segment.SHARE_MINIMUM);
        this.xs = true;
    }

    public void oa() {
        this.yo.sendEmptyMessage(Segment.SHARE_MINIMUM);
        this.xs = false;
    }

    public boolean uef() {
        return this.ivm;
    }

    public void yo() {
        if (this.ivm) {
            this.yo.removeMessages(Segment.SHARE_MINIMUM);
            this.yo.sendEmptyMessage(Segment.SHARE_MINIMUM);
            this.xs = false;
        }
    }

    public void uef(long j8) {
        int iCeil = (int) Math.ceil(j8 / 1000.0d);
        if (this.xs && !this.bcc) {
            this.dj = iCeil;
            yo();
        } else {
            if (this.ivm || this.bcc) {
                return;
            }
            this.dj = iCeil;
            this.ivm = true;
            oa();
        }
    }

    @Override // com.bytedance.sdk.openadsdk.core.wk.moa.uef.InterfaceC0105uef
    public void uef(int i5) {
        com.bytedance.sdk.component.utils.dhk.uef("TTAD.TopLayoutHelper", "onPlayerStateChanged: ".concat(String.valueOf(i5)));
        if (i5 == 1) {
            yo();
            return;
        }
        if (i5 == 2) {
            moa();
        } else if (i5 == 3 || i5 == 4) {
            lw();
        }
    }
}
