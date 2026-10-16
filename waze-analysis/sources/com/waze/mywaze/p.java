package com.waze.mywaze;

import j$.util.Objects;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
final class p extends com.waze.ifs.a.a {

    /* renamed from: a, reason: collision with root package name */
    String f30620a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ t f30621b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ MyWazeNativeManager f30622c;

    p(MyWazeNativeManager myWazeNativeManager, t tVar) {
        this.f30621b = tVar;
        Objects.requireNonNull(myWazeNativeManager);
        this.f30622c = myWazeNativeManager;
    }

    @Override // com.waze.ifs.a.a
    public final void a() {
        com.waze.shared_infra.i.h.a("getGroupsEvent - callback");
        this.f30621b.a(this.f30620a);
    }

    @Override // com.waze.ifs.a.a
    public final void b() {
        com.waze.shared_infra.i.h.a("getGroupsEvent - event");
        this.f30620a = this.f30622c.getForgotPasswordUrlNTV();
    }
}
