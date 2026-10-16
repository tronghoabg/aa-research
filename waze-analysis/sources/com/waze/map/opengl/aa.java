package com.waze.map.opengl;

import android.content.Context;
import android.util.AttributeSet;
import android.view.SurfaceView;
import kotlinx.coroutines.av;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
public class aa extends SurfaceView {

    /* renamed from: a, reason: collision with root package name */
    private com.waze.bk.e f29521a;

    /* renamed from: b, reason: collision with root package name */
    private com.waze.bk.r f29522b;

    /* renamed from: c, reason: collision with root package name */
    private final com.waze.bk.k f29523c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public aa(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        h.g.b.x.f(context, "context");
        this.f29523c = new z(this);
    }

    public final void s(com.waze.bk.e eVar, com.waze.bk.h hVar) {
        h.g.b.x.f(eVar, "renderThread");
        h.g.b.x.f(hVar, "renderer");
        if (u()) {
            return;
        }
        this.f29521a = eVar;
        com.waze.bk.k kVar = this.f29523c;
        int i2 = av.f51370a;
        com.waze.bk.r rVar = new com.waze.bk.r(hVar, kVar, kotlinx.coroutines.e.ac.f51860a);
        eVar.b(rVar);
        rVar.g();
        this.f29522b = rVar;
        eVar.d();
    }

    public final void t() {
        com.waze.bk.r rVar = this.f29522b;
        if (rVar != null) {
            rVar.f();
            com.waze.bk.e eVar = this.f29521a;
            if (eVar != null) {
                eVar.e(rVar);
            }
        }
        com.waze.bk.e eVar2 = this.f29521a;
        if (eVar2 != null) {
            eVar2.h();
        }
        this.f29522b = null;
        this.f29521a = null;
    }

    public final boolean u() {
        return this.f29522b != null;
    }
}
