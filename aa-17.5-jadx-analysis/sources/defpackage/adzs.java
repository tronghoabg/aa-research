package defpackage;

/* loaded from: classes.dex */
public final class adzs implements adwt {
    private final /* synthetic */ int a;
    private final Object b;

    public adzs(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [adzq, java.lang.Object] */
    @Override // defpackage.adwt
    public final Object a() {
        int i = this.a;
        ?? r1 = this.b;
        return i != 0 ? r1 : adzr.a(r1);
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [adzq, java.lang.Object] */
    @Override // defpackage.adwt
    public final void b(Object obj) throws Throwable {
        if (this.a != 0) {
            return;
        }
        adzr.c(this.b, obj);
    }
}
