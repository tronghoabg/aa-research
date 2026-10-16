package com.bytedance.sdk.openadsdk.common;

import android.content.Context;
import android.content.res.Configuration;
import android.graphics.Color;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.bytedance.sdk.openadsdk.core.model.gzw;
import com.bytedance.sdk.openadsdk.utils.cp;

/* loaded from: classes3.dex */
public class wrv extends com.bytedance.sdk.openadsdk.core.ivm.yo {
    private int bcc;
    private Runnable ivm;
    private Runnable lw;
    private long moa;

    /* renamed from: oa, reason: collision with root package name */
    protected boolean f25322oa;
    protected dj uef;
    private boolean xs;
    private int yo;

    public wrv(Context context) {
        super(context);
        this.moa = 10L;
        this.f25322oa = true;
        this.xs = false;
        this.bcc = 1;
        yo();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void oa(int i5) {
        dj djVar = this.uef;
        if (djVar != null) {
            djVar.uef(i5);
        }
        if (i5 == 100 && this.f25322oa) {
            oa();
        }
    }

    private void yo() {
        setBackgroundColor(Color.parseColor("#2E2E2E"));
        setVisibility(8);
    }

    public dj getLoadingStyle() {
        return this.uef;
    }

    @Override // android.view.View
    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        yo(configuration.orientation);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        Runnable runnable = this.lw;
        if (runnable != null) {
            removeCallbacks(runnable);
            this.lw = null;
        }
    }

    public void setOnlyLoading(boolean z2) {
        this.xs = z2;
    }

    private void yo(int i5) {
        if (this.bcc != i5) {
            this.bcc = i5;
        }
    }

    public void uef(gzw gzwVar) {
        com.bytedance.sdk.openadsdk.core.model.tpx tpxVarGsd;
        if (gzwVar != null && (tpxVarGsd = gzwVar.gsd()) != null) {
            this.moa = tpxVarGsd.uef();
        }
        dj djVar = new dj(getContext());
        this.uef = djVar;
        View viewUef = djVar.uef();
        if (viewUef.getParent() instanceof ViewGroup) {
            ((ViewGroup) viewUef.getParent()).removeView(viewUef);
        }
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -2);
        layoutParams.gravity = 17;
        viewUef.setLayoutParams(layoutParams);
        if (gzwVar != null) {
            boolean zDy = gzwVar.dy();
            com.bytedance.sdk.openadsdk.core.widget.bs bsVarOa = this.uef.oa();
            if (bsVarOa != null) {
                if (!this.xs && !zDy) {
                    com.bytedance.sdk.openadsdk.core.model.sy syVarIfk = (gzwVar.ifk() == null || TextUtils.isEmpty(gzwVar.ifk().uef())) ? null : gzwVar.ifk();
                    if (syVarIfk != null && !TextUtils.isEmpty(syVarIfk.uef())) {
                        try {
                            com.bytedance.sdk.openadsdk.zjm.moa.uef(syVarIfk).yo(1).uef(new com.bytedance.sdk.openadsdk.zjm.oa(gzwVar, syVarIfk.uef(), new cp(bsVarOa)));
                        } catch (Throwable unused) {
                        }
                    } else {
                        bsVarOa.setVisibility(8);
                    }
                } else {
                    bsVarOa.setVisibility(8);
                }
            }
            com.bytedance.sdk.openadsdk.core.ivm.bcc bccVarYo = this.uef.yo();
            if (bccVarYo != null) {
                if (!this.xs && !zDy) {
                    if (!TextUtils.isEmpty(gzwVar.xw())) {
                        bccVarYo.setText(gzwVar.xw());
                    } else {
                        bccVarYo.setVisibility(8);
                    }
                } else {
                    bccVarYo.setText("Loading");
                }
            }
        }
        addView(viewUef);
        yo(getResources().getConfiguration().orientation);
    }

    public void oa() {
        this.yo = 0;
        dj djVar = this.uef;
        if (djVar != null) {
            removeView(djVar.uef);
            this.uef.moa();
        }
        setVisibility(8);
        this.uef = null;
        Runnable runnable = this.lw;
        if (runnable != null) {
            removeCallbacks(runnable);
        }
        Runnable runnable2 = this.ivm;
        if (runnable2 != null) {
            removeCallbacks(runnable2);
        }
        this.ivm = null;
        this.lw = null;
    }

    public void uef() {
        post(new Runnable() { // from class: com.bytedance.sdk.openadsdk.common.wrv.1
            @Override // java.lang.Runnable
            public void run() {
                wrv wrvVar = wrv.this;
                if (wrvVar.uef != null) {
                    wrvVar.setVisibility(0);
                }
            }
        });
        if (this.lw == null) {
            this.lw = new Runnable() { // from class: com.bytedance.sdk.openadsdk.common.wrv.2
                @Override // java.lang.Runnable
                public void run() {
                    wrv.this.oa();
                }
            };
        }
        postDelayed(this.lw, this.moa * 1000);
    }

    public void uef(int i5) {
        if (i5 == 100 || Math.abs(i5 - this.yo) >= 7) {
            this.yo = i5;
            if (com.bykv.vk.openvk.uef.uef.oa.oa.uef.uef()) {
                oa(this.yo);
                return;
            }
            if (this.ivm == null) {
                this.ivm = new Runnable() { // from class: com.bytedance.sdk.openadsdk.common.wrv.3
                    @Override // java.lang.Runnable
                    public void run() {
                        wrv wrvVar = wrv.this;
                        wrvVar.oa(wrvVar.yo);
                    }
                };
            }
            post(this.ivm);
        }
    }
}
