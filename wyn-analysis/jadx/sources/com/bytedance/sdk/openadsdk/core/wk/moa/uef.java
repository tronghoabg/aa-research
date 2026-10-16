package com.bytedance.sdk.openadsdk.core.wk.moa;

import android.content.Context;
import android.text.TextUtils;
import android.view.SurfaceView;
import android.view.TextureView;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import com.bykv.vk.openvk.uef.uef.uef.moa.yo;
import com.bytedance.sdk.component.utils.cz;
import com.bytedance.sdk.openadsdk.component.reward.view.bcc;
import com.bytedance.sdk.openadsdk.core.dz.ivm;
import com.bytedance.sdk.openadsdk.core.dz.moa;
import com.bytedance.sdk.openadsdk.core.model.dhk;
import com.bytedance.sdk.openadsdk.core.model.gzw;
import com.bytedance.sdk.openadsdk.core.sy;
import com.bytedance.sdk.openadsdk.core.wk.moa.yo;
import com.bytedance.sdk.openadsdk.core.zjm;
import com.bytedance.sdk.openadsdk.gsd.oa.lw;
import com.bytedance.sdk.openadsdk.moa.xs;
import com.bytedance.sdk.openadsdk.utils.af;
import com.bytedance.sdk.openadsdk.utils.bs;
import com.bytedance.sdk.openadsdk.utils.sk;
import com.iab.omid.library.bytedance2.adsession.FriendlyObstructionPurpose;
import com.unity3d.services.UnityAdsConstants;
import j$.util.Objects;
import java.util.Iterator;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes3.dex */
public class uef extends com.bytedance.sdk.openadsdk.core.wk.uef.uef {
    private long af;
    private final Runnable au;
    private boolean cop;
    private InterfaceC0105uef dor;
    private final xs gb;
    private final AtomicBoolean gem;
    protected boolean km;
    protected long oyt;
    final yo.oa pu;
    private boolean rl;
    private long sk;
    private final int swd;

    /* renamed from: com.bytedance.sdk.openadsdk.core.wk.moa.uef$1, reason: invalid class name */
    public class AnonymousClass1 implements yo.oa {

        /* renamed from: oa, reason: collision with root package name */
        private boolean f25787oa = true;

        public AnonymousClass1() {
        }

        @Override // com.bykv.vk.openvk.uef.uef.uef.uef.InterfaceC0034uef
        public void lw(com.bykv.vk.openvk.uef.uef.uef.uef uefVar) {
            lw.uef(((com.bytedance.sdk.openadsdk.core.wk.uef.uef) uef.this).bcc, 0);
            if (((com.bytedance.sdk.openadsdk.core.wk.uef.uef) uef.this).pz != null) {
                ((com.bytedance.sdk.openadsdk.core.wk.uef.uef) uef.this).pz.uef(1);
            }
            if (uef.this.dor != null) {
                uef.this.dor.uef(1);
            }
        }

        @Override // com.bykv.vk.openvk.uef.uef.uef.uef.InterfaceC0034uef
        public void moa(com.bykv.vk.openvk.uef.uef.uef.uef uefVar) {
            moa moaVarUef;
            com.bytedance.sdk.openadsdk.core.model.moa moaVarOdd = ((com.bytedance.sdk.openadsdk.core.wk.uef.uef) uef.this).bcc.odd();
            if (moaVarOdd != null && (moaVarUef = moaVarOdd.uef()) != null) {
                moaVarUef.oa(((com.bytedance.sdk.openadsdk.core.wk.uef.uef) uef.this).cz);
            }
            lw.uef(((com.bytedance.sdk.openadsdk.core.wk.uef.uef) uef.this).bcc, 3);
            if (((com.bytedance.sdk.openadsdk.core.wk.uef.uef) uef.this).pz != null) {
                ((com.bytedance.sdk.openadsdk.core.wk.uef.uef) uef.this).pz.uef(0);
            }
            if (uef.this.dor != null) {
                uef.this.dor.uef(2);
            }
        }

        @Override // com.bykv.vk.openvk.uef.uef.uef.uef.InterfaceC0034uef
        public void oa(com.bykv.vk.openvk.uef.uef.uef.uef uefVar, int i5) {
        }

