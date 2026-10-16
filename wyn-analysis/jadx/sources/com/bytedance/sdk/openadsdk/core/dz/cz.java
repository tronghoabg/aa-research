package com.bytedance.sdk.openadsdk.core.dz;

import android.view.View;
import com.iab.omid.library.bytedance2.adsession.AdEvents;
import com.iab.omid.library.bytedance2.adsession.AdSession;
import com.iab.omid.library.bytedance2.adsession.media.InteractionType;
import com.iab.omid.library.bytedance2.adsession.media.MediaEvents;
import com.iab.omid.library.bytedance2.adsession.media.PlayerState;
import com.iab.omid.library.bytedance2.adsession.media.Position;
import com.iab.omid.library.bytedance2.adsession.media.VastProperties;
import com.unity3d.services.UnityAdsConstants;
import org.json.JSONException;

/* loaded from: classes3.dex */
public class cz extends xs {
    private boolean ivm;
    private final MediaEvents lw;

    public cz(AdSession adSession, AdEvents adEvents, View view, MediaEvents mediaEvents) {
        super(adSession, adEvents, view);
        this.lw = mediaEvents;
    }

    @Override // com.bytedance.sdk.openadsdk.core.dz.xs
    public void oa(int i5) throws JSONException {
        if (uef()) {
            switch (i5) {
                case 0:
                    this.lw.pause();
                    break;
                case 1:
                    this.lw.resume();
                    break;
                case 2:
                case 14:
                    this.lw.skipped();
                    break;
                case 4:
                    this.lw.bufferStart();
                    break;
                case 5:
                    this.lw.bufferFinish();
                    break;
                case 6:
                    this.lw.firstQuartile();
                    break;
                case 7:
                    this.lw.midpoint();
                    break;
                case 8:
                    this.lw.thirdQuartile();
                    break;
                case 9:
                    this.lw.complete();
                    break;
                case 10:
                    this.lw.playerStateChange(PlayerState.FULLSCREEN);
                    break;
                case 11:
                    this.lw.playerStateChange(PlayerState.NORMAL);
                    break;
                case 12:
                    this.lw.volumeChange(this.ivm ? UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT : 1.0f);
                    break;
                case 13:
                    this.lw.adUserInteraction(InteractionType.CLICK);
                    break;
            }
        }
    }

    @Override // com.bytedance.sdk.openadsdk.core.dz.xs
    public void uef(boolean z2, float f10) {
        if (z2) {
            this.moa = VastProperties.createVastPropertiesForSkippableMedia(f10, true, Position.STANDALONE);
        } else {
            this.moa = VastProperties.createVastPropertiesForNonSkippableMedia(true, Position.STANDALONE);
        }
        uef(2);
    }

    @Override // com.bytedance.sdk.openadsdk.core.dz.xs
    public void uef(float f10, boolean z2) throws JSONException {
        if (uef()) {
            this.lw.start(f10, z2 ? UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT : 1.0f);
        }
    }

    @Override // com.bytedance.sdk.openadsdk.core.dz.xs
    public void uef(boolean z2) throws JSONException {
        this.ivm = z2;
        oa(12);
    }
}
