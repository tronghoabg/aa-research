package com.bytedance.sdk.openadsdk.core.wk.oa;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.text.TextUtils;
import android.util.Pair;
import android.view.SurfaceView;
import android.view.TextureView;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import com.bykv.vk.openvk.uef.uef.uef.moa.yo;
import com.bykv.vk.openvk.uef.uef.uef.uef;
import com.bytedance.sdk.component.utils.cz;
import com.bytedance.sdk.component.utils.dhk;
import com.bytedance.sdk.component.utils.gr;
import com.bytedance.sdk.component.utils.sy;
import com.bytedance.sdk.openadsdk.ApmHelper;
import com.bytedance.sdk.openadsdk.api.nativeAd.PAGNativeAd;
import com.bytedance.sdk.openadsdk.core.model.gzw;
import com.bytedance.sdk.openadsdk.core.wk.oa.ivm;
import com.bytedance.sdk.openadsdk.core.zjm.ue;
import com.bytedance.sdk.openadsdk.moa.lw.oa.wk;
import com.bytedance.sdk.openadsdk.moa.xs;
import com.bytedance.sdk.openadsdk.utils.km;
import com.iab.omid.library.bytedance2.adsession.FriendlyObstructionPurpose;
import com.unity3d.services.UnityAdsConstants;
import j$.util.Objects;
import java.lang.ref.WeakReference;
import java.util.List;

/* loaded from: classes3.dex */
public class yo extends com.bytedance.sdk.openadsdk.core.wk.uef.uef {
    private final boolean af;
    private int au;
    private int cop;
    private xs dor;
    private int dv;
    private oa etd;
    private final String gb;
    private WeakReference<uef> gem;
    private int hts;
    private long km;
    private final gr.uef nkh;
    private long oyt;
    private final boolean pu;
    private final uef.InterfaceC0034uef rj;
    private boolean rl;
    private final boolean sk;
    private WeakReference<yo.moa> swd;
    private int uqx;
    private boolean vyg;
    private final Runnable zou;

    public interface uef {
        void ivm();

        void uef(int i5);
    }

