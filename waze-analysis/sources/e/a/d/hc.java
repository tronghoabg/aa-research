package e.a.d;

import j$.util.Objects;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
final class hc extends e.a.br {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ hf f47071a;

    /* renamed from: b, reason: collision with root package name */
    private final hf f47072b;

    /* renamed from: c, reason: collision with root package name */
    private final AtomicBoolean f47073c;

    hc(hf hfVar, hf hfVar2) {
        Objects.requireNonNull(hfVar);
        this.f47071a = hfVar;
        this.f47073c = new AtomicBoolean(false);
        this.f47072b = hfVar2;
    }

    @Override // e.a.br
    public final e.a.bn a(e.a.bo boVar) {
        if (this.f47073c.compareAndSet(false, true)) {
            e.a.el elVarC = this.f47071a.f47084j.c();
            final hf hfVar = this.f47072b;
            Objects.requireNonNull(hfVar);
            elVarC.execute(new Runnable() { // from class: e.a.d.hb
                @Override // java.lang.Runnable
                public final void run() {
                    hfVar.c();
                }
            });
        }
        return e.a.bn.c();
    }
}
