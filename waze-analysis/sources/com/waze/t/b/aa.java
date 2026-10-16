package com.waze.t.b;

import kotlinx.coroutines.b.ch;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
final class aa extends h.c.b.a.g implements h.g.a.p {

    /* renamed from: a, reason: collision with root package name */
    int f40649a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ Object f40650b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ Object f40651c;

    /* renamed from: d, reason: collision with root package name */
    private final /* synthetic */ int f40652d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    aa(com.waze.shared_infra.m.a aVar, ag agVar, h.c.e eVar, int i2) {
        super(2, eVar);
        this.f40652d = i2;
        this.f40650b = aVar;
        this.f40651c = agVar;
    }

    /* JADX WARN: Type inference failed for: r11v1, types: [com.waze.shared_infra.m.a, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v2, types: [java.lang.Object, kotlinx.coroutines.b.ch] */
    /* JADX WARN: Type inference failed for: r9v3, types: [java.lang.Object, kotlinx.coroutines.a.o] */
    /* JADX WARN: Type inference failed for: r9v8, types: [java.lang.Object, kotlinx.coroutines.b.ch] */
    @Override // h.c.b.a.a
    public final h.c.e create(Object obj, h.c.e eVar) {
        int i2 = this.f40652d;
        if (i2 == 0) {
            return new aa((com.waze.shared_infra.m.a) this.f40650b, (ag) this.f40651c, eVar, 0);
        }
        if (i2 == 1) {
            return new aa((ag) this.f40651c, (kotlinx.coroutines.a.o) this.f40650b, eVar, 1);
        }
        if (i2 == 2) {
            return new aa((ag) this.f40651c, (String) this.f40650b, eVar, 2);
        }
        if (i2 == 3) {
            return new aa((ag) this.f40651c, (String) this.f40650b, eVar, 3, (byte[]) null);
        }
        Object obj2 = this.f40651c;
        if (i2 != 4) {
            return new aa((az) obj2, (ch) this.f40650b, eVar, 5, (byte[]) null);
        }
        return new aa((az) obj2, (ch) this.f40650b, eVar, 4);
    }

    @Override // h.g.a.p
    public final /* synthetic */ Object invoke(Object obj, Object obj2) {
        int i2 = this.f40652d;
        return i2 != 0 ? i2 != 1 ? i2 != 2 ? i2 != 3 ? i2 != 4 ? ((aa) create((kotlinx.coroutines.af) obj, (h.c.e) obj2)).invokeSuspend(h.ab.f48028a) : ((aa) create((kotlinx.coroutines.af) obj, (h.c.e) obj2)).invokeSuspend(h.ab.f48028a) : ((aa) create((kotlinx.coroutines.af) obj, (h.c.e) obj2)).invokeSuspend(h.ab.f48028a) : ((aa) create((kotlinx.coroutines.af) obj, (h.c.e) obj2)).invokeSuspend(h.ab.f48028a) : ((aa) create((kotlinx.coroutines.af) obj, (h.c.e) obj2)).invokeSuspend(h.ab.f48028a) : ((aa) create((kotlinx.coroutines.af) obj, (h.c.e) obj2)).invokeSuspend(h.ab.f48028a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:51:0x00e5, code lost:
    
        if (com.waze.t.b.ag.H((com.waze.t.b.ag) r1, (com.waze.app_nav.hub.b.m) r6, r5) == r0) goto L55;
     */
    /* JADX WARN: Type inference failed for: r6v1, types: [com.waze.shared_infra.m.a, java.lang.Object] */
    @Override // h.c.b.a.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r6) {
        /*
            Method dump skipped, instructions count: 296
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.waze.t.b.aa.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    aa(ag agVar, String str, h.c.e eVar, int i2) {
        super(2, eVar);
        this.f40652d = i2;
        this.f40651c = agVar;
        this.f40650b = str;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    aa(ag agVar, String str, h.c.e eVar, int i2, byte[] bArr) {
        super(2, eVar);
        this.f40652d = i2;
        this.f40651c = agVar;
        this.f40650b = str;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    aa(ag agVar, kotlinx.coroutines.a.o oVar, h.c.e eVar, int i2) {
        super(2, eVar);
        this.f40652d = i2;
        this.f40651c = agVar;
        this.f40650b = oVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    aa(az azVar, ch chVar, h.c.e eVar, int i2) {
        super(2, eVar);
        this.f40652d = i2;
        this.f40651c = azVar;
        this.f40650b = chVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    aa(az azVar, ch chVar, h.c.e eVar, int i2, byte[] bArr) {
        super(2, eVar);
        this.f40652d = i2;
        this.f40651c = azVar;
        this.f40650b = chVar;
    }
}