    public yo(Context context, ViewGroup viewGroup, gzw gzwVar, String str, boolean z2, boolean z10, boolean z11, xs xsVar) {
        super(context, gzwVar, viewGroup);
        this.oyt = 0L;
        this.km = 0L;
        this.rl = true;
        this.cop = 0;
        this.au = 0;
        this.rj = new uef.InterfaceC0034uef() { // from class: com.bytedance.sdk.openadsdk.core.wk.oa.yo.1
            @Override // com.bykv.vk.openvk.uef.uef.uef.uef.InterfaceC0034uef
            public void lw(com.bykv.vk.openvk.uef.uef.uef.uef uefVar) {
                com.bytedance.sdk.openadsdk.core.dz.moa moaVarUef;
                com.bytedance.sdk.openadsdk.core.model.moa moaVarOdd = ((com.bytedance.sdk.openadsdk.core.wk.uef.uef) yo.this).bcc.odd();
                if (moaVarOdd != null && (moaVarUef = moaVarOdd.uef()) != null) {
                    moaVarUef.yo(((com.bytedance.sdk.openadsdk.core.wk.uef.uef) yo.this).cz);
                }
                if (((com.bytedance.sdk.openadsdk.core.wk.uef.uef) yo.this).pz != null) {
                    ((com.bytedance.sdk.openadsdk.core.wk.uef.uef) yo.this).pz.uef(1);
                }
            }

            @Override // com.bykv.vk.openvk.uef.uef.uef.uef.InterfaceC0034uef
            public void moa(com.bykv.vk.openvk.uef.uef.uef.uef uefVar) {
                com.bytedance.sdk.openadsdk.core.dz.moa moaVarUef;
                com.bytedance.sdk.openadsdk.core.model.moa moaVarOdd = ((com.bytedance.sdk.openadsdk.core.wk.uef.uef) yo.this).bcc.odd();
                if (moaVarOdd != null && (moaVarUef = moaVarOdd.uef()) != null) {
                    moaVarUef.oa(((com.bytedance.sdk.openadsdk.core.wk.uef.uef) yo.this).cz);
                }
                com.bytedance.sdk.openadsdk.gsd.oa.lw.uef(((com.bytedance.sdk.openadsdk.core.wk.uef.uef) yo.this).bcc, 3);
                if (((com.bytedance.sdk.openadsdk.core.wk.uef.uef) yo.this).pz != null) {
                    ((com.bytedance.sdk.openadsdk.core.wk.uef.uef) yo.this).pz.uef(0);
                }
            }

            @Override // com.bykv.vk.openvk.uef.uef.uef.uef.InterfaceC0034uef
            public void oa(com.bykv.vk.openvk.uef.uef.uef.uef uefVar, int i5) {
            }

            @Override // com.bykv.vk.openvk.uef.uef.uef.uef.InterfaceC0034uef
            public void uef(com.bykv.vk.openvk.uef.uef.uef.uef uefVar) {
                com.bytedance.sdk.openadsdk.core.dz.moa moaVarUef;
                ((com.bytedance.sdk.openadsdk.core.wk.uef.uef) yo.this).yo.post(new Runnable() { // from class: com.bytedance.sdk.openadsdk.core.wk.oa.yo.1.1
                    @Override // java.lang.Runnable
                    public void run() {
                        try {
                            com.bytedance.sdk.openadsdk.gsd.oa.lw.uef(((com.bytedance.sdk.openadsdk.core.wk.uef.uef) yo.this).bcc, 5);
                            com.bytedance.sdk.openadsdk.gsd.uef.yo.uef(((com.bytedance.sdk.openadsdk.core.wk.uef.uef) yo.this).bcc, 5);
                            if (((com.bytedance.sdk.openadsdk.core.wk.uef.uef) yo.this).pz != null) {
                                ((com.bytedance.sdk.openadsdk.core.wk.uef.uef) yo.this).pz.uef(9);
                            }
                        } catch (Exception unused) {
                        }
                        yo.this.af();
                    }
                });
                com.bytedance.sdk.openadsdk.core.model.moa moaVarOdd = ((com.bytedance.sdk.openadsdk.core.wk.uef.uef) yo.this).bcc.odd();
                if (moaVarOdd == null || (moaVarUef = moaVarOdd.uef()) == null) {
                    return;
                }
                moaVarUef.moa(((com.bytedance.sdk.openadsdk.core.wk.uef.uef) yo.this).cz);
            }

            @Override // com.bykv.vk.openvk.uef.uef.uef.uef.InterfaceC0034uef
            public void yo(com.bykv.vk.openvk.uef.uef.uef.uef uefVar) {
            }

            @Override // com.bykv.vk.openvk.uef.uef.uef.uef.InterfaceC0034uef
            public void oa(com.bykv.vk.openvk.uef.uef.uef.uef uefVar) {
                ((com.bytedance.sdk.openadsdk.core.wk.uef.uef) yo.this).yo.removeCallbacks(yo.this.zou);
                ((com.bytedance.sdk.openadsdk.core.wk.uef.uef) yo.this).yo.post(new Runnable() { // from class: com.bytedance.sdk.openadsdk.core.wk.oa.yo.1.3
                    @Override // java.lang.Runnable
                    public void run() {
                        if (yo.this.swd != null && yo.this.swd.get() != null) {
                            yo.this.swd.get();
                        }
                        if (((com.bytedance.sdk.openadsdk.core.wk.uef.uef) yo.this).xs != null) {
                            ((com.bytedance.sdk.openadsdk.core.wk.uef.uef) yo.this).xs.oa();
                        }
                    }
                });
                if (yo.this.pu) {
                    return;
                }
                yo yoVar = yo.this;
                yoVar.uef(yoVar.dor);
            }

            @Override // com.bykv.vk.openvk.uef.uef.uef.uef.InterfaceC0034uef
            public void uef(com.bykv.vk.openvk.uef.uef.uef.uef uefVar, long j8) {
                ((com.bytedance.sdk.openadsdk.core.wk.uef.uef) yo.this).gsd = false;
                ((com.bytedance.sdk.openadsdk.core.wk.uef.uef) yo.this).yo.removeCallbacks(yo.this.zou);
                ((com.bytedance.sdk.openadsdk.core.wk.uef.uef) yo.this).yo.post(new Runnable() { // from class: com.bytedance.sdk.openadsdk.core.wk.oa.yo.1.2
                    @Override // java.lang.Runnable
                    public void run() {
                        if (((com.bytedance.sdk.openadsdk.core.wk.uef.uef) yo.this).xs != null) {
                            ((com.bytedance.sdk.openadsdk.core.wk.uef.uef) yo.this).xs.oa();
                        }
                        if (!((com.bytedance.sdk.openadsdk.core.wk.uef.uef) yo.this).wk || yo.this.gem == null || yo.this.gem.get() == null) {
                            return;
                        }
                        ((uef) yo.this.gem.get()).ivm();
                    }
                });
                yo.this.lz();
                com.bytedance.sdk.openadsdk.gsd.oa.lw.uef(((com.bytedance.sdk.openadsdk.core.wk.uef.uef) yo.this).bcc, 0);
                if (((com.bytedance.sdk.openadsdk.core.wk.uef.uef) yo.this).pz != null) {
                    ((com.bytedance.sdk.openadsdk.core.wk.uef.uef) yo.this).pz.yo();
                }
                yo yoVar = yo.this;
                yoVar.uef(yoVar.dor);
            }

            @Override // com.bykv.vk.openvk.uef.uef.uef.uef.InterfaceC0034uef
            public void uef(com.bykv.vk.openvk.uef.uef.uef.uef uefVar, final com.bykv.vk.openvk.uef.uef.uef.yo.uef uefVar2) {
                com.bytedance.sdk.openadsdk.core.dz.moa moaVarUef;
                String unused = ((com.bytedance.sdk.openadsdk.core.wk.uef.uef) yo.this).uef;
                uefVar2.uef();
                uefVar2.oa();
                uefVar2.yo();
                ((com.bytedance.sdk.openadsdk.core.wk.uef.uef) yo.this).yo.post(new Runnable() { // from class: com.bytedance.sdk.openadsdk.core.wk.oa.yo.1.4
                    @Override // java.lang.Runnable
                    public void run() {
                        int iUef = uefVar2.uef();
                        int iOa = uefVar2.oa();
                        if (!yo.this.ue() || iOa == -1004) {
                            if (yo.this.moa(iUef, iOa)) {
                                String unused2 = ((com.bytedance.sdk.openadsdk.core.wk.uef.uef) yo.this).uef;
                                ((com.bytedance.sdk.openadsdk.core.wk.uef.uef) yo.this).xs.uef2(((com.bytedance.sdk.openadsdk.core.wk.uef.uef) yo.this).bcc, (WeakReference<Context>) null, false);
                                yo.this.oa(true);
                                yo.this.lw();
                            }
                            if (((com.bytedance.sdk.openadsdk.core.wk.uef.uef) yo.this).xs != null) {
                                ((com.bytedance.sdk.openadsdk.core.wk.uef.uef) yo.this).xs.oa();
                            }
                            if (((com.bytedance.sdk.openadsdk.core.wk.uef.uef) yo.this).f25807ue != null) {
                                ((com.bytedance.sdk.openadsdk.core.wk.uef.uef) yo.this).f25807ue.oa(yo.this.km, com.bykv.vk.openvk.uef.uef.oa.moa.uef.uef(((com.bytedance.sdk.openadsdk.core.wk.uef.uef) yo.this).cz, ((com.bytedance.sdk.openadsdk.core.wk.uef.uef) yo.this).dxx));
                            }
                            if (yo.this.swd == null || yo.this.swd.get() == null || yo.this.ue()) {
                                return;
                            }
                            ((yo.moa) yo.this.swd.get()).uef(iUef, iOa);
                        }
                    }
                });
                yo.this.uef(uefVar2);
                com.bytedance.sdk.openadsdk.core.model.moa moaVarOdd = ((com.bytedance.sdk.openadsdk.core.wk.uef.uef) yo.this).bcc.odd();
                if (moaVarOdd != null && (moaVarUef = moaVarOdd.uef()) != null) {
                    moaVarUef.uef(com.bytedance.sdk.openadsdk.core.dz.uef.uef.GENERAL_LINEAR_AD_ERROR);
                }
                com.bytedance.sdk.openadsdk.gsd.oa.lw.uef(((com.bytedance.sdk.openadsdk.core.wk.uef.uef) yo.this).bcc, 6);
                com.bytedance.sdk.openadsdk.gsd.uef.yo.oa(((com.bytedance.sdk.openadsdk.core.wk.uef.uef) yo.this).bcc);
                if (((com.bytedance.sdk.openadsdk.core.wk.uef.uef) yo.this).pz != null) {
                    ((com.bytedance.sdk.openadsdk.core.wk.uef.uef) yo.this).pz.uef(14);
                }
            }

            @Override // com.bykv.vk.openvk.uef.uef.uef.uef.InterfaceC0034uef
            public void uef(com.bykv.vk.openvk.uef.uef.uef.uef uefVar, boolean z12) {
                ((com.bytedance.sdk.openadsdk.core.wk.uef.uef) yo.this).yo.post(new Runnable() { // from class: com.bytedance.sdk.openadsdk.core.wk.oa.yo.1.5
                    @Override // java.lang.Runnable
                    public void run() {
                        if (((com.bytedance.sdk.openadsdk.core.wk.uef.uef) yo.this).xs != null) {
                            ((com.bytedance.sdk.openadsdk.core.wk.uef.uef) yo.this).xs.oa();
                        }
                    }
                });
            }

            @Override // com.bykv.vk.openvk.uef.uef.uef.uef.InterfaceC0034uef
            public void uef(com.bykv.vk.openvk.uef.uef.uef.uef uefVar, int i5, int i10) {
                cz.uef().post(new Runnable() { // from class: com.bytedance.sdk.openadsdk.core.wk.oa.yo.1.6
                    @Override // java.lang.Runnable
                    public void run() {
                        yo.this.rl();
                    }
                });
            }

            @Override // com.bykv.vk.openvk.uef.uef.uef.uef.InterfaceC0034uef
            public void uef(com.bykv.vk.openvk.uef.uef.uef.uef uefVar, int i5, int i10, int i11) {
                ((com.bytedance.sdk.openadsdk.core.wk.uef.uef) yo.this).gsd = true;
                ((com.bytedance.sdk.openadsdk.core.wk.uef.uef) yo.this).yo.post(new Runnable() { // from class: com.bytedance.sdk.openadsdk.core.wk.oa.yo.1.7
                    @Override // java.lang.Runnable
                    public void run() {
                        if (((com.bytedance.sdk.openadsdk.core.wk.uef.uef) yo.this).xs != null) {
                            ((com.bytedance.sdk.openadsdk.core.wk.uef.uef) yo.this).xs.bs();
                            ((com.bytedance.sdk.openadsdk.core.wk.uef.uef) yo.this).yo.postDelayed(yo.this.zou, 8000L);
                        }
                    }
                });
                com.bytedance.sdk.openadsdk.gsd.oa.lw.uef(((com.bytedance.sdk.openadsdk.core.wk.uef.uef) yo.this).bcc, 2);
                if (((com.bytedance.sdk.openadsdk.core.wk.uef.uef) yo.this).pz != null) {
                    ((com.bytedance.sdk.openadsdk.core.wk.uef.uef) yo.this).pz.uef(4);
                }
            }

            @Override // com.bykv.vk.openvk.uef.uef.uef.uef.InterfaceC0034uef
            public void uef(com.bykv.vk.openvk.uef.uef.uef.uef uefVar, int i5) {
                ((com.bytedance.sdk.openadsdk.core.wk.uef.uef) yo.this).gsd = false;
                ((com.bytedance.sdk.openadsdk.core.wk.uef.uef) yo.this).yo.removeCallbacks(yo.this.zou);
                ((com.bytedance.sdk.openadsdk.core.wk.uef.uef) yo.this).yo.post(new Runnable() { // from class: com.bytedance.sdk.openadsdk.core.wk.oa.yo.1.8
                    @Override // java.lang.Runnable
                    public void run() {
                        ((com.bytedance.sdk.openadsdk.core.wk.uef.uef) yo.this).xs.oa();
                    }
                });
                com.bytedance.sdk.openadsdk.gsd.oa.lw.uef(((com.bytedance.sdk.openadsdk.core.wk.uef.uef) yo.this).bcc, 0);
                if (((com.bytedance.sdk.openadsdk.core.wk.uef.uef) yo.this).pz != null) {
                    ((com.bytedance.sdk.openadsdk.core.wk.uef.uef) yo.this).pz.uef(5);
                }
            }

            @Override // com.bykv.vk.openvk.uef.uef.uef.uef.InterfaceC0034uef
            public void uef(com.bykv.vk.openvk.uef.uef.uef.uef uefVar, final long j8, final long j10) {
                if (Math.abs(j8 - ((com.bytedance.sdk.openadsdk.core.wk.uef.uef) yo.this).cz) < 50) {
                    return;
                }
                yo yoVar = yo.this;
                yoVar.uef(yoVar.dor);
                ((com.bytedance.sdk.openadsdk.core.wk.uef.uef) yo.this).yo.post(new Runnable() { // from class: com.bytedance.sdk.openadsdk.core.wk.oa.yo.1.9
                    @Override // java.lang.Runnable
                    public void run() {
                        yo.this.uef(j8, j10);
                        yo.this.oa(j8, j10);
                    }
                });
            }
        };
        this.dv = 0;
        this.zou = new Runnable() { // from class: com.bytedance.sdk.openadsdk.core.wk.oa.yo.4
            @Override // java.lang.Runnable
            public void run() {
                if (((com.bytedance.sdk.openadsdk.core.wk.uef.uef) yo.this).xs != null) {
                    ((com.bytedance.sdk.openadsdk.core.wk.uef.uef) yo.this).xs.uef2(((com.bytedance.sdk.openadsdk.core.wk.uef.uef) yo.this).bcc, (WeakReference<Context>) null, false);
                    ((com.bytedance.sdk.openadsdk.core.wk.uef.uef) yo.this).xs.oa();
                    yo.this.oa(true);
                    String unused = ((com.bytedance.sdk.openadsdk.core.wk.uef.uef) yo.this).uef;
                }
            }
        };
        this.nkh = new gr.uef() { // from class: com.bytedance.sdk.openadsdk.core.wk.oa.yo.6
            @Override // com.bytedance.sdk.component.utils.gr.uef
            public void uef(Context context2, Intent intent, boolean z12, final int i5) {
                km.uef(new Runnable() { // from class: com.bytedance.sdk.openadsdk.core.wk.oa.yo.6.1
                    @Override // java.lang.Runnable
                    public void run() {
                        yo.this.ivm(i5);
                    }
                });
            }
        };
        this.vyg = false;
        this.hts = sy.yo(context);
        uef(z2);
        this.gb = str;
        try {
            this.cop = viewGroup.getWidth();
            this.au = viewGroup.getHeight();
        } catch (Throwable unused) {
        }
        uef(context);
        this.pu = true;
        this.af = z10;
        this.sk = z11;
        if (xsVar != null) {
            this.dor = xsVar;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean moa(int i5, int i10) {
        boolean z2 = i5 == -1010 || i5 == -1007 || i5 == -1004 || i5 == -110 || i5 == 100 || i5 == 200;
        if (i10 == 1 || i10 == 700 || i10 == 800) {
            return true;
        }
        return z2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void af() {
        this.dv++;
        lw lwVar = this.xs;
        if (lwVar == null) {
            return;
        }
        lwVar.oa();
        yo.uef uefVar = this.f25807ue;
        if (uefVar != null) {
            uefVar.uef(this.km, com.bykv.vk.openvk.uef.uef.oa.moa.uef.uef(this.cz, this.dxx));
        }
        this.km = System.currentTimeMillis() - this.oyt;
        if (this.rl) {
            this.xs.uef2(this.bcc, (WeakReference<Context>) null, true);
        }
        if (!this.tpx) {
            this.tpx = true;
            long j8 = this.dxx;
            oa(j8, j8);
            long j10 = this.dxx;
            this.cz = j10;
            this.zjm = j10;
            oa(this.dor);
        }
        if (!this.wk && this.oib) {
            lw(this.xs, null);
        }
        this.dz = true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void rl() {
        com.bytedance.sdk.openadsdk.core.wk.moa.yo yoVar;
        int i5;
        int i10;
        try {
            if (swd() != null && (yoVar = this.ivm) != null && this.rt != null) {
                int iMoa = yoVar.moa();
                int iLw = this.ivm.lw();
                final int width = this.rt.getWidth();
                final int height = this.rt.getHeight();
                if (width > 0 && height > 0 && iLw > 0 && iMoa > 0) {
                    if (iMoa == iLw) {
                        i10 = width > height ? height : width;
                        i5 = i10;
                    } else if (iMoa > iLw) {
                        i10 = (int) ((width * 1.0d) / ((iMoa * 1.0f) / iLw));
                        i5 = width;
                    } else {
                        i5 = (int) ((height * 1.0d) / ((iLw * 1.0f) / iMoa));
                        i10 = height;
                    }
                    if (i10 <= height && i10 > 0) {
                        height = i10;
                    }
                    if (i5 <= width && i5 > 0) {
                        width = i5;
                    }
                    this.yo.post(new Runnable() { // from class: com.bytedance.sdk.openadsdk.core.wk.oa.yo.5
                        @Override // java.lang.Runnable
                        public void run() {
                            try {
                                RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(width, height);
                                layoutParams.addRule(13);
                                if (yo.this.swd() instanceof TextureView) {
                                    ((TextureView) yo.this.swd()).setLayoutParams(layoutParams);
                                    String unused = ((com.bytedance.sdk.openadsdk.core.wk.uef.uef) yo.this).uef;
                                } else if (yo.this.swd() instanceof SurfaceView) {
                                    ((SurfaceView) yo.this.swd()).setLayoutParams(layoutParams);
                                    String unused2 = ((com.bytedance.sdk.openadsdk.core.wk.uef.uef) yo.this).uef;
                                }
                            } catch (Throwable unused3) {
                                String unused4 = ((com.bytedance.sdk.openadsdk.core.wk.uef.uef) yo.this).uef;
                            }
                        }
                    });
                    return;
                }
                return;
            }
            Objects.toString(this.dj);
            Objects.toString(swd());
        } catch (Throwable th) {
            th.toString();
        }
    }

    private void sk() {
        com.bytedance.sdk.openadsdk.core.wk.moa.yo yoVar = this.ivm;
        if (yoVar != null) {
            if (!yoVar.xs()) {
                this.ivm.uef(false, this.cz, this.f25805ab);
            } else if (this.cq) {
                dhk();
            } else {
                oa(this.lz);
            }
        }
        if (this.dhk.get()) {
            pz();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public com.bykv.vk.openvk.uef.uef.uef.ivm.oa swd() {
        lw lwVar;
        if (this.dj.getResources().getConfiguration().orientation != 1 || (lwVar = this.xs) == null) {
            return null;
        }
        return lwVar.cq();
    }

    public void ab() {
        if (this.vyg || !this.orq) {
            return;
        }
        Context applicationContext = com.bytedance.sdk.openadsdk.core.sy.uef().getApplicationContext();
        this.vyg = true;
        gr.uef(this.nkh, applicationContext);
    }

    public int gb() {
        return this.uqx;
    }

    public void ivm(boolean z2) {
        this.rl = z2;
    }

    public void km() {
        com.bytedance.sdk.openadsdk.core.dz.ivm ivmVar = this.pz;
        if (ivmVar != null) {
            ivmVar.uef(13);
        }
    }

    @Override // com.bykv.vk.openvk.uef.uef.uef.moa.yo
    public void lw() {
        com.bytedance.sdk.openadsdk.core.wk.moa.yo yoVar = this.ivm;
        if (yoVar != null) {
            yoVar.wrv();
            this.ivm = null;
        }
        if (this.rl) {
            if ("embeded_ad".equals(this.gb)) {
                this.xs.dhk();
            } else {
                this.xs.uef2(this.bcc, (WeakReference<Context>) null, true);
            }
            this.yo.removeCallbacksAndMessages(null);
            this.wrv.clear();
            if (this.wk) {
                oyt();
            }
        }
    }

    public void oyt() {
        if (this.vyg && this.orq) {
            this.vyg = false;
            gr.uef(this.nkh);
        }
    }

    public void pu() {
        if (this.ivm != null) {
            oa(false);
            ku();
            this.dhk.set(false);
            this.tpx = false;
            uef(this.dor);
            this.ivm.cz();
        }
    }

    public void xs(boolean z2) {
        lw lwVar = this.xs;
        if (lwVar != null) {
            lwVar.uef();
        }
        lw lwVar2 = this.xs;
        if (lwVar2 != null && z2) {
            lwVar2.sy();
        }
        sk();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void ivm(int i5) {
        lw(i5);
        if (i5 == 4) {
            this.bs = false;
        }
    }

    @Override // com.bykv.vk.openvk.uef.uef.uef.moa.yo
    public void moa() {
        uef(true, 3);
    }

    private void yo(com.bykv.vk.openvk.uef.uef.uef.yo.yo yoVar) {
        yoVar.moa(0);
        this.ivm.uef(yoVar);
        this.oyt = System.currentTimeMillis();
        this.xs.yo(8);
        this.xs.yo(0);
        uef(new Runnable() { // from class: com.bytedance.sdk.openadsdk.core.wk.oa.yo.3
            @Override // java.lang.Runnable
            public void run() {
                if (((com.bytedance.sdk.openadsdk.core.wk.uef.uef) yo.this).ivm == null) {
                    return;
                }
                yo.this.oyt = System.currentTimeMillis();
                ((com.bytedance.sdk.openadsdk.core.wk.uef.uef) yo.this).xs.moa(0);
                ((com.bytedance.sdk.openadsdk.core.wk.uef.uef) yo.this).ivm.uef(true, ((com.bytedance.sdk.openadsdk.core.wk.uef.uef) yo.this).cz, ((com.bytedance.sdk.openadsdk.core.wk.uef.uef) yo.this).f25805ab);
            }
        });
        if (this.wk) {
            ab();
        }
    }

    public void moa(int i5) {
        this.uqx = i5;
    }

    public void oa(int i5, int i10) {
        uef(i5, i10);
        lw lwVar = this.xs;
        if (lwVar == null || i5 <= 0 || i10 <= 0) {
            return;
        }
        lwVar.yo(i5, i10);
        this.xs.uef(i5, i10);
        rl();
    }

    public void uef(final ivm.uef uefVar) {
        lw lwVar;
        if (!this.wk || (lwVar = this.xs) == null) {
            return;
        }
        lwVar.uef(new ivm.uef() { // from class: com.bytedance.sdk.openadsdk.core.wk.oa.yo.2
            @Override // com.bytedance.sdk.openadsdk.core.wk.oa.ivm.uef
            public void uef(View view, int i5) {
                ivm.uef uefVar2 = uefVar;
                if (uefVar2 != null) {
                    uefVar2.uef(view, i5);
                }
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void oa(long j8, long j10) {
        com.bytedance.sdk.openadsdk.core.dz.moa moaVarUef;
        this.bcc.moa(j8);
        this.cz = j8;
        this.dxx = j10;
        this.xs.uef(j8, j10);
        this.xs.uef(com.bykv.vk.openvk.uef.uef.oa.moa.uef.uef(j8, j10));
        try {
            yo.uef uefVar = this.f25807ue;
            if (uefVar != null) {
                uefVar.uef(j8, j10);
            }
        } catch (Throwable th) {
            dhk.uef(this.uef, "onProgressUpdate error: ", th);
        }
        com.bytedance.sdk.openadsdk.core.model.moa moaVarOdd = this.bcc.odd();
        if (moaVarOdd == null || (moaVarUef = moaVarOdd.uef()) == null) {
            return;
        }
        moaVarUef.uef(j8, j10, this.pz);
    }

    public void uef(PAGNativeAd pAGNativeAd) {
        lw lwVar;
        if (!this.wk || (lwVar = this.xs) == null) {
            return;
        }
        lwVar.uef(pAGNativeAd);
    }

    @Override // com.bykv.vk.openvk.uef.uef.uef.moa.yo
    public void yo() {
        lw lwVar = this.xs;
        if (lwVar != null) {
            lwVar.uef();
        }
        lw lwVar2 = this.xs;
        if (lwVar2 != null) {
            lwVar2.sy();
        }
        sk();
    }

    private void lw(int i5) {
        if (this.hts == i5) {
            return;
        }
        this.hts = i5;
        if (i5 != 4 && i5 != 0) {
            this.sy = false;
        }
        if (!this.sy && !cq() && this.af) {
            yo(2, i5);
        }
        WeakReference<uef> weakReference = this.gem;
        if (weakReference == null || weakReference.get() == null) {
            return;
        }
        this.gem.get().uef(this.hts);
    }

    public void uef(int i5, int i10) {
        if (i5 == 0 || i10 == 0) {
            return;
        }
        this.cop = i5;
        this.au = i10;
    }

    public void uef(oa oaVar) {
        this.etd = oaVar;
    }

    private void uef(Context context) {
        ViewGroup yoVar;
        yo yoVar2;
        if (this.wk) {
            yoVar = new com.bytedance.sdk.openadsdk.wk.moa(context);
        } else {
            yoVar = new com.bytedance.sdk.openadsdk.wk.yo(context);
        }
        ViewGroup viewGroup = yoVar;
        if (this.wk) {
            yoVar2 = this;
            yoVar2.xs = new lw(context, viewGroup, true, 17, this.bcc, yoVar2, orq());
        } else {
            yoVar2 = this;
            yoVar2.xs = new moa(context, viewGroup, true, 17, yoVar2.bcc, yoVar2, false);
        }
        yoVar2.xs.uef(this);
    }

    private boolean yo(int i5, int i10) {
        if (i10 == 0) {
            oa();
            this.bs = true;
            lw lwVar = this.xs;
            if (lwVar != null) {
                lwVar.uef2(this.bcc, (WeakReference<Context>) null, false);
            }
        }
        if (i10 != 4 && i10 != 0) {
            lw lwVar2 = this.xs;
            if (lwVar2 != null) {
                lwVar2.uef();
            }
            oa();
            this.bs = true;
            this.sy = false;
            lw lwVar3 = this.xs;
            if (lwVar3 != null) {
                return lwVar3.uef(i5, this.bcc.nj(), this.sk);
            }
        } else if (i10 == 4) {
            this.bs = false;
            lw lwVar4 = this.xs;
            if (lwVar4 != null) {
                lwVar4.wk();
            }
        }
        return true;
    }

    public com.bytedance.sdk.openadsdk.core.dz.ivm uef(View view, List<Pair<View, FriendlyObstructionPurpose>> list) {
        if (!this.bcc.tko()) {
            return null;
        }
        if (this.pz == null) {
            this.pz = com.bytedance.sdk.openadsdk.core.dz.ivm.uef();
        }
        this.pz.uef(view, this.bcc);
        if (list != null && list.size() > 0) {
            for (Pair<View, FriendlyObstructionPurpose> pair : list) {
                if (pair != null) {
                    Object obj = pair.second;
                    this.pz.uef((View) pair.first, obj == null ? FriendlyObstructionPurpose.OTHER : (FriendlyObstructionPurpose) obj);
                }
            }
        }
        return this.pz;
    }

    public void yo(int i5) {
        lw(i5);
        if (i5 == 4) {
            this.bs = false;
            yo();
        }
    }

    @Override // com.bytedance.sdk.openadsdk.core.wk.uef.uef
    public void uef(yo.moa moaVar) {
        this.swd = new WeakReference<>(moaVar);
    }

    @Override // com.bykv.vk.openvk.uef.uef.uef.moa.yo
    public void uef() {
        com.bytedance.sdk.openadsdk.core.wk.moa.yo yoVar = this.ivm;
        if (yoVar != null) {
            yoVar.cz();
        }
    }

    @Override // com.bytedance.sdk.openadsdk.core.wk.uef.uef, com.bykv.vk.openvk.uef.uef.uef.moa.yo
    public boolean uef(com.bykv.vk.openvk.uef.uef.uef.yo.yo yoVar) {
        super.uef(yoVar);
        if (this.ivm != null) {
            ApmHelper.reportCustomError("", "twice playVideoUrl", new IllegalStateException());
            return true;
        }
        if (TextUtils.isEmpty(yoVar.ab())) {
            return false;
        }
        oa(false);
        yoVar.ab();
        yoVar.oa(com.bytedance.sdk.openadsdk.gzw.lw.uef("player_force_raw_url", 0) == 1);
        int i5 = this.uqx + 1;
        this.uqx = i5;
        yoVar.lw = i5;
        oa(yoVar);
        ku();
        com.bytedance.sdk.openadsdk.core.dz.ivm ivmVar = this.pz;
        if (ivmVar != null) {
            ivmVar.uef(false, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
        }
        if (!ue.oa(this.gb) || this.cz <= 0) {
            this.cz = yoVar.zjm();
        }
        if (ue.oa(this.gb) && this.cz == this.dxx) {
            this.cz = 0L;
        }
        if (yoVar.zjm() <= 0) {
            this.tpx = false;
            this.dhk.set(false);
        } else {
            long jZjm = yoVar.zjm();
            this.cz = jZjm;
            this.zjm = Math.max(this.zjm, jZjm);
        }
        lw lwVar = this.xs;
        if (lwVar != null) {
            lwVar.uef();
            if (this.dv == 0) {
                this.xs.xs();
            }
            this.xs.yo(yoVar.bcc(), yoVar.cz());
            this.xs.yo(this.rt);
            this.xs.uef(yoVar.bcc(), yoVar.cz());
        }
        if (this.ivm == null) {
            com.bytedance.sdk.openadsdk.core.wk.moa.yo yoVar2 = new com.bytedance.sdk.openadsdk.core.wk.moa.yo();
            this.ivm = yoVar2;
            yoVar2.uef(this.rj);
        }
        sy();
        this.km = 0L;
        try {
            yo(yoVar);
            return true;
        } catch (Exception e7) {
            uef(new com.bykv.vk.openvk.uef.uef.uef.yo.uef(-10, 0, e7.getMessage()));
            dhk.yo(this.uef, "[video] invoke NativeVideoController#playVideo cause exception :".concat(String.valueOf(e7)));
            return false;
        }
    }

    @Override // com.bykv.vk.openvk.uef.uef.uef.moa.yo
    public void uef(boolean z2, int i5) {
        if (!this.tpx && this.dhk.get()) {
            if (z2) {
                uef(i5, false);
                this.tpx = false;
            } else {
                cp();
            }
        }
        lw();
        com.bytedance.sdk.openadsdk.core.dz.ivm ivmVar = this.pz;
        if (ivmVar != null) {
            ivmVar.moa();
        }
    }

    public final void uef(int i5, boolean z2) {
        if (z2 || this.fz) {
            if (z2) {
                this.fz = false;
            }
            if (this.tpx || !this.dhk.get()) {
                return;
            }
            wk.uef uefVar = new wk.uef();
            uefVar.oa(ivm());
            uefVar.moa(cz());
            uefVar.yo(xs());
            uefVar.yo(i5);
            uefVar.moa(bcc());
            com.bytedance.sdk.openadsdk.moa.lw.uef.uef.uef(this.xs, uefVar, this.dor);
        }
    }

    @Override // com.bykv.vk.openvk.uef.uef.uef.moa.uef
    public void uef(com.bykv.vk.openvk.uef.uef.uef.moa.oa oaVar, View view) {
        com.bytedance.sdk.openadsdk.core.wk.moa.yo yoVar = this.ivm;
        if (yoVar == null) {
            return;
        }
        if (yoVar.ivm()) {
            oa();
            this.xs.oa(true, false);
            this.xs.ivm();
            return;
        }
        if (!this.ivm.xs()) {
            lw lwVar = this.xs;
            if (lwVar != null) {
                lwVar.yo(this.rt);
            }
            lw(this.cz);
            lw lwVar2 = this.xs;
            if (lwVar2 != null) {
                lwVar2.oa(false, false);
                return;
            }
            return;
        }
        xs(false);
        lw lwVar3 = this.xs;
        if (lwVar3 != null) {
            lwVar3.oa(false, false);
        }
    }

    @Override // com.bytedance.sdk.openadsdk.core.wk.uef.uef
    public void uef(com.bykv.vk.openvk.uef.uef.uef.moa.oa oaVar, View view, boolean z2) {
        yo(!this.oib);
        if (this.dj instanceof Activity) {
            lw lwVar = this.xs;
            if (lwVar != null) {
                lwVar.oa(this.rt);
                this.xs.yo(false);
            }
            uef(1);
            WeakReference<yo.oa> weakReference = this.gr;
            yo.oa oaVar2 = weakReference != null ? weakReference.get() : null;
            if (oaVar2 != null) {
                oaVar2.uef(this.oib);
            }
        }
    }

    public void uef(uef uefVar) {
        this.gem = new WeakReference<>(uefVar);
    }
}
