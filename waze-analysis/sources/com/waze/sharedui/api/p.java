package com.waze.sharedui.api;

import com.waze.sharedui.profile.UserProfile;
import h.g.b.x;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class p implements b {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ b f38817a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ String f38818b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ String f38819c;

    p(b bVar, String str, String str2) {
        this.f38817a = bVar;
        this.f38818b = str;
        this.f38819c = str2;
    }

    @Override // com.waze.sharedui.api.b
    public final void a(com.waze.sharedui.b bVar) {
        this.f38817a.a(bVar);
    }

    @Override // com.waze.sharedui.api.b
    public final /* bridge */ /* synthetic */ void b(Object obj) {
        g gVar = (g) obj;
        x.f(gVar, "value");
        UserProfile userProfileA = gVar.a();
        if (userProfileA != null) {
            com.waze.shared_infra.l.b.e().h(new com.waze.sharedui.f.h(this.f38818b, this.f38819c, "", userProfileA.getBasicInfo().getFirstName(), userProfileA.getBasicInfo().getLastName(), false));
        }
        this.f38817a.b(gVar);
    }
}
