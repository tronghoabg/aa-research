package com.waze.b;

import com.waze.sharedui.profile.UserProfile;
import h.ab;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
final class v extends h.c.b.a.g implements h.g.a.q {

    /* renamed from: a, reason: collision with root package name */
    /* synthetic */ Object f16172a;

    /* renamed from: b, reason: collision with root package name */
    /* synthetic */ Object f16173b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ w f16174c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    v(w wVar, h.c.e eVar) {
        super(3, eVar);
        this.f16174c = wVar;
    }

    @Override // h.g.a.q
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
        v vVar = new v(this.f16174c, (h.c.e) obj3);
        vVar.f16172a = (e) obj;
        vVar.f16173b = (UserProfile) obj2;
        return vVar.invokeSuspend(ab.f48028a);
    }

    @Override // h.c.b.a.a
    public final Object invokeSuspend(Object obj) {
        h.c.a.a aVar = h.c.a.a.f48038a;
        e.b.c.b(obj);
        e eVar = (e) this.f16172a;
        UserProfile userProfile = (UserProfile) this.f16173b;
        h.g.b.x.c(userProfile);
        return w.e(eVar, userProfile);
    }
}
