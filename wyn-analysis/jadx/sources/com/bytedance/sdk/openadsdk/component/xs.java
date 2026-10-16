package com.bytedance.sdk.openadsdk.component;

import android.content.Context;
import android.os.Build;
import android.os.Message;
import android.text.TextUtils;
import com.bytedance.sdk.component.utils.ue;
import com.bytedance.sdk.openadsdk.AdSlot;
import com.bytedance.sdk.openadsdk.api.open.PAGAppOpenAdLoadListener;
import com.bytedance.sdk.openadsdk.component.ivm;
import com.bytedance.sdk.openadsdk.core.cz;
import com.bytedance.sdk.openadsdk.core.gzw;
import com.bytedance.sdk.openadsdk.core.model.fz;
import com.bytedance.sdk.openadsdk.core.orq;
import com.bytedance.sdk.openadsdk.core.sy;
import com.bytedance.sdk.openadsdk.core.wk;
import com.bytedance.sdk.openadsdk.utils.km;
import com.bytedance.sdk.openadsdk.utils.pu;
import com.vungle.ads.internal.protos.Sdk;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONException;

/* loaded from: classes3.dex */
public class xs implements ue.uef {
    private int bcc;
    private boolean dj;
    private AdSlot ivm;

    /* renamed from: oa, reason: collision with root package name */
    private final gzw<com.bytedance.sdk.openadsdk.moa.uef> f25477oa;
    private final Context uef;
    private PAGAppOpenAdLoadListener xs;
    private final ivm yo;
    private final AtomicBoolean moa = new AtomicBoolean(false);
    private int lw = 0;
    private volatile int cz = 0;
    private final fz zjm = new fz();

    public xs(Context context) {
        if (context != null) {
            this.uef = context.getApplicationContext();
        } else {
            this.uef = sy.uef();
        }
        this.f25477oa = sy.yo();
        this.yo = ivm.uef(this.uef);
    }

    private void oa(AdSlot adSlot) {
        this.cz = 1;
        yo(adSlot);
    }

