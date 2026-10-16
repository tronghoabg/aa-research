package com.waze.a.a;

import com.waze.sharedui.profile.UserProfile;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
final class d extends h.c.b.a.c {

    /* renamed from: a, reason: collision with root package name */
    /* synthetic */ Object f13578a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ e f13579b;

    /* renamed from: c, reason: collision with root package name */
    int f13580c;

    /* renamed from: d, reason: collision with root package name */
    UserProfile f13581d;

    /* renamed from: e, reason: collision with root package name */
    com.waze.shared_infra.q.i f13582e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    d(e eVar, h.c.e eVar2) {
        super(eVar2);
        this.f13579b = eVar;
    }

    @Override // h.c.b.a.a
    public final Object invokeSuspend(Object obj) {
        this.f13578a = obj;
        this.f13580c |= Integer.MIN_VALUE;
        return e.a(this.f13579b, null, this);
    }
}
