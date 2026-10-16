package com.bytedance.sdk.openadsdk.core.wk.oa;

import android.content.Context;
import android.graphics.SurfaceTexture;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Message;
import android.view.SurfaceHolder;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.bytedance.sdk.component.utils.ue;
import com.bytedance.sdk.openadsdk.api.nativeAd.PAGNativeAd;
import com.bytedance.sdk.openadsdk.core.model.gzw;
import com.bytedance.sdk.openadsdk.core.sy;
import com.bytedance.sdk.openadsdk.core.widget.dhk;
import com.bytedance.sdk.openadsdk.core.widget.oib;
import com.bytedance.sdk.openadsdk.core.wk.oa.ivm;
import com.bytedance.sdk.openadsdk.core.yo.uef;
import com.bytedance.sdk.openadsdk.utils.af;
import com.bytedance.sdk.openadsdk.utils.bs;
import com.bytedance.sdk.openadsdk.utils.dj;
import java.lang.ref.WeakReference;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes3.dex */
public class lw implements com.bykv.vk.openvk.uef.uef.uef.ivm.uef, com.bykv.vk.openvk.uef.uef.uef.moa.oa<gzw>, ue.uef, dhk.oa, oib.uef, uef.InterfaceC0112uef {

    /* renamed from: ab, reason: collision with root package name */
    int f25795ab;
    ImageView bcc;
    int bs;
    com.bytedance.sdk.openadsdk.core.yo.uef cp;
    TextView cq;
    View cz;
    int dhk;
    ImageView dj;
    private ivm.uef dxx;
    int dz;
    boolean fz;
    boolean gr;
    dhk gsd;
    Context gzw;
    View ivm;
    com.bytedance.sdk.openadsdk.core.yo.uef ku;
    ImageView lw;
    private long lz;
    com.bykv.vk.openvk.uef.uef.uef.ivm.oa moa;

    /* renamed from: oa, reason: collision with root package name */
    protected final int f25796oa;
    boolean oib;
    gzw orq;
    private final String oyt;
    com.bykv.vk.openvk.uef.uef.uef.moa.yo pz;
    uef rt;
    boolean sy;
    int tpx;

    /* renamed from: ue, reason: collision with root package name */
    com.bytedance.sdk.openadsdk.tpx.uef.uef.yo f25797ue;
    protected final int uef;
    int wk;
    View wrv;
    View xs;
    ViewGroup yo;
    View zjm;

    public lw(Context context, ViewGroup viewGroup, boolean z2, int i5, gzw gzwVar, com.bykv.vk.openvk.uef.uef.uef.moa.yo yoVar, boolean z10) {
        this.uef = 228;
        this.f25796oa = 160;
        this.sy = true;
        this.gr = true;
        this.fz = true;
        this.oyt = Build.MODEL;
        if (this instanceof moa) {
            return;
        }
        this.gzw = sy.uef().getApplicationContext();
        moa(z10);
        this.yo = viewGroup;
        this.sy = z2;
        this.tpx = i5;
        this.pz = yoVar;
        this.orq = gzwVar;
        moa(8);
        uef(context, this.yo);
        moa();
        wrv();
    }

    private boolean rt() {
        return gzw.lw(this.orq) && (!com.bytedance.sdk.openadsdk.core.cq.lw.uef(this.orq.ix()) ? this.orq.vep() == null : this.orq.aje() == null) && this.orq.vj() == 1;
    }

    public boolean ab() {
        return this.rt != null;
    }

    public void bcc() {
        af.lw(this.ivm);
    }

    public void bs() {
        af.ivm(this.ivm);
        af.ivm(this.xs);
        if (this.lw.getVisibility() == 0) {
            af.uef((View) this.lw, 8);
        }
    }

    public com.bykv.vk.openvk.uef.uef.uef.ivm.oa cq() {
        return this.moa;
    }

    public void cz() {
        moa(8);
        if (gsd()) {
            this.moa.setVisibility(8);
        }
        ImageView imageView = this.bcc;
        if (imageView != null) {
            imageView.setImageDrawable(null);
        }
        moa(8);
        af.uef(this.zjm, 8);
        af.uef((View) this.dj, 8);
        af.uef(this.wrv, 8);
        dhk dhkVar = this.gsd;
        if (dhkVar != null) {
            dhkVar.uef(true);
        }
    }

