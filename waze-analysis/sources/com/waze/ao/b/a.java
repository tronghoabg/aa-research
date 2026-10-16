package com.waze.ao.b;

import com.google.firebase.messaging.l;
import com.waze.an.e.m;
import h.g.b.x;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    private final com.waze.ao.a.c f14890a;

    /* renamed from: b, reason: collision with root package name */
    private final m f14891b;

    public a(com.waze.ao.a.c cVar, m mVar, com.waze.shared_infra.i.e eVar) {
        x.f(cVar, "insightFeedbackEndOfDriveControllerFactory");
        x.f(mVar, "wazeAsksStatSender");
        x.f(eVar, "logger");
        this.f14890a = cVar;
        this.f14891b = mVar;
    }

    public final f a(l lVar) {
        x.f(lVar, "onClosed");
        m mVarA = this.f14890a.a();
        if (mVarA == null) {
            return null;
        }
        return new f(mVarA, this.f14891b, lVar);
    }
}
