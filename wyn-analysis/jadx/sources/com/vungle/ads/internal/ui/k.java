package com.vungle.ads.internal.ui;

import android.content.Intent;
import com.vungle.ads.internal.protos.Sdk;
import ef.C2515C;
import ef.C2527k;
import ef.C2530n;
import kotlin.jvm.internal.AbstractC3340k;

/* loaded from: classes5.dex */
public final class k implements com.vungle.ads.internal.presenter.y {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ l f33729a;

    public k(l lVar) {
        this.f33729a = lVar;
    }

    public final C2527k a(Intent intent) {
        Object objZ;
        AbstractC3340k.e(intent, "intent");
        l lVar = this.f33729a;
        try {
            lVar.f33738g.set(true);
            lVar.startActivityForResult(intent, Sdk.SDKError.Reason.AD_NO_FILL_VALUE);
            objZ = C2515C.f34653a;
        } catch (Throwable th) {
            objZ = Fe.e.z(th);
        }
        l lVar2 = this.f33729a;
        Throwable thA = C2530n.a(objZ);
        if (thA == null) {
            return new C2527k(Boolean.TRUE, null);
        }
        lVar2.f33738g.set(false);
        return new C2527k(Boolean.FALSE, thA.getLocalizedMessage());
    }
}
