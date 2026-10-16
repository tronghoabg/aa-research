package com.unity3d.services.ads.gmascar.handlers;

import com.unity3d.scar.adapter.common.b;
import com.unity3d.services.ads.gmascar.utils.GMAEventSender;
import com.unity3d.services.core.misc.EventSubject;
import nb.c;

/* loaded from: classes4.dex */
public class ScarRewardedAdHandler extends ScarAdHandlerBase {
    private boolean _hasEarnedReward;

    public ScarRewardedAdHandler(c cVar, EventSubject<b> eventSubject, GMAEventSender gMAEventSender) {
        super(cVar, eventSubject, gMAEventSender);
        this._hasEarnedReward = false;
    }

    @Override // com.unity3d.services.ads.gmascar.handlers.ScarAdHandlerBase, com.unity3d.scar.adapter.common.d
    public void onAdClosed() {
        if (!this._hasEarnedReward) {
            onAdSkipped();
        }
        super.onAdClosed();
    }

    public void onAdFailedToShow(int i5, String str) {
        GMAEventSender gMAEventSender = this._gmaEventSender;
        b bVar = b.f32705t;
        c cVar = this._scarAdMetadata;
        gMAEventSender.send(bVar, cVar.f41000a, cVar.f41001b, str, Integer.valueOf(i5));
    }

    public void onAdImpression() {
        this._gmaEventSender.send(b.f32698m, new Object[0]);
    }

    public void onAdSkipped() {
        this._gmaEventSender.send(b.f32681B, new Object[0]);
    }

    public void onUserEarnedReward() {
        this._hasEarnedReward = true;
        this._gmaEventSender.send(b.f32711z, new Object[0]);
    }
}
