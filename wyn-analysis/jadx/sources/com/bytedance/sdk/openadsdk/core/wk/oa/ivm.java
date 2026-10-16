package com.bytedance.sdk.openadsdk.core.wk.oa;

import android.content.Context;
import android.os.Build;
import android.os.Handler;
import android.os.Message;
import android.os.SystemClock;
import android.util.Pair;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.ViewTreeObserver;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import com.bykv.vk.openvk.uef.uef.uef.moa.yo;
import com.bytedance.sdk.component.utils.orq;
import com.bytedance.sdk.component.utils.ue;
import com.bytedance.sdk.openadsdk.CacheDirFactory;
import com.bytedance.sdk.openadsdk.api.nativeAd.PAGNativeAd;
import com.bytedance.sdk.openadsdk.core.model.gzw;
import com.bytedance.sdk.openadsdk.core.sy;
import com.bytedance.sdk.openadsdk.core.wk;
import com.bytedance.sdk.openadsdk.core.wk.oa.yo;
import com.bytedance.sdk.openadsdk.core.zjm;
import com.bytedance.sdk.openadsdk.moa.lw.oa.wk;
import com.bytedance.sdk.openadsdk.moa.xs;
import com.bytedance.sdk.openadsdk.utils.af;
import com.bytedance.sdk.openadsdk.utils.gb;
import com.bytedance.sdk.openadsdk.utils.km;
import com.iab.omid.library.bytedance2.adsession.FriendlyObstructionPurpose;
import java.lang.ref.WeakReference;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes3.dex */
public class ivm extends com.bytedance.sdk.openadsdk.core.ivm.yo implements yo.uef, ue.uef, yo.uef {

    /* renamed from: ab, reason: collision with root package name */
    public oa f25792ab;
    private ViewTreeObserver.OnGlobalLayoutListener af;
    protected ImageView bcc;
    private final Context bs;
    private long cp;
    protected int cq;
    protected ImageView cz;
    private boolean dhk;
    protected boolean dj;
    private boolean dxx;
    boolean dz;
    private final Handler fz;
    private yo.InterfaceC0033yo gb;
    private final ViewTreeObserver.OnScrollChangedListener gem;
    private boolean gr;
    private String gsd;
    public xs ivm;
    private final String km;
    private final boolean ku;
    public boolean lw;
    private long lz;
    protected boolean moa;

    /* renamed from: oa, reason: collision with root package name */
    protected yo f25793oa;
    private boolean oib;
    private boolean oyt;
    private View pu;
    private boolean pz;
    private final Runnable rl;
    private boolean rt;
    private final AtomicBoolean sk;
    private final AtomicBoolean swd;
    private ViewGroup sy;
    private String tpx;

    /* renamed from: ue, reason: collision with root package name */
    private boolean f25794ue;
    protected final gzw uef;
    protected boolean wk;
    protected String wrv;
    protected RelativeLayout xs;
    protected FrameLayout yo;
    protected ImageView zjm;
    private static final Integer orq = 0;
    private static final Integer gzw = 1;

    public interface oa {
        void uef(boolean z2, long j8, long j10, long j11, boolean z10);
    }

    public interface uef {
        void uef(View view, int i5);
    }

    public ivm(Context context, gzw gzwVar, boolean z2, xs xsVar) {
        this(context, gzwVar, z2, "embeded_ad", false, false, xsVar);
    }

    private void cp() {
        if (this.f25793oa == null || dxx()) {
            return;
        }
        if ((!rt() || com.bytedance.sdk.openadsdk.oib.moa.uef.uef("sp_multi_native_video_data", "key_video_is_update_flag", false)) && rt()) {
            long jCz = this.f25793oa.cz();
            long jXs = this.f25793oa.xs() + jCz;
            boolean zUef = com.bytedance.sdk.openadsdk.oib.moa.uef.uef("sp_multi_native_video_data", "key_native_video_complete", false);
            long jUef = com.bytedance.sdk.openadsdk.oib.moa.uef.uef("sp_multi_native_video_data", "key_video_current_play_position", 0L);
            long jUef2 = com.bytedance.sdk.openadsdk.oib.moa.uef.uef("sp_multi_native_video_data", "key_video_total_play_duration", jXs);
            long jUef3 = com.bytedance.sdk.openadsdk.oib.moa.uef.uef("sp_multi_native_video_data", "key_video_duration", jCz);
            com.bytedance.sdk.openadsdk.oib.moa.uef.uef("sp_multi_native_video_data", "key_video_is_update_flag", Boolean.FALSE);
            this.f25793oa.oa(zUef);
            this.f25793oa.oa(jUef);
            this.f25793oa.yo(jUef2);
            this.f25793oa.moa(jUef3);
        }
    }

