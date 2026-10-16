package com.waze.c.e;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
final class ah extends h.c.b.a.g implements h.g.a.p {

    /* renamed from: a, reason: collision with root package name */
    int f18505a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ Object f18506b;

    /* renamed from: c, reason: collision with root package name */
    private final /* synthetic */ int f18507c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ah(al alVar, h.c.e eVar, int i2) {
        super(2, eVar);
        this.f18507c = i2;
        this.f18506b = alVar;
    }

    @Override // h.c.b.a.a
    public final h.c.e create(Object obj, h.c.e eVar) {
        int i2 = this.f18507c;
        if (i2 == 0) {
            return new ah((al) this.f18506b, eVar, 0);
        }
        if (i2 == 1) {
            return new ah((k) this.f18506b, eVar, 1);
        }
        if (i2 == 2) {
            return new ah((bc) this.f18506b, eVar, 2);
        }
        if (i2 == 3) {
            return new ah((bc) this.f18506b, eVar, 3, (byte[]) null);
        }
        if (i2 == 4) {
            return new ah((bc) this.f18506b, eVar, 4, (char[]) null);
        }
        Object obj2 = this.f18506b;
        return i2 != 5 ? new ah((bc) obj2, eVar, 6, (int[]) null) : new ah((bc) obj2, eVar, 5, (short[]) null);
    }

    @Override // h.g.a.p
    public final /* synthetic */ Object invoke(Object obj, Object obj2) {
        int i2 = this.f18507c;
        return i2 != 0 ? i2 != 1 ? i2 != 2 ? i2 != 3 ? i2 != 4 ? i2 != 5 ? ((ah) create((kotlinx.coroutines.af) obj, (h.c.e) obj2)).invokeSuspend(h.ab.f48028a) : ((ah) create((kotlinx.coroutines.af) obj, (h.c.e) obj2)).invokeSuspend(h.ab.f48028a) : ((ah) create((kotlinx.coroutines.af) obj, (h.c.e) obj2)).invokeSuspend(h.ab.f48028a) : ((ah) create((kotlinx.coroutines.af) obj, (h.c.e) obj2)).invokeSuspend(h.ab.f48028a) : ((ah) create((kotlinx.coroutines.af) obj, (h.c.e) obj2)).invokeSuspend(h.ab.f48028a) : ((ah) create((kotlinx.coroutines.af) obj, (h.c.e) obj2)).invokeSuspend(h.ab.f48028a) : ((ah) create((kotlinx.coroutines.af) obj, (h.c.e) obj2)).invokeSuspend(h.ab.f48028a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:62:0x0162, code lost:
    
        if (kotlinx.coroutines.aj.r(com.waze.z.a.g.z.a(), r8) == r0) goto L63;
     */
    @Override // h.c.b.a.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r9) {
        /*
            Method dump skipped, instructions count: 403
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.waze.c.e.ah.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ah(bc bcVar, h.c.e eVar, int i2) {
        super(2, eVar);
        this.f18507c = i2;
        this.f18506b = bcVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ah(bc bcVar, h.c.e eVar, int i2, byte[] bArr) {
        super(2, eVar);
        this.f18507c = i2;
        this.f18506b = bcVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ah(bc bcVar, h.c.e eVar, int i2, char[] cArr) {
        super(2, eVar);
        this.f18507c = i2;
        this.f18506b = bcVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ah(bc bcVar, h.c.e eVar, int i2, int[] iArr) {
        super(2, eVar);
        this.f18507c = i2;
        this.f18506b = bcVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ah(bc bcVar, h.c.e eVar, int i2, short[] sArr) {
        super(2, eVar);
        this.f18507c = i2;
        this.f18506b = bcVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ah(k kVar, h.c.e eVar, int i2) {
        super(2, eVar);
        this.f18507c = i2;
        this.f18506b = kVar;
    }
}
