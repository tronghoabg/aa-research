package com.bytedance.sdk.openadsdk.core.widget;

import android.content.Context;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.bytedance.sdk.component.utils.orq;
import com.bytedance.sdk.openadsdk.utils.af;

/* loaded from: classes3.dex */
public class dhk {
    private ViewGroup bcc;
    private boolean ivm = false;
    private oa lw;
    private com.bytedance.sdk.openadsdk.core.wk.oa.uef moa;

    /* renamed from: oa, reason: collision with root package name */
    private TextView f25760oa;
    private View uef;
    private com.bykv.vk.openvk.uef.uef.uef.yo.oa xs;
    private Context yo;

    public interface oa {
        void dj();

        boolean zjm();
    }

    public enum uef {
        PAUSE_VIDEO,
        RELEASE_VIDEO,
        START_VIDEO
    }

    private void moa() {
        View view = this.uef;
        if (view != null) {
            view.setVisibility(8);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void yo() {
        if (this.yo == null) {
            return;
        }
        moa();
    }

    private void oa() {
        this.xs = null;
    }

    public void uef(Context context, ViewGroup viewGroup) {
        if (context == null || !(viewGroup instanceof ViewGroup)) {
            return;
        }
        this.bcc = viewGroup;
        this.yo = com.bytedance.sdk.openadsdk.core.sy.uef().getApplicationContext();
    }

    private void uef(Context context, View view, boolean z2) {
        ViewGroup.LayoutParams layoutParamsUef;
        if (context == null || view == null || this.uef != null || (layoutParamsUef = uef(this.bcc)) == null) {
            return;
        }
        com.bytedance.sdk.openadsdk.wk.lw lwVar = new com.bytedance.sdk.openadsdk.wk.lw(context);
        this.uef = lwVar;
        lwVar.setLayoutParams(layoutParamsUef);
        this.bcc.addView(this.uef);
        this.f25760oa = (TextView) this.uef.findViewById(com.bytedance.sdk.openadsdk.utils.bs.gze);
        View viewFindViewById = this.uef.findViewById(com.bytedance.sdk.openadsdk.utils.bs.ln);
        if (z2) {
            viewFindViewById.setClickable(true);
            viewFindViewById.setOnClickListener(new View.OnClickListener() { // from class: com.bytedance.sdk.openadsdk.core.widget.dhk.1
                @Override // android.view.View.OnClickListener
                public void onClick(View view2) {
                    dhk.this.yo();
                    if (dhk.this.moa != null) {
                        dhk.this.moa.uef(uef.START_VIDEO, (String) null);
                    }
                }
            });
        } else {
            viewFindViewById.setOnClickListener(null);
            viewFindViewById.setClickable(false);
        }
    }

    private ViewGroup.LayoutParams uef(ViewGroup viewGroup) {
        if (viewGroup instanceof RelativeLayout) {
            return new RelativeLayout.LayoutParams(-1, -1);
        }
        if (viewGroup instanceof LinearLayout) {
            return new LinearLayout.LayoutParams(-1, -1);
        }
        if (viewGroup instanceof FrameLayout) {
            return new FrameLayout.LayoutParams(-1, -1);
        }
        return null;
    }

    public void uef(com.bytedance.sdk.openadsdk.core.wk.oa.uef uefVar, oa oaVar) {
        this.lw = oaVar;
        this.moa = uefVar;
    }

    public boolean uef(int i5, com.bykv.vk.openvk.uef.uef.uef.yo.oa oaVar, boolean z2) {
        Context context = this.yo;
        if (context == null || oaVar == null) {
            return true;
        }
        uef(context, this.bcc, z2);
        this.xs = oaVar;
        if (i5 == 1 || i5 == 2) {
            return uef(i5);
        }
        return true;
    }

    private boolean uef(int i5) {
        oa oaVar;
        if (uef() || this.ivm) {
            return true;
        }
        if (this.moa != null && (oaVar = this.lw) != null) {
            if (oaVar.zjm()) {
                this.moa.lw(null, null);
            }
            this.moa.uef(uef.PAUSE_VIDEO, (String) null);
        }
        uef(this.xs, true);
        return false;
    }

    public void uef(boolean z2) {
        if (z2) {
            oa();
        }
        moa();
    }

    public boolean uef() {
        View view = this.uef;
        return view != null && view.getVisibility() == 0;
    }

    private void uef(com.bykv.vk.openvk.uef.uef.uef.yo.oa oaVar, boolean z2) {
        View view;
        String str;
        View view2;
        if (oaVar == null || (view = this.uef) == null || this.yo == null || view.getVisibility() == 0) {
            return;
        }
        oa oaVar2 = this.lw;
        if (oaVar2 != null) {
            oaVar2.dj();
        }
        double dCeil = Math.ceil((oaVar.lw() * 1.0d) / 1048576.0d);
        if (z2) {
            str = String.format(orq.uef(this.yo, "tt_video_without_wifi_tips"), Float.valueOf(Double.valueOf(dCeil).floatValue()));
        } else {
            str = orq.uef(this.yo, "tt_video_without_wifi_tips") + orq.uef(this.yo, "tt_video_bytesize");
        }
        af.uef(this.uef, 0);
        af.uef(this.f25760oa, str);
        Log.i("VideoTrafficTipLayout", "showTrafficTipCover: ");
        if (!af.moa(this.uef) || (view2 = this.uef) == null) {
            return;
        }
        view2.bringToFront();
        Log.i("VideoTrafficTipLayout", "showTrafficTipCover: bringToFront");
    }
}
