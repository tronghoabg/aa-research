package com.waze.main_screen.p;

import androidx.compose.ui.unit.Density;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
final class bc extends h.c.b.a.g implements h.g.a.p {

    /* renamed from: a, reason: collision with root package name */
    int f27169a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ Density f27170b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ com.waze.ui.l.bp f27171c;

    /* renamed from: d, reason: collision with root package name */
    final /* synthetic */ Integer f27172d;

    /* renamed from: e, reason: collision with root package name */
    final /* synthetic */ bf f27173e;

    /* renamed from: f, reason: collision with root package name */
    final /* synthetic */ int f27174f;

    /* renamed from: g, reason: collision with root package name */
    private /* synthetic */ Object f27175g;

    /* renamed from: h, reason: collision with root package name */
    private final /* synthetic */ int f27176h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    bc(Density density, com.waze.ui.l.bp bpVar, Integer num, bf bfVar, int i2, h.c.e eVar, int i3) {
        super(2, eVar);
        this.f27176h = i3;
        this.f27170b = density;
        this.f27171c = bpVar;
        this.f27172d = num;
        this.f27173e = bfVar;
        this.f27174f = i2;
    }

    @Override // h.c.b.a.a
    public final h.c.e create(Object obj, h.c.e eVar) {
        if (this.f27176h != 0) {
            bc bcVar = new bc(this.f27170b, this.f27171c, this.f27172d, this.f27173e, this.f27174f, eVar, 1, null);
            bcVar.f27175g = obj;
            return bcVar;
        }
        bc bcVar2 = new bc(this.f27170b, this.f27171c, this.f27172d, this.f27173e, this.f27174f, eVar, 0);
        bcVar2.f27175g = obj;
        return bcVar2;
    }

    @Override // h.g.a.p
    public final /* synthetic */ Object invoke(Object obj, Object obj2) {
        return this.f27176h != 0 ? ((bc) create((kotlinx.coroutines.af) obj, (h.c.e) obj2)).invokeSuspend(h.ab.f48028a) : ((bc) create((kotlinx.coroutines.af) obj, (h.c.e) obj2)).invokeSuspend(h.ab.f48028a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:100:0x0273, code lost:
    
        if (kotlinx.coroutines.aj.d(new com.waze.main_screen.p.bb(r21.f27173e, r8, null, 2, null), r21) == r1) goto L101;
     */
    /* JADX WARN: Code restructure failed: missing block: B:101:0x0275, code lost:
    
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x005e, code lost:
    
        if (kotlinx.coroutines.aj.d(new com.waze.main_screen.p.ax(r14, r10, r11, r12, null), r21) == r1) goto L43;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x009b, code lost:
    
        if (kotlinx.coroutines.aj.d(new com.waze.main_screen.p.az(r14, r13, r21.f27173e, null), r21) == r1) goto L43;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x00b7, code lost:
    
        if (r21.f27173e.h().e().o(r21) == r1) goto L43;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x00e8, code lost:
    
        if (kotlinx.coroutines.aj.d(new com.waze.main_screen.p.bb(r21.f27173e, r3 + 16.0f, (h.c.e) null, 1), r21) == r1) goto L43;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x00ea, code lost:
    
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:82:0x020a, code lost:
    
        if (kotlinx.coroutines.aj.d(new com.waze.main_screen.p.ba(r8, r3, r2, null), r21) == r1) goto L101;
     */
    /* JADX WARN: Code restructure failed: missing block: B:93:0x0244, code lost:
    
        if (kotlinx.coroutines.aj.d(new com.waze.main_screen.p.bb(r9, r21.f27173e, (h.c.e) null, 0), r21) == r1) goto L101;
     */
    @Override // h.c.b.a.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r22) {
        /*
            Method dump skipped, instructions count: 675
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.waze.main_screen.p.bc.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    bc(Density density, com.waze.ui.l.bp bpVar, Integer num, bf bfVar, int i2, h.c.e eVar, int i3, byte[] bArr) {
        super(2, eVar);
        this.f27176h = i3;
        this.f27170b = density;
        this.f27171c = bpVar;
        this.f27172d = num;
        this.f27173e = bfVar;
        this.f27174f = i2;
    }
}
