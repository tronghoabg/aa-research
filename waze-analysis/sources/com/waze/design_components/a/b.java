package com.waze.design_components.a;

import android.view.View;
import com.google.android.material.bottomsheet.f;
import h.g.b.x;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public final class b extends f {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ c f23290a;

    b(c cVar) {
        this.f23290a = cVar;
    }

    @Override // com.google.android.material.bottomsheet.f
    public final void a(View view, float f2) {
        x.f(view, "bottomSheet");
        c cVar = this.f23290a;
        cVar.f23293c.invoke(new d(f2, cVar.f23294d.f(), cVar.f23294d.e()));
    }

    @Override // com.google.android.material.bottomsheet.f
    public final void b(View view) {
        x.f(view, "bottomSheet");
    }
}
