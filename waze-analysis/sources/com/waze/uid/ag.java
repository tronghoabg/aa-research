package com.waze.uid;

import com.waze.sharedui.profile.UserProfile;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
final class ag extends h.c.b.a.g implements h.g.a.q {

    /* renamed from: a, reason: collision with root package name */
    /* synthetic */ Object f44115a;

    /* renamed from: b, reason: collision with root package name */
    /* synthetic */ boolean f44116b;

    ag(h.c.e eVar) {
        super(3, eVar);
    }

    @Override // h.g.a.q
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
        boolean zBooleanValue = ((Boolean) obj2).booleanValue();
        ag agVar = new ag((h.c.e) obj3);
        agVar.f44115a = (UserProfile) obj;
        agVar.f44116b = zBooleanValue;
        return agVar.invokeSuspend(h.ab.f48028a);
    }

    @Override // h.c.b.a.a
    public final Object invokeSuspend(Object obj) {
        h.c.a.a aVar = h.c.a.a.f48038a;
        e.b.c.b(obj);
        return new ac(this.f44116b, ((UserProfile) this.f44115a).getUserId(), !r4.getStatus().isRegistered());
    }
}
