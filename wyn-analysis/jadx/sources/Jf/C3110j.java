package jf;

import ef.C2529m;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import lf.InterfaceC3465d;
import org.jetbrains.annotations.Nullable;

/* renamed from: jf.j, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C3110j implements InterfaceC3103c, InterfaceC3465d {

    /* renamed from: b, reason: collision with root package name */
    public static final AtomicReferenceFieldUpdater f38760b = AtomicReferenceFieldUpdater.newUpdater(C3110j.class, Object.class, "result");

    /* renamed from: a, reason: collision with root package name */
    public final InterfaceC3103c f38761a;

    @Nullable
    private volatile Object result;

    public C3110j(InterfaceC3103c interfaceC3103c, kf.a aVar) {
        this.f38761a = interfaceC3103c;
        this.result = aVar;
    }

    public final Object b() throws Throwable {
        Object obj = this.result;
        kf.a aVar = kf.a.f39712b;
        if (obj == aVar) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f38760b;
            kf.a aVar2 = kf.a.f39711a;
            while (!atomicReferenceFieldUpdater.compareAndSet(this, aVar, aVar2)) {
                if (atomicReferenceFieldUpdater.get(this) != aVar) {
                    obj = this.result;
                }
            }
            return kf.a.f39711a;
        }
        if (obj == kf.a.f39713c) {
            return kf.a.f39711a;
        }
        if (obj instanceof C2529m) {
            throw ((C2529m) obj).f34673a;
        }
        return obj;
    }

    @Override // lf.InterfaceC3465d
    public final InterfaceC3465d getCallerFrame() {
        InterfaceC3103c interfaceC3103c = this.f38761a;
        if (interfaceC3103c instanceof InterfaceC3465d) {
            return (InterfaceC3465d) interfaceC3103c;
        }
        return null;
    }

    @Override // jf.InterfaceC3103c
    public final InterfaceC3108h getContext() {
        return this.f38761a.getContext();
    }

    @Override // jf.InterfaceC3103c
    public final void resumeWith(Object obj) {
        while (true) {
            Object obj2 = this.result;
            kf.a aVar = kf.a.f39712b;
            if (obj2 == aVar) {
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f38760b;
                while (!atomicReferenceFieldUpdater.compareAndSet(this, aVar, obj)) {
                    if (atomicReferenceFieldUpdater.get(this) != aVar) {
                        break;
                    }
                }
                return;
            }
            kf.a aVar2 = kf.a.f39711a;
            if (obj2 != aVar2) {
                throw new IllegalStateException("Already resumed");
            }
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = f38760b;
            kf.a aVar3 = kf.a.f39713c;
            while (!atomicReferenceFieldUpdater2.compareAndSet(this, aVar2, aVar3)) {
                if (atomicReferenceFieldUpdater2.get(this) != aVar2) {
                    break;
                }
            }
            this.f38761a.resumeWith(obj);
            return;
        }
    }

    public final String toString() {
        return "SafeContinuation for " + this.f38761a;
    }

    public C3110j(InterfaceC3103c interfaceC3103c) {
        kf.a aVar = kf.a.f39712b;
        this.f38761a = interfaceC3103c;
        this.result = aVar;
    }
}
