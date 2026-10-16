package h.k;

/* compiled from: WazeSource */
/* loaded from: classes2.dex */
public final class j extends h implements f<Integer> {

    /* renamed from: a, reason: collision with root package name */
    private static final j f48156a = new j(1, 0);

    public j(int i2, int i3) {
        super(i2, i3, 1);
    }

    @Override // h.k.f
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public final Integer getEndInclusive() {
        return Integer.valueOf(b());
    }

    @Override // h.k.f
    /* renamed from: e, reason: merged with bridge method [inline-methods] */
    public final Integer getStart() {
        return Integer.valueOf(a());
    }

    @Override // h.k.h
    public final boolean equals(Object obj) {
        if (obj instanceof j) {
            if (isEmpty() && ((j) obj).isEmpty()) {
                return true;
            }
            j jVar = (j) obj;
            return a() == jVar.a() && b() == jVar.b();
        }
        return false;
    }

    public final boolean g(int i2) {
        return a() <= i2 && i2 <= b();
    }

    @Override // h.k.h
    public final int hashCode() {
        if (isEmpty()) {
            return -1;
        }
        return (a() * 31) + b();
    }

    @Override // h.k.h, h.k.f
    public final boolean isEmpty() {
        return a() > b();
    }

    @Override // h.k.h
    public final String toString() {
        return a() + ".." + b();
    }
}
