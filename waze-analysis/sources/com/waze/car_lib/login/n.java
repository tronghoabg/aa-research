package com.waze.car_lib.login;

import com.waze.sharedui.profile.UserProfile;
import h.g.b.x;
import java.util.Objects;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public final class n implements com.waze.sharedui.api.b {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ o f20320a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ h.g.a.l f20321b;

    n(o oVar, h.g.a.l lVar) {
        this.f20320a = oVar;
        this.f20321b = lVar;
    }

    @Override // com.waze.sharedui.api.b
    public final void a(com.waze.sharedui.b bVar) {
        Objects.toString(bVar);
        com.waze.shared_infra.i.h.d("WazeLoginManager", "Login failed with: ".concat(String.valueOf(bVar)));
        this.f20321b.invoke(false);
    }

    @Override // com.waze.sharedui.api.b
    public final /* bridge */ /* synthetic */ void b(Object obj) {
        com.waze.sharedui.api.g gVar = (com.waze.sharedui.api.g) obj;
        x.f(gVar, "value");
        UserProfile userProfileA = gVar.a();
        StringBuilder sb = new StringBuilder("Login status: ");
        sb.append(userProfileA != null);
        com.waze.shared_infra.i.h.b("WazeLoginManager", sb.toString());
        this.f20320a.f20322a.a();
        this.f20321b.invoke(Boolean.valueOf(gVar.a() != null));
    }
}
