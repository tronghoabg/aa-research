package androidx.camera.camera2.impl;

import e.b.c;
import h.ab;
import h.c.a.a;
import h.c.b.a.g;
import h.c.e;
import h.g.a.p;
import h.g.b.ap;
import kotlinx.coroutines.af;

/* compiled from: WazeSource */
/* loaded from: classes2.dex */
public final class State3AControl$update$$inlined$confineLaunch$1 extends g implements p<af, e<? super ab>, Object> {
    final /* synthetic */ ap $revision$inlined;
    int label;
    final /* synthetic */ State3AControl this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public State3AControl$update$$inlined$confineLaunch$1(e eVar, State3AControl state3AControl, ap apVar) {
        super(2, eVar);
        this.this$0 = state3AControl;
        this.$revision$inlined = apVar;
    }

    @Override // h.c.b.a.a
    public final e<ab> create(Object obj, e<?> eVar) {
        return new State3AControl$update$$inlined$confineLaunch$1(eVar, this.this$0, this.$revision$inlined);
    }

    @Override // h.g.a.p
    public final Object invoke(af afVar, e<? super ab> eVar) {
        return ((State3AControl$update$$inlined$confineLaunch$1) create(afVar, eVar)).invokeSuspend(ab.f48028a);
    }

    @Override // h.c.b.a.a
    public final Object invokeSuspend(Object obj) {
        a aVar = a.f48038a;
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        c.b(obj);
        this.this$0.applyUpdate(this.$revision$inlined.f48104a);
        return ab.f48028a;
    }
}