        @Override // com.bykv.vk.openvk.uef.uef.uef.uef.InterfaceC0034uef
        public void uef(com.bykv.vk.openvk.uef.uef.uef.uef uefVar) {
            moa moaVarUef;
            if (uef.this.gem.compareAndSet(false, true)) {
                String unused = ((com.bytedance.sdk.openadsdk.core.wk.uef.uef) uef.this).uef;
                ((com.bytedance.sdk.openadsdk.core.wk.uef.uef) uef.this).yo.post(new Runnable() { // from class: com.bytedance.sdk.openadsdk.core.wk.moa.uef.1.1
                    @Override // java.lang.Runnable
                    public void run() {
                        if (((com.bytedance.sdk.openadsdk.core.wk.uef.uef) uef.this).pz != null) {
                            try {
                                ((com.bytedance.sdk.openadsdk.core.wk.uef.uef) uef.this).pz.uef(9);
                            } catch (Exception unused2) {
                            }
                        }
                        uef.this.gem();
                    }
                });
                com.bytedance.sdk.openadsdk.core.model.moa moaVarOdd = ((com.bytedance.sdk.openadsdk.core.wk.uef.uef) uef.this).bcc.odd();
                if (moaVarOdd != null && (moaVarUef = moaVarOdd.uef()) != null) {
                    long jIvm = uef.this.ivm();
                    moaVarUef.moa(jIvm);
                    moaVarUef.lw(jIvm);
                }
                lw.uef(((com.bytedance.sdk.openadsdk.core.wk.uef.uef) uef.this).bcc, 5);
                com.bytedance.sdk.openadsdk.gsd.uef.yo.uef(((com.bytedance.sdk.openadsdk.core.wk.uef.uef) uef.this).bcc, 5);
                if (uef.this.dor != null) {
                    uef.this.dor.uef(3);
                }
            }
        }

        @Override // com.bykv.vk.openvk.uef.uef.uef.uef.InterfaceC0034uef
        public void yo(com.bykv.vk.openvk.uef.uef.uef.uef uefVar) {
            String unused = ((com.bytedance.sdk.openadsdk.core.wk.uef.uef) uef.this).uef;
        }

        @Override // com.bykv.vk.openvk.uef.uef.uef.uef.InterfaceC0034uef
        public void oa(com.bykv.vk.openvk.uef.uef.uef.uef uefVar) {
            String unused = ((com.bytedance.sdk.openadsdk.core.wk.uef.uef) uef.this).uef;
            ((com.bytedance.sdk.openadsdk.core.wk.uef.uef) uef.this).yo.removeCallbacks(uef.this.au);
            ((com.bytedance.sdk.openadsdk.core.wk.uef.uef) uef.this).yo.post(new Runnable() { // from class: com.bytedance.sdk.openadsdk.core.wk.moa.uef.1.3
                @Override // java.lang.Runnable
                public void run() {
                    if (((com.bytedance.sdk.openadsdk.core.wk.uef.uef) uef.this).xs != null) {
                        ((com.bytedance.sdk.openadsdk.core.wk.uef.uef) uef.this).xs.oa();
                    }
                }
            });
        }

        @Override // com.bykv.vk.openvk.uef.uef.uef.uef.InterfaceC0034uef
        public void uef(com.bykv.vk.openvk.uef.uef.uef.uef uefVar, long j8) {
            String unused = ((com.bytedance.sdk.openadsdk.core.wk.uef.uef) uef.this).uef;
            ((com.bytedance.sdk.openadsdk.core.wk.uef.uef) uef.this).gsd = false;
            ((com.bytedance.sdk.openadsdk.core.wk.uef.uef) uef.this).yo.removeCallbacks(uef.this.au);
            ((com.bytedance.sdk.openadsdk.core.wk.uef.uef) uef.this).yo.post(new Runnable() { // from class: com.bytedance.sdk.openadsdk.core.wk.moa.uef.1.2
                @Override // java.lang.Runnable
                public void run() {
                    if (((com.bytedance.sdk.openadsdk.core.wk.uef.uef) uef.this).xs != null) {
                        ((com.bytedance.sdk.openadsdk.core.wk.uef.uef) uef.this).xs.oa();
                    }
                }
            });
            if (!((com.bytedance.sdk.openadsdk.core.wk.uef.uef) uef.this).dhk.get()) {
                uef uefVar2 = uef.this;
                uefVar2.oyt = j8;
                uefVar2.uef(uefVar2.gb);
                uef.this.lz();
            }
            if (((com.bytedance.sdk.openadsdk.core.wk.uef.uef) uef.this).pz != null) {
                ((com.bytedance.sdk.openadsdk.core.wk.uef.uef) uef.this).pz.yo();
            }
            lw.uef(((com.bytedance.sdk.openadsdk.core.wk.uef.uef) uef.this).bcc, 0);
            if (uef.this.dor != null) {
                uef.this.dor.uef(1);
            }
        }

