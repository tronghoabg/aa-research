package We;

import Re.I;
import java.util.concurrent.TimeUnit;

/* loaded from: classes5.dex */
public final class a extends He.l {

    /* renamed from: a, reason: collision with root package name */
    public final Je.a f15465a;

    /* renamed from: b, reason: collision with root package name */
    public final Je.a f15466b;

    /* renamed from: c, reason: collision with root package name */
    public final Je.a f15467c;

    /* renamed from: d, reason: collision with root package name */
    public final c f15468d;

    /* renamed from: e, reason: collision with root package name */
    public volatile boolean f15469e;

    public a(c cVar) {
        this.f15468d = cVar;
        Je.a aVar = new Je.a(1);
        this.f15465a = aVar;
        Je.a aVar2 = new Je.a(0);
        this.f15466b = aVar2;
        Je.a aVar3 = new Je.a(1);
        this.f15467c = aVar3;
        aVar3.a(aVar);
        aVar3.a(aVar2);
    }

    @Override // He.l
    public final Je.b a(Runnable runnable, TimeUnit timeUnit) {
        return this.f15469e ? Me.b.f7635a : this.f15468d.c(runnable, TimeUnit.NANOSECONDS, this.f15466b);
    }

    @Override // He.l
    public final void b(I i5) {
        if (this.f15469e) {
            return;
        }
        this.f15468d.c(i5, TimeUnit.MILLISECONDS, this.f15465a);
    }

    @Override // Je.b
    public final void dispose() {
        if (this.f15469e) {
            return;
        }
        this.f15469e = true;
        this.f15467c.dispose();
    }
}
