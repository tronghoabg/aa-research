package com.unity3d.services.ads.gmascar.handlers;

import com.unity3d.scar.adapter.common.b;
import com.unity3d.services.ads.gmascar.utils.GMAEventSender;
import ob.InterfaceC3661a;

/* loaded from: classes4.dex */
public class SignalsHandler implements InterfaceC3661a {
    private GMAEventSender _gmaEventSender;

    public SignalsHandler(GMAEventSender gMAEventSender) {
        this._gmaEventSender = gMAEventSender;
    }

    @Override // ob.InterfaceC3661a
    public void onSignalsCollected(String str) {
        this._gmaEventSender.send(b.f32694h, str);
    }

    @Override // ob.InterfaceC3661a
    public void onSignalsCollectionFailed(String str) {
        this._gmaEventSender.send(b.f32695i, str);
    }
}
