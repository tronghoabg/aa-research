package defpackage;

import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes2.dex */
public final class as extends oy {
    final /* synthetic */ AtomicReference a;

    public as(AtomicReference atomicReference) {
        this.a = atomicReference;
    }

    @Override // defpackage.oy
    public final void a() {
        throw null;
    }

    @Override // defpackage.oy
    public final void b(Object obj) {
        oy oyVar = (oy) this.a.get();
        if (oyVar == null) {
            throw new IllegalStateException("Operation cannot be started before fragment is in created state");
        }
        oyVar.b(obj);
    }
}