        @Override // com.bykv.vk.openvk.uef.uef.uef.uef.InterfaceC0034uef
        public void uef(com.bykv.vk.openvk.uef.uef.uef.uef uefVar, com.bykv.vk.openvk.uef.uef.uef.yo.uef uefVar2) {
            moa moaVarUef;
            String unused = ((com.bytedance.sdk.openadsdk.core.wk.uef.uef) uef.this).uef;
            uefVar2.uef();
            uefVar2.oa();
            uefVar2.yo();
            ((com.bytedance.sdk.openadsdk.core.wk.uef.uef) uef.this).yo.removeCallbacks(uef.this.au);
            ((com.bytedance.sdk.openadsdk.core.wk.uef.uef) uef.this).yo.post(new Runnable() { // from class: com.bytedance.sdk.openadsdk.core.wk.moa.uef.1.4
                @Override // java.lang.Runnable
                public void run() {
                    if (((com.bytedance.sdk.openadsdk.core.wk.uef.uef) uef.this).xs != null) {
                        ((com.bytedance.sdk.openadsdk.core.wk.uef.uef) uef.this).xs.oa();
                    }
                    if (((com.bytedance.sdk.openadsdk.core.wk.uef.uef) uef.this).f25807ue != null) {
                        ((com.bytedance.sdk.openadsdk.core.wk.uef.uef) uef.this).f25807ue.oa(uef.this.sk, com.bykv.vk.openvk.uef.uef.oa.moa.uef.uef(((com.bytedance.sdk.openadsdk.core.wk.uef.uef) uef.this).cz, ((com.bytedance.sdk.openadsdk.core.wk.uef.uef) uef.this).dxx));
                    }
                }
            });
            uef.this.uef(uefVar2);
            lw.uef(((com.bytedance.sdk.openadsdk.core.wk.uef.uef) uef.this).bcc, 6);
            com.bytedance.sdk.openadsdk.gsd.uef.yo.oa(((com.bytedance.sdk.openadsdk.core.wk.uef.uef) uef.this).bcc);
            if (((com.bytedance.sdk.openadsdk.core.wk.uef.uef) uef.this).pz != null) {
                ((com.bytedance.sdk.openadsdk.core.wk.uef.uef) uef.this).pz.uef(14);
            }
            if (uef.this.dor != null) {
                uef.this.dor.uef(4);
            }
            com.bytedance.sdk.openadsdk.core.model.moa moaVarOdd = ((com.bytedance.sdk.openadsdk.core.wk.uef.uef) uef.this).bcc.odd();
            if (moaVarOdd == null || (moaVarUef = moaVarOdd.uef()) == null) {
                return;
            }
            moaVarUef.uef(com.bytedance.sdk.openadsdk.core.dz.uef.uef.GENERAL_LINEAR_AD_ERROR);
        }

        @Override // com.bykv.vk.openvk.uef.uef.uef.uef.InterfaceC0034uef
        public void uef(com.bykv.vk.openvk.uef.uef.uef.uef uefVar, boolean z2) {
            String unused = ((com.bytedance.sdk.openadsdk.core.wk.uef.uef) uef.this).uef;
            ((com.bytedance.sdk.openadsdk.core.wk.uef.uef) uef.this).yo.removeCallbacks(uef.this.au);
            ((com.bytedance.sdk.openadsdk.core.wk.uef.uef) uef.this).yo.post(new Runnable() { // from class: com.bytedance.sdk.openadsdk.core.wk.moa.uef.1.5
                @Override // java.lang.Runnable
                public void run() {
                    if (((com.bytedance.sdk.openadsdk.core.wk.uef.uef) uef.this).xs != null) {
                        ((com.bytedance.sdk.openadsdk.core.wk.uef.uef) uef.this).xs.oa();
                    }
                }
            });
        }

        @Override // com.bykv.vk.openvk.uef.uef.uef.uef.InterfaceC0034uef
        public void uef(com.bykv.vk.openvk.uef.uef.uef.uef uefVar, int i5, int i10) {
            String unused = ((com.bytedance.sdk.openadsdk.core.wk.uef.uef) uef.this).uef;
            cz.uef().post(new Runnable() { // from class: com.bytedance.sdk.openadsdk.core.wk.moa.uef.1.6
                @Override // java.lang.Runnable
                public void run() {
                    if (((com.bytedance.sdk.openadsdk.core.wk.uef.uef) uef.this).ivm == null) {
                        return;
                    }
                    try {
                        final float fMoa = ((com.bytedance.sdk.openadsdk.core.wk.uef.uef) uef.this).ivm.moa();
                        final float fLw = ((com.bytedance.sdk.openadsdk.core.wk.uef.uef) uef.this).ivm.lw();
                        if (fMoa == UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT || fLw == UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
                            return;
                        }
                        ((com.bytedance.sdk.openadsdk.core.wk.uef.uef) uef.this).yo.post(new Runnable() { // from class: com.bytedance.sdk.openadsdk.core.wk.moa.uef.1.6.1
                            @Override // java.lang.Runnable
                            public void run() {
                                if (!uef.this.cop()) {
                                    uef.this.uef(fMoa, fLw);
                                    return;
                                }
                                if (dhk.oa(((com.bytedance.sdk.openadsdk.core.wk.uef.uef) uef.this).bcc) || ((com.bytedance.sdk.openadsdk.core.wk.uef.uef) uef.this).gzw.ivm == 4) {
                                    uef.this.uef(true, fMoa, fLw);
                                    return;
                                }
                                if (dhk.yo(((com.bytedance.sdk.openadsdk.core.wk.uef.uef) uef.this).bcc)) {
                                    uef.this.uef(true, fMoa, fLw);
                                    return;
                                }
                                if (((com.bytedance.sdk.openadsdk.core.wk.uef.uef) uef.this).bcc.aos() == 3) {
                                    uef.this.uef(true, fMoa, fLw);
                                } else if (((com.bytedance.sdk.openadsdk.core.wk.uef.uef) uef.this).bcc.aos() == 0) {
                                    uef.this.yo(fMoa, fLw);
                                } else {
                                    uef.this.oa(fMoa, fLw);
                                }
                            }
                        });
                    } catch (Throwable th) {
                        com.bytedance.sdk.component.utils.dhk.yo(((com.bytedance.sdk.openadsdk.core.wk.uef.uef) uef.this).uef, th.getMessage());
                    }
                }
            });
        }

