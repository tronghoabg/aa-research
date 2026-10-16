package Se;

import java.util.concurrent.atomic.AtomicReference;
import p7.AbstractC3772b;

/* loaded from: classes5.dex */
public final class q extends AtomicReference implements He.h, Je.b {

    /* renamed from: a, reason: collision with root package name */
    public final He.h f11097a;

    /* renamed from: b, reason: collision with root package name */
    public final Le.c f11098b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f11099c = true;

    public q(He.h hVar, Le.c cVar) {
        this.f11097a = hVar;
        this.f11098b = cVar;
    }

    @Override // He.h
    public final void a(Je.b bVar) {
        if (Me.a.e(this, bVar)) {
            this.f11097a.a(this);
        }
    }

    @Override // Je.b
    public final void dispose() {
        Me.a.a(this);
    }

    @Override // He.h
    public final void onComplete() {
        this.f11097a.onComplete();
    }

    @Override // He.h
    public final void onError(Throwable th) {
        boolean z2 = false;
        boolean z10 = this.f11099c;
        He.h hVar = this.f11097a;
        if (!z10 && !(th instanceof Exception)) {
            hVar.onError(th);
            return;
        }
        try {
            Object objApply = this.f11098b.apply(th);
            Ne.b.a(objApply, "The resumeFunction returned a null MaybeSource");
            He.g gVar = (He.g) objApply;
            Me.a.c(this, null);
            gVar.b(new S3.e(hVar, z2, this, 17));
        } catch (Throwable th2) {
            AbstractC3772b.U(th2);
            hVar.onError(new Ke.b(th, th2));
        }
    }

    @Override // He.h
    public final void onSuccess(Object obj) {
        this.f11097a.onSuccess(obj);
    }
}
