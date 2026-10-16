package com.waze.main_screen.u;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
final class p extends h.c.b.a.g implements h.g.a.p {

    /* renamed from: a, reason: collision with root package name */
    /* synthetic */ Object f27722a;

    /* renamed from: b, reason: collision with root package name */
    private final /* synthetic */ int f27723b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    p(h.c.e eVar, int i2) {
        super(2, eVar);
        this.f27723b = i2;
    }

    @Override // h.c.b.a.a
    public final h.c.e create(Object obj, h.c.e eVar) {
        int i2 = this.f27723b;
        if (i2 == 0) {
            p pVar = new p(eVar, 0);
            pVar.f27722a = obj;
            return pVar;
        }
        if (i2 != 1) {
            p pVar2 = new p(eVar, 2, (char[]) null);
            pVar2.f27722a = obj;
            return pVar2;
        }
        p pVar3 = new p(eVar, 1, (byte[]) null);
        pVar3.f27722a = obj;
        return pVar3;
    }

    @Override // h.g.a.p
    public final /* synthetic */ Object invoke(Object obj, Object obj2) {
        int i2 = this.f27723b;
        return i2 != 0 ? i2 != 1 ? ((p) create((com.waze.resume_drive.a) obj, (h.c.e) obj2)).invokeSuspend(h.ab.f48028a) : ((p) create((com.waze.resume_drive.h) obj, (h.c.e) obj2)).invokeSuspend(h.ab.f48028a) : ((p) create((com.waze.resume_drive.a) obj, (h.c.e) obj2)).invokeSuspend(h.ab.f48028a);
    }

    @Override // h.c.b.a.a
    public final Object invokeSuspend(Object obj) {
        int i2 = this.f27723b;
        if (i2 == 0) {
            h.c.a.a aVar = h.c.a.a.f48038a;
            e.b.c.b(obj);
            return Boolean.valueOf(h.g.b.x.n((com.waze.resume_drive.a) this.f27722a, com.waze.bn.e.f17151a));
        }
        if (i2 != 1) {
            h.c.a.a aVar2 = h.c.a.a.f48038a;
            e.b.c.b(obj);
            return Boolean.valueOf(h.g.b.x.n((com.waze.resume_drive.a) this.f27722a, com.waze.bn.e.f17151a));
        }
        h.c.a.a aVar3 = h.c.a.a.f48038a;
        e.b.c.b(obj);
        return Boolean.valueOf(((com.waze.resume_drive.h) this.f27722a) instanceof com.waze.resume_drive.f);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    p(h.c.e eVar, int i2, byte[] bArr) {
        super(2, eVar);
        this.f27723b = i2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    p(h.c.e eVar, int i2, char[] cArr) {
        super(2, eVar);
        this.f27723b = i2;
    }
}
