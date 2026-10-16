package com.bytedance.sdk.openadsdk.uef.oa;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.sdk.component.utils.dhk;
import com.bytedance.sdk.openadsdk.activity.single.TTDelegateActivity;
import com.bytedance.sdk.openadsdk.api.nativeAd.PAGMediaView;
import com.bytedance.sdk.openadsdk.api.nativeAd.PAGNativeAd;
import com.bytedance.sdk.openadsdk.api.nativeAd.PAGNativeAdData;
import com.bytedance.sdk.openadsdk.api.nativeAd.PAGNativeAdInteractionCallback;
import com.bytedance.sdk.openadsdk.api.nativeAd.PAGNativeAdInteractionListener;
import com.bytedance.sdk.openadsdk.core.bs;
import com.bytedance.sdk.openadsdk.core.moa.xs;
import com.bytedance.sdk.openadsdk.core.model.gzw;
import com.bytedance.sdk.openadsdk.core.sy;
import com.bytedance.sdk.openadsdk.core.zjm;
import com.bytedance.sdk.openadsdk.gsd.oa.lw;
import com.bytedance.sdk.openadsdk.utils.fz;
import com.bytedance.sdk.openadsdk.utils.gb;
import com.bytedance.sdk.openadsdk.utils.ue;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

/* loaded from: classes3.dex */
public class bcc extends PAGNativeAd {
    private boolean bcc;
    private boolean cz;
    protected int ivm;
    protected int lw;
    protected uef moa;

    /* renamed from: oa, reason: collision with root package name */
    protected final gzw f26109oa;
    protected bs uef;
    protected String xs;
    protected final Context yo;

    public bcc(Context context, gzw gzwVar, int i5, boolean z2) {
        this.f26109oa = gzwVar;
        this.yo = context;
        this.lw = i5;
        this.ivm = gzwVar.jnk();
        String strYo = gb.yo(i5);
        this.xs = strYo;
        if (z2) {
            this.moa = new uef(context, gzwVar, strYo);
            this.uef = new bs(context, this, gzwVar, uef(i5), this.moa);
        }
    }

    private List<View> uef(List<View> list, List<View> list2) {
        LinkedList linkedList = new LinkedList();
        if (list != null && !list.isEmpty()) {
            int size = list.size();
            for (int i5 = 0; i5 < size; i5++) {
                linkedList.add(list.get(i5));
            }
        }
        if (list2 != null && !list2.isEmpty()) {
            int size2 = list2.size();
            for (int i10 = 0; i10 < size2; i10++) {
                linkedList.add(list2.get(i10));
            }
        }
        return linkedList;
    }

    public uef bcc() {
        return this.moa;
    }

    @Override // com.bytedance.sdk.openadsdk.api.PangleAd
    public Object getExtraInfo(String str) {
        gzw gzwVar = this.f26109oa;
        if (gzwVar == null || gzwVar.hjx() == null) {
            return null;
        }
        try {
            return this.f26109oa.hjx().get(str);
        } catch (Throwable th) {
            dhk.yo("TTNativeAdImpl", th.getMessage());
            return null;
        }
    }

    @Override // com.bytedance.sdk.openadsdk.api.PangleAd
    public Map<String, Object> getMediaExtraInfo() {
        gzw gzwVar = this.f26109oa;
        if (gzwVar != null) {
            return gzwVar.hjx();
        }
        return null;
    }

    @Override // com.bytedance.sdk.openadsdk.api.nativeAd.PAGNativeAd
    public PAGNativeAdData getNativeAdData() {
        return new moa(bcc());
    }

    @Override // com.bytedance.sdk.openadsdk.api.PAGClientBidding
    public void loss(Double d3, String str, String str2) {
        if (this.cz) {
            return;
        }
        fz.uef(this.f26109oa, d3, str, str2);
        this.cz = true;
    }

    @Override // com.bytedance.sdk.openadsdk.api.nativeAd.PAGNativeAd
    public void registerViewForInteraction(ViewGroup viewGroup, List<View> list, List<View> list2, View view, PAGNativeAdInteractionListener pAGNativeAdInteractionListener) {
        if (viewGroup == null || list == null || list.size() <= 0) {
            return;
        }
        uef(viewGroup, null, list, list2, view, new xs(pAGNativeAdInteractionListener));
    }

    @Override // com.bytedance.sdk.openadsdk.api.nativeAd.PAGNativeAd
    public void showPrivacyActivity() {
    }

    @Override // com.bytedance.sdk.openadsdk.api.PAGClientBidding
    public void win(Double d3) {
        if (this.bcc) {
            return;
        }
        fz.uef(this.f26109oa, d3);
        this.bcc = true;
    }

    public boolean xs() {
        gzw gzwVar = this.f26109oa;
        return (gzwVar == null || gzwVar.ykf() == 5 || sy.moa().yo(this.ivm) != 1) ? false : true;
    }

    @Override // com.bytedance.sdk.openadsdk.api.nativeAd.PAGNativeAd
    public void registerViewForInteraction(ViewGroup viewGroup, List<View> list, List<View> list2, View view, PAGNativeAdInteractionCallback pAGNativeAdInteractionCallback) {
        registerViewForInteraction(viewGroup, list, list2, view, (PAGNativeAdInteractionListener) pAGNativeAdInteractionCallback);
    }

    private String uef(int i5) {
        if (i5 == 1) {
            return "banner_ad";
        }
        if (i5 != 2) {
            return "embeded_ad";
        }
        return "interaction";
    }

    public void uef(String str) {
        this.xs = str;
    }

    public void uef(ViewGroup viewGroup, List<View> list, List<View> list2, List<View> list3, View view, final ivm ivmVar) {
        if (viewGroup == null || list2 == null || list2.size() <= 0) {
            return;
        }
        if (xs()) {
            list3 = uef(list2, list3);
        }
        List<View> list4 = list3;
        if (view != null && ivmVar != null && ivmVar.oa()) {
            view.setOnClickListener(new View.OnClickListener() { // from class: com.bytedance.sdk.openadsdk.uef.oa.bcc.1
                @Override // android.view.View.OnClickListener
                public void onClick(View view2) {
                    final String strUef = ue.uef();
                    TTDelegateActivity.uef(bcc.this.f26109oa, strUef, new xs.uef() { // from class: com.bytedance.sdk.openadsdk.uef.oa.bcc.1.1
                        @Override // com.bytedance.sdk.openadsdk.core.moa.xs.uef
                        public void uef() {
                            ivmVar.uef();
                            zjm.oa().ivm(strUef);
                            PAGMediaView pAGMediaViewUef = bcc.this.bcc().uef();
                            if (pAGMediaViewUef != null) {
                                pAGMediaViewUef.close();
                            }
                        }
                    });
                }
            });
        }
        this.uef.uef(viewGroup, list, list2, list4, ivmVar);
        gzw gzwVar = this.f26109oa;
        com.bytedance.sdk.openadsdk.gsd.oa.lw.uef(viewGroup, this.f26109oa, (gzwVar == null || gzwVar.ggp() != 2) ? null : new lw.uef(this.f26109oa.ix()));
    }
}
