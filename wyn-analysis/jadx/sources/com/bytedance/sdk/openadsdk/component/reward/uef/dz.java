package com.bytedance.sdk.openadsdk.component.reward.uef;

import android.os.SystemClock;
import android.view.View;
import android.widget.FrameLayout;
import com.bytedance.sdk.component.utils.orq;
import com.bytedance.sdk.openadsdk.core.model.gzw;
import com.bytedance.sdk.openadsdk.utils.af;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes3.dex */
public class dz {
    private volatile long bcc;
    private boolean bs;
    private com.bytedance.adsdk.ugeno.oa.yo cq;
    private String cz;
    private com.bytedance.adsdk.ugeno.oa.yo dz;
    private volatile long ivm;

    /* renamed from: oa, reason: collision with root package name */
    private final oa f25403oa;
    final gzw uef;
    private volatile long xs;
    private FrameLayout yo;
    private final AtomicBoolean moa = new AtomicBoolean(false);
    private final AtomicBoolean lw = new AtomicBoolean(false);
    private final AtomicBoolean zjm = new AtomicBoolean(false);
    private long dj = 0;
    private long wrv = 0;
    private String wk = null;

    /* renamed from: ab, reason: collision with root package name */
    private boolean f25402ab = false;

    public dz(oa oaVar) {
        this.f25403oa = oaVar;
        this.uef = oaVar.f25412oa;
        this.cz = oaVar.lw;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void dz() {
        com.bytedance.sdk.openadsdk.core.cq.bcc.uef uefVarPu;
        gzw gzwVar = this.uef;
        if (gzwVar == null || (uefVarPu = gzwVar.pu()) == null) {
            return;
        }
        com.bytedance.sdk.openadsdk.core.cq.moa.oa oaVar = new com.bytedance.sdk.openadsdk.core.cq.moa.oa(this.f25403oa.pu, this.uef, uefVarPu, this.cz, new com.bytedance.sdk.openadsdk.core.cq.xs.oa() { // from class: com.bytedance.sdk.openadsdk.component.reward.uef.dz.3
            @Override // com.bytedance.sdk.openadsdk.core.cq.xs.yo
            public void oa(String str) {
                dz dzVar = dz.this;
                com.bytedance.sdk.openadsdk.moa.yo.uef(dzVar.uef, true, dzVar.cz, "success", SystemClock.elapsedRealtime() - dz.this.wrv, str, "endcard", 0, null);
            }

            @Override // com.bytedance.sdk.openadsdk.core.cq.xs.oa
            public void uef() {
            }

            @Override // com.bytedance.sdk.openadsdk.core.cq.xs.yo
            public void uef(String str) {
                dz.this.wrv = SystemClock.elapsedRealtime();
            }

            @Override // com.bytedance.sdk.openadsdk.core.cq.xs.yo
            public void uef(int i5, String str, String str2) {
                dz.this.lw.set(false);
                dz dzVar = dz.this;
                com.bytedance.sdk.openadsdk.moa.yo.uef(dzVar.uef, true, dzVar.cz, "fail", SystemClock.elapsedRealtime() - dz.this.wrv, str2, "endcard", i5, str);
            }

            @Override // com.bytedance.sdk.openadsdk.core.cq.xs.oa
            public void uef(int i5, String str) {
                dz.this.lw.set(false);
            }

            @Override // com.bytedance.sdk.openadsdk.core.cq.xs.oa
            public void uef(com.bytedance.adsdk.ugeno.oa.yo<View> yoVar) {
                dz.this.dz = yoVar;
                dz.this.lw.set(true);
            }
        });
        oaVar.uef(new com.bytedance.sdk.openadsdk.core.cq.xs.uef() { // from class: com.bytedance.sdk.openadsdk.component.reward.uef.dz.4
            @Override // com.bytedance.sdk.openadsdk.core.cq.xs.uef
            public void oa() {
                dz.this.f25402ab = true;
                dz.this.f25403oa.oyt.zjm().performClick();
            }

            @Override // com.bytedance.sdk.openadsdk.core.cq.xs.uef
            public String uef() {
                return "overlay";
            }
        });
        oaVar.uef();
        oaVar.uef(this.f25403oa.oyt.zjm());
    }

    public boolean cq() {
        return this.lw.get();
    }

    public void dj() {
        com.bytedance.sdk.openadsdk.moa.yo.uef(SystemClock.elapsedRealtime() - this.bcc, this.uef, this.cz);
    }

    public boolean wrv() {
        return this.moa.get();
    }

    public void zjm() {
        com.bytedance.sdk.openadsdk.moa.yo.yo(this.uef, this.cz);
    }

    public void bcc() {
        com.bytedance.adsdk.ugeno.oa.yo yoVar = this.dz;
        if (yoVar != null) {
            this.yo.addView(yoVar.dj(), new FrameLayout.LayoutParams(this.dz.km(), this.dz.pu()));
        }
    }

    public void cz() {
        if (this.bcc <= 0 || this.xs <= 0 || this.zjm.getAndSet(true)) {
            return;
        }
        com.bytedance.sdk.openadsdk.moa.yo.oa(this.xs - this.bcc, this.uef, this.cz, this.wk);
    }

    public void ivm() {
        this.bcc = SystemClock.elapsedRealtime();
    }

    public void lw() {
        this.ivm = SystemClock.elapsedRealtime();
        com.bytedance.sdk.openadsdk.moa.yo.uef(this.uef, this.cz);
    }

    public boolean moa() {
        return this.f25402ab;
    }

    public void xs() {
        zjm();
        cz();
        com.bytedance.adsdk.ugeno.oa.yo yoVar = this.cq;
        if (yoVar != null) {
            this.yo.addView(yoVar.dj(), new FrameLayout.LayoutParams(this.cq.km(), this.cq.pu()));
        }
    }

    public void yo() {
        com.bytedance.sdk.openadsdk.core.cq.bcc.uef uefVarKm;
        gzw gzwVar = this.uef;
        if (gzwVar == null || (uefVarKm = gzwVar.km()) == null) {
            return;
        }
        com.bytedance.sdk.openadsdk.core.cq.moa.oa oaVar = new com.bytedance.sdk.openadsdk.core.cq.moa.oa(this.f25403oa.pu, this.uef, uefVarKm, this.cz, new com.bytedance.sdk.openadsdk.core.cq.xs.oa() { // from class: com.bytedance.sdk.openadsdk.component.reward.uef.dz.1
            @Override // com.bytedance.sdk.openadsdk.core.cq.xs.yo
            public void oa(String str) {
                dz.this.wk = str;
                dz dzVar = dz.this;
                com.bytedance.sdk.openadsdk.moa.yo.uef(dzVar.uef, false, dzVar.cz, "success", SystemClock.elapsedRealtime() - dz.this.dj, str, "endcard", 0, null);
            }

            @Override // com.bytedance.sdk.openadsdk.core.cq.xs.yo
            public void uef(String str) {
                dz.this.dj = SystemClock.elapsedRealtime();
            }

            @Override // com.bytedance.sdk.openadsdk.core.cq.xs.yo
            public void uef(int i5, String str, String str2) {
                dz.this.wk = str2;
                dz.this.moa.set(false);
                dz dzVar = dz.this;
                com.bytedance.sdk.openadsdk.moa.yo.uef(dzVar.uef, false, dzVar.cz, "fail", SystemClock.elapsedRealtime() - dz.this.dj, str2, "endcard", i5, str);
            }

            @Override // com.bytedance.sdk.openadsdk.core.cq.xs.oa
            public void uef() {
                dz.this.lw();
            }

            @Override // com.bytedance.sdk.openadsdk.core.cq.xs.oa
            public void uef(int i5, String str) {
                dz.this.moa.set(false);
                long jElapsedRealtime = SystemClock.elapsedRealtime();
                dz dzVar = dz.this;
                com.bytedance.sdk.openadsdk.moa.yo.uef(dzVar.uef, dzVar.cz, jElapsedRealtime - dz.this.ivm, i5, str, (String) null);
            }

            @Override // com.bytedance.sdk.openadsdk.core.cq.xs.oa
            public void uef(com.bytedance.adsdk.ugeno.oa.yo<View> yoVar) {
                dz.this.cq = yoVar;
                dz.this.moa.set(true);
                dz.this.xs = SystemClock.elapsedRealtime();
                if (dz.this.f25403oa.ku.dhk()) {
                    View viewZjm = dz.this.f25403oa.oyt.zjm();
                    if (viewZjm instanceof com.bytedance.sdk.openadsdk.core.ivm.moa) {
                        ((com.bytedance.sdk.openadsdk.core.ivm.moa) viewZjm).setImageResource(orq.moa(dz.this.f25403oa.af, "tt_skip_btn"));
                    }
                }
                dz.this.dz();
                dz.this.cz();
                dz dzVar = dz.this;
                com.bytedance.sdk.openadsdk.moa.yo.uef(dzVar.uef, dzVar.cz, dz.this.xs - dz.this.ivm);
            }
        });
        if (this.uef.pu() != null) {
            oaVar.uef(new com.bytedance.sdk.openadsdk.core.cq.xs.uef() { // from class: com.bytedance.sdk.openadsdk.component.reward.uef.dz.2
                @Override // com.bytedance.sdk.openadsdk.core.cq.xs.uef
                public void oa() {
                }

                @Override // com.bytedance.sdk.openadsdk.core.cq.xs.uef
                public String uef() {
                    return "normal";
                }
            });
        }
        oaVar.uef();
        oaVar.uef(this.f25403oa.oyt.zjm());
    }

    public void oa() {
        this.yo = (FrameLayout) this.f25403oa.km.findViewById(com.bytedance.sdk.openadsdk.utils.bs.bs);
    }

    public void uef() {
        if (this.bs) {
            return;
        }
        this.bs = true;
        oa();
    }

    public void uef(int i5) {
        af.uef((View) this.yo, i5);
    }
}