    public void dhk() {
        ImageView imageView = this.dj;
        if (imageView != null) {
            imageView.setImageBitmap(null);
        }
    }

    @Override // com.bytedance.sdk.openadsdk.core.widget.dhk.oa
    public void dj() {
        uef(true, false);
    }

    public void dz() {
        if (this.rt == null || this.gsd != null) {
            return;
        }
        System.currentTimeMillis();
        dhk dhkVar = new dhk();
        this.gsd = dhkVar;
        dhkVar.uef(this.gzw, this.yo);
        this.gsd.uef(this.rt, this);
        System.currentTimeMillis();
    }

    @Override // com.bytedance.sdk.openadsdk.core.yo.uef.InterfaceC0112uef
    public long getVideoProgress() {
        if (this.lz <= 0) {
            gzw gzwVar = this.orq;
            if (gzwVar != null && gzwVar.nj() != null) {
                this.lz = (long) (this.orq.nj().ivm() * 1000.0d);
            }
            com.bykv.vk.openvk.uef.uef.uef.moa.yo yoVar = this.pz;
            if (yoVar != null) {
                this.lz = yoVar.cz();
            }
        }
        return this.lz;
    }

    public boolean gsd() {
        return (this.tpx & 4) != 4 || this.sy;
    }

    @Override // com.bytedance.sdk.openadsdk.core.widget.oib.uef
    public boolean gzw() {
        dhk dhkVar = this.gsd;
        return dhkVar != null && dhkVar.uef();
    }

    public void ivm() {
    }

    public void lw() {
    }

