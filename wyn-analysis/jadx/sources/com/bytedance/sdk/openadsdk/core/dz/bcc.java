package com.bytedance.sdk.openadsdk.core.dz;

import android.text.TextUtils;
import android.view.View;
import android.webkit.WebView;
import com.iab.omid.library.bytedance2.adsession.AdEvents;
import com.iab.omid.library.bytedance2.adsession.AdSession;
import com.iab.omid.library.bytedance2.adsession.AdSessionConfiguration;
import com.iab.omid.library.bytedance2.adsession.AdSessionContext;
import com.iab.omid.library.bytedance2.adsession.CreativeType;
import com.iab.omid.library.bytedance2.adsession.ImpressionType;
import com.iab.omid.library.bytedance2.adsession.Owner;
import com.iab.omid.library.bytedance2.adsession.Partner;
import com.iab.omid.library.bytedance2.adsession.VerificationScriptResource;
import com.iab.omid.library.bytedance2.adsession.media.MediaEvents;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

/* loaded from: classes3.dex */
public class bcc {
    public static xs uef(View view, Set<zjm> set) {
        AdSession adSessionUef = uef(CreativeType.VIDEO, set, Owner.NATIVE);
        return new cz(adSessionUef, AdEvents.createAdEvents(adSessionUef), view, MediaEvents.createMediaEvents(adSessionUef));
    }

    public static xs uef(WebView webView) {
        Partner partnerUef = lw.uef();
        if (partnerUef != null) {
            AdSession adSessionCreateAdSession = AdSession.createAdSession(AdSessionConfiguration.createAdSessionConfiguration(CreativeType.HTML_DISPLAY, ImpressionType.BEGIN_TO_RENDER, Owner.NATIVE, Owner.NONE, false), AdSessionContext.createHtmlAdSessionContext(partnerUef, webView, "", ""));
            return new xs(adSessionCreateAdSession, AdEvents.createAdEvents(adSessionCreateAdSession), webView);
        }
        throw new IllegalArgumentException("Parameter 'partner' may not be null.");
    }

    private static AdSession uef(CreativeType creativeType, Set<zjm> set, Owner owner) {
        List<VerificationScriptResource> listUef = uef(set);
        listUef.isEmpty();
        Partner partnerUef = lw.uef();
        if (partnerUef == null) {
            return null;
        }
        return AdSession.createAdSession(AdSessionConfiguration.createAdSessionConfiguration(creativeType, ImpressionType.BEGIN_TO_RENDER, Owner.NATIVE, owner, false), AdSessionContext.createNativeAdSessionContext(partnerUef, lw.oa(), listUef, "", ""));
    }

    private static List<VerificationScriptResource> uef(Set<zjm> set) {
        ArrayList arrayList = new ArrayList();
        for (zjm zjmVar : set) {
            try {
                if (!TextUtils.isEmpty(zjmVar.uef()) && !TextUtils.isEmpty(zjmVar.oa())) {
                    arrayList.add(VerificationScriptResource.createVerificationScriptResourceWithParameters(zjmVar.uef(), zjmVar.yo(), zjmVar.oa()));
                } else {
                    arrayList.add(VerificationScriptResource.createVerificationScriptResourceWithoutParameters(zjmVar.yo()));
                }
            } catch (Throwable unused) {
            }
        }
        return arrayList;
    }
}
