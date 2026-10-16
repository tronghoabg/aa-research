package com.waze.bw.c.d;

import androidx.compose.material.ModalBottomSheetState;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
final class ci extends h.c.b.a.g implements h.g.a.p {

    /* renamed from: a, reason: collision with root package name */
    int f18028a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ Object f18029b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ Object f18030c;

    /* renamed from: d, reason: collision with root package name */
    final /* synthetic */ Object f18031d;

    /* renamed from: e, reason: collision with root package name */
    private final /* synthetic */ int f18032e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ci(l lVar, ModalBottomSheetState modalBottomSheetState, com.waze.z.a.b.ab abVar, h.c.e eVar, int i2) {
        super(2, eVar);
        this.f18032e = i2;
        this.f18030c = lVar;
        this.f18031d = modalBottomSheetState;
        this.f18029b = abVar;
    }

    @Override // h.c.b.a.a
    public final h.c.e create(Object obj, h.c.e eVar) {
        if (this.f18032e != 0) {
            Object obj2 = this.f18030c;
            return new ci((l) obj2, (ModalBottomSheetState) this.f18031d, (com.waze.z.a.b.ab) this.f18029b, eVar, 1);
        }
        Object obj3 = this.f18029b;
        return new ci((String) obj3, (String) this.f18030c, (com.waze.z.a.al) this.f18031d, eVar, 0);
    }

    @Override // h.g.a.p
    public final /* synthetic */ Object invoke(Object obj, Object obj2) {
        return this.f18032e != 0 ? ((ci) create((kotlinx.coroutines.af) obj, (h.c.e) obj2)).invokeSuspend(h.ab.f48028a) : ((ci) create((kotlinx.coroutines.af) obj, (h.c.e) obj2)).invokeSuspend(h.ab.f48028a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x002f, code lost:
    
        if (r4.hide(r3) == r0) goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0040, code lost:
    
        if (((com.waze.z.a.b.ab) r4).k(r3) == r0) goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0042, code lost:
    
        return r0;
     */
    @Override // h.c.b.a.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r4) {
        /*
            r3 = this;
            int r0 = r3.f18032e
            r1 = 1
            if (r0 == 0) goto L46
            h.c.a.a r0 = h.c.a.a.f48038a
            int r2 = r3.f18028a
            if (r2 == 0) goto Lf
            e.b.c.b(r4)
            goto L43
        Lf:
            e.b.c.b(r4)
            java.lang.Object r4 = r3.f18030c
            com.waze.bw.c.d.l r4 = (com.waze.bw.c.d.l) r4
            java.lang.Integer r4 = r4.e()
            if (r4 == 0) goto L43
            java.lang.Object r4 = r3.f18031d
            androidx.compose.material.ModalBottomSheetState r4 = (androidx.compose.material.ModalBottomSheetState) r4
            boolean r2 = r4.isVisible()
            if (r2 == 0) goto L32
            r2 = r3
            h.c.e r2 = (h.c.e) r2
            r3.f18028a = r1
            java.lang.Object r3 = r4.hide(r2)
            if (r3 != r0) goto L43
            goto L42
        L32:
            java.lang.Object r4 = r3.f18029b
            r1 = r3
            h.c.e r1 = (h.c.e) r1
            r2 = 2
            r3.f18028a = r2
            com.waze.z.a.b.ab r4 = (com.waze.z.a.b.ab) r4
            java.lang.Object r3 = r4.k(r1)
            if (r3 != r0) goto L43
        L42:
            return r0
        L43:
            h.ab r3 = h.ab.f48028a
            return r3
        L46:
            h.c.a.a r0 = h.c.a.a.f48038a
            int r2 = r3.f18028a
            if (r2 == 0) goto L50
            e.b.c.b(r4)
            goto L6d
        L50:
            e.b.c.b(r4)
            java.lang.Object r4 = r3.f18029b
            java.lang.Object r2 = r3.f18030c
            boolean r4 = h.g.b.x.n(r4, r2)
            if (r4 != 0) goto L6d
            java.lang.Object r4 = r3.f18031d
            r2 = r3
            h.c.e r2 = (h.c.e) r2
            r3.f18028a = r1
            com.waze.z.a.al r4 = (com.waze.z.a.al) r4
            java.lang.Object r3 = r4.d(r2)
            if (r3 != r0) goto L6d
            return r0
        L6d:
            h.ab r3 = h.ab.f48028a
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.waze.bw.c.d.ci.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ci(String str, String str2, com.waze.z.a.al alVar, h.c.e eVar, int i2) {
        super(2, eVar);
        this.f18032e = i2;
        this.f18029b = str;
        this.f18030c = str2;
        this.f18031d = alVar;
    }
}
