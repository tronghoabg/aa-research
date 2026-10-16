package androidx.camera.camera2.impl;

import e.b.c;
import h.ab;
import h.c.a.a;
import h.c.b.a.g;
import h.c.e;
import h.g.a.p;
import java.util.Set;
import kotlinx.coroutines.af;

/* compiled from: WazeSource */
/* loaded from: classes2.dex */
public final class State3AControl$onRunningUseCasesChanged$$inlined$confineLaunch$1 extends g implements p<af, e<? super ab>, Object> {
    final /* synthetic */ Set $useCasesSnapshot$inlined;
    int label;
    final /* synthetic */ State3AControl this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public State3AControl$onRunningUseCasesChanged$$inlined$confineLaunch$1(e eVar, Set set, State3AControl state3AControl) {
        super(2, eVar);
        this.$useCasesSnapshot$inlined = set;
        this.this$0 = state3AControl;
    }

    @Override // h.c.b.a.a
    public final e<ab> create(Object obj, e<?> eVar) {
        return new State3AControl$onRunningUseCasesChanged$$inlined$confineLaunch$1(eVar, this.$useCasesSnapshot$inlined, this.this$0);
    }

    @Override // h.g.a.p
    public final Object invoke(af afVar, e<? super ab> eVar) {
        return ((State3AControl$onRunningUseCasesChanged$$inlined$confineLaunch$1) create(afVar, eVar)).invokeSuspend(ab.f48028a);
    }

    @Override // h.c.b.a.a
    public final Object invokeSuspend(Object obj) {
        boolean z;
        a aVar = a.f48038a;
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        c.b(obj);
        if (!this.$useCasesSnapshot$inlined.isEmpty()) {
            State3AControl state3AControl = this.this$0;
            int iCalculateTemplateFromUseCases = state3AControl.calculateTemplateFromUseCases(this.$useCasesSnapshot$inlined);
            synchronized (state3AControl.lock) {
                if (this.this$0._template != iCalculateTemplateFromUseCases) {
                    this.this$0._template = iCalculateTemplateFromUseCases;
                    z = true;
                } else {
                    z = false;
                }
            }
            if (z) {
                this.this$0.update();
            }
        }
        return ab.f48028a;
    }
}
