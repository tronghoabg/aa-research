package Re;

/* renamed from: Re.l, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C0817l extends AbstractC0814i {
    @Override // He.d
    public final void b(Object obj) {
        long j8;
        if (this.f10735b.b()) {
            return;
        }
        if (obj == null) {
            d(new NullPointerException("onNext called with null. Null values are generally not allowed in 2.x operators and sources."));
            return;
        }
        this.f10734a.b(obj);
        do {
            j8 = get();
            if (j8 == 0) {
                return;
            }
        } while (!compareAndSet(j8, j8 - 1));
    }
}
