package ff;

/* renamed from: ff.D, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C2643D extends AbstractC2647b {

    /* renamed from: a, reason: collision with root package name */
    public int f35406a;

    /* renamed from: b, reason: collision with root package name */
    public int f35407b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ C2644E f35408c;

    public C2643D(C2644E c2644e) {
        this.f35408c = c2644e;
        this.f35406a = c2644e.size();
        this.f35407b = c2644e.f35411c;
    }

    @Override // ff.AbstractC2647b
    public final void computeNext() {
        if (this.f35406a == 0) {
            done();
            return;
        }
        C2644E c2644e = this.f35408c;
        setNext(c2644e.f35409a[this.f35407b]);
        this.f35407b = (this.f35407b + 1) % c2644e.f35410b;
        this.f35406a--;
    }
}
