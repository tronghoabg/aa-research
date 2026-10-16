package com.waze.ui.l;

import androidx.compose.ui.unit.Dp;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
final class av extends h.c.b.a.g implements h.g.a.p {

    /* renamed from: a, reason: collision with root package name */
    /* synthetic */ Object f42528a;

    /* renamed from: b, reason: collision with root package name */
    private final /* synthetic */ int f42529b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    av(h.c.e eVar, int i2) {
        super(2, eVar);
        this.f42529b = i2;
    }

    @Override // h.c.b.a.a
    public final h.c.e create(Object obj, h.c.e eVar) {
        if (this.f42529b != 0) {
            av avVar = new av(eVar, 1, null);
            avVar.f42528a = (Dp) obj;
            return avVar;
        }
        av avVar2 = new av(eVar, 0);
        avVar2.f42528a = (Dp) obj;
        return avVar2;
    }

    @Override // h.g.a.p
    public final /* synthetic */ Object invoke(Object obj, Object obj2) {
        return this.f42529b != 0 ? ((av) create((Dp) obj, (h.c.e) obj2)).invokeSuspend(h.ab.f48028a) : ((av) create((Dp) obj, (h.c.e) obj2)).invokeSuspend(h.ab.f48028a);
    }

    @Override // h.c.b.a.a
    public final Object invokeSuspend(Object obj) {
        if (this.f42529b != 0) {
            h.c.a.a aVar = h.c.a.a.f48038a;
            e.b.c.b(obj);
            return Boolean.valueOf(((Dp) this.f42528a) != null);
        }
        h.c.a.a aVar2 = h.c.a.a.f48038a;
        e.b.c.b(obj);
        return Boolean.valueOf(((Dp) this.f42528a) != null);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    av(h.c.e eVar, int i2, byte[] bArr) {
        super(2, eVar);
        this.f42529b = i2;
    }
}