    public void moa() {
        this.moa.uef(this);
        this.lw.setOnClickListener(new View.OnClickListener() { // from class: com.bytedance.sdk.openadsdk.core.wk.oa.lw.4
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                if (lw.this.ab()) {
                    TextView textView = lw.this.cq;
                    if (textView == null || textView.getVisibility() != 0) {
                        lw lwVar = lw.this;
                        lwVar.rt.uef(lwVar, view);
                    }
                }
            }
        });
    }

    public void oa(@Nullable ViewGroup viewGroup) {
    }

    public void oib() {
        try {
            af.uef(this.zjm, 8);
            af.uef((View) this.dj, 8);
            af.uef(this.wrv, 8);
            af.uef((View) this.cq, 8);
        } catch (Exception unused) {
        }
    }

    public boolean orq() {
        return this.oib;
    }

    public void sy() {
        af.uef((View) this.yo, 0);
        com.bykv.vk.openvk.uef.uef.uef.ivm.oa oaVar = this.moa;
        if (oaVar != null) {
            af.uef(oaVar.getView(), 0);
        }
    }

    public boolean tpx() {
        return this.sy;
    }

    public void uef(int i5) {
    }

    public void wk() {
        dhk dhkVar = this.gsd;
        if (dhkVar != null) {
            dhkVar.uef(false);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x003b  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x005a  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0092  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00cd  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void wrv() {
        /*
            r9 = this;
            boolean r0 = r9.gr
            if (r0 == 0) goto L7
            java.lang.String r0 = "embeded_ad"
            goto L9
        L7:
            java.lang.String r0 = "embeded_ad_landingpage"
        L9:
            com.bytedance.sdk.openadsdk.core.model.gzw r1 = r9.orq
            boolean r1 = r1.nyn()
            r2 = 1
            if (r1 == 0) goto L18
            java.lang.String r0 = "rewarded_video"
            r1 = 7
        L15:
            r7 = r0
            r8 = r1
            goto L32
        L18:
            com.bytedance.sdk.openadsdk.core.model.gzw r1 = r9.orq
            boolean r1 = r1.yd()
            if (r1 == 0) goto L24
            java.lang.String r0 = "fullscreen_interstitial_ad"
            r1 = 5
            goto L15
        L24:
            com.bytedance.sdk.openadsdk.core.model.gzw r1 = r9.orq
            boolean r1 = r1.ga()
            if (r1 == 0) goto L30
            java.lang.String r0 = "banner_ad"
            r1 = 2
            goto L15
        L30:
            r7 = r0
            r8 = r2
        L32:
            com.bytedance.sdk.openadsdk.core.model.gzw r0 = r9.orq
            int r0 = r0.ykf()
            r1 = 4
            if (r0 != r1) goto L43
            android.content.Context r0 = r9.gzw
            com.bytedance.sdk.openadsdk.tpx.uef.uef.yo r0 = com.bytedance.sdk.openadsdk.tpx.uef.uef.moa.uef(r0, r7)
            r9.f25797ue = r0
        L43:
            com.bytedance.sdk.openadsdk.core.yo.uef r0 = new com.bytedance.sdk.openadsdk.core.yo.uef
            android.content.Context r1 = r9.gzw
            com.bytedance.sdk.openadsdk.core.model.gzw r3 = r9.orq
            r0.<init>(r1, r3, r7, r8)
            r9.cp = r0
            r0.uef(r9)
            com.bytedance.sdk.openadsdk.core.yo.uef r0 = r9.cp
            r0.oa(r2)
            boolean r0 = r9.gr
            if (r0 == 0) goto L60
            com.bytedance.sdk.openadsdk.core.yo.uef r0 = r9.cp
            r0.uef(r2)
            goto L6b
        L60:
            com.bytedance.sdk.openadsdk.core.yo.uef r0 = r9.cp
            r1 = 0
            r0.uef(r1)
            com.bytedance.sdk.openadsdk.core.yo.uef r0 = r9.cp
            r0.yo(r2)
        L6b:
            com.bytedance.sdk.openadsdk.core.yo.uef r0 = r9.cp
            com.bykv.vk.openvk.uef.uef.uef.moa.yo r1 = r9.pz
            r0.uef(r1)
            com.bytedance.sdk.openadsdk.core.yo.uef r0 = r9.cp
            r0.lw(r2)
            com.bytedance.sdk.openadsdk.core.yo.uef r0 = r9.cp
            com.bytedance.sdk.openadsdk.core.wk.oa.lw$1 r1 = new com.bytedance.sdk.openadsdk.core.wk.oa.lw$1
            r1.<init>()
            r0.uef(r1)
            com.bytedance.sdk.openadsdk.tpx.uef.uef.yo r0 = r9.f25797ue
            if (r0 == 0) goto L8c
            com.bytedance.sdk.openadsdk.core.yo.uef r1 = r9.cp
            if (r1 == 0) goto L8c
            r1.uef(r0)
        L8c:
            boolean r0 = r9.rt()
            if (r0 == 0) goto Lcd
            com.bytedance.sdk.openadsdk.core.wk.oa.lw$2 r3 = new com.bytedance.sdk.openadsdk.core.wk.oa.lw$2
            android.content.Context r5 = r9.gzw
            com.bytedance.sdk.openadsdk.core.model.gzw r6 = r9.orq
            r4 = r9
            r3.<init>(r5, r6, r7, r8)
            r4.ku = r3
            com.bytedance.sdk.openadsdk.core.wk.oa.lw$3 r0 = new com.bytedance.sdk.openadsdk.core.wk.oa.lw$3
            r0.<init>()
            r3.uef(r0)
            com.bytedance.sdk.openadsdk.core.yo.uef r0 = r4.ku
            r0.oa(r2)
            com.bytedance.sdk.openadsdk.core.yo.uef r0 = r4.ku
            boolean r1 = r4.gr
            r0.uef(r1)
            com.bytedance.sdk.openadsdk.core.yo.uef r0 = r4.ku
            com.bykv.vk.openvk.uef.uef.uef.moa.yo r1 = r4.pz
            r0.uef(r1)
            com.bytedance.sdk.openadsdk.core.yo.uef r0 = r4.ku
            r0.lw(r2)
            com.bytedance.sdk.openadsdk.tpx.uef.uef.yo r0 = r4.f25797ue
            if (r0 == 0) goto Lc7
            com.bytedance.sdk.openadsdk.core.yo.uef r1 = r4.ku
            r1.uef(r0)
        Lc7:
            com.bytedance.sdk.openadsdk.core.yo.uef r0 = r4.ku
            r0.uef(r9)
            return
        Lcd:
            r4 = r9
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.sdk.openadsdk.core.wk.oa.lw.wrv():void");
    }

    public void xs() {
        gzw gzwVar;
        af.ivm(this.ivm);
        af.ivm(this.xs);
        if (this.bcc != null && (gzwVar = this.orq) != null && gzwVar.nj() != null && this.orq.nj().zjm() != null) {
            af.ivm(this.bcc);
            com.bytedance.sdk.openadsdk.dhk.oa.oa().uef(this.orq.nj().zjm(), this.orq.nj().yo(), this.orq.nj().oa(), this.bcc, this.orq);
        }
        if (this.lw.getVisibility() == 0) {
            af.uef((View) this.lw, 8);
        }
    }

    public void yo(boolean z2) {
    }

    @Override // com.bytedance.sdk.openadsdk.core.widget.dhk.oa
    public boolean zjm() {
        return false;
    }

    private void ivm(int i5) {
        af.uef(this.wrv, i5);
    }

    private int lw(int i5) {
        if (this.f25795ab <= 0 || this.bs <= 0) {
            return 0;
        }
        int iOa = af.oa(this.gzw, 228.0f);
        int iOa2 = af.oa(this.gzw, 160.0f);
        int i10 = (int) (this.bs * ((i5 * 1.0f) / this.f25795ab));
        return i10 > iOa ? iOa : i10 < iOa2 ? iOa2 : i10;
    }

    public void oa(boolean z2) {
    }

    public void uef(long j8) {
    }

    public void yo(int i5) {
        af.uef((View) this.yo, 0);
        com.bykv.vk.openvk.uef.uef.uef.ivm.oa oaVar = this.moa;
        if (oaVar != null) {
            oaVar.setVisibility(i5);
        }
    }

    public void moa(boolean z2) {
        this.gr = z2;
        if (z2) {
            com.bytedance.sdk.openadsdk.core.yo.uef uefVar = this.cp;
            if (uefVar != null) {
                uefVar.uef(true);
            }
            com.bytedance.sdk.openadsdk.core.yo.uef uefVar2 = this.ku;
            if (uefVar2 != null) {
                uefVar2.uef(true);
                return;
            }
            return;
        }
        com.bytedance.sdk.openadsdk.core.yo.uef uefVar3 = this.cp;
        if (uefVar3 != null) {
            uefVar3.uef(false);
        }
        com.bytedance.sdk.openadsdk.core.yo.uef uefVar4 = this.ku;
        if (uefVar4 != null) {
            uefVar4.uef(false);
        }
    }

    public boolean oa(int i5) {
        return false;
    }

    public void uef(long j8, long j10) {
    }

    public void oa(boolean z2, boolean z10) {
        ImageView imageView = this.lw;
        if (imageView != null) {
            if (z2) {
                imageView.setImageDrawable(dj.uef(this.gzw, "tt_play_movebar_textpage"));
            } else {
                imageView.setImageDrawable(dj.uef(this.gzw, "tt_stop_movebar_textpage"));
            }
        }
    }

    @Override // com.bytedance.sdk.component.utils.ue.uef
    public void uef(Message message) {
    }

    @Override // com.bytedance.sdk.openadsdk.core.widget.oib.uef
    public void uef(View view, boolean z2) {
    }

    public void yo(int i5, int i10) {
        this.f25795ab = i5;
        this.bs = i10;
    }

    public void uef(@Nullable ViewGroup viewGroup) {
    }

    public void oa(int i5, int i10) {
        ViewGroup.LayoutParams layoutParams = this.yo.getLayoutParams();
        if (layoutParams == null) {
            return;
        }
        if (i5 == -1 || i5 == -2 || i5 > 0) {
            layoutParams.width = i5;
        }
        if (i10 == -1 || i10 == -2 || i10 > 0) {
            layoutParams.height = i10;
        }
        this.yo.setLayoutParams(layoutParams);
    }

    public void uef(String str) {
    }

    public void yo(@Nullable ViewGroup viewGroup) {
        if (viewGroup == null) {
            return;
        }
        if (this.yo.getParent() == null) {
            viewGroup.addView(this.yo);
        }
        moa(0);
    }

    @Override // com.bykv.vk.openvk.uef.uef.uef.moa.oa
    public /* bridge */ /* synthetic */ void uef(gzw gzwVar, WeakReference weakReference, boolean z2) {
        uef2(gzwVar, (WeakReference<Context>) weakReference, z2);
    }

    public void uef(ivm.uef uefVar) {
        this.dxx = uefVar;
    }

    @Override // com.bykv.vk.openvk.uef.uef.uef.moa.oa
    public View yo() {
        return this.yo;
    }

    @Override // com.bykv.vk.openvk.uef.uef.uef.moa.oa
    public void oa() {
        af.lw(this.ivm);
        af.lw(this.xs);
        ImageView imageView = this.bcc;
        if (imageView != null) {
            af.lw(imageView);
        }
    }

    public void uef(PAGNativeAd pAGNativeAd) {
        com.bytedance.sdk.openadsdk.core.yo.uef uefVar = this.cp;
        if (uefVar != null) {
            uefVar.uef(pAGNativeAd);
        }
        com.bytedance.sdk.openadsdk.core.yo.uef uefVar2 = this.ku;
        if (uefVar2 != null) {
            uefVar2.uef(pAGNativeAd);
        }
    }

    public void moa(int i5) {
        this.dhk = i5;
        af.uef((View) this.yo, i5);
    }

    @Override // com.bykv.vk.openvk.uef.uef.uef.ivm.uef
    public void oa(SurfaceHolder surfaceHolder) {
        if (surfaceHolder != this.moa.getHolder()) {
            return;
        }
        this.oib = false;
        if (ab()) {
            this.rt.oa(this, surfaceHolder);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v19, types: [com.bykv.vk.openvk.uef.uef.uef.ivm.moa] */
    public void uef(Context context, View view) {
        com.bykv.vk.openvk.uef.uef.uef.ivm.yo yoVar;
        System.currentTimeMillis();
        gzw gzwVar = this.orq;
        if ((gzwVar == null || ((!gzwVar.jvw() && !this.orq.ga()) || com.bytedance.sdk.openadsdk.core.settings.dj.oa().qn())) && view != null) {
            view.setKeepScreenOn(true);
        }
        com.bykv.vk.openvk.uef.uef.uef.moa.yo yoVar2 = this.pz;
        if (yoVar2 != null && yoVar2.wk()) {
            yoVar = new com.bykv.vk.openvk.uef.uef.uef.ivm.moa(this.gzw);
        } else {
            yoVar = new com.bykv.vk.openvk.uef.uef.uef.ivm.yo(this.gzw);
        }
        if (view instanceof RelativeLayout) {
            RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-2, -2);
            layoutParams.addRule(13);
            ((RelativeLayout) view).addView(yoVar, 0, layoutParams);
        }
        af.uef((View) yoVar, 8);
        this.moa = yoVar;
        this.lw = (ImageView) view.findViewById(bs.az);
        this.ivm = view.findViewById(bs.uxr);
        this.xs = view.findViewById(bs.xw);
        this.bcc = (ImageView) view.findViewById(bs.efa);
        this.cz = view.findViewById(bs.lpy);
        System.currentTimeMillis();
    }

    @Override // com.bykv.vk.openvk.uef.uef.uef.ivm.uef
    public void oa(SurfaceTexture surfaceTexture) {
        com.bykv.vk.openvk.uef.uef.uef.moa.yo yoVar = this.pz;
        if (yoVar != null) {
            yoVar.uef(surfaceTexture);
        }
    }

    public lw(Context context, ViewGroup viewGroup, boolean z2, int i5, gzw gzwVar, com.bykv.vk.openvk.uef.uef.uef.moa.yo yoVar) {
        this(context, viewGroup, z2, i5, gzwVar, yoVar, true);
    }

    public void uef(View view, Context context) {
        View view2;
        if (view == null || context == null || (view2 = this.cz) == null || view2.getParent() == null || this.zjm != null) {
            return;
        }
        this.zjm = this.cz;
        this.dj = (ImageView) view.findViewById(bs.f26134df);
        this.wrv = view.findViewById(bs.wp);
        this.cq = (TextView) view.findViewById(bs.cop);
    }

    public boolean uef(int i5, com.bykv.vk.openvk.uef.uef.uef.yo.oa oaVar, boolean z2) {
        dhk dhkVar = this.gsd;
        return dhkVar == null || dhkVar.uef(i5, oaVar, z2);
    }

    public void uef(com.bykv.vk.openvk.uef.uef.uef.moa.uef uefVar) {
        if (uefVar instanceof uef) {
            this.rt = (uef) uefVar;
            dz();
        }
    }

    public void uef(int i5, int i10) {
        if (i5 == -1) {
            i5 = af.yo(this.gzw);
        }
        if (i5 <= 0) {
            return;
        }
        this.dz = i5;
        if (!tpx() && !zjm() && (this.tpx & 8) != 8) {
            this.wk = lw(i5);
        } else {
            this.wk = i10;
        }
        oa(this.dz, this.wk);
    }

    @Override // com.bykv.vk.openvk.uef.uef.uef.moa.oa
    public void uef() {
        uef(false, this.sy);
        oib();
    }

    @Override // com.bykv.vk.openvk.uef.uef.uef.moa.oa
    public void uef(boolean z2) {
        this.fz = z2;
    }

    /* JADX WARN: Removed duplicated region for block: B:34:0x00a8  */
    /* renamed from: uef, reason: avoid collision after fix types in other method */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void uef2(com.bytedance.sdk.openadsdk.core.model.gzw r7, java.lang.ref.WeakReference<android.content.Context> r8, boolean r9) {
        /*
            r6 = this;
            if (r7 != 0) goto L4
            goto Lca
        L4:
            boolean r8 = r6.sy
            r9 = 0
            r6.uef(r9, r8)
            android.view.ViewGroup r8 = r6.yo
            android.content.Context r0 = com.bytedance.sdk.openadsdk.core.sy.uef()
            r6.uef(r8, r0)
            android.view.View r8 = r6.zjm
            if (r8 == 0) goto L1a
            com.bytedance.sdk.openadsdk.utils.af.uef(r8, r9)
        L1a:
            android.widget.ImageView r8 = r6.dj
            if (r8 == 0) goto L21
            com.bytedance.sdk.openadsdk.utils.af.uef(r8, r9)
        L21:
            android.view.View r8 = r6.wrv
            com.bytedance.sdk.openadsdk.utils.af.uef(r8, r9)
            android.widget.ImageView r8 = r6.dj
            if (r8 == 0) goto L69
            com.bytedance.sdk.openadsdk.core.model.gzw r8 = r6.orq
            if (r8 == 0) goto L69
            com.bykv.vk.openvk.uef.uef.uef.yo.oa r8 = r8.nj()
            if (r8 == 0) goto L69
            com.bytedance.sdk.openadsdk.core.model.gzw r8 = r6.orq
            com.bykv.vk.openvk.uef.uef.uef.yo.oa r8 = r8.nj()
            java.lang.String r8 = r8.zjm()
            if (r8 == 0) goto L69
            com.bytedance.sdk.openadsdk.dhk.oa r0 = com.bytedance.sdk.openadsdk.dhk.oa.oa()
            com.bytedance.sdk.openadsdk.core.model.gzw r8 = r6.orq
            com.bykv.vk.openvk.uef.uef.uef.yo.oa r8 = r8.nj()
            java.lang.String r1 = r8.zjm()
            com.bytedance.sdk.openadsdk.core.model.gzw r8 = r6.orq
            com.bykv.vk.openvk.uef.uef.uef.yo.oa r8 = r8.nj()
            int r2 = r8.yo()
            com.bytedance.sdk.openadsdk.core.model.gzw r8 = r6.orq
            com.bykv.vk.openvk.uef.uef.uef.yo.oa r8 = r8.nj()
            int r3 = r8.oa()
            android.widget.ImageView r4 = r6.dj
            r5 = r7
            r0.uef(r1, r2, r3, r4, r5)
            goto L6a
        L69:
            r5 = r7
        L6a:
            android.widget.TextView r7 = r6.cq
            com.bytedance.sdk.openadsdk.utils.af.uef(r7, r9)
            java.lang.String r7 = r5.kik()
            boolean r8 = android.text.TextUtils.isEmpty(r7)
            r9 = 4
            if (r8 == 0) goto Lae
            int r7 = r5.ykf()
            r8 = 2
            java.lang.String r0 = "tt_video_mobile_go_detail"
            if (r7 == r8) goto La8
            r8 = 3
            if (r7 == r8) goto La8
            if (r7 == r9) goto L9f
            r8 = 5
            if (r7 == r8) goto L96
            r8 = 8
            if (r7 == r8) goto La8
            android.content.Context r7 = r6.gzw
            java.lang.String r7 = com.bytedance.sdk.component.utils.orq.uef(r7, r0)
            goto Lae
        L96:
            android.content.Context r7 = r6.gzw
            java.lang.String r8 = "tt_video_dial_phone"
            java.lang.String r7 = com.bytedance.sdk.component.utils.orq.uef(r7, r8)
            goto Lae
        L9f:
            android.content.Context r7 = r6.gzw
            java.lang.String r8 = "tt_video_download_apk"
            java.lang.String r7 = com.bytedance.sdk.component.utils.orq.uef(r7, r8)
            goto Lae
        La8:
            android.content.Context r7 = r6.gzw
            java.lang.String r7 = com.bytedance.sdk.component.utils.orq.uef(r7, r0)
        Lae:
            android.widget.TextView r8 = r6.cq
            if (r8 == 0) goto Lc3
            r8.setText(r7)
            android.widget.TextView r7 = r6.cq
            com.bytedance.sdk.openadsdk.core.yo.uef r8 = r6.cp
            r7.setOnClickListener(r8)
            android.widget.TextView r7 = r6.cq
            com.bytedance.sdk.openadsdk.core.yo.uef r8 = r6.cp
            r7.setOnTouchListener(r8)
        Lc3:
            boolean r7 = r6.fz
            if (r7 != 0) goto Lca
            r6.ivm(r9)
        Lca:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.sdk.openadsdk.core.wk.oa.lw.uef2(com.bytedance.sdk.openadsdk.core.model.gzw, java.lang.ref.WeakReference, boolean):void");
    }

    @Override // com.bykv.vk.openvk.uef.uef.uef.ivm.uef
    public void uef(SurfaceHolder surfaceHolder) {
        if (surfaceHolder != this.moa.getHolder()) {
            return;
        }
        this.oib = true;
        if (ab()) {
            this.rt.uef(this, surfaceHolder);
        }
    }

    @Override // com.bykv.vk.openvk.uef.uef.uef.ivm.uef
    public void uef(SurfaceHolder surfaceHolder, int i5, int i10, int i11) {
        if (surfaceHolder != this.moa.getHolder()) {
            return;
        }
        ab();
    }

    @Override // com.bykv.vk.openvk.uef.uef.uef.ivm.uef
    public void uef(SurfaceTexture surfaceTexture, int i5, int i10) {
        this.oib = true;
        if (ab()) {
            this.rt.uef(this, surfaceTexture);
        }
    }

    @Override // com.bykv.vk.openvk.uef.uef.uef.ivm.uef
    public boolean uef(SurfaceTexture surfaceTexture) {
        this.oib = false;
        if (!ab()) {
            return true;
        }
        this.rt.oa(this, surfaceTexture);
        return true;
    }

    public void uef(boolean z2, boolean z10, boolean z11) {
        af.uef((View) this.lw, (!z2 || this.ivm.getVisibility() == 0) ? 8 : 0);
    }

    public void uef(boolean z2, boolean z10) {
        af.uef((View) this.lw, 8);
    }

    @Override // com.bykv.vk.openvk.uef.uef.uef.moa.oa
    public void uef(Drawable drawable) {
        ViewGroup viewGroup = this.yo;
        if (viewGroup != null) {
            viewGroup.setBackgroundDrawable(drawable);
        }
    }
}
