package com.bytedance.sdk.openadsdk.core.zjm;

import android.app.Activity;
import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.bytedance.sdk.openadsdk.TTDislikeDialogAbstract;
import com.bytedance.sdk.openadsdk.activity.single.TTWebsiteActivity;
import com.bytedance.sdk.openadsdk.api.PAGExpressAdWrapperListener;
import com.bytedance.sdk.openadsdk.core.ku;
import com.bytedance.sdk.openadsdk.core.widget.PAGLogoView;
import com.bytedance.sdk.openadsdk.core.zjm.ivm;
import com.bytedance.sdk.openadsdk.utils.af;
import com.bytedance.sdk.openadsdk.utils.km;
import com.iab.omid.library.bytedance2.adsession.FriendlyObstructionPurpose;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes3.dex */
public class yo {
    private ScheduledFuture<?> bcc;
    private int cz;
    private int ivm;
    private tpx lw;
    private com.bytedance.sdk.component.adexpress.oa.wk moa;

    /* renamed from: oa, reason: collision with root package name */
    private final Context f25876oa;
    com.bytedance.sdk.openadsdk.core.model.gzw uef;
    private int xs;
    private uef yo;

    public static class oa implements Runnable {
        InterfaceC0115yo uef;

        public oa(InterfaceC0115yo interfaceC0115yo) {
            this.uef = interfaceC0115yo;
        }

        @Override // java.lang.Runnable
        public void run() {
            InterfaceC0115yo interfaceC0115yo = this.uef;
            if (interfaceC0115yo != null) {
                interfaceC0115yo.uef(107, 107);
            }
        }
    }

    public static class uef implements com.bytedance.sdk.component.adexpress.oa.moa<View>, ivm.oa {
        private FrameLayout bcc;
        private int cq;
        private com.bytedance.sdk.openadsdk.core.model.gzw cz;
        private String dj;
        private com.bytedance.sdk.component.adexpress.oa.xs dz;
        private final int ivm;
        private final Context lw;
        private String moa;

        /* renamed from: oa, reason: collision with root package name */
        private com.bytedance.sdk.openadsdk.yo.yo f25877oa;
        AtomicBoolean uef = new AtomicBoolean(false);
        private PAGExpressAdWrapperListener wk;
        private ivm wrv;
        private final int xs;
        private TTDislikeDialogAbstract yo;
        private final int zjm;

        public uef(Context context, com.bytedance.sdk.openadsdk.core.model.gzw gzwVar, int i5, int i10, String str, int i11) {
            this.dj = str;
            if (gzwVar != null && gzwVar.ib()) {
                this.dj = "fullscreen_interstitial_ad";
            }
            this.lw = context;
            this.ivm = i5;
            this.xs = i10;
            this.cz = gzwVar;
            this.zjm = af.oa(context, 3.0f);
            this.cq = i11;
            ivm();
        }

        private ivm bcc() {
            ivm ivmVarOa = moa.uef().oa();
            this.wrv = ivmVarOa;
            if (ivmVarOa == null) {
                this.wrv = new ivm(this.lw);
            }
            moa.uef().yo(this.wrv);
            this.wrv.uef(this.cz, this, this.dj);
            this.wrv.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
            return this.wrv;
        }

        private void ivm() {
            FrameLayout frameLayout = new FrameLayout(this.lw);
            this.bcc = frameLayout;
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) frameLayout.getLayoutParams();
            if (layoutParams == null) {
                layoutParams = new FrameLayout.LayoutParams(this.ivm, this.xs);
            }
            layoutParams.width = this.ivm;
            layoutParams.height = this.xs;
            layoutParams.gravity = 17;
            this.bcc.setLayoutParams(layoutParams);
            ivm ivmVarBcc = bcc();
            this.bcc.addView(ivmVarBcc);
            View viewXs = xs();
            this.bcc.addView(viewXs);
            com.bytedance.sdk.openadsdk.core.model.gzw gzwVar = this.cz;
            if (gzwVar != null && gzwVar.ib()) {
                ivmVarBcc.setBackgroundColor(-16777216);
                ivmVarBcc.uef(((Activity) this.lw).findViewById(com.bytedance.sdk.openadsdk.utils.bs.qr), FriendlyObstructionPurpose.OTHER);
            }
            FriendlyObstructionPurpose friendlyObstructionPurpose = FriendlyObstructionPurpose.OTHER;
            ivmVarBcc.uef(viewXs, friendlyObstructionPurpose);
            Context context = this.lw;
            if (context == null || !(context instanceof Activity)) {
                return;
            }
            View viewFindViewById = ((Activity) context).findViewById(com.bytedance.sdk.openadsdk.utils.bs.f26143wg);
            if (viewFindViewById != null) {
                ivmVarBcc.uef(viewFindViewById, friendlyObstructionPurpose);
            }
            View viewFindViewById2 = ((Activity) this.lw).findViewById(com.bytedance.sdk.openadsdk.utils.bs.pp);
            if (viewFindViewById2 != null) {
                ivmVarBcc.uef(viewFindViewById2, friendlyObstructionPurpose);
            }
        }

