package com.unity3d.ads.core.domain.om;

import Ma.f;
import Ma.g;
import Ma.h;
import android.webkit.WebView;
import com.unity3d.ads.adplayer.AdPlayer;
import com.unity3d.ads.adplayer.AndroidEmbeddableWebViewAdPlayer;
import com.unity3d.ads.adplayer.AndroidFullscreenWebViewAdPlayer;
import com.unity3d.ads.core.data.model.AdObject;
import com.unity3d.ads.core.data.model.OmidOptions;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC3340k;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONObject;

@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b&\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\n\u001a\u00020\t2\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\r\u001a\u00020\f2\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u000f\u001a\u00020\f2\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u000f\u0010\u000eJ\u0017\u0010\u0010\u001a\u00020\f2\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0010\u0010\u000eJ\u0019\u0010\u0014\u001a\u0004\u0018\u00010\u00132\u0006\u0010\u0012\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u0014\u0010\u0015J\u0017\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0017\u0010\u0018¨\u0006\u0019"}, d2 = {"Lcom/unity3d/ads/core/domain/om/AndroidOmInteraction;", "Lcom/unity3d/ads/core/domain/om/OmInteraction;", "<init>", "()V", "Lorg/json/JSONObject;", "options", "LMa/g;", "getImpressionType", "(Lorg/json/JSONObject;)LMa/g;", "LMa/f;", "getCreativeType", "(Lorg/json/JSONObject;)LMa/f;", "LMa/h;", "getVideoEventsOwner", "(Lorg/json/JSONObject;)LMa/h;", "getMediaEventsOwner", "getImpressionsOwner", "Lcom/unity3d/ads/core/data/model/AdObject;", "adObject", "Landroid/webkit/WebView;", "getWebview", "(Lcom/unity3d/ads/core/data/model/AdObject;)Landroid/webkit/WebView;", "Lcom/unity3d/ads/core/data/model/OmidOptions;", "getOMidOptions", "(Lorg/json/JSONObject;)Lcom/unity3d/ads/core/data/model/OmidOptions;", "unity-ads_defaultRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes4.dex */
public abstract class AndroidOmInteraction implements OmInteraction {
    private final f getCreativeType(JSONObject options) {
        int iOptInt = options.optInt("creativeType");
        if (iOptInt == 1) {
            return f.DEFINED_BY_JAVASCRIPT;
        }
        if (iOptInt == 2) {
            return f.HTML_DISPLAY;
        }
        if (iOptInt == 3) {
            return f.NATIVE_DISPLAY;
        }
        if (iOptInt == 4) {
            return f.VIDEO;
        }
        if (iOptInt == 5) {
            return f.AUDIO;
        }
        throw new IllegalArgumentException("Invalid creativeType");
    }

    private final g getImpressionType(JSONObject options) {
        switch (options.optInt("impressionType")) {
            case 1:
                return g.DEFINED_BY_JAVASCRIPT;
            case 2:
                return g.UNSPECIFIED;
            case 3:
                return g.LOADED;
            case 4:
                return g.BEGIN_TO_RENDER;
            case 5:
                return g.ONE_PIXEL;
            case 6:
                return g.VIEWABLE;
            case 7:
                return g.AUDIBLE;
            case 8:
                return g.OTHER;
            default:
                throw new IllegalArgumentException("Invalid impressionType");
        }
    }

    private final h getImpressionsOwner(JSONObject options) {
        h hVar = h.NONE;
        try {
            int iOptInt = options.optInt("impressionOwner");
            if (iOptInt == 1) {
                return h.JAVASCRIPT;
            }
            if (iOptInt == 2) {
                return h.NATIVE;
            }
            if (iOptInt == 3) {
                return hVar;
            }
            throw new IllegalArgumentException("Invalid impressionOwner");
        } catch (IllegalArgumentException unused) {
            return hVar;
        }
    }

    private final h getMediaEventsOwner(JSONObject options) {
        h hVar = h.NONE;
        try {
            int iOptInt = options.optInt("mediaEventsOwner");
            if (iOptInt == 1) {
                return h.JAVASCRIPT;
            }
            if (iOptInt == 2) {
                return h.NATIVE;
            }
            if (iOptInt == 3) {
                return hVar;
            }
            throw new IllegalArgumentException("Invalid mediaEventsOwner");
        } catch (IllegalArgumentException unused) {
            return hVar;
        }
    }

    private final h getVideoEventsOwner(JSONObject options) {
        h hVar = h.NONE;
        try {
            int iOptInt = options.optInt("videoEventsOwner");
            if (iOptInt == 1) {
                return h.JAVASCRIPT;
            }
            if (iOptInt == 2) {
                return h.NATIVE;
            }
            if (iOptInt == 3) {
                return hVar;
            }
            throw new IllegalArgumentException("Invalid videoEventsOwner");
        } catch (IllegalArgumentException unused) {
            return hVar;
        }
    }

    @Override // com.unity3d.ads.core.domain.om.OmInteraction
    @NotNull
    public OmidOptions getOMidOptions(@NotNull JSONObject options) {
        AbstractC3340k.e(options, "options");
        return new OmidOptions(options.optBoolean("isolateVerificationScripts"), getImpressionsOwner(options), getVideoEventsOwner(options), options.optString("customReferenceData"), getImpressionType(options), getCreativeType(options), getMediaEventsOwner(options));
    }

    @Override // com.unity3d.ads.core.domain.om.OmInteraction
    @Nullable
    public WebView getWebview(@NotNull AdObject adObject) {
        AbstractC3340k.e(adObject, "adObject");
        AdPlayer adPlayer = adObject.getAdPlayer();
        if (adPlayer instanceof AndroidFullscreenWebViewAdPlayer) {
            return ((AndroidFullscreenWebViewAdPlayer) adPlayer).getWebViewContainer().getWebView();
        }
        if (adPlayer instanceof AndroidEmbeddableWebViewAdPlayer) {
            return ((AndroidEmbeddableWebViewAdPlayer) adPlayer).getWebViewContainer().getWebView();
        }
        return null;
    }
}
