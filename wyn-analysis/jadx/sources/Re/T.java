package Re;

import java.util.Collection;

/* loaded from: classes5.dex */
public final class T extends Ye.c implements He.f, ug.b {

    /* renamed from: c, reason: collision with root package name */
    public ug.b f10701c;

    @Override // He.f
    public final void b(Object obj) {
        Collection collection = (Collection) this.f16792b;
        if (collection != null) {
            collection.add(obj);
        }
    }

    @Override // ug.b
    public final void cancel() {
        set(4);
        this.f16792b = null;
        this.f10701c.cancel();
    }

    @Override // He.f
    public final void e(ug.b bVar) {
        if (Ye.f.d(this.f10701c, bVar)) {
            this.f10701c = bVar;
            this.f16791a.e(this);
            bVar.request(Long.MAX_VALUE);
        }
    }

    @Override // He.f
    public final void onComplete() {
        f(this.f16792b);
    }

    @Override // He.f
    public final void onError(Throwable th) {
        this.f16792b = null;
        this.f16791a.onError(th);
    }
}
