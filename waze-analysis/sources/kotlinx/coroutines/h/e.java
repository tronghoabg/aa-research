package kotlinx.coroutines.h;

import kotlinx.coroutines.ai;
import kotlinx.coroutines.ax;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
final class e implements kotlinx.coroutines.g.m {

    /* renamed from: a, reason: collision with root package name */
    public final kotlinx.coroutines.g.m f52024a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f52025b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ h f52026c;

    public e(h hVar, kotlinx.coroutines.g.m mVar, Object obj) {
        this.f52026c = hVar;
        this.f52024a = mVar;
        this.f52025b = obj;
    }

    @Override // kotlinx.coroutines.g.l
    public final h.c.j e() {
        return this.f52024a.e();
    }

    @Override // kotlinx.coroutines.g.l
    public final void g(ax axVar) {
        this.f52024a.g(axVar);
    }

    @Override // kotlinx.coroutines.g.l
    public final void i(Object obj) {
        int i2 = ai.f51347a;
        this.f52026c.f52029a.d(this.f52025b);
        this.f52024a.i(obj);
    }

    @Override // kotlinx.coroutines.g.l
    public final boolean j(Object obj, Object obj2) {
        int i2 = ai.f51347a;
        boolean zJ = this.f52024a.j(obj, obj2);
        if (zJ) {
            h hVar = this.f52026c;
            hVar.f52029a.d(this.f52025b);
        }
        return zJ;
    }

    @Override // kotlinx.coroutines.dl
    public final void z(kotlinx.coroutines.e.e eVar, int i2) {
        this.f52024a.z(eVar, i2);
    }
}
