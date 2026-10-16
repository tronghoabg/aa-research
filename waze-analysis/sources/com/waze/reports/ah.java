package com.waze.reports;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
final class ah extends h.c.b.a.g implements h.g.a.p {

    /* renamed from: a, reason: collision with root package name */
    int f33594a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ Object f33595b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ Object f33596c;

    /* renamed from: d, reason: collision with root package name */
    private final /* synthetic */ int f33597d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ah(ak akVar, com.waze.shared_infra.h.c cVar, h.c.e eVar, int i2) {
        super(2, eVar);
        this.f33597d = i2;
        this.f33595b = akVar;
        this.f33596c = cVar;
    }

    /* JADX WARN: Type inference failed for: r10v3, types: [java.lang.Object, kotlinx.coroutines.b.ch] */
    /* JADX WARN: Type inference failed for: r8v3, types: [h.g.a.l, java.lang.Object] */
    @Override // h.c.b.a.a
    public final h.c.e create(Object obj, h.c.e eVar) {
        int i2 = this.f33597d;
        if (i2 == 0) {
            return new ah((ak) this.f33595b, (com.waze.shared_infra.h.c) this.f33596c, eVar, 0);
        }
        if (i2 == 1) {
            return new ah((kotlinx.coroutines.b.ch) this.f33596c, (h.g.a.l) this.f33595b, eVar, 1);
        }
        Object obj2 = this.f33595b;
        if (i2 != 2) {
            return new ah((ak) obj2, (com.waze.shared_infra.h.c) this.f33596c, eVar, 3, (char[]) null);
        }
        return new ah((ak) obj2, (com.waze.shared_infra.h.c) this.f33596c, eVar, 2, (byte[]) null);
    }

    @Override // h.g.a.p
    public final /* synthetic */ Object invoke(Object obj, Object obj2) {
        int i2 = this.f33597d;
        return i2 != 0 ? i2 != 1 ? i2 != 2 ? ((ah) create((kotlinx.coroutines.af) obj, (h.c.e) obj2)).invokeSuspend(h.ab.f48028a) : ((ah) create((kotlinx.coroutines.af) obj, (h.c.e) obj2)).invokeSuspend(h.ab.f48028a) : ((ah) create((kotlinx.coroutines.af) obj, (h.c.e) obj2)).invokeSuspend(h.ab.f48028a) : ((ah) create((kotlinx.coroutines.af) obj, (h.c.e) obj2)).invokeSuspend(h.ab.f48028a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:41:0x0110, code lost:
    
        if (kotlinx.coroutines.b.ai.e(kotlinx.coroutines.b.ai.y(kotlinx.coroutines.b.ai.B(r11.f33607a.d(), new com.waze.reports.af((com.waze.shared_infra.h.c) r10.f33596c, null))), new com.waze.reports.ag(r11, null), r10) == r0) goto L45;
     */
    /* JADX WARN: Type inference failed for: r1v4, types: [h.g.a.l, java.lang.Object] */
    @Override // h.c.b.a.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r11) {
        /*
            Method dump skipped, instructions count: 279
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.waze.reports.ah.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ah(ak akVar, com.waze.shared_infra.h.c cVar, h.c.e eVar, int i2, byte[] bArr) {
        super(2, eVar);
        this.f33597d = i2;
        this.f33595b = akVar;
        this.f33596c = cVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ah(ak akVar, com.waze.shared_infra.h.c cVar, h.c.e eVar, int i2, char[] cArr) {
        super(2, eVar);
        this.f33597d = i2;
        this.f33595b = akVar;
        this.f33596c = cVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ah(kotlinx.coroutines.b.ch chVar, h.g.a.l lVar, h.c.e eVar, int i2) {
        super(2, eVar);
        this.f33597d = i2;
        this.f33596c = chVar;
        this.f33595b = lVar;
    }
}
