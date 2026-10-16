package com.bytedance.sdk.openadsdk.component.reward.uef;

import android.app.Activity;
import android.os.Message;
import android.util.Log;
import android.view.View;
import android.widget.FrameLayout;
import com.bykv.vk.openvk.uef.uef.uef.moa.yo;
import com.bytedance.sdk.component.utils.dhk;
import com.bytedance.sdk.component.utils.ue;
import com.bytedance.sdk.openadsdk.CacheDirFactory;
import com.bytedance.sdk.openadsdk.core.model.cp;
import com.bytedance.sdk.openadsdk.core.model.gzw;
import com.bytedance.sdk.openadsdk.core.wk.moa.uef;
import com.bytedance.sdk.openadsdk.moa.lw.oa.wk;
import com.bytedance.sdk.openadsdk.utils.gb;
import com.unity3d.services.UnityAdsConstants;
import java.io.File;
import java.util.HashSet;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public class bs {
    private final gzw bcc;
    private uef.InterfaceC0105uef cp;
    private boolean cq;
    private FrameLayout cz;
    private String dhk;
    private long dj;
    private boolean dz;
    private boolean gsd;
    private final oa gzw;
    com.bykv.vk.openvk.uef.uef.uef.moa.yo ivm;
    private com.bytedance.sdk.openadsdk.moa.xs ku;
    final boolean moa;
    private long oib;
    private boolean orq;
    private long sy;
    private boolean wk;
    private long wrv;
    private final Activity xs;
    boolean yo;
    private final String zjm;
    protected boolean uef = false;

    /* renamed from: oa, reason: collision with root package name */
    boolean f25395oa = false;
    protected boolean lw = false;

    /* renamed from: ab, reason: collision with root package name */
    private long f25394ab = -1;
    private int bs = -1;
    private boolean rt = false;
    private int gr = 0;

    /* renamed from: ue, reason: collision with root package name */
    private float f25396ue = 1.0f;
    private boolean pz = false;
    private volatile boolean fz = false;
    private HashSet<String> tpx = new HashSet<>();

    public bs(oa oaVar) {
        this.gzw = oaVar;
        this.xs = oaVar.pu;
        this.bcc = oaVar.f25412oa;
        this.moa = oaVar.moa;
        this.zjm = oaVar.lw;
    }

    private void dor() {
        com.bykv.vk.openvk.uef.uef.uef.moa.yo yoVar = this.ivm;
        if (yoVar == null || yoVar.dj() == null) {
            return;
        }
        this.dj = this.ivm.ivm();
        if (this.ivm.dj().yo() || !this.ivm.dj().oa()) {
            this.ivm.oa();
            this.ivm.moa();
            this.uef = true;
        }
    }

    public void ab() {
        try {
            if (ivm()) {
                this.ivm.oa();
            }
        } catch (Throwable th) {
            dhk.yo("RewardFullVideoPlayerManager onPause throw Exception :" + th.getMessage(), new Object[0]);
        }
    }

    public void af() {
        com.bykv.vk.openvk.uef.uef.uef.moa.yo yoVar = this.ivm;
        if (yoVar instanceof com.bytedance.sdk.openadsdk.core.wk.moa.uef) {
            ((com.bytedance.sdk.openadsdk.core.wk.moa.uef) yoVar).oyt();
        }
    }

    public boolean au() {
        return this.cq;
    }

    public com.bykv.vk.openvk.uef.uef.uef.oa.uef bcc() {
        com.bykv.vk.openvk.uef.uef.uef.moa.yo yoVar = this.ivm;
        if (yoVar != null) {
            return yoVar instanceof com.bytedance.sdk.openadsdk.component.reward.moa ? ((com.bytedance.sdk.openadsdk.component.reward.moa) yoVar).bs() : yoVar.wrv();
        }
        return null;
    }

    public long bs() {
        com.bykv.vk.openvk.uef.uef.uef.moa.yo yoVar = this.ivm;
        if (yoVar != null) {
            return yoVar.xs();
        }
        return 0L;
    }

    public void cop() {
        com.bykv.vk.openvk.uef.uef.uef.moa.yo yoVar = this.ivm;
        if (yoVar == null || yoVar.dj() == null) {
            return;
        }
        this.dj = this.ivm.ivm();
        dhk();
        uef(true);
        this.cq = true;
    }

    public boolean cp() {
        return this.ivm != null;
    }

    public long cq() {
        com.bykv.vk.openvk.uef.uef.uef.moa.yo yoVar = this.ivm;
        return yoVar != null ? yoVar.ivm() : this.dj;
    }

    public boolean cz() {
        com.bykv.vk.openvk.uef.uef.uef.moa.yo yoVar = this.ivm;
        return (yoVar == null || yoVar.dj() == null || !this.ivm.dj().xs()) ? false : true;
    }

    public void dhk() {
        com.bykv.vk.openvk.uef.uef.uef.moa.yo yoVar = this.ivm;
        if (yoVar != null) {
            yoVar.lw();
        }
    }

    public void dj() {
        this.fz = false;
        ue ueVar = this.gzw.sk;
        if (ueVar != null) {
            ueVar.removeMessages(300);
        }
    }

    public void dxx() {
        int i5 = this.gr;
        if (i5 == 1 || i5 == 2) {
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put("switch", 0);
                uef(jSONObject);
            } catch (Throwable th) {
                dhk.uef("TTAD.RFVideoPlayerMag", "onStopPlaySpeed: ", th);
            }
        }
    }

    public long dz() {
        return this.wrv;
    }

    public boolean fz() {
        return this.fz;
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0041  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public double gb() {
        /*
            r5 = this;
            com.bytedance.sdk.openadsdk.core.model.gzw r0 = r5.bcc
            com.bytedance.sdk.openadsdk.core.model.tpx r0 = r0.gsd()
            com.bytedance.sdk.openadsdk.core.model.gzw r1 = r5.bcc
            boolean r1 = com.bytedance.sdk.openadsdk.core.model.dhk.moa(r1)
            if (r1 == 0) goto L16
            if (r0 == 0) goto L16
            long r0 = r0.oa()
        L14:
            double r0 = (double) r0
            goto L3b
        L16:
            com.bytedance.sdk.openadsdk.core.model.gzw r1 = r5.bcc
            boolean r1 = com.bytedance.sdk.openadsdk.core.model.dhk.xs(r1)
            if (r1 == 0) goto L25
            if (r0 == 0) goto L25
            long r0 = r0.moa()
            goto L14
        L25:
            com.bytedance.sdk.openadsdk.core.model.gzw r0 = r5.bcc
            com.bykv.vk.openvk.uef.uef.uef.yo.oa r0 = r0.nj()
            if (r0 == 0) goto L39
            double r1 = r0.ivm()
            int r0 = r0.orq()
            double r3 = (double) r0
            double r0 = r1 * r3
            goto L3b
        L39:
            r0 = 0
        L3b:
            com.bytedance.sdk.openadsdk.component.reward.uef.oa r2 = r5.gzw
            com.bytedance.sdk.openadsdk.component.reward.wrv r2 = r2.xvp
            if (r2 == 0) goto L45
            long r3 = (long) r0
            r2.uef(r3)
        L45:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.sdk.openadsdk.component.reward.uef.bs.gb():double");
    }

    public void gem() {
        com.bykv.vk.openvk.uef.uef.uef.moa.yo yoVar = this.ivm;
        if (yoVar != null) {
            yoVar.uef();
        }
    }

    public long gr() {
        com.bykv.vk.openvk.uef.uef.uef.moa.yo yoVar = this.ivm;
        if (yoVar == null) {
            return 0L;
        }
        return this.ivm.xs() + yoVar.cz();
    }

    public int gsd() {
        com.bykv.vk.openvk.uef.uef.uef.moa.yo yoVar = this.ivm;
        if (yoVar != null) {
            return yoVar.zjm();
        }
        return 0;
    }

    public long gzw() {
        com.bykv.vk.openvk.uef.uef.uef.moa.yo yoVar = this.ivm;
        if (yoVar != null) {
            return yoVar.cz();
        }
        return 0L;
    }

    public boolean ivm() {
        com.bykv.vk.openvk.uef.uef.uef.moa.yo yoVar = this.ivm;
        return (yoVar == null || yoVar.dj() == null || !this.ivm.dj().ivm()) ? false : true;
    }

    public void km() {
        try {
            if (ivm()) {
                this.lw = true;
                orq();
            }
        } catch (Exception e7) {
            dhk.yo("TTAD.RFVideoPlayerMag", "onPause throw Exception :" + e7.getMessage());
        }
    }

    public boolean ku() {
        com.bykv.vk.openvk.uef.uef.uef.moa.yo yoVar = this.ivm;
        return yoVar != null && yoVar.dj() == null;
    }

    public com.bytedance.sdk.openadsdk.moa.xs lw() {
        return this.ku;
    }

    public boolean lz() {
        return this.yo;
    }

    public boolean moa() {
        int i5;
        return this.pz ? this.rt && this.gr == 1 : this.rt && ((i5 = this.gr) == 2 || i5 == 1);
    }

    public void oib() {
        com.bykv.vk.openvk.uef.uef.uef.moa.yo yoVar = this.ivm;
        if (yoVar == null) {
            return;
        }
        yoVar.moa();
        this.ivm = null;
    }

    public void orq() {
        com.bykv.vk.openvk.uef.uef.uef.moa.yo yoVar = this.ivm;
        if (yoVar != null) {
            yoVar.oa();
        }
    }

    public void oyt() {
        this.rt = false;
        oib();
    }

    public boolean pu() {
        com.bykv.vk.openvk.uef.uef.uef.moa.yo yoVar = this.ivm;
        if (yoVar == null || yoVar.dj() == null) {
            return false;
        }
        return this.ivm.dj().uef();
    }

    public boolean pz() {
        com.bykv.vk.openvk.uef.uef.uef.moa.yo yoVar = this.ivm;
        if (yoVar != null) {
            if (yoVar.dj() != null) {
                com.bykv.vk.openvk.uef.uef.uef.uef uefVarDj = this.ivm.dj();
                if (uefVarDj.xs() || uefVarDj.bcc()) {
                    com.bykv.vk.openvk.uef.uef.uef.moa.yo yoVar2 = this.ivm;
                    if (yoVar2 instanceof com.bytedance.sdk.openadsdk.core.wk.moa.uef) {
                        ((com.bytedance.sdk.openadsdk.core.wk.moa.uef) yoVar2).km();
                    }
                    return true;
                }
            } else if (wrv()) {
                uef(false);
                com.bykv.vk.openvk.uef.uef.uef.moa.yo yoVar3 = this.ivm;
                if (yoVar3 instanceof com.bytedance.sdk.openadsdk.core.wk.moa.uef) {
                    ((com.bytedance.sdk.openadsdk.core.wk.moa.uef) yoVar3).km();
                }
                return true;
            }
        }
        return false;
    }

    public void rl() {
        com.bykv.vk.openvk.uef.uef.uef.moa.yo yoVar = this.ivm;
        if (yoVar instanceof com.bytedance.sdk.openadsdk.core.wk.moa.uef) {
            ((com.bytedance.sdk.openadsdk.core.wk.moa.uef) yoVar).gb();
        }
    }

    public int rt() {
        com.bykv.vk.openvk.uef.uef.uef.moa.yo yoVar = this.ivm;
        if (yoVar != null) {
            return yoVar.bcc();
        }
        return 0;
    }

    public View sk() {
        com.bykv.vk.openvk.uef.uef.uef.moa.yo yoVar = this.ivm;
        if (yoVar instanceof com.bytedance.sdk.openadsdk.core.wk.moa.uef) {
            return (View) ((com.bytedance.sdk.openadsdk.core.wk.moa.uef) yoVar).pu();
        }
        return null;
    }

    public void swd() {
        com.bykv.vk.openvk.uef.uef.uef.moa.yo yoVar = this.ivm;
        if (yoVar instanceof com.bytedance.sdk.openadsdk.core.wk.moa.uef) {
            ((com.bytedance.sdk.openadsdk.core.wk.moa.uef) yoVar).af();
        }
    }

    public com.bykv.vk.openvk.uef.uef.uef.uef sy() {
        com.bykv.vk.openvk.uef.uef.uef.moa.yo yoVar = this.ivm;
        if (yoVar != null) {
            return yoVar.dj();
        }
        return null;
    }

    public void tpx() {
        com.bykv.vk.openvk.uef.uef.uef.moa.yo yoVar = this.ivm;
        if (yoVar != null) {
            yoVar.yo();
        }
    }

    public long ue() {
        com.bykv.vk.openvk.uef.uef.uef.moa.yo yoVar = this.ivm;
        if (yoVar != null) {
            return yoVar.cz();
        }
        return 0L;
    }

    public long wk() {
        return this.dj;
    }

    public boolean wrv() {
        return this.uef;
    }

    public boolean xs() {
        com.bykv.vk.openvk.uef.uef.uef.moa.yo yoVar = this.ivm;
        return yoVar != null && yoVar.cq();
    }

    public boolean zjm() {
        com.bykv.vk.openvk.uef.uef.uef.moa.yo yoVar = this.ivm;
        return yoVar != null && yoVar.dz();
    }

    public void lw(boolean z2) {
        this.wk = z2;
        com.bykv.vk.openvk.uef.uef.uef.moa.yo yoVar = this.ivm;
        if (yoVar instanceof com.bytedance.sdk.openadsdk.core.wk.moa.uef) {
            ((com.bytedance.sdk.openadsdk.core.wk.moa.uef) yoVar).ivm(z2);
        }
    }

    public long oa() {
        return this.sy;
    }

    public long uef() {
        return this.f25394ab;
    }

    public boolean yo() {
        return this.rt;
    }

    private void oa(long j8, long j10) {
        int iAbs = (int) Math.abs(this.bs - j8);
        int i5 = this.bs;
        if (i5 < 0 || iAbs > 500 || i5 > j10 || iAbs >= 500 || this.tpx.contains(this.dhk)) {
            return;
        }
        if (this.bs > j8) {
            com.bytedance.sdk.openadsdk.core.wk.yo().postDelayed(new Runnable() { // from class: com.bytedance.sdk.openadsdk.component.reward.uef.bs.1
                @Override // java.lang.Runnable
                public void run() {
                    bs.this.km();
                    bs.this.gzw.gsd.uef(bs.this.bs, bs.this.dhk);
                }
            }, iAbs);
        } else {
            km();
            this.gzw.gsd.uef(this.bs, this.dhk);
        }
        this.tpx.add(this.dhk);
    }

    public void uef(long j8) {
        this.f25394ab = j8;
    }

    public void yo(boolean z2) {
        this.yo = z2;
    }

    public void moa(boolean z2) {
        this.gsd = z2;
        if (this.ivm instanceof com.bytedance.sdk.openadsdk.core.wk.moa.uef) {
            if (z2) {
                ((com.bytedance.sdk.openadsdk.core.wk.moa.uef) this.ivm).oa(this.bcc.nj().orq());
            } else {
                this.bcc.nj().zjm(1);
                ((com.bytedance.sdk.openadsdk.core.wk.moa.uef) this.ivm).oa(1);
            }
        }
    }

    public void uef(FrameLayout frameLayout, com.bytedance.sdk.openadsdk.moa.xs xsVar) {
        if (this.orq) {
            return;
        }
        this.orq = true;
        this.cz = frameLayout;
        if (this.bcc.bbb() != null) {
            this.gr = this.bcc.bbb().oa();
            this.f25396ue = this.bcc.bbb().uef();
        }
        this.ku = xsVar;
        if (gzw.lw(this.bcc)) {
            this.pz = true;
            this.ivm = new com.bytedance.sdk.openadsdk.core.wk.moa.uef(this.xs, this.cz, this.bcc, xsVar);
            moa(this.gsd);
            uef.InterfaceC0105uef interfaceC0105uef = this.cp;
            if (interfaceC0105uef != null) {
                ((com.bytedance.sdk.openadsdk.core.wk.moa.uef) this.ivm).uef(interfaceC0105uef);
            }
            ((com.bytedance.sdk.openadsdk.core.wk.moa.uef) this.ivm).ivm(this.wk);
            return;
        }
        this.pz = false;
        com.bytedance.sdk.openadsdk.component.reward.moa moaVar = new com.bytedance.sdk.openadsdk.component.reward.moa(this.bcc, xsVar);
        this.ivm = moaVar;
        uef.InterfaceC0105uef interfaceC0105uef2 = this.cp;
        if (interfaceC0105uef2 != null) {
            moaVar.uef(interfaceC0105uef2);
        }
    }

    public void oa(long j8) {
        this.dj = j8;
    }

    public void oa(boolean z2) {
        com.bykv.vk.openvk.uef.uef.uef.moa.yo yoVar = this.ivm;
        if (yoVar != null) {
            yoVar.oa();
            this.dz = z2;
        }
    }

    public void oa(com.bytedance.sdk.openadsdk.core.wk.moa.oa oaVar) {
        if (!pz() || oaVar == null) {
            return;
        }
        oaVar.uef(wk(), true);
    }

    public void uef(com.bytedance.sdk.openadsdk.moa.xs xsVar) {
        this.ku = xsVar;
    }

    public void uef(long j8, long j10) {
        this.wrv = j8;
        if (this.fz && (pu() || ivm() || j8 > 0)) {
            dj();
        }
        oa(j8, j10);
    }

    public void uef(int i5, String str) {
        this.bs = i5;
        this.dhk = str;
    }

    public void uef(boolean z2) {
        this.uef = z2;
    }

    public void uef(int i5, int i10) {
        if (this.ivm != null) {
            wk.uef uefVar = new wk.uef();
            uefVar.yo(bs());
            uefVar.moa(gr());
            uefVar.oa(cq());
            uefVar.uef(i5);
            uefVar.oa(i10);
            com.bytedance.sdk.openadsdk.moa.lw.uef.uef.moa(this.ivm.wrv(), uefVar);
        }
    }

    public void uef(yo.uef uefVar) {
        com.bykv.vk.openvk.uef.uef.uef.moa.yo yoVar = this.ivm;
        if (yoVar != null) {
            yoVar.uef(uefVar);
        }
    }

    public void uef(boolean z2, String str) {
        com.bykv.vk.openvk.uef.uef.uef.moa.yo yoVar = this.ivm;
        if (yoVar != null) {
            yoVar.uef(z2, str);
        }
    }

    public void uef(String str, boolean z2) {
        if (this.ivm != null) {
            long jCq = cq();
            if (this.bcc.uqx()) {
                jCq = this.gzw.ivm();
            }
            long j8 = jCq;
            JSONObject jSONObjectUef = gb.uef(this.bcc, this.ivm.xs(), this.ivm.dj());
            try {
                jSONObjectUef.put("auto_click", z2);
                if (!z2) {
                    oa oaVar = this.gzw;
                    com.bytedance.sdk.openadsdk.moa.yo.uef(jSONObjectUef, oaVar.moa ? oaVar.f25412oa.ho() : oaVar.f25412oa.qe(), (int) j8);
                }
            } catch (Exception unused) {
            }
            com.bytedance.sdk.openadsdk.moa.yo.uef(this.bcc, this.zjm, str, j8, gsd(), jSONObjectUef, this.ku);
            gr();
            gsd();
        }
        rl();
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x0058  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x005a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean uef(long r4, boolean r6, java.util.Map<java.lang.String, java.lang.Object> r7, com.bytedance.sdk.openadsdk.component.reward.oa.oa r8) {
        /*
            r3 = this;
            boolean r0 = r3.cp()
            java.lang.String r1 = "show_ad_fail"
            r2 = 0
            if (r0 != 0) goto L15
            com.bytedance.sdk.openadsdk.component.reward.uef.oa r4 = r3.gzw
            com.bytedance.sdk.openadsdk.core.model.gzw r5 = r4.f25412oa
            java.lang.String r4 = r4.lw
            java.lang.String r6 = "video_controller_not_ready"
            com.bytedance.sdk.openadsdk.moa.zjm.uef(r5, r1, r4, r6)
            return r2
        L15:
            com.bytedance.sdk.openadsdk.component.reward.uef.oa r0 = r3.gzw
            com.bytedance.sdk.openadsdk.core.model.gzw r0 = r0.f25412oa
            boolean r0 = com.bytedance.sdk.openadsdk.core.model.dhk.moa(r0)
            if (r0 != 0) goto L66
            com.bytedance.sdk.openadsdk.component.reward.uef.oa r0 = r3.gzw
            com.bytedance.sdk.openadsdk.core.model.gzw r0 = r0.f25412oa
            boolean r0 = com.bytedance.sdk.openadsdk.core.model.dhk.xs(r0)
            if (r0 == 0) goto L2a
            goto L66
        L2a:
            if (r6 == 0) goto L32
            boolean r0 = r3.ku()
            if (r0 != 0) goto L35
        L32:
            r3.uef(r8)
        L35:
            com.bytedance.sdk.openadsdk.component.reward.uef.oa r8 = r3.gzw     // Catch: java.lang.Exception -> L43
            boolean r8 = r8.gem     // Catch: java.lang.Exception -> L43
            boolean r4 = r3.uef(r4, r8)     // Catch: java.lang.Exception -> L43
            r3.cq = r2     // Catch: java.lang.Exception -> L40
            goto L4c
        L40:
            r5 = move-exception
            r2 = r4
            goto L44
        L43:
            r5 = move-exception
        L44:
            java.lang.String r4 = "TTAD.RFVideoPlayerMag"
            java.lang.String r8 = "playVideo: "
            android.util.Log.e(r4, r8, r5)
            r4 = r2
        L4c:
            if (r4 == 0) goto L58
            if (r6 != 0) goto L58
            com.bytedance.sdk.openadsdk.component.reward.uef.oa r5 = r3.gzw
            com.bytedance.sdk.openadsdk.component.reward.uef.dj r5 = r5.gr
            r5.uef(r7)
            goto L65
        L58:
            if (r4 != 0) goto L65
            com.bytedance.sdk.openadsdk.component.reward.uef.oa r5 = r3.gzw
            com.bytedance.sdk.openadsdk.core.model.gzw r6 = r5.f25412oa
            java.lang.String r5 = r5.lw
            java.lang.String r7 = "video_play_fail"
            com.bytedance.sdk.openadsdk.moa.zjm.uef(r6, r1, r5, r7)
        L65:
            return r4
        L66:
            r4 = 1
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.sdk.openadsdk.component.reward.uef.bs.uef(long, boolean, java.util.Map, com.bytedance.sdk.openadsdk.component.reward.oa.oa):boolean");
    }

    public void uef(com.bytedance.sdk.openadsdk.component.reward.oa.oa oaVar) {
        if (this.gzw.cz.get()) {
            return;
        }
        oa oaVar2 = this.gzw;
        if (oaVar2.cop && !cp.yo(oaVar2.f25412oa)) {
            boolean zLw = gzw.lw(this.gzw.f25412oa);
            boolean zMoa = this.gzw.gsd.moa();
            int iDz = com.bytedance.sdk.openadsdk.core.sy.moa().dz(String.valueOf(this.gzw.ivm));
            if ((!zLw && iDz == 1 && zMoa) || com.bytedance.sdk.openadsdk.core.model.dhk.moa(this.gzw.f25412oa) || com.bytedance.sdk.openadsdk.core.model.dhk.xs(this.gzw.f25412oa) || this.lw || !oaVar.lw()) {
                return;
            }
            this.gzw.tpx.dj();
            Message messageObtain = Message.obtain();
            messageObtain.what = 300;
            this.gzw.sk.sendMessageDelayed(messageObtain, 5000L);
            this.fz = true;
        }
    }

    public boolean uef(JSONObject jSONObject) {
        int i5;
        if (this.ivm != null && jSONObject != null && ((i5 = this.gr) == 1 || i5 == 2)) {
            int iOptInt = jSONObject.optInt("switch", 0);
            float fOptDouble = (float) jSONObject.optDouble("speed", 0.0d);
            this.f25396ue = fOptDouble;
            if (fOptDouble <= UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT && this.gzw.f25412oa.bbb() != null) {
                this.f25396ue = this.gzw.f25412oa.bbb().uef();
            }
            if (iOptInt == 0) {
                this.f25396ue = 1.0f;
                if (this.rt) {
                    long jCurrentTimeMillis = (System.currentTimeMillis() - this.oib) + this.sy;
                    this.sy = jCurrentTimeMillis;
                    com.bykv.vk.openvk.uef.uef.uef.moa.yo yoVar = this.ivm;
                    if (yoVar != null) {
                        yoVar.uef(jCurrentTimeMillis);
                    }
                    com.bytedance.sdk.openadsdk.core.wk.moa.oa oaVar = this.gzw.gb;
                    if (oaVar != null) {
                        oaVar.moa(false);
                    }
                }
            } else if (iOptInt == 1 && !this.rt) {
                this.oib = System.currentTimeMillis();
                com.bytedance.sdk.openadsdk.core.wk.moa.oa oaVar2 = this.gzw.gb;
                if (oaVar2 != null) {
                    oaVar2.moa(true);
                }
            }
            this.rt = iOptInt == 1;
            if (this.gr == 1) {
                return true;
            }
            com.bykv.vk.openvk.uef.uef.uef.moa.yo yoVar2 = this.ivm;
            if (yoVar2 == null) {
                return false;
            }
            return yoVar2.uef(this.f25396ue);
        }
        this.rt = false;
        return false;
    }

    private boolean uef(long j8, boolean z2) {
        if (this.ivm == null || this.bcc.nj() == null) {
            return false;
        }
        String strUef = CacheDirFactory.getICacheDir(this.bcc.wg()).uef();
        File file = new File(strUef, this.bcc.nj().dz());
        if (file.exists() && file.length() > 0) {
            this.f25395oa = true;
        }
        com.bytedance.sdk.openadsdk.core.wk.uef.oa oaVarUef = gzw.uef(strUef, this.bcc);
        oaVarUef.oa(this.bcc.iou());
        oaVarUef.oa(this.cz.getWidth());
        oaVarUef.yo(this.cz.getHeight());
        oaVarUef.yo(this.bcc.em());
        oaVarUef.uef(j8);
        oaVarUef.uef(z2);
        return this.ivm.uef(oaVarUef);
    }

    public void uef(com.bytedance.sdk.openadsdk.core.wk.moa.oa oaVar) {
        try {
            this.lw = false;
            if (wrv()) {
                dor();
                oa(oaVar);
            } else if (cz()) {
                tpx();
            }
        } catch (Throwable th) {
            dhk.yo("TTAD.RFVideoPlayerMag", "onContinue throw Exception :" + th.getMessage());
        }
    }

    public void uef(boolean z2, com.bytedance.sdk.openadsdk.core.wk.moa.oa oaVar, boolean z10) {
        if (this.dz || !(!z10 || z2 || this.lw)) {
            if (cz()) {
                tpx();
                Log.i("TTAD.RFVideoPlayerMag", "resumeOrRestartVideo: continue play");
            } else {
                dor();
                oa(oaVar);
                Log.i("TTAD.RFVideoPlayerMag", "resumeOrRestartVideo: recreate video player & exec play");
            }
            this.dz = false;
        }
    }

    public void uef(uef.InterfaceC0105uef interfaceC0105uef) {
        this.cp = interfaceC0105uef;
    }
}
