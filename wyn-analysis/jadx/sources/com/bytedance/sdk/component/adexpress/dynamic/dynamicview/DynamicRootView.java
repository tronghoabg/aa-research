package com.bytedance.sdk.component.adexpress.dynamic.dynamicview;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.bytedance.sdk.component.adexpress.theme.ThemeStatusBroadcastReceiver;
import com.unity3d.services.UnityAdsConstants;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* loaded from: classes.dex */
public class DynamicRootView extends FrameLayout implements com.bytedance.sdk.component.adexpress.dynamic.moa, com.bytedance.sdk.component.adexpress.theme.uef {
    private String bgColor;
    private Map<Integer, String> bgMaterialCenterCalcColor;
    private lw dynamicBaseWidget;
    private int logoUnionHeight;
    private Context mContext;
    private com.bytedance.sdk.component.adexpress.dynamic.ivm.uef mDynamicClickListener;
    boolean mIsMute;
    private ThemeStatusBroadcastReceiver mReceiver;
    private com.bytedance.sdk.component.adexpress.oa.dj mRenderListener;
    private com.bytedance.sdk.component.adexpress.oa.cq mRenderRequest;
    private ViewGroup mTimeOut;
    private com.bytedance.sdk.component.adexpress.dynamic.oa muteListener;
    protected final com.bytedance.sdk.component.adexpress.oa.dz renderResult;
    private int scoreCountWithIcon;
    private List<com.bytedance.sdk.component.adexpress.dynamic.yo> timeOutListener;
    private int timedown;
    private com.bytedance.sdk.component.adexpress.dynamic.lw videoListener;
    public View videoView;

    public DynamicRootView(Context context, ThemeStatusBroadcastReceiver themeStatusBroadcastReceiver, boolean z2, com.bytedance.sdk.component.adexpress.oa.cq cqVar, com.bytedance.sdk.component.adexpress.dynamic.ivm.uef uefVar) {
        super(context);
        this.mTimeOut = null;
        this.timedown = 0;
        this.timeOutListener = new ArrayList();
        this.logoUnionHeight = 0;
        this.scoreCountWithIcon = 0;
        this.mContext = context;
        com.bytedance.sdk.component.adexpress.oa.dz dzVar = new com.bytedance.sdk.component.adexpress.oa.dz();
        this.renderResult = dzVar;
        dzVar.uef(2);
        this.mDynamicClickListener = uefVar;
        uefVar.uef(this);
        this.mReceiver = themeStatusBroadcastReceiver;
        themeStatusBroadcastReceiver.uef(this);
        this.mIsMute = z2;
        this.mRenderRequest = cqVar;
    }

    private void checkCanOpenLandingPage(com.bytedance.sdk.component.adexpress.dynamic.moa.bcc bccVar) {
        com.bytedance.sdk.component.adexpress.dynamic.moa.ivm ivmVarLw;
        com.bytedance.sdk.component.adexpress.dynamic.moa.lw lwVarZjm = bccVar.zjm();
        if (lwVarZjm == null || (ivmVarLw = lwVarZjm.lw()) == null) {
            return;
        }
        this.renderResult.oa(ivmVarLw.cc());
    }

    private boolean checkSizeValid() {
        lw lwVar = this.dynamicBaseWidget;
        return lwVar.lw > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT && lwVar.ivm > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
    }

    private void setClipChildren(ViewGroup viewGroup, com.bytedance.sdk.component.adexpress.dynamic.moa.bcc bccVar) {
        ViewGroup viewGroup2;
        if (viewGroup == null || (viewGroup2 = (ViewGroup) viewGroup.getParent()) == null || !bccVar.gsd()) {
            return;
        }
        viewGroup2.setClipChildren(false);
        viewGroup2.setClipToPadding(false);
        ViewGroup viewGroup3 = (ViewGroup) viewGroup2.getParent();
        if (viewGroup3 != null) {
            viewGroup3.setClipChildren(false);
            viewGroup3.setClipToPadding(false);
        }
    }

    public void beginHideFromVisible() {
        beginShowFromInvisible(this.dynamicBaseWidget, 4);
    }

    public void beginShowFromInvisible() {
        beginShowFromInvisible(this.dynamicBaseWidget, 0);
    }

    public void callBackRenderFail(int i5, String str) {
        this.renderResult.uef(false);
        this.renderResult.oa(i5);
        this.renderResult.uef(str);
        this.mRenderListener.uef(this.renderResult);
    }

    public String getBgColor() {
        return this.bgColor;
    }

    public Map<Integer, String> getBgMaterialCenterCalcColor() {
        return this.bgMaterialCenterCalcColor;
    }

    public com.bytedance.sdk.component.adexpress.dynamic.ivm.uef getDynamicClickListener() {
        return this.mDynamicClickListener;
    }

    public int getLogoUnionHeight() {
        return this.logoUnionHeight;
    }

    public com.bytedance.sdk.component.adexpress.oa.dj getRenderListener() {
        return this.mRenderListener;
    }

    public com.bytedance.sdk.component.adexpress.oa.cq getRenderRequest() {
        return this.mRenderRequest;
    }

    public int getScoreCountWithIcon() {
        return this.scoreCountWithIcon;
    }

    public ViewGroup getTimeOut() {
        return this.mTimeOut;
    }

