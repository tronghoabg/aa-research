package com.moloco.sdk.internal.ilrd;

import Ef.H0;
import android.content.Context;
import com.google.protobuf.Internal;
import com.moloco.sdk.J0;
import com.moloco.sdk.internal.MolocoLogger;
import ef.C2532p;
import j$.util.DesugarCollections;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.Set;

/* loaded from: classes4.dex */
public final class A {

    /* renamed from: a, reason: collision with root package name */
    public final Kd.a f28534a;

    /* renamed from: b, reason: collision with root package name */
    public final m f28535b;

    /* renamed from: c, reason: collision with root package name */
    public final C2532p f28536c;

    /* renamed from: d, reason: collision with root package name */
    public final Set f28537d = DesugarCollections.synchronizedSet(new LinkedHashSet());

    /* renamed from: e, reason: collision with root package name */
    public H0 f28538e;

    public A(Kd.a aVar, final Context context, m mVar, final Internal.ListAdapter listAdapter) {
        this.f28534a = aVar;
        this.f28535b = mVar;
        this.f28536c = Fe.c.z(new tf.a() { // from class: com.moloco.sdk.internal.ilrd.x
            @Override // tf.a
            public final Object invoke() {
                ArrayList arrayList = new ArrayList();
                J0 j02 = J0.MAX;
                Internal.ListAdapter listAdapter2 = listAdapter;
                boolean zContains = listAdapter2.contains(j02);
                Context context2 = context;
                A a5 = this;
                if (zContains) {
                    MolocoLogger.info$default(MolocoLogger.INSTANCE, "IlrdService", "Adding AppLovin as ILRD provider", null, false, 12, null);
                    arrayList.add(new com.moloco.sdk.internal.ilrd.provider.d(context2, a5.f28534a));
                }
                if (listAdapter2.contains(J0.LEVEL_PLAY)) {
                    MolocoLogger.info$default(MolocoLogger.INSTANCE, "IlrdService", "Adding IronSource as ILRD provider", null, false, 12, null);
                    arrayList.add(new com.moloco.sdk.internal.ilrd.provider.g(context2, a5.f28534a));
                }
                return ff.o.S0(arrayList);
            }
        });
    }

    public final com.moloco.sdk.internal.services.bidtoken.providers.o a() {
        m mVar = this.f28535b;
        synchronized (mVar) {
            mVar.c();
            mVar.f28592m.b(mVar.f28584d, new f(mVar, null));
        }
        r rVar = mVar.f28596q;
        if (rVar == null) {
            MolocoLogger.warn$default(MolocoLogger.INSTANCE, "IlrdService", "provideDataForBidToken() Session is null", null, false, 12, null);
            return null;
        }
        o oVarB = rVar.b();
        return new com.moloco.sdk.internal.services.bidtoken.providers.o(rVar.c(), rVar.f28639d, oVarB.f28603a, oVarB.f28604b, oVarB.f28605c, oVarB.f28606d, oVarB.f28607e, oVarB.f28608f);
    }
}