        @Override // com.bykv.vk.openvk.uef.uef.uef.uef.InterfaceC0034uef
        public void uef(com.bykv.vk.openvk.uef.uef.uef.uef uefVar, int i5, int i10, int i11) {
            String unused = ((com.bytedance.sdk.openadsdk.core.wk.uef.uef) uef.this).uef;
            ((com.bytedance.sdk.openadsdk.core.wk.uef.uef) uef.this).gsd = true;
            uef.this.swd();
            ((com.bytedance.sdk.openadsdk.core.wk.uef.uef) uef.this).yo.post(new Runnable() { // from class: com.bytedance.sdk.openadsdk.core.wk.moa.uef.1.7
                @Override // java.lang.Runnable
                public void run() {
                    if (((com.bytedance.sdk.openadsdk.core.wk.uef.uef) uef.this).xs != null) {
                        ((com.bytedance.sdk.openadsdk.core.wk.uef.uef) uef.this).xs.bs();
                    }
                }
            });
            lw.uef(((com.bytedance.sdk.openadsdk.core.wk.uef.uef) uef.this).bcc, 3);
            if (((com.bytedance.sdk.openadsdk.core.wk.uef.uef) uef.this).pz != null) {
                ((com.bytedance.sdk.openadsdk.core.wk.uef.uef) uef.this).pz.uef(4);
            }
        }

        @Override // com.bykv.vk.openvk.uef.uef.uef.uef.InterfaceC0034uef
        public void uef(com.bykv.vk.openvk.uef.uef.uef.uef uefVar, int i5) {
            String unused = ((com.bytedance.sdk.openadsdk.core.wk.uef.uef) uef.this).uef;
            ((com.bytedance.sdk.openadsdk.core.wk.uef.uef) uef.this).gsd = false;
            ((com.bytedance.sdk.openadsdk.core.wk.uef.uef) uef.this).yo.removeCallbacks(uef.this.au);
            ((com.bytedance.sdk.openadsdk.core.wk.uef.uef) uef.this).yo.post(new Runnable() { // from class: com.bytedance.sdk.openadsdk.core.wk.moa.uef.1.8
                @Override // java.lang.Runnable
                public void run() {
                    if (((com.bytedance.sdk.openadsdk.core.wk.uef.uef) uef.this).xs != null) {
                        ((com.bytedance.sdk.openadsdk.core.wk.uef.uef) uef.this).xs.oa();
                    }
                }
            });
            lw.uef(((com.bytedance.sdk.openadsdk.core.wk.uef.uef) uef.this).bcc, 0);
            if (((com.bytedance.sdk.openadsdk.core.wk.uef.uef) uef.this).pz != null) {
                ((com.bytedance.sdk.openadsdk.core.wk.uef.uef) uef.this).pz.uef(5);
            }
        }

