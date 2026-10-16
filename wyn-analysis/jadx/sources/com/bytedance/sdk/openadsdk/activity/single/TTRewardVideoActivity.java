package com.bytedance.sdk.openadsdk.activity.single;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.FrameLayout;
import com.bytedance.sdk.component.utils.dhk;
import com.bytedance.sdk.component.utils.orq;
import com.bytedance.sdk.component.utils.sy;
import com.bytedance.sdk.openadsdk.BuildConfig;
import com.bytedance.sdk.openadsdk.common.TTAdDislikeToast;
import com.bytedance.sdk.openadsdk.common.ab;
import com.bytedance.sdk.openadsdk.common.uef;
import com.bytedance.sdk.openadsdk.component.reward.wrv;
import com.bytedance.sdk.openadsdk.core.gsd;
import com.bytedance.sdk.openadsdk.core.gzw;
import com.bytedance.sdk.openadsdk.core.model.cp;
import com.bytedance.sdk.openadsdk.core.model.gzw;
import com.bytedance.sdk.openadsdk.core.widget.oa;
import com.bytedance.sdk.openadsdk.moa.zjm;
import com.bytedance.sdk.openadsdk.utils.gb;
import com.bytedance.sdk.openadsdk.utils.km;
import com.bytedance.sdk.openadsdk.utils.ue;
import com.google.android.gms.common.api.f;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public class TTRewardVideoActivity extends TTBaseVideoActivity {
    private static String dhk;
    private static com.bytedance.sdk.openadsdk.uef.lw.uef gr;
    private static String gzw;
    private static String oib;
    private static String orq;
    private static String tpx;

    /* renamed from: ab, reason: collision with root package name */
    protected int f25198ab;
    protected int bs;
    private String gsd;
    private String rt;
    protected com.bytedance.sdk.openadsdk.uef.lw.uef sy;

    /* renamed from: ue, reason: collision with root package name */
    private final AtomicBoolean f25199ue = new AtomicBoolean(false);
    private int pz = -1;

    /* JADX INFO: Access modifiers changed from: private */
    public void rl() {
        toString();
        com.bytedance.sdk.openadsdk.uef.lw.uef uefVar = this.sy;
        if (uefVar != null) {
            uefVar.onAdClicked();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:17:0x00a1  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void sk() {
        /*
            r3 = this;
            com.bytedance.sdk.openadsdk.moa.lw.oa.wk$uef r0 = new com.bytedance.sdk.openadsdk.moa.lw.oa.wk$uef
            r0.<init>()
            com.bytedance.sdk.openadsdk.component.reward.uef.oa r1 = r3.f25164oa
            com.bytedance.sdk.openadsdk.component.reward.uef.bs r1 = r1.tpx
            long r1 = r1.cq()
            r0.oa(r1)
            com.bytedance.sdk.openadsdk.component.reward.uef.oa r1 = r3.f25164oa
            com.bytedance.sdk.openadsdk.component.reward.uef.bs r1 = r1.tpx
            long r1 = r1.gr()
            r0.moa(r1)
            com.bytedance.sdk.openadsdk.component.reward.uef.oa r1 = r3.f25164oa
            com.bytedance.sdk.openadsdk.component.reward.uef.bs r1 = r1.tpx
            long r1 = r1.bs()
            r0.yo(r1)
            r1 = 3
            r0.yo(r1)
            com.bytedance.sdk.openadsdk.component.reward.uef.oa r1 = r3.f25164oa
            com.bytedance.sdk.openadsdk.component.reward.uef.bs r1 = r1.tpx
            int r1 = r1.rt()
            r0.moa(r1)
            com.bytedance.sdk.openadsdk.component.reward.uef.oa r1 = r3.f25164oa
            com.bytedance.sdk.openadsdk.component.reward.uef.bs r1 = r1.tpx
            long r1 = r1.oa()
            r0.uef(r1)
            com.bytedance.sdk.openadsdk.component.reward.uef.oa r1 = r3.f25164oa
            com.bytedance.sdk.openadsdk.component.reward.uef.bs r1 = r1.tpx
            com.bykv.vk.openvk.uef.uef.uef.oa.uef r1 = r1.bcc()
            com.bytedance.sdk.openadsdk.component.reward.uef.oa r2 = r3.f25164oa
            com.bytedance.sdk.openadsdk.component.reward.uef.bs r2 = r2.tpx
            com.bytedance.sdk.openadsdk.moa.xs r2 = r2.lw()
            com.bytedance.sdk.openadsdk.moa.lw.uef.uef.uef(r1, r0, r2)
            com.bytedance.sdk.openadsdk.component.reward.uef.oa r0 = r3.f25164oa
            int r0 = r0.ivm
            com.bytedance.sdk.openadsdk.core.pz.yo(r0)
            com.bytedance.sdk.openadsdk.component.reward.uef.oa r0 = r3.f25164oa
            com.bytedance.sdk.openadsdk.component.reward.uef.bs r0 = r0.tpx
            java.lang.String r1 = "skip"
            r2 = 0
            r0.uef(r1, r2)
            com.bytedance.sdk.openadsdk.component.reward.uef.oa r0 = r3.f25164oa
            boolean r1 = r0.yo
            if (r1 == 0) goto La1
            com.bytedance.sdk.openadsdk.core.model.gzw r0 = r0.f25412oa
            boolean r0 = com.bytedance.sdk.openadsdk.core.model.dhk.yo(r0)
            r1 = 4
            r2 = 1
            if (r0 == 0) goto L8a
            com.bytedance.sdk.openadsdk.component.reward.uef.oa r0 = r3.f25164oa
            com.bytedance.sdk.openadsdk.component.reward.view.cz r0 = r0.gsd
            com.bytedance.sdk.openadsdk.component.reward.view.yo r0 = r0.uef()
            if (r0 == 0) goto L86
            int r0 = r0.moa
            if (r0 != 0) goto L86
            r3.finish()
            goto L8d
        L86:
            r3.uef(r2, r1)
            goto L8d
        L8a:
            r3.uef(r2, r1)
        L8d:
            com.bytedance.sdk.openadsdk.component.reward.uef.oa r0 = r3.f25164oa
            com.bytedance.sdk.openadsdk.core.model.gzw r0 = r0.f25412oa
            boolean r0 = com.bytedance.sdk.openadsdk.core.model.dhk.uef(r0)
            if (r0 == 0) goto La4
            com.bytedance.sdk.openadsdk.component.reward.uef.oa r0 = r3.f25164oa
            java.util.concurrent.atomic.AtomicBoolean r0 = r0.cq
            boolean r0 = r0.get()
            if (r0 != 0) goto La4
        La1:
            r3.finish()
        La4:
            com.bytedance.sdk.openadsdk.component.reward.uef.oa r0 = r3.f25164oa
            com.bytedance.sdk.openadsdk.core.model.gzw r0 = r0.f25412oa
            com.bytedance.sdk.openadsdk.core.model.moa r0 = r0.odd()
            if (r0 == 0) goto Lc2
            com.bytedance.sdk.openadsdk.core.dz.moa r0 = r0.uef()
            if (r0 == 0) goto Lc2
            com.bytedance.sdk.openadsdk.component.reward.uef.oa r1 = r3.f25164oa
            com.bytedance.sdk.openadsdk.component.reward.uef.bs r1 = r1.tpx
            long r1 = r1.cq()
            r0.ivm(r1)
            r0.lw(r1)
        Lc2:
            com.bytedance.sdk.openadsdk.component.reward.uef.oa r0 = r3.f25164oa
            com.bytedance.sdk.openadsdk.core.model.gzw r0 = r0.f25412oa
            r1 = 5
            com.bytedance.sdk.openadsdk.gsd.oa.lw.uef(r0, r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.sdk.openadsdk.activity.single.TTRewardVideoActivity.sk():void");
    }

    private JSONObject swd() {
        JSONObject jSONObject = new JSONObject();
        int iUe = (int) this.f25164oa.tpx.ue();
        try {
            jSONObject.put("oversea_version_type", 1);
            jSONObject.put("reward_name", this.f25164oa.f25412oa.ot());
            jSONObject.put("reward_amount", this.f25164oa.f25412oa.jkf());
            jSONObject.put("network", sy.yo(getApplicationContext()));
            jSONObject.put("sdk_version", BuildConfig.VERSION_NAME);
            int iUs = this.f25164oa.f25412oa.us();
            String strMoa = "unKnow";
            if (iUs == 2) {
                strMoa = gb.oa();
            } else if (iUs == 1) {
                strMoa = gb.moa();
            }
            jSONObject.put("user_agent", strMoa);
            JSONObject jSONObjectZec = this.f25164oa.f25412oa.zec();
            jSONObjectZec.put("gaid", com.bytedance.sdk.openadsdk.tpx.uef.oa.uef.uef().oa());
            jSONObject.put("extra", jSONObjectZec);
            jSONObject.put("media_extra", this.gsd);
            jSONObject.put("video_duration", this.f25164oa.f25412oa.nj().ivm());
            jSONObject.put("play_start_ts", this.f25198ab);
            jSONObject.put("play_end_ts", this.bs);
            jSONObject.put("duration", iUe);
            jSONObject.put("user_id", this.rt);
            jSONObject.put("trans_id", ue.uef().replace("-", ""));
            return jSONObject;
        } catch (Throwable th) {
            dhk.uef("TTAD.RVA", "", th);
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void yo(final boolean z2, boolean z10) {
        gzw gzwVar;
        gzw gzwVar2;
        com.bytedance.sdk.openadsdk.component.reward.uef.oa oaVar = this.f25164oa;
        if (oaVar == null || (gzwVar = oaVar.f25412oa) == null) {
            return;
        }
        if (!z10 && gzwVar.ab() && this.f25164oa.cz.get() && cp.bcc(this.f25164oa.f25412oa)) {
            this.f25164oa.gzw.cz();
            return;
        }
        if (!com.bytedance.sdk.openadsdk.core.sy.moa().bcc(String.valueOf(this.f25164oa.ivm))) {
            if (!z10 && this.f25164oa.cz.get() && cp.bcc(this.f25164oa.f25412oa)) {
                this.f25164oa.gzw.cz();
                return;
            } else if (z2) {
                finish();
                return;
            } else {
                sk();
                return;
            }
        }
        com.bytedance.sdk.openadsdk.component.reward.uef.oa oaVar2 = this.f25164oa;
        if (oaVar2 != null && (gzwVar2 = oaVar2.f25412oa) != null && gzwVar2.sk()) {
            if (this.f25164oa.cz.get() && cp.bcc(this.f25164oa.f25412oa)) {
                this.f25164oa.gzw.cz();
                return;
            } else if (z2) {
                finish();
                return;
            } else {
                sk();
                return;
            }
        }
        if (cp.bcc(this.f25164oa.f25412oa) && this.f25164oa.ku.bcc().getVisibility() == 0) {
            this.f25164oa.gzw.cz();
            return;
        }
        this.f25164oa.bs.set(true);
        this.f25164oa.tpx.orq();
        if (z2) {
            this.f25164oa.gzw.ivm();
        }
        final com.bytedance.sdk.openadsdk.core.widget.oa oaVar3 = new com.bytedance.sdk.openadsdk.core.widget.oa(this);
        this.yo.wrv = oaVar3;
        if (z2) {
            oaVar3.uef(dhk).yo(gzw).moa(tpx);
        } else {
            oaVar3.uef(oib).yo(orq).moa(tpx);
        }
        this.yo.wrv.uef(new oa.InterfaceC0102oa() { // from class: com.bytedance.sdk.openadsdk.activity.single.TTRewardVideoActivity.6
            @Override // com.bytedance.sdk.openadsdk.core.widget.oa.InterfaceC0102oa
            public void oa() {
                oaVar3.dismiss();
                TTRewardVideoActivity.this.lw(true);
                TTRewardVideoActivity.this.f25164oa.bs.set(false);
                TTRewardVideoActivity.this.f25164oa.gzw.oa(f.API_PRIORITY_OTHER);
                if (!z2 || !cp.ivm(TTRewardVideoActivity.this.f25164oa.f25412oa)) {
                    TTRewardVideoActivity.this.sk();
                } else if (cp.bcc(TTRewardVideoActivity.this.f25164oa.f25412oa)) {
                    TTRewardVideoActivity.this.f25164oa.gzw.cz();
                } else {
                    TTRewardVideoActivity.this.f25164oa.gr.ivm();
                    TTRewardVideoActivity.this.finish();
                }
            }

            @Override // com.bytedance.sdk.openadsdk.core.widget.oa.InterfaceC0102oa
            public void uef() {
                TTRewardVideoActivity.this.f25164oa.tpx.tpx();
                if (z2) {
                    TTRewardVideoActivity.this.f25164oa.gzw.uef(1000);
                }
                oaVar3.dismiss();
                TTRewardVideoActivity.this.f25164oa.bs.set(false);
            }
        }).show();
    }

    public void af() {
        uef(0);
    }

    @Override // com.bytedance.sdk.openadsdk.activity.single.TTBaseVideoActivity, com.bytedance.sdk.openadsdk.core.wk.moa.oa
    public void bs() {
        af();
    }

    @Override // com.bytedance.sdk.openadsdk.activity.single.TTBaseVideoActivity
    public void cp() {
        af();
    }

    @Override // com.bytedance.sdk.openadsdk.activity.single.TTBaseVideoActivity
    public ab cq() {
        return new ab(this.f25164oa) { // from class: com.bytedance.sdk.openadsdk.activity.single.TTRewardVideoActivity.2
            @Override // com.bytedance.sdk.openadsdk.common.ab
            public boolean oa() {
                gzw gzwVar;
                com.bytedance.sdk.openadsdk.component.reward.uef.oa oaVar = this.xs;
                return (oaVar == null || (gzwVar = oaVar.f25412oa) == null || !gzwVar.sk()) ? false : true;
            }

            @Override // com.bytedance.sdk.openadsdk.common.ab
            public boolean uef() {
                gzw gzwVar;
                com.bytedance.sdk.openadsdk.component.reward.uef.oa oaVar = this.xs;
                return (oaVar == null || (gzwVar = oaVar.f25412oa) == null || !gzwVar.ab()) ? false : true;
            }

            @Override // com.bytedance.sdk.openadsdk.common.ab
            public void yo() {
                TTRewardVideoActivity.this.finish();
            }

            @Override // com.bytedance.sdk.openadsdk.common.ab
            public void uef(boolean z2) {
                TTRewardVideoActivity.this.lw(z2);
            }

            @Override // com.bytedance.sdk.openadsdk.common.ab
            public void uef(com.bytedance.sdk.openadsdk.component.reward.uef.oa oaVar) {
                com.bytedance.sdk.openadsdk.common.uef.uef(oaVar, new uef.oa() { // from class: com.bytedance.sdk.openadsdk.activity.single.TTRewardVideoActivity.2.1
                    @Override // com.bytedance.sdk.openadsdk.common.uef.oa
                    public void uef(boolean z2, int i5) {
                        TTRewardVideoActivity.this.uef(z2, i5);
                    }

                    @Override // com.bytedance.sdk.openadsdk.common.uef.oa
                    public void uef() {
                        TTRewardVideoActivity.this.finish();
                    }
                });
            }
        };
    }

    @Override // com.bytedance.sdk.openadsdk.activity.single.TTBaseVideoActivity
    public FrameLayout dxx() {
        return this.f25164oa.oyt.ivm();
    }

    @Override // com.bytedance.sdk.openadsdk.activity.single.TTBaseVideoActivity
    public void dz() {
        this.f25164oa.dxx.uef(null, TTAdDislikeToast.getSkipText());
        this.f25164oa.dxx.lw(true);
    }

    public void finalize() throws Throwable {
        super.finalize();
        if (this.wrv) {
            return;
        }
        gr = null;
    }

    @Override // com.bytedance.sdk.openadsdk.activity.single.TTBaseVideoActivity, com.bytedance.sdk.openadsdk.activity.single.TTBaseActivity, android.app.Activity
    public void finish() {
        if (this.f25164oa != null) {
            com.bytedance.sdk.openadsdk.ivm.oa.uef().uef("videoForceBreak", this.f25164oa.f25412oa);
        }
        bcc();
        super.finish();
    }

    @Override // com.bytedance.sdk.openadsdk.activity.single.TTBaseVideoActivity
    public void fz() {
        this.bs = (int) (System.currentTimeMillis() / 1000);
    }

    @Override // com.bytedance.sdk.openadsdk.activity.single.TTBaseVideoActivity
    public boolean gr() {
        return false;
    }

    @Override // com.bytedance.sdk.openadsdk.activity.single.TTBaseVideoActivity
    public void gsd() {
        final View viewZjm = this.f25164oa.oyt.zjm();
        if (viewZjm != null) {
            View.OnClickListener onClickListener = new View.OnClickListener() { // from class: com.bytedance.sdk.openadsdk.activity.single.TTRewardVideoActivity.4
                @Override // android.view.View.OnClickListener
                public void onClick(View view) {
                    if (TTRewardVideoActivity.this.f25164oa.ku.dhk() && TTRewardVideoActivity.this.f25164oa.cz.get()) {
                        boolean zCq = TTRewardVideoActivity.this.f25164oa.fz.cq();
                        TTRewardVideoActivity.this.f25164oa.ku.ivm(zCq);
                        TTRewardVideoActivity.this.f25164oa.oyt.ivm(8);
                        View view2 = viewZjm;
                        if (view2 instanceof com.bytedance.sdk.openadsdk.core.ivm.moa) {
                            ((com.bytedance.sdk.openadsdk.core.ivm.moa) view2).setImageResource(orq.moa(TTRewardVideoActivity.this.f25164oa.af, "tt_close_btn"));
                        }
                        TTRewardVideoActivity.this.f25164oa.sk.sendEmptyMessageDelayed(600, 5000L);
                        if (!gzw.yo(TTRewardVideoActivity.this.f25164oa.f25412oa)) {
                            return;
                        }
                        if (gzw.yo(TTRewardVideoActivity.this.f25164oa.f25412oa) && zCq) {
                            return;
                        }
                    }
                    TTRewardVideoActivity.this.f25164oa.ku.tpx();
                    TTRewardVideoActivity.this.f25164oa.fz.dj();
                    TTRewardVideoActivity.this.f25164oa.gr.ivm();
                    if (cp.moa(TTRewardVideoActivity.this.f25164oa.f25412oa)) {
                        TTRewardVideoActivity.this.yo(true, true);
                    } else {
                        TTRewardVideoActivity.this.finish();
                    }
                }
            };
            viewZjm.setOnClickListener(onClickListener);
            viewZjm.setTag(viewZjm.getId(), onClickListener);
        }
        this.f25164oa.dxx.uef(new com.bytedance.sdk.openadsdk.component.reward.top.oa() { // from class: com.bytedance.sdk.openadsdk.activity.single.TTRewardVideoActivity.5
            @Override // com.bytedance.sdk.openadsdk.component.reward.top.oa
            public void moa(View view) {
            }

            @Override // com.bytedance.sdk.openadsdk.component.reward.top.oa
            public void oa(View view) {
                TTRewardVideoActivity tTRewardVideoActivity = TTRewardVideoActivity.this;
                tTRewardVideoActivity.f25164oa.pz.uef(tTRewardVideoActivity.yo);
            }

            @Override // com.bytedance.sdk.openadsdk.component.reward.top.oa
            public void uef(View view) {
                TTRewardVideoActivity tTRewardVideoActivity = TTRewardVideoActivity.this;
                tTRewardVideoActivity.yo(cp.yo(tTRewardVideoActivity.f25164oa.f25412oa), false);
            }

            @Override // com.bytedance.sdk.openadsdk.component.reward.top.oa
            public void yo(View view) {
                View view2 = viewZjm;
                if (view2 != null) {
                    view2.performClick();
                }
            }

            @Override // com.bytedance.sdk.openadsdk.component.reward.top.oa
            public void uef(View view, String str) {
                com.bytedance.sdk.openadsdk.core.model.moa moaVarOdd;
                com.bytedance.sdk.openadsdk.core.dz.moa moaVarUef;
                TTRewardVideoActivity.this.f25164oa.gem = !r3.gem;
                StringBuilder sb2 = new StringBuilder("will set is Mute ");
                sb2.append(TTRewardVideoActivity.this.f25164oa.gem);
                sb2.append(" mLastVolume=");
                sb2.append(TTRewardVideoActivity.this.f25164oa.cp.uef());
                com.bytedance.sdk.openadsdk.component.reward.uef.oa oaVar = TTRewardVideoActivity.this.f25164oa;
                oaVar.tpx.uef(oaVar.gem, str);
                if (!cp.ab(TTRewardVideoActivity.this.f25164oa.f25412oa) || TTRewardVideoActivity.this.f25164oa.cz.get()) {
                    com.bytedance.sdk.openadsdk.component.reward.uef.oa oaVar2 = TTRewardVideoActivity.this.f25164oa;
                    oaVar2.ku.lw(oaVar2.gem);
                    com.bytedance.sdk.openadsdk.component.reward.uef.oa oaVar3 = TTRewardVideoActivity.this.f25164oa;
                    oaVar3.gzw.oa(oaVar3.gem);
                    gzw gzwVar = TTRewardVideoActivity.this.f25164oa.f25412oa;
                    if (gzwVar == null || (moaVarOdd = gzwVar.odd()) == null || (moaVarUef = moaVarOdd.uef()) == null) {
                        return;
                    }
                    com.bytedance.sdk.openadsdk.component.reward.uef.oa oaVar4 = TTRewardVideoActivity.this.f25164oa;
                    if (oaVar4.gem) {
                        moaVarUef.bcc(oaVar4.tpx.cq());
                    } else {
                        moaVarUef.cz(oaVar4.tpx.cq());
                    }
                }
            }
        });
    }

    @Override // com.bytedance.sdk.openadsdk.core.wk.moa.oa
    public void hts() {
        rl();
        this.f25164oa.f25412oa.puz();
        this.f25164oa.f25412oa.moa(true);
        if (this.f25164oa.cz.get() || !gzw.lw(this.f25164oa.f25412oa)) {
            return;
        }
        com.bytedance.sdk.openadsdk.component.reward.uef.oa oaVar = this.f25164oa;
        gzw gzwVar = oaVar.f25412oa;
        com.bytedance.sdk.openadsdk.moa.yo.oa(gzwVar, oaVar.lw, gzwVar.wzm());
    }

    @Override // com.bytedance.sdk.openadsdk.activity.single.TTBaseVideoActivity
    public void ivm() {
        wrv wrvVar;
        com.bytedance.sdk.openadsdk.component.reward.uef.oa oaVar = this.f25164oa;
        if (oaVar == null || (wrvVar = oaVar.xvp) == null) {
            return;
        }
        wrvVar.moa();
    }

    public void lw(boolean z2) {
        gzw gzwVar;
        com.bytedance.sdk.openadsdk.component.reward.uef.oa oaVar = this.f25164oa;
        if (oaVar == null || (gzwVar = oaVar.f25412oa) == null) {
            return;
        }
        gzwVar.yo(z2);
        wrv.uef(this.f25164oa.f25412oa, false, 3);
    }

    @Override // com.bytedance.sdk.openadsdk.core.wk.moa.oa
    public void lz() {
        rl();
    }

    @Override // com.bytedance.sdk.openadsdk.activity.single.TTBaseVideoActivity
    public void oib() {
        com.bytedance.sdk.openadsdk.uef.lw.uef uefVar = this.sy;
        if (uefVar != null) {
            uefVar.uef();
        } else {
            com.bytedance.sdk.openadsdk.component.reward.uef.oa oaVar = this.f25164oa;
            zjm.uef(oaVar != null ? oaVar.f25412oa : null, "show", 0);
        }
        if (ue()) {
            this.f25164oa.gsd.cq();
        }
    }

    @Override // com.bytedance.sdk.openadsdk.activity.single.TTBaseVideoActivity, com.bytedance.sdk.openadsdk.activity.single.TTBaseActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        try {
            if (oib == null) {
                oib = orq.uef(this, "tt_reward_msg");
                dhk = orq.uef(this, "tt_msgPlayable");
                tpx = orq.uef(this, "tt_negtiveBtnBtnText");
                orq = orq.uef(this, "tt_postiveBtnText");
                gzw = orq.uef(this, "tt_postiveBtnTextPlayable");
            }
        } catch (Throwable th) {
            dhk.yo("TTAD.RVA", th.getMessage());
        }
    }

    @Override // com.bytedance.sdk.openadsdk.activity.single.TTBaseVideoActivity, com.bytedance.sdk.openadsdk.activity.single.TTBaseActivity, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        bcc();
        uef(isFinishing(), isChangingConfigurations());
        if (this.wrv) {
            return;
        }
        this.sy = null;
    }

    @Override // com.bytedance.sdk.openadsdk.activity.single.TTBaseVideoActivity, com.bytedance.sdk.openadsdk.activity.single.TTBaseActivity, android.app.Activity
    public void onPause() {
        wrv wrvVar;
        super.onPause();
        com.bytedance.sdk.openadsdk.component.reward.uef.oa oaVar = this.f25164oa;
        if (oaVar == null || (wrvVar = oaVar.xvp) == null) {
            return;
        }
        wrvVar.uef();
    }

    @Override // com.bytedance.sdk.openadsdk.activity.single.TTBaseVideoActivity, com.bytedance.sdk.openadsdk.activity.single.TTBaseActivity, android.app.Activity
    public void onResume() {
        wrv wrvVar;
        super.onResume();
        com.bytedance.sdk.openadsdk.component.reward.uef.oa oaVar = this.f25164oa;
        if (oaVar == null || (wrvVar = oaVar.xvp) == null) {
            return;
        }
        wrvVar.oa();
    }

    @Override // com.bytedance.sdk.openadsdk.activity.single.TTBaseVideoActivity, android.app.Activity
    public void onSaveInstanceState(Bundle bundle) {
        if (bundle == null) {
            bundle = new Bundle();
        }
        if (!this.wrv) {
            gr = this.sy;
        }
        super.onSaveInstanceState(bundle);
    }

    @Override // com.bytedance.sdk.openadsdk.core.wk.moa.oa
    public void oyt() {
        uef(2);
    }

    @Override // com.bytedance.sdk.openadsdk.activity.single.TTBaseVideoActivity
    public boolean rt() {
        return true;
    }

    @Override // com.bytedance.sdk.openadsdk.activity.single.TTBaseVideoActivity
    public void tpx() {
        com.bytedance.sdk.openadsdk.component.reward.view.yo yoVarUef;
        super.tpx();
        com.bytedance.sdk.openadsdk.component.reward.uef.oa oaVar = this.f25164oa;
        if (oaVar == null || (yoVarUef = oaVar.gsd.uef()) == null) {
            return;
        }
        yoVarUef.setJsbLandingPageOpenListener(new com.bytedance.sdk.openadsdk.core.widget.lw() { // from class: com.bytedance.sdk.openadsdk.activity.single.TTRewardVideoActivity.3
            @Override // com.bytedance.sdk.openadsdk.core.widget.lw
            public void uef() {
                TTRewardVideoActivity.this.rl();
            }
        });
    }

    @Override // com.bytedance.sdk.openadsdk.core.wk.moa.oa
    public void uef(String str, JSONObject jSONObject) {
    }

    @Override // com.bytedance.sdk.openadsdk.activity.single.TTBaseVideoActivity
    public void oa() {
        final gzw gzwVar;
        super.oa();
        com.bytedance.sdk.openadsdk.component.reward.uef.oa oaVar = this.f25164oa;
        if (oaVar == null || (gzwVar = oaVar.f25412oa) == null || gzwVar.sk()) {
            return;
        }
        this.f25164oa.xvp = new wrv(new wrv.uef() { // from class: com.bytedance.sdk.openadsdk.activity.single.TTRewardVideoActivity.1
            @Override // com.bytedance.sdk.openadsdk.component.reward.wrv.uef
            public void uef(int i5) {
                if (gzwVar.sk() || gzwVar.ab()) {
                    return;
                }
                TTRewardVideoActivity.this.uef(i5);
            }
        });
    }

    @Override // com.bytedance.sdk.openadsdk.activity.single.TTBaseVideoActivity, com.bytedance.sdk.openadsdk.core.wk.moa.oa
    public void uef(Bundle bundle) {
        if (this.wrv) {
            super.uef(bundle);
            this.sy = (com.bytedance.sdk.openadsdk.uef.lw.uef) com.bytedance.sdk.openadsdk.core.cp.uef().uef(this.zjm, com.bytedance.sdk.openadsdk.uef.lw.uef.class);
        } else {
            com.bytedance.sdk.openadsdk.uef.lw.uef uefVarOa = com.bytedance.sdk.openadsdk.core.cp.uef().oa();
            this.sy = uefVarOa;
            if (uefVarOa == null && bundle != null) {
                this.sy = gr;
                gr = null;
            }
        }
        Log.e("TTAD.RVA", "initListener: listenerKey = " + this.zjm + ",mRewardAdInteractionListener = " + this.sy + ",savedInstanceState = " + bundle);
    }

    @Override // com.bytedance.sdk.openadsdk.activity.single.TTBaseVideoActivity
    public void oa(boolean z2, boolean z10) {
        this.f25198ab = (int) (System.currentTimeMillis() / 1000);
    }

    @Override // com.bytedance.sdk.openadsdk.core.wk.moa.oa
    public void oa(int i5) {
        if (i5 == 10000) {
            af();
        }
    }

    public void oa(long j8, long j10) {
        if (j10 <= 0) {
            return;
        }
        if (this.pz == -1) {
            this.pz = Math.min(100, this.f25164oa.f25412oa.sw());
        }
        if (((j8 / 1000.0f) / j10) * 100.0f >= this.pz) {
            af();
        }
    }

    @Override // com.bytedance.sdk.openadsdk.core.wk.moa.oa
    public void oa(boolean z2) {
        if (z2) {
            af();
            return;
        }
        if ((1.0d - (this.lw / this.f25164oa.tpx.gb())) * 100.0d >= com.bytedance.sdk.openadsdk.core.sy.moa().ue(String.valueOf(this.f25164oa.ivm)).ivm) {
            af();
        }
    }

    @Override // com.bytedance.sdk.openadsdk.activity.single.TTBaseVideoActivity
    public void uef(Intent intent) {
        super.uef(intent);
        this.gsd = intent.getStringExtra("media_extra");
        this.rt = intent.getStringExtra("user_id");
    }

    @Override // com.bytedance.sdk.openadsdk.activity.single.TTBaseVideoActivity
    public void uef(long j8, long j10) {
        int i5 = (int) (j8 / 1000);
        int iHo = this.f25164oa.f25412oa.ho();
        boolean z2 = iHo >= 0;
        yo(j8, j10);
        if (this.lw > 0) {
            this.f25164oa.dxx.moa(true);
            if (z2 && i5 >= iHo) {
                this.f25164oa.uef(true);
                this.f25164oa.dxx.uef(String.valueOf(this.lw), TTAdDislikeToast.getSkipText());
                this.f25164oa.dxx.lw(true);
                return;
            }
            this.f25164oa.dxx.uef(String.valueOf(this.lw), null);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void uef(final boolean z2, final int i5, final String str, final int i10, final String str2, final int i11) {
        toString();
        km.uef(new Runnable() { // from class: com.bytedance.sdk.openadsdk.activity.single.TTRewardVideoActivity.7
            @Override // java.lang.Runnable
            public void run() {
                com.bytedance.sdk.openadsdk.uef.lw.uef uefVar = TTRewardVideoActivity.this.sy;
                if (uefVar != null) {
                    uefVar.uef(z2, i5, str, i10, str2);
                    wrv.uef(TTRewardVideoActivity.this.f25164oa.f25412oa, z2, i11);
                }
            }
        });
    }

    public void uef(final int i5) {
        gzw gzwVar;
        com.bytedance.sdk.openadsdk.component.reward.uef.oa oaVar = this.f25164oa;
        if (oaVar == null || (gzwVar = oaVar.f25412oa) == null || gzwVar.sk() || this.f25164oa.f25412oa.ab()) {
            return;
        }
        this.f25164oa.f25412oa.cz(true);
        wrv wrvVar = this.f25164oa.xvp;
        if (wrvVar != null) {
            wrvVar.yo();
        }
        if (com.bytedance.sdk.openadsdk.core.sy.moa().bs(String.valueOf(this.f25164oa.ivm))) {
            uef(true, this.f25164oa.f25412oa.jkf(), this.f25164oa.f25412oa.ot(), 0, "", i5);
        } else {
            com.bytedance.sdk.openadsdk.core.sy.yo().uef(swd(), new gzw.oa() { // from class: com.bytedance.sdk.openadsdk.activity.single.TTRewardVideoActivity.8
                @Override // com.bytedance.sdk.openadsdk.core.gzw.oa
                public void uef(int i10, String str) {
                    TTRewardVideoActivity.this.uef(false, 0, "", i10, str, i5);
                }

                @Override // com.bytedance.sdk.openadsdk.core.gzw.oa
                public void uef(gsd.oa oaVar2) {
                    boolean z2 = oaVar2.f25626oa;
                    TTRewardVideoActivity.this.uef(oaVar2.f25626oa, oaVar2.yo.uef(), oaVar2.yo.oa(), 0, "", i5);
                }
            });
        }
    }

    @Override // com.bytedance.sdk.openadsdk.activity.single.TTBaseVideoActivity
    public void yo() {
        com.bytedance.sdk.openadsdk.uef.lw.uef uefVar = this.sy;
        if (uefVar != null) {
            uefVar.oa();
        } else {
            com.bytedance.sdk.openadsdk.component.reward.uef.oa oaVar = this.f25164oa;
            zjm.uef(oaVar != null ? oaVar.f25412oa : null, "close", 0);
        }
    }

    public void yo(long j8, long j10) {
        com.bytedance.sdk.openadsdk.component.reward.uef.oa oaVar = this.f25164oa;
        boolean z2 = false;
        if (oaVar != null) {
            if (oaVar.f25412oa.sw() >= 0 && this.f25164oa.f25412oa.bqx() >= 0) {
                z2 = true;
            }
            if (z2) {
                j10 = this.f25164oa.f25412oa.bqx();
            }
        }
        long j11 = (this.f25164oa.au * 1000) + j8;
        if (z2) {
            oa(j11, j10);
            return;
        }
        if (this.pz == -1) {
            this.pz = com.bytedance.sdk.openadsdk.core.sy.moa().ue(String.valueOf(this.f25164oa.ivm)).ivm;
        }
        if (j10 <= 0) {
            return;
        }
        if (j10 >= 30000 && j11 >= 27000) {
            af();
        } else if ((j11 * 100) / j10 >= this.pz) {
            af();
        }
    }
}
