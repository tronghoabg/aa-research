package N0;

/* loaded from: classes.dex */
public final class j {

    /* renamed from: a, reason: collision with root package name */
    public Object f8016a;

    /* renamed from: b, reason: collision with root package name */
    public m f8017b;

    /* renamed from: c, reason: collision with root package name */
    public n f8018c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f8019d;

    public final void a(Object obj) {
        this.f8019d = true;
        m mVar = this.f8017b;
        if (mVar == null || !mVar.f8022b.i(obj)) {
            return;
        }
        this.f8016a = null;
        this.f8017b = null;
        this.f8018c = null;
    }

    public final void b(Throwable th) {
        this.f8019d = true;
        m mVar = this.f8017b;
        if (mVar == null || !mVar.f8022b.j(th)) {
            return;
        }
        this.f8016a = null;
        this.f8017b = null;
        this.f8018c = null;
    }

    public final void finalize() {
        n nVar;
        m mVar = this.f8017b;
        if (mVar != null) {
            l lVar = mVar.f8022b;
            if (!lVar.isDone()) {
                lVar.j(new c("The completer object was garbage collected - this future would otherwise never complete. The tag was: " + this.f8016a, 1));
            }
        }
        if (this.f8019d || (nVar = this.f8018c) == null) {
            return;
        }
        nVar.i(null);
    }
}
