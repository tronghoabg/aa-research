package Je;

import Ke.d;
import S3.f;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes5.dex */
public final class c extends AtomicReference implements b, He.b {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f6095a;

    public /* synthetic */ c(int i5) {
        this.f6095a = i5;
    }

    @Override // He.b
    public void a(b bVar) {
        Me.a.e(this, bVar);
    }

    public boolean b() {
        switch (this.f6095a) {
            case 0:
                return get() == null;
            default:
                return Me.a.b((b) get());
        }
    }

    public void c(b bVar) {
        while (true) {
            b bVar2 = (b) get();
            if (bVar2 == Me.a.f7633a) {
                if (bVar != null) {
                    bVar.dispose();
                    return;
                }
                return;
            } else {
                while (!compareAndSet(bVar2, bVar)) {
                    if (get() != bVar2) {
                        break;
                    }
                }
                if (bVar2 != null) {
                    bVar2.dispose();
                    return;
                }
                return;
            }
        }
    }

    @Override // Je.b
    public final void dispose() {
        Object andSet;
        switch (this.f6095a) {
            case 0:
                if (get() != null && (andSet = getAndSet(null)) != null) {
                    ((Runnable) andSet).run();
                    break;
                }
                break;
            case 1:
                Me.a.a(this);
                break;
            default:
                Me.a.a(this);
                break;
        }
    }

    @Override // He.b
    public void onComplete() {
        lazySet(Me.a.f7633a);
    }

    @Override // He.b
    public void onError(Throwable th) {
        lazySet(Me.a.f7633a);
        f.A(new d(th));
    }

    @Override // java.util.concurrent.atomic.AtomicReference
    public String toString() {
        switch (this.f6095a) {
            case 0:
                return "RunnableDisposable(disposed=" + b() + ", " + get() + ")";
            default:
                return super.toString();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ c(Object obj) {
        super(obj);
        this.f6095a = 0;
    }
}
