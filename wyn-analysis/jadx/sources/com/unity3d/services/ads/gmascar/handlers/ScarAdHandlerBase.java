package com.unity3d.services.ads.gmascar.handlers;

import com.unity3d.scar.adapter.common.b;
import com.unity3d.scar.adapter.common.d;
import com.unity3d.services.ads.gmascar.utils.GMAEventSender;
import com.unity3d.services.core.misc.EventSubject;
import com.unity3d.services.core.misc.IEventListener;
import nb.c;

/* loaded from: classes4.dex */
public abstract class ScarAdHandlerBase implements d {
    protected final EventSubject<b> _eventSubject;
    protected final GMAEventSender _gmaEventSender;
    protected final c _scarAdMetadata;

    public ScarAdHandlerBase(c cVar, EventSubject<b> eventSubject, GMAEventSender gMAEventSender) {
        this._scarAdMetadata = cVar;
        this._eventSubject = eventSubject;
        this._gmaEventSender = gMAEventSender;
    }

    @Override // com.unity3d.scar.adapter.common.d
    public void onAdClicked() {
        this._gmaEventSender.send(b.f32680A, new Object[0]);
    }

    @Override // com.unity3d.scar.adapter.common.d
    public void onAdClosed() {
        this._gmaEventSender.send(b.f32683D, new Object[0]);
        this._eventSubject.unsubscribe();
    }

    @Override // com.unity3d.scar.adapter.common.d
    public void onAdFailedToLoad(int i5, String str) {
        GMAEventSender gMAEventSender = this._gmaEventSender;
        b bVar = b.f32700o;
        c cVar = this._scarAdMetadata;
        gMAEventSender.send(bVar, cVar.f41000a, cVar.f41001b, str, Integer.valueOf(i5));
    }

    @Override // com.unity3d.scar.adapter.common.d
    public void onAdLoaded() {
        GMAEventSender gMAEventSender = this._gmaEventSender;
        b bVar = b.k;
        c cVar = this._scarAdMetadata;
        gMAEventSender.send(bVar, cVar.f41000a, cVar.f41001b);
    }

    @Override // com.unity3d.scar.adapter.common.d
    public void onAdOpened() {
        this._gmaEventSender.send(b.f32702q, new Object[0]);
        this._eventSubject.subscribe(new IEventListener<b>() { // from class: com.unity3d.services.ads.gmascar.handlers.ScarAdHandlerBase.1
            @Override // com.unity3d.services.core.misc.IEventListener
            public void onNextEvent(b bVar) {
                ScarAdHandlerBase.this._gmaEventSender.send(bVar, new Object[0]);
            }
        });
    }
}
