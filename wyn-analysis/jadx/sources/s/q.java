package S;

/* loaded from: classes.dex */
public final class q extends o {

    /* renamed from: d, reason: collision with root package name */
    public final h f10833d;

    public q(h hVar) {
        this.f10833d = hVar;
    }

    @Override // java.util.Iterator
    public final Object next() {
        int i5 = this.f10831c;
        this.f10831c = i5 + 2;
        Object[] objArr = this.f10829a;
        return new b(this.f10833d, objArr[i5], objArr[i5 + 1]);
    }
}
