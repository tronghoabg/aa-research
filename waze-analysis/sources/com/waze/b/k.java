package com.waze.b;

import com.waze.sharedui.profile.UserProfile;
import h.ab;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
final class k extends h.c.b.a.g implements h.g.a.s {

    /* renamed from: a, reason: collision with root package name */
    /* synthetic */ Object f16145a;

    /* renamed from: b, reason: collision with root package name */
    /* synthetic */ Object f16146b;

    /* renamed from: c, reason: collision with root package name */
    /* synthetic */ Object f16147c;

    /* renamed from: d, reason: collision with root package name */
    /* synthetic */ Object f16148d;

    /* renamed from: e, reason: collision with root package name */
    final /* synthetic */ l f16149e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    k(l lVar, h.c.e eVar) {
        super(5, eVar);
        this.f16149e = lVar;
    }

    @Override // h.g.a.s
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        k kVar = new k(this.f16149e, (h.c.e) obj5);
        kVar.f16145a = (Boolean) obj;
        kVar.f16146b = (Boolean) obj2;
        kVar.f16147c = (UserProfile) obj3;
        kVar.f16148d = (j) obj4;
        return kVar.invokeSuspend(ab.f48028a);
    }

    @Override // h.c.b.a.a
    public final Object invokeSuspend(Object obj) {
        h.c.a.a aVar = h.c.a.a.f48038a;
        e.b.c.b(obj);
        Boolean bool = (Boolean) this.f16145a;
        Boolean bool2 = (Boolean) this.f16146b;
        UserProfile userProfile = (UserProfile) this.f16147c;
        j jVar = (j) this.f16148d;
        h.g.b.x.c(bool);
        boolean zBooleanValue = bool.booleanValue();
        h.g.b.x.c(bool2);
        boolean zBooleanValue2 = bool2.booleanValue();
        h.g.b.x.c(userProfile);
        return l.g(zBooleanValue, zBooleanValue2, userProfile, jVar);
    }
}
