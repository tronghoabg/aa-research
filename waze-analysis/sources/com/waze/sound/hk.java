package com.waze.sound;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
final class hk extends h.c.b.a.g implements h.g.a.p {

    /* renamed from: a, reason: collision with root package name */
    int f40146a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ Object f40147b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ Object f40148c;

    /* renamed from: d, reason: collision with root package name */
    final /* synthetic */ Object f40149d;

    /* renamed from: e, reason: collision with root package name */
    private final /* synthetic */ int f40150e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    hk(dr drVar, al alVar, h.g.a.a aVar, h.c.e eVar, int i2) {
        super(2, eVar);
        this.f40150e = i2;
        this.f40147b = drVar;
        this.f40149d = alVar;
        this.f40148c = aVar;
    }

    /* JADX WARN: Type inference failed for: r4v0, types: [java.lang.Object, kotlinx.coroutines.b.k] */
    /* JADX WARN: Type inference failed for: r4v3, types: [h.g.a.a, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v2, types: [h.g.a.a, java.lang.Object] */
    @Override // h.c.b.a.a
    public final h.c.e create(Object obj, h.c.e eVar) {
        int i2 = this.f40150e;
        if (i2 == 0) {
            return new hk((hl) this.f40147b, (kotlinx.coroutines.b.k) this.f40148c, (gu) this.f40149d, eVar, 0);
        }
        Object obj2 = this.f40147b;
        if (i2 != 1) {
            return new hk((jl) obj2, (ak) this.f40149d, (h.g.a.a) this.f40148c, eVar, 2);
        }
        return new hk((dr) obj2, (al) this.f40149d, (h.g.a.a) this.f40148c, eVar, 1);
    }

    @Override // h.g.a.p
    public final /* synthetic */ Object invoke(Object obj, Object obj2) {
        int i2 = this.f40150e;
        return i2 != 0 ? i2 != 1 ? ((hk) create((kotlinx.coroutines.af) obj, (h.c.e) obj2)).invokeSuspend(h.ab.f48028a) : ((hk) create((kotlinx.coroutines.af) obj, (h.c.e) obj2)).invokeSuspend(h.ab.f48028a) : ((hk) create((kotlinx.coroutines.af) obj, (h.c.e) obj2)).invokeSuspend(h.ab.f48028a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x007b, code lost:
    
        if (r7 == r0) goto L17;
     */
    /* JADX WARN: Type inference failed for: r0v8, types: [h.g.a.a, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v1, types: [java.lang.Object, kotlinx.coroutines.b.k] */
    /* JADX WARN: Type inference failed for: r3v1, types: [h.g.a.a, java.lang.Object] */
    @Override // h.c.b.a.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r7) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 350
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.waze.sound.hk.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    hk(hl hlVar, kotlinx.coroutines.b.k kVar, gu guVar, h.c.e eVar, int i2) {
        super(2, eVar);
        this.f40150e = i2;
        this.f40147b = hlVar;
        this.f40148c = kVar;
        this.f40149d = guVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    hk(jl jlVar, ak akVar, h.g.a.a aVar, h.c.e eVar, int i2) {
        super(2, eVar);
        this.f40150e = i2;
        this.f40147b = jlVar;
        this.f40149d = akVar;
        this.f40148c = aVar;
    }
}
