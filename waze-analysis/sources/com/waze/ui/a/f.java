package com.waze.ui.a;

import h.ab;
import kotlinx.coroutines.af;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class f extends h.c.b.a.g implements h.g.a.p {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ Object f41655a;

    /* renamed from: b, reason: collision with root package name */
    private final /* synthetic */ int f41656b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    f(h.g.a.a aVar, h.c.e eVar, int i2) {
        super(2, eVar);
        this.f41656b = i2;
        this.f41655a = aVar;
    }

    /* JADX WARN: Type inference failed for: r2v1, types: [h.g.a.l, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v2, types: [h.g.a.l, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v3, types: [h.g.a.a, java.lang.Object] */
    @Override // h.c.b.a.a
    public final h.c.e create(Object obj, h.c.e eVar) {
        int i2 = this.f41656b;
        return i2 != 0 ? i2 != 1 ? new f((h.g.a.a) this.f41655a, eVar, 2) : new f(this.f41655a, eVar, 1, null) : new f((h.g.a.l) this.f41655a, eVar, 0);
    }

    @Override // h.g.a.p
    public final /* synthetic */ Object invoke(Object obj, Object obj2) {
        int i2 = this.f41656b;
        return i2 != 0 ? i2 != 1 ? ((f) create((af) obj, (h.c.e) obj2)).invokeSuspend(ab.f48028a) : ((f) create((af) obj, (h.c.e) obj2)).invokeSuspend(ab.f48028a) : ((f) create((af) obj, (h.c.e) obj2)).invokeSuspend(ab.f48028a);
    }

    /* JADX WARN: Type inference failed for: r2v1, types: [h.g.a.l, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v3, types: [h.g.a.l, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v5, types: [h.g.a.a, java.lang.Object] */
    @Override // h.c.b.a.a
    public final Object invokeSuspend(Object obj) {
        int i2 = this.f41656b;
        if (i2 == 0) {
            h.c.a.a aVar = h.c.a.a.f48038a;
            e.b.c.b(obj);
            this.f41655a.invoke(false);
            return ab.f48028a;
        }
        if (i2 != 1) {
            h.c.a.a aVar2 = h.c.a.a.f48038a;
            e.b.c.b(obj);
            this.f41655a.invoke();
            return ab.f48028a;
        }
        h.c.a.a aVar3 = h.c.a.a.f48038a;
        e.b.c.b(obj);
        this.f41655a.invoke(true);
        return ab.f48028a;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    f(h.g.a.l lVar, h.c.e eVar, int i2) {
        super(2, eVar);
        this.f41656b = i2;
        this.f41655a = lVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    f(h.g.a.l lVar, h.c.e eVar, int i2, byte[] bArr) {
        super(2, eVar);
        this.f41656b = i2;
        this.f41655a = lVar;
    }
}
