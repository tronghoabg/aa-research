package androidx.fragment.app;

import g.AbstractC2655c;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: androidx.fragment.app.v, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1432v extends AbstractC2655c {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ AtomicReference f18555a;

    public C1432v(AtomicReference atomicReference) {
        this.f18555a = atomicReference;
    }

    @Override // g.AbstractC2655c
    public final void a(Object obj) {
        AbstractC2655c abstractC2655c = (AbstractC2655c) this.f18555a.get();
        if (abstractC2655c == null) {
            throw new IllegalStateException("Operation cannot be started before fragment is in created state");
        }
        abstractC2655c.a(obj);
    }
}
