package com.waze.perf.a;

import h.ab;
import h.c.b.a.g;
import h.c.e;
import h.g.a.p;
import kotlinx.coroutines.af;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
final class a extends g implements p {

    /* renamed from: a, reason: collision with root package name */
    int f33013a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ b f33014b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ long f33015c;

    /* renamed from: d, reason: collision with root package name */
    private /* synthetic */ Object f33016d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    a(b bVar, long j2, e eVar) {
        super(2, eVar);
        this.f33014b = bVar;
        this.f33015c = j2;
    }

    @Override // h.c.b.a.a
    public final e<ab> create(Object obj, e<?> eVar) {
        a aVar = new a(this.f33014b, this.f33015c, eVar);
        aVar.f33016d = obj;
        return aVar;
    }

    @Override // h.g.a.p
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((a) create((af) obj, (e) obj2)).invokeSuspend(ab.f48028a);
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x009e  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0153  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:26:0x0153 -> B:9:0x0023). Please report as a decompilation issue!!! */
    @Override // h.c.b.a.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r27) {
        /*
            Method dump skipped, instructions count: 344
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.waze.perf.a.a.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