    public List<com.bytedance.sdk.component.adexpress.dynamic.yo> getTimeOutListener() {
        return this.timeOutListener;
    }

    public int getTimedown() {
        return this.timedown;
    }

    @Override // com.bytedance.sdk.component.adexpress.theme.uef
    public void onThemeChanged(int i5) {
        lw lwVar = this.dynamicBaseWidget;
        if (lwVar == null) {
            return;
        }
        lwVar.uef(i5);
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.moa
    public void onvideoComplate() {
        try {
            this.videoListener.uef();
        } catch (Exception unused) {
        }
    }

    public void render(com.bytedance.sdk.component.adexpress.dynamic.moa.bcc bccVar, int i5) {
        this.dynamicBaseWidget = renderDynamicView(bccVar, this, i5);
        this.renderResult.uef(true);
        this.renderResult.uef(this.dynamicBaseWidget.lw);
        this.renderResult.oa(this.dynamicBaseWidget.ivm);
        this.renderResult.uef(this.videoView);
        this.mRenderListener.uef(this.renderResult);
    }

    public lw renderDynamicView(com.bytedance.sdk.component.adexpress.dynamic.moa.bcc bccVar, ViewGroup viewGroup, int i5) {
        if (bccVar == null) {
            return null;
        }
        List<com.bytedance.sdk.component.adexpress.dynamic.moa.bcc> listDj = bccVar.dj();
        lw lwVarUef = com.bytedance.sdk.component.adexpress.dynamic.uef.oa.uef(this.mContext, this, bccVar);
        if (lwVarUef instanceof ku) {
            callBackRenderFail(i5 == 3 ? 128 : 118, "unknow widget");
            return null;
        }
        checkCanOpenLandingPage(bccVar);
        lwVarUef.yo();
        if (viewGroup != null) {
            viewGroup.addView(lwVarUef);
            setClipChildren(viewGroup, bccVar);
        }
        if (listDj == null || listDj.size() <= 0) {
            return null;
        }
        Iterator<com.bytedance.sdk.component.adexpress.dynamic.moa.bcc> it = listDj.iterator();
        while (it.hasNext()) {
            renderDynamicView(it.next(), lwVarUef, i5);
        }
        return lwVarUef;
    }

    public void setBgColor(String str) {
        this.bgColor = str;
    }

    public void setBgMaterialCenterCalcColor(Map<Integer, String> map) {
        this.bgMaterialCenterCalcColor = map;
    }

    public void setLogoUnionHeight(int i5) {
        this.logoUnionHeight = i5;
    }

    public void setMuteListener(com.bytedance.sdk.component.adexpress.dynamic.oa oaVar) {
        this.muteListener = oaVar;
    }

    public void setRenderListener(com.bytedance.sdk.component.adexpress.oa.dj djVar) {
        this.mRenderListener = djVar;
        this.mDynamicClickListener.uef(djVar);
    }

    public void setScoreCountWithIcon(int i5) {
        this.scoreCountWithIcon = i5;
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.moa
    public void setSoundMute(boolean z2) {
        com.bytedance.sdk.component.adexpress.dynamic.oa oaVar = this.muteListener;
        if (oaVar != null) {
            oaVar.setSoundMute(z2);
        }
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.moa
    public void setTime(CharSequence charSequence, int i5, int i10, boolean z2) {
        for (int i11 = 0; i11 < this.timeOutListener.size(); i11++) {
            if (this.timeOutListener.get(i11) != null) {
                this.timeOutListener.get(i11).uef(charSequence, i5 == 1, i10, z2);
            }
        }
    }

    public void setTimeOut(ViewGroup viewGroup) {
        this.mTimeOut = viewGroup;
    }

    public void setTimeOutListener(com.bytedance.sdk.component.adexpress.dynamic.yo yoVar) {
        this.timeOutListener.add(yoVar);
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.moa
    public void setTimeUpdate(int i5) {
        this.videoListener.setTimeUpdate(i5);
    }

    public void setTimedown(int i5) {
        this.timedown = i5;
    }

    public void setVideoListener(com.bytedance.sdk.component.adexpress.dynamic.lw lwVar) {
        this.videoListener = lwVar;
    }

    public void updateRenderInfoForVideo(double d3, double d5, double d10, double d11, float f10) {
        this.renderResult.yo(d3);
        this.renderResult.moa(d5);
        this.renderResult.lw(d10);
        this.renderResult.ivm(d11);
        this.renderResult.uef(f10);
        this.renderResult.oa(f10);
        this.renderResult.yo(f10);
        this.renderResult.moa(f10);
    }

    public void beginShowFromInvisible(lw lwVar, int i5) {
        if (lwVar == null) {
            return;
        }
        if (lwVar.getBeginInvisibleAndShow()) {
            lwVar.setVisibility(i5);
            View view = lwVar.wk;
            if (view != null) {
                view.setVisibility(i5);
            }
        }
        int childCount = lwVar.getChildCount();
        if (childCount <= 0) {
            return;
        }
        for (int i10 = 0; i10 < childCount; i10++) {
            if (lwVar.getChildAt(i10) instanceof lw) {
                beginShowFromInvisible((lw) lwVar.getChildAt(i10), i5);
            }
        }
    }
}
