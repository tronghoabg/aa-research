package com.waze.main_screen.p;

import androidx.compose.animation.core.Animatable;
import androidx.compose.runtime.State;
import com.waze.reports_v2.c.dj;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
final class an extends h.c.b.a.g implements h.g.a.p {

    /* renamed from: a, reason: collision with root package name */
    int f27035a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ Object f27036b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ Object f27037c;

    /* renamed from: d, reason: collision with root package name */
    private final /* synthetic */ int f27038d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    an(com.waze.main_screen.m.p pVar, Animatable animatable, h.c.e eVar, int i2) {
        super(2, eVar);
        this.f27038d = i2;
        this.f27036b = pVar;
        this.f27037c = animatable;
    }

    /* JADX WARN: Type inference failed for: r2v1, types: [androidx.compose.runtime.State, java.lang.Object] */
    @Override // h.c.b.a.a
    public final h.c.e create(Object obj, h.c.e eVar) {
        int i2 = this.f27038d;
        if (i2 == 0) {
            return new an((bf) this.f27036b, (State) this.f27037c, eVar, 0);
        }
        if (i2 == 1) {
            return new an((com.waze.reports_v2.presentation.a.ab) this.f27036b, (com.waze.reports_v2.presentation.a.k) this.f27037c, eVar, 1);
        }
        if (i2 == 2) {
            return new an((bf) this.f27036b, (com.waze.main_screen.m.p) this.f27037c, eVar, 2);
        }
        Object obj2 = this.f27036b;
        if (i2 != 3) {
            return new an((com.waze.reports_v2.presentation.a.az) obj2, (dj) this.f27037c, eVar, 4);
        }
        return new an((com.waze.main_screen.m.p) obj2, (Animatable) this.f27037c, eVar, 3);
    }

    @Override // h.g.a.p
    public final /* synthetic */ Object invoke(Object obj, Object obj2) {
        int i2 = this.f27038d;
        return i2 != 0 ? i2 != 1 ? i2 != 2 ? i2 != 3 ? ((an) create((kotlinx.coroutines.af) obj, (h.c.e) obj2)).invokeSuspend(h.ab.f48028a) : ((an) create((kotlinx.coroutines.af) obj, (h.c.e) obj2)).invokeSuspend(h.ab.f48028a) : ((an) create((kotlinx.coroutines.af) obj, (h.c.e) obj2)).invokeSuspend(h.ab.f48028a) : ((an) create((kotlinx.coroutines.af) obj, (h.c.e) obj2)).invokeSuspend(h.ab.f48028a) : ((an) create((kotlinx.coroutines.af) obj, (h.c.e) obj2)).invokeSuspend(h.ab.f48028a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:49:0x00e0, code lost:
    
        if (((com.waze.reports_v2.presentation.a.ab) r6).d(r5) == r0) goto L53;
     */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00d5  */
    @Override // h.c.b.a.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r6) {
        /*
            Method dump skipped, instructions count: 285
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.waze.main_screen.p.an.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    an(bf bfVar, State state, h.c.e eVar, int i2) {
        super(2, eVar);
        this.f27038d = i2;
        this.f27036b = bfVar;
        this.f27037c = state;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    an(bf bfVar, com.waze.main_screen.m.p pVar, h.c.e eVar, int i2) {
        super(2, eVar);
        this.f27038d = i2;
        this.f27036b = bfVar;
        this.f27037c = pVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    an(com.waze.reports_v2.presentation.a.ab abVar, com.waze.reports_v2.presentation.a.k kVar, h.c.e eVar, int i2) {
        super(2, eVar);
        this.f27038d = i2;
        this.f27036b = abVar;
        this.f27037c = kVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    an(com.waze.reports_v2.presentation.a.az azVar, dj djVar, h.c.e eVar, int i2) {
        super(2, eVar);
        this.f27038d = i2;
        this.f27036b = azVar;
        this.f27037c = djVar;
    }
}
