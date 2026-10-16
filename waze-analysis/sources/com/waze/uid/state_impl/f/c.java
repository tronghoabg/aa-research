package com.waze.uid.state_impl.f;

import com.waze.tide.s;
import h.ab;
import h.c.b.a.g;
import h.c.e;
import h.g.a.p;
import kotlinx.coroutines.af;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
final class c extends g implements p {

    /* renamed from: a, reason: collision with root package name */
    int f44671a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ d f44672b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ s f44673c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    c(d dVar, s sVar, e eVar) {
        super(2, eVar);
        this.f44672b = dVar;
        this.f44673c = sVar;
    }

    @Override // h.c.b.a.a
    public final e<ab> create(Object obj, e<?> eVar) {
        return new c(this.f44672b, this.f44673c, eVar);
    }

    @Override // h.g.a.p
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((c) create((af) obj, (e) obj2)).invokeSuspend(ab.f48028a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x0053, code lost:
    
        if (kotlinx.coroutines.aj.G(10000, new com.waze.uid.state_impl.f.b(r11.f44672b, null), r11) == r3) goto L18;
     */
    @Override // h.c.b.a.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r12) {
        /*
            Method dump skipped, instructions count: 393
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.waze.uid.state_impl.f.c.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
