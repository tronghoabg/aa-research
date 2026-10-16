package j1;

import kotlin.jvm.internal.AbstractC3340k;

/* renamed from: j1.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C3075c extends O0.d {

    /* renamed from: c, reason: collision with root package name */
    public final Object f38574c;

    public C3075c(int i5) {
        super(i5);
        this.f38574c = new Object();
    }

    @Override // O0.d
    public final Object a() {
        Object objA;
        synchronized (this.f38574c) {
            objA = super.a();
        }
        return objA;
    }

    @Override // O0.d
    public final boolean c(Object instance) {
        boolean zC;
        AbstractC3340k.e(instance, "instance");
        synchronized (this.f38574c) {
            zC = super.c(instance);
        }
        return zC;
    }
}
