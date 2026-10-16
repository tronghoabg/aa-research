package com.waze.reports_v2.presentation.a;

import androidx.savedstate.serialization.ClassDiscriminatorModeKt;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class v implements com.waze.reports_v2.presentation.ao {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ h.g.a.a f34756a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ ab f34757b;

    v(ab abVar, h.g.a.a aVar) {
        this.f34757b = abVar;
        this.f34756a = aVar;
    }

    @Override // com.waze.reports_v2.presentation.ao
    public final void a(com.waze.reports_v2.presentation.ba baVar) {
        h.g.b.x.f(baVar, ClassDiscriminatorModeKt.CLASS_DISCRIMINATOR_KEY);
        this.f34757b.f(baVar);
    }

    @Override // com.waze.reports_v2.presentation.ao
    public final void b(com.waze.reports_v2.presentation.ba baVar) {
        h.g.b.x.f(baVar, ClassDiscriminatorModeKt.CLASS_DISCRIMINATOR_KEY);
        this.f34757b.g(baVar);
    }

    @Override // com.waze.reports_v2.presentation.ao
    public final void c() {
        this.f34757b.h();
    }

    @Override // com.waze.reports_v2.presentation.ao
    public final void d() {
        this.f34757b.i();
    }

    @Override // com.waze.reports_v2.presentation.ao
    public final void e() {
        this.f34757b.j();
    }

    @Override // com.waze.reports_v2.presentation.ao
    public final void f() {
        this.f34757b.k();
    }

    @Override // com.waze.reports_v2.presentation.ao
    public final boolean g() {
        return ((Boolean) this.f34756a.invoke()).booleanValue();
    }
}
