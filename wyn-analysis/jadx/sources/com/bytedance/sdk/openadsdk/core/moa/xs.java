package com.bytedance.sdk.openadsdk.core.moa;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import com.bytedance.sdk.component.utils.dhk;
import com.bytedance.sdk.openadsdk.AdSlot;
import com.bytedance.sdk.openadsdk.api.banner.PAGBannerAd;
import com.bytedance.sdk.openadsdk.api.banner.PAGBannerAdInteractionCallback;
import com.bytedance.sdk.openadsdk.api.banner.PAGBannerAdInteractionListener;
import com.bytedance.sdk.openadsdk.api.banner.PAGBannerSize;
import com.bytedance.sdk.openadsdk.api.model.PAGErrorModel;
import com.bytedance.sdk.openadsdk.core.model.gzw;
import com.bytedance.sdk.openadsdk.utils.af;
import com.bytedance.sdk.openadsdk.utils.fz;
import com.unity3d.ads.metadata.InAppPurchaseMetaData;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes3.dex */
public class xs extends PAGBannerAd {
    private int bcc;
    private int cz;
    private List<com.bytedance.sdk.openadsdk.core.moa.uef> dj;
    private lw ivm;
    private boolean lw;
    private boolean moa;

    /* renamed from: oa, reason: collision with root package name */
    protected gzw f25653oa;
    protected Context uef;
    private boolean xs;
    protected AdSlot yo;
    private final AtomicBoolean zjm = new AtomicBoolean(false);

    public interface uef {
        void uef();
    }

    public xs(Context context, gzw gzwVar, AdSlot adSlot) {
        this.bcc = 0;
        this.cz = 0;
        this.uef = context;
        this.f25653oa = gzwVar;
        this.yo = adSlot;
        this.bcc = (int) adSlot.getExpressViewAcceptedWidth();
        this.cz = (int) this.yo.getExpressViewAcceptedHeight();
        uef(this.f25653oa);
        oa(gzwVar);
    }

    private void oa(gzw gzwVar) {
        com.bytedance.sdk.openadsdk.core.model.uef uefVarMoa;
        if (gzwVar == null || (uefVarMoa = gzwVar.moa()) == null) {
            return;
        }
        this.dj = new ArrayList();
        int size = uefVarMoa.lw().size();
        if (!this.xs) {
            this.dj.add(new com.bytedance.sdk.openadsdk.core.moa.uef(this.uef, gzwVar, this.yo, this, false));
            return;
        }
        this.ivm = new lw(uefVarMoa.bcc(), this.uef, this.bcc, this.cz);
        for (int i5 = 0; i5 < size; i5++) {
            this.yo.setExpressViewAccepted(((this.bcc - af.yo(this.uef, uefVarMoa.bcc().lw())) - af.yo(this.uef, uefVarMoa.bcc().ivm())) - (af.yo(this.uef, uefVarMoa.bcc().xs()) * 2), this.cz);
            gzw gzwVar2 = uefVarMoa.lw().get(i5);
            if (i5 != 0) {
                uef(i5, gzwVar2);
            }
            com.bytedance.sdk.openadsdk.core.moa.uef uefVar = new com.bytedance.sdk.openadsdk.core.moa.uef(this.uef, gzwVar2, this.yo, this, true);
            uefVar.uef(i5);
            this.dj.add(uefVar);
        }
        this.ivm.uef(this.dj);
    }

    @Override // com.bytedance.sdk.openadsdk.api.banner.PAGBannerAd
    public void destroy() {
        try {
            List<com.bytedance.sdk.openadsdk.core.moa.uef> list = this.dj;
            if (list == null || list.isEmpty()) {
                return;
            }
            if (this.xs) {
                this.ivm.uef();
            } else {
                this.dj.get(0).xs();
            }
        } catch (Throwable unused) {
        }
    }

    @Override // com.bytedance.sdk.openadsdk.api.banner.PAGBannerAd
    public PAGBannerSize getBannerSize() {
        return this.yo != null ? new PAGBannerSize(this.bcc, this.cz) : new PAGBannerSize(0, 0);
    }

    @Override // com.bytedance.sdk.openadsdk.api.banner.PAGBannerAd
    public View getBannerView() {
        try {
            List<com.bytedance.sdk.openadsdk.core.moa.uef> list = this.dj;
            if (list != null && !list.isEmpty()) {
                return this.xs ? this.ivm.oa() : this.dj.get(0).uef();
            }
        } catch (Throwable unused) {
        }
        return new View(this.uef);
    }

    @Override // com.bytedance.sdk.openadsdk.api.PangleAd
    public Object getExtraInfo(String str) {
        gzw gzwVar = this.f25653oa;
        if (gzwVar == null || gzwVar.hjx() == null) {
            return null;
        }
        try {
            return this.f25653oa.hjx().get(str);
        } catch (Throwable th) {
            dhk.yo("PAGBannerAdImpl", th.getMessage());
            return null;
        }
    }

    @Override // com.bytedance.sdk.openadsdk.api.PangleAd
    public Map<String, Object> getMediaExtraInfo() {
        gzw gzwVar = this.f25653oa;
        if (gzwVar != null) {
            return gzwVar.hjx();
        }
        return null;
    }

    @Override // com.bytedance.sdk.openadsdk.api.PAGClientBidding
    public void loss(Double d3, String str, String str2) {
        if (this.lw) {
            return;
        }
        fz.uef(this.f25653oa, d3, str, str2);
        this.lw = true;
    }

