package Ye;

/* loaded from: classes5.dex */
public abstract class c extends a {

    /* renamed from: a, reason: collision with root package name */
    public final He.f f16791a;

    /* renamed from: b, reason: collision with root package name */
    public Object f16792b;

    public c(He.f fVar) {
        this.f16791a = fVar;
    }

    @Override // Oe.d
    public final int c(int i5) {
        lazySet(8);
        return 2;
    }

    @Override // Oe.h
    public final void clear() {
        lazySet(32);
        this.f16792b = null;
    }

    public final void f(Object obj) {
        int i5 = get();
        do {
            He.f fVar = this.f16791a;
            if (i5 == 8) {
                this.f16792b = obj;
                lazySet(16);
                fVar.b(obj);
                if (get() != 4) {
                    fVar.onComplete();
                    return;
                }
                return;
            }
            if ((i5 & (-3)) != 0) {
                return;
            }
            if (i5 == 2) {
                lazySet(3);
                fVar.b(obj);
                if (get() != 4) {
                    fVar.onComplete();
                    return;
                }
                return;
            }
            this.f16792b = obj;
            if (compareAndSet(0, 1)) {
                return;
            } else {
                i5 = get();
            }
        } while (i5 != 4);
        this.f16792b = null;
    }

    @Override // Oe.h
    public final boolean isEmpty() {
        return get() != 16;
    }

    public void onSuccess(Object obj) {
        f(obj);
    }

    @Override // Oe.h
    public final Object poll() {
        if (get() != 16) {
            return null;
        }
        lazySet(32);
        Object obj = this.f16792b;
        this.f16792b = null;
        return obj;
    }

    @Override // ug.b
    public final void request(long j8) {
        Object obj;
        if (f.c(j8)) {
            do {
                int i5 = get();
                if ((i5 & (-2)) != 0) {
                    return;
                }
                if (i5 == 1) {
                    if (!compareAndSet(1, 3) || (obj = this.f16792b) == null) {
                        return;
                    }
                    this.f16792b = null;
                    He.f fVar = this.f16791a;
                    fVar.b(obj);
                    if (get() != 4) {
                        fVar.onComplete();
                        return;
                    }
                    return;
                }
            } while (!compareAndSet(0, 2));
        }
    }
}
