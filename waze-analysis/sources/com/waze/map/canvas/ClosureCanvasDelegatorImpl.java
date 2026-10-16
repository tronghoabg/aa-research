package com.waze.map.canvas;

import java.util.concurrent.Executor;
import kotlinx.coroutines.b.ch;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
public final class ClosureCanvasDelegatorImpl extends CanvasDelegatorImpl {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ClosureCanvasDelegatorImpl(ch chVar, com.waze.shared_infra.i.e eVar, Executor executor) {
        super(chVar, executor, eVar);
        h.g.b.x.f(chVar, "mapStateFlow");
        h.g.b.x.f(eVar, "logger");
        h.g.b.x.f(executor, "nativeThreadExecutor");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final native void nativeClearClosureObject(String str);

    private final native void nativeStartClosureObject(String str, boolean z, int i2);

    static final h.ab s(ClosureCanvasDelegatorImpl closureCanvasDelegatorImpl, boolean z, int i2, String str) {
        h.g.b.x.f(str, "it");
        closureCanvasDelegatorImpl.nativeStartClosureObject(str, z, i2);
        return h.ab.f48028a;
    }

    public final void u() {
        q("clearClosureObject", new bd(this, 1, null));
    }

    public final void v(final boolean z, final int i2) {
        q("startClosureObject", new h.g.a.l() { // from class: com.waze.map.canvas.s
            @Override // h.g.a.l
            public final Object invoke(Object obj) {
                return ClosureCanvasDelegatorImpl.s(this.f28658a, z, i2, (String) obj);
            }
        });
    }
}
