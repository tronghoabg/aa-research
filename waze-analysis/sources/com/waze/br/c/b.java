package com.waze.br.c;

import androidx.compose.runtime.MutableFloatState;
import androidx.compose.runtime.State;
import h.ab;
import kotlinx.coroutines.af;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
final class b extends h.c.b.a.g implements h.g.a.p {

    /* renamed from: a, reason: collision with root package name */
    Object f17383a;

    /* renamed from: b, reason: collision with root package name */
    Object f17384b;

    /* renamed from: c, reason: collision with root package name */
    int f17385c;

    /* renamed from: d, reason: collision with root package name */
    final /* synthetic */ MutableFloatState f17386d;

    /* renamed from: e, reason: collision with root package name */
    final /* synthetic */ State f17387e;

    /* renamed from: f, reason: collision with root package name */
    private /* synthetic */ Object f17388f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    b(MutableFloatState mutableFloatState, State state, h.c.e eVar) {
        super(2, eVar);
        this.f17386d = mutableFloatState;
        this.f17387e = state;
    }

    @Override // h.c.b.a.a
    public final h.c.e<ab> create(Object obj, h.c.e<?> eVar) {
        b bVar = new b(this.f17386d, this.f17387e, eVar);
        bVar.f17388f = obj;
        return bVar;
    }

    @Override // h.g.a.p
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((b) create((af) obj, (h.c.e) obj2)).invokeSuspend(ab.f48028a);
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x005c  */
    @Override // h.c.b.a.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r13) {
        /*
            r12 = this;
            h.c.a.a r0 = h.c.a.a.f48038a
            int r1 = r12.f17385c
            r2 = 1
            if (r1 == 0) goto L26
            if (r1 == r2) goto L16
            java.lang.Object r1 = r12.f17383a
            h.g.b.ap r1 = (h.g.b.ap) r1
            java.lang.Object r2 = r12.f17388f
            kotlinx.coroutines.af r2 = (kotlinx.coroutines.af) r2
            e.b.c.b(r13)
            r7 = r1
            goto L56
        L16:
            java.lang.Object r1 = r12.f17384b
            h.g.b.ap r1 = (h.g.b.ap) r1
            java.lang.Object r2 = r12.f17383a
            h.g.b.ap r2 = (h.g.b.ap) r2
            java.lang.Object r3 = r12.f17388f
            kotlinx.coroutines.af r3 = (kotlinx.coroutines.af) r3
            e.b.c.b(r13)
            goto L4c
        L26:
            e.b.c.b(r13)
            java.lang.Object r13 = r12.f17388f
            kotlinx.coroutines.af r13 = (kotlinx.coroutines.af) r13
            h.g.b.ap r1 = new h.g.b.ap
            r1.<init>()
            com.waze.perf.p r3 = new com.waze.perf.p
            r4 = 3
            r3.<init>(r4)
            r4 = r12
            h.c.e r4 = (h.c.e) r4
            r12.f17388f = r13
            r12.f17383a = r1
            r12.f17384b = r1
            r12.f17385c = r2
            java.lang.Object r2 = androidx.compose.runtime.MonotonicFrameClockKt.withFrameNanos(r3, r4)
            if (r2 == r0) goto L7f
            r3 = r13
            r13 = r2
            r2 = r1
        L4c:
            java.lang.Number r13 = (java.lang.Number) r13
            long r4 = r13.longValue()
            r1.f48104a = r4
            r7 = r2
            r2 = r3
        L56:
            boolean r13 = kotlinx.coroutines.aj.j(r2)
            if (r13 == 0) goto L7c
            androidx.compose.runtime.MutableFloatState r8 = r12.f17386d
            androidx.compose.runtime.State r9 = r12.f17387e
            com.waze.ads.c r6 = new com.waze.ads.c
            r10 = 17
            r11 = 0
            r6.<init>(r7, r8, r9, r10, r11)
            r13 = r12
            h.c.e r13 = (h.c.e) r13
            r12.f17388f = r2
            r12.f17383a = r7
            r1 = 0
            r12.f17384b = r1
            r1 = 2
            r12.f17385c = r1
            java.lang.Object r13 = androidx.compose.runtime.MonotonicFrameClockKt.withFrameNanos(r6, r13)
            if (r13 != r0) goto L56
            goto L7f
        L7c:
            h.ab r12 = h.ab.f48028a
            return r12
        L7f:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.waze.br.c.b.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
