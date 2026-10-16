package androidx.lifecycle;

import java.io.Closeable;
import kotlin.jvm.internal.AbstractC3340k;
import n3.C3592d;

/* loaded from: classes.dex */
public final class U implements InterfaceC1455t, Closeable {

    /* renamed from: a, reason: collision with root package name */
    public final String f18633a;

    /* renamed from: b, reason: collision with root package name */
    public final T f18634b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f18635c;

    public U(String str, T t10) {
        this.f18633a = str;
        this.f18634b = t10;
    }

    public final void a(AbstractC1451o lifecycle, C3592d registry) {
        AbstractC3340k.e(registry, "registry");
        AbstractC3340k.e(lifecycle, "lifecycle");
        if (this.f18635c) {
            throw new IllegalStateException("Already attached to lifecycleOwner");
        }
        this.f18635c = true;
        lifecycle.a(this);
        registry.c(this.f18633a, this.f18634b.f18632e);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
    }

    @Override // androidx.lifecycle.InterfaceC1455t
    public final void onStateChanged(InterfaceC1457v interfaceC1457v, EnumC1449m enumC1449m) {
        if (enumC1449m == EnumC1449m.ON_DESTROY) {
            this.f18635c = false;
            interfaceC1457v.getLifecycle().c(this);
        }
    }
}