    @Override // com.bytedance.sdk.openadsdk.api.banner.PAGBannerAd
    public void setAdInteractionCallback(final PAGBannerAdInteractionCallback pAGBannerAdInteractionCallback) {
        List<com.bytedance.sdk.openadsdk.core.moa.uef> list = this.dj;
        if (list == null || list.isEmpty()) {
            return;
        }
        for (int i5 = 0; i5 < this.dj.size(); i5++) {
            this.dj.get(i5).uef(new PAGBannerAdInteractionCallback() { // from class: com.bytedance.sdk.openadsdk.core.moa.xs.1
                @Override // com.bytedance.sdk.openadsdk.api.banner.PAGBannerAdInteractionCallback, com.bytedance.sdk.openadsdk.api.PAGAdListener
                public void onAdClicked() {
                    PAGBannerAdInteractionCallback pAGBannerAdInteractionCallback2 = pAGBannerAdInteractionCallback;
                    if (pAGBannerAdInteractionCallback2 != null) {
                        pAGBannerAdInteractionCallback2.onAdClicked();
                    }
                }

                @Override // com.bytedance.sdk.openadsdk.api.banner.PAGBannerAdInteractionCallback, com.bytedance.sdk.openadsdk.api.PAGAdListener
                public void onAdDismissed() {
                    PAGBannerAdInteractionCallback pAGBannerAdInteractionCallback2 = pAGBannerAdInteractionCallback;
                    if (pAGBannerAdInteractionCallback2 != null) {
                        pAGBannerAdInteractionCallback2.onAdDismissed();
                    }
                }

                @Override // com.bytedance.sdk.openadsdk.api.banner.PAGBannerAdInteractionCallback
                public void onAdShowFailed(PAGErrorModel pAGErrorModel) {
                    PAGBannerAdInteractionCallback pAGBannerAdInteractionCallback2 = pAGBannerAdInteractionCallback;
                    if (pAGBannerAdInteractionCallback2 != null) {
                        pAGBannerAdInteractionCallback2.onAdShowFailed(pAGErrorModel);
                    }
                }

                @Override // com.bytedance.sdk.openadsdk.api.banner.PAGBannerAdInteractionCallback, com.bytedance.sdk.openadsdk.api.PAGAdListener
                public void onAdShowed() {
                    PAGBannerAdInteractionCallback pAGBannerAdInteractionCallback2;
                    if (!xs.this.zjm.compareAndSet(false, true) || (pAGBannerAdInteractionCallback2 = pAGBannerAdInteractionCallback) == null) {
                        return;
                    }
                    pAGBannerAdInteractionCallback2.onAdShowed();
                }
            });
        }
    }

    @Override // com.bytedance.sdk.openadsdk.api.banner.PAGBannerAd
    public void setAdInteractionListener(final PAGBannerAdInteractionListener pAGBannerAdInteractionListener) {
        List<com.bytedance.sdk.openadsdk.core.moa.uef> list = this.dj;
        if (list == null || list.isEmpty()) {
            return;
        }
        for (int i5 = 0; i5 < this.dj.size(); i5++) {
            this.dj.get(i5).uef(new PAGBannerAdInteractionListener() { // from class: com.bytedance.sdk.openadsdk.core.moa.xs.2
                @Override // com.bytedance.sdk.openadsdk.api.PAGAdListener
                public void onAdClicked() {
                    PAGBannerAdInteractionListener pAGBannerAdInteractionListener2 = pAGBannerAdInteractionListener;
                    if (pAGBannerAdInteractionListener2 != null) {
                        pAGBannerAdInteractionListener2.onAdClicked();
                    }
                }

                @Override // com.bytedance.sdk.openadsdk.api.PAGAdListener
                public void onAdDismissed() {
                    PAGBannerAdInteractionListener pAGBannerAdInteractionListener2 = pAGBannerAdInteractionListener;
                    if (pAGBannerAdInteractionListener2 != null) {
                        pAGBannerAdInteractionListener2.onAdDismissed();
                    }
                }

                @Override // com.bytedance.sdk.openadsdk.api.PAGAdListener
                public void onAdShowed() {
                    PAGBannerAdInteractionListener pAGBannerAdInteractionListener2;
                    if (!xs.this.zjm.compareAndSet(false, true) || (pAGBannerAdInteractionListener2 = pAGBannerAdInteractionListener) == null) {
                        return;
                    }
                    pAGBannerAdInteractionListener2.onAdShowed();
                }
            });
        }
    }

    @Override // com.bytedance.sdk.openadsdk.api.PAGClientBidding
    public void win(Double d3) {
        if (this.moa) {
            return;
        }
        fz.uef(this.f25653oa, d3);
        this.moa = true;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x001a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void uef(com.bytedance.sdk.openadsdk.core.model.gzw r2) {
        /*
            r1 = this;
            if (r2 == 0) goto L1d
            com.bytedance.sdk.openadsdk.core.model.uef r2 = r2.moa()
            if (r2 == 0) goto L1d
            boolean r0 = r2.cz()
            if (r0 == 0) goto L1a
            java.util.List r2 = r2.lw()
            int r2 = r2.size()
            r0 = 1
            if (r2 <= r0) goto L1a
            goto L1b
        L1a:
            r0 = 0
        L1b:
            r1.xs = r0
        L1d:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.sdk.openadsdk.core.moa.xs.uef(com.bytedance.sdk.openadsdk.core.model.gzw):void");
    }

    public boolean uef() {
        return this.xs;
    }

    private void uef(int i5, gzw gzwVar) {
        if (i5 != 0) {
            if (!TextUtils.isEmpty(gzwVar.dh())) {
                gzwVar.dz("0");
            }
            Map<String, Object> mapHjx = gzwVar.hjx();
            if (mapHjx == null || !mapHjx.containsKey(InAppPurchaseMetaData.KEY_PRICE)) {
                return;
            }
            mapHjx.put(InAppPurchaseMetaData.KEY_PRICE, "0");
        }
    }
}
