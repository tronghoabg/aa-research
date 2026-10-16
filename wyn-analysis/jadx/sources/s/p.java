package S;

/* loaded from: classes.dex */
public final class p extends o {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f10832d;

    @Override // java.util.Iterator
    public final Object next() {
        switch (this.f10832d) {
            case 0:
                int i5 = this.f10831c;
                this.f10831c = i5 + 2;
                Object[] objArr = this.f10829a;
                return new a(objArr[i5], objArr[i5 + 1]);
            case 1:
                int i10 = this.f10831c;
                this.f10831c = i10 + 2;
                return this.f10829a[i10];
            default:
                int i11 = this.f10831c;
                this.f10831c = i11 + 2;
                return this.f10829a[i11 + 1];
        }
    }
}
