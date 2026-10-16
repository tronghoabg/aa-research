package e.a.d;

import j$.util.Objects;
import java.util.logging.Level;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
final class be implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ e.a.ee f46647a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ e.a.cm f46648b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ bg f46649c;

    be(bg bgVar, e.a.ee eeVar, e.a.cm cmVar) {
        this.f46647a = eeVar;
        this.f46648b = cmVar;
        Objects.requireNonNull(bgVar);
        this.f46649c = bgVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        e.a.cm cmVar;
        e.a.ee eeVar;
        bg bgVar = this.f46649c;
        if (bgVar.f46653c != null) {
            eeVar = bgVar.f46653c;
            cmVar = new e.a.cm();
        } else {
            cmVar = this.f46648b;
            eeVar = this.f46647a;
        }
        try {
            bgVar.f46655e.a(eeVar, cmVar);
        } catch (RuntimeException e2) {
            bh.f46656a.logp(Level.WARNING, "io.grpc.internal.DelayedClientCall$DelayedListener$3", "run", "Exception thrown by onClose() in ClientCall", (Throwable) e2);
        }
    }
}
