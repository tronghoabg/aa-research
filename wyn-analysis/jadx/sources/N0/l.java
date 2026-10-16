package N0;

/* loaded from: classes.dex */
public final class l extends i {

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ m f8020h;

    public l(m mVar) {
        this.f8020h = mVar;
    }

    @Override // N0.i
    public final String g() {
        j jVar = (j) this.f8020h.f8021a.get();
        if (jVar == null) {
            return "Completer object has been garbage collected, future will fail soon";
        }
        return "tag=[" + jVar.f8016a + "]";
    }
}
