package kotlinx.coroutines.b.a;

import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
final class s extends h.c.b.a.g implements h.g.a.p {

    /* renamed from: a, reason: collision with root package name */
    int f51440a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ kotlinx.coroutines.b.k[] f51441b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ int f51442c;

    /* renamed from: d, reason: collision with root package name */
    final /* synthetic */ AtomicInteger f51443d;

    /* renamed from: e, reason: collision with root package name */
    final /* synthetic */ kotlinx.coroutines.a.o f51444e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    s(kotlinx.coroutines.b.k[] kVarArr, int i2, AtomicInteger atomicInteger, kotlinx.coroutines.a.o oVar, h.c.e eVar) {
        super(2, eVar);
        this.f51441b = kVarArr;
        this.f51442c = i2;
        this.f51443d = atomicInteger;
        this.f51444e = oVar;
    }

    @Override // h.c.b.a.a
    public final h.c.e<h.ab> create(Object obj, h.c.e<?> eVar) {
        return new s(this.f51441b, this.f51442c, this.f51443d, this.f51444e, eVar);
    }

    @Override // h.g.a.p
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((s) create((kotlinx.coroutines.af) obj, (h.c.e) obj2)).invokeSuspend(h.ab.f48028a);
    }

    @Override // h.c.b.a.a
    public final Object invokeSuspend(Object obj) {
        AtomicInteger atomicInteger;
        h.c.a.a aVar = h.c.a.a.f48038a;
        try {
            if (this.f51440a != 0) {
                e.b.c.b(obj);
            } else {
                e.b.c.b(obj);
                kotlinx.coroutines.b.k[] kVarArr = this.f51441b;
                int i2 = this.f51442c;
                this.f51440a = 1;
                if (kVarArr[i2].collect(new r(this.f51444e, i2), this) == aVar) {
                    return aVar;
                }
            }
            if (atomicInteger.decrementAndGet() == 0) {
                this.f51444e.v(null);
            }
            return h.ab.f48028a;
        } finally {
            if (this.f51443d.decrementAndGet() == 0) {
                this.f51444e.v(null);
            }
        }
    }
}
