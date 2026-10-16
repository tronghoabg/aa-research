package Re;

/* renamed from: Re.g, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C0812g implements ug.b {

    /* renamed from: a, reason: collision with root package name */
    public final He.f f10727a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f10728b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f10729c;

    public C0812g(He.f fVar, Object obj) {
        this.f10728b = obj;
        this.f10727a = fVar;
    }

    @Override // ug.b
    public final void request(long j8) {
        if (j8 <= 0 || this.f10729c) {
            return;
        }
        this.f10729c = true;
        Object obj = this.f10728b;
        He.f fVar = this.f10727a;
        fVar.b(obj);
        fVar.onComplete();
    }

    @Override // ug.b
    public final void cancel() {
    }
}