    private void dhk() {
        yo yoVar = this.f25793oa;
        if (yoVar == null) {
            return;
        }
        yoVar.moa(this.oib);
        this.f25793oa.uef((yo.uef) this);
        this.f25793oa.uef((yo.uef) this);
    }

    private boolean dxx() {
        return this.dhk;
    }

    private boolean fz() {
        return 5 == sy.moa().oa(this.uef.jnk());
    }

    private boolean gr() {
        if (dxx() || !rt()) {
            return false;
        }
        return com.bytedance.sdk.openadsdk.oib.moa.uef.uef("sp_multi_native_video_data", "key_video_is_from_detail_page", false) || com.bytedance.sdk.openadsdk.oib.moa.uef.uef("sp_multi_native_video_data", "key_video_isfromvideodetailpage", false);
    }

    private void gsd() {
        this.dxx = wrv();
        km.uef(this.rl);
    }

    private void gzw() {
        if (!this.sk.get()) {
            this.sk.set(true);
            yo yoVar = this.f25793oa;
            if (yoVar != null) {
                yoVar.uef(true, 3);
            }
        }
        this.swd.set(false);
    }

    private boolean ku() {
        return 2 == sy.moa().oa(this.uef.jnk());
    }

    private void lw() {
        addView(uef(this.bs));
        oib();
        addOnAttachStateChangeListener(new View.OnAttachStateChangeListener() { // from class: com.bytedance.sdk.openadsdk.core.wk.oa.ivm.1
            @Override // android.view.View.OnAttachStateChangeListener
            public void onViewAttachedToWindow(View view) {
                ivm.this.sy();
            }

            @Override // android.view.View.OnAttachStateChangeListener
            public void onViewDetachedFromWindow(View view) {
                ivm.this.sy();
            }
        });
    }

    private void lz() {
        af.lw(this.cz);
        af.lw(this.xs);
    }

    private void moa() {
        uef(0L, 0);
        this.gb = null;
    }

    private void oib() {
        this.f25793oa = new yo(this.bs, this.yo, this.uef, this.wrv, !dxx(), this.gr, this.f25794ue, this.ivm);
        dhk();
        if (this.af == null) {
            this.af = new ViewTreeObserver.OnGlobalLayoutListener() { // from class: com.bytedance.sdk.openadsdk.core.wk.oa.ivm.3
                @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
                public void onGlobalLayout() {
                    ivm ivmVar;
                    yo yoVar;
                    if (ivm.this.sy == null || ivm.this.sy.getViewTreeObserver() == null || (yoVar = (ivmVar = ivm.this).f25793oa) == null) {
                        return;
                    }
                    yoVar.uef(ivmVar.sy.getWidth(), ivm.this.sy.getHeight());
                    ivm.this.sy.getViewTreeObserver().removeOnGlobalLayoutListener(this);
                    ivm.this.af = null;
                }
            };
            this.sy.getViewTreeObserver().addOnGlobalLayoutListener(this.af);
        }
    }

    private void orq() {
        this.f25792ab = null;
        if ((this.f25793oa instanceof yo) && !dxx()) {
            this.f25793oa.oyt();
        }
        dj();
        uef(false);
        gzw();
    }

    private void pz() {
        this.fz.removeMessages(1);
        wk.yo().removeCallbacks(this.rl);
    }

