package j$.util.stream;

import j$.util.Spliterator;
import java.util.concurrent.CountedCompleter;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: r8-map-id-ef3156dd11616e3312fa97d164663e876a378324a977203425f20cc125230e5c */
/* loaded from: classes10.dex */
public final class f0 extends b {

    /* renamed from: j, reason: collision with root package name */
    public final z f50393j;

    /* renamed from: k, reason: collision with root package name */
    public final boolean f50394k;

    public f0(f0 f0Var, Spliterator spliterator) {
        super(f0Var, spliterator);
        this.f50394k = f0Var.f50394k;
        this.f50393j = f0Var.f50393j;
    }

    @Override // j$.util.stream.d
    public final Object a() {
        a aVar = this.f50361a;
        s8 s8Var = (s8) this.f50393j.f50715d.get();
        aVar.Q(this.f50362b, s8Var);
        Object obj = s8Var.get();
        if (this.f50394k) {
            if (obj != null) {
                if (!c()) {
                    i();
                    return obj;
                }
                AtomicReference atomicReference = this.f50336h;
                while (!atomicReference.compareAndSet(null, obj) && atomicReference.get() == null) {
                }
                return obj;
            }
        } else if (obj != null) {
            AtomicReference atomicReference2 = this.f50336h;
            while (!atomicReference2.compareAndSet(null, obj) && atomicReference2.get() == null) {
            }
        }
        return null;
    }

    @Override // j$.util.stream.d
    public final d e(Spliterator spliterator) {
        return new f0(this, spliterator);
    }

    @Override // j$.util.stream.b
    public final Object j() {
        return this.f50393j.f50713b;
    }

    @Override // j$.util.stream.d, java.util.concurrent.CountedCompleter
    public final void onCompletion(CountedCompleter countedCompleter) {
        if (this.f50394k) {
            f0 f0Var = (f0) this.f50364d;
            f0 f0Var2 = null;
            while (true) {
                if (f0Var == f0Var2) {
                    break;
                }
                Object objK = f0Var.k();
                if (objK == null || !this.f50393j.f50714c.test(objK)) {
                    f0Var2 = f0Var;
                    f0Var = (f0) this.f50365e;
                } else {
                    f(objK);
                    if (c()) {
                        AtomicReference atomicReference = this.f50336h;
                        while (!atomicReference.compareAndSet(null, objK) && atomicReference.get() == null) {
                        }
                    } else {
                        i();
                    }
                }
            }
        }
        super.onCompletion(countedCompleter);
    }

    public f0(z zVar, boolean z, a aVar, Spliterator spliterator) {
        super(aVar, spliterator);
        this.f50394k = z;
        this.f50393j = zVar;
    }
}
