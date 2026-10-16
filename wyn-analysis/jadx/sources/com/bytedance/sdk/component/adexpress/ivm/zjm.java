package com.bytedance.sdk.component.adexpress.ivm;

import N0.a;
import android.content.Context;
import android.graphics.Bitmap;
import android.text.TextUtils;
import com.unity3d.services.UnityAdsConstants;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes.dex */
public class zjm extends com.bytedance.adsdk.oa.ivm {

    /* renamed from: oa, reason: collision with root package name */
    private String f24919oa;
    private Map<String, Bitmap> uef;

    public static class uef implements com.bytedance.sdk.component.lw.ab {
        private final Map<String, Bitmap> moa;

        /* renamed from: oa, reason: collision with root package name */
        private final com.bytedance.adsdk.oa.zjm f24921oa;
        private final WeakReference<zjm> uef;
        private final String yo;

        public uef(zjm zjmVar, com.bytedance.adsdk.oa.zjm zjmVar2, String str, Map<String, Bitmap> map) {
            this.uef = new WeakReference<>(zjmVar);
            this.f24921oa = zjmVar2;
            this.yo = str;
            this.moa = map;
        }

        @Override // com.bytedance.sdk.component.lw.ab
        public void uef(int i5, String str, Throwable th) {
        }

        @Override // com.bytedance.sdk.component.lw.ab
        public void uef(com.bytedance.sdk.component.lw.dj djVar) {
            Object objOa = djVar.oa();
            if (objOa instanceof Bitmap) {
                Bitmap bitmapCreateScaledBitmap = Bitmap.createScaledBitmap((Bitmap) objOa, this.f24921oa.uef(), this.f24921oa.oa(), false);
                this.moa.put(this.yo, bitmapCreateScaledBitmap);
                zjm zjmVar = this.uef.get();
                if (zjmVar != null) {
                    zjmVar.uef(this.f24921oa.bcc(), bitmapCreateScaledBitmap);
                }
            }
        }
    }

    public zjm(Context context) {
        super(context);
        this.uef = new HashMap();
    }

    public void bcc() {
        if (TextUtils.isEmpty(this.f24919oa)) {
            return;
        }
        setProgress(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
        uef(true);
        setAnimationFromUrl(this.f24919oa);
        setImageAssetDelegate(new com.bytedance.adsdk.oa.moa() { // from class: com.bytedance.sdk.component.adexpress.ivm.zjm.1
            @Override // com.bytedance.adsdk.oa.moa
            public Bitmap uef(final com.bytedance.adsdk.oa.zjm zjmVar) {
                final String strBcc = zjmVar.bcc();
                String strZjm = zjmVar.zjm();
                String strCz = zjmVar.cz();
                if (TextUtils.equals(strBcc, "image_0") && TextUtils.equals(strCz, "Lark20201123-180048_2.png")) {
                    strCz = "hand.png";
                }
                Bitmap bitmap = (Bitmap) zjm.this.uef.get(strBcc);
                if (bitmap != null) {
                    return bitmap;
                }
                if (TextUtils.isEmpty(strZjm) || !TextUtils.isEmpty(strCz)) {
                    strZjm = (TextUtils.isEmpty(strCz) || !TextUtils.isEmpty(strZjm)) ? (TextUtils.isEmpty(strCz) || TextUtils.isEmpty(strZjm)) ? "" : a.f(strZjm, strCz) : strCz;
                }
                if (TextUtils.isEmpty(strZjm)) {
                    return null;
                }
                com.bytedance.sdk.component.lw.zjm zjmVarUef = com.bytedance.sdk.component.adexpress.uef.uef.uef.uef().lw().uef(strZjm).yo(2).uef(new com.bytedance.sdk.component.lw.bcc() { // from class: com.bytedance.sdk.component.adexpress.ivm.zjm.1.1
                    @Override // com.bytedance.sdk.component.lw.bcc
                    public Bitmap uef(Bitmap bitmap2) {
                        Bitmap bitmapCreateScaledBitmap = Bitmap.createScaledBitmap(bitmap2, zjmVar.uef(), zjmVar.oa(), false);
                        zjm.this.uef.put(strBcc, bitmapCreateScaledBitmap);
                        return bitmapCreateScaledBitmap;
                    }
                });
                zjm zjmVar2 = zjm.this;
                zjmVarUef.uef(new uef(zjmVar2, zjmVar, strBcc, zjmVar2.uef));
                return (Bitmap) zjm.this.uef.get(strBcc);
            }
        });
        uef();
    }

    public void setAnimationsLoop(boolean z2) {
    }

    public void setData(Map<String, String> map) {
    }

    public void setImageLottieTosPath(String str) {
        this.f24919oa = str;
    }

    public void setLottieAdDescMaxLength(int i5) {
    }

    public void setLottieAdTitleMaxLength(int i5) {
    }

    public void setLottieAppNameMaxLength(int i5) {
    }
}