    private boolean rt() {
        gzw gzwVar = this.uef;
        if (gzwVar == null) {
            return false;
        }
        return gzwVar.hnd();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void sy() {
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        Handler handler = this.fz;
        if (handler == null || jElapsedRealtime - this.lz <= 500) {
            return;
        }
        this.lz = jElapsedRealtime;
        handler.sendEmptyMessageDelayed(1, 500L);
    }

    private void tpx() {
        yo yoVar = this.f25793oa;
        if (yoVar == null) {
            oib();
        } else if ((yoVar instanceof yo) && !dxx()) {
            this.f25793oa.ab();
        }
        if (this.f25793oa == null || !this.sk.get()) {
            return;
        }
        this.sk.set(false);
        oa();
        if (!bcc()) {
            if (this.f25793oa.cq()) {
                this.f25793oa.cq();
                oa(true);
                return;
            } else {
                xs();
                af.uef((View) this.xs, 0);
                return;
            }
        }
        af.uef((View) this.xs, 8);
        ImageView imageView = this.cz;
        if (imageView != null) {
            af.uef((View) imageView, 8);
        }
        gzw gzwVar = this.uef;
        if (gzwVar == null || gzwVar.nj() == null) {
            return;
        }
        com.bytedance.sdk.openadsdk.core.wk.uef.oa oaVarUef = gzw.uef(CacheDirFactory.getICacheDir(this.uef.wg()).yo(), this.uef);
        oaVarUef.oa(this.uef.iou());
        oaVarUef.oa(this.sy.getWidth());
        oaVarUef.yo(this.sy.getHeight());
        oaVarUef.yo(this.uef.em());
        oaVarUef.uef(0L);
        oaVarUef.uef(cz());
        uef(oaVarUef);
        this.f25793oa.uef(oaVarUef);
        this.f25793oa.oa(false);
    }

    private void ue() {
        if (dxx() || !rt()) {
            return;
        }
        Boolean bool = Boolean.FALSE;
        com.bytedance.sdk.openadsdk.oib.moa.uef.uef("sp_multi_native_video_data", "key_video_isfromvideodetailpage", bool);
        com.bytedance.sdk.openadsdk.oib.moa.uef.uef("sp_multi_native_video_data", "key_video_is_from_detail_page", bool);
    }

    public void ab() {
        com.bytedance.sdk.openadsdk.core.model.moa moaVarOdd;
        com.bytedance.sdk.openadsdk.core.dz.moa moaVarUef;
        gzw gzwVar = this.uef;
        if (gzwVar == null || (moaVarOdd = gzwVar.odd()) == null || (moaVarUef = moaVarOdd.uef()) == null) {
            return;
        }
        moaVarUef.lw(this.cp);
    }

    public boolean bcc() {
        return this.oib;
    }

    public boolean cq() {
        boolean z2 = false;
        if (com.bytedance.sdk.component.utils.sy.yo(sy.uef()) == 0) {
            return false;
        }
        if (this.f25793oa.dj() != null && this.f25793oa.dj().ivm()) {
            uef(false, orq.intValue());
            Handler handler = this.fz;
            z2 = true;
            if (handler != null) {
                handler.removeMessages(1);
            }
        }
        return z2;
    }

    public boolean cz() {
        return this.moa;
    }

    public void dj() {
        lw lwVarWrv;
        yo yoVar = this.f25793oa;
        if (yoVar == null || (lwVarWrv = yoVar.wrv()) == null) {
            return;
        }
        lwVarWrv.uef();
        View viewYo = lwVarWrv.yo();
        if (viewYo != null) {
            viewYo.setVisibility(8);
            if (viewYo.getParent() != null) {
                ((ViewGroup) viewYo.getParent()).removeView(viewYo);
            }
        }
    }

    public void dz() {
        if (getNativeVideoController() == null || !(getNativeVideoController() instanceof yo)) {
            return;
        }
        yo nativeVideoController = getNativeVideoController();
        nativeVideoController.uef(nativeVideoController.wrv(), this);
    }

    public double getCurrentPlayTime() {
        if (this.f25793oa != null) {
            return (r0.ivm() * 1.0d) / 1000.0d;
        }
        return 0.0d;
    }

    public yo getNativeVideoController() {
        return this.f25793oa;
    }

    @Override // com.bytedance.sdk.openadsdk.core.wk.oa.yo.uef
    public void ivm() {
        yo.InterfaceC0033yo interfaceC0033yo = this.gb;
        if (interfaceC0033yo != null) {
            interfaceC0033yo.h_();
        }
    }

    @Override // com.bykv.vk.openvk.uef.uef.uef.moa.yo.uef
    public void oa(long j8, int i5) {
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        tpx();
        if (this.wk) {
            getViewTreeObserver().addOnScrollChangedListener(this.gem);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        orq();
        if (this.wk) {
            ViewTreeObserver viewTreeObserver = getViewTreeObserver();
            if (viewTreeObserver.isAlive()) {
                viewTreeObserver.removeOnScrollChangedListener(this.gem);
            }
            ViewGroup viewGroup = this.sy;
            if (viewGroup == null || this.af == null) {
                return;
            }
            ViewTreeObserver viewTreeObserver2 = viewGroup.getViewTreeObserver();
            if (viewTreeObserver2.isAlive()) {
                viewTreeObserver2.removeOnGlobalLayoutListener(this.af);
                this.af = null;
            }
        }
    }

    @Override // android.view.View
    public void onFinishTemporaryDetach() {
        super.onFinishTemporaryDetach();
        tpx();
    }

    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        oa oaVar;
        yo yoVar;
        if (!this.dhk && (oaVar = this.f25792ab) != null && (yoVar = this.f25793oa) != null) {
            oaVar.uef(yoVar.cq(), this.f25793oa.cz(), this.f25793oa.dxx(), this.f25793oa.ivm(), this.oib);
        }
        return super.onInterceptTouchEvent(motionEvent);
    }

    @Override // android.view.View
    public void onStartTemporaryDetach() {
        super.onStartTemporaryDetach();
        orq();
    }

    @Override // android.view.View
    public void onWindowFocusChanged(boolean z2) {
        yo yoVar;
        yo yoVar2;
        yo yoVar3;
        yo yoVar4;
        if ("open_ad".equals(this.wrv)) {
            pz();
            return;
        }
        this.rt = z2;
        super.onWindowFocusChanged(z2);
        com.bytedance.sdk.openadsdk.gsd.uef.yo.uef(this.uef, z2);
        cp();
        if (this.wk) {
            if (gr() && (yoVar4 = this.f25793oa) != null && yoVar4.cq()) {
                ue();
                af.uef((View) this.xs, 8);
                oa(true);
                moa();
                return;
            }
            oa();
            if (!dxx() && bcc() && (yoVar2 = this.f25793oa) != null && !yoVar2.gzw()) {
                if (this.fz != null) {
                    if (z2 && (yoVar3 = this.f25793oa) != null && !yoVar3.cq()) {
                        this.fz.obtainMessage(1).sendToTarget();
                        return;
                    } else {
                        pz();
                        uef(false, orq.intValue());
                        return;
                    }
                }
                return;
            }
            if (bcc()) {
                return;
            }
            if (!z2 && (yoVar = this.f25793oa) != null && yoVar.dj() != null && this.f25793oa.dj().ivm()) {
                pz();
                uef(false, orq.intValue());
            } else if (z2) {
                this.fz.obtainMessage(1).sendToTarget();
            }
        }
    }

    @Override // android.view.View
    public void onWindowVisibilityChanged(int i5) {
        yo yoVar;
        gzw gzwVar;
        yo yoVar2;
        yo yoVar3;
        super.onWindowVisibilityChanged(i5);
        cp();
        if (gr() && (yoVar3 = this.f25793oa) != null && yoVar3.cq()) {
            ue();
            af.uef((View) this.xs, 8);
            oa(true);
            moa();
            return;
        }
        oa();
        if (dxx() || !bcc() || (yoVar = this.f25793oa) == null || yoVar.gzw() || (gzwVar = this.uef) == null) {
            return;
        }
        if (this.pz && gzwVar.nj() != null) {
            this.uef.nj();
            com.bytedance.sdk.openadsdk.core.wk.uef.oa oaVarUef = gzw.uef(CacheDirFactory.getICacheDir(this.uef.wg()).yo(), this.uef);
            oaVarUef.oa(this.uef.iou());
            oaVarUef.oa(this.sy.getWidth());
            oaVarUef.yo(this.sy.getHeight());
            oaVarUef.yo(this.uef.em());
            oaVarUef.uef(this.cp);
            oaVarUef.uef(cz());
            uef(oaVarUef);
            this.f25793oa.uef(oaVarUef);
            this.pz = false;
            af.uef((View) this.xs, 8);
        }
        if (i5 != 0 || !this.wk || this.fz == null || (yoVar2 = this.f25793oa) == null || yoVar2.cq()) {
            return;
        }
        this.fz.obtainMessage(1).sendToTarget();
    }

    public void setAdCreativeClickListener(uef uefVar) {
        yo yoVar = this.f25793oa;
        if (yoVar != null) {
            yoVar.uef(uefVar);
        }
    }

    public void setControllerStatusCallBack(oa oaVar) {
        this.f25792ab = oaVar;
    }

    public void setIsAutoPlay(boolean z2) {
        if (this.oyt) {
            return;
        }
        int iOa = sy.moa().oa(this.uef.jnk());
        if (z2 && iOa != 4 && (!com.bytedance.sdk.component.utils.sy.lw(this.bs) ? !(!com.bytedance.sdk.component.utils.sy.ivm(this.bs) ? com.bytedance.sdk.component.utils.sy.moa(this.bs) : ku() || fz()) : !ku())) {
            z2 = false;
        }
        this.oib = z2;
        yo yoVar = this.f25793oa;
        if (yoVar != null) {
            yoVar.moa(z2);
        }
        if (this.oib) {
            af.uef((View) this.xs, 8);
        } else {
            xs();
            RelativeLayout relativeLayout = this.xs;
            if (relativeLayout != null) {
                af.uef((View) relativeLayout, 0);
                gzw gzwVar = this.uef;
                if (gzwVar != null && gzwVar.nj() != null) {
                    com.bytedance.sdk.openadsdk.dhk.oa.oa().uef(this.uef.nj().zjm(), this.uef.nj().yo(), this.uef.nj().oa(), this.bcc, this.uef);
                }
            }
        }
        this.oyt = true;
    }

    public void setNeedNativeVideoPlayBtnVisible(boolean z2) {
        this.dj = z2;
    }

    public void setNeedSelfManagerVideo(boolean z2) {
        this.wk = z2;
    }

    public void setVideoAdClickListenerTTNativeAd(PAGNativeAd pAGNativeAd) {
        yo yoVar = this.f25793oa;
        if (yoVar != null) {
            yoVar.uef(pAGNativeAd);
        }
    }

    public void setVideoAdInteractionListener(yo.InterfaceC0033yo interfaceC0033yo) {
        this.gb = interfaceC0033yo;
    }

    public void setVideoAdLoadListener(yo.moa moaVar) {
        yo yoVar = this.f25793oa;
        if (yoVar != null) {
            yoVar.uef(moaVar);
        }
    }

    public void setVideoCacheUrl(String str) {
        this.tpx = str;
    }

    public void setVideoPlayCallback(com.bytedance.sdk.openadsdk.core.wk.oa.oa oaVar) {
        yo yoVar = this.f25793oa;
        if (yoVar != null) {
            yoVar.uef(oaVar);
        }
    }

    @Override // android.view.View
    public void setVisibility(int i5) {
        super.setVisibility(i5);
        if (i5 == 4 || i5 == 8) {
            gzw();
        }
    }

    @Override // com.bykv.vk.openvk.uef.uef.uef.moa.yo.uef
    public void uef() {
    }

    public void wk() {
        if (com.bytedance.sdk.component.utils.sy.yo(sy.uef()) != 0 && wrv()) {
            if (this.f25793oa.dj() != null) {
                if (this.f25793oa.dj().xs()) {
                    uef(true, gzw.intValue());
                    oa();
                    Handler handler = this.fz;
                    if (handler != null) {
                        handler.sendEmptyMessageDelayed(1, 500L);
                        return;
                    }
                    return;
                }
                if (this.f25793oa.dj().oa() && !this.wk) {
                    zjm();
                    yo yoVar = this.f25793oa;
                    if (yoVar instanceof yo) {
                        yoVar.pu();
                        return;
                    }
                    return;
                }
            }
            if (bcc() || this.swd.get()) {
                return;
            }
            this.swd.set(true);
            lz();
            gzw gzwVar = this.uef;
            if (gzwVar != null && gzwVar.nj() != null) {
                lz();
                this.uef.nj();
                com.bytedance.sdk.openadsdk.core.wk.uef.oa oaVarUef = gzw.uef(CacheDirFactory.getICacheDir(this.uef.wg()).yo(), this.uef);
                oaVarUef.oa(this.uef.iou());
                oaVarUef.oa(this.sy.getWidth());
                oaVarUef.yo(this.sy.getHeight());
                oaVarUef.yo(this.uef.em());
                oaVarUef.uef(this.cp);
                oaVarUef.uef(cz());
                oaVarUef.uef(CacheDirFactory.getICacheDir(this.uef.wg()).yo());
                uef(oaVarUef);
                this.f25793oa.uef(oaVarUef);
            }
            Handler handler2 = this.fz;
            if (handler2 != null) {
                handler2.sendEmptyMessageDelayed(1, 500L);
            }
            uef(false);
        }
    }

    public boolean wrv() {
        return com.bytedance.sdk.openadsdk.core.km.uef(this, 50, com.bytedance.sdk.openadsdk.core.zjm.ue.oa(this.wrv) ? 1 : 5, false);
    }

    public void xs() {
        View view;
        if (this.bs == null || (view = this.pu) == null || view.getParent() == null || this.uef == null || this.xs != null) {
            return;
        }
        ViewParent parent = this.pu.getParent();
        RelativeLayout relativeLayoutOa = oa(this.bs);
        if (parent != null && (parent instanceof ViewGroup)) {
            uef(relativeLayoutOa, (ViewGroup) parent, this.pu);
        }
        this.xs = relativeLayoutOa;
        if (this.dj) {
            af.uef((View) this.zjm, 0);
        }
        if (this.uef.nj() != null && this.uef.nj().zjm() != null) {
            com.bytedance.sdk.openadsdk.dhk.oa.oa().uef(this.uef.nj().zjm(), this.uef.nj().yo(), this.uef.nj().oa(), this.bcc, this.uef);
        }
        ImageView imageView = this.zjm;
        if (imageView != null) {
            imageView.setClickable(true);
            this.zjm.setOnClickListener(new View.OnClickListener() { // from class: com.bytedance.sdk.openadsdk.core.wk.oa.ivm.2
                @Override // android.view.View.OnClickListener
                public void onClick(View view2) {
                    ivm.this.yo();
                }
            });
        }
    }

    public void zjm() {
        yo yoVar = this.f25793oa;
        if (yoVar != null) {
            lw lwVarWrv = yoVar.wrv();
            if (lwVarWrv != null) {
                lwVarWrv.uef();
            }
            lz();
        }
    }

    public ivm(Context context, gzw gzwVar, String str, boolean z2, boolean z10, xs xsVar) {
        this(context, gzwVar, false, str, z2, z10, xsVar);
    }

    public void yo() {
        if (cq()) {
            return;
        }
        wk();
    }

    public ivm(Context context, gzw gzwVar, xs xsVar) {
        this(context, gzwVar, false, xsVar);
    }

    public void oa() {
        gzw gzwVar = this.uef;
        if (gzwVar == null) {
            return;
        }
        int iJnk = gzwVar.jnk();
        int iOa = sy.moa().oa(iJnk);
        int iYo = com.bytedance.sdk.component.utils.sy.yo(sy.uef());
        if (iOa == 1) {
            this.oib = gb.moa(iYo);
        } else if (iOa == 2) {
            this.oib = gb.lw(iYo) || gb.moa(iYo) || gb.ivm(iYo);
        } else if (iOa == 3) {
            this.oib = false;
        } else if (iOa == 4) {
            this.dz = true;
        } else if (iOa == 5) {
            this.oib = gb.moa(iYo) || gb.ivm(iYo);
        }
        if (!this.dhk) {
            if (!this.lw || !com.bytedance.sdk.openadsdk.core.zjm.ue.oa(this.wrv)) {
                this.moa = sy.moa().yo(String.valueOf(iJnk));
            }
        } else {
            this.moa = false;
        }
        if ("open_ad".equals(this.wrv)) {
            this.oib = true;
            this.moa = true;
        }
        if (com.bytedance.sdk.openadsdk.core.zjm.ue.oa(this.wrv)) {
            this.moa = true;
        }
        yo yoVar = this.f25793oa;
        if (yoVar != null) {
            yoVar.moa(this.oib);
        }
        this.lw = true;
    }

    public ivm(Context context, gzw gzwVar, boolean z2, String str, boolean z10, boolean z11, xs xsVar) {
        super(context);
        this.oib = true;
        this.moa = true;
        this.dhk = false;
        this.lw = false;
        this.rt = true;
        this.gr = false;
        this.f25794ue = true;
        this.dj = true;
        this.wrv = "embeded_ad";
        this.cq = 50;
        this.pz = true;
        this.ku = false;
        this.fz = new ue(wk.oa().getLooper(), this);
        this.oyt = false;
        this.km = Build.MODEL;
        this.dz = false;
        this.wk = true;
        this.sk = new AtomicBoolean(false);
        this.rl = new Runnable() { // from class: com.bytedance.sdk.openadsdk.core.wk.oa.ivm.4
            @Override // java.lang.Runnable
            public void run() {
                ivm ivmVar = ivm.this;
                ivmVar.uef(ivmVar.dxx, ivm.orq.intValue());
            }
        };
        this.swd = new AtomicBoolean(false);
        this.gem = new ViewTreeObserver.OnScrollChangedListener() { // from class: com.bytedance.sdk.openadsdk.core.wk.oa.ivm.6
            @Override // android.view.ViewTreeObserver.OnScrollChangedListener
            public void onScrollChanged() {
                ivm.this.sy();
            }
        };
        try {
            if (gzwVar.sjj()) {
                this.gsd = CacheDirFactory.getICacheDir(0).oa();
            }
        } catch (Throwable unused) {
        }
        if (xsVar != null) {
            this.ivm = xsVar;
        }
        this.wrv = str;
        this.bs = context;
        this.uef = gzwVar;
        this.dhk = z2;
        setContentDescription("NativeVideoTsView");
        this.gr = z10;
        this.f25794ue = z11;
        oa();
        lw();
    }

    @Override // com.bykv.vk.openvk.uef.uef.uef.moa.yo.uef
    public void uef(long j8, int i5) {
        yo.InterfaceC0033yo interfaceC0033yo = this.gb;
        if (interfaceC0033yo != null) {
            interfaceC0033yo.k_();
        }
    }

    @Override // com.bykv.vk.openvk.uef.uef.uef.moa.yo.uef
    public void uef(long j8, long j10) {
        yo.InterfaceC0033yo interfaceC0033yo = this.gb;
        if (interfaceC0033yo != null) {
            interfaceC0033yo.uef(j8, j10);
        }
    }

    private View uef(Context context) {
        FrameLayout frameLayout = new FrameLayout(context);
        new FrameLayout.LayoutParams(-1, -1).gravity = 17;
        frameLayout.setVisibility(8);
        this.sy = frameLayout;
        FrameLayout frameLayout2 = new FrameLayout(context);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -1);
        layoutParams.gravity = 17;
        frameLayout2.setLayoutParams(layoutParams);
        frameLayout.addView(frameLayout2);
        this.yo = frameLayout2;
        View view = new View(context);
        view.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
        frameLayout.addView(view);
        this.pu = view;
        return frameLayout;
    }

