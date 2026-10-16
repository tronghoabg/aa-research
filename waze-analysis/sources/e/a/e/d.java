package e.a.e;

import com.waze.sharedui.web.as;
import e.a.cm;
import e.a.cq;
import h.ab;
import h.g.a.p;
import kotlinx.coroutines.af;
import kotlinx.coroutines.b.l;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
final class d extends h.c.b.a.g implements p {

    /* renamed from: a, reason: collision with root package name */
    Object f47361a;

    /* renamed from: b, reason: collision with root package name */
    Object f47362b;

    /* renamed from: c, reason: collision with root package name */
    int f47363c;

    /* renamed from: d, reason: collision with root package name */
    final /* synthetic */ e.a.h f47364d;

    /* renamed from: e, reason: collision with root package name */
    final /* synthetic */ e.a.i f47365e;

    /* renamed from: f, reason: collision with root package name */
    final /* synthetic */ cq f47366f;

    /* renamed from: g, reason: collision with root package name */
    final /* synthetic */ cm f47367g;

    /* renamed from: h, reason: collision with root package name */
    final /* synthetic */ l f47368h;

    /* renamed from: i, reason: collision with root package name */
    final /* synthetic */ as f47369i;

    /* renamed from: j, reason: collision with root package name */
    private /* synthetic */ Object f47370j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    d(e.a.h hVar, e.a.i iVar, cq cqVar, cm cmVar, l lVar, as asVar, h.c.e eVar) {
        super(2, eVar);
        this.f47364d = hVar;
        this.f47365e = iVar;
        this.f47366f = cqVar;
        this.f47367g = cmVar;
        this.f47368h = lVar;
        this.f47369i = asVar;
    }

    @Override // h.c.b.a.a
    public final h.c.e<ab> create(Object obj, h.c.e<?> eVar) {
        d dVar = new d(this.f47364d, this.f47365e, this.f47366f, this.f47367g, this.f47368h, this.f47369i, eVar);
        dVar.f47370j = obj;
        return dVar;
    }

    @Override // h.g.a.p
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((d) create((af) obj, (h.c.e) obj2)).invokeSuspend(ab.f48028a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x00e4, code lost:
    
        if (r14.f47368h.emit(r15, r14) != r1) goto L24;
     */
    /* JADX WARN: Removed duplicated region for block: B:20:0x00c7 A[Catch: Exception -> 0x0038, PHI: r0 r5 r6 r15
  0x00c7: PHI (r0v11 kotlinx.coroutines.a.q) = (r0v12 kotlinx.coroutines.a.q), (r0v15 kotlinx.coroutines.a.q) binds: [B:19:0x00c5, B:11:0x0033] A[DONT_GENERATE, DONT_INLINE]
  0x00c7: PHI (r5v9 kotlinx.coroutines.br) = (r5v10 kotlinx.coroutines.br), (r5v13 kotlinx.coroutines.br) binds: [B:19:0x00c5, B:11:0x0033] A[DONT_GENERATE, DONT_INLINE]
  0x00c7: PHI (r6v12 e.a.k) = (r6v13 e.a.k), (r6v16 e.a.k) binds: [B:19:0x00c5, B:11:0x0033] A[DONT_GENERATE, DONT_INLINE]
  0x00c7: PHI (r15v7 java.lang.Object) = (r15v14 java.lang.Object), (r15v0 java.lang.Object) binds: [B:19:0x00c5, B:11:0x0033] A[DONT_GENERATE, DONT_INLINE], TryCatch #1 {Exception -> 0x0038, blocks: (B:7:0x0019, B:24:0x00e6, B:18:0x00b6, B:20:0x00c7, B:22:0x00cf, B:11:0x0033), top: B:40:0x0007 }] */
    /* JADX WARN: Removed duplicated region for block: B:22:0x00cf A[Catch: Exception -> 0x0038, TryCatch #1 {Exception -> 0x0038, blocks: (B:7:0x0019, B:24:0x00e6, B:18:0x00b6, B:20:0x00c7, B:22:0x00cf, B:11:0x0033), top: B:40:0x0007 }] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00ea  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:23:0x00e4 -> B:24:0x00e6). Please report as a decompilation issue!!! */
    @Override // h.c.b.a.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r15) throws java.lang.Exception {
        /*
            Method dump skipped, instructions count: 286
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: e.a.e.d.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
