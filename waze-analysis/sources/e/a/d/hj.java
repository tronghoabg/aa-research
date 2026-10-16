package e.a.d;

import j$.util.Objects;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
final class hj extends e.a.br {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ hk f47092a;

    /* renamed from: b, reason: collision with root package name */
    private final AtomicBoolean f47093b;

    /* synthetic */ hj(hk hkVar) {
        Objects.requireNonNull(hkVar);
        this.f47092a = hkVar;
        this.f47093b = new AtomicBoolean(false);
    }

    @Override // e.a.br
    public final e.a.bn a(e.a.bo boVar) {
        if (this.f47093b.compareAndSet(false, true)) {
            final hk hkVar = this.f47092a;
            e.a.el elVarC = hkVar.f47094f.c();
            Objects.requireNonNull(hkVar);
            elVarC.execute(new Runnable() { // from class: e.a.d.hi
                @Override // java.lang.Runnable
                public final void run() {
                    hkVar.c();
                }
            });
        }
        return e.a.bn.c();
    }
}
