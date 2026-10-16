package defpackage;

import com.google.errorprone.annotations.ResultIgnorabilityUnspecified;
import j$.util.Objects;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes3.dex */
public final class vaa implements xyc {
    public final uzz a;
    private final AtomicReference b;

    public vaa() {
        this.b = new AtomicReference(null);
        this.a = new uzz();
    }

    @ResultIgnorabilityUnspecified
    private final Object d(Object obj) {
        uzz uzzVar = this.a;
        Object andSet = this.b.getAndSet(obj);
        if (!uzzVar.n()) {
            uzzVar.m(this);
        }
        return andSet;
    }

    public final synchronized void b(Object obj) {
        d(obj);
        this.a.h();
    }

    public final synchronized void c(Object obj) {
        if (Objects.equals(d(obj), obj)) {
            return;
        }
        this.a.h();
    }

    @Override // defpackage.xyc
    public final Object gu() {
        return this.b.get();
    }

    public vaa(Object obj) {
        this.b = new AtomicReference(obj);
        this.a = new uzz(this);
    }
}