    private RelativeLayout oa(Context context) {
        com.bytedance.sdk.openadsdk.core.ivm.xs xsVar = new com.bytedance.sdk.openadsdk.core.ivm.xs(context);
        xsVar.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
        xsVar.setVisibility(8);
        com.bytedance.sdk.openadsdk.core.ivm.moa moaVar = new com.bytedance.sdk.openadsdk.core.ivm.moa(context);
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, -1);
        layoutParams.addRule(13);
        moaVar.setLayoutParams(layoutParams);
        moaVar.setScaleType(ImageView.ScaleType.CENTER_CROP);
        this.bcc = moaVar;
        com.bytedance.sdk.openadsdk.core.ivm.moa moaVar2 = new com.bytedance.sdk.openadsdk.core.ivm.moa(context);
        RelativeLayout.LayoutParams layoutParams2 = new RelativeLayout.LayoutParams(-2, -2);
        layoutParams2.addRule(13);
        moaVar2.setLayoutParams(layoutParams2);
        moaVar2.setVisibility(8);
        moaVar2.setBackground(orq.yo(context, "tt_new_play_video"));
        this.zjm = moaVar2;
        xsVar.addView(moaVar);
        xsVar.addView(moaVar2);
        return xsVar;
    }

    private void uef(View view, ViewGroup viewGroup, View view2) {
        int iIndexOfChild = viewGroup.indexOfChild(view2);
        viewGroup.removeViewInLayout(view2);
        ViewGroup.LayoutParams layoutParams = view2.getLayoutParams();
        if (layoutParams != null) {
            viewGroup.addView(view, iIndexOfChild, layoutParams);
        } else {
            viewGroup.addView(view, iIndexOfChild);
        }
    }

    public boolean uef(long j8, boolean z2, boolean z10) {
        boolean zUef = false;
        this.sy.setVisibility(0);
        this.cp = j8;
        if (!dxx()) {
            return true;
        }
        this.f25793oa.uef(false);
        gzw gzwVar = this.uef;
        if (gzwVar != null && gzwVar.nj() != null) {
            com.bytedance.sdk.openadsdk.core.wk.uef.oa oaVarUef = gzw.uef(CacheDirFactory.getICacheDir(this.uef.wg()).yo(), this.uef);
            oaVarUef.oa(this.uef.iou());
            oaVarUef.oa(this.sy.getWidth());
            oaVarUef.yo(this.sy.getHeight());
            oaVarUef.yo(this.uef.em());
            oaVarUef.uef(j8);
            oaVarUef.uef(cz());
            uef(oaVarUef);
            if (z10) {
                this.f25793oa.oa(oaVarUef);
                return true;
            }
            zUef = this.f25793oa.uef(oaVarUef);
        }
        if (((j8 > 0 && !z2 && !z10) || (j8 > 0 && z2)) && this.f25793oa != null) {
            wk.uef uefVar = new wk.uef();
            uefVar.oa(this.f25793oa.ivm());
            uefVar.moa(this.f25793oa.cz());
            uefVar.yo(this.f25793oa.xs());
            com.bytedance.sdk.openadsdk.moa.lw.uef.uef.oa(this.f25793oa.wrv(), uefVar);
        }
        return zUef;
    }

    public void oa(boolean z2) {
        yo yoVar = this.f25793oa;
        if (yoVar != null) {
            yoVar.oa(z2);
            lw lwVarWrv = this.f25793oa.wrv();
            if (lwVarWrv != null) {
                lwVarWrv.oa();
                View viewYo = lwVarWrv.yo();
                if (viewYo != null) {
                    if (viewYo.getParent() != null) {
                        ((ViewGroup) viewYo.getParent()).removeView(viewYo);
                    }
                    viewYo.setVisibility(0);
                    addView(viewYo);
                    lwVarWrv.uef((lw) this.uef, new WeakReference<>(this.bs), false);
                }
            }
        }
    }

    @Override // com.bytedance.sdk.component.utils.ue.uef
    public void uef(Message message) {
        if (message.what == 1) {
            gsd();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void uef(boolean z2, int i5) {
        if (this.uef == null || this.f25793oa == null) {
            return;
        }
        boolean zGr = gr();
        ue();
        if (zGr && this.f25793oa.cq()) {
            this.f25793oa.cq();
            oa(true);
            moa();
            return;
        }
        if (z2 && this.rt && !this.f25793oa.cq() && !this.f25793oa.gzw()) {
            if (this.f25793oa.dj() != null && this.f25793oa.dj().xs()) {
                if (this.oib || i5 == 1) {
                    yo yoVar = this.f25793oa;
                    if (yoVar != null) {
                        uef(yoVar.gsd(), "changeVideoStatus");
                    }
                    if ("ALP-AL00".equals(this.km)) {
                        this.f25793oa.yo();
                    } else {
                        if (!zjm.oa().dz()) {
                            zGr = true;
                        }
                        this.f25793oa.xs(zGr);
                    }
                    uef(false);
                    yo.InterfaceC0033yo interfaceC0033yo = this.gb;
                    if (interfaceC0033yo != null) {
                        interfaceC0033yo.j_();
                        return;
                    }
                    return;
                }
                return;
            }
            if (this.oib && this.f25793oa.dj() == null) {
                if (!this.sk.get()) {
                    this.sk.set(true);
                }
                this.swd.set(false);
                tpx();
                return;
            }
            return;
        }
        if (this.f25793oa.dj() == null || !this.f25793oa.dj().ivm()) {
            return;
        }
        this.f25793oa.oa();
        uef(true);
        yo.InterfaceC0033yo interfaceC0033yo2 = this.gb;
        if (interfaceC0033yo2 != null) {
            interfaceC0033yo2.i_();
        }
    }

    public void uef(boolean z2, String str) {
        if (com.bytedance.sdk.openadsdk.core.zjm.ue.oa(this.wrv)) {
            z2 = true;
        }
        this.moa = z2;
        yo yoVar = this.f25793oa;
        if (yoVar != null) {
            yoVar.uef(z2, str);
        }
    }

    @Override // com.bytedance.sdk.openadsdk.core.wk.oa.yo.uef
    public void uef(int i5) {
        oa();
    }

    public void uef(boolean z2) {
        if (this.cz == null) {
            ImageView imageView = new ImageView(getContext());
            this.cz = imageView;
            imageView.setImageResource(orq.moa(sy.uef(), "tt_new_play_video"));
            this.cz.setScaleType(ImageView.ScaleType.FIT_XY);
            int iOa = af.oa(getContext(), this.cq);
            int iOa2 = af.oa(getContext(), 10.0f);
            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(iOa, iOa);
            layoutParams.gravity = 17;
            layoutParams.rightMargin = iOa2;
            layoutParams.bottomMargin = iOa2;
            this.sy.addView(this.cz, layoutParams);
            this.cz.setOnClickListener(new View.OnClickListener() { // from class: com.bytedance.sdk.openadsdk.core.wk.oa.ivm.5
                @Override // android.view.View.OnClickListener
                public void onClick(View view) {
                    ivm.this.wk();
                }
            });
        }
        if (z2) {
            this.cz.setVisibility(0);
        } else {
            this.cz.setVisibility(8);
        }
    }

    public com.bytedance.sdk.openadsdk.core.dz.ivm uef(List<Pair<View, FriendlyObstructionPurpose>> list) {
        yo yoVar = this.f25793oa;
        if (yoVar instanceof yo) {
            return yoVar.uef(this, list);
        }
        return null;
    }

    private void uef(com.bykv.vk.openvk.uef.uef.uef.yo.yo yoVar) {
        try {
            if (this.uef.sjj()) {
                yoVar.uef(this.gsd);
            }
        } catch (Throwable unused) {
        }
    }
}
