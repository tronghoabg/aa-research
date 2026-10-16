package com.waze.sharedrive.c;

import h.ab;
import kotlinx.coroutines.a.ad;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
final class v extends h.c.b.a.g implements h.g.a.p {

    /* renamed from: a, reason: collision with root package name */
    Object f38141a;

    /* renamed from: b, reason: collision with root package name */
    Object f38142b;

    /* renamed from: c, reason: collision with root package name */
    Object f38143c;

    /* renamed from: d, reason: collision with root package name */
    int f38144d;

    /* renamed from: e, reason: collision with root package name */
    final /* synthetic */ y f38145e;

    /* renamed from: f, reason: collision with root package name */
    final /* synthetic */ String f38146f;

    /* renamed from: g, reason: collision with root package name */
    private /* synthetic */ Object f38147g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    v(y yVar, String str, h.c.e eVar) {
        super(2, eVar);
        this.f38145e = yVar;
        this.f38146f = str;
    }

    @Override // h.c.b.a.a
    public final h.c.e<ab> create(Object obj, h.c.e<?> eVar) {
        v vVar = new v(this.f38145e, this.f38146f, eVar);
        vVar.f38147g = obj;
        return vVar;
    }

    @Override // h.g.a.p
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((v) create((ad) obj, (h.c.e) obj2)).invokeSuspend(ab.f48028a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x00d2, code lost:
    
        if (r6.g(r7, r9) != r0) goto L21;
     */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0094 A[PHI: r1
  0x0094: PHI (r1v11 kotlinx.coroutines.a.ad) = (r1v12 kotlinx.coroutines.a.ad), (r1v16 kotlinx.coroutines.a.ad) binds: [B:13:0x0092, B:10:0x0044] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:16:0x00b2  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x00bf  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x00d6 A[PHI: r1 r5 r6
  0x00d6: PHI (r1v4 com.waze.sharedrive.ab) = (r1v8 com.waze.sharedrive.ab), (r1v10 com.waze.sharedrive.ab) binds: [B:21:0x00d4, B:18:0x00bd] A[DONT_GENERATE, DONT_INLINE]
  0x00d6: PHI (r5v3 h.g.b.am) = (r5v4 h.g.b.am), (r5v5 h.g.b.am) binds: [B:21:0x00d4, B:18:0x00bd] A[DONT_GENERATE, DONT_INLINE]
  0x00d6: PHI (r6v1 kotlinx.coroutines.a.ad) = (r6v2 kotlinx.coroutines.a.ad), (r6v3 kotlinx.coroutines.a.ad) binds: [B:21:0x00d4, B:18:0x00bd] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:24:0x00dc  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0105  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:23:0x00da -> B:28:0x00fe). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:26:0x00f7 -> B:27:0x00f8). Please report as a decompilation issue!!! */
    @Override // h.c.b.a.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r10) {
        /*
            Method dump skipped, instructions count: 278
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.waze.sharedrive.c.v.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
