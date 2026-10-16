package com.waze.main_screen.p.b.a.a;

import android.app.Activity;
import android.content.Context;
import com.waze.design_components.d;
import com.waze.main_screen.p.b.a.b.t;
import com.waze.navbar.e;
import com.waze.navbar.f;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
public final class b implements e {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ com.waze.ui.r.a.e.b.a f27090a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ f f27091b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ String f27092c;

    /* renamed from: d, reason: collision with root package name */
    final /* synthetic */ t f27093d;

    b(com.waze.ui.r.a.e.b.a aVar, t tVar, f fVar, String str) {
        this.f27090a = aVar;
        this.f27093d = tVar;
        this.f27091b = fVar;
        this.f27092c = str;
    }

    @Override // com.waze.navbar.e
    public final void a() {
    }

    @Override // com.waze.navbar.e
    public final void b() {
    }

    @Override // com.waze.navbar.e
    public final void c() {
        if (this.f27090a != com.waze.ui.r.a.e.b.a.f43359a) {
            this.f27093d.d();
            return;
        }
        Context context = this.f27091b.getContext();
        if (context instanceof Activity) {
            d.a((Activity) context, this.f27092c, null);
        }
    }
}
