package defpackage;

import java.util.concurrent.atomic.AtomicLong;

/* loaded from: classes3.dex */
public final class adrp implements advc {
    private final AtomicLong a = new AtomicLong();

    @Override // defpackage.advc
    public final void a() {
        this.a.getAndAdd(1L);
    }
}
