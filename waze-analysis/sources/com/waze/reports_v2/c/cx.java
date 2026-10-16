package com.waze.reports_v2.c;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
final class cx extends h.c.b.a.g implements h.g.a.p {

    /* renamed from: a, reason: collision with root package name */
    int f34376a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ Object f34377b;

    /* renamed from: c, reason: collision with root package name */
    private /* synthetic */ Object f34378c;

    /* renamed from: d, reason: collision with root package name */
    private final /* synthetic */ int f34379d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    cx(bj bjVar, h.c.e eVar, int i2) {
        super(2, eVar);
        this.f34379d = i2;
        this.f34377b = bjVar;
    }

    @Override // h.c.b.a.a
    public final h.c.e create(Object obj, h.c.e eVar) {
        int i2 = this.f34379d;
        if (i2 == 0) {
            cx cxVar = new cx((db) this.f34377b, eVar, 0);
            cxVar.f34378c = obj;
            return cxVar;
        }
        Object obj2 = this.f34377b;
        if (i2 != 1) {
            cx cxVar2 = new cx((db) obj2, eVar, 2, null);
            cxVar2.f34378c = obj;
            return cxVar2;
        }
        cx cxVar3 = new cx((bj) obj2, eVar, 1);
        cxVar3.f34378c = obj;
        return cxVar3;
    }

    @Override // h.g.a.p
    public final /* synthetic */ Object invoke(Object obj, Object obj2) {
        int i2 = this.f34379d;
        return i2 != 0 ? i2 != 1 ? ((cx) create((kotlinx.coroutines.b.l) obj, (h.c.e) obj2)).invokeSuspend(h.ab.f48028a) : ((cx) create((kotlinx.coroutines.af) obj, (h.c.e) obj2)).invokeSuspend(h.ab.f48028a) : ((cx) create((kotlinx.coroutines.b.l) obj, (h.c.e) obj2)).invokeSuspend(h.ab.f48028a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x0049, code lost:
    
        if (r3.emit(r8, r7) != r0) goto L18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x00d3, code lost:
    
        if (r3.emit(r8, r7) != r0) goto L45;
     */
    @Override // h.c.b.a.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r8) {
        /*
            Method dump skipped, instructions count: 217
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.waze.reports_v2.c.cx.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    cx(db dbVar, h.c.e eVar, int i2) {
        super(2, eVar);
        this.f34379d = i2;
        this.f34377b = dbVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    cx(db dbVar, h.c.e eVar, int i2, byte[] bArr) {
        super(2, eVar);
        this.f34379d = i2;
        this.f34377b = dbVar;
    }
}
