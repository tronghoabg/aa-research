package Q;

import ff.AbstractC2651f;
import java.util.List;

/* loaded from: classes.dex */
public final class a extends AbstractC2651f {

    /* renamed from: a, reason: collision with root package name */
    public final R.c f9484a;

    /* renamed from: b, reason: collision with root package name */
    public final int f9485b;

    /* renamed from: c, reason: collision with root package name */
    public final int f9486c;

    public a(R.c cVar, int i5, int i10) {
        this.f9484a = cVar;
        this.f9485b = i5;
        tg.b.u(i5, i10, cVar.size());
        this.f9486c = i10 - i5;
    }

    @Override // java.util.List
    public final Object get(int i5) {
        tg.b.q(i5, this.f9486c);
        return this.f9484a.get(this.f9485b + i5);
    }

    @Override // ff.AbstractC2646a
    public final int getSize() {
        return this.f9486c;
    }

    @Override // ff.AbstractC2651f, java.util.List
    public final List subList(int i5, int i10) {
        tg.b.u(i5, i10, this.f9486c);
        int i11 = this.f9485b;
        return new a(this.f9484a, i5 + i11, i11 + i10);
    }
}
