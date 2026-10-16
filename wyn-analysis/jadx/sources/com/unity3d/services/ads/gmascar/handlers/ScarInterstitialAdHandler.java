package com.unity3d.services.ads.gmascar.handlers;

import com.unity3d.scar.adapter.common.b;
import com.unity3d.services.ads.gmascar.utils.GMAEventSender;
import com.unity3d.services.core.misc.EventSubject;
import nb.c;

/* loaded from: classes4.dex */
public class ScarInterstitialAdHandler extends ScarAdHandlerBase {
    public ScarInterstitialAdHandler(c cVar, EventSubject<b> eventSubject, GMAEventSender gMAEventSender) {
        super(cVar, eventSubject, gMAEventSender);
    }

    @Override // com.unity3d.services.ads.gmascar.handlers.ScarAdHandlerBase, com.unity3d.scar.adapter.common.d
    public void onAdClosed() {
        if (!this._eventSubject.eventQueueIsEmpty()) {
            onAdSkipped();
        }
        super.onAdClosed();
    }

    public void onAdFailedToShow(int i5, String str) {
        GMAEventSender gMAEventSender = this._gmaEventSender;
        b bVar = b.f32706u;
        c cVar = this._scarAdMetadata;
        gMAEventSender.send(bVar, cVar.f41000a, cVar.f41001b, str, Integer.valueOf(i5));
    }

    public void onAdImpression() {
        this._gmaEventSender.send(b.f32697l, new Object[0]);
    }

    public void onAdLeftApplication() {
        this._gmaEventSender.send(b.f32682C, new Object[0]);
    }

    public void onAdSkipped() {
        this._gmaEventSender.send(b.f32681B, new Object[0]);
    }
}