        private View xs() {
            PAGLogoView pAGLogoViewCreatePAGLogoViewByMaterial = PAGLogoView.createPAGLogoViewByMaterial(this.lw, this.cz);
            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -2);
            com.bytedance.sdk.openadsdk.core.model.gzw gzwVar = this.cz;
            if (gzwVar == null || !gzwVar.ib()) {
                int i5 = this.zjm;
                layoutParams.topMargin = i5;
                layoutParams.leftMargin = i5;
            } else {
                layoutParams.leftMargin = af.oa(this.lw, 20.0f);
                layoutParams.bottomMargin = af.oa(this.lw, 20.0f);
                layoutParams.gravity = 8388691;
            }
            pAGLogoViewCreatePAGLogoViewByMaterial.setLayoutParams(layoutParams);
            pAGLogoViewCreatePAGLogoViewByMaterial.setOnClickListener(new View.OnClickListener() { // from class: com.bytedance.sdk.openadsdk.core.zjm.yo.uef.1
                @Override // android.view.View.OnClickListener
                public void onClick(View view) {
                    TTWebsiteActivity.uef(uef.this.lw, uef.this.cz, uef.this.dj);
                }
            });
            return pAGLogoViewCreatePAGLogoViewByMaterial;
        }

        @Override // com.bytedance.sdk.component.adexpress.oa.moa
        public View lw() {
            return this.bcc;
        }

        @Override // com.bytedance.sdk.component.adexpress.oa.moa
        public int yo() {
            return 5;
        }

        public void moa() {
            this.bcc = null;
            this.f25877oa = null;
            this.yo = null;
            this.dz = null;
            this.cz = null;
            ivm ivmVar = this.wrv;
            if (ivmVar != null) {
                ivmVar.ab();
                moa.uef().uef(this.wrv);
            }
            this.uef.set(true);
        }

        @Override // com.bytedance.sdk.openadsdk.core.zjm.ivm.oa
        public void oa() {
            if (this.dz != null) {
                com.bytedance.sdk.component.adexpress.oa.dz dzVar = new com.bytedance.sdk.component.adexpress.oa.dz();
                dzVar.uef(true);
                dzVar.uef(af.yo(this.lw, this.ivm));
                dzVar.oa(af.yo(this.lw, this.xs));
                this.dz.uef(this.bcc, dzVar);
            }
        }

        @Override // com.bytedance.sdk.component.adexpress.oa.moa
        public void uef(com.bytedance.sdk.component.adexpress.oa.xs xsVar) {
            com.bytedance.sdk.openadsdk.core.model.gzw gzwVar;
            if (this.uef.get()) {
                return;
            }
            if (this.lw == null || (gzwVar = this.cz) == null) {
                xsVar.uef(106, "material null");
                return;
            }
            this.dz = xsVar;
            if (TextUtils.isEmpty(gzwVar.wze())) {
                xsVar.uef(106, "dsp data is null");
            } else {
                this.wrv.dhk();
            }
        }

        public void uef(ku kuVar) {
            if (kuVar instanceof com.bytedance.sdk.openadsdk.yo.yo) {
                this.f25877oa = (com.bytedance.sdk.openadsdk.yo.yo) kuVar;
            }
        }

        public void uef(TTDislikeDialogAbstract tTDislikeDialogAbstract) {
            com.bytedance.sdk.openadsdk.core.model.gzw gzwVar;
            if (tTDislikeDialogAbstract != null && (gzwVar = this.cz) != null) {
                tTDislikeDialogAbstract.setMaterialMeta(gzwVar.em(), this.cz.tkg());
            }
            this.yo = tTDislikeDialogAbstract;
        }

        public void uef(String str) {
            this.moa = str;
        }

        @Override // com.bytedance.sdk.openadsdk.core.zjm.ivm.oa
        public View uef() {
            FrameLayout frameLayout = this.bcc;
            if (frameLayout == null) {
                return null;
            }
            return (View) frameLayout.getParent();
        }

        @Override // com.bytedance.sdk.openadsdk.core.zjm.ivm.oa
        public void uef(View view, int i5) {
            PAGExpressAdWrapperListener pAGExpressAdWrapperListener = this.wk;
            if (pAGExpressAdWrapperListener != null) {
                pAGExpressAdWrapperListener.onAdClicked();
            }
        }

        @Override // com.bytedance.sdk.openadsdk.core.zjm.ivm.oa
        public void uef(int i5, int i10) {
            com.bytedance.sdk.component.adexpress.oa.xs xsVar = this.dz;
            if (xsVar != null) {
                xsVar.uef(i5, "render fail");
            }
        }

        public void uef(PAGExpressAdWrapperListener pAGExpressAdWrapperListener) {
            this.wk = pAGExpressAdWrapperListener;
        }
    }

    /* renamed from: com.bytedance.sdk.openadsdk.core.zjm.yo$yo, reason: collision with other inner class name */
    public interface InterfaceC0115yo {
        void oa(String str);

        void uef();

        void uef(int i5, int i10);

        void uef(String str);
    }

    public yo(Context context, tpx tpxVar, com.bytedance.sdk.openadsdk.core.model.gzw gzwVar, String str) {
        this.uef = gzwVar;
        this.f25876oa = context;
        this.lw = tpxVar;
        uef(tpxVar);
        this.yo = new uef(context, gzwVar, this.ivm, this.xs, str, this.cz);
    }

    private void uef(tpx tpxVar) {
        com.bytedance.sdk.openadsdk.core.model.gzw gzwVar = this.uef;
        if (gzwVar != null && gzwVar.ib()) {
            this.ivm = -1;
            this.xs = -1;
            return;
        }
        oib oibVarUef = com.bytedance.sdk.openadsdk.core.moa.oa.uef(tpxVar.getExpectExpressWidth(), tpxVar.getExpectExpressHeight());
        this.cz = oibVarUef.uef;
        if (tpxVar.getExpectExpressWidth() <= 0 || tpxVar.getExpectExpressHeight() <= 0) {
            int iYo = af.yo(this.f25876oa);
            this.ivm = iYo;
            this.xs = Float.valueOf(iYo / oibVarUef.f25864oa).intValue();
        } else {
            this.ivm = af.oa(this.f25876oa, tpxVar.getExpectExpressWidth());
            this.xs = af.oa(this.f25876oa, tpxVar.getExpectExpressHeight());
        }
        int i5 = this.ivm;
        if (i5 <= 0 || i5 <= af.yo(this.f25876oa)) {
            return;
        }
        this.ivm = af.yo(this.f25876oa);
        this.xs = Float.valueOf(this.xs * (af.yo(this.f25876oa) / this.ivm)).intValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void yo() {
        try {
            ScheduledFuture<?> scheduledFuture = this.bcc;
            if (scheduledFuture == null || scheduledFuture.isCancelled()) {
                return;
            }
            this.bcc.cancel(false);
            this.bcc = null;
        } catch (Throwable unused) {
        }
    }

    public void oa() {
        uef uefVar = this.yo;
        if (uefVar != null) {
            uefVar.moa();
            this.yo = null;
        }
        yo();
        this.moa = null;
        this.lw = null;
    }

    public void uef(com.bytedance.sdk.component.adexpress.oa.wk wkVar) {
        this.moa = wkVar;
    }

    public void uef() {
        com.bytedance.sdk.openadsdk.core.model.gzw gzwVar = this.uef;
        if (gzwVar != null && gzwVar.ib()) {
            this.bcc = km.uef().schedule(new oa(this.yo.wrv), com.bytedance.sdk.openadsdk.core.sy.moa().oyt(), TimeUnit.MILLISECONDS);
        }
        uef uefVar = this.yo;
        if (uefVar != null) {
            uefVar.uef(new com.bytedance.sdk.component.adexpress.oa.xs() { // from class: com.bytedance.sdk.openadsdk.core.zjm.yo.1
                @Override // com.bytedance.sdk.component.adexpress.oa.xs
                public void uef(View view, com.bytedance.sdk.component.adexpress.oa.dz dzVar) {
                    if (yo.this.lw == null || view == null) {
                        if (yo.this.moa != null) {
                            yo.this.moa.a_(106);
                        }
                    } else if (yo.this.moa != null) {
                        yo.this.moa.uef(yo.this.yo, dzVar);
                    }
                    yo.this.yo();
                }

                @Override // com.bytedance.sdk.component.adexpress.oa.xs
                public void uef(int i5, String str) {
                    if (yo.this.moa != null) {
                        yo.this.moa.a_(106);
                    }
                    yo.this.yo();
                }
            });
            View viewLw = this.yo.lw();
            this.lw.removeView(viewLw);
            if (viewLw.getParent() != null) {
                ((ViewGroup) viewLw.getParent()).removeView(viewLw);
            }
            this.lw.addView(viewLw, new ViewGroup.LayoutParams(-1, -1));
            return;
        }
        com.bytedance.sdk.component.adexpress.oa.wk wkVar = this.moa;
        if (wkVar != null) {
            wkVar.a_(106);
        }
    }

    public void uef(ku kuVar) {
        uef uefVar = this.yo;
        if (uefVar != null) {
            uefVar.uef(kuVar);
        }
    }

    public void uef(TTDislikeDialogAbstract tTDislikeDialogAbstract) {
        uef uefVar = this.yo;
        if (uefVar != null) {
            uefVar.uef(tTDislikeDialogAbstract);
        }
    }

    public void uef(String str) {
        uef uefVar = this.yo;
        if (uefVar != null) {
            uefVar.uef(str);
        }
    }

    public void uef(PAGExpressAdWrapperListener pAGExpressAdWrapperListener) {
        uef uefVar = this.yo;
        if (uefVar != null) {
            uefVar.uef(pAGExpressAdWrapperListener);
        }
    }
}