        @Override // com.bykv.vk.openvk.uef.uef.uef.uef.InterfaceC0034uef
        public void uef(final com.bykv.vk.openvk.uef.uef.uef.uef uefVar, long j8, long j10) {
            long j11;
            long j12;
            moa moaVarUef;
            if (Math.abs(j8 - ((com.bytedance.sdk.openadsdk.core.wk.uef.uef) uef.this).cz) < 50) {
                return;
            }
            uef uefVar2 = uef.this;
            uefVar2.uef(uefVar2.gb);
            uef.this.uef(j8, j10);
            uef.this.oa(j8, j10);
            com.bytedance.sdk.openadsdk.core.model.moa moaVarOdd = ((com.bytedance.sdk.openadsdk.core.wk.uef.uef) uef.this).bcc.odd();
            if (moaVarOdd == null || (moaVarUef = moaVarOdd.uef()) == null) {
                j11 = j8;
                j12 = j10;
            } else {
                j11 = j8;
                j12 = j10;
                moaVarUef.uef(j11, j12, ((com.bytedance.sdk.openadsdk.core.wk.uef.uef) uef.this).pz);
            }
            if (!this.f25787oa || j12 - j11 >= 500) {
                return;
            }
            this.f25787oa = false;
            ((com.bytedance.sdk.openadsdk.core.wk.uef.uef) uef.this).yo.postDelayed(new Runnable() { // from class: com.bytedance.sdk.openadsdk.core.wk.moa.uef.1.9
                @Override // java.lang.Runnable
                public void run() {
                    AnonymousClass1.this.uef(uefVar);
                }
            }, 1000L);
        }

        @Override // com.bytedance.sdk.openadsdk.core.wk.moa.yo.oa
        public void uef(int i5, int i10) {
            uef.this.sk();
        }
    }

    /* renamed from: com.bytedance.sdk.openadsdk.core.wk.moa.uef$uef, reason: collision with other inner class name */
    public interface InterfaceC0105uef {
        void uef(int i5);
    }

    public uef(Context context, ViewGroup viewGroup, gzw gzwVar, xs xsVar) {
        super(context, gzwVar, viewGroup);
        this.af = 0L;
        this.sk = 0L;
        this.rl = false;
        this.oyt = 0L;
        this.km = false;
        this.gem = new AtomicBoolean(false);
        this.pu = new AnonymousClass1();
        this.au = new Runnable() { // from class: com.bytedance.sdk.openadsdk.core.wk.moa.uef.3
            @Override // java.lang.Runnable
            public void run() {
                if (((com.bytedance.sdk.openadsdk.core.wk.uef.uef) uef.this).f25807ue != null) {
                    uef.this.ab();
                    ((com.bytedance.sdk.openadsdk.core.wk.uef.uef) uef.this).f25807ue.uef();
                }
            }
        };
        this.gb = xsVar;
        this.swd = gzwVar.jnk();
        if (gzwVar.tko() && this.rt != null) {
            if (this.pz == null) {
                this.pz = ivm.uef();
            }
            this.pz.uef(this.rt, gzwVar);
        }
        com.bytedance.sdk.openadsdk.core.wk.oa.lw lwVar = new com.bytedance.sdk.openadsdk.core.wk.oa.lw(context.getApplicationContext(), new com.bytedance.sdk.openadsdk.wk.moa(context), true, 17, this.bcc, this);
        this.xs = lwVar;
        lwVar.uef(this);
    }

    public void ab() {
    }

    @Override // com.bytedance.sdk.openadsdk.core.wk.uef.uef
    public boolean rt() {
        return true;
    }

