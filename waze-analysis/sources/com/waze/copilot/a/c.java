package com.waze.copilot.a;

import com.waze.sharedui.profile.UserProfile;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
final class c extends h.c.b.a.c {

    /* renamed from: a, reason: collision with root package name */
    /* synthetic */ Object f22817a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ d f22818b;

    /* renamed from: c, reason: collision with root package name */
    int f22819c;

    /* renamed from: d, reason: collision with root package name */
    UserProfile f22820d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    c(d dVar, h.c.e eVar) {
        super(eVar);
        this.f22818b = dVar;
    }

    @Override // h.c.b.a.a
    public final Object invokeSuspend(Object obj) {
        this.f22817a = obj;
        this.f22819c |= Integer.MIN_VALUE;
        return this.f22818b.emit(null, this);
    }
}
