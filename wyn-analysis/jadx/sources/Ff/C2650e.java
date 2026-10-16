package ff;

import java.util.List;
import java.util.RandomAccess;

/* renamed from: ff.e, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C2650e extends AbstractC2651f implements RandomAccess {

    /* renamed from: a, reason: collision with root package name */
    public final AbstractC2651f f35421a;

    /* renamed from: b, reason: collision with root package name */
    public final int f35422b;

    /* renamed from: c, reason: collision with root package name */
    public final int f35423c;

    public C2650e(AbstractC2651f abstractC2651f, int i5, int i10) {
        this.f35421a = abstractC2651f;
        this.f35422b = i5;
        C2648c c2648c = AbstractC2651f.Companion;
        int size = abstractC2651f.size();
        c2648c.getClass();
        C2648c.d(i5, i10, size);
        this.f35423c = i10 - i5;
    }

    @Override // java.util.List
    public final Object get(int i5) {
        C2648c c2648c = AbstractC2651f.Companion;
        int i10 = this.f35423c;
        c2648c.getClass();
        C2648c.b(i5, i10);
        return this.f35421a.get(this.f35422b + i5);
    }

    @Override // ff.AbstractC2646a
    public final int getSize() {
        return this.f35423c;
    }

    @Override // ff.AbstractC2651f, java.util.List
    public final List subList(int i5, int i10) {
        C2648c c2648c = AbstractC2651f.Companion;
        int i11 = this.f35423c;
        c2648c.getClass();
        C2648c.d(i5, i10, i11);
        int i12 = this.f35422b;
        return new C2650e(this.f35421a, i5 + i12, i12 + i10);
    }
}
