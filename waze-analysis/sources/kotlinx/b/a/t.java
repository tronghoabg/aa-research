package kotlinx.b.a;

import java.util.Iterator;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class t implements Iterator, h.g.b.a.a {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ q f50933a;

    /* renamed from: b, reason: collision with root package name */
    private int f50934b;

    /* renamed from: c, reason: collision with root package name */
    private final /* synthetic */ int f50935c;

    t(q qVar, int i2, byte[] bArr) {
        this.f50935c = i2;
        this.f50933a = qVar;
        this.f50934b = qVar.b();
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        int i2 = this.f50935c;
        int i3 = this.f50934b;
        return i2 != 0 ? i3 > 0 : i3 > 0;
    }

    @Override // java.util.Iterator
    public final /* synthetic */ Object next() {
        int i2 = this.f50935c;
        q qVar = this.f50933a;
        if (i2 != 0) {
            int iB = qVar.b();
            int i3 = this.f50934b;
            this.f50934b = i3 - 1;
            return qVar.g(iB - i3);
        }
        int iB2 = qVar.b();
        int i4 = this.f50934b;
        this.f50934b = i4 - 1;
        return qVar.c(iB2 - i4);
    }

    @Override // java.util.Iterator
    public final void remove() {
        if (this.f50935c == 0) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    t(q qVar, int i2) {
        this.f50935c = i2;
        this.f50933a = qVar;
        this.f50934b = qVar.b();
    }
}
