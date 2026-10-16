package com.waze.main_screen.v;

import com.waze.cf;
import com.waze.cs;
import com.waze.navigate.ei;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
final class v extends h.c.b.a.g implements h.g.a.p {

    /* renamed from: a, reason: collision with root package name */
    /* synthetic */ Object f27827a;

    /* renamed from: b, reason: collision with root package name */
    private final /* synthetic */ int f27828b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    v(h.c.e eVar, int i2) {
        super(2, eVar);
        this.f27828b = i2;
    }

    @Override // h.c.b.a.a
    public final h.c.e create(Object obj, h.c.e eVar) {
        int i2 = this.f27828b;
        if (i2 == 0) {
            v vVar = new v(eVar, 0);
            vVar.f27827a = obj;
            return vVar;
        }
        if (i2 != 1) {
            v vVar2 = new v(eVar, 2, (char[]) null);
            vVar2.f27827a = obj;
            return vVar2;
        }
        v vVar3 = new v(eVar, 1, (byte[]) null);
        vVar3.f27827a = obj;
        return vVar3;
    }

    @Override // h.g.a.p
    public final /* synthetic */ Object invoke(Object obj, Object obj2) {
        int i2 = this.f27828b;
        return i2 != 0 ? i2 != 1 ? ((v) create((cf) obj, (h.c.e) obj2)).invokeSuspend(h.ab.f48028a) : ((v) create((ei) obj, (h.c.e) obj2)).invokeSuspend(h.ab.f48028a) : ((v) create((com.waze.resume_drive.a) obj, (h.c.e) obj2)).invokeSuspend(h.ab.f48028a);
    }

    @Override // h.c.b.a.a
    public final Object invokeSuspend(Object obj) {
        int i2 = this.f27828b;
        if (i2 == 0) {
            h.c.a.a aVar = h.c.a.a.f48038a;
            e.b.c.b(obj);
            return Boolean.valueOf(h.g.b.x.n((com.waze.resume_drive.a) this.f27827a, com.waze.bn.e.f17151a));
        }
        if (i2 != 1) {
            h.c.a.a aVar2 = h.c.a.a.f48038a;
            e.b.c.b(obj);
            return Boolean.valueOf(cs.g((cf) this.f27827a));
        }
        h.c.a.a aVar3 = h.c.a.a.f48038a;
        e.b.c.b(obj);
        return Boolean.valueOf(((ei) this.f27827a) == ei.f31311b);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    v(h.c.e eVar, int i2, byte[] bArr) {
        super(2, eVar);
        this.f27828b = i2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    v(h.c.e eVar, int i2, char[] cArr) {
        super(2, eVar);
        this.f27828b = i2;
    }
}
