package androidx.camera.camera2.impl;

import androidx.camera.camera2.adapter.SessionConfigAdapter;
import androidx.camera.core.impl.DeferrableSurface;
import e.b.c;
import h.ab;
import h.c.a.a;
import h.c.b.a.g;
import h.c.e;
import h.g.a.p;
import h.g.b.x;
import kotlinx.coroutines.af;

/* compiled from: WazeSource */
/* loaded from: classes2.dex */
final class UseCaseSurfaceManager$setupAsync$1$4 extends g implements p<af, e<? super ab>, Object> {
    final /* synthetic */ DeferrableSurface.SurfaceClosedException $e;
    final /* synthetic */ SessionConfigAdapter $sessionConfigAdapter;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    UseCaseSurfaceManager$setupAsync$1$4(SessionConfigAdapter sessionConfigAdapter, DeferrableSurface.SurfaceClosedException surfaceClosedException, e<? super UseCaseSurfaceManager$setupAsync$1$4> eVar) {
        super(2, eVar);
        this.$sessionConfigAdapter = sessionConfigAdapter;
        this.$e = surfaceClosedException;
    }

    @Override // h.c.b.a.a
    public final e<ab> create(Object obj, e<?> eVar) {
        return new UseCaseSurfaceManager$setupAsync$1$4(this.$sessionConfigAdapter, this.$e, eVar);
    }

    @Override // h.g.a.p
    public final Object invoke(af afVar, e<? super ab> eVar) {
        return ((UseCaseSurfaceManager$setupAsync$1$4) create(afVar, eVar)).invokeSuspend(ab.f48028a);
    }

    @Override // h.c.b.a.a
    public final Object invokeSuspend(Object obj) {
        a aVar = a.f48038a;
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        c.b(obj);
        SessionConfigAdapter sessionConfigAdapter = this.$sessionConfigAdapter;
        DeferrableSurface deferrableSurface = this.$e.getDeferrableSurface();
        x.e(deferrableSurface, "getDeferrableSurface(...)");
        sessionConfigAdapter.reportSurfaceInvalid(deferrableSurface);
        return ab.f48028a;
    }
}
