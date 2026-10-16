package com.bytedance.sdk.openadsdk.activity.single;

import android.app.Activity;
import android.content.Context;
import android.graphics.Color;
import android.graphics.Rect;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.D;
import androidx.recyclerview.widget.I;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.Q;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.j0;
import androidx.recyclerview.widget.m0;
import com.bytedance.sdk.component.utils.dhk;
import com.bytedance.sdk.component.utils.orq;
import com.bytedance.sdk.openadsdk.AdSlot;
import com.bytedance.sdk.openadsdk.CacheDirFactory;
import com.bytedance.sdk.openadsdk.activity.single.oa;
import com.bytedance.sdk.openadsdk.component.reward.top.TopLayoutDislike2;
import com.bytedance.sdk.openadsdk.component.reward.uef.wrv;
import com.bytedance.sdk.openadsdk.core.model.cp;
import com.bytedance.sdk.openadsdk.core.model.dxx;
import com.bytedance.sdk.openadsdk.core.model.gzw;
import com.bytedance.sdk.openadsdk.core.model.rt;
import com.bytedance.sdk.openadsdk.core.model.ue;
import com.bytedance.sdk.openadsdk.core.sy;
import com.bytedance.sdk.openadsdk.core.widget.PAGLogoView;
import com.bytedance.sdk.openadsdk.core.wk;
import com.bytedance.sdk.openadsdk.utils.af;
import com.bytedance.sdk.openadsdk.utils.km;
import com.google.android.gms.common.api.f;
import com.unity3d.services.UnityAdsConstants;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public class moa extends com.bytedance.sdk.openadsdk.activity.single.yo implements Handler.Callback {

    /* renamed from: ab, reason: collision with root package name */
    private final boolean f25236ab;
    private int af;
    private JSONObject au;
    private final LinearLayoutManager bcc;
    private final HashSet<Integer> bs;
    private JSONObject cop;
    private boolean cp;
    private final AtomicBoolean cq;
    private final TopLayoutDislike2 cz;
    private final boolean dhk;
    private final FrameLayout dj;
    private long dor;
    private boolean dv;
    private oa.lw dxx;
    private final HashSet<String> dz;
    private long etd;
    private bcc fz;
    private rt.uef gb;
    private boolean gem;
    private boolean gr;
    private boolean gsd;
    private int gzw;

    /* renamed from: hg, reason: collision with root package name */
    private long f25237hg;
    private boolean hts;
    private final RecyclerView ivm;
    private com.bytedance.sdk.openadsdk.activity.single.lw km;
    private int ku;
    private int lz;
    private ivm nkh;
    private final ArrayList<Message> oib;
    private int orq;
    private boolean ou;
    private int oyt;
    private boolean pu;
    private boolean pz;
    private boolean rj;
    private boolean rl;
    private int rt;
    private JSONObject sk;
    private FrameLayout swd;
    private final PAGLogoView sy;
    private boolean tpx;

    /* renamed from: ue, reason: collision with root package name */
    private int f25238ue;
    private boolean uqx;
    private View vyg;
    private final boolean wk;
    private final boolean wrv;
    private boolean wxf;
    private final uef xs;
    private final Handler zjm;
    private Message zou;

    public static abstract class ivm implements Runnable {
        private long lw;
        private long moa;

        /* renamed from: oa, reason: collision with root package name */
        private final long f25248oa;
        private final Handler uef = new Handler(Looper.getMainLooper());
        private long yo;

        public ivm(long j8) {
            this.f25248oa = j8;
        }

        public long ivm() {
            long jElapsedRealtime;
            long j8;
            if (this.yo > this.lw) {
                jElapsedRealtime = this.f25248oa - (SystemClock.elapsedRealtime() - this.yo);
                j8 = this.moa;
            } else {
                jElapsedRealtime = this.f25248oa;
                j8 = this.moa;
            }
            long j10 = jElapsedRealtime - j8;
            if (j10 < 0) {
                return 0L;
            }
            return j10;
        }

        public void lw() {
            this.uef.postDelayed(this, this.f25248oa);
            this.yo = SystemClock.elapsedRealtime();
        }

        public void moa() {
            this.uef.removeCallbacks(this);
        }

        public void oa() {
            this.uef.removeCallbacks(this);
            if (this.lw > this.yo) {
                return;
            }
            this.moa = (SystemClock.elapsedRealtime() - this.yo) + this.moa;
            this.lw = SystemClock.elapsedRealtime();
        }

        @Override // java.lang.Runnable
        public void run() {
            uef();
        }

        public abstract void uef();

        public void yo() {
            long j8 = this.f25248oa - this.moa;
            if (j8 < 0) {
                return;
            }
            this.uef.removeCallbacks(this);
            this.uef.postDelayed(this, j8);
            this.yo = SystemClock.elapsedRealtime();
        }
    }

    public static abstract class lw extends m0 {
        public lw(View view) {
            super(view);
        }

        public abstract void uef(moa moaVar, C0074moa c0074moa, int i5);
    }

    public static class oa extends lw {

        /* renamed from: oa, reason: collision with root package name */
        private final com.bytedance.sdk.openadsdk.component.reward.view.oa f25250oa;
        private final uef uef;
        private com.bytedance.sdk.openadsdk.activity.single.uef yo;

        public oa(uef uefVar, View view) {
            super(view);
            this.uef = uefVar;
            this.f25250oa = (com.bytedance.sdk.openadsdk.component.reward.view.oa) view;
        }

        public bcc uef() {
            return this.yo;
        }

        @Override // com.bytedance.sdk.openadsdk.activity.single.moa.lw
        public void uef(moa moaVar, C0074moa c0074moa, int i5) {
            int bindingAdapterPosition = getBindingAdapterPosition();
            Activity activity = moaVar.uef;
            if (com.bytedance.sdk.component.utils.oa.uef(activity)) {
                return;
            }
            gzw gzwVar = c0074moa.f25249oa;
            com.bytedance.sdk.openadsdk.activity.single.uef uefVar = this.yo;
            if (uefVar != null) {
                if (uef(uefVar, gzwVar)) {
                    this.yo.uef(gzwVar, bindingAdapterPosition, i5);
                } else {
                    this.uef.uef(this, false);
                }
            }
            com.bytedance.sdk.openadsdk.activity.single.oa oaVar = moaVar.moa;
            if (this.yo == null) {
                this.yo = gzwVar.nyn() ? new xs(oaVar, gzwVar, bindingAdapterPosition, i5, false) : new com.bytedance.sdk.openadsdk.activity.single.ivm(oaVar, gzwVar, bindingAdapterPosition, i5, false);
            }
            oa.lw lwVar = new oa.lw(1, null);
            lwVar.moa = moaVar.cp;
            this.yo.oa(activity, lwVar);
            this.uef.uef(this.yo);
            com.bytedance.sdk.openadsdk.component.reward.view.bcc bccVarUef = this.yo.uef();
            if (bccVarUef == null) {
                return;
            }
            ViewParent parent = bccVarUef.getParent();
            if (parent instanceof ViewGroup) {
                ((ViewGroup) parent).removeView(bccVarUef);
            }
            if (!moaVar.wk) {
                float fKnp = gzwVar.knp();
                if (fKnp > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
                    this.f25250oa.setWidthAndHeightRatio(fKnp);
                } else {
                    this.f25250oa.setWidthOrHeightInParentRatio(0.8f);
                }
            }
            this.f25250oa.uef(bccVarUef, new FrameLayout.LayoutParams(-1, -1));
            this.f25250oa.setScene(this.yo);
        }

        private boolean uef(bcc bccVar, gzw gzwVar) {
            dxx dxxVarAje;
            if (bccVar.fz() && (dxxVarAje = bccVar.ivm.aje()) != null) {
                dxx dxxVarAje2 = gzwVar.aje();
                if (TextUtils.equals(dxxVarAje.uef(), dxxVarAje2.uef()) && TextUtils.equals(dxxVarAje.oa(), dxxVarAje2.oa()) && bccVar.dxx()) {
                    return true;
                }
            }
            return false;
        }

        public void uef(boolean z2) {
            com.bytedance.sdk.openadsdk.activity.single.uef uefVar = this.yo;
            if (uefVar == null) {
                return;
            }
            uefVar.ivm(z2);
            this.yo.oib();
            if (!z2) {
                this.yo = null;
            }
            this.f25250oa.uef();
        }
    }

    public static class yo extends lw {
        private final TextView uef;

        public yo(View view) {
            super(view);
            com.bytedance.sdk.openadsdk.core.ivm.bcc bccVar = new com.bytedance.sdk.openadsdk.core.ivm.bcc(view.getContext());
            this.uef = bccVar;
            bccVar.setTextColor(Color.parseColor("#99FFFFFF"));
            bccVar.setTextSize(14.0f);
            bccVar.setGravity(17);
            bccVar.setPadding(0, 24, 0, 24);
            ((FrameLayout) view).addView(bccVar, new FrameLayout.LayoutParams(-1, -2));
        }

        @Override // com.bytedance.sdk.openadsdk.activity.single.moa.lw
        public void uef(moa moaVar, C0074moa c0074moa, int i5) {
            this.uef.setText(c0074moa.yo);
        }
    }

    public moa(final Activity activity, final gzw gzwVar, final com.bytedance.sdk.openadsdk.activity.single.oa oaVar) throws IllegalStateException {
        rt rtVarDj;
        super(activity, gzwVar, oaVar);
        this.zjm = new Handler(Looper.getMainLooper(), this);
        this.cq = new AtomicBoolean(false);
        this.dz = new HashSet<>();
        this.bs = new HashSet<>();
        this.oib = new ArrayList<>();
        this.orq = 5;
        this.gzw = 3;
        this.ku = -1;
        int i5 = 1;
        this.dxx = new oa.lw(1, null);
        boolean z2 = gzwVar.wxf() == 44;
        this.wk = z2;
        boolean zNyn = gzwVar.nyn();
        this.wrv = zNyn;
        this.f25236ab = wrv.uef(activity, gzwVar) == 1;
        com.bytedance.sdk.openadsdk.core.ivm.yo yoVar = new com.bytedance.sdk.openadsdk.core.ivm.yo(activity) { // from class: com.bytedance.sdk.openadsdk.activity.single.moa.1
            @Override // android.view.ViewGroup, android.view.View
            public boolean dispatchTouchEvent(MotionEvent motionEvent) {
                moa.this.cop = null;
                try {
                    return super.dispatchTouchEvent(motionEvent);
                } catch (Exception unused) {
                    return false;
                }
            }
        };
        this.dj = yoVar;
        if (Build.VERSION.SDK_INT >= 35) {
            yoVar.setFitsSystemWindows(true);
        }
        activity.setContentView(yoVar);
        this.lw = String.valueOf(activity.hashCode());
        com.bytedance.sdk.openadsdk.core.model.uef uefVarMoa = gzwVar.moa();
        if (uefVarMoa != null && (rtVarDj = uefVarMoa.dj()) != null) {
            this.pu = rtVarDj.wk();
            this.gb = rtVarDj.ivm();
            int iMax = Math.max(0, rtVarDj.cz());
            this.lz = iMax;
            this.oyt = iMax;
            this.pz = rtVarDj.dz();
            this.gr = rtVarDj.dj();
            this.rt = rtVarDj.bcc();
            this.sk = rtVarDj.wrv();
            this.gsd = rtVarDj.zjm();
            this.tpx = rtVarDj.uef();
            this.rl = this.rt > 0;
            this.orq = rtVarDj.moa();
            this.gzw = rtVarDj.lw();
            this.cop = rtVarDj.oa();
            this.au = rtVarDj.yo();
            if (!this.gr) {
                this.pu = false;
            }
        }
        if (zNyn) {
            this.f25238ue = (int) ((1.0f - (Math.max(0, Math.min(100, gzwVar.sw() < 0 ? sy.moa().ue(String.valueOf(gzwVar.jnk())).ivm : r3)) / 100.0f)) * this.lz);
        }
        RecyclerView recyclerView = new RecyclerView(activity);
        this.ivm = recyclerView;
        rt.uef uefVar = this.gb;
        if (uefVar != null) {
            int iYo = uefVar.yo();
            int iMoa = this.gb.moa();
            if (iYo > 0 || iMoa > 0) {
                recyclerView.setPadding(af.oa(activity, iYo), 0, af.oa(activity, iMoa), 0);
            }
            int iOa = this.gb.oa();
            int iUef = this.gb.uef();
            int iLw = this.gb.lw();
            if (iOa > 0 || iLw > 0 || iUef > 0) {
                final int iOa2 = af.oa(activity, iOa);
                final int iOa3 = af.oa(activity, iUef);
                final int iOa4 = af.oa(activity, iLw);
                recyclerView.addItemDecoration(new Q() { // from class: com.bytedance.sdk.openadsdk.activity.single.moa.11
                    @Override // androidx.recyclerview.widget.Q
                    public void getItemOffsets(Rect rect, View view, RecyclerView recyclerView2, j0 j0Var) {
                        int childAdapterPosition = recyclerView2.getChildAdapterPosition(view);
                        int itemCount = recyclerView2.getAdapter().getItemCount();
                        if (childAdapterPosition == 0) {
                            rect.top = iOa2;
                        } else {
                            rect.top = iOa4 / 2;
                        }
                        if (childAdapterPosition == itemCount - 1) {
                            rect.bottom = iOa3;
                        } else {
                            rect.bottom = iOa4 / 2;
                        }
                    }
                });
            }
        }
        yoVar.addView(recyclerView, new FrameLayout.LayoutParams(-1, -1));
        TopLayoutDislike2 topLayoutDislike2 = new TopLayoutDislike2(activity);
        this.cz = topLayoutDislike2;
        yoVar.addView(topLayoutDislike2, new FrameLayout.LayoutParams(-1, -2));
        topLayoutDislike2.load(gzwVar);
        topLayoutDislike2.setShowDislike(true);
        topLayoutDislike2.setShowSound(true);
        boolean zSy = sy.moa().sy(String.valueOf(gzwVar.jnk()));
        this.cp = zSy;
        topLayoutDislike2.setSoundMute(zSy);
        topLayoutDislike2.setListener(new com.bytedance.sdk.openadsdk.component.reward.top.oa() { // from class: com.bytedance.sdk.openadsdk.activity.single.moa.12
            @Override // com.bytedance.sdk.openadsdk.component.reward.top.oa
            public void moa(View view) {
            }

            @Override // com.bytedance.sdk.openadsdk.component.reward.top.oa
            public void oa(View view) {
                if (moa.this.fz != null) {
                    moa.this.fz.f_();
                }
            }

            @Override // com.bytedance.sdk.openadsdk.component.reward.top.oa
            public void uef(View view) {
                com.bytedance.sdk.openadsdk.core.dz.moa moaVarUef;
                gzw gzwVar2 = gzwVar;
                com.bytedance.sdk.openadsdk.moa.yo.uef("skip", gzwVar2, gzwVar2.lw(), (Map<String, Object>) null);
                com.bytedance.sdk.openadsdk.core.model.moa moaVarOdd = gzwVar.odd();
                if (moaVarOdd != null && (moaVarUef = moaVarOdd.uef()) != null) {
                    moaVarUef.ivm(0L);
                    moaVarUef.lw(0L);
                }
                moa.this.rt();
            }

            @Override // com.bytedance.sdk.openadsdk.component.reward.top.oa
            public void yo(View view) {
                oaVar.xs();
            }

            @Override // com.bytedance.sdk.openadsdk.component.reward.top.oa
            public void uef(View view, String str) {
                if (moa.this.fz != null) {
                    moa.this.fz.uef(str);
                    moa.this.cp = !r1.cp;
                }
            }
        });
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(activity, i5, z) { // from class: com.bytedance.sdk.openadsdk.activity.single.moa.13
            {
                super(i5, z);
            }

            @Override // androidx.recyclerview.widget.LinearLayoutManager
            public void calculateExtraLayoutSpace(j0 j0Var, int[] iArr) {
                super.calculateExtraLayoutSpace(j0Var, iArr);
                int height = moa.this.ivm.getHeight();
                iArr[0] = height;
                iArr[1] = height;
            }
        };
        this.bcc = linearLayoutManager;
        recyclerView.setLayoutManager(linearLayoutManager);
        uef uefVar2 = new uef(this, gzwVar.at());
        this.xs = uefVar2;
        recyclerView.setAdapter(uefVar2);
        if (!this.rl && !this.gsd) {
            uefVar2.uef(orq.uef(activity, "tt_list_end_tip"));
        }
        if (z2) {
            new D().attachToRecyclerView(recyclerView);
        } else if (this.gr) {
            new com.bytedance.sdk.openadsdk.component.reward.view.uef().attachToRecyclerView(recyclerView);
        }
        recyclerView.addOnScrollListener(new RecyclerView.OnScrollListener() { // from class: com.bytedance.sdk.openadsdk.activity.single.moa.14
            private int lw;
            private final Rect yo = new Rect();
            private int moa = -1;

            /* JADX WARN: Removed duplicated region for block: B:22:0x006d  */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            private void uef() {
                /*
                    r8 = this;
                    com.bytedance.sdk.openadsdk.activity.single.moa r0 = com.bytedance.sdk.openadsdk.activity.single.moa.this
                    boolean r0 = com.bytedance.sdk.openadsdk.activity.single.moa.lw(r0)
                    if (r0 != 0) goto La
                    goto L93
                La:
                    com.bytedance.sdk.openadsdk.activity.single.moa r0 = com.bytedance.sdk.openadsdk.activity.single.moa.this
                    com.bytedance.sdk.openadsdk.activity.single.moa$uef r0 = com.bytedance.sdk.openadsdk.activity.single.moa.ivm(r0)
                    int r0 = r0.moa()
                    if (r0 != 0) goto L18
                    goto L93
                L18:
                    com.bytedance.sdk.openadsdk.activity.single.moa r1 = com.bytedance.sdk.openadsdk.activity.single.moa.this
                    androidx.recyclerview.widget.LinearLayoutManager r1 = com.bytedance.sdk.openadsdk.activity.single.moa.xs(r1)
                    int r1 = r1.findFirstVisibleItemPosition()
                    com.bytedance.sdk.openadsdk.activity.single.moa r2 = com.bytedance.sdk.openadsdk.activity.single.moa.this
                    androidx.recyclerview.widget.LinearLayoutManager r2 = com.bytedance.sdk.openadsdk.activity.single.moa.xs(r2)
                    int r2 = r2.findLastVisibleItemPosition()
                    int r3 = r2 % r0
                    int r4 = r8.moa
                    if (r3 <= r4) goto L93
                    r3 = r1
                L33:
                    if (r3 > r2) goto L93
                    int r4 = r3 % r0
                    int r5 = r8.moa
                    if (r4 <= r5) goto L90
                    if (r3 == r1) goto L3f
                    if (r3 != r2) goto L6d
                L3f:
                    com.bytedance.sdk.openadsdk.activity.single.moa r5 = com.bytedance.sdk.openadsdk.activity.single.moa.this
                    androidx.recyclerview.widget.LinearLayoutManager r5 = com.bytedance.sdk.openadsdk.activity.single.moa.xs(r5)
                    android.view.View r5 = r5.findViewByPosition(r3)
                    if (r5 == 0) goto L6d
                    android.graphics.Rect r6 = r8.yo
                    r6.setEmpty()
                    android.graphics.Rect r6 = r8.yo
                    r5.getGlobalVisibleRect(r6)
                    int r5 = r5.getHeight()
                    if (r5 <= 0) goto L90
                    android.graphics.Rect r6 = r8.yo
                    int r6 = r6.height()
                    float r6 = (float) r6
                    r7 = 1065353216(0x3f800000, float:1.0)
                    float r6 = r6 * r7
                    float r5 = (float) r5
                    float r6 = r6 / r5
                    r5 = 1056964608(0x3f000000, float:0.5)
                    int r5 = (r6 > r5 ? 1 : (r6 == r5 ? 0 : -1))
                    if (r5 < 0) goto L90
                L6d:
                    com.bytedance.sdk.openadsdk.activity.single.moa r5 = com.bytedance.sdk.openadsdk.activity.single.moa.this
                    androidx.recyclerview.widget.RecyclerView r5 = com.bytedance.sdk.openadsdk.activity.single.moa.moa(r5)
                    androidx.recyclerview.widget.m0 r5 = r5.findViewHolderForAdapterPosition(r3)
                    boolean r6 = r5 instanceof com.bytedance.sdk.openadsdk.activity.single.moa.oa
                    if (r6 == 0) goto L8a
                    com.bytedance.sdk.openadsdk.activity.single.moa$oa r5 = (com.bytedance.sdk.openadsdk.activity.single.moa.oa) r5
                    com.bytedance.sdk.openadsdk.activity.single.uef r6 = com.bytedance.sdk.openadsdk.activity.single.moa.oa.uef(r5)
                    if (r6 == 0) goto L8a
                    com.bytedance.sdk.openadsdk.activity.single.uef r5 = com.bytedance.sdk.openadsdk.activity.single.moa.oa.uef(r5)
                    r5.hg()
                L8a:
                    int r5 = r8.moa
                    if (r4 <= r5) goto L90
                    r8.moa = r4
                L90:
                    int r3 = r3 + 1
                    goto L33
                L93:
                    return
                */
                throw new UnsupportedOperationException("Method not decompiled: com.bytedance.sdk.openadsdk.activity.single.moa.AnonymousClass14.uef():void");
            }

            @Override // androidx.recyclerview.widget.RecyclerView.OnScrollListener
            public void onScrollStateChanged(RecyclerView recyclerView2, int i10) {
                super.onScrollStateChanged(recyclerView2, i10);
                if (com.bytedance.sdk.component.utils.oa.uef(activity)) {
                    return;
                }
                int iFindFirstCompletelyVisibleItemPosition = moa.this.bcc.findFirstCompletelyVisibleItemPosition();
                moa.this.bcc.findFirstVisibleItemPosition();
                int iFindLastVisibleItemPosition = moa.this.bcc.findLastVisibleItemPosition();
                if (iFindFirstCompletelyVisibleItemPosition < 0) {
                    return;
                }
                if (i10 == 0 && iFindFirstCompletelyVisibleItemPosition != moa.this.ku) {
                    boolean z10 = iFindFirstCompletelyVisibleItemPosition == moa.this.af;
                    moa moaVar = moa.this;
                    moaVar.uef(iFindFirstCompletelyVisibleItemPosition, moaVar.pu && z10);
                    if (moa.this.pu && !z10 && moa.this.pz) {
                        moa.this.pu = false;
                    }
                    if (moa.this.nkh != null) {
                        moa.this.nkh.moa();
                        moa.this.nkh = null;
                    }
                }
                if (i10 == 0) {
                    moa.this.af = -1;
                }
                if (!moa.this.rl || moa.this.rt <= 0 || iFindLastVisibleItemPosition < moa.this.xs.uef() - moa.this.rt) {
                    return;
                }
                moa.this.orq();
            }

            @Override // androidx.recyclerview.widget.RecyclerView.OnScrollListener
            public void onScrolled(RecyclerView recyclerView2, int i10, int i11) {
                super.onScrolled(recyclerView2, i10, i11);
                if (i11 == 0 || com.bytedance.sdk.component.utils.oa.uef(activity)) {
                    return;
                }
                uef();
                int iFindLastVisibleItemPosition = moa.this.bcc.findLastVisibleItemPosition();
                if (i11 > 0 && moa.this.rl && moa.this.rt > 0 && iFindLastVisibleItemPosition >= moa.this.xs.uef() - moa.this.rt) {
                    moa.this.orq();
                }
                if (this.lw != iFindLastVisibleItemPosition) {
                    this.lw = iFindLastVisibleItemPosition;
                    if (!moa.this.bs.isEmpty() && moa.this.bs.contains(Integer.valueOf(iFindLastVisibleItemPosition))) {
                        moa.this.bs.remove(Integer.valueOf(iFindLastVisibleItemPosition));
                        m0 m0VarFindViewHolderForAdapterPosition = recyclerView2.findViewHolderForAdapterPosition(iFindLastVisibleItemPosition);
                        if (m0VarFindViewHolderForAdapterPosition instanceof oa) {
                            oa oaVar2 = (oa) m0VarFindViewHolderForAdapterPosition;
                            oaVar2.yo.lw(true);
                            oaVar2.yo.ue();
                            return;
                        }
                        return;
                    }
                    if (moa.this.rj) {
                        moa.this.rj = false;
                        m0 m0VarFindViewHolderForAdapterPosition2 = recyclerView2.findViewHolderForAdapterPosition(iFindLastVisibleItemPosition);
                        if (m0VarFindViewHolderForAdapterPosition2 instanceof oa) {
                            oa oaVar3 = (oa) m0VarFindViewHolderForAdapterPosition2;
                            if (oaVar3.yo instanceof com.bytedance.sdk.openadsdk.activity.single.uef) {
                                oaVar3.yo.lw(true);
                                oaVar3.yo.gr();
                            }
                        }
                    }
                }
            }
        });
        fz();
        final int iTpx = tpx();
        recyclerView.post(new Runnable() { // from class: com.bytedance.sdk.openadsdk.activity.single.moa.15
            @Override // java.lang.Runnable
            public void run() {
                if (com.bytedance.sdk.component.utils.oa.uef(activity)) {
                    return;
                }
                moa.this.uef(iTpx, true);
            }
        });
        PAGLogoView pAGLogoViewCreatePAGLogoViewByMaterial = PAGLogoView.createPAGLogoViewByMaterial(activity, gzwVar);
        this.sy = pAGLogoViewCreatePAGLogoViewByMaterial;
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -2);
        layoutParams.gravity = 83;
        layoutParams.leftMargin = af.oa(activity, 16.0f);
        yoVar.addView(pAGLogoViewCreatePAGLogoViewByMaterial, layoutParams);
        pAGLogoViewCreatePAGLogoViewByMaterial.setOnClickListener(new View.OnClickListener() { // from class: com.bytedance.sdk.openadsdk.activity.single.moa.16
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                Context context = view.getContext();
                gzw gzwVar2 = gzwVar;
                TTWebsiteActivity.uef(context, gzwVar2, gzwVar2.lw());
            }
        });
        this.dhk = com.bytedance.sdk.openadsdk.gzw.lw.uef("draw_feed_item_reuse", 0) == 1;
    }

    private void cp() {
        if (this.cop == null) {
            return;
        }
        new com.bytedance.sdk.openadsdk.core.cq.cz.uef(this.uef).uef(this.cop, com.bytedance.sdk.openadsdk.core.zjm.oa.yo.oa(), this.au, new com.bytedance.sdk.openadsdk.core.cq.xs.moa() { // from class: com.bytedance.sdk.openadsdk.activity.single.moa.8
            @Override // com.bytedance.sdk.openadsdk.core.cq.xs.moa
            public void uef(int i5, String str) {
                moa.this.wxf = true;
            }

            @Override // com.bytedance.sdk.openadsdk.core.cq.xs.moa
            public void uef(com.bytedance.adsdk.ugeno.oa.yo<View> yoVar) {
                View viewDj = yoVar.dj();
                ViewGroup viewGroup = (ViewGroup) viewDj.getParent();
                if (viewGroup != null) {
                    viewGroup.removeView(viewDj);
                }
                moa.this.vyg = viewDj;
                if (moa.this.swd != null) {
                    moa.this.swd.addView(viewDj, new FrameLayout.LayoutParams(-1, -1));
                }
            }
        });
    }

    private boolean dxx() {
        FrameLayout frameLayout = this.swd;
        return (frameLayout == null || frameLayout.getParent() == null) ? false : true;
    }

    private void fz() {
        rt rtVarDj;
        com.bytedance.sdk.openadsdk.core.model.uef uefVarMoa = this.f25266oa.moa();
        if (uefVarMoa == null || (rtVarDj = uefVarMoa.dj()) == null || TextUtils.isEmpty(rtVarDj.xs())) {
            return;
        }
        this.km = new com.bytedance.sdk.openadsdk.activity.single.lw(this.moa, this.f25266oa, -1, 1, false, false, true);
    }

    private void gr() {
        FrameLayout frameLayout = this.swd;
        if (frameLayout == null) {
            return;
        }
        ViewParent parent = frameLayout.getParent();
        if (parent instanceof ViewGroup) {
            ((ViewGroup) parent).removeView(this.swd);
        }
        this.swd = null;
        bcc bccVar = this.fz;
        if (bccVar instanceof com.bytedance.sdk.openadsdk.activity.single.uef) {
            ((com.bytedance.sdk.openadsdk.activity.single.uef) bccVar).cp();
        }
        lz();
        Message message = this.zou;
        if (message != null) {
            handleMessage(message);
            this.zou = null;
        }
    }

    private void ku() {
        if (this.swd != null || this.cop == null || this.wxf) {
            return;
        }
        this.gem = true;
        this.swd = new com.bytedance.sdk.openadsdk.core.ivm.yo(this.uef) { // from class: com.bytedance.sdk.openadsdk.activity.single.moa.9
            @Override // android.view.ViewGroup, android.view.View
            public boolean dispatchTouchEvent(MotionEvent motionEvent) {
                moa.this.zjm.removeMessages(4);
                moa.this.zjm.sendEmptyMessage(4);
                try {
                    return super.dispatchTouchEvent(motionEvent);
                } catch (Exception unused) {
                    return false;
                }
            }
        };
        View view = this.vyg;
        if (view != null && view.getParent() == null) {
            this.swd.addView(this.vyg, new FrameLayout.LayoutParams(-1, -1));
        }
        this.dj.addView(this.swd, new FrameLayout.LayoutParams(-1, -1));
        this.zjm.sendEmptyMessageDelayed(4, this.gzw * 1000);
        bcc bccVar = this.fz;
        if (bccVar instanceof com.bytedance.sdk.openadsdk.activity.single.uef) {
            ((com.bytedance.sdk.openadsdk.activity.single.uef) bccVar).pz();
        }
        oyt();
    }

    private void lz() {
        if (this.f25237hg != 0) {
            bcc bccVar = this.fz;
            if (bccVar != null && cp.oa(bccVar.ivm)) {
                int iCurrentTimeMillis = this.lz - ((int) ((System.currentTimeMillis() - this.f25237hg) / 1000));
                this.lz = iCurrentTimeMillis;
                if (iCurrentTimeMillis < 0) {
                    this.lz = 0;
                }
            }
            this.f25237hg = 0L;
        }
        if (this.lz >= 0) {
            this.zjm.removeMessages(1);
            this.zjm.sendEmptyMessage(1);
        }
        ivm ivmVar = this.nkh;
        if (ivmVar != null) {
            ivmVar.yo();
        }
    }

    private void oyt() {
        if (this.ou) {
            this.f25237hg = System.currentTimeMillis();
        }
        this.zjm.removeMessages(1);
        ivm ivmVar = this.nkh;
        if (ivmVar != null) {
            ivmVar.oa();
        }
    }

    private void pz() {
        if (this.gem || this.cop == null) {
            return;
        }
        this.zjm.removeMessages(3);
        this.zjm.sendEmptyMessageDelayed(3, this.orq * 1000);
    }

    private void ue() {
        bcc bccVar;
        if (!this.wrv || this.moa.bs() || (bccVar = this.fz) == null) {
            return;
        }
        bccVar.etd();
    }

    @Override // android.os.Handler.Callback
    public boolean handleMessage(Message message) {
        if (this.dv) {
            this.oib.add(this.zjm.obtainMessage(message.what, message.arg1, message.arg2, message.obj));
            return false;
        }
        int i5 = message.what;
        if (i5 == 1) {
            int i10 = this.lz;
            if (i10 > 0) {
                if (i10 <= this.f25238ue) {
                    ue();
                }
                int i11 = (int) (((r0 - this.lz) * 100.0d) / this.oyt);
                TopLayoutDislike2 topLayoutDislike2 = this.cz;
                StringBuilder sb2 = new StringBuilder();
                int i12 = this.lz;
                this.lz = i12 - 1;
                sb2.append(i12);
                sb2.append("s");
                topLayoutDislike2.setCountDownFor1InN(sb2.toString(), i11);
                if (this.lz >= 0) {
                    this.zjm.removeMessages(message.what);
                    this.zjm.sendEmptyMessageDelayed(message.what, 1000L);
                }
            } else {
                ue();
                if (moa()) {
                    this.cz.showSkipButton();
                } else {
                    this.cz.showCloseButton();
                }
            }
        } else if (i5 == 3) {
            ku();
        } else if (i5 == 4) {
            gr();
        }
        return false;
    }

    @Override // com.bytedance.sdk.openadsdk.activity.single.yo
    public void oib() {
    }

    @Override // com.bytedance.sdk.openadsdk.activity.single.yo
    public void sy() {
    }

    @Override // com.bytedance.sdk.openadsdk.activity.single.yo
    public void uef(int i5) {
    }

    @Override // com.bytedance.sdk.openadsdk.activity.single.yo
    public com.bytedance.sdk.openadsdk.component.reward.top.yo wrv() {
        return null;
    }

    private void gsd() {
        km.uef(new Runnable() { // from class: com.bytedance.sdk.openadsdk.activity.single.moa.4
            @Override // java.lang.Runnable
            public void run() {
                if (com.bytedance.sdk.component.utils.oa.uef(moa.this.uef)) {
                    return;
                }
                moa.this.cq.set(false);
                if (!moa.this.gsd) {
                    moa.this.xs.uef(orq.uef(sy.uef(), "tt_list_end_tip"));
                } else {
                    moa.this.xs.uef("");
                    moa.this.gzw();
                }
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void gzw() {
        if (this.rl) {
            return;
        }
        if (this.gsd) {
            tpx();
        } else {
            km.uef(new Runnable() { // from class: com.bytedance.sdk.openadsdk.activity.single.moa.18
                @Override // java.lang.Runnable
                public void run() {
                    if (com.bytedance.sdk.component.utils.oa.uef(moa.this.uef)) {
                        return;
                    }
                    moa.this.xs.uef(orq.uef(sy.uef(), "tt_list_end_tip"));
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void orq() {
        if (this.cq.compareAndSet(false, true)) {
            AdSlot adSlotCl = this.f25266oa.cl();
            ue ueVar = new ue();
            ueVar.ivm = true;
            if (this.f25266oa.vep() != null || this.f25266oa.aje() != null) {
                ueVar.cz = 2;
            }
            ueVar.xs = this.sk;
            this.xs.uef(orq.uef(this.uef, "tt_loading_more"));
            sy.yo().uef(adSlotCl, ueVar, this.f25266oa.epe(), new com.bytedance.sdk.openadsdk.core.orq() { // from class: com.bytedance.sdk.openadsdk.activity.single.moa.17
                @Override // com.bytedance.sdk.openadsdk.core.orq, com.bytedance.sdk.openadsdk.core.gzw.uef
                public void uef(int i5, String str) {
                    moa.this.uef(i5, str);
                }

                @Override // com.bytedance.sdk.openadsdk.core.orq, com.bytedance.sdk.openadsdk.core.gzw.uef
                public void uef(com.bytedance.sdk.openadsdk.core.model.uef uefVar, com.bytedance.sdk.openadsdk.core.model.yo yoVar) {
                    moa.this.uef(uefVar, yoVar);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void rt() {
        com.bytedance.sdk.openadsdk.activity.single.lw lwVar = this.km;
        if (lwVar == null || !lwVar.gzw()) {
            this.moa.xs();
            return;
        }
        oa(this.km);
        this.dj.removeView(this.ivm);
        this.cz.setVisibility(8);
        this.sy.setVisibility(8);
    }

    private int tpx() {
        if (!this.gsd || this.xs.yo() || this.cq.get() || this.rl) {
            return 0;
        }
        int iUef = uef(this.ku, this.xs.moa(), 1073741823);
        this.xs.uef(this.ku, iUef);
        if (this.ku < 0) {
            this.ivm.scrollToPosition(iUef);
            return iUef;
        }
        this.ku = iUef;
        return iUef;
    }

    @Override // com.bytedance.sdk.openadsdk.activity.single.yo
    public void ab() {
        if (this.uqx) {
            return;
        }
        this.uqx = true;
        final long jElapsedRealtime = SystemClock.elapsedRealtime() - this.etd;
        long jCurrentTimeMillis = System.currentTimeMillis();
        gzw gzwVar = this.f25266oa;
        com.bytedance.sdk.openadsdk.moa.yo.uef(jCurrentTimeMillis, gzwVar, gzwVar.lw(), "first_ad_loaded", new com.bytedance.sdk.openadsdk.ab.oa.uef() { // from class: com.bytedance.sdk.openadsdk.activity.single.moa.10
            @Override // com.bytedance.sdk.openadsdk.ab.oa.uef, com.bytedance.sdk.openadsdk.ab.oa.oa
            public JSONObject oa() {
                JSONObject jSONObject = new JSONObject();
                try {
                    jSONObject.put("duration", jElapsedRealtime);
                } catch (Throwable unused) {
                }
                return jSONObject;
            }
        });
    }

    @Override // com.bytedance.sdk.openadsdk.activity.single.yo
    public int bcc() {
        return this.lz;
    }

    @Override // com.bytedance.sdk.openadsdk.activity.single.yo
    public void bs() {
        super.bs();
        this.ou = true;
    }

    @Override // com.bytedance.sdk.openadsdk.activity.single.yo
    /* renamed from: dhk, reason: merged with bridge method [inline-methods] */
    public com.bytedance.sdk.openadsdk.activity.single.uef cq() {
        m0 m0VarFindViewHolderForAdapterPosition = this.ivm.findViewHolderForAdapterPosition(this.ku + 1);
        if (!(m0VarFindViewHolderForAdapterPosition instanceof oa)) {
            return null;
        }
        bcc bccVarUef = ((oa) m0VarFindViewHolderForAdapterPosition).uef();
        if (bccVarUef instanceof com.bytedance.sdk.openadsdk.activity.single.uef) {
            return (com.bytedance.sdk.openadsdk.activity.single.uef) bccVarUef;
        }
        return null;
    }

    @Override // com.bytedance.sdk.openadsdk.activity.single.yo
    public bcc dj() {
        return this.fz;
    }

    @Override // com.bytedance.sdk.openadsdk.activity.single.yo
    public boolean lw() {
        return this.cp;
    }

    @Override // com.bytedance.sdk.openadsdk.activity.single.yo
    public List<gzw> wk() {
        return this.xs.lw();
    }

    @Override // com.bytedance.sdk.openadsdk.activity.single.yo
    public int zjm() {
        return this.dz.size();
    }

    /* renamed from: com.bytedance.sdk.openadsdk.activity.single.moa$moa, reason: collision with other inner class name */
    public static class C0074moa {

        /* renamed from: oa, reason: collision with root package name */
        public gzw f25249oa;
        public int uef = 0;
        public String yo;

        public C0074moa(gzw gzwVar) {
            this.f25249oa = gzwVar;
        }

        public C0074moa(String str) {
            this.yo = str;
        }
    }

    private void oa(bcc bccVar) {
        Iterator<bcc> it = this.xs.oa().iterator();
        while (it.hasNext()) {
            bcc next = it.next();
            if (next != bccVar) {
                next.uef(this.fz, bccVar, this.dxx);
            }
        }
        com.bytedance.sdk.openadsdk.activity.single.lw lwVar = this.km;
        if (lwVar != null && lwVar != bccVar) {
            lwVar.uef(this.fz, bccVar, this.dxx);
        }
        bcc bccVar2 = this.fz;
        this.fz = bccVar;
        if (bccVar2 != null) {
            bccVar2.wrv = false;
            bccVar2.dz();
            bccVar2.moa();
        }
        bccVar.wrv = true;
        bccVar.oa(this.uef, new oa.lw(1, null));
        com.bytedance.sdk.openadsdk.component.reward.view.bcc bccVarUef = bccVar.uef();
        if (bccVarUef.getVisibility() != 0) {
            bccVarUef.setVisibility(0);
        }
        if (bccVarUef.getParent() == null) {
            this.dj.addView(bccVarUef, new FrameLayout.LayoutParams(-1, -1));
        }
        this.moa.oa(bccVar);
        if (bccVar.g_() != this.cp) {
            bccVar.uef("card_sync");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void yo(bcc bccVar) {
        bcc bccVar2 = this.fz;
        if (bccVar != bccVar2) {
            return;
        }
        if (this.pu) {
            if (this.ku < this.xs.uef() - 1) {
                int i5 = this.ku + 1;
                this.af = i5;
                if (this.wk) {
                    this.ivm.smoothScrollToPosition(i5);
                } else {
                    oa(i5);
                }
            } else {
                this.af = 0;
                this.ivm.scrollToPosition(0);
                this.ivm.post(new Runnable() { // from class: com.bytedance.sdk.openadsdk.activity.single.moa.7
                    @Override // java.lang.Runnable
                    public void run() {
                        if (com.bytedance.sdk.component.utils.oa.uef(moa.this.uef)) {
                            return;
                        }
                        moa moaVar = moa.this;
                        moaVar.uef(moaVar.af, true);
                    }
                });
            }
        } else if (this.hts) {
            bccVar2.yo();
        } else {
            bccVar2.km();
        }
        this.nkh = null;
        this.hts = false;
    }

    @Override // com.bytedance.sdk.openadsdk.activity.single.yo
    public boolean moa() {
        return this.km != null;
    }

    public static class uef extends I {
        private boolean lw;
        private boolean moa;
        private final moa yo;
        private final ArrayList<C0074moa> uef = new ArrayList<>();

        /* renamed from: oa, reason: collision with root package name */
        private final ArrayList<bcc> f25251oa = new ArrayList<>();

        public uef(moa moaVar, List<gzw> list) {
            this.yo = moaVar;
            for (int i5 = 0; i5 < list.size(); i5++) {
                gzw gzwVar = list.get(i5);
                if (gzwVar != null && moaVar != null) {
                    gzwVar.pu(moaVar.lw);
                }
                this.uef.add(new C0074moa(gzwVar));
            }
        }

        @Override // androidx.recyclerview.widget.I
        public int getItemCount() {
            return this.lw ? f.API_PRIORITY_OTHER : this.uef.size();
        }

        @Override // androidx.recyclerview.widget.I
        public int getItemViewType(int i5) {
            C0074moa c0074moa = this.uef.get(i5 % this.uef.size());
            if (c0074moa.uef != 0) {
                return -1;
            }
            dxx dxxVarAje = c0074moa.f25249oa.aje();
            if (dxxVarAje == null) {
                return 1;
            }
            return (dxxVarAje.uef() + dxxVarAje.oa()).hashCode();
        }

        public List<gzw> lw() {
            ArrayList arrayList = new ArrayList();
            Iterator<C0074moa> it = this.uef.iterator();
            while (it.hasNext()) {
                C0074moa next = it.next();
                if (next.uef == 0) {
                    arrayList.add(next.f25249oa);
                }
            }
            return arrayList;
        }

        public int moa() {
            return this.moa ? this.uef.size() - 1 : this.uef.size();
        }

        @Override // androidx.recyclerview.widget.I
        /* renamed from: oa, reason: merged with bridge method [inline-methods] */
        public void onViewDetachedFromWindow(lw lwVar) {
            com.bytedance.sdk.openadsdk.activity.single.uef uefVar;
            super.onViewDetachedFromWindow(lwVar);
            if (!(lwVar instanceof oa) || (uefVar = ((oa) lwVar).yo) == null) {
                return;
            }
            uefVar.gsd().tpx.cop();
        }

        @Override // androidx.recyclerview.widget.I
        /* renamed from: uef, reason: merged with bridge method [inline-methods] */
        public lw onCreateViewHolder(ViewGroup viewGroup, int i5) {
            if (i5 == -1) {
                com.bytedance.sdk.openadsdk.core.ivm.yo yoVar = new com.bytedance.sdk.openadsdk.core.ivm.yo(viewGroup.getContext());
                yoVar.setLayoutParams(new FrameLayout.LayoutParams(-1, -2));
                return new yo(yoVar);
            }
            com.bytedance.sdk.openadsdk.component.reward.view.oa oaVar = new com.bytedance.sdk.openadsdk.component.reward.view.oa(viewGroup.getContext(), this.yo.f25236ab, this.yo.wk, af.oa(viewGroup.getContext(), 10.0f));
            oaVar.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
            return new oa(this, oaVar);
        }

        @Override // androidx.recyclerview.widget.I
        /* renamed from: yo, reason: merged with bridge method [inline-methods] */
        public void onViewRecycled(lw lwVar) {
            super.onViewRecycled(lwVar);
            if (lwVar instanceof oa) {
                oa oaVar = (oa) lwVar;
                com.bytedance.sdk.openadsdk.activity.single.uef uefVar = oaVar.yo;
                if (!this.yo.dhk) {
                    uef(oaVar, false);
                    return;
                }
                boolean zOa = oa(uefVar);
                if (uefVar != null) {
                    uef(oaVar, zOa);
                }
            }
        }

        private boolean oa(bcc bccVar) {
            return bccVar != null && bccVar.fz();
        }

        public ArrayList<bcc> oa() {
            return this.f25251oa;
        }

        @Override // androidx.recyclerview.widget.I
        /* renamed from: uef, reason: merged with bridge method [inline-methods] */
        public void onBindViewHolder(lw lwVar, int i5) {
            if (i5 >= this.uef.size()) {
                i5 %= this.uef.size();
            }
            lwVar.uef(this.yo, this.uef.get(i5), i5);
        }

        public boolean yo() {
            return this.lw;
        }

        @Override // androidx.recyclerview.widget.I
        /* renamed from: uef, reason: merged with bridge method [inline-methods] */
        public void onViewAttachedToWindow(lw lwVar) {
            super.onViewAttachedToWindow(lwVar);
        }

        public int uef() {
            int itemCount = getItemCount();
            return this.moa ? itemCount - 1 : itemCount;
        }

        public void uef(String str) {
            int size = this.uef.size();
            C0074moa c0074moa = size > 0 ? this.uef.get(size - 1) : null;
            boolean zIsEmpty = TextUtils.isEmpty(str);
            if (c0074moa == null || c0074moa.uef != 1) {
                if (zIsEmpty) {
                    return;
                }
                this.uef.add(new C0074moa(str));
                notifyItemInserted(size);
                this.moa = true;
                return;
            }
            if (!zIsEmpty) {
                c0074moa.yo = str;
                notifyItemChanged(size - 1);
            } else {
                this.uef.remove(c0074moa);
                notifyItemRemoved(size - 1);
                this.moa = false;
            }
        }

        public void uef(bcc bccVar) {
            this.f25251oa.add(bccVar);
        }

        public void uef(List<gzw> list) {
            moa moaVar;
            int size = this.uef.size();
            if (this.moa) {
                size--;
            }
            for (int i5 = 0; i5 < list.size(); i5++) {
                gzw gzwVar = list.get(i5);
                if (gzwVar != null && (moaVar = this.yo) != null) {
                    gzwVar.pu(moaVar.lw);
                }
                this.uef.add(size + i5, new C0074moa(gzwVar));
                gzwVar.pmc();
            }
            notifyItemRangeInserted(size, list.size());
        }

        public void uef(int i5, int i10) {
            if (this.lw) {
                return;
            }
            this.lw = true;
            if (i5 < 0) {
                i5 = 0;
            }
            int size = this.uef.size();
            notifyItemRangeInserted(size, (f.API_PRIORITY_OTHER - i10) - (size - i5));
            notifyItemRangeInserted(0, i10 - i5);
        }

        public void uef(oa oaVar, boolean z2) {
            if (oaVar.yo == null) {
                return;
            }
            this.f25251oa.remove(oaVar.yo);
            oaVar.uef(z2);
        }
    }

    private static int uef(int i5, int i10, int i11) {
        if (i5 < 0) {
            i5 = 0;
        }
        for (int i12 = 0; i12 < i10; i12++) {
            int i13 = i11 + i12;
            if (i13 % i10 == i5) {
                return i13;
            }
            int i14 = i11 - i12;
            if (i14 % i10 == i5) {
                return i14;
            }
        }
        return i11;
    }

    @Override // com.bytedance.sdk.openadsdk.activity.single.yo
    public void uef(Bundle bundle) {
        super.uef(bundle);
        cp();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void uef(int i5, String str) {
        this.rl = false;
        gsd();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void uef(com.bytedance.sdk.openadsdk.core.model.uef uefVar, com.bytedance.sdk.openadsdk.core.model.yo yoVar) {
        this.rl = false;
        if (uefVar.lw() != null && !uefVar.lw().isEmpty()) {
            uef(uefVar);
            return;
        }
        yoVar.uef(-3);
        yoVar.yo(1);
        com.bytedance.sdk.openadsdk.core.model.yo.uef(yoVar);
        gsd();
    }

    @Override // com.bytedance.sdk.openadsdk.activity.single.yo
    public void yo() {
        super.yo();
        this.dv = true;
        bcc bccVar = this.fz;
        if (bccVar != null) {
            bccVar.dz();
        }
        oyt();
        this.hts = this.nkh != null;
        this.zjm.removeMessages(3);
    }

    @Override // com.bytedance.sdk.openadsdk.activity.single.yo
    public void oa(Activity activity) {
        super.oa(activity);
        af.uef(activity);
    }

    private void oa(int i5) {
        m0 m0VarFindViewHolderForAdapterPosition;
        int iFindFirstVisibleItemPosition = this.bcc.findFirstVisibleItemPosition();
        int iFindLastVisibleItemPosition = this.bcc.findLastVisibleItemPosition();
        if (i5 < iFindFirstVisibleItemPosition) {
            this.ivm.smoothScrollToPosition(i5);
            return;
        }
        if (i5 <= iFindLastVisibleItemPosition) {
            int i10 = i5 - iFindFirstVisibleItemPosition;
            int childCount = this.ivm.getChildCount();
            if (i10 <= 0 || i10 >= childCount || (m0VarFindViewHolderForAdapterPosition = this.ivm.findViewHolderForAdapterPosition(i5 - 1)) == null) {
                return;
            }
            this.ivm.smoothScrollBy(0, m0VarFindViewHolderForAdapterPosition.itemView.getBottom());
            return;
        }
        this.ivm.smoothScrollToPosition(this.af);
    }

    private void uef(final com.bytedance.sdk.openadsdk.core.model.uef uefVar) {
        rt rtVarDj = uefVar.dj();
        if (rtVarDj != null) {
            this.sk = rtVarDj.wrv();
            this.rl = rtVarDj.cq();
        }
        if (!this.wk) {
            for (gzw gzwVar : uefVar.lw()) {
                if (gzwVar.nj() != null && gzw.lw(gzwVar)) {
                    com.bytedance.sdk.openadsdk.core.wk.uef.oa oaVarUef = gzw.uef(CacheDirFactory.getICacheDir(gzwVar.wg()).uef(), gzwVar);
                    oaVarUef.uef("material_meta", gzwVar);
                    oaVarUef.uef("ad_slot", gzwVar.cl());
                    com.bytedance.sdk.openadsdk.core.wk.lw.uef.uef(oaVarUef, new com.bykv.vk.openvk.uef.uef.uef.lw.oa() { // from class: com.bytedance.sdk.openadsdk.activity.single.moa.2
                        @Override // com.bykv.vk.openvk.uef.uef.uef.lw.uef.InterfaceC0032uef
                        public void uef(com.bykv.vk.openvk.uef.uef.uef.yo.yo yoVar, int i5) {
                        }

                        @Override // com.bykv.vk.openvk.uef.uef.uef.lw.uef.InterfaceC0032uef
                        public void uef(com.bykv.vk.openvk.uef.uef.uef.yo.yo yoVar, int i5, String str) {
                        }
                    });
                }
            }
        }
        km.uef(new Runnable() { // from class: com.bytedance.sdk.openadsdk.activity.single.moa.3
            @Override // java.lang.Runnable
            public void run() {
                if (com.bytedance.sdk.component.utils.oa.uef(moa.this.uef)) {
                    return;
                }
                moa.this.cq.set(false);
                moa.this.xs.uef("");
                moa.this.xs.uef(uefVar.lw());
                moa.this.gzw();
            }
        });
    }

    @Override // com.bytedance.sdk.openadsdk.activity.single.yo
    public void oa() {
        super.oa();
        this.dv = false;
        this.ou = false;
        bcc bccVar = this.fz;
        if (bccVar != null && !this.hts) {
            bccVar.yo();
        }
        if (this.etd == 0) {
            this.etd = SystemClock.elapsedRealtime();
        }
        lz();
        pz();
        Iterator<Message> it = this.oib.iterator();
        while (it.hasNext()) {
            handleMessage(it.next());
        }
        this.oib.clear();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void uef(int i5, boolean z2) {
        int i10;
        m0 m0VarFindViewHolderForAdapterPosition = this.ivm.findViewHolderForAdapterPosition(i5);
        if (m0VarFindViewHolderForAdapterPosition == null || !(m0VarFindViewHolderForAdapterPosition instanceof oa) || (i10 = this.ku) == i5) {
            return;
        }
        uef(i10, i5, z2);
        this.ku = i5;
        this.dor = SystemClock.elapsedRealtime();
        bcc bccVarUef = ((oa) m0VarFindViewHolderForAdapterPosition).uef();
        if (bccVarUef == null) {
            return;
        }
        oa(bccVarUef);
        this.dz.add(bccVarUef.ivm.au());
        if (this.rl && this.rt > 0 && this.ku >= this.xs.uef() - this.rt) {
            orq();
        }
        com.bytedance.sdk.openadsdk.activity.single.uef uefVarCq = cq();
        if (uefVarCq != null) {
            if (!this.wk && this.bcc.findLastVisibleItemPosition() >= this.ku + 1) {
                uefVarCq.lw(true);
            }
            this.bs.add(Integer.valueOf(this.ku + 1));
            uefVarCq.gr();
            this.rj = false;
            return;
        }
        this.rj = true;
    }

    @Override // com.bytedance.sdk.openadsdk.activity.single.yo
    public void oa(bcc bccVar, int i5) {
        bcc bccVar2 = this.fz;
        if (bccVar != bccVar2) {
            return;
        }
        if (i5 == 2) {
            oyt();
            return;
        }
        if (i5 == 1) {
            if (dxx()) {
                bcc bccVar3 = this.fz;
                if (bccVar3 instanceof com.bytedance.sdk.openadsdk.activity.single.uef) {
                    ((com.bytedance.sdk.openadsdk.activity.single.uef) bccVar3).pz();
                    return;
                }
                return;
            }
            lz();
            return;
        }
        if (i5 == 3 || i5 == 4) {
            try {
                bccVar2.gsd().tpx.dxx();
            } catch (Throwable th) {
                dhk.yo("CardsLayoutManager", th);
            }
        }
    }

    private void uef(int i5, int i10, boolean z2) {
        String str;
        if (i5 < 0 || i10 < 0 || i5 == i10) {
            return;
        }
        if (z2) {
            str = "auto_down";
        } else {
            str = i10 > i5 ? "down" : "up";
        }
        final String str2 = str;
        final long jElapsedRealtime = (SystemClock.elapsedRealtime() - this.dor) / 1000;
        List<gzw> listLw = this.xs.lw();
        final int size = i5 % listLw.size();
        final int size2 = i10 % listLw.size();
        gzw gzwVar = listLw.get(size);
        com.bytedance.sdk.openadsdk.moa.yo.uef(System.currentTimeMillis(), gzwVar, gzwVar.lw(), "slide", new com.bytedance.sdk.openadsdk.ab.oa.uef() { // from class: com.bytedance.sdk.openadsdk.activity.single.moa.5
            @Override // com.bytedance.sdk.openadsdk.ab.oa.uef, com.bytedance.sdk.openadsdk.ab.oa.oa
            public JSONObject uef() throws JSONException {
                try {
                    JSONObject jSONObject = new JSONObject();
                    jSONObject.put("from", size + 1);
                    jSONObject.put("to", size2 + 1);
                    jSONObject.put("direction", str2);
                    jSONObject.put("click_user_remaining", jElapsedRealtime);
                    return jSONObject;
                } catch (Exception unused) {
                    return null;
                }
            }
        });
    }

    @Override // com.bytedance.sdk.openadsdk.activity.single.yo
    public void uef(final bcc bccVar, bcc bccVar2, oa.lw lwVar) {
        long jMoa;
        if (bccVar != this.fz) {
            return;
        }
        if (bccVar.rt() || cp.oa(bccVar.ivm)) {
            jMoa = 500;
        } else {
            jMoa = bccVar.ivm.hzk() != null ? r6.moa() * 1000 : 0L;
        }
        ivm ivmVar = this.nkh;
        if (ivmVar != null) {
            ivmVar.moa();
        }
        ivm ivmVar2 = new ivm(Math.max(500L, jMoa)) { // from class: com.bytedance.sdk.openadsdk.activity.single.moa.6
            @Override // com.bytedance.sdk.openadsdk.activity.single.moa.ivm
            public void uef() {
                if (com.bytedance.sdk.component.utils.oa.uef(moa.this.uef)) {
                    return;
                }
                moa.this.yo(bccVar);
            }
        };
        this.nkh = ivmVar2;
        ivmVar2.lw();
    }

    @Override // com.bytedance.sdk.openadsdk.activity.single.yo
    public void uef(boolean z2) {
        super.uef(z2);
        bcc bccVar = this.fz;
        if (bccVar != null) {
            bccVar.yo(z2);
        }
    }

    @Override // com.bytedance.sdk.openadsdk.activity.single.yo
    public boolean uef(bcc bccVar, int i5) {
        com.bytedance.sdk.openadsdk.activity.single.lw lwVar = this.km;
        return lwVar != null && lwVar == bccVar;
    }

    @Override // com.bytedance.sdk.openadsdk.activity.single.yo
    public void uef(View view) {
        super.uef(view);
        if (view.getParent() != null) {
            return;
        }
        view.setVisibility(4);
        this.dj.addView(view, 0);
    }

    @Override // com.bytedance.sdk.openadsdk.activity.single.yo
    public void uef(Activity activity) {
        super.uef(activity);
        bcc bccVar = this.fz;
        if (bccVar != null) {
            bccVar.oa(activity);
        }
        com.bytedance.sdk.openadsdk.activity.single.lw lwVar = this.km;
        if (lwVar != null) {
            lwVar.oib();
        }
        Iterator<bcc> it = this.xs.oa().iterator();
        while (it.hasNext()) {
            it.next().oib();
        }
        this.zjm.removeCallbacksAndMessages(null);
        ivm ivmVar = this.nkh;
        if (ivmVar != null) {
            ivmVar.moa();
            this.nkh = null;
        }
        bcc bccVar2 = this.fz;
        if (bccVar2 == null || bccVar2.orq() || this.f25266oa.tpq()) {
            return;
        }
        wk.oa().post(new oa.yo(this.f25266oa));
    }

    @Override // com.bytedance.sdk.openadsdk.activity.single.yo
    public void uef(Map<String, Object> map, bcc bccVar, float f10, float f11) throws JSONException {
        Object jSONObject = map.get("pag_json_data");
        if (jSONObject == null) {
            jSONObject = new JSONObject();
        }
        if (jSONObject instanceof JSONObject) {
            try {
                com.bytedance.sdk.openadsdk.component.reward.view.bcc bccVarUef = bccVar.uef();
                ((JSONObject) jSONObject).put("width", bccVarUef.getWidth());
                ((JSONObject) jSONObject).put("height", bccVarUef.getHeight());
                int i5 = bccVar.zjm;
                ((JSONObject) jSONObject).put("click_feed_top", i5 == this.bcc.findFirstVisibleItemPosition() ? 1 : 0);
                ((JSONObject) jSONObject).put("click_on_final", i5 == this.xs.moa() ? 1 : 0);
                ((JSONObject) jSONObject).put("click_countdown_remaining", this.lz);
                ((JSONObject) jSONObject).put("click_user_remaining", i5 == this.ku ? (SystemClock.elapsedRealtime() - this.dor) / 1000 : 0L);
                map.put("pag_json_data", jSONObject.toString());
            } catch (Exception unused) {
            }
        }
    }
}