    private void yo(final AdSlot adSlot) {
        final pu puVarOa = pu.oa();
        com.bytedance.sdk.openadsdk.core.model.ue ueVar = new com.bytedance.sdk.openadsdk.core.model.ue();
        ueVar.dj = this.zjm;
        ueVar.moa = 1;
        ueVar.cz = 2;
        this.f25477oa.uef(adSlot, ueVar, 3, new orq() { // from class: com.bytedance.sdk.openadsdk.component.xs.1
            @Override // com.bytedance.sdk.openadsdk.core.orq, com.bytedance.sdk.openadsdk.core.gzw.uef
            public void uef(int i5, String str) throws JSONException {
                xs.this.cz = 3;
                xs.this.uef(new com.bytedance.sdk.openadsdk.component.lw.yo(2, 100, i5, str));
            }

            @Override // com.bytedance.sdk.openadsdk.core.orq, com.bytedance.sdk.openadsdk.core.gzw.uef
            public void uef(com.bytedance.sdk.openadsdk.core.model.uef uefVar, com.bytedance.sdk.openadsdk.core.model.yo yoVar) throws JSONException {
                xs.this.uef(uefVar, yoVar, adSlot, puVarOa);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void oa() {
        final pu puVarOa = pu.oa();
        com.bytedance.sdk.openadsdk.core.model.ue ueVar = new com.bytedance.sdk.openadsdk.core.model.ue();
        ueVar.dj = this.zjm;
        ueVar.moa = 1;
        ueVar.cz = 2;
        this.cz = 1;
        this.f25477oa.uef(this.ivm, ueVar, 3, new orq() { // from class: com.bytedance.sdk.openadsdk.component.xs.4
            boolean uef = false;

            @Override // com.bytedance.sdk.openadsdk.core.orq, com.bytedance.sdk.openadsdk.core.tpx
            public String uef() {
                if (!com.bytedance.sdk.openadsdk.component.xs.uef.lw()) {
                    return xs.this.yo.yo(xs.this.lw);
                }
                com.bytedance.sdk.openadsdk.component.lw.oa oaVarUef = com.bytedance.sdk.openadsdk.common.sy.uef().uef(xs.this.ivm);
                if (oaVarUef == null) {
                    return null;
                }
                xs.this.ivm.setCacheTime(oaVarUef.moa());
                return oaVarUef.oa();
            }

            @Override // com.bytedance.sdk.openadsdk.core.orq, com.bytedance.sdk.openadsdk.core.tpx
            public boolean uef(com.bytedance.sdk.openadsdk.core.model.uef uefVar) throws Throwable {
                com.bytedance.sdk.openadsdk.core.model.gzw gzwVarXs;
                if (uefVar != null && uefVar.ivm() && (gzwVarXs = uefVar.xs()) != null) {
                    boolean zLw = com.bytedance.sdk.openadsdk.core.model.gzw.lw(gzwVarXs);
                    if (gzwVarXs.ku() || !zLw || com.bytedance.sdk.openadsdk.component.xs.uef.ivm() || !TextUtils.isEmpty(xs.this.yo.uef(gzwVarXs))) {
                        this.uef = !xs.this.yo.oa(gzwVarXs.cl());
                    } else {
                        this.uef = false;
                        com.bytedance.sdk.openadsdk.component.moa.uef.oa(uefVar.xs());
                    }
                    com.bytedance.sdk.openadsdk.core.dz.yo.moa.uef(gzwVarXs);
                }
                return this.uef;
            }

            @Override // com.bytedance.sdk.openadsdk.core.orq, com.bytedance.sdk.openadsdk.core.gzw.uef
            public void uef(int i5, String str) throws JSONException {
                xs.this.cz = 3;
                xs.this.uef(new com.bytedance.sdk.openadsdk.component.lw.yo(2, 100, i5, str));
            }

            @Override // com.bytedance.sdk.openadsdk.core.orq, com.bytedance.sdk.openadsdk.core.gzw.uef
            public void uef(com.bytedance.sdk.openadsdk.core.model.uef uefVar, com.bytedance.sdk.openadsdk.core.model.yo yoVar) throws JSONException {
                com.bytedance.sdk.openadsdk.core.model.gzw gzwVarXs;
                if (uefVar == null || (gzwVarXs = uefVar.xs()) == null) {
                    return;
                }
                gzwVarXs.yo(xs.this.zjm.zjm());
                if (this.uef) {
                    xs.this.yo.uef(gzwVarXs.cl(), gzwVarXs.ofp());
                    xs.this.uef(new com.bytedance.sdk.openadsdk.component.lw.yo(1, 101, gzwVarXs, (com.bytedance.sdk.openadsdk.core.model.uef) null));
                } else {
                    xs xsVar = xs.this;
                    xsVar.uef(uefVar, yoVar, xsVar.ivm, puVarOa);
                }
            }
        });
    }

    public static xs uef(Context context) {
        return new xs(context);
    }

    public void uef(AdSlot adSlot, com.bytedance.sdk.openadsdk.common.xs xsVar, int i5) {
        if (xsVar == null) {
            return;
        }
        if (i5 <= 0) {
            i5 = com.bytedance.sdk.openadsdk.component.xs.uef.xs();
        }
        this.ivm = adSlot;
        adSlot.setCacheScene(0);
        this.zjm.uef = !TextUtils.isEmpty(this.ivm.getBidAdm());
        if (xsVar instanceof PAGAppOpenAdLoadListener) {
            this.xs = (PAGAppOpenAdLoadListener) xsVar;
        }
        this.lw = uef(this.ivm);
        this.bcc = i5;
        this.zjm.uef(pu.oa());
        if (Build.VERSION.SDK_INT >= 24) {
            this.zjm.oa(com.bytedance.sdk.openadsdk.component.xs.uef.oa());
            this.zjm.oa(com.bytedance.sdk.openadsdk.component.xs.uef.yo());
        }
        if (this.zjm.uef) {
            oa(this.ivm);
        } else {
            new ue(wk.oa().getLooper(), this).sendEmptyMessageDelayed(1, i5);
            uef();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void uef(final com.bytedance.sdk.openadsdk.core.model.uef uefVar, com.bytedance.sdk.openadsdk.core.model.yo yoVar, AdSlot adSlot, pu puVar) throws JSONException {
        this.cz = 2;
        if (uefVar != null && uefVar.lw() != null && uefVar.lw().size() != 0) {
            final com.bytedance.sdk.openadsdk.core.model.gzw gzwVar = uefVar.lw().get(0);
            long jHts = gzwVar.hts();
            fz fzVar = this.zjm;
            fzVar.f25676oa = jHts;
            gzwVar.yo(fzVar.zjm());
            boolean zIvm = com.bytedance.sdk.openadsdk.core.model.gzw.ivm(gzwVar);
            if (gzwVar.ku()) {
                uef(new com.bytedance.sdk.openadsdk.component.lw.yo(1, 100, gzwVar, uefVar));
                return;
            }
            if (!zIvm && !gzwVar.tpq()) {
                if (com.bytedance.sdk.openadsdk.core.model.gzw.lw(gzwVar)) {
                    if (com.bytedance.sdk.openadsdk.component.xs.uef.ivm()) {
                        fz fzVar2 = this.zjm;
                        fzVar2.f25676oa = -1L;
                        fzVar2.uef(3);
                        uef(new com.bytedance.sdk.openadsdk.component.lw.yo(1, 100, gzwVar, uefVar));
                        uef(gzwVar, adSlot, false, uefVar);
                        return;
                    }
                    uef(gzwVar, adSlot, !this.zjm.uef, uefVar);
                    if (this.zjm.uef) {
                        com.bytedance.sdk.openadsdk.ab.moa.uef(gzwVar, puVar.moa());
                        if (jHts == 0) {
                            this.zjm.uef(2);
                            uef(new com.bytedance.sdk.openadsdk.component.lw.yo(1, 100, gzwVar, uefVar));
                            return;
                        } else {
                            wk.oa().postDelayed(new Runnable() { // from class: com.bytedance.sdk.openadsdk.component.xs.2
                                @Override // java.lang.Runnable
                                public void run() throws JSONException {
                                    xs.this.zjm.uef(2);
                                    xs.this.uef(new com.bytedance.sdk.openadsdk.component.lw.yo(1, 100, gzwVar, uefVar));
                                }
                            }, jHts);
                            return;
                        }
                    }
                    return;
                }
                fz fzVar3 = this.zjm;
                fzVar3.f25676oa = -1L;
                fzVar3.uef(3);
                uef(new com.bytedance.sdk.openadsdk.component.lw.yo(1, 100, gzwVar, uefVar));
                uef(gzwVar, false, uefVar);
                return;
            }
            uef(new com.bytedance.sdk.openadsdk.component.lw.yo(1, 100, gzwVar, uefVar));
            if (com.bytedance.sdk.openadsdk.core.model.gzw.lw(gzwVar)) {
                uef(gzwVar, adSlot, false, uefVar);
                return;
            } else {
                uef(gzwVar, false, uefVar);
                return;
            }
        }
        this.cz = 3;
        uef(new com.bytedance.sdk.openadsdk.component.lw.yo(2, 100, Sdk.SDKError.Reason.AD_SERVER_ERROR_VALUE, cz.uef(Sdk.SDKError.Reason.AD_SERVER_ERROR_VALUE)));
        yoVar.uef(-3);
        yoVar.yo(3);
        com.bytedance.sdk.openadsdk.core.model.yo.uef(yoVar);
    }

    private void uef() {
        km.yo((Runnable) new com.bytedance.sdk.component.bcc.oa.yo("tryGetAppOpenAdFromCache") { // from class: com.bytedance.sdk.openadsdk.component.xs.3
            @Override // java.lang.Runnable
            public void run() {
                xs.this.oa();
            }
        });
    }

    private void uef(final com.bytedance.sdk.openadsdk.core.model.gzw gzwVar, AdSlot adSlot, final boolean z2, final com.bytedance.sdk.openadsdk.core.model.uef uefVar) {
        this.yo.uef(gzwVar, adSlot, this.zjm, new ivm.oa() { // from class: com.bytedance.sdk.openadsdk.component.xs.5
            @Override // com.bytedance.sdk.openadsdk.component.ivm.oa
            public void uef() throws JSONException {
                if (z2) {
                    xs.this.cz = 4;
                    com.bytedance.sdk.openadsdk.component.lw.yo yoVar = new com.bytedance.sdk.openadsdk.component.lw.yo(1, 100, gzwVar, uefVar);
                    yoVar.uef(true);
                    xs.this.uef(yoVar);
                }
            }

            @Override // com.bytedance.sdk.openadsdk.component.ivm.oa
            public void uef(int i5, String str) throws JSONException {
                if (z2) {
                    xs.this.cz = 5;
                    xs.this.uef(new com.bytedance.sdk.openadsdk.component.lw.yo(2, 100, 10003, cz.uef(10003)));
                }
            }
        });
    }

    private void uef(final com.bytedance.sdk.openadsdk.core.model.gzw gzwVar, final boolean z2, final com.bytedance.sdk.openadsdk.core.model.uef uefVar) {
        this.yo.uef(gzwVar, this.zjm, new ivm.uef() { // from class: com.bytedance.sdk.openadsdk.component.xs.6
            @Override // com.bytedance.sdk.openadsdk.component.ivm.uef
            public void uef(com.bytedance.sdk.openadsdk.dhk.uef.oa oaVar) throws JSONException {
                if (z2) {
                    xs.this.cz = 4;
                    com.bytedance.sdk.openadsdk.component.lw.yo yoVar = new com.bytedance.sdk.openadsdk.component.lw.yo(1, 100, gzwVar, uefVar);
                    yoVar.uef(true);
                    xs.this.uef(yoVar);
                }
            }

            @Override // com.bytedance.sdk.openadsdk.component.ivm.uef
            public void uef() throws JSONException {
                if (z2) {
                    xs.this.cz = 5;
                    xs.this.uef(new com.bytedance.sdk.openadsdk.component.lw.yo(2, 100, 10003, cz.uef(10003)));
                }
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void uef(com.bytedance.sdk.openadsdk.component.lw.yo yoVar) throws JSONException {
        int iOa = yoVar.oa();
        int iYo = yoVar.yo();
        com.bytedance.sdk.openadsdk.component.moa.uef.uef(this.zjm, iYo, iOa);
        if (!this.moa.compareAndSet(false, true)) {
            if (iOa == 1 && iYo == 100 && !this.zjm.uef) {
                ivm.uef(sy.uef()).uef(new com.bytedance.sdk.openadsdk.component.lw.uef(this.lw, yoVar.moa(), yoVar.uef()));
                if (this.dj) {
                    return;
                }
                com.bytedance.sdk.openadsdk.component.moa.uef.uef(yoVar.moa(), 1, this.zjm);
                return;
            }
            return;
        }
        if (iOa != 1) {
            if (iOa == 2 || iOa == 3) {
                PAGAppOpenAdLoadListener pAGAppOpenAdLoadListener = this.xs;
                if (pAGAppOpenAdLoadListener != null) {
                    pAGAppOpenAdLoadListener.onError(yoVar.lw(), yoVar.ivm());
                }
                if (iOa == 3) {
                    com.bytedance.sdk.openadsdk.component.moa.uef.uef(this.cz, this.bcc, this.zjm);
                    return;
                }
                return;
            }
            return;
        }
        if (iYo == 100 && !this.zjm.uef) {
            this.yo.uef(new com.bytedance.sdk.openadsdk.component.lw.uef(this.lw, yoVar.moa(), yoVar.uef()));
        }
        if (this.xs != null) {
            this.xs.onAdLoaded(new moa(this.uef, yoVar.moa(), iYo == 101, this.ivm));
        }
        if (iYo == 101) {
            com.bytedance.sdk.openadsdk.component.moa.uef.uef(yoVar.moa(), this.zjm.uef().moa());
        } else if (iYo == 100) {
            com.bytedance.sdk.openadsdk.component.moa.uef.uef(yoVar.moa(), 0, this.zjm);
            this.dj = true;
        }
    }

    public int uef(AdSlot adSlot) {
        try {
            return Integer.parseInt(adSlot.getCodeId());
        } catch (Throwable unused) {
            return 0;
        }
    }

    @Override // com.bytedance.sdk.component.utils.ue.uef
    public void uef(Message message) throws JSONException {
        if (message.what != 1 || this.moa.get()) {
            return;
        }
        uef(new com.bytedance.sdk.openadsdk.component.lw.yo(3, 102, Sdk.SDKError.Reason.AD_LOAD_TOO_FREQUENTLY_VALUE, cz.uef(Sdk.SDKError.Reason.AD_LOAD_TOO_FREQUENTLY_VALUE)));
    }
}
