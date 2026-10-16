package com.bytedance.sdk.openadsdk.activity.single;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.view.View;
import com.bytedance.sdk.openadsdk.component.reward.bs;
import com.bytedance.sdk.openadsdk.component.reward.uef.wrv;
import com.bytedance.sdk.openadsdk.component.reward.wrv;
import com.bytedance.sdk.openadsdk.core.model.cp;
import com.bytedance.sdk.openadsdk.core.model.dhk;
import com.bytedance.sdk.openadsdk.core.model.gsd;
import com.bytedance.sdk.openadsdk.core.model.gzw;
import com.bytedance.sdk.openadsdk.core.sy;
import com.bytedance.sdk.openadsdk.cq.zjm;
import j$.util.Objects;
import java.util.List;
import java.util.Map;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public class oa {

    /* renamed from: oa, reason: collision with root package name */
    private static com.bytedance.sdk.openadsdk.uef.lw.uef f25252oa;
    private static com.bytedance.sdk.openadsdk.uef.yo.oa yo;

    /* renamed from: ab, reason: collision with root package name */
    private Runnable f25253ab;
    private com.bytedance.sdk.openadsdk.uef.yo.oa bcc;
    private Activity cq;
    private final boolean cz;
    private final boolean dhk;
    private com.bytedance.sdk.openadsdk.activity.single.yo dj;
    private int dz;
    private final zjm ivm;
    private final gzw moa;
    private boolean oib;
    private boolean sy;
    public wrv uef;
    private Bundle wk;
    private final boolean wrv;
    private com.bytedance.sdk.openadsdk.uef.lw.uef xs;
    private final boolean zjm;
    private final Bundle lw = new Bundle();
    private final wrv.oa bs = new wrv.oa();
    private final boolean tpx = com.bytedance.sdk.openadsdk.gzw.lw.zjm();

    public static class lw {
        public boolean lw;
        public boolean moa;

        /* renamed from: oa, reason: collision with root package name */
        public final int f25256oa;
        public final Bundle uef = new Bundle();
        public final com.bytedance.sdk.openadsdk.component.reward.uef.oa yo;

        public lw(int i5, com.bytedance.sdk.openadsdk.component.reward.uef.oa oaVar) {
            this.f25256oa = i5;
            this.yo = oaVar;
        }

        public String toString() {
            return super.toString();
        }
    }

    public static class moa extends AbstractC0075oa {
        private int dj;
        private boolean wrv;
        private final int zjm;

        public moa(oa oaVar, gzw gzwVar, com.bytedance.sdk.openadsdk.component.reward.top.yo yoVar) {
            super(oaVar, gzwVar, yoVar);
            if (gzwVar == null) {
                this.zjm = 100;
            } else if (gzwVar.sw() >= 0) {
                this.zjm = Math.min(100, gzwVar.sw());
            } else {
                this.zjm = sy.moa().ue(String.valueOf(gzwVar.jnk())).ivm;
            }
        }

        @Override // com.bytedance.sdk.openadsdk.activity.single.oa.AbstractC0075oa, android.os.Handler.Callback
        public boolean handleMessage(Message message) {
            if (!this.wrv && this.moa <= this.dj) {
                this.wrv = true;
                bcc bccVarDj = this.uef.dj();
                if (bccVarDj != null) {
                    bccVarDj.etd();
                }
            }
            super.handleMessage(message);
            return true;
        }

        @Override // com.bytedance.sdk.openadsdk.activity.single.oa.AbstractC0075oa
        public int uef(gzw gzwVar) {
            if (gzwVar != null) {
                return gzwVar.hc();
            }
            return 30;
        }

        @Override // com.bytedance.sdk.openadsdk.activity.single.oa.AbstractC0075oa
        public void uef(int i5, gzw gzwVar) {
            boolean z2 = this.ivm == 0;
            int i10 = this.moa;
            super.uef(i5, gzwVar);
            if (!z2) {
                if (this.yo < i10) {
                    this.dj = (int) ((1.0f - (this.zjm / 100.0f)) * this.moa);
                    return;
                }
                return;
            }
            if (this.ivm == 1) {
                this.dj = 3;
            } else {
                this.dj = (int) ((1.0f - (this.zjm / 100.0f)) * this.yo);
            }
            com.bytedance.sdk.openadsdk.component.reward.wrv wrvVar = this.uef.uef;
            if (wrvVar != null) {
                wrvVar.uef(this.moa);
            }
        }
    }

    /* renamed from: com.bytedance.sdk.openadsdk.activity.single.oa$oa, reason: collision with other inner class name */
    public static abstract class AbstractC0075oa implements Handler.Callback {

        /* renamed from: ab, reason: collision with root package name */
        private boolean f25257ab;
        private int af;
        private boolean bs;
        private boolean cop;
        private boolean cp;
        private int dhk;
        private final com.bytedance.sdk.openadsdk.component.reward.top.yo dj;
        private int dxx;
        private boolean dz;
        private boolean gb;
        private boolean gem;
        private boolean gr;
        private int gsd;
        private int gzw;
        protected int ivm;
        private boolean km;
        private int ku;
        protected int lw;
        private int lz;
        protected int moa;

        /* renamed from: oa, reason: collision with root package name */
        protected gzw f25258oa;
        private int orq;
        private int oyt;
        private boolean pu;
        private int pz;
        private int rl;
        private int rt;
        private int sk;
        private boolean swd;
        private float sy;
        private int tpx;

        /* renamed from: ue, reason: collision with root package name */
        private boolean f25259ue;
        protected final oa uef;
        private boolean wk;
        private final Context wrv;
        protected float yo;
        private final Handler zjm = new Handler(Looper.getMainLooper(), this);
        private final int cq = 1000;
        protected int xs = -1;
        private int oib = 1000;
        private boolean fz = false;
        boolean bcc = false;
        public int cz = -1;

        public AbstractC0075oa(oa oaVar, gzw gzwVar, com.bytedance.sdk.openadsdk.component.reward.top.yo yoVar) {
            this.uef = oaVar;
            this.f25258oa = gzwVar;
            this.dj = yoVar;
            this.wrv = yoVar.getContext();
            this.moa = uef(gzwVar);
        }

        private void cq() {
            int i5 = this.lz;
            int i10 = this.af;
            boolean z2 = this.gem;
            int i11 = this.rl;
            int i12 = this.sk;
            if (i5 < i10 || z2) {
                return;
            }
            if (i11 >= i12) {
                this.swd = false;
            } else {
                this.rl = i11 + 1;
                dz();
            }
        }

        private void dj() {
            if (this.uef.dhk()) {
                this.dj.showSkipButton();
                this.wk = true;
            } else {
                this.f25257ab = true;
                this.dj.showCloseButton();
            }
            this.dj.setShowPlayableNextAd(false, this.f25258oa);
        }

        private void dz() {
            bcc bccVarDj;
            this.gem = true;
            this.lz = 0;
            oa oaVar = this.uef;
            if (oaVar == null || (bccVarDj = oaVar.dj()) == null || bccVarDj.vyg()) {
                return;
            }
            wrv();
        }

        private void lw(int i5) {
            if (this.cop && i5 == 4) {
                this.ivm = i5;
                uef(i5, 1000);
            }
        }

        private void moa(int i5) {
            if (this.xs > 0 && this.bs && i5 == 3) {
                this.ivm = i5;
                uef(i5, 1000);
            }
        }

        private void wrv() {
            com.bytedance.sdk.openadsdk.component.reward.top.yo yoVar;
            if (this.cp || this.wk || this.f25257ab || (yoVar = this.dj) == null) {
                return;
            }
            yoVar.setShowEndCardNextAd(true, this.f25258oa);
        }

        private void zjm() {
            int i5 = this.xs;
            if (i5 > 0) {
                this.xs = i5 - 1;
            }
            if (this.xs == 0 && this.bs) {
                this.bs = false;
                oa oaVar = this.uef;
                if (oaVar == null || oaVar.dj() == null) {
                    return;
                }
                bcc bccVarDj = this.uef.dj();
                if (bccVarDj instanceof com.bytedance.sdk.openadsdk.activity.single.lw) {
                    ((com.bytedance.sdk.openadsdk.activity.single.lw) bccVarDj).tpx();
                }
            }
        }

        public void bcc() {
            if (this.swd) {
                wrv();
                this.gem = false;
            }
        }

        public void cz() {
            if (this.swd) {
                this.gem = true;
            }
        }

        @Override // android.os.Handler.Callback
        public boolean handleMessage(Message message) {
            int i5 = message.what;
            if (i5 == 1 || i5 == 2) {
                uef(message);
            } else if (i5 == 3) {
                if (this.xs > 0) {
                    zjm();
                    if (this.xs >= 0) {
                        uef(message.what, 1000);
                    }
                }
            } else if (i5 == 4) {
                if (this.cop) {
                    lw();
                    if (this.cop && !this.cp) {
                        uef(message.what, 1000);
                    }
                }
            } else if (i5 == 5 && this.swd) {
                xs();
                if (this.swd && !this.cp) {
                    uef(message.what, 1000);
                }
            }
            return true;
        }

        public void ivm() {
            this.f25259ue = true;
        }

        public void oa() {
            this.cop = false;
            this.swd = false;
            this.bcc = false;
            this.ku = 0;
            this.cz = -1;
            this.gem = false;
            this.sk = 0;
            this.lz = 0;
            this.dxx = 0;
            this.gr = false;
            this.rl = 0;
            this.fz = false;
            com.bytedance.sdk.openadsdk.component.reward.top.yo yoVar = this.dj;
            if (yoVar != null) {
                yoVar.setShowPlayableNextAd(false, this.f25258oa);
            }
        }

        public int uef() {
            return this.moa;
        }

        public abstract int uef(gzw gzwVar);

        public void xs() {
            if (this.f25259ue && this.swd && !this.cp) {
                int i5 = this.dxx;
                int i10 = this.lz;
                boolean z2 = this.gr;
                int i11 = i5 + 1;
                this.dxx = i11;
                this.lz = i10 + 1;
                if (z2 && i11 >= this.oyt) {
                    wrv();
                }
                if (this.pu || this.km) {
                    cq();
                }
            }
        }

        public void yo() {
            this.zjm.removeMessages(this.ivm);
        }

        public void uef(boolean z2) {
            this.gr = z2;
            this.lz = 0;
            if (z2) {
                int i5 = this.gzw;
                int i10 = this.tpx;
                this.dhk = i5 - i10;
                this.rt = i10;
                this.gsd = i5;
            }
        }

        public void yo(int i5) {
            this.xs = i5;
            if (i5 > 0) {
                this.bs = true;
                if (this.moa <= 0 || this.wk) {
                    moa(3);
                }
            }
        }

        public void lw() {
            if (this.f25259ue && this.cop) {
                if (this.f25257ab) {
                    this.cop = false;
                }
                if (this.cp) {
                    return;
                }
                int i5 = this.pz;
                boolean z2 = this.gr;
                int i10 = i5 + 1;
                this.pz = i10;
                if (z2) {
                    this.gsd = this.gzw;
                } else {
                    this.gsd = this.dhk + this.tpx;
                }
                if (i10 >= this.dhk) {
                    if (!this.bcc) {
                        this.ku++;
                        this.bcc = true;
                        try {
                            JSONObject jSONObject = new JSONObject();
                            jSONObject.put("click_countdown_remaining", this.moa);
                            jSONObject.put("hint_sequence", this.ku);
                            com.bytedance.sdk.openadsdk.moa.yo.moa(this.f25258oa, this.uef.dj().e_(), jSONObject);
                        } catch (Throwable unused) {
                        }
                    }
                    com.bytedance.sdk.openadsdk.activity.single.yo yoVar = this.uef.dj;
                    int i11 = this.rt;
                    this.rt = i11 - 1;
                    yoVar.uef(i11, this.moa);
                } else {
                    this.bcc = false;
                    this.uef.dj.uef(-1, this.moa);
                }
                if (this.gr && this.pz >= this.orq) {
                    boolean z10 = this.wk;
                    boolean z11 = this.f25257ab;
                    if (!z10 && !z11) {
                        this.dj.setShowPlayableNextAd(true, this.f25258oa);
                    }
                }
                if (this.pz < this.gsd || this.uef.dj() == null) {
                    return;
                }
                bcc bccVarDj = this.uef.dj();
                if (bccVarDj instanceof com.bytedance.sdk.openadsdk.activity.single.lw) {
                    this.zjm.removeMessages(4);
                    ((com.bytedance.sdk.openadsdk.activity.single.lw) bccVarDj).tpx();
                }
            }
        }

        public void moa() {
            if (this.wk || this.f25257ab) {
                return;
            }
            uef(-1);
            this.fz = true;
            com.bytedance.sdk.openadsdk.component.reward.top.yo yoVar = this.dj;
            if (yoVar != null) {
                yoVar.setCountDownFor1InN("", -1);
                this.dj.setShowEndCardNextAd(true, this.f25258oa);
            }
        }

        public void uef(int i5) {
            int i10 = this.ivm;
            if (i5 != -1) {
                this.cz = i5;
            }
            this.zjm.removeMessages(i10);
        }

        private void uef(Message message) {
            if (this.moa > 0) {
                int i5 = (int) (((r1 - r0) * 100.0d) / this.lw);
                com.bytedance.sdk.openadsdk.component.reward.top.yo yoVar = this.dj;
                StringBuilder sb2 = new StringBuilder();
                int i10 = this.moa;
                this.moa = i10 - 1;
                sb2.append(i10);
                sb2.append("s");
                yoVar.setCountDownFor1InN(sb2.toString(), i5);
                zjm();
                lw();
                if (this.moa >= 0) {
                    uef(message.what, this.oib);
                }
                xs();
                return;
            }
            moa(3);
            lw(4);
            uef(5, true);
            dj();
        }

        public void oa(int i5) {
            if (this.cz != 2 || i5 == 1) {
                if (i5 != -1) {
                    this.cz = i5;
                }
                if (this.zjm.hasMessages(this.ivm) || this.fz) {
                    return;
                }
                oa oaVar = this.uef;
                if (oaVar == null || oaVar.dj() == null || this.uef.dj().gsd() == null || !this.uef.dj().gsd().zjm.get()) {
                    int i10 = this.moa;
                    boolean z2 = this.wk;
                    int i11 = this.ivm;
                    if (i11 == 1 || i11 == 2) {
                        if (i10 < 0 || z2 || this.f25257ab) {
                            return;
                        }
                        this.zjm.sendEmptyMessageDelayed(i11, this.oib);
                        return;
                    }
                    if (i11 == 3) {
                        moa(3);
                    } else if (i11 == 4) {
                        lw(4);
                    } else if (i11 == 5) {
                        uef(5, true);
                    }
                }
            }
        }

        private void uef(int i5, int i10) {
            if (this.fz) {
                return;
            }
            this.zjm.removeMessages(i5);
            this.zjm.sendEmptyMessageDelayed(i5, i10);
        }

        private void uef(int i5, boolean z2) {
            if (this.swd && i5 == 5) {
                this.ivm = i5;
                if (z2) {
                    uef(i5, 1000);
                } else {
                    this.zjm.sendEmptyMessage(i5);
                }
            }
        }

        public void oa(boolean z2) {
            if (z2) {
                this.oib = (int) (1000.0f / this.sy);
            } else {
                this.oib = 1000;
            }
        }

        public void uef(gzw gzwVar, boolean z2) {
            this.dhk = cp.tpx(gzwVar);
            this.tpx = cp.rt(gzwVar);
            this.orq = cp.gr(gzwVar);
            this.gzw = cp.ue(gzwVar);
            this.rt = this.tpx;
            this.f25259ue = false;
            this.gr = false;
            this.pz = 0;
            this.cop = true;
            com.bytedance.sdk.openadsdk.component.reward.top.yo yoVar = this.dj;
            if (yoVar != null) {
                yoVar.setShowPlayableNextAd(false, gzwVar);
            }
            this.cp = z2;
            if (this.moa <= 0 || this.wk) {
                lw(4);
            }
        }

        public void uef(int i5, gzw gzwVar) {
            if (gzwVar != null && gzwVar.bbb() != null) {
                this.sy = gzwVar.bbb().uef();
                this.f25258oa = gzwVar;
            }
            int i10 = this.moa;
            boolean z2 = this.wk;
            boolean z10 = this.f25257ab;
            int i11 = this.ivm;
            if (z2 || z10) {
                return;
            }
            float f10 = i5;
            this.yo = f10;
            if (f10 <= i10) {
                this.ivm = 2;
                this.moa = (int) f10;
            } else if (i11 == 0) {
                this.ivm = 1;
            }
            if (!this.dz) {
                this.lw = this.moa;
                this.dz = true;
            }
            int i12 = this.ivm;
            if (i11 == i12 && this.zjm.hasMessages(i12)) {
                return;
            }
            this.zjm.removeCallbacksAndMessages(null);
            this.zjm.sendEmptyMessage(this.ivm);
        }

        public void uef(bcc bccVar) {
            gzw gzwVar;
            gsd gsdVarUef;
            if (bccVar == null || (gzwVar = bccVar.ivm) == null || (gsdVarUef = gzwVar.uef()) == null) {
                return;
            }
            this.oyt = gsdVarUef.yo();
            this.cp = bccVar.bs;
            this.sk = gsdVarUef.uef();
            this.gb = bccVar.f25225ab;
            this.af = gsdVarUef.oa();
            this.km = dhk.ivm(bccVar.ivm);
            this.pu = dhk.lw(bccVar.ivm);
            this.swd = true;
            if ((this.moa <= 0 || this.wk) && !this.zjm.hasMessages(5)) {
                uef(5, false);
            }
        }
    }

    public static class uef extends AbstractC0075oa {
        public uef(oa oaVar, gzw gzwVar, com.bytedance.sdk.openadsdk.component.reward.top.yo yoVar) {
            super(oaVar, gzwVar, yoVar);
        }

        @Override // com.bytedance.sdk.openadsdk.activity.single.oa.AbstractC0075oa
        public int uef(gzw gzwVar) {
            if (gzwVar != null) {
                return gzwVar.lun();
            }
            return 5;
        }
    }

    public static class yo implements Runnable {
        private final gzw uef;

        public yo(gzw gzwVar) {
            this.uef = gzwVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (this.uef.tpq() || gzw.ivm(this.uef)) {
                return;
            }
            if (this.uef.nyn()) {
                if (com.bytedance.sdk.openadsdk.utils.oa.yo()) {
                    com.bytedance.sdk.openadsdk.component.reward.sy.uef(sy.uef()).uef(this.uef.cl());
                    return;
                } else {
                    bs.uef(sy.uef()).uef(this.uef.cl());
                    return;
                }
            }
            if (com.bytedance.sdk.openadsdk.utils.oa.yo()) {
                com.bytedance.sdk.openadsdk.component.reward.xs.uef(sy.uef()).uef(this.uef.cl());
            } else {
                com.bytedance.sdk.openadsdk.component.reward.ivm.uef(sy.uef()).uef(this.uef.cl());
            }
        }
    }

    public oa(Activity activity, gzw gzwVar, boolean z2) {
        this.moa = gzwVar;
        this.oib = z2;
        this.cq = activity;
        this.ivm = new zjm(activity.getApplicationContext());
        boolean zGem = gzwVar.gem();
        this.cz = zGem;
        this.zjm = zGem && 39 == gzwVar.wxf();
        this.wrv = zGem && 40 == gzwVar.wxf();
        int iWxf = gzwVar.wxf();
        if (iWxf == 43 || iWxf == 44) {
            this.dj = new com.bytedance.sdk.openadsdk.activity.single.moa(this.cq, gzwVar, this);
        } else {
            this.dj = new cz(this.cq, gzwVar, this);
        }
        this.dhk = com.bytedance.sdk.openadsdk.gzw.lw.uef("adapt_decor_size", 0) == 1;
        this.dj.uef();
        lz();
    }

    private void lz() {
        if (this.moa.nyn()) {
            this.uef = new com.bytedance.sdk.openadsdk.component.reward.wrv(new wrv.uef() { // from class: com.bytedance.sdk.openadsdk.activity.single.oa.1
                @Override // com.bytedance.sdk.openadsdk.component.reward.wrv.uef
                public void uef(int i5) {
                    bcc bccVarDj;
                    if (oa.this.wrv().getBoolean("reward_verify", false) || oa.this.bs() || oa.this.cq() || (bccVarDj = oa.this.dj()) == null) {
                        return;
                    }
                    bccVarDj.yo(i5);
                }
            });
        }
    }

    public void ab() {
        if (oib()) {
            return;
        }
        tpx();
        Objects.toString(this.xs);
        Objects.toString(this.bcc);
        com.bytedance.sdk.openadsdk.uef.lw.uef uefVar = this.xs;
        if (uefVar != null) {
            uefVar.uef();
        } else {
            com.bytedance.sdk.openadsdk.uef.yo.oa oaVar = this.bcc;
            if (oaVar != null) {
                oaVar.uef();
            } else {
                bcc bccVarDj = dj();
                com.bytedance.sdk.openadsdk.moa.zjm.uef(this.moa, "show", bccVarDj != null ? bccVarDj.af() : 0);
            }
        }
        Runnable runnable = this.f25253ab;
        if (runnable != null) {
            runnable.run();
            this.f25253ab = null;
        }
    }

    public Activity bcc() {
        com.bytedance.sdk.openadsdk.activity.single.yo yoVar = this.dj;
        return yoVar == null ? this.cq : yoVar.uef;
    }

    public boolean bs() {
        gzw gzwVar = this.moa;
        return gzwVar != null && gzwVar.sk();
    }

    public void cp() {
        this.dj.bs();
    }

    public boolean cq() {
        return this.moa.ab();
    }

    public void cz() {
        this.dj.cz();
    }

    public boolean dhk() {
        return this.dj.moa();
    }

    public bcc dj() {
        return this.dj.dj();
    }

    public int dxx() {
        return this.dj.bcc();
    }

    public void dz() {
        com.bytedance.sdk.openadsdk.uef.lw.uef uefVar = this.xs;
        if (uefVar != null) {
            uefVar.onAdClicked();
            return;
        }
        com.bytedance.sdk.openadsdk.uef.yo.oa oaVar = this.bcc;
        if (oaVar != null) {
            oaVar.onAdClicked();
        }
    }

    public void fz() {
        this.dj.oib();
    }

    public boolean gr() {
        return this.dj instanceof com.bytedance.sdk.openadsdk.activity.single.moa;
    }

    public com.bytedance.sdk.openadsdk.component.reward.top.yo gsd() {
        return this.dj.wrv();
    }

    public boolean gzw() {
        return this.dj.lw();
    }

    public boolean ivm() {
        return this.cz;
    }

    public void ku() {
        this.dj.sy();
    }

    public boolean lw() {
        if (this.moa != null && this.cz) {
            return this.zjm || this.wrv;
        }
        return false;
    }

    public boolean moa() {
        return this.wrv;
    }

    public boolean oib() {
        return this.moa.af();
    }

    public zjm orq() {
        return this.ivm;
    }

    public List<gzw> pz() {
        return this.dj.wk();
    }

    public bcc rt() {
        return this.dj.cq();
    }

    public void sy() {
        gzw gzwVar = this.moa;
        if (gzwVar != null) {
            gzwVar.cz(true);
        }
        com.bytedance.sdk.openadsdk.component.reward.wrv wrvVar = this.uef;
        if (wrvVar != null) {
            wrvVar.yo();
        }
    }

    public void tpx() {
        this.moa.bcc(true);
        this.dj.ab();
    }

    public boolean ue() {
        return this.sy;
    }

    public void wk() {
        com.bytedance.sdk.openadsdk.uef.lw.uef uefVar = this.xs;
        if (uefVar != null) {
            uefVar.oa();
            return;
        }
        com.bytedance.sdk.openadsdk.uef.yo.oa oaVar = this.bcc;
        if (oaVar != null) {
            oaVar.oa();
        } else {
            bcc bccVarDj = dj();
            com.bytedance.sdk.openadsdk.moa.zjm.uef(this.moa, "close", bccVarDj != null ? bccVarDj.af() : 0);
        }
    }

    public Bundle wrv() {
        return this.lw;
    }

    public void xs() {
        Activity activity = this.cq;
        if (activity != null) {
            activity.finish();
        }
    }

    public boolean yo() {
        return this.tpx;
    }

    public int zjm() {
        return this.dj.zjm();
    }

    public void moa(TTAdActivity tTAdActivity) {
        this.dz = 5;
        this.dj.xs();
    }

    public boolean oa() {
        return this.dhk;
    }

    public gzw uef() {
        return this.moa;
    }

    public void yo(TTAdActivity tTAdActivity) {
        this.dz = 4;
        this.dj.yo();
        com.bytedance.sdk.openadsdk.component.reward.wrv wrvVar = this.uef;
        if (wrvVar != null) {
            wrvVar.uef();
        }
    }

    public void oa(TTAdActivity tTAdActivity) {
        this.dz = 3;
        this.dj.oa();
        com.bytedance.sdk.openadsdk.component.reward.wrv wrvVar = this.uef;
        if (wrvVar != null) {
            wrvVar.oa();
        }
        this.bs.uef(tTAdActivity, this.moa.cgg(), this.moa.gze(), this.dhk);
    }

    public boolean uef(gzw gzwVar) {
        return (gzwVar == null || dhk.cq(gzwVar) || gzwVar.nl() || gzwVar.hzk() == null || gzwVar.hzk().moa() <= 0) ? false : true;
    }

    public void lw(TTAdActivity tTAdActivity) {
        this.dz = 6;
        this.dj.uef(tTAdActivity);
        this.bs.uef(tTAdActivity);
        this.cq = null;
    }

    public void uef(TTAdActivity tTAdActivity, Bundle bundle, com.bytedance.sdk.openadsdk.uef.lw.uef uefVar, com.bytedance.sdk.openadsdk.uef.yo.oa oaVar) {
        this.wk = bundle;
        this.dz = 1;
        this.xs = uefVar;
        this.bcc = oaVar;
        if (!this.oib && bundle != null) {
            if (uefVar == null) {
                this.xs = f25252oa;
                f25252oa = null;
            }
            if (oaVar == null) {
                this.bcc = yo;
                yo = null;
            }
        }
        this.dj.uef(bundle);
    }

    public void yo(boolean z2) {
        this.sy = z2;
    }

    public void oa(boolean z2) {
        try {
            gzw gzwVar = this.moa;
            if (gzwVar != null) {
                gzwVar.yo(z2);
            }
            com.bytedance.sdk.openadsdk.component.reward.wrv.uef(this.moa, false, 3);
        } catch (Throwable unused) {
        }
    }

    public void oa(bcc bccVar) {
        bccVar.uef(this.cq, this.wk);
        int i5 = this.dz;
        if (i5 == 2) {
            bccVar.cq();
            return;
        }
        if (i5 == 3) {
            bccVar.cq();
            bccVar.yo();
            bccVar.yo(true);
        } else if (i5 == 4) {
            bccVar.yo(false);
            bccVar.dz();
        } else {
            if (i5 != 5) {
                return;
            }
            bccVar.moa();
        }
    }

    public void uef(TTAdActivity tTAdActivity) {
        this.dz = 2;
        this.dj.ivm();
    }

    public void uef(boolean z2) {
        this.dj.uef(z2);
    }

    public void uef(TTAdActivity tTAdActivity, Bundle bundle, int i5) {
        com.bytedance.sdk.openadsdk.component.reward.uef.yo.uef(this.moa, tTAdActivity != null ? tTAdActivity.getIntent() : null, bundle, i5);
        if (this.oib) {
            return;
        }
        com.bytedance.sdk.openadsdk.uef.lw.uef uefVar = this.xs;
        if (uefVar != null) {
            f25252oa = uefVar;
            return;
        }
        com.bytedance.sdk.openadsdk.uef.yo.oa oaVar = this.bcc;
        if (oaVar != null) {
            yo = oaVar;
        }
    }

    public void oa(bcc bccVar, lw lwVar) {
        this.dj.uef(bccVar, lwVar);
    }

    public void oa(bcc bccVar, int i5) {
        this.dj.oa(bccVar, i5);
    }

    public void uef(bcc bccVar, lw lwVar) {
        this.dj.uef(bccVar, null, lwVar);
    }

    public void uef(Activity activity) {
        this.dj.oa(activity);
    }

    public void uef(final bcc bccVar, final boolean z2, final int i5, final String str, final int i10, final String str2, final int i11) {
        Activity activity;
        if (!oib()) {
            this.f25253ab = new Runnable() { // from class: com.bytedance.sdk.openadsdk.activity.single.oa.2
                @Override // java.lang.Runnable
                public void run() {
                    oa.this.uef(bccVar, z2, i5, str, i10, str2, i11);
                }
            };
            return;
        }
        if (bs()) {
            return;
        }
        sy();
        if (this.xs != null && (activity = this.cq) != null) {
            activity.runOnUiThread(new Runnable() { // from class: com.bytedance.sdk.openadsdk.activity.single.oa.3
                @Override // java.lang.Runnable
                public void run() {
                    oa.this.xs.uef(z2, i5, str, i10, str2);
                }
            });
            com.bytedance.sdk.openadsdk.component.reward.wrv.uef(this.moa, z2, i11);
        } else {
            com.bytedance.sdk.openadsdk.component.reward.wrv.uef(this.moa, false, i11);
        }
    }

    public void uef(com.bytedance.sdk.openadsdk.activity.single.uef uefVar, boolean z2) {
        this.dj.uef(uefVar, z2);
    }

    public void uef(bcc bccVar) {
        com.bytedance.sdk.openadsdk.activity.single.yo yoVar = this.dj;
        if (yoVar == null) {
            return;
        }
        yoVar.uef(bccVar);
    }

    public void uef(bcc bccVar, boolean z2) {
        com.bytedance.sdk.openadsdk.activity.single.yo yoVar = this.dj;
        if (yoVar == null) {
            return;
        }
        yoVar.uef(bccVar, z2);
    }

    public void uef(View view) {
        this.dj.uef(view);
    }

    public void uef(View view, boolean z2) {
        this.dj.uef(view, z2);
    }

    public boolean uef(bcc bccVar, int i5) {
        return this.dj.uef(bccVar, i5);
    }

    public void uef(float f10) {
        this.dj.uef(f10);
    }

    public void uef(Map<String, Object> map, bcc bccVar, float f10, float f11) {
        this.dj.uef(map, bccVar, f10, f11);
    }

    public void uef(int i5) {
        this.dj.uef(i5);
    }

    public void uef(bcc bccVar, boolean z2, boolean z10, boolean z11, int i5) {
        this.dj.uef(bccVar, z2, z10, z11, i5);
    }
}