    private boolean au() {
        return pu() == null || this.ivm == null || (!com.bytedance.sdk.openadsdk.core.cq.lw.uef(this.bcc.ix()) ? this.bcc.vep() != null : this.bcc.aje() != null) || this.bcc.bx() == 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean cop() {
        return this.bcc.gze() == 100.0f;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void gem() {
        if (this.xs == null) {
            return;
        }
        this.yo.removeCallbacks(this.au);
        this.xs.oa();
        this.sk = System.currentTimeMillis() - this.af;
        if (!this.rl) {
            this.rl = true;
            long j8 = this.dxx;
            oa(j8, j8);
            long j10 = this.dxx;
            this.cz = j10;
            this.zjm = j10;
            oa(this.gb);
        }
        yo.uef uefVar = this.f25807ue;
        if (uefVar != null) {
            uefVar.uef(this.sk, com.bykv.vk.openvk.uef.uef.oa.moa.uef.uef(this.cz, this.dxx));
        }
        this.dz = true;
    }

    private void rl() {
        this.ivm.yo(fz());
        this.ivm.uef(this.gzw);
        this.af = System.currentTimeMillis();
        this.xs.yo(8);
        this.xs.yo(0);
        uef(new Runnable() { // from class: com.bytedance.sdk.openadsdk.core.wk.moa.uef.2
            @Override // java.lang.Runnable
            public void run() {
                if (((com.bytedance.sdk.openadsdk.core.wk.uef.uef) uef.this).ivm == null) {
                    return;
                }
                uef.this.af = System.currentTimeMillis();
                ((com.bytedance.sdk.openadsdk.core.wk.uef.uef) uef.this).xs.moa(0);
                ((com.bytedance.sdk.openadsdk.core.wk.uef.uef) uef.this).ivm.uef(true, ((com.bytedance.sdk.openadsdk.core.wk.uef.uef) uef.this).cz, ((com.bytedance.sdk.openadsdk.core.wk.uef.uef) uef.this).f25805ab);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void sk() {
        oa(this.gb);
        this.gzw.lw = this.ivm.tpx();
        ku();
        this.dhk.set(false);
        this.gem.set(false);
        uef(this.gb);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void swd() {
        int i5 = this.gzw.ivm;
        int iEtd = (i5 == 2 || i5 == 1) ? sy.moa().etd() * 1000 : i5 == 4 ? sy.moa().zjm(String.valueOf(this.swd)) : 5000;
        this.yo.removeCallbacks(this.au);
        this.yo.postDelayed(this.au, iEtd);
    }

    public void af() {
        ivm ivmVar = this.pz;
        if (ivmVar != null) {
            ivmVar.uef(13);
        }
    }

    public void gb() {
        ivm ivmVar = this.pz;
        if (ivmVar != null) {
            ivmVar.uef(2);
        }
    }

    public void ivm(boolean z2) {
        this.cop = z2;
    }

    public void km() {
        moa moaVarUef;
        if (this.rl || !this.dhk.get()) {
            return;
        }
        pz();
        com.bytedance.sdk.openadsdk.core.model.moa moaVarOdd = this.bcc.odd();
        if (moaVarOdd == null || (moaVarUef = moaVarOdd.uef()) == null) {
            return;
        }
        moaVarUef.yo(ivm());
    }

    @Override // com.bykv.vk.openvk.uef.uef.uef.moa.yo
    public void lw() {
        moa();
    }

    @Override // com.bykv.vk.openvk.uef.uef.uef.moa.yo
    public void moa() {
        yo yoVar = this.ivm;
        if (yoVar == null) {
            return;
        }
        yoVar.wrv();
        this.ivm = null;
        com.bytedance.sdk.openadsdk.core.wk.oa.lw lwVar = this.xs;
        if (lwVar != null) {
            lwVar.cz();
        }
        this.yo.removeCallbacks(this.au);
        this.yo.removeCallbacksAndMessages(null);
        ivm ivmVar = this.pz;
        if (ivmVar != null) {
            ivmVar.moa();
        }
    }

    public void oyt() {
        this.pu.uef((com.bykv.vk.openvk.uef.uef.uef.uef) null, 0, 0);
    }

    public com.bykv.vk.openvk.uef.uef.uef.ivm.oa pu() {
        com.bytedance.sdk.openadsdk.core.wk.oa.lw lwVar = this.xs;
        if (lwVar != null) {
            return lwVar.cq();
        }
        return null;
    }

    @Override // com.bykv.vk.openvk.uef.uef.uef.moa.yo
    public void yo() {
        moa moaVarUef;
        com.bytedance.sdk.openadsdk.core.wk.oa.lw lwVar = this.xs;
        if (lwVar != null) {
            lwVar.uef();
            this.xs.wk();
            this.xs.sy();
        }
        yo yoVar = this.ivm;
        if (yoVar != null) {
            if (yoVar.xs()) {
                if (this.cq) {
                    if (zjm.dhk()) {
                        this.ivm.oa(3);
                        yo yoVar2 = this.ivm;
                        yoVar2.uef(false, yoVar2.sy(), this.f25805ab);
                    } else {
                        dhk();
                    }
                } else {
                    oa(this.lz);
                }
            } else {
                this.ivm.uef(false, this.cz, this.f25805ab);
            }
        }
        if (this.rl || !this.dhk.get()) {
            return;
        }
        pz();
        com.bytedance.sdk.openadsdk.core.model.moa moaVarOdd = this.bcc.odd();
        if (moaVarOdd == null || (moaVarUef = moaVarOdd.uef()) == null) {
            return;
        }
        moaVarUef.yo(ivm());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0080  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void oa(float r12, float r13) {
        /*
            Method dump skipped, instructions count: 217
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.sdk.openadsdk.core.wk.moa.uef.oa(float, float):void");
    }

    public void uef(boolean z2, float f10, float f11) {
        try {
            Objects.toString(this.bcc.cl());
            if (!au() || z2) {
                RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams((int) f10, (int) f11);
                layoutParams.addRule(13);
                if (pu() != null) {
                    if (pu() instanceof TextureView) {
                        ((TextureView) pu()).setLayoutParams(layoutParams);
                    } else if (pu() instanceof SurfaceView) {
                        ((SurfaceView) pu()).setLayoutParams(layoutParams);
                    }
                    ViewGroup.LayoutParams layoutParams2 = this.rt.getLayoutParams();
                    if (this.rt.getHeight() > 0) {
                        float fMin = Math.min(this.rt.getWidth() / f10, this.rt.getHeight() / f11);
                        if (layoutParams2 != null) {
                            layoutParams.width = (int) (f10 * fMin);
                            layoutParams.height = (int) (f11 * fMin);
                            if (pu() instanceof TextureView) {
                                ((TextureView) pu()).setLayoutParams(layoutParams);
                            } else if (pu() instanceof SurfaceView) {
                                ((SurfaceView) pu()).setLayoutParams(layoutParams);
                            }
                            if (this.gzw.ivm == 4) {
                                layoutParams2.width = layoutParams.width;
                                layoutParams2.height = layoutParams.height;
                                this.rt.setLayoutParams(layoutParams2);
                            }
                        }
                    }
                }
            }
        } catch (Throwable th) {
            com.bytedance.sdk.component.utils.dhk.uef(this.uef, "changeSize error", th);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void yo(float f10, float f11) {
        try {
            if (pu() != null && this.ivm != null) {
                boolean z2 = this.bcc.cgg() == 1;
                int[] iArrOa = af.oa(sy.uef());
                uef(iArrOa[0], iArrOa[1], f10, f11, z2);
            }
        } catch (Throwable unused) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void oa(final long j8, final long j10) {
        this.bcc.moa(j8);
        this.cz = j8;
        this.dxx = j10;
        final int iUef = com.bykv.vk.openvk.uef.uef.oa.moa.uef.uef(j8, j10);
        this.yo.post(new Runnable() { // from class: com.bytedance.sdk.openadsdk.core.wk.moa.uef.4
            @Override // java.lang.Runnable
            public void run() {
                ((com.bytedance.sdk.openadsdk.core.wk.uef.uef) uef.this).xs.uef(j8, j10);
                ((com.bytedance.sdk.openadsdk.core.wk.uef.uef) uef.this).xs.uef(iUef);
                try {
                    if (((com.bytedance.sdk.openadsdk.core.wk.uef.uef) uef.this).f25807ue != null) {
                        ((com.bytedance.sdk.openadsdk.core.wk.uef.uef) uef.this).f25807ue.uef(j8, j10);
                    }
                } catch (Throwable th) {
                    com.bytedance.sdk.component.utils.dhk.uef(((com.bytedance.sdk.openadsdk.core.wk.uef.uef) uef.this).uef, "onProgressUpdate error: ", th);
                }
            }
        });
    }

    @Override // com.bytedance.sdk.openadsdk.core.wk.uef.uef, com.bykv.vk.openvk.uef.uef.uef.moa.yo
    public boolean uef(com.bykv.vk.openvk.uef.uef.uef.yo.yo yoVar) {
        int iQe;
        super.uef(yoVar);
        if (this.ivm != null) {
            return false;
        }
        yoVar.ab();
        if (TextUtils.isEmpty(yoVar.ab())) {
            return false;
        }
        yoVar.oa(com.bytedance.sdk.openadsdk.gzw.lw.uef("player_force_raw_url", 0) == 1);
        oa(yoVar);
        yoVar.moa(1);
        this.km = !yoVar.ab().startsWith("http");
        if (this.pz != null) {
            if (this.gzw.ivm == 1) {
                iQe = this.bcc.ho();
            } else {
                iQe = this.bcc.qe();
            }
            if (this.rt != null) {
                try {
                    int iEpe = this.bcc.epe();
                    if (iEpe == 7 || iEpe == 8) {
                        View viewUef = sk.uef(this.rt, (Class<? extends View>) bcc.class);
                        if (viewUef != null) {
                            View viewFindViewById = viewUef.findViewById(bs.dz);
                            View viewFindViewById2 = viewUef.findViewById(bs.f26143wg);
                            View viewFindViewById3 = viewUef.findViewById(bs.pp);
                            ivm ivmVar = this.pz;
                            FriendlyObstructionPurpose friendlyObstructionPurpose = FriendlyObstructionPurpose.OTHER;
                            ivmVar.uef(viewFindViewById2, friendlyObstructionPurpose);
                            this.pz.uef(viewFindViewById, friendlyObstructionPurpose);
                            this.pz.uef(viewFindViewById3, friendlyObstructionPurpose);
                            if (this.cop) {
                                View viewUef2 = sk.uef(this.rt, (Class<? extends View>) com.bytedance.sdk.openadsdk.core.cq.oa.ivm.uef.class);
                                if (viewUef2 instanceof com.bytedance.sdk.openadsdk.core.cq.oa.ivm.uef) {
                                    this.pz.uef(((com.bytedance.sdk.openadsdk.core.cq.oa.ivm.uef) viewUef2).getMarkView(), friendlyObstructionPurpose);
                                }
                            }
                        }
                        Iterator<View> it = sk.uef(this.rt, 1).iterator();
                        while (it.hasNext()) {
                            this.pz.uef(it.next(), FriendlyObstructionPurpose.OTHER);
                        }
                    } else if (iEpe == 3) {
                        Iterator<View> it2 = sk.uef(this.rt, 2).iterator();
                        while (it2.hasNext()) {
                            this.pz.uef(it2.next(), FriendlyObstructionPurpose.OTHER);
                        }
                    }
                } catch (Throwable unused) {
                }
            }
            this.pz.uef(iQe > 0, iQe / 1000.0f);
        }
        ku();
        if (yoVar.zjm() > 0) {
            long jZjm = yoVar.zjm();
            this.cz = jZjm;
            this.zjm = Math.max(this.zjm, jZjm);
        }
        if (this.cz == this.dxx) {
            this.cz = 0L;
        }
        com.bytedance.sdk.openadsdk.core.wk.oa.lw lwVar = this.xs;
        if (lwVar != null) {
            lwVar.uef();
            this.xs.xs();
            this.xs.yo(yoVar.bcc(), yoVar.cz());
            this.xs.yo(this.rt);
        }
        yo yoVar2 = new yo();
        this.ivm = yoVar2;
        yoVar2.uef(this.pu);
        sy();
        this.sk = 0L;
        rl();
        return true;
    }

    @Override // com.bykv.vk.openvk.uef.uef.uef.moa.yo
    public void uef(boolean z2, int i5) {
        moa();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void uef(float f10, float f11) {
        ViewGroup viewGroup;
        try {
            if (pu() != null && this.ivm != null && (viewGroup = this.rt) != null) {
                float width = viewGroup.getWidth();
                float f12 = f10 / (width * 1.0f);
                float height = this.rt.getHeight();
                if (f12 <= f11 / (1.0f * height)) {
                    width = (height / f11) * f10;
                } else {
                    height = (width / f10) * f11;
                }
                RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams((int) width, (int) height);
                layoutParams.addRule(13);
                if (pu() instanceof TextureView) {
                    ((TextureView) pu()).setLayoutParams(layoutParams);
                } else if (pu() instanceof SurfaceView) {
                    ((SurfaceView) pu()).setLayoutParams(layoutParams);
                }
            }
        } catch (Throwable th) {
            com.bytedance.sdk.component.utils.dhk.uef(this.uef, "changeVideoSizeSupportInteraction error", th);
        }
    }

    private void uef(float f10, float f11, float f12, float f13, boolean z2) {
        RelativeLayout.LayoutParams layoutParams;
        if (f12 <= UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT || f13 <= UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
            try {
                f12 = this.bcc.nj().yo();
                f13 = this.bcc.nj().oa();
            } catch (Throwable unused) {
                return;
            }
        }
        if (f13 > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT && f12 > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
            if (z2) {
                if (f12 < f13) {
                    return;
                }
                layoutParams = new RelativeLayout.LayoutParams((int) f10, (int) ((f13 * f10) / f12));
            } else if (f12 > f13) {
                return;
            } else {
                layoutParams = new RelativeLayout.LayoutParams((int) ((f12 * f11) / f13), (int) f11);
            }
            layoutParams.addRule(13);
            if (pu() != null) {
                if (pu() instanceof TextureView) {
                    ((TextureView) pu()).setLayoutParams(layoutParams);
                } else if (pu() instanceof SurfaceView) {
                    ((SurfaceView) pu()).setLayoutParams(layoutParams);
                }
                ViewGroup.LayoutParams layoutParams2 = this.rt.getLayoutParams();
                if (!com.bytedance.sdk.component.adexpress.moa.oa.uef(sy.uef()) || this.rt.getHeight() <= 0 || layoutParams2 == null) {
                    return;
                }
                layoutParams2.width = layoutParams.width;
                layoutParams2.height = layoutParams.height;
                this.rt.setLayoutParams(layoutParams2);
            }
        }
    }

    @Override // com.bykv.vk.openvk.uef.uef.uef.moa.uef
    public void uef(com.bykv.vk.openvk.uef.uef.uef.moa.oa oaVar, View view) {
        yo yoVar = this.ivm;
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
            com.bytedance.sdk.openadsdk.core.wk.oa.lw lwVar = this.xs;
            if (lwVar != null) {
                lwVar.yo(this.rt);
            }
            lw(this.cz);
            com.bytedance.sdk.openadsdk.core.wk.oa.lw lwVar2 = this.xs;
            if (lwVar2 != null) {
                lwVar2.oa(false, false);
                return;
            }
            return;
        }
        yo();
        com.bytedance.sdk.openadsdk.core.wk.oa.lw lwVar3 = this.xs;
        if (lwVar3 != null) {
            lwVar3.oa(false, false);
        }
    }

    public void uef(InterfaceC0105uef interfaceC0105uef) {
        this.dor = interfaceC0105uef;
    }

    @Override // com.bykv.vk.openvk.uef.uef.uef.moa.yo
    public void uef() {
        if (this.ivm != null) {
            sk();
            this.ivm.cz();
        }
    }
}
