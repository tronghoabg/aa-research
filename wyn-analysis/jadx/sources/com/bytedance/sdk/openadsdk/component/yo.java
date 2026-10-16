package com.bytedance.sdk.openadsdk.component;

import A0.j;
import android.app.Activity;
import android.graphics.Bitmap;
import android.graphics.Color;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.bytedance.sdk.component.utils.dhk;
import com.bytedance.sdk.openadsdk.activity.single.TTAppOpenAdTransActivity;
import com.bytedance.sdk.openadsdk.activity.single.TTWebsiteActivity;
import com.bytedance.sdk.openadsdk.component.cz.lw;
import com.bytedance.sdk.openadsdk.component.ivm;
import com.bytedance.sdk.openadsdk.core.ivm.bcc;
import com.bytedance.sdk.openadsdk.core.model.gzw;
import com.bytedance.sdk.openadsdk.core.widget.PAGLogoView;
import com.bytedance.sdk.openadsdk.core.widget.ab;
import com.bytedance.sdk.openadsdk.core.widget.bs;
import com.bytedance.sdk.openadsdk.core.yo.oa;
import com.bytedance.sdk.openadsdk.utils.af;
import com.bytedance.sdk.openadsdk.utils.sy;
import java.lang.ref.WeakReference;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public class yo {

    /* renamed from: ab, reason: collision with root package name */
    private bcc f25484ab;
    protected FrameLayout bcc;
    private ImageView bs;
    private RelativeLayout cq;
    protected View cz;
    private bcc dhk;
    protected bcc dj;
    private ImageView dz;
    private com.bytedance.sdk.openadsdk.core.ivm.moa gr;
    private com.bytedance.sdk.openadsdk.component.bcc.yo gsd;
    private final com.bytedance.sdk.openadsdk.component.cz.bcc gzw = new com.bytedance.sdk.openadsdk.component.cz.bcc();
    protected final int ivm;
    protected final com.bytedance.sdk.openadsdk.component.uef lw;
    protected final FrameLayout moa;

    /* renamed from: oa, reason: collision with root package name */
    protected final gzw f25485oa;
    private bcc oib;
    private float orq;
    private View pz;
    private bcc rt;
    private bs sy;
    private float tpx;

    /* renamed from: ue, reason: collision with root package name */
    private ab f25486ue;
    protected final Activity uef;
    private PAGLogoView wk;
    protected final com.bytedance.sdk.openadsdk.component.bcc.uef wrv;
    protected int xs;
    protected final boolean yo;
    protected com.bytedance.sdk.openadsdk.core.ivm.moa zjm;

    public static class oa implements sy.uef {
        private final WeakReference<yo> uef;

        public oa(yo yoVar) {
            this.uef = new WeakReference<>(yoVar);
        }

        @Override // com.bytedance.sdk.openadsdk.utils.sy.uef
        public void uef() {
        }

        @Override // com.bytedance.sdk.openadsdk.utils.sy.uef
        public void uef(com.bytedance.sdk.openadsdk.dhk.uef.oa oaVar) {
            yo yoVar;
            if (!oaVar.lw() || (yoVar = this.uef.get()) == null) {
                return;
            }
            yoVar.uef(oaVar);
            if (oaVar.oa() != null) {
                yoVar.uef(oaVar.uef());
            }
        }
    }

    public static class uef implements ivm.yo {

        /* renamed from: oa, reason: collision with root package name */
        private final WeakReference<yo> f25490oa;
        WeakReference<Activity> uef;

        public uef(Activity activity, yo yoVar) {
            this.uef = new WeakReference<>(activity);
            this.f25490oa = new WeakReference<>(yoVar);
        }

        @Override // com.bytedance.sdk.openadsdk.component.ivm.yo
        public void uef(Object obj) {
            yo yoVar;
            if (this.uef.get() == null || this.uef.get().isFinishing() || (yoVar = this.f25490oa.get()) == null) {
                return;
            }
            yoVar.uef(obj);
        }
    }

    public yo(Activity activity, gzw gzwVar, FrameLayout frameLayout, com.bytedance.sdk.openadsdk.component.uef uefVar, int i5, boolean z2, com.bytedance.sdk.openadsdk.component.bcc.uef uefVar2) {
        this.uef = activity;
        this.f25485oa = gzwVar;
        this.moa = frameLayout;
        this.xs = i5;
        this.yo = z2;
        this.lw = uefVar;
        this.ivm = gzwVar.jnk();
        this.wrv = uefVar2;
    }

    private void bcc() {
        boolean z2;
        this.gzw.uef();
        this.f25484ab.setText(this.f25485oa.kik());
        if (this.f25485oa.ku()) {
            cz();
            return;
        }
        if (this.yo) {
            oa(0);
            uef(8);
            if (uef(this.bcc)) {
                this.lw.yo();
            } else {
                this.lw.moa();
            }
            ivm.uef(this.f25485oa, new uef(this.uef, this), 25);
        } else {
            oa(8);
            uef(0);
            zjm();
            this.lw.yo();
        }
        boolean z10 = true;
        if (this.rt == null) {
            z2 = false;
        } else {
            if (TextUtils.isEmpty(this.f25485oa.jp())) {
                if (this.f25485oa.no() != null) {
                    this.rt.setText(this.f25485oa.no().oa());
                }
                z2 = false;
            } else {
                this.rt.setText(this.f25485oa.jp());
            }
            z2 = true;
        }
        if (this.gr != null) {
            com.bytedance.sdk.openadsdk.dhk.oa.oa().uef(this.f25485oa.ifk(), this.gr, this.f25485oa);
        }
        ab abVar = this.f25486ue;
        if (abVar != null) {
            af.uef((TextView) null, abVar, this.f25485oa);
            if (this.f25485oa.no() == null || this.f25485oa.no().moa() < 0.0d) {
                this.f25486ue.setVisibility(8);
                z10 = z2;
            }
        } else {
            z10 = z2;
        }
        View view = this.pz;
        if (view != null) {
            view.setVisibility(z10 ? 0 : 8);
        }
    }

    private void cz() {
        if (this.oib != null) {
            if (this.f25485oa.no() != null && !TextUtils.isEmpty(this.f25485oa.no().oa())) {
                this.oib.setText(this.f25485oa.no().oa());
            } else if (TextUtils.isEmpty(this.f25485oa.jp())) {
                this.oib.setVisibility(8);
            } else {
                this.oib.setText(this.f25485oa.jp());
            }
        }
        if (this.dhk != null) {
            if (TextUtils.isEmpty(this.f25485oa.xw())) {
                this.dhk.setVisibility(8);
            } else {
                this.dhk.setText(this.f25485oa.xw());
            }
        }
        if (this.sy != null && this.f25485oa.ifk() != null && !TextUtils.isEmpty(this.f25485oa.ifk().uef())) {
            com.bytedance.sdk.openadsdk.dhk.oa.oa().uef(this.f25485oa.ifk().uef(), this.f25485oa.ifk().oa(), this.f25485oa.ifk().yo(), this.sy, this.f25485oa);
        }
        this.lw.yo();
    }

    private void zjm() {
        com.bytedance.sdk.openadsdk.core.model.sy syVar = this.f25485oa.lpy().get(0);
        sy.uef(new com.bytedance.sdk.openadsdk.dhk.uef(syVar.uef(), syVar.xs()), syVar.oa(), syVar.yo(), new oa(this), com.bytedance.sdk.openadsdk.component.xs.uef.oa(TextUtils.isEmpty(syVar.xs()) ? com.bytedance.sdk.component.utils.lw.uef(syVar.uef()) : syVar.xs()).getParent(), 25);
    }

    public void ivm() {
        View view = this.cz;
        if (view == null || this.zjm == null) {
            return;
        }
        view.setOnClickListener(new View.OnClickListener() { // from class: com.bytedance.sdk.openadsdk.component.yo.4
            @Override // android.view.View.OnClickListener
            public void onClick(View view2) {
                com.bytedance.sdk.openadsdk.component.uef uefVar = yo.this.lw;
                if (uefVar != null) {
                    uefVar.oa(view2);
                }
            }
        });
        this.zjm.setOnClickListener(new View.OnClickListener() { // from class: com.bytedance.sdk.openadsdk.component.yo.5
            @Override // android.view.View.OnClickListener
            public void onClick(View view2) {
                com.bytedance.sdk.openadsdk.component.uef uefVar = yo.this.lw;
                if (uefVar != null) {
                    uefVar.uef(view2);
                }
            }
        });
    }

    public void lw() {
    }

    public int moa() {
        return -1;
    }

    public void oa() {
        Window window;
        if (this.f25485oa.tv()) {
            this.lw.yo();
        } else {
            bcc();
        }
        Activity activity = this.uef;
        if (!(activity instanceof TTAppOpenAdTransActivity) || (window = activity.getWindow()) == null) {
            return;
        }
        window.setBackgroundDrawable(new ColorDrawable(Color.parseColor("#1E1E1E")));
    }

    public JSONObject uef(JSONObject jSONObject) {
        return null;
    }

    public com.bytedance.sdk.openadsdk.component.bcc.yo xs() {
        return this.gsd;
    }

    public void yo() {
        com.bytedance.sdk.openadsdk.component.bcc.yo yoVar = this.gsd;
        if (yoVar != null) {
            yoVar.wrv();
        }
    }

    public void uef(ViewGroup viewGroup) {
        com.bytedance.sdk.openadsdk.component.cz.yo moaVar = new com.bytedance.sdk.openadsdk.component.cz.moa(this.uef, this.f25485oa);
        int iNkh = this.f25485oa.nkh();
        if (iNkh == 5) {
            moaVar = new com.bytedance.sdk.openadsdk.component.cz.ivm(this.uef, this.f25485oa);
        } else if (iNkh == 4) {
            moaVar = new com.bytedance.sdk.openadsdk.component.cz.lw(this.uef, this.f25485oa);
        }
        com.bytedance.sdk.openadsdk.component.cz.yo yoVar = moaVar;
        this.cq = yoVar;
        viewGroup.addView(yoVar);
        this.bs = yoVar.getBackImage();
        this.bcc = yoVar.getVideoContainer();
        this.dz = yoVar.getImageView();
        this.f25484ab = yoVar.getClickButton();
        this.wk = yoVar.getAdLogo();
        this.rt = yoVar.getAdTitleTextView();
        this.gr = yoVar.getAdIconView();
        this.f25486ue = yoVar.getScoreBar();
        this.pz = yoVar.getOverlayLayout();
        if (this.f25485oa.ku()) {
            this.sy = yoVar.getIconOnlyView();
            this.oib = yoVar.getTitle();
            this.dhk = yoVar.getContent();
        }
        if (yoVar.getDspAdChoice() != null) {
            yoVar.getDspAdChoice().uef(14, this.f25485oa);
        }
        if (!this.f25485oa.tv()) {
            this.gzw.uef(yoVar, this.f25485oa, this.orq, this.tpx, this.yo);
        }
        this.cz = yoVar.getTopDisLike();
        this.zjm = yoVar.getTopSkip();
        this.dj = yoVar.getTopCountDown();
        if (yoVar instanceof com.bytedance.sdk.openadsdk.component.cz.lw) {
            ((com.bytedance.sdk.openadsdk.component.cz.lw) yoVar).setRenderListener(new lw.uef() { // from class: com.bytedance.sdk.openadsdk.component.yo.1
                @Override // com.bytedance.sdk.openadsdk.component.cz.lw.uef
                public void uef(View view, int i5) {
                    yo.this.lw.lw();
                }
            });
        }
    }

    private void oa(int i5) {
        af.uef((View) this.bcc, i5);
    }

    public void uef() {
        this.wk.setOnClickListener(new View.OnClickListener() { // from class: com.bytedance.sdk.openadsdk.component.yo.2
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                try {
                    yo yoVar = yo.this;
                    TTWebsiteActivity.uef(yoVar.uef, yoVar.f25485oa, "open_ad");
                } catch (Throwable th) {
                    dhk.yo("AppOpenAdNativeManager", th.getMessage());
                }
            }
        });
        ivm();
        if (this.f25485oa.tv()) {
            return;
        }
        com.bytedance.sdk.openadsdk.component.uef.uef uefVarUef = com.bytedance.sdk.openadsdk.component.uef.oa.uef(this.f25485oa, this.uef, this.wrv);
        uefVarUef.uef(new oa.uef() { // from class: com.bytedance.sdk.openadsdk.component.yo.3
            @Override // com.bytedance.sdk.openadsdk.core.yo.oa.uef
            public void uef(View view, int i5) {
                yo.this.lw.lw();
            }
        });
        uefVarUef.uef(this.gsd);
        if (this.f25485oa.zou() == 1) {
            this.cq.setOnClickListener(uefVarUef);
            this.cq.setOnTouchListener(uefVarUef);
        }
        this.f25484ab.setOnClickListener(uefVarUef);
        this.f25484ab.setOnTouchListener(uefVarUef);
    }

    public boolean uef(FrameLayout frameLayout) {
        com.bytedance.sdk.openadsdk.component.bcc.yo yoVar = new com.bytedance.sdk.openadsdk.component.bcc.yo(this.uef);
        this.gsd = yoVar;
        return yoVar.uef(frameLayout, this.lw, this.f25485oa);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void uef(Object obj) {
        try {
            if (obj instanceof Bitmap) {
                this.bs.setImageDrawable(new BitmapDrawable(com.bytedance.sdk.openadsdk.core.sy.uef().getResources(), (Bitmap) obj));
            }
        } catch (Throwable unused) {
            dhk.yo("AppOpenAdNativeManager", "open_ad", "bindBackGroundImage error");
        }
    }

    public void uef(com.bytedance.sdk.openadsdk.dhk.uef.oa oaVar) {
        if (this.dz == null) {
            return;
        }
        if (oaVar.oa() != null) {
            this.dz.setImageBitmap(oaVar.oa());
            return;
        }
        Drawable drawableMoa = oaVar.moa();
        if (drawableMoa != null) {
            this.dz.setScaleType(ImageView.ScaleType.FIT_CENTER);
            if (Build.VERSION.SDK_INT >= 28 && j.x(drawableMoa)) {
                j.j(drawableMoa).start();
            }
            this.dz.setImageDrawable(drawableMoa);
            return;
        }
        if (this.f25485oa.lpy() == null || this.f25485oa.lpy().get(0) == null) {
            return;
        }
        Drawable drawableUef = sy.uef(oaVar.yo(), this.f25485oa.lpy().get(0).oa());
        this.dz.setScaleType(ImageView.ScaleType.FIT_CENTER);
        this.dz.setImageDrawable(drawableUef);
    }

    public void uef(int i5) {
        af.uef((View) this.dz, i5);
    }

    public void uef(float f10, float f11) {
        this.orq = f10;
        this.tpx = f11;
    }

    public void uef(int i5, boolean z2) {
        bcc bccVar;
        if (this.zjm == null || (bccVar = this.dj) == null) {
            return;
        }
        if (z2) {
            if (bccVar.getVisibility() != 8) {
                this.dj.setVisibility(8);
            }
            if (this.zjm.getVisibility() != 0) {
                this.zjm.setVisibility(0);
                return;
            }
            return;
        }
        this.dj.setText(i5 + "s");
        if (this.dj.getVisibility() != 0) {
            this.dj.setVisibility(0);
        }
    }
}
