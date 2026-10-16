package defpackage;

/* loaded from: classes2.dex */
public final class fah implements AutoCloseable {
    public final String a;
    public final afeg b;
    public final aezr c = woy.dG(new epp(this, 19));
    public final erb d;

    public fah(erb erbVar, String str, afeg afegVar) {
        this.d = erbVar;
        this.a = str;
        this.b = afegVar;
    }

    @Override // java.lang.AutoCloseable
    public final void close() {
        aezr aezrVar = this.c;
        if (aezrVar.b()) {
            ((fca) aezrVar.a()).close();
        }
    }
}
