package com.bytedance.sdk.openadsdk.activity.single;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.os.CountDownTimer;
import android.os.Looper;
import android.os.Message;
import android.view.View;
import android.widget.FrameLayout;
import com.bykv.vk.openvk.uef.uef.uef.moa.yo;
import com.bytedance.sdk.component.utils.ue;
import com.bytedance.sdk.openadsdk.activity.single.oa;
import com.bytedance.sdk.openadsdk.component.reward.uef.bs;
import com.bytedance.sdk.openadsdk.component.reward.uef.dj;
import com.bytedance.sdk.openadsdk.component.reward.uef.ivm;
import com.bytedance.sdk.openadsdk.core.model.cp;
import com.bytedance.sdk.openadsdk.core.model.dhk;
import com.bytedance.sdk.openadsdk.core.model.gzw;
import com.bytedance.sdk.openadsdk.core.wk.moa.uef;
import com.bytedance.sdk.openadsdk.moa.oa;
import com.bytedance.sdk.openadsdk.utils.ab;
import com.bytedance.sdk.openadsdk.utils.af;
import j$.util.Objects;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public abstract class uef extends bcc implements ue.uef, ivm.uef {
    private boolean cp;
    private int dhk;
    private long gr;
    private boolean gsd;
    private boolean gzw;
    protected boolean lw;
    protected boolean moa;

    /* renamed from: oa, reason: collision with root package name */
    protected com.bytedance.sdk.openadsdk.component.reward.oa.oa f25260oa;
    private int orq;
    private CountDownTimer pz;
    private long rt;
    private Bundle tpx;

    /* renamed from: ue, reason: collision with root package name */
    private boolean f25261ue;
    protected final ue uef;
    protected int yo;

    public uef(oa oaVar, gzw gzwVar, int i5, int i10, boolean z2) {
        super(oaVar, gzwVar, i5, i10, z2);
        this.uef = new ue(Looper.getMainLooper(), this);
        this.dhk = 1;
        this.orq = 0;
        this.gzw = false;
        this.moa = false;
        ou();
    }

    private void ggp() {
        com.bytedance.sdk.openadsdk.component.reward.oa.oa oaVar;
        if (this.ivm.ivm() || (oaVar = this.f25260oa) == null) {
            return;
        }
        oaVar.uef(this.cz.oyt.ivm());
        this.f25260oa.gzw();
    }

    private void hnk() {
        this.cz.km.uef(this.f25260oa);
        this.f25260oa.uef(this, this.uef);
        this.f25260oa.zjm();
    }

    private void jkf() {
        if (this.ivm.ivm() && !this.gzw) {
            this.gzw = true;
            uef().post(new Runnable() { // from class: com.bytedance.sdk.openadsdk.activity.single.uef.3
                @Override // java.lang.Runnable
                public void run() {
                    float[] fArrUef;
                    if (uef.this.xs.gr()) {
                        com.bytedance.sdk.openadsdk.component.reward.uef.oa oaVar = uef.this.cz;
                        com.bytedance.sdk.openadsdk.component.reward.uef.oa oaVar2 = uef.this.cz;
                        fArrUef = new float[]{af.yo(oaVar.pu, oaVar.km.getWidth()), af.yo(oaVar2.pu, oaVar2.km.getHeight())};
                    } else {
                        uef uefVar = uef.this;
                        fArrUef = uefVar.cz.rt.uef(uefVar.dhk);
                    }
                    if (!uef.this.cz.f25414ue.uef()) {
                        uef.this.cz.f25414ue.uef(fArrUef);
                    } else {
                        uef uefVar2 = uef.this;
                        uefVar2.cz.f25414ue.uef(uefVar2.ivm);
                    }
                }
            });
        }
    }

    private boolean ot() {
        if (this.ivm.ivm()) {
            return this.cz.cz.get();
        }
        return true;
    }

    private void ou() {
        boolean z2 = cp.yo(this.ivm) && this.ivm.hs();
        this.f25261ue = z2;
        if (z2) {
            this.gr = this.ivm.ovw() * 1000;
        }
    }

    private void vjj() {
        this.f25260oa.gsd();
        this.yo = (int) this.cz.tpx.gb();
        com.bytedance.sdk.openadsdk.component.reward.uef.oa oaVar = this.cz;
        if (oaVar.vjj) {
            uef(oaVar.gr.lw());
            uef(this.cz.gr.moa());
        }
        b_();
        ggp();
    }

    @Override // com.bytedance.sdk.openadsdk.core.wk.moa.oa
    public final View ab() {
        return this.cz.tpx.sk();
    }

    public Map<String, Object> bcc() {
        gzw gzwVar;
        HashMap map = new HashMap();
        com.bytedance.sdk.openadsdk.component.reward.uef.oa oaVar = this.cz;
        if (oaVar != null && oaVar.gsd != null && (gzwVar = this.ivm) != null && gzwVar.ggp() == 2) {
            map.put("dynamic_show_type", Integer.valueOf(this.cz.gsd.dj()));
            JSONObject jSONObjectUef = this.cz.gsd.uef((JSONObject) null);
            if (jSONObjectUef != null) {
                Iterator<String> itKeys = jSONObjectUef.keys();
                while (itKeys.hasNext()) {
                    String next = itKeys.next();
                    try {
                        map.put(next, jSONObjectUef.get(next));
                    } catch (JSONException unused) {
                    }
                }
            }
        }
        return map;
    }

    @Override // com.bytedance.sdk.openadsdk.core.wk.moa.oa
    public void bs() {
    }

    public void cp() {
        com.bytedance.sdk.openadsdk.component.reward.uef.oa oaVar = this.cz;
        if (oaVar != null && oaVar.tpx.cz()) {
            this.cz.tpx.tpx();
        }
    }

    @Override // com.bytedance.sdk.openadsdk.activity.single.bcc
    public final void cq() {
        super.cq();
        if (this.cz == null || com.bytedance.sdk.component.utils.oa.uef(rl())) {
            return;
        }
        this.cz.ku.rt();
        com.bytedance.sdk.openadsdk.utils.moa.uef(rl(), this.cz.f25412oa);
    }

    public com.bytedance.sdk.openadsdk.moa.xs cz() {
        com.bytedance.sdk.openadsdk.component.reward.view.cz czVar;
        if (!this.ivm.ivm()) {
            com.bytedance.sdk.openadsdk.moa.xs xsVar = new com.bytedance.sdk.openadsdk.moa.xs();
            xsVar.uef(System.currentTimeMillis(), 1.0f);
            return xsVar;
        }
        com.bytedance.sdk.openadsdk.component.reward.uef.oa oaVar = this.cz;
        if (oaVar != null && (czVar = oaVar.gsd) != null && czVar.uef() != null) {
            return this.cz.gsd.uef().getAdShowTime();
        }
        com.bytedance.sdk.openadsdk.moa.xs xsVar2 = new com.bytedance.sdk.openadsdk.moa.xs();
        xsVar2.uef(System.currentTimeMillis(), 1.0f);
        return xsVar2;
    }

    @Override // com.bytedance.sdk.openadsdk.activity.single.bcc
    public void dhk() {
        super.dhk();
        com.bytedance.sdk.openadsdk.component.reward.oa.oa oaVar = this.f25260oa;
        if (oaVar != null) {
            oaVar.dhk();
        }
    }

    @Override // com.bytedance.sdk.openadsdk.core.wk.moa.oa
    public final void dj() {
        com.bytedance.sdk.openadsdk.component.reward.oa.oa oaVar = this.f25260oa;
        if (oaVar == null) {
            return;
        }
        oaVar.dj();
    }

    @Override // com.bytedance.sdk.openadsdk.activity.single.bcc
    public boolean dxx() {
        return this.cz.gsd.zjm() && !rt();
    }

    @Override // com.bytedance.sdk.openadsdk.activity.single.bcc
    public void dz() {
        super.dz();
        if (this.f25261ue) {
            this.rt = System.currentTimeMillis();
            CountDownTimer countDownTimer = this.pz;
            if (countDownTimer != null) {
                countDownTimer.cancel();
            }
        }
        com.bytedance.sdk.openadsdk.component.reward.oa.oa oaVar = this.f25260oa;
        if (oaVar == null) {
            return;
        }
        oaVar.bs();
        com.bytedance.sdk.openadsdk.component.reward.view.cz czVar = this.cz.gsd;
        if (czVar != null) {
            czVar.bcc();
        }
        if (this.xs.gr()) {
            this.cz.gsd.uef(8, false);
        }
    }

    @Override // com.bytedance.sdk.openadsdk.activity.single.bcc
    public boolean fz() {
        return this.ivm.ix() == 10 && !rt();
    }

    public void gr() {
        jkf();
    }

    @Override // com.bytedance.sdk.openadsdk.activity.single.bcc
    public com.bytedance.sdk.openadsdk.component.reward.uef.oa gsd() {
        return this.cz;
    }

    public void gzw() {
        this.xs.uef(this, uef(oa.C0124oa.f25970oa));
    }

    public final void ivm() {
        Message message = new Message();
        message.what = 400;
        if (this.ivm.nyn()) {
            oa(10000);
        }
        this.uef.sendMessageDelayed(message, 2000L);
    }

    @Override // com.bytedance.sdk.openadsdk.core.wk.moa.oa
    public void ku() {
        this.moa = true;
    }

    @Override // com.bytedance.sdk.openadsdk.core.wk.moa.oa
    public void lw() {
        oa oaVar = this.xs;
        if (oaVar != null) {
            oaVar.uef(this);
        }
    }

    @Override // com.bytedance.sdk.openadsdk.activity.single.bcc
    public void moa() {
        super.moa();
        com.bytedance.sdk.openadsdk.component.reward.oa.oa oaVar = this.f25260oa;
        if (oaVar == null) {
            return;
        }
        oaVar.sy();
    }

    public abstract void oa();

    @Override // com.bytedance.sdk.openadsdk.core.wk.moa.oa
    public void oa(boolean z2) {
    }

    @Override // com.bytedance.sdk.openadsdk.activity.single.bcc
    public void oib() {
        super.oib();
        com.bytedance.sdk.openadsdk.component.reward.oa.oa oaVar = this.f25260oa;
        if (oaVar == null) {
            return;
        }
        oaVar.oa(this.sy);
    }

    @Override // com.bytedance.sdk.openadsdk.activity.single.bcc
    public boolean orq() {
        com.bytedance.sdk.openadsdk.component.reward.uef.oa oaVar = this.cz;
        return oaVar != null && oaVar.tpx.lz();
    }

    public void pz() {
        com.bytedance.sdk.openadsdk.component.reward.uef.oa oaVar = this.cz;
        if (oaVar == null) {
            return;
        }
        oaVar.tpx.ab();
    }

    @Override // com.bytedance.sdk.openadsdk.activity.single.bcc
    public boolean rt() {
        return this.cz.gsd.cz();
    }

    public final void sy() {
        this.uef.removeMessages(400);
    }

    public void tpx() {
        if (this.gsd) {
            return;
        }
        this.gsd = true;
        rj();
    }

    @Override // com.bytedance.sdk.openadsdk.activity.single.bcc
    public void ue() {
        com.bytedance.sdk.openadsdk.component.reward.view.yo yoVarUef;
        super.ue();
        com.bytedance.sdk.openadsdk.component.reward.uef.oa oaVar = this.cz;
        if (oaVar == null || (yoVarUef = oaVar.gsd.uef()) == null || !yoVarUef.rt()) {
            return;
        }
        hg();
    }

    @Override // com.bytedance.sdk.openadsdk.core.wk.moa.oa
    public void uef(boolean z2) {
    }

    @Override // com.bytedance.sdk.openadsdk.core.wk.moa.oa
    public final void wk() {
        this.cz.tpx.af();
    }

    @Override // com.bytedance.sdk.openadsdk.core.wk.moa.oa
    public void wrv() {
        oa oaVar = this.xs;
        if (oaVar == null) {
            return;
        }
        oaVar.oa(this, uef(10));
    }

    public abstract FrameLayout xs();

    @Override // com.bytedance.sdk.openadsdk.activity.single.bcc
    public void yo() {
        com.bytedance.sdk.openadsdk.component.reward.oa.oa oaVar;
        super.yo();
        if (this.cz == null || (oaVar = this.f25260oa) == null) {
            return;
        }
        oaVar.wk();
        this.cz.cop = true;
        if (ot()) {
            com.bytedance.sdk.openadsdk.component.reward.uef.oa oaVar2 = this.cz;
            oaVar2.dxx.uef(oaVar2.f25412oa.lox());
        }
        this.cz.oyt.wk();
        this.cz.ku.bs();
        this.cz.gzw.lw();
        if (this.f25260oa.oa()) {
            this.cz.tpx.uef(this.f25260oa);
            if (this.cz.tpx.au()) {
                uef(this.cz.tpx.wk(), true);
            } else if (this.cz.tpx.xs() && this.xs.gr()) {
                km();
            } else {
                this.cz.tpx.uef(false, this, this.orq != 0);
            }
        }
        this.orq++;
        jkf();
        com.bytedance.sdk.openadsdk.component.reward.view.cz czVar = this.cz.gsd;
        if (czVar != null) {
            czVar.xs();
        }
        this.cz.rt.uef(this.uef);
        if (this.xs.gr()) {
            this.cz.gsd.uef(0, false);
        }
        long jCurrentTimeMillis = System.currentTimeMillis();
        if (this.f25261ue) {
            long j8 = this.rt;
            if (j8 != 0 && jCurrentTimeMillis - j8 > this.gr) {
                sk().uef(this, uef(8));
                return;
            }
            if (j8 != 0) {
                this.gr -= jCurrentTimeMillis - j8;
            }
            uef(this.gr);
        }
    }

    @Override // com.bytedance.sdk.openadsdk.activity.single.bcc, com.bytedance.sdk.openadsdk.core.wk.moa.oa
    public void zjm() {
        super.zjm();
        if (this.ivm.ivm()) {
            this.cz.gsd.cq();
        }
    }

    @Override // com.bytedance.sdk.openadsdk.core.wk.moa.oa
    public void moa(boolean z2) {
        oa oaVar = this.xs;
        if (oaVar != null) {
            oaVar.uef(this, z2);
        }
    }

    @Override // com.bytedance.sdk.openadsdk.activity.single.bcc
    public final void uef(Activity activity, Bundle bundle) {
        this.tpx = bundle;
        super.uef(activity, bundle);
        uef(bundle);
    }

    @Override // com.bytedance.sdk.openadsdk.activity.single.bcc
    public final com.bytedance.sdk.openadsdk.component.reward.view.bcc uef() {
        return this.cz.km;
    }

    @Override // com.bytedance.sdk.openadsdk.activity.single.bcc
    public void uef(Activity activity, oa.lw lwVar) {
        try {
            this.dhk = this.ivm.cgg();
            uef(activity, this.ivm, this.tpx);
            if (this.cz.vjj && this.ivm.hs()) {
                this.cz.gem = lwVar.moa;
            }
            com.bytedance.sdk.openadsdk.component.reward.uef.oa oaVar = this.cz;
            if (oaVar.vjj && this.zjm > 0) {
                oaVar.gem = lwVar.moa;
            }
            hnk();
            vjj();
            if (dhk.lw(this.ivm)) {
                wxf();
            }
        } catch (Throwable th) {
            com.bytedance.sdk.component.utils.dhk.uef("TTAD.AdScene", "onCreate: ", th);
            com.bytedance.sdk.openadsdk.ab.moa.oa();
            swd();
        }
    }

    private void uef(Activity activity, gzw gzwVar, Bundle bundle) {
        com.bytedance.sdk.openadsdk.component.reward.uef.oa oaVar = new com.bytedance.sdk.openadsdk.component.reward.uef.oa(activity, this.uef, gzwVar, this, 1, this.xs.oa(), this.cz);
        this.cz = oaVar;
        oaVar.vjj = this.xs.ivm();
        com.bytedance.sdk.openadsdk.component.reward.uef.oa oaVar2 = this.cz;
        oaVar2.ot = this.cq;
        oaVar2.dh = oaVar2.vjj && dhk.lw(gzwVar);
        this.cz.jkf = this.xs.moa();
        this.cz.ggp = this.xs.gsd();
        com.bytedance.sdk.openadsdk.component.reward.uef.oa oaVar3 = this.cz;
        oaVar3.sw = this;
        oaVar3.cp = this.xs.orq();
        Intent intent = activity.getIntent();
        com.bytedance.sdk.openadsdk.component.reward.uef.yo.uef(this.cz, intent, bundle);
        if (intent != null) {
            com.bytedance.sdk.openadsdk.component.reward.uef.yo.uef(intent, this.cz);
            gzwVar.uef(intent.getLongExtra("start_show_time", 0L));
        }
        if (bundle != null && this.cz.nkh) {
            oa();
        }
        com.bytedance.sdk.openadsdk.component.reward.oa.oa oaVarUef = com.bytedance.sdk.openadsdk.component.reward.oa.ivm.uef(this.cz);
        this.f25260oa = oaVarUef;
        com.bytedance.sdk.openadsdk.component.reward.uef.oa oaVar4 = this.cz;
        oaVar4.f25410hg = oaVarUef;
        oaVar4.lz.uef(this);
        com.bytedance.sdk.openadsdk.component.reward.uef.oa oaVar5 = this.cz;
        if (oaVar5.vjj) {
            oaVar5.tpx.uef(new uef.InterfaceC0105uef() { // from class: com.bytedance.sdk.openadsdk.activity.single.uef.1
                @Override // com.bytedance.sdk.openadsdk.core.wk.moa.uef.InterfaceC0105uef
                public void uef(int i5) {
                    uef uefVar = uef.this;
                    oa oaVar6 = uefVar.xs;
                    if (oaVar6 == null) {
                        return;
                    }
                    oaVar6.oa(uefVar, i5);
                }
            });
            if (!this.xs.gr()) {
                this.xs.gsd().setShowSound(gzw.lw(gzwVar));
            }
        }
        com.bytedance.sdk.openadsdk.component.reward.uef.oa oaVar6 = this.cz;
        ab.uef(gzwVar, oaVar6.af, oaVar6.lw, oaVar6.gb);
        Objects.toString(this.f25260oa);
    }

    @Override // com.bytedance.sdk.openadsdk.activity.single.bcc
    public void yo(boolean z2) {
        dj djVar;
        com.bytedance.sdk.openadsdk.component.reward.uef.oa oaVar = this.cz;
        if (oaVar == null || (djVar = oaVar.gr) == null) {
            return;
        }
        djVar.oa(z2);
        this.cz.gr.yo(z2);
    }

    private void uef(com.bytedance.sdk.openadsdk.core.yo.oa oaVar) {
        if (oaVar != null) {
            HashMap map = new HashMap();
            try {
                int i5 = this.dj + 1;
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("ad_show_order", i5);
                map.put("pag_json_data", jSONObject.toString());
            } catch (Throwable unused) {
            }
            oaVar.uef(map);
        }
    }

    @Override // com.bytedance.sdk.openadsdk.activity.single.bcc
    public void uef(Activity activity) {
        super.uef(activity);
        com.bytedance.sdk.openadsdk.component.reward.uef.oa oaVar = this.cz;
        if (oaVar == null) {
            return;
        }
        oaVar.rt.uef();
    }

    private void uef(long j8) {
        this.pz = new CountDownTimer(j8, 1000L) { // from class: com.bytedance.sdk.openadsdk.activity.single.uef.2
            @Override // android.os.CountDownTimer
            public void onFinish() {
                oa oaVarSk = uef.this.sk();
                uef uefVar = uef.this;
                oaVarSk.uef(uefVar, uefVar.uef(8));
            }

            @Override // android.os.CountDownTimer
            public void onTick(long j10) {
                uef.this.gr = j10;
            }
        }.start();
    }

    public final void uef(boolean z2, int i5) {
        uef(z2, false, i5);
    }

    public final void uef(boolean z2, boolean z10, int i5) {
        com.bytedance.sdk.openadsdk.component.reward.uef.oa oaVar = this.cz;
        oaVar.lz.uef(z2, z10, false, oaVar.f25410hg, i5);
    }

    @Override // com.bytedance.sdk.component.utils.ue.uef
    public void uef(Message message) {
        com.bytedance.sdk.openadsdk.component.reward.oa.oa oaVar = this.f25260oa;
        if (oaVar == null) {
            return;
        }
        oaVar.uef(message);
    }

    @Override // com.bytedance.sdk.openadsdk.core.wk.moa.oa
    public void uef(String str, JSONObject jSONObject) {
        oa oaVar;
        if (str == null || !"skipToNextAd".equals(str) || (oaVar = this.xs) == null) {
            return;
        }
        oaVar.oa(this, uef(7));
    }

    @Override // com.bytedance.sdk.openadsdk.core.wk.moa.oa
    public boolean uef(long j8, boolean z2) {
        dhk dhkVar;
        com.bytedance.sdk.openadsdk.component.reward.uef.oa oaVar = this.cz;
        if (oaVar == null) {
            return false;
        }
        oaVar.gsd.oa(false);
        this.lw = false;
        com.bytedance.sdk.openadsdk.moa.xs xsVarCz = cz();
        if (xs() == null) {
            return false;
        }
        this.cz.tpx.uef(xs(), xsVarCz);
        Map<String, Object> mapBcc = this.ivm.ivm() ? bcc() : null;
        yo.uef uefVar = new yo.uef() { // from class: com.bytedance.sdk.openadsdk.activity.single.uef.4
            @Override // com.bykv.vk.openvk.uef.uef.uef.moa.yo.uef
            public void oa(long j10, int i5) {
                uef.this.cz.tpx.dj();
                dhk dhkVar2 = uef.this.cz.oyt.wk;
                if (dhkVar2 != null) {
                    dhkVar2.zjm();
                }
                if (uef.this.cz.tpx.ivm()) {
                    uef.this.ivm();
                    return;
                }
                uef.this.cz.tpx.dhk();
                if (uef.this.ivm.ivm()) {
                    uef.this.cz.gsd.uef(true);
                }
                uef uefVar2 = uef.this;
                uefVar2.xs.uef(uefVar2, uefVar2.uef(3));
            }

            @Override // com.bykv.vk.openvk.uef.uef.uef.moa.yo.uef
            public void uef(long j10, int i5) {
                uef uefVar2 = uef.this;
                if (uefVar2.lw) {
                    return;
                }
                uefVar2.lw = true;
                boolean zIvm = uefVar2.ivm.ivm();
                uef.this.uef.removeMessages(300);
                uef.this.sy();
                uef.this.cz.tpx.uef(j10, j10);
                if (zIvm) {
                    uef.this.cz.gsd.oa(true);
                } else {
                    uef.this.cz.f25409ab.set(true);
                }
                if (uef.this.cz.f25412oa.wxf() == 36) {
                    com.bytedance.sdk.openadsdk.component.reward.uef.oa oaVar2 = uef.this.cz;
                    if (oaVar2.yo) {
                        oaVar2.orq.yo().uef(uef.this.cz.f25412oa);
                        ab.oa();
                    }
                }
                if (!zIvm && uef.this.cz.f25412oa.hpb()) {
                    uef.this.cz.f25412oa.dor(1);
                    uef.this.cz.oyt.bs();
                }
                if (uef.this.cz.f25412oa.wxf() == 21 && !uef.this.cz.f25412oa.oib()) {
                    uef.this.cz.f25412oa.lw(true);
                    uef.this.cz.oyt.bs();
                }
                oa.lw lwVarUef = uef.this.uef(5);
                lwVarUef.lw = true;
                uef uefVar3 = uef.this;
                uefVar3.xs.uef(uefVar3, lwVarUef);
            }

            @Override // com.bykv.vk.openvk.uef.uef.uef.moa.yo.uef
            public void uef() {
                uef.this.cz.tpx.dj();
                uef.this.sy();
                uef uefVar2 = uef.this;
                uefVar2.xs.uef(uefVar2, uefVar2.uef(6));
            }

            @Override // com.bykv.vk.openvk.uef.uef.uef.moa.yo.uef
            public void uef(long j10, long j11) throws NumberFormatException {
                com.bytedance.sdk.openadsdk.component.reward.view.cz czVar;
                com.bytedance.sdk.openadsdk.component.reward.uef.oa oaVar2 = uef.this.cz;
                if (!oaVar2.cop && oaVar2.tpx.ivm()) {
                    uef.this.cz.tpx.oa(true);
                }
                if (uef.this.cz.cz.get()) {
                    return;
                }
                if (j10 != uef.this.cz.tpx.dz()) {
                    uef.this.sy();
                }
                if (!uef.this.cz.tpx.ivm()) {
                    uef.this.uef.removeMessages(300);
                    return;
                }
                uef.this.cz.tpx.uef(j10, j11);
                int i5 = (int) (j10 / 1000);
                if ((uef.this.cz.bs.get() || uef.this.cz.zjm.get()) && uef.this.cz.tpx.ivm()) {
                    uef.this.cz.tpx.orq();
                }
                com.bytedance.sdk.openadsdk.component.reward.uef.oa oaVar3 = uef.this.cz;
                if (oaVar3.moa) {
                    oaVar3.oyt.lw(i5);
                }
                if (uef.this.ivm.ivm() && (czVar = uef.this.cz.gsd) != null && czVar.uef() != null) {
                    uef.this.cz.gsd.uef().setTime(String.valueOf(uef.this.yo), i5, 0, false);
                    uef.this.cz.gsd.uef().uef(j10, j11);
                }
                uef.this.uef((j10 * 1.0f) / j11);
                uef.this.cz.uef(true);
            }
        };
        this.cz.tpx.uef(uefVar);
        if (!this.ivm.ivm() && (dhkVar = this.cz.oyt.wk) != null) {
            dhkVar.uef(uefVar);
        }
        return this.cz.tpx.uef(j8, z2, mapBcc, this.f25260oa);
    }

    @Override // com.bytedance.sdk.openadsdk.component.reward.uef.ivm.uef
    public void uef(boolean z2, boolean z10, boolean z11, com.bytedance.sdk.openadsdk.component.reward.oa.oa oaVar, int i5) {
        uef(z2, z10, z11, i5);
    }

    @Override // com.bytedance.sdk.openadsdk.activity.single.bcc
    public void uef(bcc bccVar, bcc bccVar2, oa.lw lwVar) {
        super.uef(bccVar, bccVar2, lwVar);
        if (bccVar == this && (bccVar2 instanceof lw)) {
            int i5 = lwVar.f25256oa;
            if (i5 == 3) {
                bs bsVar = this.cz.tpx;
                bsVar.uef(!bsVar.pu() ? 1 : 0, 2);
            } else if (i5 == 6) {
                bs bsVar2 = this.cz.tpx;
                bsVar2.uef(!bsVar2.pu() ? 1 : 0, !this.cz.tpx.pu() ? 1 : 0);
            } else if (i5 == 5 && !gzw.lw(this.cz.f25412oa) && lwVar.lw) {
                this.cz.tpx.uef("skip", true);
            }
            this.cz.dxx.uef(false);
            this.cz.dxx.moa(false);
        }
    }

    public void uef(float f10) {
        oa oaVar = this.xs;
        if (oaVar == null) {
            return;
        }
        oaVar.uef(f10);
        if (this.gsd || this.ivm.wxf() == 43 || f10 < this.ivm.cop() / 100.0f) {
            return;
        }
        bcc bccVarRt = this.xs.rt();
        if (bccVarRt instanceof uef) {
            ((uef) bccVarRt).tpx();
        }
    }

    public oa.lw uef(int i5) {
        oa.lw lwVar = new oa.lw(i5, this.cz);
        lwVar.moa = this.cz.gem;
        return lwVar;
    }

    @Override // com.bytedance.sdk.openadsdk.activity.single.bcc
    public void uef(Map<String, Object> map, float f10, float f11) {
        super.uef(map, f10, f11);
        this.xs.uef(map, this, f10, f11);
    }

    @Override // com.bytedance.sdk.openadsdk.activity.single.bcc
    public void uef(gzw gzwVar, int i5, int i10) {
        super.uef(gzwVar, i5, i10);
        ou();
        this.gzw = false;
        this.cp = true;
    }
}
