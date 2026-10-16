package com.bytedance.sdk.openadsdk.api.nativeAd;

import android.content.Context;
import android.view.View;
import com.bytedance.sdk.openadsdk.core.model.gzw;
import com.bytedance.sdk.openadsdk.core.wk.oa.ivm;
import com.bytedance.sdk.openadsdk.core.yo.uef;
import com.bytedance.sdk.openadsdk.utils.moa;

/* loaded from: classes3.dex */
public class PAGVideoMediaView extends PAGMediaView implements uef.InterfaceC0112uef {
    private gzw moa;

    /* renamed from: oa, reason: collision with root package name */
    private ivm f25280oa;
    private final com.bytedance.sdk.openadsdk.uef.oa.uef yo;

    public PAGVideoMediaView(Context context, View view, com.bytedance.sdk.openadsdk.uef.oa.uef uefVar) {
        super(context);
        uef(view);
        this.yo = uefVar;
    }

    private boolean oa() {
        ivm ivmVar = this.f25280oa;
        if (ivmVar != null) {
            return ivmVar.cq();
        }
        return false;
    }

    private void uef(View view) {
        if (view instanceof ivm) {
            ivm ivmVar = (ivm) view;
            this.f25280oa = ivmVar;
            addView(ivmVar, -1, -1);
        }
    }

    @Override // com.bytedance.sdk.openadsdk.api.nativeAd.PAGMediaView
    public void close() {
        ivm ivmVar = this.f25280oa;
        if (ivmVar != null) {
            ivmVar.ab();
        }
    }

    @Override // com.bytedance.sdk.openadsdk.core.yo.uef.InterfaceC0112uef
    public long getVideoProgress() {
        ivm ivmVar = this.f25280oa;
        if (ivmVar == null || ivmVar.getNativeVideoController() == null) {
            return 0L;
        }
        return this.f25280oa.getNativeVideoController().ivm();
    }

    public void handleInterruptVideo() {
        if (oa()) {
            return;
        }
        uef();
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        moa.uef(this, this.moa);
    }

    public void setMaterialMeta(gzw gzwVar) {
        this.moa = gzwVar;
    }

    @Override // android.view.View
    public void setOnClickListener(View.OnClickListener onClickListener) {
        super.setOnClickListener(onClickListener);
        if (onClickListener instanceof uef) {
            ((uef) onClickListener).uef((uef.InterfaceC0112uef) this);
        }
    }

    @Override // com.bytedance.sdk.openadsdk.api.nativeAd.PAGMediaView
    public void setVideoAdListener(final PAGVideoAdListener pAGVideoAdListener) {
        com.bytedance.sdk.openadsdk.uef.oa.uef uefVar = this.yo;
        if (uefVar == null) {
            return;
        }
        uefVar.uef(new PAGVideoAdListener() { // from class: com.bytedance.sdk.openadsdk.api.nativeAd.PAGVideoMediaView.1
            @Override // com.bytedance.sdk.openadsdk.api.nativeAd.PAGVideoAdListener
            public void onVideoAdComplete() {
                PAGVideoAdListener pAGVideoAdListener2 = pAGVideoAdListener;
                if (pAGVideoAdListener2 != null) {
                    pAGVideoAdListener2.onVideoAdComplete();
                }
            }

            @Override // com.bytedance.sdk.openadsdk.api.nativeAd.PAGVideoAdListener
            public void onVideoAdPaused() {
                PAGVideoAdListener pAGVideoAdListener2 = pAGVideoAdListener;
                if (pAGVideoAdListener2 != null) {
                    pAGVideoAdListener2.onVideoAdPaused();
                }
            }

            @Override // com.bytedance.sdk.openadsdk.api.nativeAd.PAGVideoAdListener
            public void onVideoAdPlay() {
                PAGVideoAdListener pAGVideoAdListener2 = pAGVideoAdListener;
                if (pAGVideoAdListener2 != null) {
                    pAGVideoAdListener2.onVideoAdPlay();
                }
            }

            @Override // com.bytedance.sdk.openadsdk.api.nativeAd.PAGVideoAdListener
            public void onVideoError() {
                PAGVideoAdListener pAGVideoAdListener2 = pAGVideoAdListener;
                if (pAGVideoAdListener2 != null) {
                    pAGVideoAdListener2.onVideoError();
                }
            }
        });
    }

    private void uef() {
        ivm ivmVar = this.f25280oa;
        if (ivmVar != null) {
            ivmVar.wk();
        }
    }
}
