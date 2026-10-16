package defpackage;

/* loaded from: classes.dex */
public final /* synthetic */ class ceb implements cdz {
    public final /* synthetic */ Object a;
    private final /* synthetic */ int b;

    public /* synthetic */ ceb(Object obj, int i) {
        this.b = i;
        this.a = obj;
    }

    @Override // defpackage.cdz
    public final void a() {
        if (this.b == 0) {
            throw null;
        }
        Object obj = this.a;
        synchronized (cek.b) {
            cek.f = woy.bV(cek.f, obj);
        }
    }
}
